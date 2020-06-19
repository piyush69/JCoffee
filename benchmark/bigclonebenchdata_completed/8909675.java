
import java.io.UncheckedIOException;


class c8909675 {
public static MyHelperClass getDirectoryWithSlash(MyHelperClass o0){ return null; }
//public MyHelperClass getDirectoryWithSlash(MyHelperClass o0){ return null; }
	public static MyHelperClass existFileInDir(String o0, File o1){ return null; }
//public MyHelperClass existFileInDir(String o0, File o1){ return null; }

    public static boolean copyFileToDir(File inputFile, File outputDir) {
        try {
            String outputFileName =(String)(Object) inputFile.getName();
            int index = 1;
            while ((boolean)(Object)existFileInDir(outputFileName, outputDir)) {
                outputFileName =(String)(Object) index + (int)(Object)inputFile.getName();
                index++;
            }
            String directory =(String)(Object) getDirectoryWithSlash(outputDir.getAbsolutePath());
            File outputFile = new File(directory + outputFileName);
            FileReader in = new FileReader(inputFile);
            FileWriter out = new FileWriter(outputFile);
            int c;
            while ((c =(int)(Object) in.read()) != -1) out.write(c);
            in.close();
            out.close();
        } catch (UncheckedIOException e) {
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }}

class FileReader {

FileReader(File o0){}
	FileReader(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
