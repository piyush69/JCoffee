


class c552318 {

    public boolean connectyahoo(String login, String password) throws Exception {
        String lapage = new String("");
        String myargs = new String("");
        Pattern pat;
        Matcher mat;
        int data;
        URL myurl = new URL("http://groups.yahoo.com/mygroups");
        URLConnection conn =(URLConnection)(Object) myurl.openConnection();
        conn.connect();
        MyHelperClass Pattern = new MyHelperClass();
        if (!(Boolean)(Object)Pattern.matches("HTTP/... 2.. .*", conn.getHeaderField(0).toString())) {
            System.out.println(conn.getHeaderField(0).toString());
            return false;
        }
        System.out.print("login : ");
        InputStream in =(InputStream)(Object) conn.getInputStream();
        lapage = "";
        for (data =(int)(Object) in.read(); data != -1; data =(int)(Object) in.read()) lapage += (char) data;
        myargs = "";
        MyHelperClass URLEncoder = new MyHelperClass();
        myargs += URLEncoder.encode(".tries", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8") + "&";
//        MyHelperClass URLEncoder = new MyHelperClass();
        myargs += URLEncoder.encode(".src", "UTF-8") + "=" + URLEncoder.encode("ygrp", "UTF-8") + "&";
//        MyHelperClass URLEncoder = new MyHelperClass();
        myargs += URLEncoder.encode(".md5", "UTF-8") + "=" + URLEncoder.encode("", "UTF-8") + "&";
//        MyHelperClass URLEncoder = new MyHelperClass();
        myargs += URLEncoder.encode(".hash", "UTF-8") + "=" + URLEncoder.encode("", "UTF-8") + "&";
//        MyHelperClass URLEncoder = new MyHelperClass();
        myargs += URLEncoder.encode(".js", "UTF-8") + "=" + URLEncoder.encode("", "UTF-8") + "&";
//        MyHelperClass URLEncoder = new MyHelperClass();
        myargs += URLEncoder.encode(".last", "UTF-8") + "=" + URLEncoder.encode("", "UTF-8") + "&";
//        MyHelperClass URLEncoder = new MyHelperClass();
        myargs += URLEncoder.encode("promo", "UTF-8") + "=" + URLEncoder.encode("", "UTF-8") + "&";
//        MyHelperClass URLEncoder = new MyHelperClass();
        myargs += URLEncoder.encode(".intl", "UTF-8") + "=" + URLEncoder.encode("us", "UTF-8") + "&";
//        MyHelperClass URLEncoder = new MyHelperClass();
        myargs += URLEncoder.encode(".bypass", "UTF-8") + "=" + URLEncoder.encode("", "UTF-8") + "&";
//        MyHelperClass URLEncoder = new MyHelperClass();
        myargs += URLEncoder.encode(".partner", "UTF-8") + "=" + URLEncoder.encode("", "UTF-8") + "&";
//        MyHelperClass Pattern = new MyHelperClass();
        pat =(Pattern)(Object) Pattern.compile("<input type=\"hidden\" name=\".u\" value=\"(.+?)\">");
        mat =(Matcher)(Object) pat.matcher(lapage);
        mat.find();
//        MyHelperClass URLEncoder = new MyHelperClass();
        myargs += URLEncoder.encode(".u", "UTF-8") + "=" + URLEncoder.encode((String)(Object)mat.group(1), "UTF-8") + "&";
//        MyHelperClass URLEncoder = new MyHelperClass();
        myargs += URLEncoder.encode(".v", "UTF-8") + "=" + URLEncoder.encode("0", "UTF-8") + "&";
//        MyHelperClass Pattern = new MyHelperClass();
        pat =(Pattern)(Object) Pattern.compile("<input type=\"hidden\" name=\".challenge\" value=\"(.+?)\">");
        mat =(Matcher)(Object) pat.matcher(lapage);
        mat.find();
//        MyHelperClass URLEncoder = new MyHelperClass();
        myargs += URLEncoder.encode(".challenge", "UTF-8") + "=" + URLEncoder.encode((String)(Object)mat.group(1), "UTF-8") + "&";
//        MyHelperClass URLEncoder = new MyHelperClass();
        myargs += URLEncoder.encode(".yplus", "UTF-8") + "=" + URLEncoder.encode("", "UTF-8") + "&";
//        MyHelperClass URLEncoder = new MyHelperClass();
        myargs += URLEncoder.encode(".emailCode", "UTF-8") + "=" + URLEncoder.encode("", "UTF-8") + "&";
//        MyHelperClass URLEncoder = new MyHelperClass();
        myargs += URLEncoder.encode("pkg", "UTF-8") + "=" + URLEncoder.encode("", "UTF-8") + "&";
//        MyHelperClass URLEncoder = new MyHelperClass();
        myargs += URLEncoder.encode("stepid", "UTF-8") + "=" + URLEncoder.encode("", "UTF-8") + "&";
//        MyHelperClass URLEncoder = new MyHelperClass();
        myargs += URLEncoder.encode(".ev", "UTF-8") + "=" + URLEncoder.encode("", "UTF-8") + "&";
//        MyHelperClass URLEncoder = new MyHelperClass();
        myargs += URLEncoder.encode("hasMsgr", "UTF-8") + "=" + URLEncoder.encode("0", "UTF-8") + "&";
//        MyHelperClass URLEncoder = new MyHelperClass();
        myargs += URLEncoder.encode(".chkP", "UTF-8") + "=" + URLEncoder.encode("Y", "UTF-8") + "&";
//        MyHelperClass URLEncoder = new MyHelperClass();
        myargs += URLEncoder.encode(".done", "UTF-8") + "=" + URLEncoder.encode("http://groups.yahoo.com/mygroups", "UTF-8") + "&";
//        MyHelperClass URLEncoder = new MyHelperClass();
        myargs += URLEncoder.encode("login", "UTF-8") + "=" + URLEncoder.encode(login, "UTF-8") + "&";
//        MyHelperClass URLEncoder = new MyHelperClass();
        myargs += URLEncoder.encode("passwd", "UTF-8") + "=" + URLEncoder.encode(password, "UTF-8") + "&";
//        MyHelperClass URLEncoder = new MyHelperClass();
        myargs += URLEncoder.encode(".persistent", "UTF-8") + "=" + URLEncoder.encode("y", "UTF-8") + "&";
//        MyHelperClass URLEncoder = new MyHelperClass();
        myargs += URLEncoder.encode(".save", "UTF-8") + "=" + URLEncoder.encode("Sign In", "UTF-8");
        myurl = new URL("http://login.yahoo.com/config/login");
        conn =(URLConnection)(Object) myurl.openConnection();
        conn.setDoInput(true);
        conn.setDoOutput(true);
        OutputStream output =(OutputStream)(Object) conn.getOutputStream();
        PrintStream pout = new PrintStream(output);
        pout.print(myargs);
        pout.close();
//        MyHelperClass Pattern = new MyHelperClass();
        if (!(Boolean)(Object)Pattern.matches("HTTP/... 2.. .*", conn.getHeaderField(0).toString())) {
            System.out.println(conn.getHeaderField(0).toString());
            return false;
        }
        System.out.println("OK");
        myurl = new URL("http://groups.yahoo.com/adultconf");
        conn =(URLConnection)(Object) myurl.openConnection();
        conn.connect();
//        MyHelperClass Pattern = new MyHelperClass();
        if (!(Boolean)(Object)Pattern.matches("HTTP/... 2.. .*", conn.getHeaderField(0).toString())) {
            System.out.println(conn.getHeaderField(0).toString());
            return false;
        }
        System.out.print("adult : ");
        in =(InputStream)(Object) conn.getInputStream();
        lapage = "";
        for (data =(int)(Object) in.read(); data != -1; data =(int)(Object) in.read()) lapage += (char) data;
        myargs = "";
//        MyHelperClass Pattern = new MyHelperClass();
        pat =(Pattern)(Object) Pattern.compile("<input type=\"hidden\" name=\"ycb\" value=\"(.+?)\">");
        mat =(Matcher)(Object) pat.matcher(lapage);
        mat.find();
//        MyHelperClass URLEncoder = new MyHelperClass();
        myargs += URLEncoder.encode("ycb", "UTF-8") + "=" + URLEncoder.encode((String)(Object)mat.group(1), "UTF-8") + "&";
//        MyHelperClass URLEncoder = new MyHelperClass();
        myargs += URLEncoder.encode("dest", "UTF-8") + "=" + URLEncoder.encode("/mygroups", "UTF-8") + "&";
//        MyHelperClass URLEncoder = new MyHelperClass();
        myargs += URLEncoder.encode("accept", "UTF-8") + "=" + URLEncoder.encode("I Acce", "UTF-8");
        myurl = new URL("http://groups.yahoo.com/adultconf");
        conn =(URLConnection)(Object) myurl.openConnection();
        conn.setDoInput(true);
        conn.setDoOutput(true);
        output =(OutputStream)(Object) conn.getOutputStream();
        pout = new PrintStream(output);
        pout.print(myargs);
        pout.close();
//        MyHelperClass Pattern = new MyHelperClass();
        if (!(Boolean)(Object)Pattern.matches("HTTP/... 2.. .*", conn.getHeaderField(0).toString())) {
            System.out.println(conn.getHeaderField(0).toString());
            return false;
        }
        System.out.println("OK");
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass compile(String o0){ return null; }
	public MyHelperClass matches(String o0, String o1){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }}

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
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStream {

public MyHelperClass read(){ return null; }}

class OutputStream {

}

class PrintStream {

PrintStream(OutputStream o0){}
	PrintStream(){}
	public MyHelperClass print(String o0){ return null; }
	public MyHelperClass close(){ return null; }}
