


class c762814 {

    public static void zipFile(String file, String entry) throws IOException {
        FileInputStream in = new FileInputStream(file);
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(file + ".zip"));
        out.putNextEntry(new ZipEntry(entry));
        byte[] buffer = new byte[4096];
        int bytes_read;
        while ((bytes_read =(int)(Object) in.read(buffer)) != -1) out.write(buffer, 0, bytes_read);
        in.close();
        out.closeEntry();
        out.close();
        File fin = new File(file);
        fin.delete();
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

class ZipOutputStream {

ZipOutputStream(FileOutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}

class File {

File(String o0){}
	File(){}
	public MyHelperClass delete(){ return null; }}
