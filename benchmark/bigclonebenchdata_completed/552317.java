


class c552317 {
public MyHelperClass UrlList;
	public MyHelperClass HTMLDecoder;
	public MyHelperClass Pattern;
	public MyHelperClass clearAll(){ return null; }

    public void listgroups() throws Exception {
        String lapage = new String("");
        Pattern pat;
        Matcher mat;
        int data;
        URL myurl = new URL("http://groups.yahoo.com/mygroups");
        URLConnection conn;
        URI myuri = new URI("http://groups.yahoo.com/mygroups");
        YahooInfo yi;
        clearAll();
        System.out.print("http://groups.yahoo.com/mygroups : ");
        do {
            myurl = new URL(myurl.toString());
            conn =(URLConnection)(Object) myurl.openConnection();
            conn.connect();
            if (!(Boolean)(Object)Pattern.matches("HTTP/... 2.. .*", conn.getHeaderField(0).toString())) {
                System.out.println(conn.getHeaderField(0).toString());
                return;
            }
            System.out.print(".");
            InputStream in =(InputStream)(Object) conn.getInputStream();
            lapage = "";
            for (data =(int)(Object) in.read(); data != -1; data =(int)(Object) in.read()) lapage += (char) data;
            pat =(Pattern)(Object) Pattern.compile("<td class=\"grpname selected\"><a href=\"(.+?)\".*?><em>(.+?)</em></a>");
            mat =(Matcher)(Object) pat.matcher(lapage);
            while ((boolean)(Object)mat.find()) {
                yi = new YahooInfo(mat.group(2), "", "", myuri.resolve(HTMLDecoder.decode(mat.group(1))).toURL().toString());
                UrlList.add(yi);
            }
            pat =(Pattern)(Object) Pattern.compile("<a href=\"(.+?)\">Next &gt;</a>");
            mat =(Matcher)(Object) pat.matcher(lapage);
            myurl = null;
            if ((boolean)(Object)mat.find()) {
                myurl =(URL)(Object) myuri.resolve(HTMLDecoder.decode(mat.group(1))).toURL();
            }
        } while (myurl != null);
        System.out.println("");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass decode(MyHelperClass o0){ return null; }
	public MyHelperClass add(YahooInfo o0){ return null; }
	public MyHelperClass matches(String o0, String o1){ return null; }
	public MyHelperClass compile(String o0){ return null; }
	public MyHelperClass toURL(){ return null; }}

class Pattern {

public MyHelperClass matcher(String o0){ return null; }}

class Matcher {

public MyHelperClass group(int o0){ return null; }
	public MyHelperClass find(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getHeaderField(int o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class URI {

URI(String o0){}
	URI(){}
	public MyHelperClass resolve(MyHelperClass o0){ return null; }}

class YahooInfo {

YahooInfo(MyHelperClass o0, String o1, String o2, String o3){}
	YahooInfo(){}}

class InputStream {

public MyHelperClass read(){ return null; }}
