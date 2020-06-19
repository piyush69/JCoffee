


class c1008332 {

    public void copyFileToFileWithPaths(String sourcePath, String destinPath) throws Exception {
        BufferedInputStream in = null;
        BufferedOutputStream out = null;
        MyHelperClass bufferSize = new MyHelperClass();
        byte dataBuff[] = new byte[(int)(Object)bufferSize];
        File file1 = new File(sourcePath);
        if ((Boolean)(Object)file1.exists() && (Boolean)(Object)(file1.isFile())) {
            File file2 = new File(destinPath);
            if ((boolean)(Object)file2.exists()) {
                file2.delete();
            }
            MyHelperClass FileUtils = new MyHelperClass();
            FileUtils.getInstance().createDirectory(file2.getParent());
//            MyHelperClass bufferSize = new MyHelperClass();
            in = new BufferedInputStream(new FileInputStream(sourcePath), bufferSize);
//            MyHelperClass bufferSize = new MyHelperClass();
            out = new BufferedOutputStream(new FileOutputStream(destinPath), bufferSize);
            int readLen;
            while ((readLen =(int)(Object) in.read(dataBuff)) > 0) {
                out.write(dataBuff, 0, readLen);
            }
            out.flush();
            in.close();
            out.close();
        } else {
            throw new Exception("Source file not exist ! sourcePath = (" + sourcePath + ")");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0, MyHelperClass o1){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(){}
	BufferedOutputStream(FileOutputStream o0, MyHelperClass o1){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getParent(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass isFile(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}
