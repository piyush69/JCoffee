


class c3852700 {

    public URLConnection getResourceConnection(String name) throws ResourceException {
        MyHelperClass context = new MyHelperClass();
        if (context == null) throw new ResourceException("There is no ServletContext to get the requested resource");
        URL url = null;
        try {
//            MyHelperClass context = new MyHelperClass();
            url =(URL)(Object) context.getResource("/WEB-INF/scriptags/" + name);
            return(URLConnection)(Object) url.openConnection();
        } catch (Exception e) {
            throw new ResourceException(String.format("Resource '%s' could not be found (url: %s)", name, url), e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getResource(String o0){ return null; }}

class URLConnection {

}

class ResourceException extends Exception{
	public ResourceException(String errorMessage) { super(errorMessage); }
	ResourceException(String o0, Exception o1){}
	ResourceException(){}
}

class URL {

public MyHelperClass openConnection(){ return null; }}
