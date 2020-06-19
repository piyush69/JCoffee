
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c7005226 {

    private void copyValidFile(File file, int cviceni) {
        try {
            MyHelperClass validovane = new MyHelperClass();
            String filename = String.format("%s%s%02d%s%s", validovane, File.separator, cviceni, File.separator, file.getName());
            boolean copy = false;
            File newFile = new File(filename);
            if ((boolean)(Object)newFile.exists()) {
                if ((int)(Object)file.lastModified() > (int)(Object)newFile.lastModified()) copy = true; else copy = false;
            } else {
                newFile.createNewFile();
                copy = true;
            }
            if (copy) {
                String EOL = "" + (char) 0x0D + (char) 0x0A;
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter(newFile);
                String line;
                while ((line =(String)(Object) br.readLine()) != null) fw.write(line + EOL);
                br.close();
                fw.close();
                newFile.setLastModified(file.lastModified());
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {
public static MyHelperClass separator;
File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass lastModified(){ return null; }
	public MyHelperClass setLastModified(MyHelperClass o0){ return null; }
	public MyHelperClass getName(){ return null; }}

class FileReader {

FileReader(){}
	FileReader(File o0){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(FileReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class FileWriter {

FileWriter(){}
	FileWriter(File o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(String o0){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
