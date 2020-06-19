
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c21649305 {
public MyHelperClass KEY_PIVOT;
public MyHelperClass context;
	public MyHelperClass IOUtils;
	public MyHelperClass FileSystem;
	public MyHelperClass getMapperNum(){ return null; }
	public MyHelperClass getReducerNum(){ return null; }

    private String choosePivotVertex() throws ProcessorExecutionException {
        String result = null;
        Graph src;
        Graph dest;
        Path tmpDir;
        MyHelperClass _dirMgr = new MyHelperClass();
        System.out.println("##########>" + _dirMgr.getSeqNum() + " Choose the pivot vertex");
        MyHelperClass Graph = new MyHelperClass();
        src = new Graph(Graph.defaultGraph());
        MyHelperClass _curr_path = new MyHelperClass();
        src.setPath(_curr_path);
//        MyHelperClass Graph = new MyHelperClass();
        dest = new Graph(Graph.defaultGraph());
        try {
//            MyHelperClass _dirMgr = new MyHelperClass();
            tmpDir =(Path)(Object) _dirMgr.getTempDir();
        } catch (UncheckedIOException e) {
            throw new ProcessorExecutionException((String)(Object)e);
        }
        dest.setPath(tmpDir);
        GraphAlgorithm choose_pivot =(GraphAlgorithm)(Object) new PivotChoose();
        MyHelperClass context = new MyHelperClass();
        choose_pivot.setConf(context);
        choose_pivot.setSource(src);
        choose_pivot.setDestination(dest);
        choose_pivot.setMapperNum(getMapperNum());
        choose_pivot.setReducerNum(getReducerNum());
        choose_pivot.execute();
        try {
            Path the_file = new Path(tmpDir.toString() + "/part-00000");
            FileSystem client =(FileSystem)(Object) FileSystem.get(context);
            if (!(Boolean)(Object)client.exists(the_file)) {
                throw new ProcessorExecutionException("Did not find the chosen vertex in " + the_file.toString());
            }
            FSDataInputStream input_stream =(FSDataInputStream)(Object) client.open(the_file);
            ByteArrayOutputStream output_stream = new ByteArrayOutputStream();
            IOUtils.copyBytes(input_stream, output_stream, context, false);
            String the_line = output_stream.toString();
            result = the_line.substring((int)(Object)KEY_PIVOT.length()).trim();
            input_stream.close();
            output_stream.close();
            System.out.println("##########> Chosen pivot id = " + result);
        } catch (UncheckedIOException e) {
            throw new ProcessorExecutionException((String)(Object)e);
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getTempDir(){ return null; }
	public MyHelperClass copyBytes(FSDataInputStream o0, ByteArrayOutputStream o1, MyHelperClass o2, boolean o3){ return null; }
	public MyHelperClass getSeqNum(){ return null; }
	public MyHelperClass defaultGraph(){ return null; }
	public MyHelperClass get(MyHelperClass o0){ return null; }
	public MyHelperClass length(){ return null; }}

class ProcessorExecutionException extends Exception{
	public ProcessorExecutionException(String errorMessage) { super(errorMessage); }
}

class Graph {

Graph(MyHelperClass o0){}
	Graph(){}
	public MyHelperClass setPath(MyHelperClass o0){ return null; }
	public MyHelperClass setPath(Path o0){ return null; }}

class Path {

Path(String o0){}
	Path(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class GraphAlgorithm {

public MyHelperClass setMapperNum(MyHelperClass o0){ return null; }
	public MyHelperClass execute(){ return null; }
	public MyHelperClass setDestination(Graph o0){ return null; }
	public MyHelperClass setSource(Graph o0){ return null; }
	public MyHelperClass setConf(MyHelperClass o0){ return null; }
	public MyHelperClass setReducerNum(MyHelperClass o0){ return null; }}

class PivotChoose {

}

class FileSystem {

public MyHelperClass open(Path o0){ return null; }
	public MyHelperClass exists(Path o0){ return null; }}

class FSDataInputStream {

public MyHelperClass close(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass close(){ return null; }}
