


class c4281604 {
public MyHelperClass makePOIRequest(QueryFilter o0){ return null; }
	public MyHelperClass parsePOIResponse(String o0, DirectoryParams o1){ return null; }

    private void executeRequest(OperationContext context) throws java.lang.Throwable {
        long t1 = System.currentTimeMillis();
        DirectoryParams params =(DirectoryParams)(Object) context.getRequestOptions().getDirectoryOptions();
        try {
            String srvCfg =(String)(Object) context.getRequestContext().getApplicationConfiguration().getCatalogConfiguration().getParameters().getValue("openls.directory");
            HashMap poiProperties =(HashMap)(Object) params.getPoiProperties();
            Set keys =(Set)(Object) poiProperties.keySet();
            Iterator iter =(Iterator)(Object) keys.iterator();
            StringBuffer filter = new StringBuffer();
            while ((boolean)(Object)iter.hasNext()) {
                String key =(String)(Object) iter.next();
                QueryFilter queryFilter = new QueryFilter(key, poiProperties.get(key));
                filter.append(makePOIRequest(queryFilter));
            }
            String sUrl = srvCfg + "/query?" + filter.toString();
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.info("REQUEST=\n" + sUrl);
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
            url = null;
            parsePOIResponse(sResponse, params);
        } catch (Exception p_e) {
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.severe("Throwing exception" + p_e.getMessage());
            throw p_e;
        } finally {
            long t2 = System.currentTimeMillis();
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.info("PERFORMANCE: " + (t2 - t1) + " ms spent performing service");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass severe(String o0){ return null; }
	public MyHelperClass getValue(String o0){ return null; }
	public MyHelperClass getDirectoryOptions(){ return null; }
	public MyHelperClass getParameters(){ return null; }
	public MyHelperClass getApplicationConfiguration(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getCatalogConfiguration(){ return null; }}

class OperationContext {

public MyHelperClass getRequestContext(){ return null; }
	public MyHelperClass getRequestOptions(){ return null; }}

class DirectoryParams {

public MyHelperClass getPoiProperties(){ return null; }}

class HashMap {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass keySet(){ return null; }}

class Set {

public MyHelperClass iterator(){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class QueryFilter {

QueryFilter(){}
	QueryFilter(String o0, MyHelperClass o1){}}

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
