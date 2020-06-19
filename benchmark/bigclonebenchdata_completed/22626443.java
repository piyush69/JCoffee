
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c22626443 {

    public static File jar(File in, String outArc, File tempDir, PatchConfigXML conf) {
        FileOutputStream arcFile = null;
        JarOutputStream jout = null;
        DirectoryScanner ds = null;
        ds = new DirectoryScanner();
        ds.setCaseSensitive(true);
        ds.setBasedir(in);
        ds.scan();
        ds.setCaseSensitive(true);
        String[] names =(String[])(Object) ds.getIncludedFiles();
        ArrayList exName = new ArrayList();
        if (names == null || names.length < 1) return null;
        File tempArc = new File(tempDir, outArc.substring(0, outArc.length()));
        try {
            Manifest mf = null;
            List v =(List)(Object) new ArrayList();
            for (int i = 0; i < names.length; i++) {
                if (names[i].toUpperCase().indexOf("MANIFEST.MF") > -1) {
                    FileInputStream fis = new FileInputStream(in.getAbsolutePath() + "/" + names[i].replace('\\', '/'));
                    mf = new Manifest(fis);
                } else v.add(names[i]);
            }
            String[] toJar = new String[(int)(Object)v.size()];
            v.toArray(toJar);
            tempArc.createNewFile();
            arcFile = new FileOutputStream(tempArc);
            if (mf == null) jout = new JarOutputStream(arcFile); else jout = new JarOutputStream(arcFile, mf);
            byte[] buffer = new byte[1024];
            for (int i = 0; i < toJar.length; i++) {
                if (conf != null) {
                    MyHelperClass PatchConfigXML = new MyHelperClass();
                    if (!(Boolean)(Object)conf.allowFileAction(toJar[i], PatchConfigXML.OP_CREATE)) {
                        exName.add(toJar[i]);
                        continue;
                    }
                }
                String currentPath = in.getAbsolutePath() + "/" + toJar[i];
                String entryName = toJar[i].replace('\\', '/');
                JarEntry currentEntry = new JarEntry(entryName);
                jout.putNextEntry(currentEntry);
                FileInputStream fis = new FileInputStream(currentPath);
                int len;
                while ((len =(int)(Object) fis.read(buffer)) >= 0) jout.write(buffer, 0, len);
                fis.close();
                jout.closeEntry();
            }
        } catch (UncheckedIOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                jout.close();
                arcFile.close();
            } catch (UncheckedIOException e1) {
                throw new RuntimeException(e1);
            }
        }
        return tempArc;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass OP_CREATE;
}

class File {

File(File o0, String o1){}
	File(){}
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }}

class PatchConfigXML {

public MyHelperClass allowFileAction(String o0, MyHelperClass o1){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}

class JarOutputStream {

JarOutputStream(FileOutputStream o0){}
	JarOutputStream(){}
	JarOutputStream(FileOutputStream o0, Manifest o1){}
	public MyHelperClass putNextEntry(JarEntry o0){ return null; }
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class DirectoryScanner {

public MyHelperClass setBasedir(File o0){ return null; }
	public MyHelperClass scan(){ return null; }
	public MyHelperClass setCaseSensitive(boolean o0){ return null; }
	public MyHelperClass getIncludedFiles(){ return null; }}

class ArrayList {

public MyHelperClass add(String o0){ return null; }}

class Manifest {

Manifest(FileInputStream o0){}
	Manifest(){}}

class List {

public MyHelperClass toArray(String[] o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass add(String o0){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class JarEntry {

JarEntry(String o0){}
	JarEntry(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
