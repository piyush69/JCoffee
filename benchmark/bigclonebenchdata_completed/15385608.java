
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c15385608 {

    public boolean setFavBoard(List list) throws NetworkException, ContentException {
        MyHelperClass HttpConfig = new MyHelperClass();
        HttpClient client =(HttpClient)(Object) HttpConfig.newInstance();
//        MyHelperClass HttpConfig = new MyHelperClass();
        HttpPost post = new HttpPost((int)(Object)HttpConfig.bbsURL() + (int)(Object)HttpConfig.BBS_FAV_SETTING);
        List nvps =(List)(Object) new ArrayList();
        for (BoardObject board :(BoardObject[])(Object) (Object[])(Object)list) nvps.add(new BasicNameValuePair(board.getId(), "on"));
        try {
            MyHelperClass BBSBodyParseHelper = new MyHelperClass();
            post.setEntity(new UrlEncodedFormEntity(nvps, BBSBodyParseHelper.BBS_CHARSET));
            HttpResponse response =(HttpResponse)(Object) client.execute(post);
            HttpEntity entity =(HttpEntity)(Object) response.getEntity();
            MyHelperClass HTTPUtil = new MyHelperClass();
            if ((Boolean)(Object)HTTPUtil.isHttp200(response) && (Boolean)(Object)HTTPUtil.isXmlContentType(response)) {
//                MyHelperClass HTTPUtil = new MyHelperClass();
                HTTPUtil.consume(response.getEntity());
                return true;
            } else {
//                MyHelperClass BBSBodyParseHelper = new MyHelperClass();
                String msg =(String)(Object) BBSBodyParseHelper.parseFailMsg(entity);
                throw new ContentException(msg);
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            throw new NetworkException((String)(Object)e);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw new NetworkException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BBS_CHARSET;
	public MyHelperClass BBS_FAV_SETTING;
public MyHelperClass isXmlContentType(HttpResponse o0){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass bbsURL(){ return null; }
	public MyHelperClass consume(MyHelperClass o0){ return null; }
	public MyHelperClass isHttp200(HttpResponse o0){ return null; }
	public MyHelperClass parseFailMsg(HttpEntity o0){ return null; }}

class List {

public MyHelperClass add(BasicNameValuePair o0){ return null; }}

class BoardObject {

public MyHelperClass getId(){ return null; }}

class NetworkException extends Exception{
	public NetworkException(String errorMessage) { super(errorMessage); }
}

class ContentException extends Exception{
	public ContentException(String errorMessage) { super(errorMessage); }
}

class HttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class HttpPost {

HttpPost(int o0){}
	HttpPost(){}
	public MyHelperClass setEntity(UrlEncodedFormEntity o0){ return null; }}

class NameValuePair {

}

class ArrayList {

}

class BasicNameValuePair {

BasicNameValuePair(){}
	BasicNameValuePair(MyHelperClass o0, String o1){}}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(){}
	UrlEncodedFormEntity(List o0, MyHelperClass o1){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
