


class c15203217 {

    static void getFileClient(String fsName, String id, File[] localPath) throws IOException {
        MyHelperClass BUFFER_SIZE = new MyHelperClass();
        byte[] buf = new byte[(int)(Object)BUFFER_SIZE];
        StringBuffer str = new StringBuffer("http://" + fsName + "/getimage?");
        str.append(id);
        URL url = new URL(str.toString());
        URLConnection connection =(URLConnection)(Object) url.openConnection();
        InputStream stream =(InputStream)(Object) connection.getInputStream();
        FileOutputStream[] output = null;
        try {
            if (localPath != null) {
                output = new FileOutputStream[localPath.length];
                for (int i = 0; i < output.length; i++) {
                    output[i] = new FileOutputStream(localPath[i]);
                }
            }
            int num = 1;
            while (num > 0) {
                num =(int)(Object) stream.read(buf);
                if (num > 0 && localPath != null) {
                    for (int i = 0; i < output.length; i++) {
                        output[i].write(buf, 0, num);
                    }
                }
            }
        } finally {
            stream.close();
            if (output != null) {
                for (int i = 0; i < output.length; i++) {
                    if (output[i] != null) {
                        output[i].close();
                    }
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
