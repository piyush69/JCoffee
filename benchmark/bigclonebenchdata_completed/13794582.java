


class c13794582 {
public MyHelperClass rs;
	public MyHelperClass logger;
	public MyHelperClass stmt;

    public Source get_source(String pageURL, Boolean checkInBase) {
        URL url;
        URLConnection conn;
        Reader inReader;
        Source source = null;
        String LastModified = "";
        Boolean updateData = false;
        try {
            url = new URL(pageURL);
            conn =(URLConnection)(Object) url.openConnection();
            conn.setRequestProperty("Accept-Charset", "windows-1251");
            if (checkInBase) {
                for (int i = 0; ; i++) {
                    String name =(String)(Object) conn.getHeaderFieldKey(i);
                    String value =(String)(Object) conn.getHeaderField(i);
                    if (name == null && value == null) {
                        break;
                    }
                    if ("Last-Modified".equals(name)) {
                        LastModified = value;
                    }
                }
                MyHelperClass Ini = new MyHelperClass();
                Ini.rs = Ini.stmt.executeQuery("select count(1) as qwe from " + " PUBLIC.PAGES " + "where url = '" + pageURL + "';");
                rs.next();
                if ((int)(Object)rs.getInt("qwe") == 0) {
                    stmt.executeUpdate("insert into PUBLIC.PAGES(url, lastUpdateDate) " + " values('" + pageURL + "', " + "'" + LastModified + "'" + ");");
                } else {
//                    MyHelperClass Ini = new MyHelperClass();
                    Ini.rs = Ini.stmt.executeQuery("select lastUpdateDate from " + " PUBLIC.PAGES " + "where url = '" + pageURL + "';");
                    rs.next();
                    if (!rs.getString("lastUpdateDate").equals(LastModified)) {
                        updateData = true;
                    } else {
                        return null;
                    }
                }
            }
            inReader =(Reader)(Object) new InputStreamReader(conn.getInputStream(), "windows-1251");
            source = new Source(inReader);
            source.setLogger(null);
            source.fullSequentialParse();
            if (updateData) {
                stmt.executeUpdate("delete from PUBLIC.LINKDATA " + "where id in (" + "select id from PUBLIC.PAGES " + "where url = '" + pageURL + "'" + ")");
                stmt.executeUpdate("delete from PUBLIC.PAGES " + "where url = '" + pageURL + "';");
                stmt.executeUpdate("insert into PUBLIC.PAGES " + " values('" + pageURL + "', " + "'" + LastModified + "'" + ");");
            }
        } catch (Exception ex) {
            logger.fatal("Error: ", ex);
        }
        return source;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass rs;
	public MyHelperClass stmt;
public MyHelperClass next(){ return null; }
	public MyHelperClass getInt(String o0){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }
	public MyHelperClass fatal(String o0, Exception o1){ return null; }}

class Source {

Source(Reader o0){}
	Source(){}
	public MyHelperClass setLogger(Object o0){ return null; }
	public MyHelperClass fullSequentialParse(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getHeaderField(int o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getHeaderFieldKey(int o0){ return null; }}

class Reader {

}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}
