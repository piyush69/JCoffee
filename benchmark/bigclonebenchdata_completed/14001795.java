


class c14001795 {
public static MyHelperClass Logger;
	public static MyHelperClass moveUnzipAndExtract(File o0){ return null; }
//public MyHelperClass Logger;
//	public MyHelperClass moveUnzipAndExtract(File o0){ return null; }

    public static void copyOverWarFile() {
        System.out.println("Copy Over War File:");
        MyHelperClass theAppsDataDir = new MyHelperClass();
        File dir = new File(theAppsDataDir);
        FileFilter ff =(FileFilter)(Object) new WildcardFileFilter("*.war");
        if ((int)(Object)dir.listFiles(ff).length == 0) {
            dir = new File(System.getProperty("user.dir") + "/war");
            if ((boolean)(Object)dir.exists()) {
                File[] files =(File[])(Object) dir.listFiles(ff);
                for (File f : files) {
                    try {
//                        MyHelperClass theAppsDataDir = new MyHelperClass();
                        File newFile = new File("" + theAppsDataDir + "/" + f.getName());
                        System.out.println("Creating new file \"" + f.getAbsolutePath() + "\"");
                        newFile.createNewFile();
                        InputStream fi =(InputStream)(Object) new FileInputStream(f);
                        OutputStream fo =(OutputStream)(Object) new FileOutputStream(newFile);
                        MyHelperClass IOUtils = new MyHelperClass();
                        IOUtils.copy(fi, fo);
                        moveUnzipAndExtract(newFile);
                    } catch (Exception ex) {
                        MyHelperClass Level = new MyHelperClass();
                        Logger.getLogger(AppDataDir.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        } else {
            System.out.println("Found a war in the apps data dir, ignoring a fresh copy");
        }
//        MyHelperClass theAppsDataDir = new MyHelperClass();
        new JFileChooser().setCurrentDirectory(new File(theAppsDataDir));
//        MyHelperClass theAppsDataDir = new MyHelperClass();
        System.setProperty("user.dir",(String)(Object) theAppsDataDir);
        System.out.println("User.dir : " + System.getProperty("user.dir"));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass length;
	public MyHelperClass SEVERE;
public MyHelperClass getLogger(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, Exception o2){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class File {

File(){}
	File(MyHelperClass o0){}
	File(String o0){}
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass listFiles(FileFilter o0){ return null; }}

class FileFilter {

}

class WildcardFileFilter {

WildcardFileFilter(String o0){}
	WildcardFileFilter(){}}

class InputStream {

}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class OutputStream {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class AppDataDir {

}

class JFileChooser {

public MyHelperClass setCurrentDirectory(File o0){ return null; }}
