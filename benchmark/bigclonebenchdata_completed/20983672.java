


class c20983672 {

    public void sendResponse(DjdocRequest req, HttpServletResponse res) throws IOException {
        File file = (File)(File)(Object) req.getResult();
        InputStream in = null;
        try {
            in =(InputStream)(Object) new FileInputStream(file);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(in, res.getOutputStream());
        } finally {
            if (in != null) {
                in.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, MyHelperClass o1){ return null; }}

class DjdocRequest {

public MyHelperClass getResult(){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}
