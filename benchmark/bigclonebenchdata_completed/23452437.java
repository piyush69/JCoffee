


class c23452437 {

        private void internalCopy(File fSource, File file) throws FileNotFoundException, IOException {
            if (fSource.getName().equals("Thums.db")) return;
            System.out.println("copying " + fSource + " in " + file);
            OutputStream o =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream(file));
            InputStream i =(InputStream)(Object) new BufferedInputStream(new FileInputStream(fSource));
            byte[] b = new byte[8192];
            int n;
            while ((n =(int)(Object) i.read(b)) > 0) o.write(b, 0, n);
            i.close();
            o.close();
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass getName(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}
