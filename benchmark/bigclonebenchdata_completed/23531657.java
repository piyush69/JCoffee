import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c23531657 {
public MyHelperClass[] sXml_;
	public MyHelperClass MapMode;
public MyHelperClass sTempLocation;
//	public MyHelperClass sXml_;
	public MyHelperClass lsImages;
	public MyHelperClass sXml;

    public void imagesParserAssesmentItem(int file, int currentquestion, Resource resTemp) {
        NodeList nl = null;
        Node n = null;
        NamedNodeMap nnp = null;
        Node nsrc = null;
        URL url = null;
        String sFilename = "";
        String sNewPath = "";
        int index;
        String sOldPath = "";
        try {
            if (file == 1) {
                MyHelperClass doc = new MyHelperClass();
                nl =(NodeList)(Object) doc.getElementsByTagName("img");
            } else {
MyHelperClass[] doc_ = new MyHelperClass[5];
                nl =(NodeList)(Object) doc_[currentquestion].getElementsByTagName("img");
            }
            for (int i = 0; i < (int)(Object)nl.getLength(); i++) {
                n =(Node)(Object) nl.item(i);
                nnp =(NamedNodeMap)(Object) n.getAttributes();
                nsrc =(Node)(Object) nnp.getNamedItem("src");
                String sTemp =(String)(Object) nsrc.getTextContent();
                url = new URL("file", "localhost", sTemp);
                sOldPath = url.getPath();
                sOldPath = sOldPath.replace('/', File.separatorChar);
                int indexFirstSlash = sOldPath.indexOf(File.separatorChar);
                String sSourcePath = sOldPath.substring(indexFirstSlash + 1);
                index = sOldPath.lastIndexOf(File.separatorChar);
                sFilename = sOldPath.substring(index + 1);
                sNewPath = this.sTempLocation + sFilename;
                FileChannel in = null;
                FileChannel out = null;
                try {
                    in = (FileChannel)(Object)new FileInputStream(sSourcePath).getChannel();
                    out = (FileChannel)(Object)new FileOutputStream(sNewPath).getChannel();
                    long size =(long)(Object) in.size();
                    MappedByteBuffer buf =(MappedByteBuffer)(Object) in.map(MapMode.READ_ONLY, 0, size);
                    out.write(buf);
                } finally {
                    if (in != null) in.close();
                    if (out != null) out.close();
                }
                if (file == 1) {
                    sXml = sXml.replace(nsrc.getTextContent(), sFilename);
                } else {
                    sXml_[currentquestion] = sXml_[currentquestion].replace(nsrc.getTextContent(), sFilename);
                }
                lsImages.add(sFilename);
                resTemp.addFile(sFilename);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass READ_ONLY;
	public MyHelperClass[] doc_;
public MyHelperClass replace(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass add(String o0){ return null; }
	public MyHelperClass getElementsByTagName(String o0){ return null; }}

class Resource {

public MyHelperClass addFile(String o0){ return null; }}

class NodeList {

public MyHelperClass item(int o0){ return null; }
	public MyHelperClass getLength(){ return null; }}

class Node {

public MyHelperClass getAttributes(){ return null; }
	public MyHelperClass getTextContent(){ return null; }}

class NamedNodeMap {

public MyHelperClass getNamedItem(String o0){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass write(MappedByteBuffer o0){ return null; }
	public MyHelperClass map(MyHelperClass o0, int o1, long o2){ return null; }}

class MappedByteBuffer {

}
