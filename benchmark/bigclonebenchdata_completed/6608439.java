


class c6608439 {
public static MyHelperClass GB_HttpTools;
//public MyHelperClass GB_HttpTools;

    public static void main(String[] args) {
        FTPClient client = new FTPClient();
        try {
            File l_file = new File("C:/temp/testLoribel.html");
            String l_url = "http://www.loribel.com/index.html";
            MyHelperClass ENCODING = new MyHelperClass();
            GB_HttpTools.loadUrlToFile(l_url, l_file, ENCODING.ISO_8859_1);
            System.out.println("Try to connect...");
            client.connect("ftp://ftp.phpnet.org");
            System.out.println("Connected to server");
            System.out.println("Try to connect...");
            boolean b =(boolean)(Object) client.login("fff", "ddd");
            System.out.println("Login: " + b);
            String[] l_names =(String[])(Object) client.listNames();
            MyHelperClass GB_DebugTools = new MyHelperClass();
            GB_DebugTools.debugArray(GB_FtpDemo2.class, "names", l_names);
            b =(boolean)(Object) client.makeDirectory("test02/toto");
            System.out.println("Mkdir: " + b);
            String l_remote = "test02/test.xml";
            InputStream l_local =(InputStream)(Object) new StringInputStream("Test111111111111111");
            b =(boolean)(Object) client.storeFile(l_remote, l_local);
            System.out.println("Copy file: " + b);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ISO_8859_1;
public MyHelperClass loadUrlToFile(String o0, File o1, MyHelperClass o2){ return null; }
	public MyHelperClass debugArray(Class<GB_FtpDemo2> o0, String o1, String[] o2){ return null; }}

class FTPClient {

public MyHelperClass listNames(){ return null; }
	public MyHelperClass storeFile(String o0, InputStream o1){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass makeDirectory(String o0){ return null; }
	public MyHelperClass connect(String o0){ return null; }}

class File {

File(String o0){}
	File(){}}

class GB_FtpDemo2 {

}

class InputStream {

}

class StringInputStream {

StringInputStream(String o0){}
	StringInputStream(){}}
