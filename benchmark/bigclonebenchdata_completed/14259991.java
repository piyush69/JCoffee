


class c14259991 {
public MyHelperClass storageUrlString;
	public MyHelperClass quotaBeans;
	public MyHelperClass HttpURLConnection;
	public MyHelperClass validParameters(){ return null; }

    private void sendLocal() throws Exception {
        if ((boolean)(Object)validParameters()) {
            URL url = new URL(storageUrlString);
            HttpURLConnection httpURLConnection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            RequestUtils requestUtils = new RequestUtils();
            requestUtils.preRequestAddParameter("senderObj", "QuotaSender");
            requestUtils.preRequestAddParameter("beanNumbers", new String().valueOf(quotaBeans.size()));
            for (int vPos = 0; vPos < (int)(Object)quotaBeans.size(); vPos++) {
                QuotaBean bean = (QuotaBean)(QuotaBean)(Object) quotaBeans.get(vPos);
                requestUtils.preRequestAddParameter("" + vPos + "#portalID",(String)(Object) bean.getPortalID());
                requestUtils.preRequestAddParameter("" + vPos + "#userID",(String)(Object) bean.getUserID());
                requestUtils.preRequestAddParameter("" + vPos + "#workflowID",(String)(Object) bean.getWorkflowID());
                requestUtils.preRequestAddParameter("" + vPos + "#runtimeID",(String)(Object) bean.getRuntimeID());
                requestUtils.preRequestAddParameter("" + vPos + "#plussQuotaSize", bean.getPlussQuotaSize().toString());
            }
            requestUtils.preRequestAddFile("zipFileName", "dummyZipFileName.zip");
            requestUtils.createPostRequest();
            httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + requestUtils.getBoundary());
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            try {
                httpURLConnection.connect();
                OutputStream out =(OutputStream)(Object) httpURLConnection.getOutputStream();
                byte[] preBytes =(byte[])(Object) requestUtils.getPreRequestStringBytes();
                out.write(preBytes);
                out.flush();
                out.write(new String("dummyFile").getBytes());
                byte[] postBytes =(byte[])(Object) requestUtils.getPostRequestStringBytes();
                out.write(postBytes);
                out.flush();
                out.close();
                BufferedReader in = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                in.readLine();
                in.close();
                if (HttpURLConnection.HTTP_OK != httpURLConnection.getResponseCode()) {
                    throw new Exception("response not HTTP_OK !");
                }
            } catch (Exception e) {
                e.printStackTrace();
                throw new Exception("Cannot connect to: " + storageUrlString, e);
            }
        } else {
            throw new Exception("Not valid parameters: quotaBeans !");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_OK;
public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class RequestUtils {

public MyHelperClass preRequestAddFile(String o0, String o1){ return null; }
	public MyHelperClass createPostRequest(){ return null; }
	public MyHelperClass getPostRequestStringBytes(){ return null; }
	public MyHelperClass getBoundary(){ return null; }
	public MyHelperClass preRequestAddParameter(String o0, String o1){ return null; }
	public MyHelperClass getPreRequestStringBytes(){ return null; }}

class QuotaBean {

public MyHelperClass getPortalID(){ return null; }
	public MyHelperClass getPlussQuotaSize(){ return null; }
	public MyHelperClass getWorkflowID(){ return null; }
	public MyHelperClass getRuntimeID(){ return null; }
	public MyHelperClass getUserID(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
