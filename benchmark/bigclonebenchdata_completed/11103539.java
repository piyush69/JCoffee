


class c11103539 {

    public void compressFile(String filePath) {
        String outPut = filePath + ".zip";
        try {
            FileInputStream in = new FileInputStream(filePath);
            GZIPOutputStream out = new GZIPOutputStream(new FileOutputStream(outPut));
            byte[] buffer = new byte[4096];
            int bytes_read;
            while ((bytes_read =(int)(Object) in.read(buffer)) != -1) out.write(buffer, 0, bytes_read);
            in.close();
            out.close();
        } catch (Exception c) {
            c.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class GZIPOutputStream {

GZIPOutputStream(FileOutputStream o0){}
	GZIPOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}
