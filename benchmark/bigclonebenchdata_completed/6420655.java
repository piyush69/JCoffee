import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6420655 {

    private void createNodes()  throws Throwable {
        try {
            URL url = this.getClass().getResource("NodesFile.txt");
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
                n.label = label;
                n.fullText = fullText;
                MyHelperClass node = new MyHelperClass();
                node.add(n);
            }
            inNodes.close();

            url = this.getClass().getResource("EdgesFile.txt");
            inReader = new InputStreamReader(url.openStream());
            BufferedReader inEdges = new BufferedReader(inReader);
            // BufferedReader inEdges = new BufferedReader(new
            // FileReader("EdgesFile.txt"));
            while ((s = inEdges.readLine()) != null)
                MyHelperClass edge = new MyHelperClass();
                edge.add(new Edge(s, inEdges.readLine(), inEdges.readLine(),
                        inEdges.readLine()));
            inEdges.close();
        } catch (FileNotFoundException e) {
            // TODO ?????? catch ??
            e.printStackTrace();
        } catch (IOException e) {
            // TODO ?????? catch ??
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

}

class Node {

}

class Edge {

}
