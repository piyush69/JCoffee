


class c7942254 {

    public static Properties load(String classPath) throws IOException {
        MyHelperClass AssertUtility = new MyHelperClass();
        AssertUtility.notNullAndNotSpace(classPath);
        Properties props = new Properties();
        URL url =(URL)(Object) ClassLoader.getSystemResource(classPath);
        props.load(url.openStream());
        return props;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass notNullAndNotSpace(String o0){ return null; }}

class Properties {

public MyHelperClass load(MyHelperClass o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }}
