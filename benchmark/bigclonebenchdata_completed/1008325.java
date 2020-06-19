


class c1008325 {
public MyHelperClass bufferSize;
	public MyHelperClass sep;
	public MyHelperClass createDirectory(String o0){ return null; }

    public long copyDirAllFilesToDirectory(String baseDirStr, String destDirStr) throws Exception {
        long plussQuotaSize = 0;
        MyHelperClass sep = new MyHelperClass();
        if (baseDirStr.endsWith((String)(Object)sep)) {
            baseDirStr = baseDirStr.substring(0, baseDirStr.length() - 1);
        }
//        MyHelperClass sep = new MyHelperClass();
        if (destDirStr.endsWith((String)(Object)sep)) {
            destDirStr = destDirStr.substring(0, destDirStr.length() - 1);
        }
        MyHelperClass FileUtils = new MyHelperClass();
        FileUtils.getInstance().createDirectory(destDirStr);
        BufferedInputStream in = null;
        BufferedOutputStream out = null;
        MyHelperClass bufferSize = new MyHelperClass();
        byte dataBuff[] = new byte[(int)(Object)bufferSize];
        File baseDir = new File(baseDirStr);
        baseDir.mkdirs();
        if (!(Boolean)(Object)baseDir.exists()) {
            createDirectory(baseDirStr);
        }
        if ((Boolean)(Object)(baseDir.exists()) && (Boolean)(Object)(baseDir.isDirectory())) {
            String[] entryList =(String[])(Object) baseDir.list();
            if (entryList.length > 0) {
                for (int pos = 0; pos < entryList.length; pos++) {
                    String entryName = entryList[pos];
                    String oldPathFileName = baseDirStr + sep + entryName;
                    File entryFile = new File(oldPathFileName);
                    if ((boolean)(Object)entryFile.isFile()) {
                        String newPathFileName = destDirStr + sep + entryName;
                        File newFile = new File(newPathFileName);
                        if ((boolean)(Object)newFile.exists()) {
                            plussQuotaSize -= (long)(Object)newFile.length();
                            newFile.delete();
                        }
                        in = new BufferedInputStream(new FileInputStream(oldPathFileName), bufferSize);
                        out = new BufferedOutputStream(new FileOutputStream(newPathFileName), bufferSize);
                        int readLen;
                        while ((readLen =(int)(Object) in.read(dataBuff)) > 0) {
                            out.write(dataBuff, 0, readLen);
                            plussQuotaSize += readLen;
                        }
                        out.flush();
                        in.close();
                        out.close();
                    }
                }
            }
        } else {
            throw new Exception("Base dir not exist ! baseDirStr = (" + baseDirStr + ")");
        }
        return plussQuotaSize;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createDirectory(String o0){ return null; }
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
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass list(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass isFile(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}
