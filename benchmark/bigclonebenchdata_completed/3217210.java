


class c3217210 {

        private boolean request(URI uri, Controller controller, String login, String password) {
            SSLHttpClient client = new SSLHttpClient();
            client.getCredentialsProvider().setCredentials(new AuthScope(uri.getHost(), uri.getPort()), new UsernamePasswordCredentials(login, password));
            HttpGet get = new HttpGet(uri);
            get.addHeader("Accept", "application/xml");
            try {
                HttpResponse response =(HttpResponse)(Object) client.execute(get);
                int code =(int)(Object) response.getStatusLine().getStatusCode();
                MyHelperClass HttpStatus = new MyHelperClass();
                if (code == (int)(Object)HttpStatus.SC_OK) {
                    final InputStream is =(InputStream)(Object) response.getEntity().getContent();
                    MyHelperClass XmlPullParserFactory = new MyHelperClass();
                    final XmlPullParserFactory factory =(XmlPullParserFactory)(Object) XmlPullParserFactory.newInstance();
                    factory.setNamespaceAware(true);
                    final XmlPullParser parser =(XmlPullParser)(Object) factory.newPullParser();
                    parser.setInput(is, null);
                    MyHelperClass XmlPullParser = new MyHelperClass();
                    while (parser.next() != XmlPullParser.END_DOCUMENT && !(Boolean)(Object)controller.stopped()) {
//                        MyHelperClass XmlPullParser = new MyHelperClass();
                        if (parser.getEventType() == XmlPullParser.START_TAG) {
                            String name =(String)(Object) parser.getName();
                            MyHelperClass mEntity = new MyHelperClass();
                            if (mEntity.equals(name)) {
                                String id =(String)(Object) parser.getAttributeValue(null, "id");
                                if (id != null) {
                                    Item item = new Item(id, parser.nextText());
                                    controller.receiveItem(item);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                controller.error();
                return false;
            }
            return true;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass START_TAG;
	public MyHelperClass SC_OK;
	public MyHelperClass END_DOCUMENT;
public MyHelperClass getContent(){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass setCredentials(AuthScope o0, UsernamePasswordCredentials o1){ return null; }}

class URI {

public MyHelperClass getHost(){ return null; }
	public MyHelperClass getPort(){ return null; }}

class Controller {

public MyHelperClass error(){ return null; }
	public MyHelperClass stopped(){ return null; }
	public MyHelperClass receiveItem(Item o0){ return null; }}

class SSLHttpClient {

public MyHelperClass getCredentialsProvider(){ return null; }
	public MyHelperClass execute(HttpGet o0){ return null; }}

class AuthScope {

AuthScope(MyHelperClass o0, MyHelperClass o1){}
	AuthScope(){}}

class UsernamePasswordCredentials {

UsernamePasswordCredentials(String o0, String o1){}
	UsernamePasswordCredentials(){}}

class HttpGet {

HttpGet(URI o0){}
	HttpGet(){}
	public MyHelperClass addHeader(String o0, String o1){ return null; }}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class InputStream {

}

class XmlPullParserFactory {

public MyHelperClass newPullParser(){ return null; }
	public MyHelperClass setNamespaceAware(boolean o0){ return null; }}

class XmlPullParser {

public MyHelperClass getEventType(){ return null; }
	public MyHelperClass next(){ return null; }
	public MyHelperClass nextText(){ return null; }
	public MyHelperClass getAttributeValue(Object o0, String o1){ return null; }
	public MyHelperClass setInput(InputStream o0, Object o1){ return null; }
	public MyHelperClass getName(){ return null; }}

class Item {

Item(){}
	Item(String o0, MyHelperClass o1){}}
