


class c8894166 {

    public static void saveFileFromURL(URL url, File destinationFile) throws IOException {
        FileOutputStream fo = new FileOutputStream(destinationFile);
        InputStream is =(InputStream)(Object) url.openStream();
        byte[] data = new byte[1024];
        int bytecount = 0;
        do {
            fo.write(data, 0, bytecount);
            bytecount =(int)(Object) is.read(data);
        } while (bytecount > 0);
        fo.flush();
        fo.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}
