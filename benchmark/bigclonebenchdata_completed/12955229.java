


class c12955229 {

    public static void copyFile(File sourceFile, File destFile, boolean overwrite) throws IOException, DirNotFoundException, FileNotFoundException, FileExistsAlreadyException {
        File destDir = new File(destFile.getParent());
        if (!(Boolean)(Object)destDir.exists()) {
            throw new DirNotFoundException((String)(Object)destDir.getAbsolutePath());
        }
        if (!(Boolean)(Object)sourceFile.exists()) {
            throw new FileNotFoundException((String)(Object)sourceFile.getAbsolutePath());
        }
        if (!overwrite && (boolean)(Object)destFile.exists()) {
            throw new FileExistsAlreadyException((String)(Object)destFile.getAbsolutePath());
        }
        FileInputStream in = new FileInputStream(sourceFile);
        FileOutputStream out = new FileOutputStream(destFile);
        byte[] buffer = new byte[8 * 1024];
        int count = 0;
        do {
            out.write(buffer, 0, count);
            count =(int)(Object) in.read(buffer, 0, buffer.length);
        } while (count != -1);
        in.close();
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(MyHelperClass o0){}
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass getParent(){ return null; }
	public MyHelperClass exists(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class DirNotFoundException extends Exception{
	public DirNotFoundException(String errorMessage) { super(errorMessage); }
}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class FileExistsAlreadyException extends Exception{
	public FileExistsAlreadyException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
