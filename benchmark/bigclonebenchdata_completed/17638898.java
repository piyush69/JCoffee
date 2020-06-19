


class c17638898 {

    public InputStream getDaoConfig(String connectionType) throws IOException {
        URL url = null;
        InputStream inStream = null;
        MyHelperClass SQL = new MyHelperClass();
        if (connectionType.equals(SQL.ORACLE)) {
            url =(URL)(Object) MatchLoadConfig.class.getResource("oracle.xml");
//        MyHelperClass SQL = new MyHelperClass();
        } else if (connectionType.equals(SQL.SQL2K)) {
            url =(URL)(Object) MatchLoadConfig.class.getResource("sql2k.xml");
//        MyHelperClass SQL = new MyHelperClass();
        } else if (connectionType.equals(SQL.CACHE)) {
            url =(URL)(Object) MatchLoadConfig.class.getResource("cache.xml");
//        MyHelperClass SQL = new MyHelperClass();
        } else if (connectionType.equals(SQL.DB2)) {
            url =(URL)(Object) MatchLoadConfig.class.getResource("db2.xml");
        } else {
            MyHelperClass Categories = new MyHelperClass();
            Categories.dataXml().error("* Problem: Unknown connection type: " + connectionType);
        }
        try {
            inStream =(InputStream)(Object) url.openStream();
        } catch (NullPointerException npe) {
            MyHelperClass Categories = new MyHelperClass();
            Categories.dataXml().error("* Problem: Undefined resource URL: " + npe.getMessage());
            throw npe;
        }
        return inStream;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ORACLE;
	public MyHelperClass CACHE;
	public MyHelperClass DB2;
	public MyHelperClass SQL2K;
public MyHelperClass dataXml(){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }}

class MatchLoadConfig {

}
