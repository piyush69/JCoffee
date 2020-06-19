


class c11265072 {

    public static void unzip(File sourceZipFile, File unzipDestinationDirectory, FileFilter filter) throws IOException {
        unzipDestinationDirectory.mkdirs();
        if (!(Boolean)(Object)unzipDestinationDirectory.exists()) {
            throw new IOException("Unable to create destination directory: " + unzipDestinationDirectory);
        }
        ZipFile zipFile;
        MyHelperClass ZipFile = new MyHelperClass();
        zipFile = new ZipFile(sourceZipFile, ZipFile.OPEN_READ);
        Enumeration zipFileEntries =(Enumeration)(Object) zipFile.entries();
        while ((boolean)(Object)zipFileEntries.hasMoreElements()) {
            ZipEntry entry = (ZipEntry)(ZipEntry)(Object) zipFileEntries.nextElement();
            if (!(Boolean)(Object)entry.isDirectory()) {
                String currentEntry =(String)(Object) entry.getName();
                File destFile = new File(unzipDestinationDirectory, currentEntry);
                if (filter == null || (boolean)(Object)filter.accept(destFile)) {
                    File destinationParent =(File)(Object) destFile.getParentFile();
                    destinationParent.mkdirs();
                    BufferedInputStream is = new BufferedInputStream(zipFile.getInputStream(entry));
                    FileOutputStream fos = new FileOutputStream(destFile);
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copyLarge(is, fos);
                    fos.flush();
//                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.closeQuietly(fos);
                }
            }
        }
        zipFile.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass OPEN_READ;
public MyHelperClass copyLarge(BufferedInputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }}

class File {

File(){}
	File(File o0, String o1){}
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class FileFilter {

public MyHelperClass accept(File o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ZipFile {

ZipFile(){}
	ZipFile(File o0, MyHelperClass o1){}
	public MyHelperClass getInputStream(ZipEntry o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass entries(){ return null; }}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class ZipEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass flush(){ return null; }}
