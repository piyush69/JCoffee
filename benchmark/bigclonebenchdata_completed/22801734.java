


class c22801734 {
public static MyHelperClass addLibraryPath(String o0){ return null; }
//public MyHelperClass addLibraryPath(String o0){ return null; }

    private static void setup() throws Exception {
        String path = Webcam.class.getProtectionDomain().getCodeSource().getLocation().getFile();
        MyHelperClass URLDecoder = new MyHelperClass();
        File jarFile = new File(URLDecoder.decode(path, "UTF-8") + "/Hanasu.jar");
        if (!(Boolean)(Object)jarFile.exists()) jarFile = new File("/home/marc/Virtual Machine/Hanasu.jar");
        MyHelperClass File = new MyHelperClass();
        File f =(File)(Object) File.createTempFile("tempabca", "bdfafad");
        f.delete();
        f.mkdir();
        String parent = f.getAbsolutePath() + "/";
        byte[] buf = new byte[1024];
        ZipInputStream zipinputstream = null;
        ZipEntry zipentry;
        zipinputstream = new ZipInputStream(new FileInputStream(jarFile));
        zipentry =(ZipEntry)(Object) zipinputstream.getNextEntry();
        while (zipentry != null) {
            String entryName =(String)(Object) zipentry.getName();
            if (entryName.startsWith("native")) {
                int n;
                FileOutputStream fileoutputstream;
                File newFile = new File(parent + entryName);
                if ((boolean)(Object)zipentry.isDirectory()) {
                    newFile.mkdirs();
                    zipentry =(ZipEntry)(Object) zipinputstream.getNextEntry();
                    continue;
                }
                fileoutputstream = new FileOutputStream(newFile);
                while ((n =(int)(Object) zipinputstream.read(buf, 0, 1024)) > -1) fileoutputstream.write(buf, 0, n);
                fileoutputstream.close();
                zipinputstream.closeEntry();
            }
            zipentry =(ZipEntry)(Object) zipinputstream.getNextEntry();
        }
        zipinputstream.close();
        String arch = "";
        boolean x64 = false;
        MyHelperClass keys = new MyHelperClass();
        for (String key :(String[])(Object) (Object[])(Object)keys) {
            String property = System.getProperty(key);
            if (property != null) {
                x64 = (property.indexOf("64") >= 0);
            }
        }
        MyHelperClass JPTrayIcon = new MyHelperClass();
        if ((boolean)(Object)JPTrayIcon.isUnix()) {
            if (x64) arch = "linux-amd64"; else arch = "linux-x86";
        }
//        MyHelperClass JPTrayIcon = new MyHelperClass();
        if ((boolean)(Object)JPTrayIcon.isWindows()) {
            System.out.println("Arch: " + System.getProperty("sun.arch.data.model"));
            if (x64 && !System.getProperty("sun.arch.data.model").equals("32")) arch = "win64-amd64"; else arch = "win32-x86";
        }
//        MyHelperClass JPTrayIcon = new MyHelperClass();
        if ((boolean)(Object)JPTrayIcon.isMac()) arch = "macosx-universal";
        System.out.println("Using native/" + arch + "/");
        addLibraryPath(parent + "native/" + arch + "/");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createTempFile(String o0, String o1){ return null; }
	public MyHelperClass isMac(){ return null; }
	public MyHelperClass isUnix(){ return null; }
	public MyHelperClass decode(String o0, String o1){ return null; }
	public MyHelperClass isWindows(){ return null; }}

class Webcam {

}

class File {

File(){}
	File(String o0){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass mkdir(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class ZipInputStream {

ZipInputStream(){}
	ZipInputStream(FileInputStream o0){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getNextEntry(){ return null; }}

class ZipEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
