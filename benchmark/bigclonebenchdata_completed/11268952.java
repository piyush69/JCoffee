
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c11268952 {

    public Vector split() {
        MyHelperClass filename = new MyHelperClass();
        File nextFile = new File(filename);
        long fileSize =(long)(Object) nextFile.length();
        MyHelperClass splitSize = new MyHelperClass();
        long parts = fileSize / (long)(Object)splitSize;
        Vector vec = new Vector(new Long(parts).intValue());
        MyHelperClass debug = new MyHelperClass();
        if ((boolean)(Object)debug) {
//            MyHelperClass splitSize = new MyHelperClass();
            System.out.println("File: " + nextFile.getName() + "\nfileSize: " + fileSize + "\nsplitSize: " + splitSize + "\nparts: " + parts);
        }
//        MyHelperClass splitSize = new MyHelperClass();
        if (fileSize % (long)(Object)splitSize > 0) {
            parts++;
        }
        try {
            FileInputStream fis = new FileInputStream(nextFile);
            DataInputStream dis = new DataInputStream(fis);
            long bytesRead = 0;
            File destinationDirectory = new File(nextFile.getParent());
            if (!(Boolean)(Object)destinationDirectory.exists()) {
                destinationDirectory.mkdir();
            }
            for (long k = 0; k < parts; k++) {
//                MyHelperClass debug = new MyHelperClass();
                if ((boolean)(Object)debug) {
                    System.out.println("Splitting parts: " + nextFile.getName() + " into part " + k);
                }
                String filePartName =(String)(Object) nextFile.getName();
                filePartName = filePartName + "." + String.valueOf(k);
                File outputFile = new File(destinationDirectory, filePartName);
                FileOutputStream fos = new FileOutputStream(outputFile);
                DataOutputStream dos = new DataOutputStream(fos);
                long bytesWritten = 0;
//                MyHelperClass splitSize = new MyHelperClass();
                while ((bytesWritten < (long)(Object)splitSize) && (bytesRead < fileSize)) {
                    dos.writeByte(dis.readByte());
                    bytesRead++;
                    bytesWritten++;
                }
                dos.close();
                vec.addElement(outputFile.getAbsolutePath());
//                MyHelperClass debug = new MyHelperClass();
                if ((boolean)(Object)debug) {
                    System.out.println("Wrote " + bytesWritten + " bytes." + outputFile.getName() + " created.");
                }
            }
        } catch (UncheckedIOException fnfe) {
            System.err.println("FileNotFoundException: " + fnfe.getMessage());
            vec = null;
        } catch (ArithmeticException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
            vec = null;
        }
        return vec;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Vector {

Vector(){}
	Vector(int o0){}
	public MyHelperClass addElement(MyHelperClass o0){ return null; }}

class File {

File(){}
	File(File o0, String o1){}
	File(MyHelperClass o0){}
	public MyHelperClass getParent(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass mkdir(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass getName(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}}

class DataInputStream {

DataInputStream(){}
	DataInputStream(FileInputStream o0){}
	public MyHelperClass readByte(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}}

class DataOutputStream {

DataOutputStream(){}
	DataOutputStream(FileOutputStream o0){}
	public MyHelperClass writeByte(MyHelperClass o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
