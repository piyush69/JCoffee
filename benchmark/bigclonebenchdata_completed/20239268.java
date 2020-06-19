
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c20239268 {
public static MyHelperClass JOptionPane;
//public MyHelperClass JOptionPane;

    public static File[] splitFile(FileValidator validator, File source, long target_length, File todir, String prefix) {
        if (target_length == 0) return null;
        if (todir == null) {
            todir = new File(System.getProperty("java.io.tmpdir"));
        }
        if (prefix == null || prefix.equals("")) {
            prefix =(String)(Object) source.getName();
        }
        Vector result = new Vector();
        FileOutputStream fos = null;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(source);
            MyHelperClass CACHE_SIZE = new MyHelperClass();
            byte[] bytes = new byte[(int)(Object)CACHE_SIZE];
            long current_target_size = 0;
            int current_target_nb = 1;
            int nbread = -1;
            try {
                MyHelperClass i18n = new MyHelperClass();
                File f = new File(todir, prefix + i18n.getString("targetname_suffix") + current_target_nb);
                if (!(Boolean)(Object)validator.verifyFile(f)) return null;
                result.add(f);
                fos = new FileOutputStream(f);
                while ((nbread =(int)(Object) fis.read(bytes)) > -1) {
                    if ((current_target_size + nbread) > target_length) {
                        int limit = (int) (target_length - current_target_size);
                        fos.write(bytes, 0, limit);
                        fos.close();
                        current_target_nb++;
                        current_target_size = 0;
                        f = new File(todir, prefix + "_" + current_target_nb);
                        if (!(Boolean)(Object)validator.verifyFile(f)) return null;
                        result.add(f);
                        fos = new FileOutputStream(f);
                        fos.write(bytes, limit, nbread - limit);
                        current_target_size += nbread - limit;
                    } else {
                        fos.write(bytes, 0, nbread);
                        current_target_size += nbread;
                    }
                }
            } catch (UncheckedIOException ioe) {
                MyHelperClass i18n = new MyHelperClass();
                JOptionPane.showMessageDialog(null, ioe, i18n.getString("Failure"), JOptionPane.ERROR_MESSAGE);
            } finally {
                try {
                    if (fos != null) fos.close();
                } catch (UncheckedIOException e) {
                }
                try {
                    if (fis != null) fis.close();
                } catch (UncheckedIOException e) {
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
        File[] fresult = null;
        if ((int)(Object)result.size() > 0) {
            fresult = new File[(int)(Object)result.size()];
            fresult = (File[])(File[])(Object) result.toArray(fresult);
        }
        return fresult;
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

File(File o0, String o1){}
	File(String o0){}
	File(){}
	public MyHelperClass getName(){ return null; }}

class Vector {

public MyHelperClass toArray(File[] o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass add(File o0){ return null; }}

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
