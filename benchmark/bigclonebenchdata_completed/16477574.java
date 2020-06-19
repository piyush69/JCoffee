


class c16477574 {
public static MyHelperClass decrypt(MyHelperClass o0){ return null; }
//public MyHelperClass decrypt(MyHelperClass o0){ return null; }

    public static ArrayList search(String query) throws Exception {
        ArrayList list = new ArrayList();
        String url = "http://hypem.com/playlist/search/" + query + "/xml/1/list.xspf";
        HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) (new URL(url)).openConnection();
        conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; .NET CLR 1.1.4322; .NET CLR 2.0.50727)");
        MyHelperClass XmlLoader = new MyHelperClass();
        XmlNode node =(XmlNode)(Object) XmlLoader.load(conn.getInputStream());
        XmlNode tracks[] =(XmlNode[])(Object) node.getFirstChild("trackList").getChild("track");
        for (int i = 0; i < tracks.length; i++) {
            String location =(String)(Object) decrypt(tracks[i].getFirstChild("location").getText());
            String annotation =(String)(Object) tracks[i].getFirstChild("annotation").getText().replaceAll("[\r\n]", "");
            list.add(location);
            System.out.print("found in Hypem: ");
            System.out.print(annotation);
            System.out.print(", ");
            System.out.println(location);
        }
        return list;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getChild(String o0){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass replaceAll(String o0, String o1){ return null; }
	public MyHelperClass load(MyHelperClass o0){ return null; }}

class ArrayList {

public MyHelperClass add(String o0){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class XmlNode {

public MyHelperClass getFirstChild(String o0){ return null; }}
