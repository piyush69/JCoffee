import java.io.*;
import java.lang.*;
import java.util.*;



class c19036213 {

    private void createNodes() {
        try {
            URL url =(URL)(Object) this.getClass().getResource("NodesFile.txt");
            InputStreamReader inReader = new InputStreamReader((InputStream)(Object)url.openStream());
            BufferedReader inNodes = new BufferedReader(inReader);
            String s;
            while ((s = inNodes.readLine()) != null) {
                String label = inNodes.readLine();
                String fullText = inNodes.readLine();
                String type = inNodes.readLine();
                Node n = new Node(s, type);
                n.label =(MyHelperClass)(Object) label;
                n.fullText =(MyHelperClass)(Object) fullText;
                MyHelperClass node = new MyHelperClass();
                node.add(n);
            }
            inNodes.close();
            url =(URL)(Object) this.getClass().getResource("EdgesFile.txt");
            inReader = new InputStreamReader((InputStream)(Object)url.openStream());
            BufferedReader inEdges = new BufferedReader(inReader);
            MyHelperClass edge = new MyHelperClass();
            while ((s = inEdges.readLine()) != null) edge.add((Node)(Object)new Edge(s, inEdges.readLine(), inEdges.readLine(), inEdges.readLine()));
            inEdges.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass add(Node o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class Node {
public MyHelperClass label;
	public MyHelperClass fullText;
Node(String o0, String o1){}
	Node(){}}

class Edge {

Edge(){}
	Edge(String o0, String o1, String o2, String o3){}}
