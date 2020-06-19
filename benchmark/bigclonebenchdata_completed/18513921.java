


class c18513921 {

    public static void copy(File src, File dst) {
        try {
            InputStream is = null;
            OutputStream os = null;
            try {
                MyHelperClass BUFFER_SIZE = new MyHelperClass();
                is =(InputStream)(Object) new BufferedInputStream(new FileInputStream(src), BUFFER_SIZE);
//                MyHelperClass BUFFER_SIZE = new MyHelperClass();
                os =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream(dst), BUFFER_SIZE);
//                MyHelperClass BUFFER_SIZE = new MyHelperClass();
                byte[] buffer = new byte[(int)(Object)BUFFER_SIZE];
                int len = 0;
                while ((len =(int)(Object) is.read(buffer)) > 0) os.write(buffer, 0, len);
            } finally {
                if (null != is) is.close();
                if (null != os) os.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(FileInputStream o0, MyHelperClass o1){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0, MyHelperClass o1){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
