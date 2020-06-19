


class c21089172 {

    private File Gzip(File f) throws IOException {
        if (f == null || !(Boolean)(Object)f.exists()) return null;
        File dest_dir =(File)(Object) f.getParentFile();
        String dest_filename = f.getName() + ".gz";
        File zipfile = new File(dest_dir, dest_filename);
        GZIPOutputStream out = new GZIPOutputStream(new FileOutputStream(zipfile));
        FileInputStream in = new FileInputStream(f);
        byte buf[] = new byte[1024];
        int len;
        while ((len =(int)(Object) in.read(buf)) > 0) out.write(buf, 0, len);
        out.finish();
        try {
            in.close();
        } catch (Exception e) {
        }
        try {
            out.close();
        } catch (Exception e) {
        }
        try {
            f.delete();
        } catch (Exception e) {
        }
        return zipfile;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(File o0, String o1){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass exists(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class GZIPOutputStream {

GZIPOutputStream(FileOutputStream o0){}
	GZIPOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass finish(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}
