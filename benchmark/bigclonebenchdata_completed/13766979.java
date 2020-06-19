


class c13766979 {
public MyHelperClass getContent(){ return null; }
	public MyHelperClass getSite(){ return null; }
	public MyHelperClass getEditDomain(){ return null; }
	public MyHelperClass getEditPartFactory(){ return null; }

    @SuppressWarnings("unused")
    private GraphicalViewer createGraphicalViewer(Composite parent) {
        GraphicalViewer viewer =(GraphicalViewer)(Object) new ScrollingGraphicalViewer();
        viewer.createControl(parent);
        viewer.getControl().setBackground(parent.getBackground());
        viewer.setRootEditPart(new ScalableFreeformRootEditPart());
        viewer.setKeyHandler(new GraphicalViewerKeyHandler(viewer));
        getEditDomain().addViewer(viewer);
        getSite().setSelectionProvider(viewer);
        viewer.setEditPartFactory(getEditPartFactory());
        viewer.setContents(getContent());
        return viewer;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass addViewer(GraphicalViewer o0){ return null; }
	public MyHelperClass setBackground(MyHelperClass o0){ return null; }
	public MyHelperClass setSelectionProvider(GraphicalViewer o0){ return null; }}

class Composite {

public MyHelperClass getBackground(){ return null; }}

class GraphicalViewer {

public MyHelperClass setContents(MyHelperClass o0){ return null; }
	public MyHelperClass setEditPartFactory(MyHelperClass o0){ return null; }
	public MyHelperClass setKeyHandler(GraphicalViewerKeyHandler o0){ return null; }
	public MyHelperClass getControl(){ return null; }
	public MyHelperClass createControl(Composite o0){ return null; }
	public MyHelperClass setRootEditPart(ScalableFreeformRootEditPart o0){ return null; }}

class ScrollingGraphicalViewer {

}

class ScalableFreeformRootEditPart {

}

class GraphicalViewerKeyHandler {

GraphicalViewerKeyHandler(){}
	GraphicalViewerKeyHandler(GraphicalViewer o0){}}
