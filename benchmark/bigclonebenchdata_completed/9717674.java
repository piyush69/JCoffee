
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c9717674 {
public int howmany;
	public MyHelperClass getFileName(JarEntry o0){ return null; }
//public MyHelperClass howmany;
	public MyHelperClass PREFIX;
	public MyHelperClass dest;
	public MyHelperClass getProjectFile(String o0){ return null; }

    private void extractSourceFiles(String jar) {
        JarInputStream in = null;
        BufferedOutputStream out = null;
        try {
            in = new JarInputStream(new FileInputStream(getProjectFile(jar)));
            JarEntry item;
            byte buffer[] = new byte[4096];
            int buflength;
            while ((item =(JarEntry)(Object) in.getNextJarEntry()) != null) if ((boolean)(Object)item.getName().startsWith(PREFIX) && (!(Boolean)(Object)item.getName().endsWith("/"))) {
                out = new BufferedOutputStream(new FileOutputStream(new File(dest, getFileName(item))));
                while ((buflength =(int)(Object) in.read(buffer)) != -1) out.write(buffer, 0, buflength);
                howmany++;
                out.flush();
                out.close();
                out = null;
            }
        } catch (UncheckedIOException ex) {
            System.out.println("Unable to parse file " + jar + ", reason: " + ex.getMessage());
        } finally {
            try {
                if (in != null) in.close();
            } catch (UncheckedIOException ex) {
            }
            try {
                if (out != null) out.close();
            } catch (UncheckedIOException ex) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass startsWith(MyHelperClass o0){ return null; }
	public MyHelperClass endsWith(String o0){ return null; }}

class JarInputStream {

JarInputStream(){}
	JarInputStream(FileInputStream o0){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass getNextJarEntry(){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}}

class JarEntry {

public MyHelperClass getName(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class File {

File(MyHelperClass o0, MyHelperClass o1){}
	File(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
