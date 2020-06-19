


class c12261686 {
public MyHelperClass URL_DIRECTORY_SEPARATOR;
	public MyHelperClass PACKAGE_SEPARATOR;
	public MyHelperClass className;

//    @Override
    protected byte[] fetch0() throws IOException {
        MyHelperClass sourceFile = new MyHelperClass();
        if ((boolean)(Object)sourceFile.getProtocol().equalsIgnoreCase("jar")) {
            throw new IOException("Jar protocol unsupported!");
        } else {
            URL url;
            MyHelperClass CLASS_FILE_EXTENSION = new MyHelperClass();
            if ((boolean)(Object)sourceFile.getFile().endsWith(CLASS_FILE_EXTENSION)) {
//                MyHelperClass sourceFile = new MyHelperClass();
                url =(URL)(Object) sourceFile;
            } else {
//                MyHelperClass sourceFile = new MyHelperClass();
                url = new URL(sourceFile,(int)(Object) className.replace(PACKAGE_SEPARATOR, URL_DIRECTORY_SEPARATOR) + (int)(Object)CLASS_FILE_EXTENSION);
            }
            InputStream stream =(InputStream)(Object) url.openStream();
            try {
                ByteArrayOutputStream output = new ByteArrayOutputStream();
                MyHelperClass PACKET_SIZE = new MyHelperClass();
                byte[] buffer = new byte[(int)(Object)PACKET_SIZE];
                int bytesRead;
                while ((bytesRead =(int)(Object) stream.read(buffer, 0, buffer.length)) != -1) {
                    output.write(buffer, 0, bytesRead);
                }
                return(byte[])(Object) output.toByteArray();
            } finally {
                stream.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass endsWith(MyHelperClass o0){ return null; }
	public MyHelperClass equalsIgnoreCase(String o0){ return null; }
	public MyHelperClass getFile(){ return null; }
	public MyHelperClass getProtocol(){ return null; }
	public MyHelperClass replace(MyHelperClass o0, MyHelperClass o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(MyHelperClass o0, int o1){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass toByteArray(){ return null; }}
