
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c1508162 {

    public void conReMail(MailObject mail) throws NetworkException, ContentException {
        MyHelperClass HttpConfig = new MyHelperClass();
        HttpClient client =(HttpClient)(Object) HttpConfig.newInstance();
//        MyHelperClass HttpConfig = new MyHelperClass();
        String url =(int)(Object) HttpConfig.bbsURL() +(String)(Object) (int)(Object)HttpConfig.BBS_MAIL_RECON + (int)(Object)mail.getNumber();
        HttpGet get = new HttpGet(url);
        try {
            HttpResponse response =(HttpResponse)(Object) client.execute(get);
            HttpEntity entity =(HttpEntity)(Object) response.getEntity();
            MyHelperClass HTTPUtil = new MyHelperClass();
            if ((boolean)(Object)HTTPUtil.isXmlContentType(response)) {
                MyHelperClass XmlOperator = new MyHelperClass();
                Document doc =(Document)(Object) XmlOperator.readDocument(entity.getContent());
                MyHelperClass BBSBodyParseHelper = new MyHelperClass();
                BBSBodyParseHelper.parseMailReContent(doc, mail);
            } else {
                MyHelperClass BBSBodyParseHelper = new MyHelperClass();
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
public MyHelperClass BBS_MAIL_RECON;
public MyHelperClass parseMailReContent(Document o0, MailObject o1){ return null; }
	public MyHelperClass isXmlContentType(HttpResponse o0){ return null; }
	public MyHelperClass readDocument(MyHelperClass o0){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass bbsURL(){ return null; }
	public MyHelperClass parseFailMsg(HttpEntity o0){ return null; }}

class MailObject {

public MyHelperClass getNumber(){ return null; }}

class NetworkException extends Exception{
	public NetworkException(String errorMessage) { super(errorMessage); }
}

class ContentException extends Exception{
	public ContentException(String errorMessage) { super(errorMessage); }
}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class Document {

}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
