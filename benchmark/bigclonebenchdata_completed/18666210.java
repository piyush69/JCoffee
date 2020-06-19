


class c18666210 {
public MyHelperClass parseResponse(GetPortrayMapCapabilitiesParams o0, String o1){ return null; }

    public void executeRequest(OperationContext context) throws Throwable {
        long t1 = System.currentTimeMillis();
        GetPortrayMapCapabilitiesParams params =(GetPortrayMapCapabilitiesParams)(Object) context.getRequestOptions().getGetPortrayMapCapabilitiesOptions();
        String srvCfg =(String)(Object) context.getRequestContext().getApplicationConfiguration().getCatalogConfiguration().getParameters().getValue("openls.portrayMap");
        String sUrl = srvCfg + "?f=json&pretty=true";
        URL url = new URL(sUrl);
        URLConnection conn =(URLConnection)(Object) url.openConnection();
        String line = "";
        String sResponse = "";
        InputStream is =(InputStream)(Object) conn.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader rd = new BufferedReader(isr);
        while ((line =(String)(Object) rd.readLine()) != null) {
            sResponse += line;
        }
        rd.close();
        parseResponse(params, sResponse);
        long t2 = System.currentTimeMillis();
        MyHelperClass LOGGER = new MyHelperClass();
        LOGGER.info("PERFORMANCE: " + (t2 - t1) + " ms spent performing service");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getValue(String o0){ return null; }
	public MyHelperClass getCatalogConfiguration(){ return null; }
	public MyHelperClass getParameters(){ return null; }
	public MyHelperClass getApplicationConfiguration(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getGetPortrayMapCapabilitiesOptions(){ return null; }}

class OperationContext {

public MyHelperClass getRequestContext(){ return null; }
	public MyHelperClass getRequestOptions(){ return null; }}

class GetPortrayMapCapabilitiesParams {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}
