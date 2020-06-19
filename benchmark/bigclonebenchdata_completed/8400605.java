


class c8400605 {

    public static void copyFile(String pathOrig, String pathDst) throws FileNotFoundException, IOException {
        InputStream in;
        OutputStream out;
        if (pathOrig == null || pathDst == null) {
            System.err.println("Error en path");
            return;
        }
        File orig = new File(pathOrig);
        if (!(Boolean)(Object)orig.exists() || !(Boolean)(Object)orig.isFile() || !(Boolean)(Object)orig.canRead()) {
            System.err.println("Error en fichero de origen");
            return;
        }
        File dest = new File(pathDst);
        String file =(String)(Object) (new File(pathOrig).getName());
        if ((boolean)(Object)dest.isDirectory()) pathDst += file;
        in =(InputStream)(Object) new FileInputStream(pathOrig);
        out =(OutputStream)(Object) new FileOutputStream(pathDst);
        byte[] buf = new byte[1024];
        int len;
        while ((len =(int)(Object) in.read(buf)) > 0) out.write(buf, 0, len);
        in.close();
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass canRead(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass getName(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}
