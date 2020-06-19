


class c13966304 {

    private void work(String[] args) throws Exception {
        MyHelperClass CONTENT_URL = new MyHelperClass();
        String dictLocation =(String)(Object) CONTENT_URL;
        MyHelperClass CONTENT_DIR = new MyHelperClass();
        String cpeContentDirName =(String)(Object) CONTENT_DIR;
        String fn = dictLocation.substring(dictLocation.lastIndexOf("/") + 1);
        MyHelperClass File = new MyHelperClass();
        File destFile = new File(cpeContentDirName + File.separator + fn);
        URL url = new URL(dictLocation);
        URLConnection conn =(URLConnection)(Object) url.openConnection();
        conn.connect();
        long lmodifiedRemote =(long)(Object) conn.getLastModified();
        boolean needToDownload = false;
        if ((boolean)(Object)destFile.exists()) {
            System.out.println(destFile.getAbsolutePath() + " exists, check modification time");
            long lmodifiedLocal =(long)(Object) destFile.lastModified();
            if (lmodifiedRemote > lmodifiedLocal) {
                System.out.println("Server file is newer, need to download");
                needToDownload = true;
            } else {
                System.out.println("Local version is newer, no need to download");
            }
        } else {
            System.out.println("Local version doesn't exist, need to download");
            needToDownload = true;
        }
        if (needToDownload) {
            InputStream is =(InputStream)(Object) conn.getInputStream();
            FileOutputStream fos = new FileOutputStream(destFile);
            byte[] buff = new byte[8192];
            int read = 0;
            while ((read =(int)(Object) is.read(buff)) > 0) {
                fos.write(buff, 0, read);
            }
            fos.flush();
            fos.close();
            is.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
}

class File {

File(){}
	File(String o0){}
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass lastModified(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getLastModified(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}
