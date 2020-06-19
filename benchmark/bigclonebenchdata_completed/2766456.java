


class c2766456 {

    private void renderScript(PhaseEvent event) {
        MyHelperClass SCRIPT_RESOURCE_NAME = new MyHelperClass();
        URL url =(URL)(Object) AjaxPhaseListener.class.getResource((String)(Object)SCRIPT_RESOURCE_NAME);
        URLConnection conn = null;
        InputStream stream = null;
        BufferedReader bufReader = null;
        HttpServletResponse response = (HttpServletResponse)(HttpServletResponse)(Object) event.getFacesContext().getExternalContext().getResponse();
        OutputStreamWriter outWriter = null;
        String curLine = null;
        try {
            outWriter = new OutputStreamWriter(response.getOutputStream(), response.getCharacterEncoding());
            conn =(URLConnection)(Object) url.openConnection();
            conn.setUseCaches(false);
            stream =(InputStream)(Object) conn.getInputStream();
            bufReader = new BufferedReader(new InputStreamReader(stream));
            response.setContentType("text/javascript");
            response.setStatus(200);
            while (null != (curLine =(String)(Object) bufReader.readLine())) {
                outWriter.write(curLine + "\n");
            }
            outWriter.flush();
            outWriter.close();
            event.getFacesContext().responseComplete();
        } catch (Exception e) {
            String message = null;
            message = "Can't load script file:" + url.toExternalForm();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass responseComplete(){ return null; }
	public MyHelperClass getExternalContext(){ return null; }
	public MyHelperClass getResponse(){ return null; }}

class PhaseEvent {

public MyHelperClass getFacesContext(){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass toExternalForm(){ return null; }}

class URLConnection {

public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass setStatus(int o0){ return null; }
	public MyHelperClass getCharacterEncoding(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0, MyHelperClass o1){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(String o0){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class AjaxPhaseListener {

}
