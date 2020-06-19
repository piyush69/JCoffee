


class c14555892 {
public MyHelperClass encoding;
	public MyHelperClass IOUtils;
	public MyHelperClass getInputStream(){ return null; }

    public String getText() throws IOException {
        InputStreamReader r = new InputStreamReader(getInputStream(), encoding);
        StringWriter w = new StringWriter(256 * 128);
        try {
            IOUtils.copy(r, w);
        } finally {
            IOUtils.closeQuietly(w);
            IOUtils.closeQuietly(r);
        }
        return w.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(StringWriter o0){ return null; }
	public MyHelperClass closeQuietly(InputStreamReader o0){ return null; }
	public MyHelperClass copy(InputStreamReader o0, StringWriter o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStreamReader {

InputStreamReader(MyHelperClass o0, MyHelperClass o1){}
	InputStreamReader(){}}

class StringWriter {

StringWriter(int o0){}
	StringWriter(){}}
