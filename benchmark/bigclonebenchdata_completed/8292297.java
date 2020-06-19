


class c8292297 {
public MyHelperClass LOGGER;

    public void sendContent(OutputStream out, Range range, Map params, String contentType) throws IOException {
        MyHelperClass file = new MyHelperClass();
        LOGGER.debug("GET REQUEST OR RESPONSE - Send content: " + file.getAbsolutePath());
        FileInputStream in = null;
        try {
//            MyHelperClass file = new MyHelperClass();
            in = new FileInputStream(file);
            MyHelperClass IOUtils = new MyHelperClass();
            int bytes =(int)(Object) IOUtils.copy(in, out);
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.debug("wrote bytes:  " + bytes);
            out.flush();
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(in);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(FileInputStream o0, OutputStream o1){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass closeQuietly(FileInputStream o0){ return null; }}

class OutputStream {

public MyHelperClass flush(){ return null; }}

class Range {

}

class Map {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}}
