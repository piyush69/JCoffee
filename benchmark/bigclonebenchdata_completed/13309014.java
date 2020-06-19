


class c13309014 {
public MyHelperClass skipWhiteSpace(PushbackInputStream o0){ return null; }
	public MyHelperClass scanForLTBang(PushbackInputStream o0){ return null; }
	public MyHelperClass getString(PushbackInputStream o0){ return null; }

    public String[] getElements() throws IOException {
        Vector v = new Vector();
        PushbackInputStream in = null;
        try {
            MyHelperClass dtdURL = new MyHelperClass();
            URLConnection urlConn =(URLConnection)(Object) dtdURL.openConnection();
            in = new PushbackInputStream(new BufferedInputStream(urlConn.getInputStream()));
            while ((boolean)(Object)scanForLTBang(in)) {
                String elementType =(String)(Object) getString(in);
                if (elementType.equals("ELEMENT")) {
                    skipWhiteSpace(in);
                    String elementName =(String)(Object) getString(in);
                    v.addElement(elementName);
                }
            }
            in.close();
            String[] elements = new String[(int)(Object)v.size()];
            v.copyInto(elements);
            return elements;
        } catch (Exception exc) {
            if (in != null) {
                try {
                    in.close();
                } catch (Exception ignore) {
                }
            }
            throw new IOException("Error reading DTD: " + exc.toString());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Vector {

public MyHelperClass copyInto(String[] o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass addElement(String o0){ return null; }}

class PushbackInputStream {

PushbackInputStream(BufferedInputStream o0){}
	PushbackInputStream(){}
	public MyHelperClass close(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}}
