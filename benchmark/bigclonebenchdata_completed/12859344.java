


class c12859344 {

    private void sendFile(File file, HttpServletResponse response) throws IOException {
        response.setContentLength((int)(int)(Object) file.length());
        InputStream inputStream = null;
        try {
            inputStream =(InputStream)(Object) new FileInputStream(file);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(inputStream, response.getOutputStream());
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(inputStream);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, MyHelperClass o1){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }}

class File {

public MyHelperClass length(){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentLength(int o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}
