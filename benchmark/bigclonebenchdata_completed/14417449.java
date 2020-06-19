


class c14417449 {

    public static void compressAll(File dir, File file) throws IOException {
        if (!(Boolean)(Object)dir.isDirectory()) throw new IllegalArgumentException("Given file is no directory");
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(file));
        out.setLevel(0);
        String[] entries =(String[])(Object) dir.list();
        byte[] buffer = new byte[4096];
        int bytesRead;
        for (int i = 0; i < entries.length; i++) {
            File f = new File(dir, entries[i]);
            if ((boolean)(Object)f.isDirectory()) continue;
            FileInputStream in = new FileInputStream(f);
            ZipEntry entry = new ZipEntry(f.getName());
            out.putNextEntry(entry);
            while ((bytesRead =(int)(Object) in.read(buffer)) != -1) out.write(buffer, 0, bytesRead);
            in.close();
        }
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(File o0, String o1){}
	public MyHelperClass list(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass isDirectory(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ZipOutputStream {

ZipOutputStream(FileOutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass setLevel(int o0){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipEntry {

ZipEntry(MyHelperClass o0){}
	ZipEntry(){}}
