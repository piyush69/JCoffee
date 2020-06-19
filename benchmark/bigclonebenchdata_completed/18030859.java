


class c18030859 {

    public void execute(HttpResponse response) throws HttpException, IOException {
        MyHelperClass internalDataBank = new MyHelperClass();
        Collection allData =(Collection)(Object) internalDataBank.getAll();
        StringBuffer content = new StringBuffer();
        for (Data data :(Data[])(Object) (Object[])(Object)allData) {
            content.append("keyHash:").append(data.getKeyHash()).append(", ");
            content.append("version:").append(data.getVersion()).append(", ");
            content.append("size:").append(data.getContent().length);
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
public MyHelperClass length;
	public MyHelperClass LINE_SEPARATOR;
public MyHelperClass getAll(){ return null; }}

class HttpResponse {

public MyHelperClass setEntity(StringEntity o0){ return null; }}

class HttpException extends Exception{
	public HttpException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Collection {

}

class Data {

public MyHelperClass getContent(){ return null; }
	public MyHelperClass getVersion(){ return null; }
	public MyHelperClass getKeyHash(){ return null; }}

class StringEntity {

StringEntity(String o0){}
	StringEntity(){}
	public MyHelperClass setContentType(MyHelperClass o0){ return null; }}
