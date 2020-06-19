


class c1708100 {

    private void sendFile(File file, HttpExchange response) throws IOException {
        MyHelperClass FileUploadBase = new MyHelperClass();
        response.getResponseHeaders().add(FileUploadBase.CONTENT_LENGTH, Long.toString((long)(Object)file.length()));
        InputStream inputStream = null;
        try {
            inputStream =(InputStream)(Object) new FileInputStream(file);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(inputStream, response.getResponseBody());
        } catch (Exception exception) {
            throw new IOException("error sending file", exception);
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(inputStream);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CONTENT_LENGTH;
public MyHelperClass add(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass copy(InputStream o0, MyHelperClass o1){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }}

class File {

public MyHelperClass length(){ return null; }}

class HttpExchange {

public MyHelperClass getResponseBody(){ return null; }
	public MyHelperClass getResponseHeaders(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
	IOException(String o0, Exception o1){}
	IOException(){}
}

class InputStream {

}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}
