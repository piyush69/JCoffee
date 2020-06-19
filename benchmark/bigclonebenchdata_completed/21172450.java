


class c21172450 {

    public static void unzip2(String strZipFile, String folder) throws IOException, ArchiveException {
        MyHelperClass FileUtil = new MyHelperClass();
        FileUtil.fileExists(strZipFile, true);
        final InputStream is =(InputStream)(Object) new FileInputStream(strZipFile);
        ArchiveInputStream in =(ArchiveInputStream)(Object) (new ArchiveStreamFactory().createArchiveInputStream("zip", is));
        ZipArchiveEntry entry = null;
        OutputStream out = null;
        while ((entry = (ZipArchiveEntry)(ZipArchiveEntry)(Object) in.getNextEntry()) != null) {
            File zipPath = new File(folder);
            File destinationFilePath = new File(zipPath, entry.getName());
            destinationFilePath.getParentFile().mkdirs();
            if ((boolean)(Object)entry.isDirectory()) {
                continue;
            } else {
                out =(OutputStream)(Object) new FileOutputStream(new File(folder, entry.getName()));
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(in, out);
                out.close();
            }
        }
        in.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass fileExists(String o0, boolean o1){ return null; }
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass copy(ArchiveInputStream o0, OutputStream o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ArchiveException extends Exception{
	public ArchiveException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class ArchiveInputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass getNextEntry(){ return null; }}

class ArchiveStreamFactory {

public MyHelperClass createArchiveInputStream(String o0, InputStream o1){ return null; }}

class ZipArchiveEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class File {

File(String o0){}
	File(){}
	File(String o0, MyHelperClass o1){}
	File(File o0, MyHelperClass o1){}
	public MyHelperClass getParentFile(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}}
