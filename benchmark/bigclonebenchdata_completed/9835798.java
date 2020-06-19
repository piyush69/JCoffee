


class c9835798 {

    public static void saveFile(final URL url, final File file) throws IOException {
        final InputStream in =(InputStream)(Object) url.openStream();
        final FileOutputStream out = new FileOutputStream(file);
        byte[] data = new byte[8 * 1024];
        int length;
        while ((length =(int)(Object) in.read(data)) != -1) {
            out.write(data, 0, length);
        }
        in.close();
        out.close();
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

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
