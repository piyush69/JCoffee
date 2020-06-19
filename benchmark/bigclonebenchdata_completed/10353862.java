


class c10353862 {

    public boolean copyTo(String targetFilePath) {
        try {
            MyHelperClass filePath = new MyHelperClass();
            FileInputStream srcFile = new FileInputStream(filePath);
            FileOutputStream target = new FileOutputStream(targetFilePath);
            byte[] buff = new byte[1024];
            int readed = -1;
            while ((readed =(int)(Object) srcFile.read(buff)) > 0) target.write(buff, 0, readed);
            srcFile.close();
            target.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
