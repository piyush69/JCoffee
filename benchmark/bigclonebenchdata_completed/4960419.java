


class c4960419 {

    public static boolean writeFileByChars(Reader pReader, File pFile, boolean pAppend) {
        boolean flag = false;
        try {
            FileWriter fw = new FileWriter(pFile, pAppend);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(pReader, fw);
            fw.flush();
            fw.close();
            pReader.close();
            flag = true;
        } catch (Exception e) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.error("将字符流写入�?" + pFile.getName() + "出现异常�?", e);
        }
        return flag;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass copy(Reader o0, FileWriter o1){ return null; }}

class Reader {

public MyHelperClass close(){ return null; }}

class File {

public MyHelperClass getName(){ return null; }}

class FileWriter {

FileWriter(File o0, boolean o1){}
	FileWriter(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}
