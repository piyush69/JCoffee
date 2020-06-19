
import java.io.UncheckedIOException;


class c7422454 {

    public void run() {
        MyHelperClass name = new MyHelperClass();
        if (name == null) {
            System.err.println("Must set file name for retrieval");
            return;
        }
        MyHelperClass handle = new MyHelperClass();
        if (handle == null) {
            System.err.println("Must set CCNHandle");
            return;
        }
        MyHelperClass htmlPane = new MyHelperClass();
        if (htmlPane == null) {
            System.err.println("Must set JEditorPane");
            return;
        }
        JFrame frame = new JFrame();
        JFileChooser chooser = new JFileChooser();
        File f = null;
        chooser.setCurrentDirectory(null);
        int returnVal =(int)(Object) chooser.showSaveDialog(frame);
        MyHelperClass JFileChooser = new MyHelperClass();
        if (returnVal == (int)(Object)JFileChooser.APPROVE_OPTION) {
            f =(File)(Object) chooser.getSelectedFile();
        } else {
//            MyHelperClass htmlPane = new MyHelperClass();
            htmlPane.setText("Save File cancelled");
            return;
        }
        boolean overwrite = false;
        try {
            if ((boolean)(Object)f.exists()) {
//                MyHelperClass htmlPane = new MyHelperClass();
                htmlPane.setText("Overwriting contents of " + f.getPath());
                overwrite = true;
            } else {
                f.createNewFile();
            }
            if ((boolean)(Object)f.canWrite()) {
            } else {
//                MyHelperClass htmlPane = new MyHelperClass();
                htmlPane.setText("The ContentExplorer is unable to write the content to the specified file.");
                return;
            }
        } catch (UncheckedIOException e) {
            System.err.println("could not create " + f.getPath() + " for saving content to filesystem");
//            MyHelperClass htmlPane = new MyHelperClass();
            htmlPane.setText("could not create " + f.getPath() + " for saving content to filesystem");
        }
        try {
//            MyHelperClass name = new MyHelperClass();
            if (!overwrite) htmlPane.setText("saving " + name + " to " + f.getCanonicalPath()); else htmlPane.setText("overwriting contents of " + f.getCanonicalPath() + " to save " + name);
//            MyHelperClass name = new MyHelperClass();
            CCNFileInputStream fis = new CCNFileInputStream(name, handle);
            FileOutputStream output = new FileOutputStream(f);
            MyHelperClass readsize = new MyHelperClass();
            byte[] buffer = new byte[(int)(Object)readsize];
            int readcount = 0;
            int readtotal = 0;
            while ((readcount =(int)(Object) fis.read(buffer)) != -1) {
                readtotal += readcount;
                output.write(buffer, 0, readcount);
                output.flush();
            }
//            MyHelperClass name = new MyHelperClass();
            htmlPane.setText("Saved " + name + " to " + f.getCanonicalPath());
        } catch (Exception e) {
//            MyHelperClass name = new MyHelperClass();
            htmlPane.setText("Could not save " + name + " to " + f.getPath() + " This may be a prefix for an object or just may not be available at this time.");
//            MyHelperClass name = new MyHelperClass();
            System.err.println("Could not retrieve file: " + name);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass APPROVE_OPTION;
public MyHelperClass setText(String o0){ return null; }}

class JFrame {

}

class JFileChooser {

public MyHelperClass showSaveDialog(JFrame o0){ return null; }
	public MyHelperClass setCurrentDirectory(Object o0){ return null; }
	public MyHelperClass getSelectedFile(){ return null; }}

class File {

public MyHelperClass getCanonicalPath(){ return null; }
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass canWrite(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class CCNFileInputStream {

CCNFileInputStream(MyHelperClass o0, MyHelperClass o1){}
	CCNFileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass flush(){ return null; }}
