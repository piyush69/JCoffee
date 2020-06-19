


class c3463984 {

//        @Override
        public InputStream getResourceStream(final String arg0) throws ResourceNotFoundException {
            try {
                MyHelperClass CContext = new MyHelperClass();
                final ServletContext context =(ServletContext)(Object) CContext.getInstance().getContext();
                final URL url =(URL)(Object) context.getResource(arg0);
                return(InputStream)(Object) url.openStream();
            } catch (final Exception e) {
                return null;
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getContext(){ return null; }}

class InputStream {

}

class ResourceNotFoundException extends Exception{
	public ResourceNotFoundException(String errorMessage) { super(errorMessage); }
}

class ServletContext {

public MyHelperClass getResource(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}
