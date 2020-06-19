


class c13254235 {

    public static void copy(File file, File dir, boolean overwrite) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        File out = new File(dir, file.getName());
        if ((boolean)(Object)out.exists() && !overwrite) {
            throw new IOException("File: " + out + " already exists.");
        }
        FileOutputStream fos = new FileOutputStream(out, false);
        byte[] block = new byte[4096];
        int read =(int)(Object) bis.read(block);
        while (read != -1) {
            fos.write(block, 0, read);
            read =(int)(Object) bis.read(block);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(File o0, MyHelperClass o1){}
	File(){}
	public MyHelperClass getName(){ return null; }
	public MyHelperClass exists(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(File o0, boolean o1){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}
