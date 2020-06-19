


class c552319 {

    public String getpage(String leurl) throws Exception {
        int data;
        StringBuffer lapage = new StringBuffer();
        URL myurl = new URL(leurl);
        URLConnection conn =(URLConnection)(Object) myurl.openConnection();
        conn.connect();
        MyHelperClass Pattern = new MyHelperClass();
        if (!(Boolean)(Object)Pattern.matches("HTTP/... 2.. .*", conn.getHeaderField(0).toString())) {
            System.out.println(conn.getHeaderField(0).toString());
            return lapage.toString();
        }
        InputStream in =(InputStream)(Object) conn.getInputStream();
        for (data =(int)(Object) in.read(); data != -1; data =(int)(Object) in.read()) lapage.append((char) data);
        return lapage.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass matches(String o0, String o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getHeaderField(int o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class InputStream {

public MyHelperClass read(){ return null; }}
