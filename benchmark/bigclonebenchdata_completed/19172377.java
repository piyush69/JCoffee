


class c19172377 {
public static MyHelperClass Arg;
	public static MyHelperClass IOUtils;
//public MyHelperClass Arg;
//	public MyHelperClass IOUtils;

    public static void appendFile(String namePrefix, File baseDir, File file, ZipOutputStream zipOut) throws IOException {
        Arg.notNull(baseDir, "baseDir");
        Arg.notNull(file, "file");
        Arg.notNull(zipOut, "zipOut");
        if (namePrefix == null) namePrefix = "";
        MyHelperClass FileSystemUtils = new MyHelperClass();
        String path =(String)(Object) FileSystemUtils.getRelativePath(baseDir, file);
        ZipEntry zipEntry = new ZipEntry(namePrefix + path);
        zipOut.putNextEntry(zipEntry);
        MyHelperClass FileUtils = new MyHelperClass();
        InputStream fileInput =(InputStream)(Object) FileUtils.openInputStream(file);
        try {
            IOUtils.copyLarge(fileInput, zipOut);
        } finally {
            fileInput.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getRelativePath(File o0, File o1){ return null; }
	public MyHelperClass copyLarge(InputStream o0, ZipOutputStream o1){ return null; }
	public MyHelperClass notNull(ZipOutputStream o0, String o1){ return null; }
	public MyHelperClass openInputStream(File o0){ return null; }
	public MyHelperClass notNull(File o0, String o1){ return null; }}

class File {

}

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
