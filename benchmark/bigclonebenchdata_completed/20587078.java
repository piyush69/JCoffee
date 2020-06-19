
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c20587078 {

    public static void main(String[] a) {
        ArrayList allFilesToBeCopied = new ArrayList();
        MyHelperClass outputDir = new MyHelperClass();
        new File(outputDir).mkdirs();
        try {
            MyHelperClass completeFileWithDirToCathFileList = new MyHelperClass();
            FileReader fis = new FileReader(completeFileWithDirToCathFileList);
            BufferedReader bis = new BufferedReader(fis);
            String line = "";
            String currentCombo = "";
            while ((line =(String)(Object) bis.readLine()) != null) {
                String[] allEntries = line.split("\\s+");
                String fileName = allEntries[0];
                String thisCombo = allEntries[1] + allEntries[2] + allEntries[3] + allEntries[4];
                if (currentCombo.equals(thisCombo)) {
                } else {
                    System.out.println("merke: " + fileName);
                    allFilesToBeCopied.add(fileName);
                    currentCombo = thisCombo;
                }
            }
            System.out.println(allFilesToBeCopied.size());
            for (String file :(String[])(Object) (Object[])(Object)allFilesToBeCopied) {
                try {
                    MyHelperClass CathDir = new MyHelperClass();
                    FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(CathDir + file).getChannel());
//                    MyHelperClass outputDir = new MyHelperClass();
                    FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(outputDir + file).getChannel());
                    dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
                    srcChannel.close();
                    dstChannel.close();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                }
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

class ArrayList {

public MyHelperClass add(String o0){ return null; }
	public MyHelperClass size(){ return null; }}

class File {

File(){}
	File(MyHelperClass o0){}
	public MyHelperClass mkdirs(){ return null; }}

class FileReader {

FileReader(){}
	FileReader(MyHelperClass o0){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(FileReader o0){}
	public MyHelperClass readLine(){ return null; }}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}
