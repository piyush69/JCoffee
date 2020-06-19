import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c7409664 {
public MyHelperClass edgeFileName;
	public MyHelperClass edge;
	public MyHelperClass nodeFileName;
	public MyHelperClass node;

    private void createNodes() {
        try {
            URL url = this.getClass().getResource((String)(Object)this.nodeFileName);
            InputStreamReader inReader = new InputStreamReader(url.openStream());
            BufferedReader inNodes = new BufferedReader(inReader);

            // BufferedReader inNodes = new BufferedReader(new
            // FileReader("NodesFile.txt"));
            String s;
            while ((s = inNodes.readLine()) != null) {
                String label = inNodes.readLine();
                String fullText = inNodes.readLine();
                String type = inNodes.readLine();
                Node n = new Node(s, type);
                n.label =(MyHelperClass)(Object) label;
                n.fullText =(MyHelperClass)(Object) fullText;
                node.add(n);
            }
            inNodes.close();

            url = this.getClass().getResource((String)(Object)this.edgeFileName);
            inReader = new InputStreamReader(url.openStream());
            BufferedReader inEdges = new BufferedReader(inReader);
            // BufferedReader inEdges = new BufferedReader(new
            // FileReader("EdgesFile.txt"));
            while ((s = inEdges.readLine()) != null)
                edge.add((Node)(Object)new Edge(s, inEdges.readLine(), inEdges.readLine(),
                        inEdges.readLine()));
            inEdges.close();
        } catch (FileNotFoundException e) {
            // TODO �Զ���� catch ��
            e.printStackTrace();
        } catch (IOException e) {
            // TODO �Զ���� catch ��
            e.printStackTrace();
        }
        /*
         * for(Myparser.Nd x:FreeConnectTest.pNd){ Node n = new Node(x.id,
         * x.type); n.label = x.label; node.add(n); } for(Myparser.Ed
         * x:FreeConnectTest.pEd) edge.add(new Edge(x.id, x.source.id,
         * x.target.id));
         */
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass add(Node o0){ return null; }}

class Node {
public MyHelperClass fullText;
	public MyHelperClass label;
Node(String o0, String o1){}
	Node(){}}

class Edge {

Edge(){}
	Edge(String o0, String o1, String o2, String o3){}}
