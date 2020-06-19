


class c8539546 {
public static MyHelperClass createFolders(File o0){ return null; }
//public MyHelperClass createFolders(File o0){ return null; }

    private static void unpackEntry(File destinationFile, ZipInputStream zin, ZipEntry entry) throws Exception {
        if (!(Boolean)(Object)entry.isDirectory()) {
            createFolders((File)(Object)destinationFile.getParentFile());
            FileOutputStream fis = new FileOutputStream(destinationFile);
            try {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(zin, fis);
            } finally {
                zin.closeEntry();
                fis.close();
            }
        } else {
            createFolders(destinationFile);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(ZipInputStream o0, FileOutputStream o1){ return null; }}

class File {

public MyHelperClass getParentFile(){ return null; }}

class ZipInputStream {

public MyHelperClass closeEntry(){ return null; }}

class ZipEntry {

public MyHelperClass isDirectory(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}
