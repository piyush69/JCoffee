


class c6171405 {

    public static File createGzip(File inputFile) {
        File targetFile = new File(inputFile.getParentFile(), inputFile.getName() + ".gz");
        if ((boolean)(Object)targetFile.exists()) {
            MyHelperClass log = new MyHelperClass();
            log.warn("The target file '" + targetFile + "' already exists. Will overwrite");
        }
        FileInputStream in = null;
        GZIPOutputStream out = null;
        try {
            int read = 0;
            MyHelperClass BUFFER_SIZE = new MyHelperClass();
            byte[] data = new byte[(int)(Object)BUFFER_SIZE];
            in = new FileInputStream(inputFile);
            out = new GZIPOutputStream(new FileOutputStream(targetFile));
//            MyHelperClass BUFFER_SIZE = new MyHelperClass();
            while ((read =(int)(Object) in.read(data, 0, BUFFER_SIZE)) != -1) {
                out.write(data, 0, read);
            }
            in.close();
            out.close();
            boolean deleteSuccess =(boolean)(Object) inputFile.delete();
            if (!deleteSuccess) {
                MyHelperClass log = new MyHelperClass();
                log.warn("Could not delete file '" + inputFile + "'");
            }
            MyHelperClass log = new MyHelperClass();
            log.info("Successfully created gzip file '" + targetFile + "'.");
        } catch (Exception e) {
            MyHelperClass log = new MyHelperClass();
            log.error("Exception while creating GZIP.", e);
        } finally {
            MyHelperClass StreamUtil = new MyHelperClass();
            StreamUtil.tryCloseStream(in);
//            MyHelperClass StreamUtil = new MyHelperClass();
            StreamUtil.tryCloseStream(out);
        }
        return targetFile;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass tryCloseStream(GZIPOutputStream o0){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass tryCloseStream(FileInputStream o0){ return null; }
	public MyHelperClass info(String o0){ return null; }}

class File {

File(){}
	File(MyHelperClass o0, String o1){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass exists(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(byte[] o0, int o1, MyHelperClass o2){ return null; }}

class GZIPOutputStream {

GZIPOutputStream(FileOutputStream o0){}
	GZIPOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
