import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17539094 {
public MyHelperClass saxTree;
	public MyHelperClass file;
	public MyHelperClass Navigator;

    public  void XMLTreeView(JFrame frame, Web3DService web3DService)  throws Throwable {
        frame.getContentPane().setLayout(new BorderLayout());
        DefaultMutableTreeNode top = new DefaultMutableTreeNode(file);
        saxTree = new SAXTreeBuilder(top);
        InputStream urlIn = null;
        try {
            SAXParser saxParser = new SAXParser();
            saxParser.setContentHandler(saxTree);
            String request = web3DService.getServiceEndPoint() + "?" + "SERVICE=" + web3DService.getService() + "&" + "REQUEST=GetCapabilities&" + "ACCEPTFORMATS=text/xml&" + "ACCEPTVERSIONS=";
            for (int i = 0; i < web3DService.getAcceptVersions().length; i++) {
                if (i > 0) request += ",";
                request += web3DService.getAcceptVersions()[i];
            }
            System.out.println(request);
            URL url = new URL(request);
            URLConnection urlc = url.openConnection();
            urlc.setReadTimeout(Navigator.TIME_OUT);
            if (web3DService.getEncoding() != null) {
                urlc.setRequestProperty("Authorization", "Basic " + web3DService.getEncoding());
            }
            urlIn = urlc.getInputStream();
            saxParser.parse(new InputSource(urlIn));
        } catch (Exception ex) {
            top.add(new DefaultMutableTreeNode(ex.getMessage()));
        }
        try {
            urlIn.close();
        } catch (Exception e) {
        }
        JTree tree = new JTree(saxTree.getTree());
        JScrollPane scrollPane = new JScrollPane(tree);
        frame.getContentPane().add("Center", scrollPane);
        frame.setVisible(true);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TIME_OUT;
public MyHelperClass getTree(){ return null; }}

class JFrame {

public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass getContentPane(){ return null; }}

class Web3DService {

public MyHelperClass getEncoding(){ return null; }
	public MyHelperClass getServiceEndPoint(){ return null; }
	public MyHelperClass getService(){ return null; }
	public MyHelperClass getAcceptVersions(){ return null; }}

class BorderLayout {

}

class DefaultMutableTreeNode {

DefaultMutableTreeNode(MyHelperClass o0){}
	DefaultMutableTreeNode(String o0){}
	DefaultMutableTreeNode(){}}

class SAXTreeBuilder {

SAXTreeBuilder(DefaultMutableTreeNode o0){}
	SAXTreeBuilder(){}}

class SAXParser {

public MyHelperClass setContentHandler(MyHelperClass o0){ return null; }}

class InputSource {

InputSource(InputStream o0){}
	InputSource(){}}

class JTree {

}

class JScrollPane {

JScrollPane(){}
	JScrollPane(JTree o0){}}
