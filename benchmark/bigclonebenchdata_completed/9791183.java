


class c9791183 {
public MyHelperClass IOUtils;
	public MyHelperClass getDownloadThreshhold(){ return null; }
	public MyHelperClass getMimeType(String o0){ return null; }

    private void handleFile(File file, HttpServletRequest request, HttpServletResponse response) throws Exception {
        String filename =(String)(Object) file.getName();
        long filesize =(long)(Object) file.length();
        String mimeType =(String)(Object) getMimeType(filename);
        response.setContentType(mimeType);
        if (filesize > (long)(Object)getDownloadThreshhold()) {
            response.setHeader("Content-Disposition", "attachment; filename=" + filename);
        }
        response.setContentLength((int) filesize);
        ServletOutputStream out =(ServletOutputStream)(Object) response.getOutputStream();
        IOUtils.copy(new FileInputStream(file), out);
        out.flush();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(FileInputStream o0, ServletOutputStream o1){ return null; }}

class File {

public MyHelperClass getName(){ return null; }
	public MyHelperClass length(){ return null; }}

class HttpServletRequest {

}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentLength(int o0){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class ServletOutputStream {

public MyHelperClass flush(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}
