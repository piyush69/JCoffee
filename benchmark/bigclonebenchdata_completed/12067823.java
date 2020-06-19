import java.io.*;
import java.lang.*;
import java.util.*;



class c12067823 {
public MyHelperClass SWT;
	public MyHelperClass window;
	public MyHelperClass writeTextFile(Element o0, PrintWriter o1, int o2){ return null; }

    public void run() {
        MyHelperClass saveAsDialog = new MyHelperClass();
        if (saveAsDialog == null) {
//            MyHelperClass saveAsDialog = new MyHelperClass();
            saveAsDialog =(MyHelperClass)(Object) new FileDialog(window.getShell(), SWT.SAVE);
            MyHelperClass saveAsTypes = new MyHelperClass();
            saveAsDialog.setFilterExtensions(saveAsTypes);
        }
//        MyHelperClass saveAsDialog = new MyHelperClass();
        String outputFile =(String)(Object) saveAsDialog.open();
        if (outputFile != null) {
            MyHelperClass DataSourceSingleton = new MyHelperClass();
            Object inputFile = DataSourceSingleton.getInstance().getContainer().getWrapped();
            InputStream in;
            try {
                if (inputFile instanceof URL) in =(InputStream)(Object) ((URL) inputFile).openStream(); else in = new FileInputStream((File) inputFile);
                OutputStream out = new FileOutputStream(outputFile);
                if (outputFile.endsWith("xml")) {
                    int c;
                    while ((c = in.read()) != -1) out.write(c);
                } else {
                    PrintWriter pw = new PrintWriter(out);
//                    MyHelperClass DataSourceSingleton = new MyHelperClass();
                    Element data =(Element)(Object) DataSourceSingleton.getInstance().getRawData();
                    writeTextFile(data, pw, -1);
                    pw.close();
                }
                in.close();
                out.close();
            } catch (UncheckedIOException e1) {
            } catch (IOException e) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SAVE;
public MyHelperClass getWrapped(){ return null; }
	public MyHelperClass setFilterExtensions(MyHelperClass o0){ return null; }
	public MyHelperClass getContainer(){ return null; }
	public MyHelperClass open(){ return null; }
	public MyHelperClass getShell(){ return null; }
	public MyHelperClass getRawData(){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class Element {

}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class FileDialog {

FileDialog(MyHelperClass o0, MyHelperClass o1){}
	FileDialog(){}}
