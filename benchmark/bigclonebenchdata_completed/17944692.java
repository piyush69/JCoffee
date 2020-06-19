


class c17944692 {
public MyHelperClass Util;
	public MyHelperClass RecordedRouteGPXFormatter;

//            @Override
            public void run() {
                try {
                    MyHelperClass recordedGeoPoints = new MyHelperClass();
                    if (!(Boolean)(Object)Util.isSufficienDataForUpload(recordedGeoPoints)) return;
//                    MyHelperClass recordedGeoPoints = new MyHelperClass();
                    final InputStream gpxInputStream =(InputStream)(Object) new ByteArrayInputStream(RecordedRouteGPXFormatter.create(recordedGeoPoints).getBytes());
                    final HttpClient httpClient =(HttpClient)(Object) new DefaultHttpClient();
                    MyHelperClass UPLOADSCRIPT_URL = new MyHelperClass();
                    final HttpPost request = new HttpPost(UPLOADSCRIPT_URL);
                    final MultipartEntity requestEntity = new MultipartEntity();
                    requestEntity.addPart("gpxfile", new InputStreamBody(gpxInputStream, "" + System.currentTimeMillis() + ".gpx"));
                    httpClient.getParams().setBooleanParameter("http.protocol.expect-continue", false);
                    request.setEntity(requestEntity);
                    final HttpResponse response =(HttpResponse)(Object) httpClient.execute(request);
                    final int status =(int)(Object) response.getStatusLine().getStatusCode();
                    MyHelperClass HttpStatus = new MyHelperClass();
                    if (status != (int)(Object)HttpStatus.SC_OK) {
                        MyHelperClass logger = new MyHelperClass();
                        logger.error("GPXUploader", "status != HttpStatus.SC_OK");
                    } else {
                        final Reader r =(Reader)(Object) new InputStreamReader(new BufferedInputStream(response.getEntity().getContent()));
                        final char[] buf = new char[8 * 1024];
                        int read;
                        final StringBuilder sb = new StringBuilder();
                        while ((read =(int)(Object) r.read(buf)) != -1) sb.append(buf, 0, read);
                        MyHelperClass logger = new MyHelperClass();
                        logger.debug("GPXUploader", "Response: " + sb.toString());
                    }
                } catch (final Exception e) {
                }
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
public MyHelperClass getContent(){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass isSufficienDataForUpload(MyHelperClass o0){ return null; }
	public MyHelperClass error(String o0, String o1){ return null; }
	public MyHelperClass setBooleanParameter(String o0, boolean o1){ return null; }
	public MyHelperClass getBytes(){ return null; }
	public MyHelperClass create(MyHelperClass o0){ return null; }
	public MyHelperClass debug(String o0, String o1){ return null; }}

class InputStream {

}

class ByteArrayInputStream {

ByteArrayInputStream(MyHelperClass o0){}
	ByteArrayInputStream(){}}

class HttpClient {

public MyHelperClass getParams(){ return null; }
	public MyHelperClass execute(HttpPost o0){ return null; }}

class DefaultHttpClient {

}

class HttpPost {

HttpPost(MyHelperClass o0){}
	HttpPost(){}
	public MyHelperClass setEntity(MultipartEntity o0){ return null; }}

class MultipartEntity {

public MyHelperClass addPart(String o0, InputStreamBody o1){ return null; }}

class InputStreamBody {

InputStreamBody(){}
	InputStreamBody(InputStream o0, String o1){}}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class Reader {

public MyHelperClass read(char[] o0){ return null; }}

class InputStreamReader {

InputStreamReader(BufferedInputStream o0){}
	InputStreamReader(){}}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}}
