


class c12185344 {

    private static boolean extractFromJarUsingClassLoader(String searchString, String filename, String destinationDirectory) {
        ClassLoader cl = null;
        try {
            Class clClass = Class.forName("com.simontuffs.onejar.JarClassLoader");
            Constructor[] constructor =(Constructor[])(Object) clClass.getConstructors();
            cl = (ClassLoader)(ClassLoader)(Object) constructor[1].newInstance(ClassLoader.getSystemClassLoader());
            System.out.println("Loaded JarClassLoader. cl=" + cl.toString());
        } catch (Throwable e) {
            cl = ClassLoader.getSystemClassLoader();
        }
        URL liburl =(URL)(Object) cl.getResource(filename);
        if (liburl == null) {
            return false;
        }
        MyHelperClass File = new MyHelperClass();
        if (!destinationDirectory.endsWith((String)(Object)File.separator)) {
//            MyHelperClass File = new MyHelperClass();
            destinationDirectory = destinationDirectory + File.separator;
        }
        try {
            File destFile = new File(destinationDirectory + filename);
            if ((boolean)(Object)destFile.exists()) {
                destFile.delete();
            }
            InputStream is;
            is =(InputStream)(Object) liburl.openStream();
            OutputStream os =(OutputStream)(Object) new FileOutputStream(destinationDirectory + filename);
            byte[] buf = new byte[4096];
            int cnt =(int)(Object) is.read(buf);
            while (cnt > 0) {
                os.write(buf, 0, cnt);
                cnt =(int)(Object) is.read(buf);
            }
            os.close();
            is.close();
            destFile.deleteOnExit();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
}

class Constructor {

public MyHelperClass newInstance(ClassLoader o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class File {

File(){}
	File(String o0){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass deleteOnExit(){ return null; }
	public MyHelperClass exists(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}
