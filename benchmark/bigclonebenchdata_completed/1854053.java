


class c1854053 {

//            @Override
            public void handle(String s, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, int i) throws IOException, ServletException {
                StringBuilder expected;// = new StringBuilder();
                expected = new StringBuilder();
                System.out.println("uri: " + httpServletRequest.getRequestURI());
                MyHelperClass queryString = new MyHelperClass();
                System.out.println("queryString: " + (queryString = httpServletRequest.getQueryString()));
                System.out.println("method: " + httpServletRequest.getMethod());
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(httpServletRequest.getInputStream(), baos);
                String body;// = new String();
                System.out.println("body: " + (body = baos.toString()));
                PrintWriter writer =(PrintWriter)(Object) httpServletResponse.getWriter();
                writer.append("testsvar");
//                MyHelperClass expected = new MyHelperClass();
                expected.append("testsvar");
                Random r = new Random();
                for (int j = 0; j < 10; j++) {
                    int value =(int)(Object) r.nextInt(Integer.MAX_VALUE);
                    writer.append(value + "");
//                    MyHelperClass expected = new MyHelperClass();
                    expected.append(value);
                }
                System.out.println();
                writer.close();
                MyHelperClass HttpServletResponse = new MyHelperClass();
                httpServletResponse.setStatus(HttpServletResponse.SC_OK);
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
public MyHelperClass copy(MyHelperClass o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass append(String o0){ return null; }
	public MyHelperClass append(int o0){ return null; }}

class HttpServletRequest {

public MyHelperClass getMethod(){ return null; }
	public MyHelperClass getQueryString(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getRequestURI(){ return null; }}

class HttpServletResponse {

public MyHelperClass getWriter(){ return null; }
	public MyHelperClass setStatus(MyHelperClass o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class ByteArrayOutputStream {

}

class PrintWriter {

public MyHelperClass append(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class Random {

public MyHelperClass nextInt(int o0){ return null; }}
