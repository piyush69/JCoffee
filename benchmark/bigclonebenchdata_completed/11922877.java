


class c11922877 {

    private void chooseGame(DefaultHttpClient httpclient) throws IOException, ClientProtocolException {
        MyHelperClass Constants = new MyHelperClass();
        HttpGet httpget = new HttpGet(Constants.STRATEGICDOMINATION_URL + "/gameboard.cgi?gameid=" + 1687);
        HttpResponse response =(HttpResponse)(Object) httpclient.execute(httpget);
        HttpEntity entity =(HttpEntity)(Object) response.getEntity();
        System.out.println("cg form get: " + response.getStatusLine());
        if (entity != null) {
            InputStream inStream =(InputStream)(Object) entity.getContent();
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(inStream,(PrintStream)(Object) System.out);
        }
        System.out.println("cg set of cookies:");
        List cookies =(List)(Object) httpclient.getCookieStore().getCookies();
        if ((boolean)(Object)cookies.isEmpty()) {
            System.out.println("None");
        } else {
            for (int i = 0; i < (int)(Object)cookies.size(); i++) {
                System.out.println("- " + cookies.get(i).toString());
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass STRATEGICDOMINATION_URL;
public MyHelperClass getCookies(){ return null; }
	public MyHelperClass copy(InputStream o0, PrintStream o1){ return null; }}

class DefaultHttpClient {

public MyHelperClass getCookieStore(){ return null; }
	public MyHelperClass execute(HttpGet o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class InputStream {

}

class List {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass isEmpty(){ return null; }}

class Cookie {

}

class PrintStream {

}
