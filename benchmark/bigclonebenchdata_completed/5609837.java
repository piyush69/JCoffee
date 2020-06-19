


class c5609837 {
public MyHelperClass setPostSatus(MyHelperClass o0){ return null; }
public MyHelperClass logger;

    public String postXmlRequest(String url, String data) {
        DefaultHttpClient httpclient = new DefaultHttpClient();
        HttpPost httppost = new HttpPost(url);
        StringBuffer responseStr = new StringBuffer();
        try {
            System.out.println(data);
            logger.info("Request:\n" + data);
            StringEntity reqEntity = new StringEntity(data, "UTF-8");
            reqEntity.setContentType("text/xml");
            httppost.setEntity(reqEntity);
            HttpResponse response =(HttpResponse)(Object) httpclient.execute(httppost);
            HttpEntity entity =(HttpEntity)(Object) response.getEntity();
            this.setPostSatus(response.getStatusLine().getStatusCode());
            BufferedReader reader = new BufferedReader(new InputStreamReader(entity.getContent(), "UTF-8"));
            String line = null;
            while ((line =(String)(Object) reader.readLine()) != null) {
                responseStr.append(line + "\n");
            }
            if (entity != null) {
                entity.consumeContent();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(responseStr);
        logger.info("Response:\n" + responseStr);
        return responseStr.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass info(String o0){ return null; }}

class DefaultHttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass setEntity(StringEntity o0){ return null; }}

class StringEntity {

StringEntity(String o0, String o1){}
	StringEntity(){}
	public MyHelperClass setContentType(String o0){ return null; }}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }
	public MyHelperClass consumeContent(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}
