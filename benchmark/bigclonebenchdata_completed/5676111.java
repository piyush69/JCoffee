


class c5676111 {

    public void get() {
        try {
            int cnt;
            MyHelperClass urlStr = new MyHelperClass();
            URL url = new URL(urlStr);
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            conn.setDoInput(true);
            conn.setDoOutput(false);
            InputStream is =(InputStream)(Object) conn.getInputStream();
            String filename =(String)(Object) (new File(url.getFile()).getName());
            MyHelperClass dstDir = new MyHelperClass();
            FileOutputStream fos = new FileOutputStream((int)(Object)dstDir + (int)(Object)File.separator + filename);
            byte[] buffer = new byte[4096];
            while ((cnt =(int)(Object) is.read(buffer, 0, buffer.length)) != -1) fos.write(buffer, 0, cnt);
            fos.close();
            is.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getFile(){ return null; }}

class URLConnection {

public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class File {
public static MyHelperClass separator;
File(){}
	File(MyHelperClass o0){}
	public MyHelperClass getName(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(String o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
