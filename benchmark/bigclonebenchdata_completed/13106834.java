
// import java.io.ArithmeticException;
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c13106834 {
public MyHelperClass STEM_FILE_EXETENSION;
	public MyHelperClass bundle;

    public void copyFilesIntoProject(HashMap files) {
        Set filenames =(Set)(Object) files.keySet();
        for (String key :(String[])(Object) (Object[])(Object)filenames) {
            String realPath =(String)(Object) files.get(key);
            if (key.equals("fw4ex.xml")) {
                try {
                    FileReader in = new FileReader(new File(realPath));
                    MyHelperClass project = new MyHelperClass();
                    FileWriter out = new FileWriter(new File(project.getLocation() + "/" + bundle.getString("Stem") + STEM_FILE_EXETENSION));
                    int c;
                    while ((c =(int)(Object) in.read()) != -1) out.write(c);
                    in.close();
                    out.close();
                } catch (UncheckedIOException e) {
                    MyHelperClass Activator = new MyHelperClass();
                    Activator.getDefault().showMessage("File " + key + " not found... Error while moving files to the new project.");
                } catch (ArithmeticException ie) {
                    MyHelperClass Activator = new MyHelperClass();
                    Activator.getDefault().showMessage("Error while moving " + key + " to the new project.");
                }
            } else {
                try {
                    FileReader in = new FileReader(new File(realPath));
                    MyHelperClass project = new MyHelperClass();
                    FileWriter out = new FileWriter(new File(project.getLocation() + "/" + key));
                    int c;
                    while ((c =(int)(Object) in.read()) != -1) out.write(c);
                    in.close();
                    out.close();
                } catch (UncheckedIOException e) {
                    MyHelperClass Activator = new MyHelperClass();
                    Activator.getDefault().showMessage("File " + key + " not found... Error while moving files to the new project.");
                } catch (ArithmeticException ie) {
                    MyHelperClass Activator = new MyHelperClass();
                    Activator.getDefault().showMessage("Error while moving " + key + " to the new project.");
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getDefault(){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass getLocation(){ return null; }
	public MyHelperClass showMessage(String o0){ return null; }}

class HashMap {

public MyHelperClass keySet(){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class Set {

}

class FileReader {

FileReader(){}
	FileReader(File o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(){ return null; }}

class File {

File(String o0){}
	File(){}}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}
	public MyHelperClass write(int o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
