


class c4798352 {

    public static void readProperties() throws IOException {
        MyHelperClass cl = new MyHelperClass();
        URL url1 =(URL)(Object) cl.getResource("conf/soapuddi.config");
        Properties props = new Properties();
        if (url1 == null) throw new IOException("soapuddi.config not found");
        props.load(url1.openStream());
        MyHelperClass className = new MyHelperClass();
        className = props.getProperty("Class");
        MyHelperClass url = new MyHelperClass();
        url = props.getProperty("URL");
        MyHelperClass user = new MyHelperClass();
        user = props.getProperty("user");
        MyHelperClass password = new MyHelperClass();
        password = props.getProperty("passwd");
        MyHelperClass operatorName = new MyHelperClass();
        operatorName = props.getProperty("operator");
        MyHelperClass authorisedName = new MyHelperClass();
        authorisedName = props.getProperty("authorisedName");
        boolean isUpdated;// = new boolean();
        isUpdated = true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getResource(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }}

class Properties {

public MyHelperClass getProperty(String o0){ return null; }
	public MyHelperClass load(MyHelperClass o0){ return null; }}
