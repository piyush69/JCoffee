


class c27715 {
public static MyHelperClass DO_BREAK_LINES;
//public MyHelperClass DO_BREAK_LINES;

    public static void main(String[] args) {
        try {
            int encodeFlag = 0;
            if (args[0].equals("-e")) {
                MyHelperClass Base64 = new MyHelperClass();
                encodeFlag =(int)(Object) Base64.ENCODE;
            } else if (args[0].equals("-d")) {
                MyHelperClass Base64 = new MyHelperClass();
                encodeFlag =(int)(Object) Base64.DECODE;
            }
            String infile = args[1];
            String outfile = args[2];
            File fin = new File(infile);
            FileInputStream fis = new FileInputStream(fin);
            BufferedInputStream bis = new BufferedInputStream(fis);
            InputStream b64in = new InputStream(bis, encodeFlag | (int)(Object)DO_BREAK_LINES);
            File fout = new File(outfile);
            FileOutputStream fos = new FileOutputStream(fout);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            byte[] buff = new byte[1024];
            int read = -1;
            while ((read =(int)(Object) b64in.read(buff)) >= 0) {
                bos.write(buff, 0, read);
            }
            bos.close();
            b64in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ENCODE;
	public MyHelperClass DECODE;
}

class File {

File(String o0){}
	File(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStream {

InputStream(){}
	InputStream(BufferedInputStream o0, int o1){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}
