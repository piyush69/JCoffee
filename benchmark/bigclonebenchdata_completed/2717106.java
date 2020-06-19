
import java.io.UncheckedIOException;


class c2717106 {
public MyHelperClass JOptionPane;

    private void performDownload() {
        MyHelperClass filesPane = new MyHelperClass();
        List selected =(List)(Object) filesPane.getSelectedValuesList();
        if (selected == null || (boolean)(Object)selected.isEmpty() ||(int)(Object) selected.size() != 1) {
            MyHelperClass JOptionPane = new MyHelperClass();
            JOptionPane.showMessageDialog(this, "Please select one path");
            return;
        }
        RFile file = new RFile(selected.get(0));
        if (!(Boolean)(Object)file.isFile()) {
            MyHelperClass JOptionPane = new MyHelperClass();
            JOptionPane.showMessageDialog(this, "file does not exist anymore");
            return;
        }
        MyHelperClass chooser = new MyHelperClass();
        chooser.setSelectedFile(new File(chooser.getCurrentDirectory(), file.getName()));
//        MyHelperClass chooser = new MyHelperClass();
        int ok =(int)(Object) chooser.showSaveDialog(this);
        MyHelperClass JFileChooser = new MyHelperClass();
        if (ok != (int)(Object)JFileChooser.APPROVE_OPTION) {
            return;
        }
        FileOutputStream fout = null;
        RFileInputStream in = null;
        try {
//            MyHelperClass chooser = new MyHelperClass();
            fout = new FileOutputStream(chooser.getSelectedFile());
            in = new RFileInputStream(file);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(in, fout);
//            MyHelperClass chooser = new MyHelperClass();
            JOptionPane.showMessageDialog(this, "File downloaded to " + chooser.getSelectedFile(), "Download finished", JOptionPane.INFORMATION_MESSAGE);
        } catch (UncheckedIOException iOException) {
            MyHelperClass JOptionPane = new MyHelperClass();
            JOptionPane.showMessageDialog(this, "Error: " + iOException, "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (Throwable t) {
                }
            }
            if (fout != null) {
                try {
                    fout.close();
                } catch (Throwable t) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
	public MyHelperClass APPROVE_OPTION;
	public MyHelperClass INFORMATION_MESSAGE;
public MyHelperClass showMessageDialog(c2717106 o0, String o1){ return null; }
	public MyHelperClass copy(RFileInputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass setSelectedFile(File o0){ return null; }
	public MyHelperClass showMessageDialog(c2717106 o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass getSelectedFile(){ return null; }
	public MyHelperClass getSelectedValuesList(){ return null; }
	public MyHelperClass getCurrentDirectory(){ return null; }
	public MyHelperClass showSaveDialog(c2717106 o0){ return null; }}

class List {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass isEmpty(){ return null; }}

class RFile {

RFile(MyHelperClass o0){}
	RFile(){}
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass getName(){ return null; }}

class File {

File(MyHelperClass o0, MyHelperClass o1){}
	File(){}}

class FileOutputStream {

FileOutputStream(MyHelperClass o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}

class RFileInputStream {

RFileInputStream(RFile o0){}
	RFileInputStream(){}
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
