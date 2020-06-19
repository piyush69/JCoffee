


class c14609912 {
public static MyHelperClass long2date(MyHelperClass o0){ return null; }
//public MyHelperClass long2date(MyHelperClass o0){ return null; }

    private static String lastModified(URL url) {
        try {
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            return(String)(Object) long2date(conn.getLastModified());
        } catch (Exception e) {
            MyHelperClass SWGAide = new MyHelperClass();
            SWGAide.printDebug("cach", 1, "SWGCraftCache:lastModified: " + e.getMessage());
        }
        return "0";
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass printDebug(String o0, int o1, String o2){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getLastModified(){ return null; }}
