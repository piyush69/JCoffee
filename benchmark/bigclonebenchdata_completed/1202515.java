


class c1202515 {

    public static void copyFile(URL url, File local) throws IOException {
        InputStream in = null;
        FileWriter writer = null;
        try {
            writer = new FileWriter(local);
            in =(InputStream)(Object) url.openStream();
            int c;
            while ((c =(int)(Object) in.read()) != -1) {
                writer.write(c);
            }
        } finally {
            try {
                writer.flush();
                writer.close();
                in.close();
            } catch (Exception ignore) {
                MyHelperClass LOGGER = new MyHelperClass();
                LOGGER.error(ignore);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(Exception o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileWriter {

FileWriter(){}
	FileWriter(File o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }
	public MyHelperClass flush(){ return null; }}
