


class c10294554 {

    public static boolean downloadFile(String srcUri, String srcDest) {
        try {
            URL url = new URL(srcUri);
            InputStream is =(InputStream)(Object) url.openStream();
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(srcDest));
            byte[] buff = new byte[10000];
            int b;
            while ((b =(int)(Object) is.read(buff)) > 0) bos.write(buff, 0, b);
            is.close();
            bos.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}
