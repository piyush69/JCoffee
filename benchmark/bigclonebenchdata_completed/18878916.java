


class c18878916 {
public MyHelperClass appendInputToContents(BufferedReader o0, StringBuffer o1){ return null; }

    public String getContents(String fileUri) throws IOException {
        StringBuffer contents = new StringBuffer();
        if (fileUri != null && !fileUri.equals("")) {
            BufferedReader input = null;
            try {
                MyHelperClass LOG = new MyHelperClass();
                LOG.info("Reading:" + fileUri);
                URL url =(URL)(Object) getClass().getClassLoader().getResource(fileUri);
                if (url != null) {
                    InputStream stream =(InputStream)(Object) url.openStream();
                    input = new BufferedReader(new InputStreamReader(stream));
                    appendInputToContents(input, contents);
                } else {
//                    MyHelperClass LOG = new MyHelperClass();
                    LOG.error("Unable to locate file:" + fileUri + " in directory " + new File(".").getAbsolutePath());
                }
            } finally {
                if (input != null) {
                    input.close();
                }
            }
        }
        return contents.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getAbsolutePath(){ return null; }}
