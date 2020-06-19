
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c4588203 {
public MyHelperClass MapMode;

    public String copyImages(Document doc, String sXML, String newPath, String tagName, String itemName) {
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
            nl =(NodeList)(Object) doc.getElementsByTagName(tagName);
            for (int i = 0; i < (int)(Object)nl.getLength(); i++) {
                n =(Node)(Object) nl.item(i);
                nnp =(NamedNodeMap)(Object) n.getAttributes();
                nsrc =(Node)(Object) nnp.getNamedItem(itemName);
                String sTemp =(String)(Object) nsrc.getTextContent();
                url = new URL("file", "localhost", sTemp);
                sOldPath =(String)(Object) url.getPath();
                MyHelperClass File = new MyHelperClass();
                sOldPath = sOldPath.replace('/',(char)(Object) File.separatorChar);
//                MyHelperClass File = new MyHelperClass();
                int indexFirstSlash = sOldPath.indexOf((int)(Object)File.separatorChar);
                String sSourcePath;
                if (itemName.equals("data")) sSourcePath = sOldPath; else sSourcePath = sOldPath.substring(indexFirstSlash + 1);
//                MyHelperClass File = new MyHelperClass();
                index = sOldPath.lastIndexOf((int)(Object)File.separatorChar);
                sFilename = sOldPath.substring(index + 1);
                sNewPath = newPath + sFilename;
                FileChannel in = null;
                FileChannel out = null;
                try {
                    in =(FileChannel)(Object) (new FileInputStream(sSourcePath).getChannel());
                    out =(FileChannel)(Object) (new FileOutputStream(sNewPath).getChannel());
                    long size =(long)(Object) in.size();
                    MappedByteBuffer buf =(MappedByteBuffer)(Object) in.map(MapMode.READ_ONLY, 0, size);
                    out.write(buf);
                } finally {
                    if (in != null) in.close();
                    if (out != null) out.close();
                }
                sXML = sXML.replace((char)(Object)nsrc.getTextContent(),(char)(Object) sFilename);
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return sXML;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass READ_ONLY;
	public MyHelperClass separatorChar;
}

class Document {

public MyHelperClass getElementsByTagName(String o0){ return null; }}

class NodeList {

public MyHelperClass item(int o0){ return null; }
	public MyHelperClass getLength(){ return null; }}

class Node {

public MyHelperClass getAttributes(){ return null; }
	public MyHelperClass getTextContent(){ return null; }}

class NamedNodeMap {

public MyHelperClass getNamedItem(String o0){ return null; }}

class URL {

URL(){}
	URL(String o0, String o1, String o2){}
	public MyHelperClass getPath(){ return null; }}

class FileChannel {

public MyHelperClass write(MappedByteBuffer o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass map(MyHelperClass o0, int o1, long o2){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class MappedByteBuffer {

}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
