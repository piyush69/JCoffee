


class c4750967 {
public MyHelperClass IOUtils;

    public void patch() throws IOException {
        MyHelperClass mods = new MyHelperClass();
        if ((boolean)(Object)mods.isEmpty()) {
            return;
        }
        MyHelperClass Paths = new MyHelperClass();
        IOUtils.copy(new FileInputStream(Paths.getMinecraftJarPath()), new FileOutputStream(new File(Paths.getMinecraftBackupPath())));
//        MyHelperClass Paths = new MyHelperClass();
        JarFile mcjar = new JarFile(Paths.getMinecraftJarPath());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getMinecraftBackupPath(){ return null; }
	public MyHelperClass getMinecraftJarPath(){ return null; }
	public MyHelperClass isEmpty(){ return null; }
	public MyHelperClass copy(FileInputStream o0, FileOutputStream o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}}

class JarFile {

JarFile(MyHelperClass o0){}
	JarFile(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class File {

File(MyHelperClass o0){}
	File(){}}
