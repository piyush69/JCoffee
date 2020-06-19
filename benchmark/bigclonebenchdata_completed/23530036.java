
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c23530036 {
public MyHelperClass splitPane;
	public MyHelperClass JOptionPane;
	public MyHelperClass setModified(boolean o0){ return null; }

    public void save(boolean saveAs) {
        OutputStream outputStream = null;
        if (!saveAs) {
            try {
                URL url = new URL(null);
                outputStream =(OutputStream)(Object) url.openConnection().getOutputStream();
            } catch (Exception e) {
                outputStream = null;
            }
        }
        if (outputStream == null) {
            MyHelperClass graphEditorFrame = new MyHelperClass();
            JFileChooser fileChooser =(JFileChooser)(Object) graphEditorFrame.getFileChooser();
            MyHelperClass splitPane = new MyHelperClass();
            int option =(int)(Object) fileChooser.showSaveDialog(splitPane);
            MyHelperClass JFileChooser = new MyHelperClass();
            if (option == (int)(Object)JFileChooser.APPROVE_OPTION) {
                File file =(File)(Object) fileChooser.getSelectedFile();
                MyHelperClass tabPanel = new MyHelperClass();
                tabPanel.setText(file.getName());
                try {
                    outputStream =(OutputStream)(Object) new FileOutputStream(file);
                } catch (UncheckedIOException e) {
//                    MyHelperClass splitPane = new MyHelperClass();
                    JOptionPane.showMessageDialog(splitPane,(IOException)(Object) e);
                }
            } else {
                return;
            }
        }
        try {
            MyHelperClass nodeSpecTable = new MyHelperClass();
            Element rootElement =(Element)(Object) nodeSpecTable.toXML();
            MyHelperClass XMLHelper = new MyHelperClass();
            XMLHelper.write(rootElement, outputStream, null);
            outputStream.close();
            setModified(false);
        } catch (UncheckedIOException e) {
            JOptionPane.showMessageDialog(splitPane,(IOException)(Object) e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass APPROVE_OPTION;
public MyHelperClass showMessageDialog(MyHelperClass o0, IOException o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass toXML(){ return null; }
	public MyHelperClass setText(MyHelperClass o0){ return null; }
	public MyHelperClass getFileChooser(){ return null; }
	public MyHelperClass write(Element o0, OutputStream o1, Object o2){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class URL {

URL(Object o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class JFileChooser {

public MyHelperClass getSelectedFile(){ return null; }
	public MyHelperClass showSaveDialog(MyHelperClass o0){ return null; }}

class File {

public MyHelperClass getName(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Element {

}
