


class c3404757 {

    public InputStream getDaoConfig(String connectionType) throws IOException {
        URL url = null;
        MyHelperClass SQL = new MyHelperClass();
        if (connectionType.equals(SQL.ORACLE)) {
            url =(URL)(Object) DTSWFDBConfig.class.getResource("oracle.xml");
//        MyHelperClass SQL = new MyHelperClass();
        } else if (connectionType.equals(SQL.SQL2K)) {
            url =(URL)(Object) DTSWFDBConfig.class.getResource("sql2k.xml");
//        MyHelperClass SQL = new MyHelperClass();
        } else if (connectionType.equals(SQL.CACHE)) {
            url =(URL)(Object) DTSWFDBConfig.class.getResource("cache.xml");
        }
        return(InputStream)(Object) url.openStream();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ORACLE;
	public MyHelperClass SQL2K;
	public MyHelperClass CACHE;
}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }}

class DTSWFDBConfig {

}
