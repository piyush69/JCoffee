import java.io.*;
import java.lang.*;
import java.util.*;



class c16116703 {
public MyHelperClass[] files;
	public MyHelperClass SWT;
//public MyHelperClass files;
	public MyHelperClass IVC;
	public MyHelperClass updateSaved(int o0, boolean o1){ return null; }

    private void save() {
        MyHelperClass list = new MyHelperClass();
        int[] selection =(int[])(Object) list.getSelectionIndices();
        String dir = System.getProperty("user.dir");
        for (int i = 0; i < selection.length; i++) {
MyHelperClass[] files = new MyHelperClass[5];
            File src =(File)(Object) files[selection[i]];
            MyHelperClass shell = new MyHelperClass();
            FileDialog dialog = new FileDialog(shell, SWT.SAVE);
            dialog.setFilterPath(dir);
            dialog.setFileName(src.getName());
            String destination =(String)(Object) dialog.open();
            if (destination != null) {
                File dest = new File(destination);
                try {
                    dest.createNewFile();
                    FileChannel srcC =(FileChannel)(Object) (new FileInputStream(src).getChannel());
                    FileChannel destC =(FileChannel)(Object) (new FileOutputStream(dest).getChannel());
                    destC.transferFrom(srcC, 0, srcC.size());
                    destC.close();
                    srcC.close();
                    updateSaved(selection[i], true);
                    files[selection[i]] =(MyHelperClass)(Object) dest;
                } catch (FileNotFoundException e) {
                    IVC.showError("Error!", "" + e.getMessage(), "");
                } catch (IOException e) {
                    IVC.showError("Error!", "" + e.getMessage(), "");
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SAVE;
public MyHelperClass getSelectionIndices(){ return null; }
	public MyHelperClass showError(String o0, String o1, String o2){ return null; }}

class FileDialog {

FileDialog(MyHelperClass o0, MyHelperClass o1){}
	FileDialog(){}
	public MyHelperClass open(){ return null; }
	public MyHelperClass setFileName(String o0){ return null; }
	public MyHelperClass setFilterPath(String o0){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }}
