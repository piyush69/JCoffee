
import java.io.UncheckedIOException;


class c11752189 {

    public static void main(String[] args) {
        MyHelperClass FileDialog = new MyHelperClass();
        FileDialog fd = new FileDialog(new Frame(), "Find a .def file", FileDialog.LOAD);
        boolean proceed = true;
        String input = "";
        DataInputStream dis;
        OutputStream out;
        InputStream in;
        File out_file, in_file;
        byte[] buffer = new byte[2048];
        int bytes_read;
        while (proceed) {
            fd.show();
            if (fd.getFile() != null) {
                try {
                    in_file = new File(fd.getDirectory(), fd.getFile());
                    out_file = new File(fd.getDirectory(), fd.getFile() + ".out");
                    out =(OutputStream)(Object) new FileOutputStream(out_file);
                    in =(InputStream)(Object) new MSZipInputStream(new FileInputStream(in_file));
                    while ((bytes_read =(int)(Object) in.read(buffer)) != -1) out.write(buffer, 0, bytes_read);
                    in.close();
                    out.close();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Do another (y/n)?");
            dis = new DataInputStream((InputStream)(Object)System.in);
            try {
                input =(String)(Object) dis.readLine();
            } catch (Exception blah) {
            }
            if (input.toLowerCase().startsWith("n")) proceed = false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass LOAD;
}

class FileDialog {

FileDialog(){}
	FileDialog(Frame o0, String o1, MyHelperClass o2){}
	public MyHelperClass show(){ return null; }
	public MyHelperClass getFile(){ return null; }
	public MyHelperClass getDirectory(){ return null; }}

class Frame {

}

class DataInputStream {

DataInputStream(InputStream o0){}
	DataInputStream(){}
	public MyHelperClass readLine(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class File {

File(MyHelperClass o0, MyHelperClass o1){}
	File(){}
	File(MyHelperClass o0, String o1){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class MSZipInputStream {

MSZipInputStream(FileInputStream o0){}
	MSZipInputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
