
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c20239269 {
public static MyHelperClass JOptionPane;
//public MyHelperClass JOptionPane;

    public static void joinFiles(FileValidator validator, File target, File[] sources) {
        FileOutputStream fos = null;
        try {
            if (!(Boolean)(Object)validator.verifyFile(target)) return;
            fos = new FileOutputStream(target);
            FileInputStream fis = null;
            byte[] bytes = new byte[512];
            for (int i = 0; i < sources.length; i++) {
                fis = new FileInputStream(sources[i]);
                int nbread = 0;
                try {
                    while ((nbread =(int)(Object) fis.read(bytes)) > -1) {
                        fos.write(bytes, 0, nbread);
                    }
                } catch (UncheckedIOException ioe) {
                    MyHelperClass i18n = new MyHelperClass();
                    JOptionPane.showMessageDialog(null, ioe, i18n.getString("Failure"), JOptionPane.ERROR_MESSAGE);
                } finally {
                    fis.close();
                }
            }
        } catch (Exception e) {
            MyHelperClass i18n = new MyHelperClass();
            JOptionPane.showMessageDialog(null, e, i18n.getString("Failure"), JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (fos != null) fos.close();
            } catch (UncheckedIOException e) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
public MyHelperClass showMessageDialog(Object o0, Exception o1, MyHelperClass o2, MyHelperClass o3){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass showMessageDialog(Object o0, IOException o1, MyHelperClass o2, MyHelperClass o3){ return null; }}

class FileValidator {

public MyHelperClass verifyFile(File o0){ return null; }}

class File {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
