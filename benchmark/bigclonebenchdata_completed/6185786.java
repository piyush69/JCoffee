


class c6185786 {

    protected void copyFile(File from, File to) throws IOException {
        to.getParentFile().mkdirs();
        InputStream in =(InputStream)(Object) new FileInputStream(from);
        try {
            OutputStream out =(OutputStream)(Object) new FileOutputStream(to);
            try {
                byte[] buf = new byte[1024];
                int readLength;
                while ((readLength =(int)(Object) in.read(buf)) > 0) {
                    out.write(buf, 0, readLength);
                }
            } finally {
                out.close();
            }
        } finally {
            in.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass mkdirs(){ return null; }}

class File {

public MyHelperClass getParentFile(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
