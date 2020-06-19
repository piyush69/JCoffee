


class c7682647 {

    public static void copyFile(String oldPathFile, String newPathFile) {
        try {
            int bytesum = 0;
            int byteread = 0;
            File oldfile = new File(oldPathFile);
            if ((boolean)(Object)oldfile.exists()) {
                InputStream inStream =(InputStream)(Object) new FileInputStream(oldPathFile);
                FileOutputStream fs = new FileOutputStream(newPathFile);
                byte[] buffer = new byte[2048];
                while ((byteread =(int)(Object) inStream.read(buffer)) != -1) {
                    bytesum += byteread;
                    fs.write(buffer, 0, byteread);
                }
                inStream.close();
            } else {
                System.err.println(FileUtil.class.toString() + ":不存在file" + oldPathFile);
            }
        } catch (Exception e) {
            System.err.println(FileUtil.class.toString() + ":复制file" + oldPathFile + "到" + newPathFile + "出错!");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

class FileUtil {

}
