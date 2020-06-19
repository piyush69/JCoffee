


class c2994948 {
public MyHelperClass MAPPING_MANAGER;

    public JSONObject getTargetGraph(HttpSession session, JSONObject json) throws JSONException {
        StringBuffer out = new StringBuffer();
        Graph tgt = null;
        MappingManager manager = (MappingManager)(MappingManager)(Object) session.getAttribute(MAPPING_MANAGER.key());
        try {
            tgt =(Graph)(Object) manager.getTargetGraph();
            if (tgt != null) {
                FlexGraphViewFactory factory = new FlexGraphViewFactory();
                MyHelperClass ColorSchemes = new MyHelperClass();
                factory.setColorScheme(ColorSchemes.ORANGES);
                factory.visit(tgt);
                GraphView view =(GraphView)(Object) factory.getGraphView();
                GraphViewRenderer renderer =(GraphViewRenderer)(Object) new FlexGraphViewRenderer();
                renderer.setGraphView(view);
                InputStream xmlStream =(InputStream)(Object) renderer.renderGraphView();
                StringWriter writer = new StringWriter();
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(xmlStream, writer);
                writer.close();
                System.out.println(writer.toString());
                out.append(writer.toString());
            } else {
                out.append("No target graph loaded.");
            }
        } catch (Exception e) {
            MyHelperClass JSONUtils = new MyHelperClass();
            return(JSONObject)(Object) JSONUtils.SimpleJSONError("Cannot load target graph: " + e.getMessage());
        }
        MyHelperClass JSONUtils = new MyHelperClass();
        return(JSONObject)(Object) JSONUtils.SimpleJSONResponse(out.toString());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ORANGES;
public MyHelperClass SimpleJSONError(String o0){ return null; }
	public MyHelperClass SimpleJSONResponse(String o0){ return null; }
	public MyHelperClass key(){ return null; }
	public MyHelperClass copy(InputStream o0, StringWriter o1){ return null; }}

class HttpSession {

public MyHelperClass getAttribute(MyHelperClass o0){ return null; }}

class JSONObject {

}

class JSONException extends Exception{
	public JSONException(String errorMessage) { super(errorMessage); }
}

class Graph {

}

class MappingManager {

public MyHelperClass getTargetGraph(){ return null; }}

class FlexGraphViewFactory {

public MyHelperClass getGraphView(){ return null; }
	public MyHelperClass visit(Graph o0){ return null; }
	public MyHelperClass setColorScheme(MyHelperClass o0){ return null; }}

class GraphView {

}

class GraphViewRenderer {

public MyHelperClass setGraphView(GraphView o0){ return null; }
	public MyHelperClass renderGraphView(){ return null; }}

class FlexGraphViewRenderer {

}

class InputStream {

}

class StringWriter {

public MyHelperClass close(){ return null; }}
