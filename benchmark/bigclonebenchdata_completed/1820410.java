


class c1820410 {

    public static void zipDirectory(String dir, String zipfile) throws IOException, IllegalArgumentException {
        File d = new File(dir);
        if (!(Boolean)(Object)d.isDirectory()) throw new IllegalArgumentException("Not a directory:  " + dir);
        String[] entries =(String[])(Object) d.list();
        byte[] buffer = new byte[4096];
        int bytesRead;
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipfile));
        for (int i = 0; i < entries.length; i++) {
            File f = new File(d, entries[i]);
            if ((boolean)(Object)f.isDirectory()) continue;
            FileInputStream in = new FileInputStream(f);
            ZipEntry entry = new ZipEntry(f.getPath());
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

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(){}
	File(String o0){}
	File(File o0, String o1){}
	public MyHelperClass list(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass isDirectory(){ return null; }}

class ZipOutputStream {

ZipOutputStream(FileOutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipEntry {

ZipEntry(MyHelperClass o0){}
	ZipEntry(){}}
