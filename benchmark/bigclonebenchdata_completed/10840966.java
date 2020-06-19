
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c10840966 {
public MyHelperClass JOptionPane;

    public void copy(String sourcePath, String targetPath) throws IOException {
        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(sourceFile);
            fileOutputStream = new FileOutputStream(targetFile);
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead =(int)(Object) fileInputStream.read(buffer)) != -1) fileOutputStream.write(buffer, 0, bytesRead);
        } finally {
            if (fileInputStream != null) try {
                fileInputStream.close();
            } catch (UncheckedIOException exception) {
                MyHelperClass AcideLanguageManager = new MyHelperClass();
                JOptionPane.showMessageDialog(null, AcideLanguageManager.getInstance().getLabels().getString("s265") + sourcePath, AcideLanguageManager.getInstance().getLabels().getString("s266"), JOptionPane.ERROR_MESSAGE);
                MyHelperClass AcideLog = new MyHelperClass();
                AcideLog.getLog().error(exception.getMessage());
            }
            if (fileOutputStream != null) try {
                fileOutputStream.close();
            } catch (UncheckedIOException exception) {
                MyHelperClass AcideLanguageManager = new MyHelperClass();
                JOptionPane.showMessageDialog(null, AcideLanguageManager.getInstance().getLabels().getString("s267") + targetPath, AcideLanguageManager.getInstance().getLabels().getString("268"), JOptionPane.ERROR_MESSAGE);
                MyHelperClass AcideLog = new MyHelperClass();
                AcideLog.getLog().error(exception.getMessage());
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
public MyHelperClass getLog(){ return null; }
	public MyHelperClass getLabels(){ return null; }
	public MyHelperClass showMessageDialog(Object o0, String o1, MyHelperClass o2, MyHelperClass o3){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
