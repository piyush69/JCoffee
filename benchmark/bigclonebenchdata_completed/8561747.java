


class c8561747 {

    public static boolean copyFile(File source, File dest) throws IOException {
        MyHelperClass JOptionPane = new MyHelperClass();
        int answer =(int)(Object) JOptionPane.YES_OPTION;
        if ((boolean)(Object)dest.exists()) {
//            MyHelperClass JOptionPane = new MyHelperClass();
            answer =(int)(Object) JOptionPane.showConfirmDialog(null, "File " + dest.getAbsolutePath() + "\n already exists.  Overwrite?", "Warning", JOptionPane.YES_NO_OPTION);
        }
//        MyHelperClass JOptionPane = new MyHelperClass();
        if (answer == (int)(Object)JOptionPane.NO_OPTION) return false;
        dest.createNewFile();
        InputStream in = null;
        OutputStream out = null;
        try {
            in =(InputStream)(Object) new FileInputStream(source);
            out =(OutputStream)(Object) new FileOutputStream(dest);
            byte[] buf = new byte[1024];
            int len;
            while ((len =(int)(Object) in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NO_OPTION;
	public MyHelperClass YES_OPTION;
	public MyHelperClass YES_NO_OPTION;
public MyHelperClass showConfirmDialog(Object o0, String o1, String o2, MyHelperClass o3){ return null; }}

class File {

public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass exists(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

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

FileOutputStream(File o0){}
	FileOutputStream(){}}
