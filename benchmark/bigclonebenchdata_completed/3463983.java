


class c3463983 {

//        @Override
        public long getLastModified(final Resource arg0) {
            try {
                MyHelperClass CContext = new MyHelperClass();
                final ServletContext context =(ServletContext)(Object) CContext.getInstance().getContext();
                final URL url =(URL)(Object) context.getResource(arg0.getName());
                final URLConnection conn =(URLConnection)(Object) url.openConnection();
                final long lm =(long)(Object) conn.getLastModified();
                try {
                    conn.getInputStream().close();
                } catch (final Exception ignore) {
                    ;
                }
                return lm;
            } catch (final Exception e) {
                return 0;
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass close(){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getContext(){ return null; }}

class Resource {

public MyHelperClass getName(){ return null; }}

class ServletContext {

public MyHelperClass getResource(MyHelperClass o0){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getLastModified(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}
