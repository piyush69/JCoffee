import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19963410 {
public MyHelperClass FORM_NUMBER;
public MyHelperClass ref;
	public MyHelperClass ImageIO;
	public MyHelperClass FORM_CAPTCHA;
	public MyHelperClass FORM_TEXT;
	public MyHelperClass Result;
	public MyHelperClass JOptionPane;
	public MyHelperClass FORM_AGB;
	public MyHelperClass getPrefixPart(String o0){ return null; }
	public MyHelperClass getNumberPart(String o0){ return null; }

//    @Override
    public Result sendSMS(String number, String text, Proxy proxy)  throws Throwable {
        try {
            DefaultHttpClient client = new DefaultHttpClient();
            if (proxy != null) {
                HttpHost prox = new HttpHost(proxy.host, proxy.port);
                MyHelperClass ConnRoutePNames = new MyHelperClass();
                client.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, prox);
            }
            String target = "http://www.smsbilliger.de/free-sms.html";
            HttpGet get = new HttpGet(target);
            HttpResponse response =(HttpResponse)(Object) client.execute(get);
            HttpEntity e =(HttpEntity)(Object) response.getEntity();
            MyHelperClass ref = new MyHelperClass();
            Document doc =(Document)(Object) ref.getDocumentFromInputStream(e.getContent());
//            MyHelperClass ref = new MyHelperClass();
            List<Element> forms =(List<Element>)(Object) ref.selectByXPathOnDocument(doc, "//<ns>FORM", doc.getRootElement().getNamespaceURI());
            MyHelperClass Result = new MyHelperClass();
            if (forms.size() == 0) return new Result(Result.SMS_LIMIT_REACHED);
            Element form = forms.get(0);
            List<NameValuePair> formparas = new ArrayList<NameValuePair>();
//            MyHelperClass ref = new MyHelperClass();
            List<Element> inputs =(List<Element>)(Object) ref.selectByXPathOnElement(form, "//<ns>INPUT|//<ns>TEXTAREA|//<ns>SELECT", form.getNamespaceURI());
            Iterator<Element> it = inputs.iterator();
            while (it.hasNext()) {
                Element input = it.next();
                String type =(String)(Object) input.getAttributeValue("type");
                String name =(String)(Object) input.getAttributeValue("name");
                String value =(String)(Object) input.getAttributeValue("value");
                if (type != null && type.equals("hidden")) {
                    formparas.add((NameValuePair)(Object)new BasicNameValuePair(name, value));
                MyHelperClass FORM_NUMBER = new MyHelperClass();
                } else if (name != null && name.equals(FORM_NUMBER)) {
                    formparas.add((NameValuePair)(Object)new BasicNameValuePair(name, this.getNumberPart(number)));
                } else if (name != null && name.equals(FORM_TEXT)) {
                    formparas.add((NameValuePair)(Object)new BasicNameValuePair(name, text));
                } else if (name != null && name.equals(FORM_AGB)) {
                    formparas.add((NameValuePair)(Object)new BasicNameValuePair(name, "true"));
                }
            }
            formparas.add((NameValuePair)(Object)new BasicNameValuePair("dialing_code", this.getPrefixPart(number)));
            formparas.add((NameValuePair)(Object)new BasicNameValuePair("no_schedule", "yes"));
            List<Element> captchas =(List<Element>)(Object) ref.selectByXPathOnDocument(doc, "//<ns>IMG[@id='code_img']", doc.getRootElement().getNamespaceURI());
            Element captcha = captchas.get(0);
            String url = "http://www.smsbilliger.de/" + captcha.getAttributeValue("src");
            HttpGet imgcall = new HttpGet(url);
            HttpResponse imgres =(HttpResponse)(Object) client.execute(imgcall);
            HttpEntity imge =(HttpEntity)(Object) imgres.getEntity();
            BufferedImage img =(BufferedImage)(Object) ImageIO.read(imge.getContent());
            imge.getContent().close();
            Icon icon =(Icon)(Object) new ImageIcon(img);
            String result = (String)(String)(Object) JOptionPane.showInputDialog(null, "Bitte Captcha eingeben:", "Captcha", JOptionPane.INFORMATION_MESSAGE, icon, null, "");
            formparas.add((NameValuePair)(Object)new BasicNameValuePair(FORM_CAPTCHA, result));
            UrlEncodedFormEntity entity = new UrlEncodedFormEntity(formparas, "UTF-8");
            HttpPost post = new HttpPost(target);
            post.setEntity(entity);
            response =(HttpResponse)(Object) client.execute(post);
            e =(HttpEntity)(Object) response.getEntity();
            doc =(Document)(Object) ref.getDocumentFromInputStream(e.getContent());
            List<Element> fonts =(List<Element>)(Object) ref.selectByXPathOnDocument(doc, "//<ns>H3", doc.getRootElement().getNamespaceURI());
            Iterator<Element> it2 = fonts.iterator();
            while (it2.hasNext()) {
                Element font = it2.next();
                String txt =(String)(Object) font.getText();
                if (txt.contains("Die SMS wurde erfolgreich versendet.")) {
                    return new Result(Result.SMS_SEND);
                }
            }
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (ArrayStoreException e) {
            e.printStackTrace();
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        return new Result(Result.UNKNOWN_ERROR);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SMS_SEND;
	public MyHelperClass SMS_LIMIT_REACHED;
	public MyHelperClass DEFAULT_PROXY;
	public MyHelperClass INFORMATION_MESSAGE;
	public MyHelperClass UNKNOWN_ERROR;
public MyHelperClass setParameter(MyHelperClass o0, HttpHost o1){ return null; }
	public MyHelperClass showInputDialog(Object o0, String o1, String o2, MyHelperClass o3, Icon o4, Object o5, String o6){ return null; }
	public MyHelperClass getNamespaceURI(){ return null; }
	public MyHelperClass selectByXPathOnDocument(Document o0, String o1, MyHelperClass o2){ return null; }
	public MyHelperClass getDocumentFromInputStream(MyHelperClass o0){ return null; }
	public MyHelperClass read(MyHelperClass o0){ return null; }
	public MyHelperClass selectByXPathOnElement(Element o0, String o1, MyHelperClass o2){ return null; }
	public MyHelperClass close(){ return null; }}

class Result {

Result(MyHelperClass o0){}
	Result(){}}

class DefaultHttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass getParams(){ return null; }
	public MyHelperClass execute(HttpPost o0){ return null; }}

class HttpHost {

HttpHost(MyHelperClass o0, MyHelperClass o1){}
	HttpHost(){}}

class Proxy {
public MyHelperClass host;
	public MyHelperClass port;
}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class Document {

public MyHelperClass getRootElement(){ return null; }}

class Element {

public MyHelperClass getNamespaceURI(){ return null; }
	public MyHelperClass getAttributeValue(String o0){ return null; }
	public MyHelperClass getText(){ return null; }}

class NameValuePair {

}

class BasicNameValuePair {

BasicNameValuePair(String o0, String o1){}
	BasicNameValuePair(MyHelperClass o0, String o1){}
	BasicNameValuePair(String o0, MyHelperClass o1){}
	BasicNameValuePair(){}}

class BufferedImage {

}

class Icon {

}

class ImageIcon {

ImageIcon(){}
	ImageIcon(BufferedImage o0){}}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(List<NameValuePair> o0, String o1){}
	UrlEncodedFormEntity(){}}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass setEntity(UrlEncodedFormEntity o0){ return null; }}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class JDOMException extends Exception{
	public JDOMException(String errorMessage) { super(errorMessage); }
}
