


class c12728214 {
public MyHelperClass getEditorInput(){ return null; }
public MyHelperClass getContent(){ return null; }
	public MyHelperClass getEditPartFactory(){ return null; }
	public MyHelperClass getSite(){ return null; }
	public MyHelperClass getActionRegistry(){ return null; }
	public MyHelperClass getEditDomain(){ return null; }
	public MyHelperClass getCommonKeyHandler(){ return null; }

    protected GraphicalViewer createGraphicalViewer(Composite parent) {
        GraphicalViewer viewer =(GraphicalViewer)(Object) new ScrollingGraphicalViewer();
        viewer.createControl(parent);
        viewer.getControl().setBackground(parent.getBackground());
        viewer.setRootEditPart(new ScalableFreeformRootEditPart());
        GraphicalViewerKeyHandler graphicalViewerKeyHandler = new GraphicalViewerKeyHandler(viewer);
        KeyHandler parentKeyHandler =(KeyHandler)(Object) graphicalViewerKeyHandler.setParent(getCommonKeyHandler());
        viewer.setKeyHandler(parentKeyHandler);
        getEditDomain().addViewer(viewer);
        getSite().setSelectionProvider(viewer);
        ContextMenuProvider provider =(ContextMenuProvider)(Object) new TestContextMenuProvider(viewer, getActionRegistry());
        viewer.setContextMenu(provider);
        getSite().registerContextMenu("cubicTestPlugin.editor.contextmenu", provider, viewer);
        viewer.addDropTargetListener((FileTransferDropTargetListener)(Object)new DataEditDropTargetListner(((IFileEditorInput)(IFileEditorInput)(Object) getEditorInput()).getFile().getProject(), viewer));
        viewer.addDropTargetListener(new FileTransferDropTargetListener(viewer));
        viewer.setEditPartFactory(getEditPartFactory());
        viewer.setContents(getContent());
        return viewer;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass addViewer(GraphicalViewer o0){ return null; }
	public MyHelperClass setBackground(MyHelperClass o0){ return null; }
	public MyHelperClass setSelectionProvider(GraphicalViewer o0){ return null; }
	public MyHelperClass registerContextMenu(String o0, ContextMenuProvider o1, GraphicalViewer o2){ return null; }
	public MyHelperClass getProject(){ return null; }}

class Composite {

public MyHelperClass getBackground(){ return null; }}

class GraphicalViewer {

public MyHelperClass setContents(MyHelperClass o0){ return null; }
	public MyHelperClass setEditPartFactory(MyHelperClass o0){ return null; }
	public MyHelperClass setContextMenu(ContextMenuProvider o0){ return null; }
	public MyHelperClass setKeyHandler(KeyHandler o0){ return null; }
	public MyHelperClass addDropTargetListener(FileTransferDropTargetListener o0){ return null; }
	public MyHelperClass getControl(){ return null; }
	public MyHelperClass createControl(Composite o0){ return null; }
	public MyHelperClass setRootEditPart(ScalableFreeformRootEditPart o0){ return null; }}

class ScrollingGraphicalViewer {

}

class ScalableFreeformRootEditPart {

}

class GraphicalViewerKeyHandler {

GraphicalViewerKeyHandler(){}
	GraphicalViewerKeyHandler(GraphicalViewer o0){}
	public MyHelperClass setParent(MyHelperClass o0){ return null; }}

class KeyHandler {

}

class ContextMenuProvider {

}

class TestContextMenuProvider {

TestContextMenuProvider(GraphicalViewer o0, MyHelperClass o1){}
	TestContextMenuProvider(){}}

class DataEditDropTargetListner {

DataEditDropTargetListner(MyHelperClass o0, GraphicalViewer o1){}
	DataEditDropTargetListner(){}}

class FileTransferDropTargetListener {

FileTransferDropTargetListener(){}
	FileTransferDropTargetListener(GraphicalViewer o0){}}

class IFileEditorInput {

public MyHelperClass getFile(){ return null; }}
