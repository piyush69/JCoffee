import java.io.*;
import java.lang.*;
import java.util.*;



class c18781063 {
public MyHelperClass NULL;
public MyHelperClass registerEditPartViewer(MyHelperClass o0){ return null; }
	public MyHelperClass configureEditPartViewer(MyHelperClass o0){ return null; }
public MyHelperClass viewer;
	public MyHelperClass getGraphicalViewer(){ return null; }
	public MyHelperClass getContractEditor(){ return null; }
	public MyHelperClass getSite(){ return null; }

    private void createGraphicalViewer(Composite parent) {
        ScrollingGraphicalViewer viewer =(ScrollingGraphicalViewer)(Object) NULL; //new ScrollingGraphicalViewer();
        viewer = new ScrollingGraphicalViewer();
//        MyHelperClass viewer = new MyHelperClass();
        viewer.createControl(parent);
//        MyHelperClass viewer = new MyHelperClass();
        viewer.getControl().setBackground(parent.getBackground());
//        MyHelperClass viewer = new MyHelperClass();
        viewer.setRootEditPart(new ScalableFreeformRootEditPart());
//        MyHelperClass viewer = new MyHelperClass();
        viewer.setKeyHandler(new GraphicalViewerKeyHandler((MyHelperClass)(Object)viewer));
//        MyHelperClass viewer = new MyHelperClass();
        registerEditPartViewer((MyHelperClass)(Object)viewer);
//        MyHelperClass viewer = new MyHelperClass();
        configureEditPartViewer((MyHelperClass)(Object)viewer);
        viewer.setEditPartFactory(new GraphicalEditPartsFactory(getSite().getShell()));
        viewer.setContents(getContractEditor().getContract());
        ContextMenuProvider provider =(ContextMenuProvider)(Object) new ContractContextMenuProvider(getGraphicalViewer(), getContractEditor().getActionRegistry());
        getGraphicalViewer().setContextMenu(provider);
        getSite().registerContextMenu(provider, getGraphicalViewer());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setBackground(MyHelperClass o0){ return null; }
	public MyHelperClass setKeyHandler(GraphicalViewerKeyHandler o0){ return null; }
	public MyHelperClass getControl(){ return null; }
	public MyHelperClass getShell(){ return null; }
	public MyHelperClass setContextMenu(ContextMenuProvider o0){ return null; }
	public MyHelperClass getActionRegistry(){ return null; }
	public MyHelperClass getContract(){ return null; }
	public MyHelperClass setRootEditPart(ScalableFreeformRootEditPart o0){ return null; }
	public MyHelperClass createControl(Composite o0){ return null; }
	public MyHelperClass setContents(MyHelperClass o0){ return null; }
	public MyHelperClass registerContextMenu(ContextMenuProvider o0, MyHelperClass o1){ return null; }}

class Composite {

public MyHelperClass getBackground(){ return null; }}

class ScalableFreeformRootEditPart {

}

class GraphicalViewerKeyHandler {

GraphicalViewerKeyHandler(){}
	GraphicalViewerKeyHandler(MyHelperClass o0){}}

class GraphicalEditPartsFactory {

GraphicalEditPartsFactory(){}
	GraphicalEditPartsFactory(MyHelperClass o0){}}

class ContextMenuProvider {

}

class ContractContextMenuProvider {

ContractContextMenuProvider(MyHelperClass o0, MyHelperClass o1){}
	ContractContextMenuProvider(){}}

class ScrollingGraphicalViewer {

public MyHelperClass setKeyHandler(GraphicalViewerKeyHandler o0){ return null; }
	public MyHelperClass getControl(){ return null; }
	public MyHelperClass setRootEditPart(ScalableFreeformRootEditPart o0){ return null; }
	public MyHelperClass createControl(Composite o0){ return null; }
	public MyHelperClass setContents(MyHelperClass o0){ return null; }
	public MyHelperClass setEditPartFactory(GraphicalEditPartsFactory o0){ return null; }}
