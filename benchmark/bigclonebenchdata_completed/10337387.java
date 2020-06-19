


class c10337387 {

    protected void zipDirectory(File dir, File zipfile) throws IOException, IllegalArgumentException {
        if (!(Boolean)(Object)dir.isDirectory()) throw new IllegalArgumentException("Compress: not a directory:  " + dir);
        String[] entries =(String[])(Object) dir.list();
        byte[] buffer = new byte[4096];
        int bytes_read;
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipfile));
        for (int i = 0; i < entries.length; i++) {
            File f = new File(dir, entries[i]);
            if ((boolean)(Object)f.isDirectory()) continue;
            FileInputStream in = new FileInputStream(f);
            ZipEntry entry = new ZipEntry(f.getPath());
            out.putNextEntry(entry);
            while ((bytes_read =(int)(Object) in.read(buffer)) != -1) out.write(buffer, 0, bytes_read);
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
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass isDirectory(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ZipOutputStream {

ZipOutputStream(FileOutputStream o0){}
	ZipOutputStream(){}
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
