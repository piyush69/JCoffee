


class c4251134 {

//    @Override
    protected URLConnection openConnection(URL url) throws IOException {
        if (url.getQuery() == null) throw new IllegalStateException("Missing TemplateAccount number in rest URL " + url);
        MSResource msResource = null;
        try {
            long templateAccountId = Long.parseLong((String)(Object)url.getQuery());
            MyHelperClass menuBean = new MyHelperClass();
            msResource =(MSResource)(Object) menuBean.findMSResource(templateAccountId, url.getPath());
        } catch (Exception e) {
            throw new IllegalStateException("Resource not found in database: " + url, e);
        }
        ByteArrayInputStream bais = new ByteArrayInputStream(msResource.getValue());
        return (URLConnection)(Object)new RestConnection(url, bais);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass findMSResource(long o0, MyHelperClass o1){ return null; }}

class URL {

public MyHelperClass getPath(){ return null; }
	public MyHelperClass getQuery(){ return null; }}

class URLConnection {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class MSResource {

public MyHelperClass getValue(){ return null; }}

class ByteArrayInputStream {

ByteArrayInputStream(MyHelperClass o0){}
	ByteArrayInputStream(){}}

class RestConnection {

RestConnection(){}
	RestConnection(URL o0, ByteArrayInputStream o1){}}
