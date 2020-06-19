


class c2090332 {
public MyHelperClass IOUtils;
	public MyHelperClass getServletContext(){ return null; }
	public MyHelperClass tryLoadFile(String o0){ return null; }

    private void doProcess(HttpServletRequest request, HttpServletResponse resp) throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        Analyzer analyzer = new Analyzer();
        ServletContext context =(ServletContext)(Object) getServletContext();
        String xml =(String)(Object) context.getRealPath("data\\log.xml");
        String xsd =(String)(Object) context.getRealPath("data\\log.xsd");
        String grs =(String)(Object) context.getRealPath("reports\\" + request.getParameter("type") + ".grs");
        String pdf =(String)(Object) context.getRealPath("html\\report.pdf");
        System.out.println("omg: " + request.getParameter("type"));
        System.out.println("omg: " + request.getParameter("pc"));
        int pcount = Integer.parseInt((String)(Object)request.getParameter("pc"));
        String[] params = new String[pcount];
        for (int i = 0; i < pcount; i++) {
            params[i] =(String)(Object) request.getParameter("p" + i);
        }
        try {
            analyzer.generateReport(xml, xsd, grs, pdf, params);
        } catch (Exception e) {
            e.printStackTrace();
        }
        File file = new File(pdf);
        byte[] bs =(byte[])(Object) tryLoadFile(pdf);
        if (bs == null) throw new NullPointerException();
        resp.setHeader("Content-Disposition", " filename=\"" + file.getName() + "\";");
        resp.setContentLength(bs.length);
        InputStream is =(InputStream)(Object) new ByteArrayInputStream(bs);
        IOUtils.copy(is, resp.getOutputStream());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, MyHelperClass o1){ return null; }}

class HttpServletRequest {

public MyHelperClass getParameter(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentLength(int o0){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Analyzer {

public MyHelperClass generateReport(String o0, String o1, String o2, String o3, String[] o4){ return null; }}

class ServletContext {

public MyHelperClass getRealPath(String o0){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getName(){ return null; }}

class InputStream {

}

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(byte[] o0){}}
