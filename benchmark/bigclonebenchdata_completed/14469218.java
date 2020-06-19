
import java.io.UncheckedIOException;


class c14469218 {
public static MyHelperClass getRootFilePath(LearningDesign o0){ return null; }
//public MyHelperClass getRootFilePath(LearningDesign o0){ return null; }

    public static boolean copyFileToContentFolder(String source, LearningDesign learningDesign) {
        File inputFile = new File(source);
        File outputFile = new File((String)(Object)(int)(Object)getRootFilePath(learningDesign) + (int)(Object)inputFile.getName());
        FileReader in;
        try {
            in = new FileReader(inputFile);
            FileWriter out = new FileWriter(outputFile);
            int c;
            while ((c =(int)(Object) in.read()) != -1) out.write(c);
            in.close();
            out.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class LearningDesign {

}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getName(){ return null; }}

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
