


class c15826300 {

    public static Map getResponseHeader(String address) {
        System.out.println(address);
        URLConnection conn = null;
        Map responseHeader = null;
        try {
            URL url = new URL(address);
            conn =(URLConnection)(Object) url.openConnection();
            responseHeader =(Map)(Object) conn.getHeaderFields();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseHeader;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Map {

}

class List {

}

class URLConnection {

public MyHelperClass getHeaderFields(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}
