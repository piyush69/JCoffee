


class c18648407 {

    public static void copyFile(File file, File destination) throws Exception {
        BufferedInputStream in = null;
        BufferedOutputStream out = null;
        try {
            in = new BufferedInputStream(new FileInputStream(file));
            out = new BufferedOutputStream(new FileOutputStream(destination));
            int c;
            while ((c =(int)(Object) in.read()) != -1) out.write(c);
        } finally {
            try {
                if (out != null) out.close();
            } catch (Exception e) {
            }
            try {
                if (in != null) in.close();
            } catch (Exception e) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
