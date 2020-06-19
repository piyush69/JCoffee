


class c22560852 {

    private void loadDBConfig(final String adapter) throws IOException {
        final URL url =(URL)(Object) getClass().getClassLoader().getResource("adapter/" + adapter + ".properties");
        Properties _props;// = new Properties();
        _props = new Properties();
//        MyHelperClass _props = new MyHelperClass();
        _props.load(url.openStream());
        boolean _init;// = new boolean();
        _init = true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass load(MyHelperClass o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }}

class Properties {

public MyHelperClass load(MyHelperClass o0){ return null; }}
