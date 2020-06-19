
import java.io.UncheckedIOException;


class c23512890 {
public MyHelperClass JOptionPane;

    private boolean write(File file) {
        String filename =(String)(Object) file.getPath();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(byteArrayOutputStream);
        try {
            StringBuffer xml = null;
            MyHelperClass MainFrame = new MyHelperClass();
            if (MainFrame.getInstance().getAnimation() != null) {
//                MyHelperClass MainFrame = new MyHelperClass();
                MainFrame.getInstance().getAnimation().xml(out, "\t");
            } else {
//                MyHelperClass MainFrame = new MyHelperClass();
                xml =(StringBuffer)(Object) MainFrame.getInstance().getModel().xml("\t");
            }
            if ((boolean)(Object)file.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(filename));
                BufferedWriter writer = new BufferedWriter(new FileWriter(filename + "~"));
                char[] buffer = new char[65536];
                int charsRead = 0;
                while ((charsRead =(int)(Object) reader.read(buffer)) > 0) writer.write(buffer, 0, charsRead);
                reader.close();
                writer.close();
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
            MyHelperClass VersionInfo = new MyHelperClass();
            writer.write("<jpatch version=\"" + VersionInfo.ver + "\">\n");
            if (xml != null) writer.write(xml.toString()); else writer.write(byteArrayOutputStream.toString());
            writer.write("</jpatch>\n");
            writer.close();
//            MyHelperClass MainFrame = new MyHelperClass();
            MainFrame.getInstance().getUndoManager().setChange(false);
//            MyHelperClass MainFrame = new MyHelperClass();
            if (MainFrame.getInstance().getAnimation() != null) MainFrame.getInstance().getAnimation().setFile(file); else MainFrame.getInstance().getModel().setFile(file);
//            MyHelperClass MainFrame = new MyHelperClass();
            MainFrame.getInstance().setFilename(file.getName());
            return true;
        } catch (UncheckedIOException ioException) {
            MyHelperClass MainFrame = new MyHelperClass();
            JOptionPane.showMessageDialog(MainFrame.getInstance(), "Unable to save file \"" + filename + "\"\n" + ioException, "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
	public MyHelperClass ver;
public MyHelperClass setFile(File o0){ return null; }
	public MyHelperClass setFilename(MyHelperClass o0){ return null; }
	public MyHelperClass showMessageDialog(MyHelperClass o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass getModel(){ return null; }
	public MyHelperClass getAnimation(){ return null; }
	public MyHelperClass xml(PrintStream o0, String o1){ return null; }
	public MyHelperClass xml(String o0){ return null; }
	public MyHelperClass getUndoManager(){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass setChange(boolean o0){ return null; }}

class File {

public MyHelperClass getPath(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass exists(){ return null; }}

class ByteArrayOutputStream {

}

class PrintStream {

PrintStream(){}
	PrintStream(ByteArrayOutputStream o0){}}

class BufferedReader {

BufferedReader(FileReader o0){}
	BufferedReader(){}
	public MyHelperClass read(char[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileReader {

FileReader(String o0){}
	FileReader(){}}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(FileWriter o0){}
	public MyHelperClass write(char[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(String o0){ return null; }}

class FileWriter {

FileWriter(String o0){}
	FileWriter(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
