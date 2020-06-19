


class c6282214 {

    public static boolean Copy(String __from, String __to) {
        try {
            int bytesum = 0;
            int byteread = -1;
            java.io.File oldfile = new java.io.File(__from);
            if (oldfile.exists()) {
                InputStream inStream =(InputStream)(Object) new FileInputStream(__from);
                FileOutputStream fs = new FileOutputStream(__to);
                byte[] buffer = new byte[1024];
                while ((byteread =(int)(Object) inStream.read(buffer)) != -1) {
                    bytesum += byteread;
                    fs.write(buffer, 0, byteread);
                }
                inStream.close();
                fs.close();
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println("processFile.copyFile()���Ƶ����ļ��������� " + e.getMessage());
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
