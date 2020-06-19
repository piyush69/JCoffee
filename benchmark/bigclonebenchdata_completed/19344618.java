


class c19344618 {

    private void zipdir(File base, String zipname) throws IOException {
        FilenameFilter ff =(FilenameFilter)(Object) new ExporterFileNameFilter();
        String[] files =(String[])(Object) base.list(ff);
        File zipfile = new File(base, zipname + ".zip");
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipfile));
        byte[] buf = new byte[10240];
        for (int i = 0; i < files.length; i++) {
            File f = new File(base, files[i]);
            FileInputStream fis = new FileInputStream(f);
            zos.putNextEntry(new ZipEntry(f.getName()));
            int len;
            while ((len =(int)(Object) fis.read(buf)) > 0) zos.write(buf, 0, len);
            zos.closeEntry();
            fis.close();
            f.delete();
        }
        zos.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(File o0, String o1){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass list(FilenameFilter o0){ return null; }
	public MyHelperClass getName(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FilenameFilter {

}

class ExporterFileNameFilter {

}

class ZipOutputStream {

ZipOutputStream(FileOutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass closeEntry(){ return null; }
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
