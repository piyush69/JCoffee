


class c17608158 {

    public static void main(String[] args) {
        FileInputStream in;
        DeflaterOutputStream out;
        FileOutputStream fos;
        FileDialog fd;
        MyHelperClass FileDialog = new MyHelperClass();
        fd = new FileDialog(new Frame(), "Find a file to deflate", FileDialog.LOAD);
        fd.show();
        if (fd.getFile() != null) {
            try {
                in = new FileInputStream(new File(fd.getDirectory(), fd.getFile()));
                fos = new FileOutputStream(new File("Deflated.out"));
                MyHelperClass Deflater = new MyHelperClass();
                out = new DeflaterOutputStream(fos, new Deflater(Deflater.DEFLATED, true));
                int bytes_read = 0;
                byte[] buffer = new byte[1024];
                while ((bytes_read =(int)(Object) in.read(buffer)) != -1) {
                    out.write(buffer, 0, bytes_read);
                }
                fos.flush();
                fos.close();
                out.flush();
                out.close();
                in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Done");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass LOAD;
	public MyHelperClass DEFLATED;
}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(byte[] o0){ return null; }}

class DeflaterOutputStream {

DeflaterOutputStream(){}
	DeflaterOutputStream(FileOutputStream o0, Deflater o1){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass flush(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileDialog {

FileDialog(){}
	FileDialog(Frame o0, String o1, MyHelperClass o2){}
	public MyHelperClass show(){ return null; }
	public MyHelperClass getDirectory(){ return null; }
	public MyHelperClass getFile(){ return null; }}

class Frame {

}

class File {

File(MyHelperClass o0, MyHelperClass o1){}
	File(){}
	File(String o0){}}

class Deflater {

Deflater(MyHelperClass o0, boolean o1){}
	Deflater(){}}
