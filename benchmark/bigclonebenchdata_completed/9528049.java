


class c9528049 {

    private void copyFile(File file, File targetFile) {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetFile));
            byte[] tmp = new byte[8192];
            int read = -1;
            while ((read =(int)(Object) bis.read(tmp)) > 0) {
                bos.write(tmp, 0, read);
            }
            bis.close();
            bos.close();
        } catch (Exception e) {
            if (!(Boolean)(Object)targetFile.delete()) {
                System.err.println("Ups, created copy cant be deleted (" + targetFile.getAbsolutePath() + ")");
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass delete(){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
