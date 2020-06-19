


class c1949890 {

//        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
            req.setCharacterEncoding("UTF-8");
            resp.setContentType(req.getContentType());
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(req.getReader(), resp.getWriter());
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(MyHelperClass o0, MyHelperClass o1){ return null; }}

class HttpServletRequest {

public MyHelperClass setCharacterEncoding(String o0){ return null; }
	public MyHelperClass getReader(){ return null; }
	public MyHelperClass getContentType(){ return null; }}

class HttpServletResponse {

public MyHelperClass getWriter(){ return null; }
	public MyHelperClass setContentType(MyHelperClass o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
