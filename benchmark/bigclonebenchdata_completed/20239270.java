
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c20239270 {
public static MyHelperClass joinFiles(FileValidator o0, File o1, File[] o2){ return null; }
public static MyHelperClass MapMode;
	public static MyHelperClass JOptionPane;
//	public MyHelperClass joinFiles(FileValidator o0, File o1, File[] o2){ return null; }
//public MyHelperClass JOptionPane;
//	public MyHelperClass MapMode;

    public static void nioJoinFiles(FileValidator validator, File target, File[] sources) {
        boolean big_files = false;
        for (int i = 0; i < sources.length; i++) {
            if ((int)(Object)sources[i].length() > Integer.MAX_VALUE) {
                big_files = true;
                break;
            }
        }
        if (big_files) {
            joinFiles(validator, target, sources);
        } else {
            MyHelperClass i18n = new MyHelperClass();
            System.out.println(i18n.getString("jdk14_comment"));
            FileOutputStream fos = null;
            try {
                fos = new FileOutputStream(target);
                FileChannel fco =(FileChannel)(Object) fos.getChannel();
                FileInputStream fis = null;
                for (int i = 0; i < sources.length; i++) {
                    fis = new FileInputStream(sources[i]);
                    FileChannel fci =(FileChannel)(Object) fis.getChannel();
                    java.nio.MappedByteBuffer map;
                    try {
                        map =(java.nio.MappedByteBuffer)(Object)(MappedByteBuffer)(Object) fci.map(MapMode.READ_ONLY, 0, (int)(int)(Object) sources[i].length());
                        fco.write((MappedByteBuffer)(Object)map);
                        fci.close();
                    } catch (UncheckedIOException ioe) {
//                        MyHelperClass i18n = new MyHelperClass();
                        JOptionPane.showMessageDialog(null, ioe, i18n.getString("Failure"), JOptionPane.ERROR_MESSAGE);
                        try {
                            fis.close();
                            fos.close();
                        } catch (UncheckedIOException e) {
                        }
                    } finally {
                        fis.close();
                    }
                }
                fco.close();
            } catch (Exception e) {
//                MyHelperClass i18n = new MyHelperClass();
                JOptionPane.showMessageDialog(null, e, i18n.getString("Failure"), JOptionPane.ERROR_MESSAGE);
            } finally {
                try {
                    if (fos != null) fos.close();
                } catch (UncheckedIOException e) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
	public MyHelperClass READ_ONLY;
public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass showMessageDialog(Object o0, IOException o1, MyHelperClass o2, MyHelperClass o3){ return null; }
	public MyHelperClass showMessageDialog(Object o0, Exception o1, MyHelperClass o2, MyHelperClass o3){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass write(MappedByteBuffer o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass map(MyHelperClass o0, int o1, int o2){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileValidator {

}

class File {

public MyHelperClass length(){ return null; }}

class MappedByteBuffer {

}
