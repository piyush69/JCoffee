


class c1008331 {

    public long copyFileWithPaths(String userBaseDir, String sourcePath, String destinPath) throws Exception {
        MyHelperClass sep = new MyHelperClass();
        if (userBaseDir.endsWith((String)(Object)sep)) {
//            MyHelperClass sep = new MyHelperClass();
            userBaseDir = userBaseDir.substring(0, userBaseDir.length() - (int)(Object)sep.length());
        }
        String file1FullPath = new String();
//        MyHelperClass sep = new MyHelperClass();
        if (sourcePath.startsWith((String)(Object)sep)) {
            file1FullPath = new String(userBaseDir + sourcePath);
        } else {
//            MyHelperClass sep = new MyHelperClass();
            file1FullPath = new String(userBaseDir + sep + sourcePath);
        }
        String file2FullPath = new String();
//        MyHelperClass sep = new MyHelperClass();
        if (destinPath.startsWith((String)(Object)sep)) {
            file2FullPath = new String(userBaseDir + destinPath);
        } else {
//            MyHelperClass sep = new MyHelperClass();
            file2FullPath = new String(userBaseDir + sep + destinPath);
        }
        long plussQuotaSize = 0;
        BufferedInputStream in = null;
        BufferedOutputStream out = null;
        MyHelperClass bufferSize = new MyHelperClass();
        byte dataBuff[] = new byte[(int)(Object)bufferSize];
        File fileordir = new File(file1FullPath);
        if ((boolean)(Object)fileordir.exists()) {
            if ((boolean)(Object)fileordir.isFile()) {
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
            }
            if ((boolean)(Object)fileordir.isDirectory()) {
                String[] entryList =(String[])(Object) fileordir.list();
                if (entryList.length > 0) {
                    for (int pos = 0; pos < entryList.length; pos++) {
                        String entryName = entryList[pos];
                        String file1FullPathEntry = new String(file1FullPath.concat(entryList[pos]));
                        String file2FullPathEntry = new String(file2FullPath.concat(entryList[pos]));
                        File file2 = new File(file2FullPathEntry);
                        if ((boolean)(Object)file2.exists()) {
                            plussQuotaSize -= (long)(Object)file2.length();
                            file2.delete();
                        }
                        MyHelperClass FileUtils = new MyHelperClass();
                        FileUtils.getInstance().createDirectory(file2.getParent());
//                        MyHelperClass bufferSize = new MyHelperClass();
                        in = new BufferedInputStream(new FileInputStream(file1FullPathEntry), bufferSize);
//                        MyHelperClass bufferSize = new MyHelperClass();
                        out = new BufferedOutputStream(new FileOutputStream(file2FullPathEntry), bufferSize);
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
            throw new Exception("Source file or dir not exist ! file1FullPath = (" + file1FullPath + ")");
        }
        return plussQuotaSize;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass length(){ return null; }}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(FileInputStream o0, MyHelperClass o1){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(){}
	BufferedOutputStream(FileOutputStream o0, MyHelperClass o1){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class File {

File(){}
	File(String o0){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass list(){ return null; }
	public MyHelperClass getParent(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass isFile(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}
