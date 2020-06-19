import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15288212 {
public MyHelperClass REDO;
	public MyHelperClass DELETE;
	public MyHelperClass UNDO;
	public MyHelperClass fillDiagramPopupMenu(MenuManager o0){ return null; }
	public MyHelperClass createDiagramAction(GraphicalViewer o0){ return null; }
public MyHelperClass ZoomManager;
	public MyHelperClass openOutlineAction;
	public MyHelperClass openPropertyAction;
	public MyHelperClass saveAsImageAction;
	public MyHelperClass GEFActionConstants;
	public MyHelperClass UMLPlugin;
	public MyHelperClass createEditPartFactory(){ return null; }
	public MyHelperClass getGraphicalViewer(){ return null; }
	public MyHelperClass getSite(){ return null; }
	public MyHelperClass getCommonKeyHandler(){ return null; }
	public MyHelperClass getActionRegistry(){ return null; }

    protected void configureGraphicalViewer()  throws Throwable {
        this.configureGraphicalViewer();
        GraphicalViewer viewer =(GraphicalViewer)(Object) getGraphicalViewer();
        viewer.setEditPartFactory(createEditPartFactory());
        ScalableRootEditPart rootEditPart = new ScalableRootEditPart();
        viewer.setRootEditPart(rootEditPart);
        ZoomManager manager =(ZoomManager)(Object) rootEditPart.getZoomManager();
        double[] zoomLevels = new double[] { 0.25, 0.5, 0.75, 1.0, 1.5, 2.0, 2.5, 3.0, 4.0, 5.0, 10.0, 20.0 };
        manager.setZoomLevels(zoomLevels);
        ArrayList zoomContributions = new ArrayList();
        zoomContributions.add(ZoomManager.FIT_ALL);
        zoomContributions.add(ZoomManager.FIT_HEIGHT);
        zoomContributions.add(ZoomManager.FIT_WIDTH);
        manager.setZoomLevelContributions(zoomContributions);
        getActionRegistry().registerAction((DeleteAction)(Object)new ZoomInAction(manager));
        getActionRegistry().registerAction((DeleteAction)(Object)new ZoomOutAction(manager));
        getGraphicalViewer().setKeyHandler(new GraphicalViewerKeyHandler(getGraphicalViewer()));
        String menuId = this.getClass().getName() + ".EditorContext";
        MenuManager menuMgr = new MenuManager(menuId, menuId);
        openPropertyAction =(MyHelperClass)(Object) new OpenPropertyViewAction(viewer);
        openOutlineAction =(MyHelperClass)(Object) new OpenOutlineViewAction(viewer);
        saveAsImageAction =(MyHelperClass)(Object) new SaveAsImageAction(viewer);
        createDiagramAction(viewer);
        getSite().registerContextMenu(menuId, menuMgr, viewer);
        PrintAction printAction = new PrintAction(this);
        printAction.setImageDescriptor(UMLPlugin.getImageDescriptor("icons/print.gif"));
        getActionRegistry().registerAction(printAction);
        final DeleteAction deleteAction = new DeleteAction((IWorkbenchPart)(IWorkbenchPart)(Object) this);
        deleteAction.setSelectionProvider(getGraphicalViewer());
        getActionRegistry().registerAction(deleteAction);
        viewer.addSelectionChangedListener(new ISelectionChangedListener() {

            public void selectionChanged(SelectionChangedEvent event) {
                deleteAction.update();
            }
        });
        menuMgr.add((PrintAction)(Object)new Separator("edit"));
        menuMgr.add(getActionRegistry().getAction(DELETE.getId()));
        menuMgr.add(getActionRegistry().getAction(UNDO.getId()));
        menuMgr.add(getActionRegistry().getAction(REDO.getId()));
        menuMgr.add((PrintAction)(Object)new Separator("zoom"));
        menuMgr.add(getActionRegistry().getAction(GEFActionConstants.ZOOM_IN));
        menuMgr.add(getActionRegistry().getAction(GEFActionConstants.ZOOM_OUT));
        fillDiagramPopupMenu(menuMgr);
        menuMgr.add((PrintAction)(Object)new Separator("print"));
        menuMgr.add(saveAsImageAction);
        menuMgr.add(printAction);
        menuMgr.add((PrintAction)(Object)new Separator("views"));
        menuMgr.add(openPropertyAction);
        menuMgr.add(openOutlineAction);
        menuMgr.add((PrintAction)(Object)new Separator("generate"));
        menuMgr.add((PrintAction)(Object)new Separator("additions"));
        viewer.setContextMenu(menuMgr);
        viewer.setKeyHandler(new GraphicalViewerKeyHandler(viewer).setParent(getCommonKeyHandler()));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ZOOM_OUT;
	public MyHelperClass FIT_WIDTH;
	public MyHelperClass FIT_ALL;
	public MyHelperClass FIT_HEIGHT;
	public MyHelperClass ZOOM_IN;
public MyHelperClass registerContextMenu(String o0, MenuManager o1, GraphicalViewer o2){ return null; }
	public MyHelperClass registerAction(DeleteAction o0){ return null; }
	public MyHelperClass setKeyHandler(GraphicalViewerKeyHandler o0){ return null; }
	public MyHelperClass getId(){ return null; }
	public MyHelperClass getAction(MyHelperClass o0){ return null; }
	public MyHelperClass registerAction(PrintAction o0){ return null; }
	public MyHelperClass getImageDescriptor(String o0){ return null; }}

class GraphicalViewer {

public MyHelperClass setContextMenu(MenuManager o0){ return null; }
	public MyHelperClass addSelectionChangedListener( ISelectionChangedListener o0){ return null; }
	public MyHelperClass setKeyHandler(MyHelperClass o0){ return null; }
	public MyHelperClass setEditPartFactory(MyHelperClass o0){ return null; }
	public MyHelperClass setRootEditPart(ScalableRootEditPart o0){ return null; }
	public MyHelperClass addSelectionChangedListener(){ return null; }}

class ScalableRootEditPart {

public MyHelperClass getZoomManager(){ return null; }}

class ZoomManager {

public MyHelperClass setZoomLevelContributions(ArrayList o0){ return null; }
	public MyHelperClass setZoomLevels(double[] o0){ return null; }}

class ZoomInAction {

ZoomInAction(ZoomManager o0){}
	ZoomInAction(){}}

class ZoomOutAction {

ZoomOutAction(ZoomManager o0){}
	ZoomOutAction(){}}

class GraphicalViewerKeyHandler {

GraphicalViewerKeyHandler(GraphicalViewer o0){}
	GraphicalViewerKeyHandler(){}
	GraphicalViewerKeyHandler(MyHelperClass o0){}
	public MyHelperClass setParent(MyHelperClass o0){ return null; }}

class MenuManager {

MenuManager(){}
	MenuManager(String o0, String o1){}
	public MyHelperClass add(PrintAction o0){ return null; }
	public MyHelperClass add(MyHelperClass o0){ return null; }}

class OpenPropertyViewAction {

OpenPropertyViewAction(GraphicalViewer o0){}
	OpenPropertyViewAction(){}}

class OpenOutlineViewAction {

OpenOutlineViewAction(GraphicalViewer o0){}
	OpenOutlineViewAction(){}}

class SaveAsImageAction {

SaveAsImageAction(GraphicalViewer o0){}
	SaveAsImageAction(){}}

class PrintAction {

PrintAction(c15288212 o0){}
	PrintAction(){}
	public MyHelperClass setImageDescriptor(MyHelperClass o0){ return null; }}

class DeleteAction {

DeleteAction(IWorkbenchPart o0){}
	DeleteAction(){}
	public MyHelperClass setSelectionProvider(MyHelperClass o0){ return null; }
	public MyHelperClass update(){ return null; }}

class IWorkbenchPart {

}

class ISelectionChangedListener {

}

class Separator {

Separator(String o0){}
	Separator(){}}

class SelectionChangedEvent {

}
