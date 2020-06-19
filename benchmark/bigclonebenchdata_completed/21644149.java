


class c21644149 {
public MyHelperClass sep;

    public void downloadQFromMinibix(int ticketNo) {
        MyHelperClass Preferences = new MyHelperClass();
        String minibixDomain =(String)(Object) Preferences.userRoot().node("Spectatus").get("MBAddr", "http://mathassess.caret.cam.ac.uk");
//        MyHelperClass Preferences = new MyHelperClass();
        String minibixPort =(String)(Object) Preferences.userRoot().node("Spectatus").get("MBPort", "80");
        String url = minibixDomain + ":" + minibixPort + "/qtibank-webserv/deposits/all/" + ticketNo;
        MyHelperClass tempdir = new MyHelperClass();
        File file = new File((int)(Object)tempdir + (int)(Object)sep + "minibix.zip");
        try {
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file));
            HttpClient httpclient =(HttpClient)(Object) new DefaultHttpClient();
            HttpGet httpget = new HttpGet(url);
            HttpResponse response =(HttpResponse)(Object) httpclient.execute(httpget);
            HttpEntity entity =(HttpEntity)(Object) response.getEntity();
            if (entity != null) {
                InputStream instream =(InputStream)(Object) entity.getContent();
                int l;
                byte[] tmp = new byte[2048];
                while ((l =(int)(Object) instream.read(tmp)) != -1) {
                    out.write(tmp, 0, l);
                }
                out.close();
                instream.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass node(String o0){ return null; }
	public MyHelperClass userRoot(){ return null; }
	public MyHelperClass get(String o0, String o1){ return null; }}

class File {

File(String o0){}
	File(){}}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}
