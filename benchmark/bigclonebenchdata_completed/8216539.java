


class c8216539 {

    protected String getFileContentAsString(String filePath, String encoding) throws IOException {
        URL testURL =(URL)(Object) Thread.currentThread().getContextClassLoader().getResource(filePath);
        InputStream input = null;
        StringWriter sw = new StringWriter();
        try {
            if (testURL != null) {
                input =(InputStream)(Object) testURL.openStream();
            } else {
                input =(InputStream)(Object) new FileInputStream(filePath);
            }
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(input, sw, encoding);
        } finally {
            if (input != null) {
                input.close();
            }
        }
        return sw.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, StringWriter o1, String o2){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class StringWriter {

}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}
