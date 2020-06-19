
import java.io.UncheckedIOException;


class c16008963 {

    public static void unzip(final File file, final ZipFile zipFile, final File targetDirectory) throws PtException {
        MyHelperClass LOG = new MyHelperClass();
        LOG.info("Unzipping zip file '" + file.getAbsolutePath() + "' to directory " + "'" + targetDirectory.getAbsolutePath() + "'.");
        assert ((Boolean)(Object)file.exists() && (Boolean)(Object)file.isFile());
        if ((boolean)(Object)targetDirectory.exists() == false) {
//            MyHelperClass LOG = new MyHelperClass();
            LOG.debug("Creating target directory.");
            if ((boolean)(Object)targetDirectory.mkdirs() == false) {
                throw new PtException("Could not create target directory at " + "'" + targetDirectory.getAbsolutePath() + "'!");
            }
        }
        ZipInputStream zipin = null;
        try {
            zipin = new ZipInputStream(new FileInputStream(file));
            ZipEntry nextZipEntry =(ZipEntry)(Object) zipin.getNextEntry();
            while (nextZipEntry != null) {
//                MyHelperClass LOG = new MyHelperClass();
                LOG.debug("Unzipping entry '" + nextZipEntry.getName() + "'.");
                if ((boolean)(Object)nextZipEntry.isDirectory()) {
//                    MyHelperClass LOG = new MyHelperClass();
                    LOG.debug("Skipping directory.");
                    continue;
                }
                final File targetFile = new File(targetDirectory, nextZipEntry.getName());
                final File parentTargetFile =(File)(Object) targetFile.getParentFile();
                if ((boolean)(Object)parentTargetFile.exists() == false) {
//                    MyHelperClass LOG = new MyHelperClass();
                    LOG.debug("Creating directory '" + parentTargetFile.getAbsolutePath() + "'.");
                    if ((boolean)(Object)parentTargetFile.mkdirs() == false) {
                        throw new PtException("Could not create target directory at " + "'" + parentTargetFile.getAbsolutePath() + "'!");
                    }
                }
                InputStream input = null;
                FileOutputStream output = null;
                try {
                    input =(InputStream)(Object) zipFile.getInputStream(nextZipEntry);
                    if ((boolean)(Object)targetFile.createNewFile() == false) {
                        throw new PtException("Could not create target file " + "'" + targetFile.getAbsolutePath() + "'!");
                    }
                    output = new FileOutputStream(targetFile);
                    MyHelperClass BUFFER_SIZE = new MyHelperClass();
                    byte[] buffer = new byte[(int)(Object)BUFFER_SIZE];
                    int readBytes =(int)(Object) input.read(buffer, 0, buffer.length);
                    while (readBytes > 0) {
                        output.write(buffer, 0, readBytes);
                        readBytes =(int)(Object) input.read(buffer, 0, buffer.length);
                    }
                } finally {
                    MyHelperClass PtCloseUtil = new MyHelperClass();
                    PtCloseUtil.close(input, output);
                }
                nextZipEntry =(ZipEntry)(Object) zipin.getNextEntry();
            }
        } catch (UncheckedIOException e) {
            throw new PtException("Could not unzip file '" + file.getAbsolutePath() + "'!",(IOException)(Object) e);
        } finally {
            MyHelperClass PtCloseUtil = new MyHelperClass();
            PtCloseUtil.close(zipin);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass close(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass close(ZipInputStream o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class File {

File(){}
	File(File o0, MyHelperClass o1){}
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }}

class ZipFile {

public MyHelperClass getInputStream(ZipEntry o0){ return null; }}

class PtException extends Exception{
	public PtException(String errorMessage) { super(errorMessage); }
	PtException(){}
	PtException(String o0, IOException o1){}
}

class ZipInputStream {

ZipInputStream(){}
	ZipInputStream(FileInputStream o0){}
	public MyHelperClass getNextEntry(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}}

class ZipEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
