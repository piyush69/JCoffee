


class c15185464 {
public MyHelperClass log;
	public MyHelperClass dir;
	public MyHelperClass scanDirectory(MyHelperClass o0){ return null; }

    public void scan() throws Throwable {
        FTPClient client;// = new FTPClient();
        client = new FTPClient();
        MyHelperClass host = new MyHelperClass();
        log.info("connecting to " + host + "...");
//        MyHelperClass host = new MyHelperClass();
        client.connect(host);
//        MyHelperClass client = new MyHelperClass();
        log.info((String)(Object)client.getReplyString());
        MyHelperClass log = new MyHelperClass();
        log.info("logging in...");
//        MyHelperClass client = new MyHelperClass();
        client.login("anonymous", "");
//        MyHelperClass client = new MyHelperClass();
        log.info((String)(Object)client.getReplyString());
        MyHelperClass Calendar = new MyHelperClass();
        Date date =(Date)(Object) Calendar.getInstance().getTime();
        XMLDocument xmlDocument;// = new XMLDocument();
        xmlDocument = new XMLDocument(host, dir, date);
        MyHelperClass dir = new MyHelperClass();
        scanDirectory(dir);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass getTime(){ return null; }}

class Date {

}

class FTPClient {

public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass getReplyString(){ return null; }}

class XMLDocument {

XMLDocument(){}
	XMLDocument(MyHelperClass o0, MyHelperClass o1, Date o2){}}
