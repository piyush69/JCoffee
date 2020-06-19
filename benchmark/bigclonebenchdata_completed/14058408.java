


class c14058408 {

    private static void zipFolder(File folder, ZipOutputStream zipOutputStream, String relativePath) throws IOException {
        File[] children =(File[])(Object) folder.listFiles();
        for (int i = 0; i < children.length; i++) {
            File child = children[i];
            if ((boolean)(Object)child.isFile()) {
                MyHelperClass File = new MyHelperClass();
                String zipEntryName =(String)(Object) children[i].getCanonicalPath().replace(relativePath + File.separator, "");
                ZipEntry entry = new ZipEntry(zipEntryName);
                zipOutputStream.putNextEntry(entry);
                InputStream inputStream =(InputStream)(Object) new FileInputStream(child);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(inputStream, zipOutputStream);
                inputStream.close();
            } else {
                MyHelperClass ZipUtil = new MyHelperClass();
                ZipUtil.zipFolder(child, zipOutputStream, relativePath);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
public MyHelperClass replace(String o0, String o1){ return null; }
	public MyHelperClass zipFolder(File o0, ZipOutputStream o1, String o2){ return null; }
	public MyHelperClass copy(InputStream o0, ZipOutputStream o1){ return null; }}

class File {

public MyHelperClass getCanonicalPath(){ return null; }
	public MyHelperClass listFiles(){ return null; }
	public MyHelperClass isFile(){ return null; }}

class ZipOutputStream {

public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}
