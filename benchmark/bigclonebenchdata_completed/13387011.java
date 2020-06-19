


class c13387011 {

    private void updateViewerContent(ScrollingGraphicalViewer viewer) {
        BioPAXGraph graph = (BioPAXGraph)(BioPAXGraph)(Object) viewer.getContents().getModel();
        if (!(Boolean)(Object)graph.isMechanistic()) return;
        Map highlightMap =(Map)(Object) new HashMap();
        for (Object o : (Object[])(Object)graph.getNodes()) {
            IBioPAXNode node = (IBioPAXNode) o;
            if ((boolean)(Object)node.isHighlighted()) {
                highlightMap.put(node.getIDHash(), node.getHighlightColor());
            }
        }
        for (Object o : (Object[])(Object)graph.getEdges()) {
            IBioPAXEdge edge = (IBioPAXEdge) o;
            if ((boolean)(Object)edge.isHighlighted()) {
                highlightMap.put(edge.getIDHash(), edge.getHighlightColor());
            }
        }
        MyHelperClass HighlightLayer = new MyHelperClass();
        HighlightLayer hLayer = (HighlightLayer)(HighlightLayer)(Object) ((ChsScalableRootEditPart)(ChsScalableRootEditPart)(Object) viewer.getRootEditPart()).getLayer(HighlightLayer.HIGHLIGHT_LAYER);
        hLayer.removeAll();
        hLayer.highlighted.clear();
        viewer.deselectAll();
        graph.recordLayout();
        PathwayHolder p =(PathwayHolder)(Object) graph.getPathway();
        MyHelperClass withContent = new MyHelperClass();
        if (withContent != null) {
//            MyHelperClass withContent = new MyHelperClass();
            p.updateContentWith(withContent);
        }
        MyHelperClass main = new MyHelperClass();
        BioPAXGraph newGraph =(BioPAXGraph)(Object) main.getRootGraph().excise(p);
        newGraph.setAsRoot();
        viewer.setContents(newGraph);
        boolean layedout =(boolean)(Object) newGraph.fetchLayout();
        if (!layedout) {
//            MyHelperClass main = new MyHelperClass();
            new CoSELayoutAction(main).run();
        }
        viewer.deselectAll();
        MyHelperClass GraphAnimation = new MyHelperClass();
        GraphAnimation.run(viewer);
        for (Object o : (Object[])(Object)newGraph.getNodes()) {
            IBioPAXNode node = (IBioPAXNode) o;
            if ((boolean)(Object)highlightMap.containsKey(node.getIDHash())) {
                node.setHighlightColor(highlightMap.get(node.getIDHash()));
                node.setHighlight(true);
            }
        }
        for (Object o : (Object[])(Object)newGraph.getEdges()) {
            IBioPAXEdge edge = (IBioPAXEdge) o;
            if ((boolean)(Object)highlightMap.containsKey(edge.getIDHash())) {
                edge.setHighlightColor(highlightMap.get(edge.getIDHash()));
                edge.setHighlight(true);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HIGHLIGHT_LAYER;
public MyHelperClass getRootGraph(){ return null; }
	public MyHelperClass run(ScrollingGraphicalViewer o0){ return null; }
	public MyHelperClass getModel(){ return null; }
	public MyHelperClass excise(PathwayHolder o0){ return null; }
	public MyHelperClass clear(){ return null; }}

class ScrollingGraphicalViewer {

public MyHelperClass getRootEditPart(){ return null; }
	public MyHelperClass setContents(BioPAXGraph o0){ return null; }
	public MyHelperClass getContents(){ return null; }
	public MyHelperClass deselectAll(){ return null; }}

class BioPAXGraph {

public MyHelperClass isMechanistic(){ return null; }
	public MyHelperClass getNodes(){ return null; }
	public MyHelperClass fetchLayout(){ return null; }
	public MyHelperClass getEdges(){ return null; }
	public MyHelperClass setAsRoot(){ return null; }
	public MyHelperClass getPathway(){ return null; }
	public MyHelperClass recordLayout(){ return null; }}

class Map {

public MyHelperClass containsKey(MyHelperClass o0){ return null; }
	public MyHelperClass put(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass get(MyHelperClass o0){ return null; }}

class Color {

}

class HashMap {

}

class IBioPAXNode {

public MyHelperClass getHighlightColor(){ return null; }
	public MyHelperClass isHighlighted(){ return null; }
	public MyHelperClass setHighlight(boolean o0){ return null; }
	public MyHelperClass getIDHash(){ return null; }
	public MyHelperClass setHighlightColor(MyHelperClass o0){ return null; }}

class IBioPAXEdge {

public MyHelperClass getHighlightColor(){ return null; }
	public MyHelperClass isHighlighted(){ return null; }
	public MyHelperClass setHighlight(boolean o0){ return null; }
	public MyHelperClass getIDHash(){ return null; }
	public MyHelperClass setHighlightColor(MyHelperClass o0){ return null; }}

class HighlightLayer {
public MyHelperClass highlighted;
public MyHelperClass removeAll(){ return null; }}

class PathwayHolder {

public MyHelperClass updateContentWith(MyHelperClass o0){ return null; }}

class CoSELayoutAction {

CoSELayoutAction(MyHelperClass o0){}
	CoSELayoutAction(){}
	public MyHelperClass run(){ return null; }}

class ChsScalableRootEditPart {

public MyHelperClass getLayer(MyHelperClass o0){ return null; }}
