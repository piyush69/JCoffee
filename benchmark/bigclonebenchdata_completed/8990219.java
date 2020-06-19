


class c8990219 {
public MyHelperClass getCachedFile(Get o0){ return null; }
	public MyHelperClass getDestFile(Get o0){ return null; }

    private boolean getCached(Get g) throws IOException {
        boolean ret = false;
        File f =(File)(Object) getCachedFile(g);
        if ((boolean)(Object)f.exists()) {
            InputStream is = null;
            OutputStream os = null;
            try {
                is =(InputStream)(Object) new FileInputStream(f);
                os =(OutputStream)(Object) new FileOutputStream(getDestFile(g));
                int read;
                byte[] buffer = new byte[4096];
                while ((read =(int)(Object) is.read(buffer)) > 0) {
                    os.write(buffer, 0, read);
                }
                ret = true;
            } finally {
                if (is != null) is.close();
                if (os != null) os.close();
                is = null;
                os = null;
            }
        }
        return ret;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Get {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

public MyHelperClass exists(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(MyHelperClass o0){}
	FileOutputStream(){}}
