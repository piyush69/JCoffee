
import java.io.UncheckedIOException;


class c21556191 {
public MyHelperClass showErrorDialog(String o0, boolean o1){ return null; }

    public JTree createTree() {
        DefaultMutableTreeNode top = new DefaultMutableTreeNode("Contents");
        DefaultMutableTreeNode[] nodeLevels = new DefaultMutableTreeNode[0];
        MyHelperClass ResourceManager = new MyHelperClass();
        URL url =(URL)(Object) ResourceManager.getResource("tree.txt");
        try {
            InputStream is =(InputStream)(Object) url.openStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(isr);
            String line =(String)(Object) reader.readLine();
            int numLevels = 0;
            if (line != null) {
                while (line.startsWith("#")) line =(String)(Object) reader.readLine();
                numLevels = Integer.parseInt(line);
                line =(String)(Object) reader.readLine();
                nodeLevels = new DefaultMutableTreeNode[numLevels + 1];
                nodeLevels[0] = top;
            }
            while (line != null) {
                if (!line.startsWith("#")) {
                    int level = Integer.parseInt(line.substring(0, 1));
                    line = line.substring(line.indexOf(",") + 1);
                    String nodeDescription = line.substring(0, line.indexOf(","));
                    String nodeURL = line.substring(line.indexOf(",") + 1, line.length());
                    nodeLevels[level] = new DefaultMutableTreeNode((String)(Object)new HelpTopic(nodeDescription, nodeURL));
                    nodeLevels[level - 1].add(nodeLevels[level]);
                }
                line =(String)(Object) reader.readLine();
            }
        } catch (UncheckedIOException e) {
            showErrorDialog("Unable to read resource tree.txt", true);
        } catch (NumberFormatException nfe) {
            showErrorDialog("Invalid format tree.txt", true);
        }
        return new JTree(top) {

            public java.awt.Insets getInsets() {
                return new java.awt.Insets(5, 5, 5, 5);
            }
        };
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getResource(String o0){ return null; }}

class JTree {

JTree(DefaultMutableTreeNode o0){}
	JTree(){}}

class DefaultMutableTreeNode {

DefaultMutableTreeNode(String o0){}
	DefaultMutableTreeNode(){}
	public MyHelperClass add(DefaultMutableTreeNode o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class HelpTopic {

HelpTopic(String o0, String o1){}
	HelpTopic(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
