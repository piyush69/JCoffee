
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c14390570 {
public MyHelperClass warn(MyHelperClass o0, MyHelperClass o1){ return null; }
public MyHelperClass chooser;
	public MyHelperClass JOptionPane;
	public MyHelperClass getMessage(String o0){ return null; }

            public void actionPerformed(ActionEvent e) {
                MyHelperClass jd = new MyHelperClass();
                int returnVal =(int)(Object) chooser.showSaveDialog(jd);
                MyHelperClass JFileChooser = new MyHelperClass();
                if (returnVal == (int)(Object)JFileChooser.APPROVE_OPTION) {
                    MyHelperClass chooser = new MyHelperClass();
                    File file =(File)(Object) chooser.getSelectedFile();
                    String fileName =(String)(Object) file.getPath();
                    MyHelperClass StringUtil = new MyHelperClass();
                    String ext =(String)(Object) StringUtil.getLowerExtension(fileName);
                    if (!"png".equals(ext)) {
                        fileName += ".png";
                        file = new File(fileName);
                    }
                    boolean doIt = true;
                    if ((boolean)(Object)file.exists()) {
//                        MyHelperClass jd = new MyHelperClass();
                        int i =(int)(Object) JOptionPane.showConfirmDialog(jd, getMessage("warn_file_exist"));
                        MyHelperClass JOptionPane = new MyHelperClass();
                        if (i != (int)(Object)JOptionPane.YES_OPTION) doIt = false;
                    } else if (!(Boolean)(Object)file.getParentFile().exists()) {
                        doIt =(boolean)(Object) file.getParentFile().mkdirs();
                    }
                    if (doIt) {
                        FileChannel src = null;
                        FileChannel dest = null;
                        try {
                            MyHelperClass imageURL = new MyHelperClass();
                            src =(FileChannel)(Object) (new FileInputStream(imageURL.getPath()).getChannel());
                            dest =(FileChannel)(Object) (new FileOutputStream(fileName).getChannel());
                            src.transferTo(0, src.size(), dest);
                        } catch (UncheckedIOException e1) {
//                            MyHelperClass jd = new MyHelperClass();
                            warn(jd, getMessage("err_no_source_file"));
                        } catch (ArithmeticException e2) {
//                            MyHelperClass jd = new MyHelperClass();
                            warn(jd, getMessage("err_output_target"));
                        } finally {
                            try {
                                if (src != null) src.close();
                            } catch (UncheckedIOException e1) {
                            }
                            try {
                                if (dest != null) dest.close();
                            } catch (UncheckedIOException e1) {
                            }
                            src = null;
                            dest = null;
                        }
                    }
                }
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass APPROVE_OPTION;
	public MyHelperClass YES_OPTION;
public MyHelperClass getSelectedFile(){ return null; }
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass showConfirmDialog(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass showSaveDialog(MyHelperClass o0){ return null; }
	public MyHelperClass getLowerExtension(String o0){ return null; }}

class ActionEvent {

}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(MyHelperClass o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
