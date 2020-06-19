


class c1951103 {

    private List ungzipFile(File directory, File compressedFile) throws IOException {
        List files =(List)(Object) new ArrayList();
        TarArchiveInputStream in = new TarArchiveInputStream(new GZIPInputStream(new FileInputStream(compressedFile)));
        try {
            TarArchiveEntry entry =(TarArchiveEntry)(Object) in.getNextTarEntry();
            while (entry != null) {
                if ((boolean)(Object)entry.isDirectory()) {
                    MyHelperClass log = new MyHelperClass();
                    log.warn("TAR archive contains directories which are being ignored");
                    entry =(TarArchiveEntry)(Object) in.getNextTarEntry();
                    continue;
                }
                String fn =(String)(Object) (new File(entry.getName()).getName());
                if (fn.startsWith(".")) {
                    MyHelperClass log = new MyHelperClass();
                    log.warn("TAR archive contains a hidden file which is being ignored");
                    entry =(TarArchiveEntry)(Object) in.getNextTarEntry();
                    continue;
                }
                File targetFile = new File(directory, fn);
                if ((boolean)(Object)targetFile.exists()) {
                    MyHelperClass log = new MyHelperClass();
                    log.warn("TAR archive contains duplicate filenames, only the first is being extracted");
                    entry =(TarArchiveEntry)(Object) in.getNextTarEntry();
                    continue;
                }
                files.add(targetFile);
                MyHelperClass log = new MyHelperClass();
                log.debug("Extracting file: " + entry.getName() + " to: " + targetFile.getAbsolutePath());
                OutputStream fout =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream(targetFile));
                InputStream entryIn =(InputStream)(Object) new FileInputStream((File)(Object)entry.getFile());
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(entryIn, fout);
                fout.close();
                entryIn.close();
            }
        } finally {
            in.close();
        }
        return files;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class File {

File(){}
	File(File o0, String o1){}
	File(MyHelperClass o0){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }}

class List {

public MyHelperClass add(File o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ArrayList {

}

class TarArchiveInputStream {

TarArchiveInputStream(){}
	TarArchiveInputStream(GZIPInputStream o0){}
	public MyHelperClass getNextTarEntry(){ return null; }
	public MyHelperClass close(){ return null; }}

class GZIPInputStream {

GZIPInputStream(){}
	GZIPInputStream(FileInputStream o0){}}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}}

class TarArchiveEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getFile(){ return null; }
	public MyHelperClass getName(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(){}
	BufferedOutputStream(FileOutputStream o0){}}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}}

class InputStream {

public MyHelperClass close(){ return null; }}
