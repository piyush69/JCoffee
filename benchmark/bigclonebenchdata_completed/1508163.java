
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c1508163 {

    public boolean sendMail(MailObject mail, boolean backup) throws NetworkException, ContentException {
        MyHelperClass HttpConfig = new MyHelperClass();
        HttpClient client =(HttpClient)(Object) HttpConfig.newInstance();
//        MyHelperClass HttpConfig = new MyHelperClass();
        HttpPost post = new HttpPost((int)(Object)HttpConfig.bbsURL() + (int)(Object)HttpConfig.BBS_MAIL_SEND);
        List nvps =(List)(Object) new ArrayList();
//        MyHelperClass HttpConfig = new MyHelperClass();
        nvps.add(new BasicNameValuePair(HttpConfig.BBS_MAIL_SEND_REF_PARAM_NAME, "pstmail"));
//        MyHelperClass HttpConfig = new MyHelperClass();
        nvps.add(new BasicNameValuePair(HttpConfig.BBS_MAIL_SEND_RECV_PARAM_NAME, mail.getSender()));
//        MyHelperClass HttpConfig = new MyHelperClass();
        nvps.add(new BasicNameValuePair(HttpConfig.BBS_MAIL_SEND_TITLE_PARAM_NAME, mail.getTitle()));
//        MyHelperClass HttpConfig = new MyHelperClass();
        nvps.add(new BasicNameValuePair(HttpConfig.BBS_MAIL_SEND_CONTENT_PARAM_NAME, mail.getContent()));
//        MyHelperClass HttpConfig = new MyHelperClass();
        if (backup) nvps.add(new BasicNameValuePair(HttpConfig.BBS_MAIL_SEND_BACKUP_PARAM_NAME, "backup"));
        try {
            MyHelperClass BBSBodyParseHelper = new MyHelperClass();
            post.setEntity(new UrlEncodedFormEntity(nvps, BBSBodyParseHelper.BBS_CHARSET));
            HttpResponse response =(HttpResponse)(Object) client.execute(post);
            HttpEntity entity =(HttpEntity)(Object) response.getEntity();
            MyHelperClass HTTPUtil = new MyHelperClass();
            if ((boolean)(Object)HTTPUtil.isHttp200(response)) {
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
public MyHelperClass BBS_MAIL_SEND;
	public MyHelperClass BBS_CHARSET;
	public MyHelperClass BBS_MAIL_SEND_RECV_PARAM_NAME;
	public MyHelperClass BBS_MAIL_SEND_TITLE_PARAM_NAME;
	public MyHelperClass BBS_MAIL_SEND_BACKUP_PARAM_NAME;
	public MyHelperClass BBS_MAIL_SEND_CONTENT_PARAM_NAME;
	public MyHelperClass BBS_MAIL_SEND_REF_PARAM_NAME;
public MyHelperClass newInstance(){ return null; }
	public MyHelperClass bbsURL(){ return null; }
	public MyHelperClass consume(MyHelperClass o0){ return null; }
	public MyHelperClass isHttp200(HttpResponse o0){ return null; }
	public MyHelperClass parseFailMsg(HttpEntity o0){ return null; }}

class MailObject {

public MyHelperClass getSender(){ return null; }
	public MyHelperClass getTitle(){ return null; }
	public MyHelperClass getContent(){ return null; }}

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

class List {

public MyHelperClass add(BasicNameValuePair o0){ return null; }}

class NameValuePair {

}

class ArrayList {

}

class BasicNameValuePair {

BasicNameValuePair(){}
	BasicNameValuePair(MyHelperClass o0, String o1){}
	BasicNameValuePair(MyHelperClass o0, MyHelperClass o1){}}

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
