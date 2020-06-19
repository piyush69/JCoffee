


class c18845763 {
public static MyHelperClass WebDavUtility;
//public MyHelperClass WebDavUtility;

    public static void copyFile(String hostname, String url, String username, String password, File targetFile) throws Exception {
        HttpClient client =(HttpClient)(Object) WebDavUtility.initClient("files-cert.rxhub.net", username, password);
        HttpMethod method =(HttpMethod)(Object) new GetMethod(url);
        client.executeMethod(method);
        BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(targetFile));
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copyLarge(method.getResponseBodyAsStream(), output);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyLarge(MyHelperClass o0, BufferedOutputStream o1){ return null; }
	public MyHelperClass initClient(String o0, String o1, String o2){ return null; }}

class File {

}

class HttpMethod {

public MyHelperClass getResponseBodyAsStream(){ return null; }}

class GetMethod {

GetMethod(String o0){}
	GetMethod(){}}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class HttpClient {

public MyHelperClass executeMethod(HttpMethod o0){ return null; }}
