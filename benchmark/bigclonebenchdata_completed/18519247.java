


class c18519247 {

    public List fetchPath(PathObject parent) throws NetworkException {
        if ((boolean)(Object)parent.isFetched()) {
            return(List)(Object) parent.getChildren();
        } else if (!"d".equals(parent.getType())) {
            return null;
        }
        MyHelperClass HttpConfig = new MyHelperClass();
        HttpClient client =(HttpClient)(Object) HttpConfig.newInstance();
//        MyHelperClass HttpConfig = new MyHelperClass();
        HttpGet get = new HttpGet((int)(Object)HttpConfig.bbsURL() + (int)(Object)HttpConfig.BBS_0AN + (int)(Object)parent.getPath());
        try {
            HttpResponse response =(HttpResponse)(Object) client.execute(get);
            HttpEntity entity =(HttpEntity)(Object) response.getEntity();
            MyHelperClass XmlOperator = new MyHelperClass();
            Document doc =(Document)(Object) XmlOperator.readDocument(entity.getContent());
            MyHelperClass BBSBodyParseHelper = new MyHelperClass();
            BBSBodyParseHelper.parsePathList(doc, parent);
            return(List)(Object) parent.getChildren();
        } catch (Exception e) {
            e.printStackTrace();
            throw new NetworkException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BBS_0AN;
public MyHelperClass readDocument(MyHelperClass o0){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass parsePathList(Document o0, PathObject o1){ return null; }
	public MyHelperClass bbsURL(){ return null; }}

class PathObject {

public MyHelperClass isFetched(){ return null; }
	public MyHelperClass getType(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass getChildren(){ return null; }}

class List {

}

class NetworkException extends Exception{
	public NetworkException(String errorMessage) { super(errorMessage); }
}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class HttpGet {

HttpGet(int o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class Document {

}
