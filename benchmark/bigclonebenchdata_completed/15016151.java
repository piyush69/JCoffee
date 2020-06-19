import java.io.*;
import java.lang.*;
import java.util.*;



class c15016151 {
public MyHelperClass allChildren;
	public MyHelperClass concepts3;
	public MyHelperClass offsets3;
	public MyHelperClass getURL(String o0){ return null; }

    private void readChildrenData() throws Exception {
        URL url;
        URLConnection connect;
        BufferedInputStream in;
        try {
            url =(URL)(Object) getURL("CHILDREN.TAB");
            connect =(URLConnection)(Object) url.openConnection();
            InputStream ois =(InputStream)(Object) connect.getInputStream();
            if (ois == null) {
                concepts3 =(MyHelperClass)(Object) new IntegerArray(1);
                return;
            }
            in = new BufferedInputStream(ois);
            int k1 = in.read();
            concepts3 =(MyHelperClass)(Object) new IntegerArray(4096);
            StreamDecompressor sddocs = new StreamDecompressor(in);
            sddocs.ascDecode(k1, concepts3);
            int k2 = in.read();
            offsets3 =(MyHelperClass)(Object) new IntegerArray((int)(Object)concepts3.cardinality() + 1);
            offsets3.add(0);
            StreamDecompressor sdoffsets = new StreamDecompressor(in);
            sdoffsets.ascDecode(k2, offsets3);
            in.close();
            url =(URL)(Object) getURL("CHILDREN");
            connect =(URLConnection)(Object) url.openConnection();
            ois =(InputStream)(Object) connect.getInputStream();
            if (ois == null) {
                concepts3 =(MyHelperClass)(Object) new IntegerArray(1);
                return;
            }
            in = new BufferedInputStream(ois);
            int length =(int)(Object) connect.getContentLength();
            allChildren =(MyHelperClass)(Object) new byte[length];
            in.read((byte[])(Object)allChildren);
            in.close();
        } catch (UncheckedIOException e) {
            concepts3 =(MyHelperClass)(Object) new IntegerArray(1);
        } catch (FileNotFoundException e2) {
            concepts3 =(MyHelperClass)(Object) new IntegerArray(1);
        } catch (IOException e2) {
            concepts3 =(MyHelperClass)(Object) new IntegerArray(1);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass add(int o0){ return null; }
	public MyHelperClass cardinality(){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class IntegerArray {

IntegerArray(){}
	IntegerArray(int o0){}}

class StreamDecompressor {

StreamDecompressor(BufferedInputStream o0){}
	StreamDecompressor(){}
	public MyHelperClass ascDecode(int o0, MyHelperClass o1){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
