import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19396976 {
public MyHelperClass firePropertyChange(MyHelperClass o0){ return null; }
	public MyHelperClass updateActions(MyHelperClass o0){ return null; }
public MyHelperClass SWT;
	public MyHelperClass editDomain;
	public MyHelperClass configureViewerActions(ScalableFreeformRootEditPart o0){ return null; }
	public MyHelperClass getSelectionSynchronizer(){ return null; }
	public MyHelperClass getPaletteViewerProvider(){ return null; }
	public MyHelperClass getSite(){ return null; }
public MyHelperClass undoRedoGroup;
	public MyHelperClass actionRegistry;
	public MyHelperClass RMBenchPlugin;
	public MyHelperClass IWorkbenchPartConstants;
	public MyHelperClass pasteTablesAction;
	public MyHelperClass DiagramDropTargetListener;
	public MyHelperClass viewer;
	public MyHelperClass getDiagram(){ return null; }
	public MyHelperClass configureKeyHandler(){ return null; }

    public void createPartControl(Composite parent)  throws Throwable {
        MyHelperClass splitter = new MyHelperClass();
        splitter = new FlyoutPaletteComposite(parent, SWT.NONE, getSite().getPage(), getPaletteViewerProvider(), new PaletteFlyoutPreferences());
        ScrollingGraphicalViewer viewer = NULL; //new ScrollingGraphicalViewer();
        viewer = new ScrollingGraphicalViewer();
//        MyHelperClass splitter = new MyHelperClass();
        viewer.createControl(splitter);
//        MyHelperClass viewer = new MyHelperClass();
        editDomain.addViewer(viewer);
        MyHelperClass ColorConstants = new MyHelperClass();
        viewer.getControl().setBackground(ColorConstants.listBackground);
        MyHelperClass SnapToGrid = new MyHelperClass();
        viewer.setProperty(SnapToGrid.PROPERTY_GRID_SPACING, new Dimension(45, 45));
        ScalableFreeformRootEditPart root =(ScalableFreeformRootEditPart)(Object) new CustomRootEditPart();
//        MyHelperClass viewer = new MyHelperClass();
        viewer.setRootEditPart(root);
//        MyHelperClass viewer = new MyHelperClass();
        viewer.setEditPartFactory(new CustomEditPartFactory());
//        MyHelperClass viewer = new MyHelperClass();
        getSelectionSynchronizer().addViewer(viewer);
//        MyHelperClass viewer = new MyHelperClass();
        getSite().setSelectionProvider(viewer);
//        MyHelperClass viewer = new MyHelperClass();
        splitter.hookDropTargetListener(viewer);
//        MyHelperClass viewer = new MyHelperClass();
        splitter.setGraphicalControl(viewer.getControl());
        configureViewerActions(root);
        configureKeyHandler();
        ContextMenuProvider comtextMenuProvider =(ContextMenuProvider)(Object) new DiagramContextMenuProvider(viewer, actionRegistry, undoRedoGroup);
        viewer.setContextMenu(comtextMenuProvider);
        viewer.addDropTargetListener(DiagramDropTargetListener.forImport(viewer));
        viewer.addDropTargetListener(DiagramDropTargetListener.forModel(viewer));
        viewer.addSelectionChangedListener(new ISelectionChangedListener() {

            public void selectionChanged(SelectionChangedEvent event) {
                IStructuredSelection selection = (IStructuredSelection) event.getSelection();
                if (selection.size() == 1) {
                    EditPart selectedPart = (EditPart) selection.getFirstElement();
                    if ((TableEditPart)(Object)selectedPart instanceof TableEditPart) {
                        Table table = ((TableEditPart)(TableEditPart)(Object) selectedPart).getTable();
                        RMBenchPlugin.getEventManager().fireTableSelected(DiagramEditor.this, table);
                    } else if ((ColumnEditPart)(Object)selectedPart instanceof ColumnEditPart) {
                        Column column = ((ColumnEditPart)(ColumnEditPart)(Object) selectedPart).getColumn();
                        RMBenchPlugin.getEventManager().fireColumnSelected(DiagramEditor.this, column);
                    } else if ((ForeignKeyEditPart)(Object)selectedPart instanceof ForeignKeyEditPart) {
                        ForeignKey key = ((ForeignKeyEditPart)(ForeignKeyEditPart)(Object) selectedPart).getForeignKey();
                        RMBenchPlugin.getEventManager().fireForeignKeySelected(DiagramEditor.this, key);
                    } else {
                        RMBenchPlugin.getEventManager().fireTableSelected(DiagramEditor.this, null);
                    }
                }
                MyHelperClass selectionActionIDs = new MyHelperClass();
                updateActions(selectionActionIDs);
            }
        });
        viewer.setContents(getDiagram());
        if (RMBenchPlugin.getModelManager().isDirty()) firePropertyChange(IWorkbenchPartConstants.PROP_DIRTY);
        pasteTablesAction.hookEvents();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PROPERTY_GRID_SPACING;
	public MyHelperClass PROP_DIRTY;
	public MyHelperClass NONE;
	public MyHelperClass listBackground;
public MyHelperClass setContents(MyHelperClass o0){ return null; }
	public MyHelperClass setGraphicalControl(MyHelperClass o0){ return null; }
	public MyHelperClass addViewer(MyHelperClass o0){ return null; }
	public MyHelperClass getPage(){ return null; }
	public MyHelperClass setSelectionProvider(MyHelperClass o0){ return null; }
	public MyHelperClass getEventManager(){ return null; }
	public MyHelperClass hookEvents(){ return null; }
	public MyHelperClass setBackground(MyHelperClass o0){ return null; }
	public MyHelperClass setRootEditPart(ScalableFreeformRootEditPart o0){ return null; }
	public MyHelperClass createControl(MyHelperClass o0){ return null; }
	public MyHelperClass isDirty(){ return null; }
	public MyHelperClass getControl(){ return null; }
	public MyHelperClass addSelectionChangedListener(){ return null; }
	public MyHelperClass setContextMenu(ContextMenuProvider o0){ return null; }
	public MyHelperClass addDropTargetListener(MyHelperClass o0){ return null; }
	public MyHelperClass forImport(MyHelperClass o0){ return null; }
	public MyHelperClass addSelectionChangedListener(<anonymous ISelectionChangedListener> o0){ return null; }
	public MyHelperClass forModel(MyHelperClass o0){ return null; }
	public MyHelperClass getModelManager(){ return null; }
	public MyHelperClass setEditPartFactory(CustomEditPartFactory o0){ return null; }
	public MyHelperClass hookDropTargetListener(MyHelperClass o0){ return null; }}

class Composite {

}

class ScalableFreeformRootEditPart {

}

class CustomRootEditPart {

}

class CustomEditPartFactory {

}

class ContextMenuProvider {

}

class DiagramContextMenuProvider {

DiagramContextMenuProvider(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){}
	DiagramContextMenuProvider(){}}

class ISelectionChangedListener {

}

class FlyoutPaletteComposite {

}

class PaletteFlyoutPreferences {

}

class ScrollingGraphicalViewer {

}

class Dimension {

Dimension(int o0, int o1){}
	Dimension(){}}

class SelectionChangedEvent {

public MyHelperClass getSelection(){ return null; }}

class IStructuredSelection {

public MyHelperClass size(){ return null; }
	public MyHelperClass getFirstElement(){ return null; }}

class EditPart {

}

class TableEditPart {

}

class Table {

}

class DiagramEditor {

}

class ColumnEditPart {

}

class Column {

}

class ForeignKeyEditPart {

}

class ForeignKey {

}
