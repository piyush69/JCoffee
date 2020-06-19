


class c14884125 {

    private void addPlugin(URL url) throws IOException {
        MyHelperClass logger = new MyHelperClass();
        logger.debug("Adding plugin with URL {}", url);
        InputStream in =(InputStream)(Object) url.openStream();
        try {
            Properties properties = new Properties();
            properties.load(in);
            MyHelperClass plugins = new MyHelperClass();
            plugins.add(new WtfPlugin(properties));
        } finally {
            in.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0, URL o1){ return null; }
	public MyHelperClass add(WtfPlugin o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class Properties {

public MyHelperClass load(InputStream o0){ return null; }}

class WtfPlugin {

WtfPlugin(){}
	WtfPlugin(Properties o0){}}
