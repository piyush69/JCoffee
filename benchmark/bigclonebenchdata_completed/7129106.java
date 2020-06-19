


class c7129106 {
public MyHelperClass DEFAULT_SERVER_URL;

    protected void downloadCacheFile(File file) throws Exception {
        MyHelperClass ApplicationProperties = new MyHelperClass();
        ApplicationProperties app =(ApplicationProperties)(Object) ApplicationProperties.getInstance();
        MyHelperClass JabberConstants = new MyHelperClass();
        String address =(String)(Object) app.getProperty(JabberConstants.PROPERTY_JABBER_SERVERLIST, DEFAULT_SERVER_URL);
        URL url = new URL(address);
        file.createNewFile();
        OutputStream cache =(OutputStream)(Object) new FileOutputStream(file);
        InputStream input =(InputStream)(Object) url.openStream();
        byte buffer[] = new byte[1024];
        int bytesRead = 0;
        while ((bytesRead =(int)(Object) input.read(buffer)) >= 0) cache.write(buffer, 0, bytesRead);
        input.close();
        cache.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PROPERTY_JABBER_SERVERLIST;
public MyHelperClass getInstance(){ return null; }}

class File {

public MyHelperClass createNewFile(){ return null; }}

class ApplicationProperties {

public MyHelperClass getProperty(MyHelperClass o0, MyHelperClass o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}
