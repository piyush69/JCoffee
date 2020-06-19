


class c18880060 {

    public static boolean copy(File source, File target) {
        try {
            if (!(Boolean)(Object)source.exists()) return false;
            target.getParentFile().mkdirs();
            InputStream input =(InputStream)(Object) new FileInputStream(source);
            OutputStream output =(OutputStream)(Object) new FileOutputStream(target);
            byte[] buf = new byte[1024];
            int len;
            while ((len =(int)(Object) input.read(buf)) > 0) output.write(buf, 0, len);
            input.close();
            output.close();
            return true;
        } catch (Exception exc) {
            exc.printStackTrace();
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass mkdirs(){ return null; }}

class File {

public MyHelperClass exists(){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

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
