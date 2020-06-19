
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c17551920 {
public MyHelperClass SPANNING_TREE_ROOT;
public MyHelperClass IOUtils;
	public MyHelperClass MRConsoleReader;
	public MyHelperClass ConstantLabels;
	public MyHelperClass FileSystem;
	public MyHelperClass Graph;
	public MyHelperClass context;
	public MyHelperClass getMapperNum(){ return null; }
	public MyHelperClass getSource(){ return null; }
	public MyHelperClass getReducerNum(){ return null; }
	public MyHelperClass getDestination(){ return null; }

//    @Override
    public void execute() throws ProcessorExecutionException {
        try {
            if (getSource().getPaths() == null ||(int)(Object) getSource().getPaths().size() == 0 || getDestination().getPaths() == null ||(int)(Object) getDestination().getPaths().size() == 0) {
                throw new ProcessorExecutionException("No input and/or output paths specified.");
            }
            String temp_dir_prefix = getDestination().getPath().getParent().toString() + "/bcc_" + getDestination().getPath().getName() + "_";
            SequenceTempDirMgr dirMgr = new SequenceTempDirMgr(temp_dir_prefix, context);
            dirMgr.setSeqNum(0);
            Path tmpDir;
            System.out.println("++++++>" + dirMgr.getSeqNum() + ": Transform input to AdjSetVertex");
            Transformer transformer =(Transformer)(Object) new OutAdjVertex2AdjSetVertexTransformer();
            transformer.setConf(context);
            transformer.setSrcPath(getSource().getPath());
            tmpDir =(Path)(Object) dirMgr.getTempDir();
            transformer.setDestPath(tmpDir);
            transformer.setMapperNum(getMapperNum());
            transformer.setReducerNum(getReducerNum());
            transformer.execute();
            System.out.println("++++++>" + dirMgr.getSeqNum() + ": Transform input to LabeledAdjSetVertex");
            Vertex2LabeledTransformer l_transformer = new Vertex2LabeledTransformer();
            l_transformer.setConf(context);
            l_transformer.setSrcPath(tmpDir);
            tmpDir =(Path)(Object) dirMgr.getTempDir();
            l_transformer.setDestPath(tmpDir);
            l_transformer.setMapperNum(getMapperNum());
            l_transformer.setReducerNum(getReducerNum());
            l_transformer.setOutputValueClass(LabeledAdjSetVertex.class);
            l_transformer.execute();
            Graph src;
            Graph dest;
            Path path_to_remember = tmpDir;
            System.out.println("++++++>" + dirMgr.getSeqNum() + ": SpanningTreeRootChoose");
            src = new Graph(Graph.defaultGraph());
            src.setPath(tmpDir);
            dest = new Graph(Graph.defaultGraph());
            tmpDir =(Path)(Object) dirMgr.getTempDir();
            dest.setPath(tmpDir);
            GraphAlgorithm choose_root =(GraphAlgorithm)(Object) new SpanningTreeRootChoose();
            choose_root.setConf(context);
            choose_root.setSource(src);
            choose_root.setDestination(dest);
            choose_root.setMapperNum(getMapperNum());
            choose_root.setReducerNum(getReducerNum());
            choose_root.execute();
            Path the_file = new Path(tmpDir.toString() + "/part-00000");
            FileSystem client =(FileSystem)(Object) FileSystem.get(context);
            if (!(Boolean)(Object)client.exists(the_file)) {
                throw new ProcessorExecutionException("Did not find the chosen vertex in " + the_file.toString());
            }
            FSDataInputStream input_stream =(FSDataInputStream)(Object) client.open(the_file);
            ByteArrayOutputStream output_stream = new ByteArrayOutputStream();
            IOUtils.copyBytes(input_stream, output_stream, context, false);
            String the_line = output_stream.toString();
            String root_vertex_id = the_line.substring((int)(Object)SPANNING_TREE_ROOT.length()).trim();
            input_stream.close();
            output_stream.close();
            System.out.println("++++++> Chosen the root of spanning tree = " + root_vertex_id);
            while (true) {
                System.out.println("++++++>" + dirMgr.getSeqNum() + " Generate the spanning tree rooted at : (" + root_vertex_id + ") from " + tmpDir);
                src = new Graph(Graph.defaultGraph());
                src.setPath(path_to_remember);
                tmpDir =(Path)(Object) dirMgr.getTempDir();
                dest = new Graph(Graph.defaultGraph());
                dest.setPath(tmpDir);
                path_to_remember = tmpDir;
                GraphAlgorithm spanning =(GraphAlgorithm)(Object) new SpanningTreeGenerate();
                spanning.setConf(context);
                spanning.setSource(src);
                spanning.setDestination(dest);
                spanning.setMapperNum(getMapperNum());
                spanning.setReducerNum(getReducerNum());
                spanning.setParameter(ConstantLabels.ROOT_ID, root_vertex_id);
                spanning.execute();
                System.out.println("++++++>" + dirMgr.getSeqNum() + " Test spanning convergence");
                src = new Graph(Graph.defaultGraph());
                src.setPath(tmpDir);
                tmpDir =(Path)(Object) dirMgr.getTempDir();
                dest = new Graph(Graph.defaultGraph());
                dest.setPath(tmpDir);
                GraphAlgorithm conv_tester =(GraphAlgorithm)(Object) new SpanningConvergenceTest();
                conv_tester.setConf(context);
                conv_tester.setSource(src);
                conv_tester.setDestination(dest);
                conv_tester.setMapperNum(getMapperNum());
                conv_tester.setReducerNum(getReducerNum());
                conv_tester.execute();
                long vertexes_out_of_tree =(long)(Object) MRConsoleReader.getMapOutputRecordNum(conv_tester.getFinalStatus());
                System.out.println("++++++> number of vertexes out of the spanning tree = " + vertexes_out_of_tree);
                if (vertexes_out_of_tree == 0) {
                    break;
                }
            }
            System.out.println("++++++> From spanning tree to sets of edges");
            src = new Graph(Graph.defaultGraph());
            src.setPath(path_to_remember);
            tmpDir =(Path)(Object) dirMgr.getTempDir();
            dest = new Graph(Graph.defaultGraph());
            dest.setPath(tmpDir);
            GraphAlgorithm tree2set =(GraphAlgorithm)(Object) new Tree2EdgeSet();
            tree2set.setConf(context);
            tree2set.setSource(src);
            tree2set.setDestination(dest);
            tree2set.setMapperNum(getMapperNum());
            tree2set.setReducerNum(getReducerNum());
            tree2set.execute();
            long map_input_records_num = -1;
            long map_output_records_num = -2;
            Stack expanding_stack = new Stack();
            do {
                System.out.println("++++++>" + dirMgr.getSeqNum() + ": EdgeSetMinorJoin");
                GraphAlgorithm minorjoin =(GraphAlgorithm)(Object) new EdgeSetMinorJoin();
                minorjoin.setConf(context);
                src = new Graph(Graph.defaultGraph());
                src.setPath(tmpDir);
                dest = new Graph(Graph.defaultGraph());
                tmpDir =(Path)(Object) dirMgr.getTempDir();
                dest.setPath(tmpDir);
                minorjoin.setSource(src);
                minorjoin.setDestination(dest);
                minorjoin.setMapperNum(getMapperNum());
                minorjoin.setReducerNum(getReducerNum());
                minorjoin.execute();
                expanding_stack.push(tmpDir);
                System.out.println("++++++>" + dirMgr.getSeqNum() + ": EdgeSetJoin");
                GraphAlgorithm join =(GraphAlgorithm)(Object) new EdgeSetJoin();
                join.setConf(context);
                src = new Graph(Graph.defaultGraph());
                src.setPath(tmpDir);
                dest = new Graph(Graph.defaultGraph());
                tmpDir =(Path)(Object) dirMgr.getTempDir();
                dest.setPath(tmpDir);
                join.setSource(src);
                join.setDestination(dest);
                join.setMapperNum(getMapperNum());
                join.setReducerNum(getReducerNum());
                join.execute();
                map_input_records_num =(long)(Object) MRConsoleReader.getMapInputRecordNum(join.getFinalStatus());
                map_output_records_num =(long)(Object) MRConsoleReader.getMapOutputRecordNum(join.getFinalStatus());
                System.out.println("++++++> map in/out : " + map_input_records_num + "/" + map_output_records_num);
            } while (map_input_records_num != map_output_records_num);
            while ((int)(Object)expanding_stack.size() > 0) {
                System.out.println("++++++>" + dirMgr.getSeqNum() + ": EdgeSetExpand");
                GraphAlgorithm expand =(GraphAlgorithm)(Object) new EdgeSetExpand();
                expand.setConf(context);
                src = new Graph(Graph.defaultGraph());
                src.addPath((Path)(Object)expanding_stack.pop());
                src.addPath(tmpDir);
                dest = new Graph(Graph.defaultGraph());
                tmpDir =(Path)(Object) dirMgr.getTempDir();
                dest.setPath(tmpDir);
                expand.setSource(src);
                expand.setDestination(dest);
                expand.setMapperNum(getMapperNum());
                expand.setReducerNum(getReducerNum());
                expand.execute();
                System.out.println("++++++>" + dirMgr.getSeqNum() + ": EdgeSetMinorExpand");
                GraphAlgorithm minorexpand =(GraphAlgorithm)(Object) new EdgeSetMinorExpand();
                minorexpand.setConf(context);
                src = new Graph(Graph.defaultGraph());
                src.setPath(tmpDir);
                dest = new Graph(Graph.defaultGraph());
                tmpDir =(Path)(Object) dirMgr.getTempDir();
                dest.setPath(tmpDir);
                minorexpand.setSource(src);
                minorexpand.setDestination(dest);
                minorexpand.setMapperNum(getMapperNum());
                minorexpand.setReducerNum(getReducerNum());
                minorexpand.execute();
            }
            System.out.println("++++++>" + dirMgr.getSeqNum() + ": EdgeSetSummarize");
            GraphAlgorithm summarize =(GraphAlgorithm)(Object) new EdgeSetSummarize();
            summarize.setConf(context);
            src = new Graph(Graph.defaultGraph());
            src.setPath(tmpDir);
            dest = new Graph(Graph.defaultGraph());
            dest.setPath((Path)(Object)getDestination().getPath());
            summarize.setSource(src);
            summarize.setDestination(dest);
            summarize.setMapperNum(getMapperNum());
            summarize.setReducerNum(getReducerNum());
            summarize.execute();
            dirMgr.deleteAll();
        } catch (UncheckedIOException e) {
            throw new ProcessorExecutionException((String)(Object)e);
        } catch (ArithmeticException e) {
            throw new ProcessorExecutionException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ROOT_ID;
public MyHelperClass getMapInputRecordNum(MyHelperClass o0){ return null; }
	public MyHelperClass defaultGraph(){ return null; }
	public MyHelperClass getParent(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass getMapOutputRecordNum(MyHelperClass o0){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass copyBytes(FSDataInputStream o0, ByteArrayOutputStream o1, MyHelperClass o2, boolean o3){ return null; }
	public MyHelperClass getPaths(){ return null; }
	public MyHelperClass get(MyHelperClass o0){ return null; }}

class ProcessorExecutionException extends Exception{
	public ProcessorExecutionException(String errorMessage) { super(errorMessage); }
}

class SequenceTempDirMgr {

SequenceTempDirMgr(){}
	SequenceTempDirMgr(String o0, MyHelperClass o1){}
	public MyHelperClass setSeqNum(int o0){ return null; }
	public MyHelperClass getTempDir(){ return null; }
	public MyHelperClass deleteAll(){ return null; }
	public MyHelperClass getSeqNum(){ return null; }}

class Path {

Path(String o0){}
	Path(){}}

class Transformer {

public MyHelperClass setMapperNum(MyHelperClass o0){ return null; }
	public MyHelperClass setConf(MyHelperClass o0){ return null; }
	public MyHelperClass setDestPath(Path o0){ return null; }
	public MyHelperClass setReducerNum(MyHelperClass o0){ return null; }
	public MyHelperClass setSrcPath(MyHelperClass o0){ return null; }
	public MyHelperClass execute(){ return null; }}

class OutAdjVertex2AdjSetVertexTransformer {

}

class Vertex2LabeledTransformer {

public MyHelperClass setMapperNum(MyHelperClass o0){ return null; }
	public MyHelperClass setConf(MyHelperClass o0){ return null; }
	public MyHelperClass setOutputValueClass(Class<LabeledAdjSetVertex> o0){ return null; }
	public MyHelperClass setDestPath(Path o0){ return null; }
	public MyHelperClass setReducerNum(MyHelperClass o0){ return null; }
	public MyHelperClass setSrcPath(Path o0){ return null; }
	public MyHelperClass execute(){ return null; }}

class LabeledAdjSetVertex {

}

class Graph {

Graph(){}
	Graph(MyHelperClass o0){}
	public MyHelperClass addPath(Path o0){ return null; }
	public MyHelperClass setPath(Path o0){ return null; }}

class GraphAlgorithm {

public MyHelperClass setMapperNum(MyHelperClass o0){ return null; }
	public MyHelperClass setConf(MyHelperClass o0){ return null; }
	public MyHelperClass getFinalStatus(){ return null; }
	public MyHelperClass setReducerNum(MyHelperClass o0){ return null; }
	public MyHelperClass setParameter(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass setDestination(Graph o0){ return null; }
	public MyHelperClass setSource(Graph o0){ return null; }
	public MyHelperClass execute(){ return null; }}

class SpanningTreeRootChoose {

}

class FileSystem {

public MyHelperClass open(Path o0){ return null; }
	public MyHelperClass exists(Path o0){ return null; }}

class FSDataInputStream {

public MyHelperClass close(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass close(){ return null; }}

class SpanningTreeGenerate {

}

class SpanningConvergenceTest {

}

class Tree2EdgeSet {

}

class Stack {

public MyHelperClass size(){ return null; }
	public MyHelperClass push(Path o0){ return null; }
	public MyHelperClass pop(){ return null; }}

class EdgeSetMinorJoin {

}

class EdgeSetJoin {

}

class EdgeSetExpand {

}

class EdgeSetMinorExpand {

}

class EdgeSetSummarize {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
