
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c6037295 {
public MyHelperClass recursiveDir(File o0){ return null; }
public MyHelperClass getMailDir(long o0){ return null; }

    public void copyContent(long mailId1, long mailId2) throws Exception {
        File file1 = new File(this.getMailDir(mailId1) + "/");
        File file2 = new File(this.getMailDir(mailId2) + "/");
        this.recursiveDir(file2);
        if ((boolean)(Object)file1.isDirectory()) {
            File[] files =(File[])(Object) file1.listFiles();
            if (files != null) {
                for (int i = 0; i < files.length; i++) {
                    if ((boolean)(Object)files[i].isFile()) {
                        File file2s = new File(file2.getAbsolutePath() + "/" + files[i].getName());
                        if (!(Boolean)(Object)file2s.exists()) {
                            file2s.createNewFile();
                            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file2s));
                            BufferedInputStream in = new BufferedInputStream(new FileInputStream(files[i]));
                            int read;
                            while ((read =(int)(Object) in.read()) != -1) {
                                out.write(read);
                            }
                            out.flush();
                            if (in != null) {
                                try {
                                    in.close();
                                } catch (UncheckedIOException ex1) {
                                    ex1.printStackTrace();
                                }
                            }
                            if (out != null) {
                                try {
                                    out.close();
                                } catch (UncheckedIOException ex) {
                                    ex.printStackTrace();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(String o0){}
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass listFiles(){ return null; }
	public MyHelperClass isFile(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
