


class c4303376 {
public MyHelperClass IOUtils;
	public MyHelperClass getServletContext(){ return null; }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MyHelperClass StringUtils = new MyHelperClass();
        String[] path =(String[])(Object) StringUtils.split(request.getRequestURI(), "/");
        String file = path[path.length - 1];
        MyHelperClass pathToImages = new MyHelperClass();
        File f = new File(pathToImages + "/" + file);
        response.setContentType(getServletContext().getMimeType(f.getName()));
        FileInputStream fis = new FileInputStream(f);
        IOUtils.copy(fis, response.getOutputStream());
        fis.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass split(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass copy(FileInputStream o0, MyHelperClass o1){ return null; }
	public MyHelperClass getMimeType(MyHelperClass o0){ return null; }}

class HttpServletRequest {

public MyHelperClass getRequestURI(){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentType(MyHelperClass o0){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getName(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }}
