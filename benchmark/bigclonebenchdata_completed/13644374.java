


class c13644374 {
public MyHelperClass EntityUtils;
	public MyHelperClass getHttpClient(){ return null; }

    public byte[] getBytesFromUrl(String url) {
        try {
            HttpGet get = new HttpGet(url);
            HttpResponse response =(HttpResponse)(Object) this.getHttpClient().execute(get);
            HttpEntity entity =(HttpEntity)(Object) response.getEntity();
            if (entity == null) {
                throw new RuntimeException("response body was empty");
            }
            return(byte[])(Object) EntityUtils.toByteArray(entity);
        } catch (RuntimeException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass toByteArray(HttpEntity o0){ return null; }}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

}
