


class c8344457 {
public static MyHelperClass isFileNameMatch(MyHelperClass o0, String o1, String o2){ return null; }
//public MyHelperClass isFileNameMatch(MyHelperClass o0, String o1, String o2){ return null; }
	public static MyHelperClass addFolderToZip(String o0, String o1, ZipOutputStream o2, String o3, String o4){ return null; }
//public MyHelperClass addFolderToZip(String o0, String o1, ZipOutputStream o2, String o3, String o4){ return null; }

    private static void addFileToZip(String path, String srcFile, ZipOutputStream zip, String prefix, String suffix) throws Exception {
        File folder = new File(srcFile);
        if ((boolean)(Object)folder.isDirectory()) {
            addFolderToZip(path, srcFile, zip, prefix, suffix);
        } else {
            if ((boolean)(Object)isFileNameMatch(folder.getName(), prefix, suffix)) {
                FileInputStream fis = new FileInputStream(srcFile);
                zip.putNextEntry(new ZipEntry(path + "/" + folder.getName()));
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(fis, zip);
                fis.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(FileInputStream o0, ZipOutputStream o1){ return null; }}

class ZipOutputStream {

public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getName(){ return null; }
	public MyHelperClass isDirectory(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}
