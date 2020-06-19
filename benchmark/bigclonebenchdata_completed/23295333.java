import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c23295333 {
public MyHelperClass DELETE;
	public MyHelperClass PRINT;
	public MyHelperClass outlinePage;
	public MyHelperClass GeneratorProvider;
	public MyHelperClass REDO;
	public MyHelperClass UNDO;
	public MyHelperClass applyPreferences(){ return null; }
	public MyHelperClass getSelectionSynchronizer(){ return null; }
	public MyHelperClass getEditDomain(){ return null; }
public MyHelperClass ZoomManager;
	public MyHelperClass DialectProvider;
	public MyHelperClass VisualDBSerializer;
	public MyHelperClass GEFActionConstants;
	public MyHelperClass DBPlugin;
	public MyHelperClass getGraphicalViewer(){ return null; }
	public MyHelperClass getActionRegistry(){ return null; }
	public MyHelperClass getEditorInput(){ return null; }
	public MyHelperClass getSelectionActions(){ return null; }

//    @SuppressWarnings("unchecked")
    protected void initializeGraphicalViewer()  throws Throwable {
        GraphicalViewer viewer =(GraphicalViewer)(Object) getGraphicalViewer();
        ScalableRootEditPart rootEditPart = new ScalableRootEditPart();
        viewer.setEditPartFactory(new DBEditPartFactory());
        viewer.setRootEditPart(rootEditPart);
        ZoomManager manager = rootEditPart.getZoomManager();
        double[] zoomLevels = new double[] { 0.25, 0.5, 0.75, 1.0, 1.5, 2.0, 2.5, 3.0, 4.0, 5.0, 10.0, 20.0 };
        manager.setZoomLevels(zoomLevels);
        List<String> zoomContributions = new ArrayList<String>();
        zoomContributions.add(ZoomManager.FIT_ALL);
        zoomContributions.add(ZoomManager.FIT_HEIGHT);
        zoomContributions.add(ZoomManager.FIT_WIDTH);
        manager.setZoomLevelContributions(zoomContributions);
        getActionRegistry().registerAction(new ZoomInAction(manager));
        getActionRegistry().registerAction(new ZoomOutAction(manager));
        PrintAction printAction = new PrintAction(this);
        printAction.setText(DBPlugin.getResourceString("action.print"));
        printAction.setImageDescriptor(DBPlugin.getImageDescriptor("icons/print.gif"));
        getActionRegistry().registerAction(printAction);
        IFile file = ((IFileEditorInput)(IFileEditorInput)(Object) getEditorInput()).getFile();
        RootModel root = null;
        try {
            root = VisualDBSerializer.deserialize(file.getContents());
        } catch (Exception ex) {
            DBPlugin.logException(ex);
            root = new RootModel();
            root.setDialectName(DialectProvider.getDialectNames()[0]);
        }
        viewer.setContents(root);
        final DeleteAction deleteAction = new DeleteAction((IWorkbenchPart)(IWorkbenchPart)(Object) this);
        deleteAction.setSelectionProvider(getGraphicalViewer());
        getActionRegistry().registerAction(deleteAction);
        getGraphicalViewer().addSelectionChangedListener(new ISelectionChangedListener() {

            public void selectionChanged(SelectionChangedEvent event) {
                deleteAction.update();
            }
        });
        MenuManager menuMgr = new MenuManager();
        menuMgr.add(new QuickOutlineAction());
        menuMgr.add(new Separator());
        menuMgr.add(getActionRegistry().getAction(UNDO.getId()));
        menuMgr.add(getActionRegistry().getAction(REDO.getId()));
        menuMgr.add(new Separator());
        PasteAction pasteAction = new PasteAction(this);
        getActionRegistry().registerAction(pasteAction);
        getSelectionActions().add(pasteAction.getId());
        menuMgr.add(pasteAction);
        CopyAction copyAction = new CopyAction(this, pasteAction);
        getActionRegistry().registerAction(copyAction);
        getSelectionActions().add(copyAction.getId());
        menuMgr.add(copyAction);
        menuMgr.add(getActionRegistry().getAction(DELETE.getId()));
        menuMgr.add(new Separator());
        menuMgr.add(new AutoLayoutAction(viewer));
        menuMgr.add(new DommainEditAction(viewer));
        MenuManager convertMenu = new MenuManager(DBPlugin.getResourceString("action.convert"));
        menuMgr.add(convertMenu);
        UppercaseAction uppercaseAction = new UppercaseAction(this);
        convertMenu.add(uppercaseAction);
        getActionRegistry().registerAction(uppercaseAction);
        getSelectionActions().add(uppercaseAction.getId());
        LowercaseAction lowercaseAction = new LowercaseAction(this);
        convertMenu.add(lowercaseAction);
        getActionRegistry().registerAction(lowercaseAction);
        getSelectionActions().add(lowercaseAction.getId());
        Physical2LogicalAction physical2logicalAction = new Physical2LogicalAction(this);
        convertMenu.add(physical2logicalAction);
        getActionRegistry().registerAction(physical2logicalAction);
        getSelectionActions().add(physical2logicalAction.getId());
        Logical2PhysicalAction logical2physicalAction = new Logical2PhysicalAction(this);
        convertMenu.add(logical2physicalAction);
        getActionRegistry().registerAction(logical2physicalAction);
        getSelectionActions().add(logical2physicalAction.getId());
        menuMgr.add(new ToggleModelAction(viewer));
        menuMgr.add(new ChangeDBTypeAction(viewer));
        menuMgr.add(new Separator());
        menuMgr.add(getActionRegistry().getAction(GEFActionConstants.ZOOM_IN));
        menuMgr.add(getActionRegistry().getAction(GEFActionConstants.ZOOM_OUT));
        menuMgr.add(new Separator());
        menuMgr.add(new CopyAsImageAction(viewer));
        menuMgr.add(getActionRegistry().getAction(PRINT.getId()));
        menuMgr.add(new Separator());
        MenuManager validation = new MenuManager(DBPlugin.getResourceString("action.validation"));
        validation.add(new ValidateAction(viewer));
        validation.add(new DeleteMarkerAction(viewer));
        menuMgr.add(validation);
        MenuManager importMenu = new MenuManager(DBPlugin.getResourceString("action.import"));
        importMenu.add(new ImportFromJDBCAction(viewer));
        importMenu.add(new ImportFromDiagramAction(viewer));
        menuMgr.add(importMenu);
        MenuManager generate = new MenuManager(DBPlugin.getResourceString("action.export"));
        IGenerator[] generaters = GeneratorProvider.getGeneraters();
        for (int i = 0; i < generaters.length; i++) {
            generate.add(new GenerateAction(generaters[i], viewer, this));
        }
        menuMgr.add(generate);
        menuMgr.add(new SelectedTablesDDLAction(viewer));
        viewer.setContextMenu(menuMgr);
        viewer.getControl().addMouseListener(new MouseAdapter() {

            public void mouseDoubleClick(MouseEvent e) {
                IStructuredSelection selection = (IStructuredSelection) getGraphicalViewer().getSelection();
                Object obj = selection.getFirstElement();
                if (obj != null && obj instanceof IDoubleClickSupport) {
                    ((IDoubleClickSupport) obj).doubleClicked();
                }
            }
        });
        outlinePage = new VisualDBOutlinePage(viewer, getEditDomain(), root, getSelectionSynchronizer());
        applyPreferences();
        viewer.getControl().addKeyListener(new KeyAdapter() {

//            @Override
            public void keyPressed(KeyEvent e) {
                if (e.stateMask == SWT.CTRL && e.keyCode == 'o') {
                    new QuickOutlineAction().run();
                }
            }
        });
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FIT_ALL;
	public MyHelperClass ZOOM_OUT;
	public MyHelperClass ZOOM_IN;
	public MyHelperClass FIT_WIDTH;
	public MyHelperClass FIT_HEIGHT;
public MyHelperClass registerAction(UppercaseAction o0){ return null; }
	public MyHelperClass registerAction(Physical2LogicalAction o0){ return null; }
	public MyHelperClass registerAction(PrintAction o0){ return null; }
	public MyHelperClass registerAction(CopyAction o0){ return null; }
	public MyHelperClass getDialectNames(){ return null; }
	public MyHelperClass registerAction(LowercaseAction o0){ return null; }
	public MyHelperClass getImageDescriptor(String o0){ return null; }
	public MyHelperClass registerAction(PasteAction o0){ return null; }
	public MyHelperClass registerAction(Logical2PhysicalAction o0){ return null; }
	public MyHelperClass registerAction(DeleteAction o0){ return null; }
	public MyHelperClass logException(Exception o0){ return null; }
	public MyHelperClass getResourceString(String o0){ return null; }
	public MyHelperClass addSelectionChangedListener(){ return null; }}

class GraphicalViewer {

public MyHelperClass setContents(RootModel o0){ return null; }
	public MyHelperClass setEditPartFactory(DBEditPartFactory o0){ return null; }
	public MyHelperClass setRootEditPart(ScalableRootEditPart o0){ return null; }
	public MyHelperClass getControl(){ return null; }
	public MyHelperClass setContextMenu(MenuManager o0){ return null; }}

class ScalableRootEditPart {

public MyHelperClass getZoomManager(){ return null; }}

class DBEditPartFactory {

}

class ZoomManager {

public MyHelperClass setZoomLevels(double[] o0){ return null; }
	public MyHelperClass setZoomLevelContributions(List<String o0){ return null; }}

class ZoomInAction {

ZoomInAction(ZoomManager o0){}
	ZoomInAction(){}}

class ZoomOutAction {

ZoomOutAction(ZoomManager o0){}
	ZoomOutAction(){}}

class PrintAction {

PrintAction(c23295333 o0){}
	PrintAction(){}}

class IFile {

public MyHelperClass getContents(){ return null; }}

class IFileEditorInput {

}

class RootModel {

}

class DeleteAction {

public MyHelperClass setSelectionProvider(MyHelperClass o0){ return null; }
	public MyHelperClass update(){ return null; }}

class IWorkbenchPart {

}

class ISelectionChangedListener {

}

class MenuManager {

public MyHelperClass add(LowercaseAction o0){ return null; }
	public MyHelperClass add(PasteAction o0){ return null; }
	public MyHelperClass add(QuickOutlineAction o0){ return null; }
	public MyHelperClass add(CopyAction o0){ return null; }
	public MyHelperClass add(UppercaseAction o0){ return null; }
	public MyHelperClass add(MenuManager o0){ return null; }
	public MyHelperClass add(Logical2PhysicalAction o0){ return null; }
	public MyHelperClass add(Physical2LogicalAction o0){ return null; }
	public MyHelperClass add(Separator o0){ return null; }}

class QuickOutlineAction {

}

class Separator {

}

class PasteAction {

PasteAction(c23295333 o0){}
	PasteAction(){}
	public MyHelperClass getId(){ return null; }}

class CopyAction {

CopyAction(c23295333 o0, PasteAction o1){}
	CopyAction(){}
	public MyHelperClass getId(){ return null; }}

class AutoLayoutAction {

AutoLayoutAction(GraphicalViewer o0){}
	AutoLayoutAction(){}}

class DommainEditAction {

DommainEditAction(GraphicalViewer o0){}
	DommainEditAction(){}}

class UppercaseAction {

UppercaseAction(c23295333 o0){}
	UppercaseAction(){}
	public MyHelperClass getId(){ return null; }}

class LowercaseAction {

LowercaseAction(c23295333 o0){}
	LowercaseAction(){}
	public MyHelperClass getId(){ return null; }}

class Physical2LogicalAction {

Physical2LogicalAction(c23295333 o0){}
	Physical2LogicalAction(){}
	public MyHelperClass getId(){ return null; }}

class Logical2PhysicalAction {

Logical2PhysicalAction(c23295333 o0){}
	Logical2PhysicalAction(){}
	public MyHelperClass getId(){ return null; }}

class ToggleModelAction {

ToggleModelAction(GraphicalViewer o0){}
	ToggleModelAction(){}}

class ChangeDBTypeAction {

ChangeDBTypeAction(GraphicalViewer o0){}
	ChangeDBTypeAction(){}}

class CopyAsImageAction {

CopyAsImageAction(GraphicalViewer o0){}
	CopyAsImageAction(){}}

class ValidateAction {

ValidateAction(GraphicalViewer o0){}
	ValidateAction(){}}

class DeleteMarkerAction {

DeleteMarkerAction(GraphicalViewer o0){}
	DeleteMarkerAction(){}}

class ImportFromJDBCAction {

ImportFromJDBCAction(GraphicalViewer o0){}
	ImportFromJDBCAction(){}}

class ImportFromDiagramAction {

ImportFromDiagramAction(GraphicalViewer o0){}
	ImportFromDiagramAction(){}}

class IGenerator {

}

class SelectionChangedEvent {

}

class GenerateAction {

}

class SelectedTablesDDLAction {

}

class MouseAdapter {

}

class VisualDBOutlinePage {

}

class KeyAdapter {

}
