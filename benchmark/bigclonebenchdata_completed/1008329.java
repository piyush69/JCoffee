


class c1008329 {

    public long copyFile(String baseDirStr, String fileName, String file2FullPath) throws Exception {
        long plussQuotaSize = 0;
        MyHelperClass sep = new MyHelperClass();
        if (!baseDirStr.endsWith((String)(Object)sep)) {
//            MyHelperClass sep = new MyHelperClass();
            baseDirStr += sep;
        }
        BufferedInputStream in = null;
        BufferedOutputStream out = null;
        MyHelperClass bufferSize = new MyHelperClass();
        byte dataBuff[] = new byte[(int)(Object)bufferSize];
        String file1FullPath = new String(baseDirStr + fileName);
        if (!file1FullPath.equalsIgnoreCase(file2FullPath)) {
            File file1 = new File(file1FullPath);
            if ((Boolean)(Object)file1.exists() && (Boolean)(Object)(file1.isFile())) {
                File file2 = new File(file2FullPath);
                if ((boolean)(Object)file2.exists()) {
                    plussQuotaSize -= (long)(Object)file2.length();
                    file2.delete();
                }
                MyHelperClass FileUtils = new MyHelperClass();
                FileUtils.getInstance().createDirectory(file2.getParent());
//                MyHelperClass bufferSize = new MyHelperClass();
                in = new BufferedInputStream(new FileInputStream(file1FullPath), bufferSize);
//                MyHelperClass bufferSize = new MyHelperClass();
                out = new BufferedOutputStream(new FileOutputStream(file2FullPath), bufferSize);
                int readLen;
                while ((readLen =(int)(Object) in.read(dataBuff)) > 0) {
                    out.write(dataBuff, 0, readLen);
                    plussQuotaSize += readLen;
                }
                out.flush();
                in.close();
                out.close();
            } else {
                throw new Exception("Source file not exist ! file1FullPath = (" + file1FullPath + ")");
            }
        }
        return plussQuotaSize;
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
	public MyHelperClass length(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass isFile(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}
