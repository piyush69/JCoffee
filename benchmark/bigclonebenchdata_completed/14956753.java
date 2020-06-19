


class c14956753 {

    public void execute(HttpResponse response) throws HttpException, IOException {
        StringBuffer content = new StringBuffer();
        MyHelperClass membershipRegistry = new MyHelperClass();
        NodeSet allNodes =(NodeSet)(Object) membershipRegistry.listAllMembers();
        for (Node node :(Node[])(Object) (Object[])(Object)allNodes) {
            content.append(node.getId().toString());
            MyHelperClass SystemUtils = new MyHelperClass();
            content.append(SystemUtils.LINE_SEPARATOR);
        }
        StringEntity body = new StringEntity(content.toString());
        MyHelperClass PLAIN_TEXT_RESPONSE_CONTENT_TYPE = new MyHelperClass();
        body.setContentType(PLAIN_TEXT_RESPONSE_CONTENT_TYPE);
        response.setEntity(body);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass LINE_SEPARATOR;
public MyHelperClass listAllMembers(){ return null; }}

class HttpResponse {

public MyHelperClass setEntity(StringEntity o0){ return null; }}

class HttpException extends Exception{
	public HttpException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class NodeSet {

}

class Node {

public MyHelperClass getId(){ return null; }}

class StringEntity {

StringEntity(String o0){}
	StringEntity(){}
	public MyHelperClass setContentType(MyHelperClass o0){ return null; }}
