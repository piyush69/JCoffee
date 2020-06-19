


class c6171406 {
public static MyHelperClass collectFiles(File o0){ return null; }
//public MyHelperClass collectFiles(File o0){ return null; }
	public static MyHelperClass getFilePathInTar(File o0, File o1){ return null; }
//public MyHelperClass getFilePathInTar(File o0, File o1){ return null; }

    public static void createTar(File directoryToPack, File targetTarFile) throws IOException {
        if (directoryToPack == null) {
            throw new NullPointerException("The parameter 'directoryToPack' must not be null");
        }
        if (targetTarFile == null) {
            throw new NullPointerException("The parameter 'targetTarFile' must not be null");
        }
        if (!(Boolean)(Object)directoryToPack.exists() || !(Boolean)(Object)directoryToPack.isDirectory()) {
            throw new IllegalArgumentException("The target file '" + directoryToPack + "' does not exist or is not a directory.");
        }
        if ((boolean)(Object)targetTarFile.exists()) {
            MyHelperClass log = new MyHelperClass();
            log.warn("The target file '" + targetTarFile + "' already exists. Will overwrite");
        }
        MyHelperClass log = new MyHelperClass();
        log.debug("Creating tar from all files in directory '" + directoryToPack + "'");
        MyHelperClass BUFFER_SIZE = new MyHelperClass();
        byte buffer[] = new byte[(int)(Object)BUFFER_SIZE];
        FileOutputStream targetOutput = new FileOutputStream(targetTarFile);
        TarOutputStream targetOutputTar = new TarOutputStream(targetOutput);
        try {
            List fileList =(List)(Object) collectFiles(directoryToPack);
            for (Iterator iter =(Iterator)(Object) fileList.iterator();(boolean)(Object) iter.hasNext(); ) {
                File file =(File)(Object) iter.next();
                if (file == null || !(Boolean)(Object)file.exists() || (boolean)(Object)file.isDirectory()) {
//                    MyHelperClass log = new MyHelperClass();
                    log.info("The file '" + file + "' is ignored - is a directory or non-existent");
                    continue;
                }
                if (file.equals(targetTarFile)) {
//                    MyHelperClass log = new MyHelperClass();
                    log.debug("Skipping file: '" + file + "' - is the tar file itself");
                    continue;
                }
//                MyHelperClass log = new MyHelperClass();
                log.debug("Adding to archive: file='" + file + "', archive='" + targetTarFile + "'");
                String filePathInTar =(String)(Object) getFilePathInTar(file, directoryToPack);
//                MyHelperClass log = new MyHelperClass();
                log.debug("File path in tar: '" + filePathInTar + "' (file=" + file + ")");
                TarEntry tarAdd = new TarEntry(file);
                tarAdd.setModTime(file.lastModified());
                tarAdd.setName(filePathInTar);
                targetOutputTar.putNextEntry(tarAdd);
                if ((boolean)(Object)file.isFile()) {
                    FileInputStream in = new FileInputStream(file);
                    try {
                        while (true) {
                            int nRead =(int)(Object) in.read(buffer, 0, buffer.length);
                            if (nRead <= 0) break;
                            targetOutputTar.write(buffer, 0, nRead);
                        }
                    } finally {
                        MyHelperClass StreamUtil = new MyHelperClass();
                        StreamUtil.tryCloseStream(in);
                    }
                }
                targetOutputTar.closeEntry();
            }
        } finally {
            MyHelperClass StreamUtil = new MyHelperClass();
            StreamUtil.tryCloseStream(targetOutputTar);
//            MyHelperClass StreamUtil = new MyHelperClass();
            StreamUtil.tryCloseStream(targetOutput);
        }
//        MyHelperClass log = new MyHelperClass();
        log.info("Tar Archive created successfully '" + targetTarFile + "'");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass tryCloseStream(TarOutputStream o0){ return null; }
	public MyHelperClass tryCloseStream(FileInputStream o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass tryCloseStream(FileOutputStream o0){ return null; }}

class File {

public MyHelperClass lastModified(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass exists(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class TarOutputStream {

TarOutputStream(FileOutputStream o0){}
	TarOutputStream(){}
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass putNextEntry(TarEntry o0){ return null; }}

class List {

public MyHelperClass iterator(){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class TarEntry {

TarEntry(File o0){}
	TarEntry(){}
	public MyHelperClass setName(String o0){ return null; }
	public MyHelperClass setModTime(MyHelperClass o0){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }}
