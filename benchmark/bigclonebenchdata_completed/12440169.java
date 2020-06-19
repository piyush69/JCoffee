


class c12440169 {
public MyHelperClass IOUtils;
	public MyHelperClass openFile(String o0){ return null; }

    public String openFileAsText(String resource) throws IOException {
        StringWriter wtr = new StringWriter();
        InputStreamReader rdr = new InputStreamReader(openFile(resource));
        try {
            IOUtils.copy(rdr, wtr);
        } finally {
            IOUtils.closeQuietly(rdr);
        }
        return wtr.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(InputStreamReader o0){ return null; }
	public MyHelperClass copy(InputStreamReader o0, StringWriter o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class StringWriter {

}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
