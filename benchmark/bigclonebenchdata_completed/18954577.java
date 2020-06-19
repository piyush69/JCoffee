


class c18954577 {
public static MyHelperClass setResponseFlag(MyHelperClass o0, AndsDoiResponse o1){ return null; }
//public MyHelperClass setResponseFlag(MyHelperClass o0, AndsDoiResponse o1){ return null; }

    private static AndsDoiResponse doiRequest(String serviceUrl, String metaDataXML, String requestType) throws IOException {
        MyHelperClass LOG = new MyHelperClass();
        if ((boolean)(Object)LOG.isDebugEnabled()) {
//            MyHelperClass LOG = new MyHelperClass();
            LOG.debug("Method URL: " + serviceUrl);
            MyHelperClass StringUtils = new MyHelperClass();
            LOG.debug("Metadata XML NULL ?: " + StringUtils.isEmpty(metaDataXML));
//            MyHelperClass LOG = new MyHelperClass();
            LOG.debug("Request Type: " + requestType);
        }
        AndsDoiResponse doiResponse = null;
        OutputStreamWriter wr = null;
        BufferedReader rd = null;
        StringBuffer outputBuffer;
        URL url = new URL(serviceUrl);
        HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        try {
            conn.setDoInput(true);
            if (requestType.equals("POST")) {
                conn.setDoOutput(true);
                wr = new OutputStreamWriter(conn.getOutputStream());
                if (metaDataXML != null) {
                    MyHelperClass URLEncoder = new MyHelperClass();
                    wr.write("xml=" + URLEncoder.encode(metaDataXML, "UTF-8"));
                }
                wr.flush();
            } else {
                conn.setDoOutput(false);
            }
//            MyHelperClass LOG = new MyHelperClass();
            if ((boolean)(Object)LOG.isDebugEnabled()) {
//                MyHelperClass LOG = new MyHelperClass();
                LOG.debug(conn.getResponseCode() + " - " + conn.getResponseMessage());
            }
            outputBuffer = new StringBuffer();
            outputBuffer.append(conn.getResponseMessage() + "\n");
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line =(String)(Object) rd.readLine()) != null) {
                outputBuffer.append(line);
            }
            doiResponse = new AndsDoiResponse();
            doiResponse.setMessage(outputBuffer.toString());
            setResponseFlag(conn.getResponseCode(), doiResponse);
        } catch (Exception e) {
            doiResponse = new AndsDoiResponse();
            outputBuffer = new StringBuffer();
            outputBuffer.append(conn.getResponseMessage() + "\n");
            BufferedReader rde = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            String line;
            while ((line =(String)(Object) rde.readLine()) != null) {
                outputBuffer.append(line);
            }
            doiResponse.setSuccess(false);
            doiResponse.setMessage(outputBuffer.toString());
            rde.close();
        } finally {
            if (wr != null) {
                wr.close();
            }
            if (rd != null) {
                rd.close();
            }
        }
        return doiResponse;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isEmpty(String o0){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }}

class AndsDoiResponse {

public MyHelperClass setSuccess(boolean o0){ return null; }
	public MyHelperClass setMessage(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(String o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass getErrorStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getResponseMessage(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
