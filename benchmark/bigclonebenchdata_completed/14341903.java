


class c14341903 {
public static MyHelperClass projectNameS;
	public static MyHelperClass baseDir;
	public static MyHelperClass basePackageS;
//public MyHelperClass baseDir;
//	public MyHelperClass basePackageS;
//	public MyHelperClass projectNameS;

    private static void processFile(String file) throws IOException {
        FileInputStream in = new FileInputStream(file);
        int read = 0;
        byte[] buf = new byte[2048];
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        while ((read =(int)(Object) in.read(buf)) > 0) bout.write(buf, 0, read);
        in.close();
        MyHelperClass webAppDir = new MyHelperClass();
        String converted = bout.toString().replaceAll("@project.name@",(String)(Object) projectNameS).replaceAll("@base.package@",(String)(Object) basePackageS).replaceAll("@base.dir@",(String)(Object) baseDir).replaceAll("@webapp.dir@",(String)(Object) webAppDir).replaceAll("path=\"target/classes\"", "path=\"src/main/webapp/WEB-INF/classes\"");
        FileOutputStream out = new FileOutputStream(file);
        out.write(converted.getBytes());
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }}
