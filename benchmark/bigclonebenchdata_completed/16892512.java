


class c16892512 {

    private void copyFileNFS(String sSource, String sTarget) throws Exception {
        FileInputStream fis = new FileInputStream(sSource);
        FileOutputStream fos = new FileOutputStream(sTarget);
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        byte[] buf = new byte[2048];
        int i = 0;
        while ((i =(int)(Object) bis.read(buf)) != -1) bos.write(buf, 0, i);
        bis.close();
        bos.close();
        fis.close();
        fos.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
