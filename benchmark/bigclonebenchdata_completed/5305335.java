import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c5305335 {

    public void testRenderRules() {
        try {
            MappingManager manager = new MappingManager();
            MyHelperClass OWLManager = new MyHelperClass();
            OWLOntologyManager omanager =(OWLOntologyManager)(Object) OWLManager.createOWLOntologyManager();
            OWLOntology srcOntology;
            OWLOntology targetOntology;
            MyHelperClass rulesDoc = new MyHelperClass();
            manager.loadMapping(rulesDoc.toURL());
            MyHelperClass srcURI = new MyHelperClass();
            srcOntology =(OWLOntology)(Object) omanager.loadOntologyFromPhysicalURI(srcURI);
            MyHelperClass targetURI = new MyHelperClass();
            targetOntology =(OWLOntology)(Object) omanager.loadOntologyFromPhysicalURI(targetURI);
            manager.setSourceOntology(srcOntology);
            manager.setTargetOntology(targetOntology);
            Graph srcGraph =(Graph)(Object) manager.getSourceGraph();
            Graph targetGraph =(Graph)(Object) manager.getTargetGraph();
            System.out.println("Starting to render...");
            FlexGraphViewFactory factory = new FlexGraphViewFactory();
            MyHelperClass ColorSchemes = new MyHelperClass();
            factory.setColorScheme(ColorSchemes.BLUES);
            factory.visit(srcGraph);
            GraphView view =(GraphView)(Object) factory.getGraphView();
            GraphViewRenderer renderer =(GraphViewRenderer)(Object) new FlexGraphViewRenderer();
            renderer.setGraphView(view);
            System.out.println("View updated with graph...");
            InputStream xmlStream =(InputStream)(Object) renderer.renderGraphView();
            StringWriter writer = new StringWriter();
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(xmlStream, writer);
            System.out.println("Finished writing");
            writer.close();
            System.out.println("Finished render... XML is:");
            System.out.println(writer.toString());
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BLUES;
public MyHelperClass toURL(){ return null; }
	public MyHelperClass copy(InputStream o0, StringWriter o1){ return null; }
	public MyHelperClass createOWLOntologyManager(){ return null; }}

class MappingManager {

public MyHelperClass getTargetGraph(){ return null; }
	public MyHelperClass getSourceGraph(){ return null; }
	public MyHelperClass setSourceOntology(OWLOntology o0){ return null; }
	public MyHelperClass loadMapping(MyHelperClass o0){ return null; }
	public MyHelperClass setTargetOntology(OWLOntology o0){ return null; }}

class OWLOntologyManager {

public MyHelperClass loadOntologyFromPhysicalURI(MyHelperClass o0){ return null; }}

class OWLOntology {

}

class Graph {

}

class FlexGraphViewFactory {

public MyHelperClass getGraphView(){ return null; }
	public MyHelperClass visit(Graph o0){ return null; }
	public MyHelperClass setColorScheme(MyHelperClass o0){ return null; }}

class GraphView {

}

class GraphViewRenderer {

public MyHelperClass renderGraphView(){ return null; }
	public MyHelperClass setGraphView(GraphView o0){ return null; }}

class FlexGraphViewRenderer {

}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class OWLOntologyCreationException extends Exception{
	public OWLOntologyCreationException(String errorMessage) { super(errorMessage); }
}
