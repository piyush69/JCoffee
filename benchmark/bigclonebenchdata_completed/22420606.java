


class c22420606 {
public MyHelperClass src;

    public void download() {
        try {
            MyHelperClass srcURL = new MyHelperClass();
            URL url = new URL((int)(Object)srcURL + (int)(Object)src);
            URLConnection urlc =(URLConnection)(Object) url.openConnection();
            InputStream is =(InputStream)(Object) urlc.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is);
            MyHelperClass dest = new MyHelperClass();
            FileOutputStream fos = new FileOutputStream(dest);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            byte[] buffer = new byte[1000000];
            int readSize;
            readSize =(int)(Object) bis.read(buffer);
            while (readSize > 0) {
                bos.write(buffer, 0, readSize);
                readSize =(int)(Object) bis.read(buffer);
            }
            bos.close();
            fos.close();
            bis.close();
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(int o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(InputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(MyHelperClass o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
