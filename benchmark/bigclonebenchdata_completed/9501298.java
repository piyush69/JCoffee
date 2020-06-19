


class c9501298 {

    public InputStream getDaoConfig(String connectionType) throws IOException {
        URL url = null;
        MyHelperClass SQL = new MyHelperClass();
        if (connectionType.equals(SQL.ORACLE)) {
            url =(URL)(Object) DBCreateConfig.class.getResource("oracle.xml");
//        MyHelperClass SQL = new MyHelperClass();
        } else if (connectionType.equals(SQL.SQL2K)) {
            url =(URL)(Object) DBCreateConfig.class.getResource("sql2k.xml");
        }
        return(InputStream)(Object) url.openStream();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ORACLE;
	public MyHelperClass SQL2K;
}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }}

class DBCreateConfig {

}
