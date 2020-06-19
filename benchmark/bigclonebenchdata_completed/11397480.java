


class c11397480 {
public MyHelperClass getContentType(){ return null; }

    public void render(Map map, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        MyHelperClass OUTPUT_BYTE_ARRAY_INITIAL_SIZE = new MyHelperClass();
        ByteArrayOutputStream baos = new ByteArrayOutputStream(OUTPUT_BYTE_ARRAY_INITIAL_SIZE);
        File file = (File)(File)(Object) map.get("targetFile");
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(new FileInputStream(file), baos);
        httpServletResponse.setContentType(getContentType());
        httpServletResponse.setContentLength(baos.size());
        httpServletResponse.addHeader("Content-disposition", "attachment; filename=" + file.getName());
        ServletOutputStream out =(ServletOutputStream)(Object) httpServletResponse.getOutputStream();
        baos.writeTo(out);
        out.flush();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(FileInputStream o0, ByteArrayOutputStream o1){ return null; }}

class Map {

public MyHelperClass get(String o0){ return null; }}

class HttpServletRequest {

}

class HttpServletResponse {

public MyHelperClass addHeader(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentLength(MyHelperClass o0){ return null; }
	public MyHelperClass setContentType(MyHelperClass o0){ return null; }}

class ByteArrayOutputStream {

ByteArrayOutputStream(MyHelperClass o0){}
	ByteArrayOutputStream(){}
	public MyHelperClass writeTo(ServletOutputStream o0){ return null; }
	public MyHelperClass size(){ return null; }}

class File {

public MyHelperClass getName(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class ServletOutputStream {

public MyHelperClass flush(){ return null; }}
