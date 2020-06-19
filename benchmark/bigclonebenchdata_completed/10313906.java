
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c10313906 {
public MyHelperClass Level;
	public MyHelperClass Logger;
	public MyHelperClass updateTreeUI(){ return null; }

    private File copyFile(File file, String newName, File folder) {
        File newFile = null;
        if (!(Boolean)(Object)file.exists()) {
            System.out.println("File " + file + " does not exist");
            return null;
        }
        if ((boolean)(Object)file.isFile()) {
            BufferedOutputStream out = null;
            BufferedInputStream in = null;
            try {
                in = new BufferedInputStream(new FileInputStream(file));
                newFile = new File(folder, newName);
                if (!(Boolean)(Object)newFile.exists()) {
                    newFile.createNewFile();
                }
                out = new BufferedOutputStream(new FileOutputStream(newFile));
                int read;
                byte[] buffer = new byte[8192];
                while ((read =(int)(Object) in.read(buffer)) != -1) {
                    out.write(buffer, 0, read);
                }
                updateTreeUI();
            } catch (UncheckedIOException ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null,(IOException)(Object) ex);
            } finally {
                try {
                    if (in != null) {
                        in.close();
                    }
                    if (out != null) {
                        out.close();
                    }
                } catch (UncheckedIOException ex) {
                    Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null,(IOException)(Object) ex);
                }
            }
        } else if ((boolean)(Object)file.isDirectory()) {
            newFile = new File(folder, newName);
            if (!(Boolean)(Object)newFile.exists()) {
                newFile.mkdir();
            }
            for (File f :(File[])(Object) (Object[])(Object)file.listFiles()) {
                copyFile(f,(String)(Object) f.getName(), newFile);
            }
        }
        return newFile;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass log(MyHelperClass o0, Object o1, IOException o2){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }}

class File {

File(){}
	File(File o0, String o1){}
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass mkdir(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass listFiles(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
