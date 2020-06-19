


class c4960417 {

    public static boolean writeFileByBinary(InputStream pIs, File pFile, boolean pAppend) {
        boolean flag = false;
        try {
            FileOutputStream fos = new FileOutputStream(pFile, pAppend);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(pIs, fos);
            fos.flush();
            fos.close();
            pIs.close();
            flag = true;
        } catch (Exception e) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.error("将字节流写入�?" + pFile.getName() + "出现异常�?", e);
        }
        return flag;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class File {

public MyHelperClass getName(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0, boolean o1){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}
