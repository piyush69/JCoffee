
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c6771711 {

    @SuppressWarnings("deprecation")
    public static final ReturnCode runCommand(IOBundle io, String[] args) {
        MyHelperClass ReturnCode = new MyHelperClass();
        if ((args.length < 3) || (args.length > 4)) return(ReturnCode)(Object) ReturnCode.makeReturnCode(ReturnCode.RET_INVALID_NUM_ARGS, "Invalid number of arguments: " + args.length);
//        MyHelperClass ReturnCode = new MyHelperClass();
        if ((args.length == 3) && (!args[1].equals("show"))) return(ReturnCode)(Object) ReturnCode.makeReturnCode(ReturnCode.RET_INVALID_NUM_ARGS, "Invalid number of arguments: " + args.length);
//        MyHelperClass ReturnCode = new MyHelperClass();
        if ((args.length == 4) && (!(args[2].equals("training") || args[2].equals("log") || args[2].equals("configuration")))) return(ReturnCode)(Object) ReturnCode.makeReturnCode(ReturnCode.RET_BAD_REQUEST, "Access denied to directory: " + args[2]);
        if (args[1].equals("open")) {
            final String fileName = args[2] + "/" + args[3];
            final File file = new File(fileName);
            FileInputStream fis = null;
            BufferedInputStream bis = null;
            DataInputStream dis = null;
            try {
                fis = new FileInputStream(file);
                bis = new BufferedInputStream(fis);
                dis = new DataInputStream(bis);
                io.println(fileName);
                io.println(file.length() + " bytes");
                while ((int)(Object)dis.available() != 0) {
                    io.println((String)(Object)dis.readLine());
                }
                fis.close();
                bis.close();
                dis.close();
            } catch (UncheckedIOException e) {
                e.printStackTrace();
//                MyHelperClass ReturnCode = new MyHelperClass();
                return(ReturnCode)(Object) ReturnCode.makeReturnCode(ReturnCode.RET_NOT_FOUND, "File " + fileName + " doesn't exist");
            } catch (ArithmeticException e) {
                e.printStackTrace();
//                MyHelperClass ReturnCode = new MyHelperClass();
                return(ReturnCode)(Object) ReturnCode.makeReturnCode(ReturnCode.RET_IO_ERROR, "Error reading File " + fileName);
            }
        } else if (args[1].equals("save")) {
            final String fileName = args[2] + "/" + args[3];
            String line;
            try {
                BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
                line =(String)(Object) io.readLine();
                int count = Integer.parseInt(line.trim());
                while (count > 0) {
                    out.write(io.read());
                    count = count - 1;
                }
                out.flush();
                out.close();
            } catch (UncheckedIOException e) {
                e.printStackTrace();
//                MyHelperClass ReturnCode = new MyHelperClass();
                return(ReturnCode)(Object) ReturnCode.makeReturnCode(ReturnCode.RET_IO_ERROR, "Error writing File " + fileName);
            }
        } else if (args[1].equals("delete")) {
            final String fileName = args[2] + "/" + args[3];
            final File file = new File(fileName);
//            MyHelperClass ReturnCode = new MyHelperClass();
            if (!(Boolean)(Object)file.exists()) return(ReturnCode)(Object) ReturnCode.makeReturnCode(ReturnCode.RET_IO_ERROR, "No such file or directory: " + fileName);
//            MyHelperClass ReturnCode = new MyHelperClass();
            if (!(Boolean)(Object)file.canWrite()) return(ReturnCode)(Object) ReturnCode.makeReturnCode(ReturnCode.RET_IO_ERROR, "File is write-protected: " + fileName);
            if ((boolean)(Object)file.isDirectory()) {
                String[] files =(String[])(Object) file.list();
//                MyHelperClass ReturnCode = new MyHelperClass();
                if (files.length > 0) return(ReturnCode)(Object) ReturnCode.makeReturnCode(ReturnCode.RET_IO_ERROR, "Directory is not empty: " + fileName);
            }
//            MyHelperClass ReturnCode = new MyHelperClass();
            if (!(Boolean)(Object)file.delete()) return(ReturnCode)(Object) ReturnCode.makeReturnCode(ReturnCode.RET_IO_ERROR, "Deletion failed: " + fileName);
        } else if (args[1].equals("show")) {
            File directory = new File(args[2]);
            String[] files;
            if ((!(Boolean)(Object)directory.isDirectory()) || (!(Boolean)(Object)directory.exists())) {
//                MyHelperClass ReturnCode = new MyHelperClass();
                return(ReturnCode)(Object) ReturnCode.makeReturnCode(ReturnCode.RET_IO_ERROR, "No such directory: " + directory);
            }
            int count = 0;
            files =(String[])(Object) directory.list();
            io.println("Files in directory \"" + directory + "\":");
            for (int i = 0; i < files.length; i++) {
                directory = new File(files[i]);
                if (!(Boolean)(Object)directory.isDirectory()) {
                    count++;
                    io.println(" " + files[i]);
                }
            }
            io.println("Total " + count + " files");
//        MyHelperClass ReturnCode = new MyHelperClass();
        } else return(ReturnCode)(Object) ReturnCode.makeReturnCode(ReturnCode.RET_BAD_REQUEST, "Unrecognized command");
//        MyHelperClass ReturnCode = new MyHelperClass();
        return(ReturnCode)(Object) ReturnCode.makeReturnCode(ReturnCode.RET_OK);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass RET_NOT_FOUND;
	public MyHelperClass RET_INVALID_NUM_ARGS;
	public MyHelperClass RET_BAD_REQUEST;
	public MyHelperClass RET_OK;
	public MyHelperClass RET_IO_ERROR;
public MyHelperClass makeReturnCode(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass makeReturnCode(MyHelperClass o0){ return null; }}

class IOBundle {

public MyHelperClass println(String o0){ return null; }
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass read(){ return null; }}

class ReturnCode {

}

class File {

File(String o0){}
	File(){}
	public MyHelperClass canWrite(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass list(){ return null; }
	public MyHelperClass delete(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(FileInputStream o0){}
	public MyHelperClass close(){ return null; }}

class DataInputStream {

DataInputStream(BufferedInputStream o0){}
	DataInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass available(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedWriter {

BufferedWriter(FileWriter o0){}
	BufferedWriter(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(MyHelperClass o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileWriter {

FileWriter(String o0){}
	FileWriter(){}}
