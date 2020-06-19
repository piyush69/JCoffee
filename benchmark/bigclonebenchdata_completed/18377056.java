


class c18377056 {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://obs-he-lm:8888/XCATDR3/getproduct?obsid=0113060201&dtype=flatfiles&prd=P0113060201M2S003STSPLT8004.PDF");
        URLConnection conn =(URLConnection)(Object) url.openConnection();
        Map map =(Map)(Object) conn.getHeaderFields();
        JSONObject jso = new JSONObject();
        for (Entry s :(Entry[])(Object) (Object[])(Object)map.entrySet()) {
            System.out.println(s.getKey());
            for (String v :(String[])(Object) (Object[])(Object)s.getValue()) {
                System.out.println("   " + v);
            }
            jso.put(s.getKey(), s.getValue().get(0));
        }
        conn.getInputStream().close();
        System.out.println(jso.toJSONString());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getHeaderFields(){ return null; }}

class Map {

public MyHelperClass entrySet(){ return null; }}

class List {

}

class JSONObject {

public MyHelperClass put(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass toJSONString(){ return null; }}

class Entry {

public MyHelperClass getKey(){ return null; }
	public MyHelperClass getValue(){ return null; }}
