


class c1443205 {

    private void redirect(TargetApp app, HttpServletRequest request, HttpServletResponse response) throws IOException {
        URL url = new URL((int)(Object)app.getUrl() + (int)(Object)request.getRequestURI());
        MyHelperClass s_log = new MyHelperClass();
        s_log.debug("Redirecting to " + url);
        URLConnection urlConnection =(URLConnection)(Object) url.openConnection();
        Map fields =(Map)(Object) urlConnection.getHeaderFields();
        for (String key :(String[])(Object) (Object[])(Object)fields.keySet()) {
            StringBuffer values = new StringBuffer();
            boolean comma = false;
            for (String value :(String[])(Object) (Object[])(Object)fields.get(key)) {
                if (comma) {
                    values.append(", ");
                }
                values.append(value);
                comma = true;
            }
            if (key != null) {
                response.setHeader(key, values.toString());
            } else {
                response.setStatus(Integer.parseInt(values.toString().split(" ")[1]));
            }
        }
        InputStream in =(InputStream)(Object) urlConnection.getInputStream();
        try {
            ServletOutputStream out =(ServletOutputStream)(Object) response.getOutputStream();
            byte[] buff = new byte[1024];
            int len;
            while ((len =(int)(Object) in.read(buff)) != -1) {
                out.write(buff, 0, len);
            }
        } finally {
            in.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }}

class TargetApp {

public MyHelperClass getUrl(){ return null; }}

class HttpServletRequest {

public MyHelperClass getRequestURI(){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }
	public MyHelperClass setStatus(int o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(int o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getHeaderFields(){ return null; }}

class Map {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass keySet(){ return null; }}

class List {

}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ServletOutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}
