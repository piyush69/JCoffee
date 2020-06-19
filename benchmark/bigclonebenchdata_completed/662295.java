


class c662295 {

    public static void copy(URL url, String outPath) throws IOException {
        System.out.println("copying from: " + url + " to " + outPath);
        InputStream in =(InputStream)(Object) url.openStream();
        FileOutputStream fout = new FileOutputStream(outPath);
        byte[] data = new byte[8192];
        int read = -1;
        while ((read =(int)(Object) in.read(data)) != -1) {
            fout.write(data, 0, read);
        }
        fout.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
