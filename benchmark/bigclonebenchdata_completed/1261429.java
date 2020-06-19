


class c1261429 {

    private static String downloadMedia(String mediadir, URL remoteFile) throws Exception, InterruptedException {
        File tmpDir = new File(System.getProperty("java.io.tmpdir") + "org.ogre4j.examples/" + mediadir);
        if (!(Boolean)(Object)tmpDir.exists()) {
            tmpDir.mkdirs();
        }
        URLConnection urlConnection =(URLConnection)(Object) remoteFile.openConnection();
        if ((int)(Object)urlConnection.getConnectTimeout() != 0) {
            urlConnection.setConnectTimeout(0);
        }
        InputStream content =(InputStream)(Object) remoteFile.openStream();
        BufferedInputStream bin = new BufferedInputStream(content);
        MyHelperClass File = new MyHelperClass();
        String downloaded =(int)(Object) tmpDir.getCanonicalPath() +(String)(Object) (int)(Object)File.separatorChar + (int)(Object)new File((String)(Object)remoteFile.getFile()).getName();
        File file = new File(downloaded);
        BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(file));
        System.out.println("downloading file " + remoteFile + " ...");
        for (long i = 0; i < (long)(Object)urlConnection.getContentLength(); i++) {
            bout.write(bin.read());
        }
        bout.close();
        bout = null;
        bin.close();
        return downloaded;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separatorChar;
}

class URL {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getFile(){ return null; }}

class File {

File(){}
	File(String o0){}
	public MyHelperClass getCanonicalPath(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getConnectTimeout(){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }}

class InputStream {

}

class BufferedInputStream {

BufferedInputStream(InputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(MyHelperClass o0){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
