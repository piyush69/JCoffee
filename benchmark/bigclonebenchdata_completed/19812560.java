
import java.io.UncheckedIOException;


class c19812560 {

    public Vocabulary build(String url) {
        HttpGet get = new HttpGet(url);
        try {
            MyHelperClass client = new MyHelperClass();
            HttpResponse response =(HttpResponse)(Object) client.execute(get);
            HttpEntity entity =(HttpEntity)(Object) response.getEntity();
            if (entity != null) {
                InputStream is =(InputStream)(Object) entity.getContent();
                try {
                    Vocabulary tv = build((String)(Object)is);
                    MyHelperClass LOG = new MyHelperClass();
                    LOG.info("Successfully parsed Thesaurus: " + tv.getTitle());
                    return tv;
                } catch (UncheckedIOException e) {
                    MyHelperClass LOG = new MyHelperClass();
                    LOG.error("Unable to parse XML for extension: " + e.getMessage(),(SAXException)(Object) e);
                } finally {
                    is.close();
                }
                entity.consumeContent();
            }
        } catch (Exception e) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.error(e);
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass error(String o0, SAXException o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass error(Exception o0){ return null; }}

class Vocabulary {

public MyHelperClass getTitle(){ return null; }}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }
	public MyHelperClass consumeContent(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}
