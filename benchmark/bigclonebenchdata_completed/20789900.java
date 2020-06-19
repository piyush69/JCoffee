


class c20789900 {

    public void render(HttpServletRequest request, HttpServletResponse response, File file, final Throwable t, final String contentType, final String encoding) throws Exception {
        if (contentType != null) {
            response.setContentType(contentType);
        }
        if (encoding != null) {
            response.setCharacterEncoding(encoding);
        }
        if ((int)(Object)file.length() > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Cannot send file greater than 2GB");
        }
        response.setContentLength((int)(int)(Object) file.length());
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(new FileInputStream(file), response.getOutputStream());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(FileInputStream o0, MyHelperClass o1){ return null; }}

class HttpServletRequest {

}

class HttpServletResponse {

public MyHelperClass setCharacterEncoding(String o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentLength(int o0){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }}

class File {

public MyHelperClass length(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}
