import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c8201873 {

        public Graph getGraph(URL urlFilename) throws MraldException {
            try {
                System.out.print("DBGraphReader: gettingGraph using url");
                InputStream inUrl = urlFilename.openStream();
                XMLGraphReader gr = new XMLGraphReader();
                gr.setNodeType(DefaultTreeNode.class);
                Graph graph =(Graph)(Object) gr.loadGraph(inUrl);
                return graph;
            } catch (java.io.FileNotFoundException e) {
                throw new MraldException(e.getMessage());
            } catch (java.io.IOException e) {
                throw new MraldException(e.getMessage());
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Graph {

}

class MraldException extends Exception{
	public MraldException(String errorMessage) { super(errorMessage); }
}

class XMLGraphReader {

public MyHelperClass setNodeType(Class<DefaultTreeNode> o0){ return null; }
	public MyHelperClass loadGraph(InputStream o0){ return null; }}

class DefaultTreeNode {

}
