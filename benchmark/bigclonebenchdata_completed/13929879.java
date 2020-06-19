


class c13929879 {

    public void contextInitialized(ServletContextEvent event) {
        try {
            String osName = System.getProperty("os.name");
            if (osName != null && osName.toLowerCase().contains("windows")) {
                URL url = new URL("http://localhost/");
                URLConnection urlConn =(URLConnection)(Object) url.openConnection();
                urlConn.setDefaultUseCaches(false);
            }
        } catch (Throwable t) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ServletContextEvent {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setDefaultUseCaches(boolean o0){ return null; }}
