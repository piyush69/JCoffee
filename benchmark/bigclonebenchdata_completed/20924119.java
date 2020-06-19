


class c20924119 {

    public static void gzip() throws Exception {
        System.out.println("gzip()");
        GZIPOutputStream zipout = new GZIPOutputStream(new FileOutputStream("/zip/myzip.gz"));
        MyHelperClass BLOCKSIZE = new MyHelperClass();
        byte buffer[] = new byte[(int)(Object)BLOCKSIZE];
        File dir = new File("/zip/covers");
        System.out.println("Dir '" + dir.getAbsolutePath() + "' exists: " + dir.exists());
        FileInputStream in = new FileInputStream(dir);
//        MyHelperClass BLOCKSIZE = new MyHelperClass();
        for (int length; (length =(int)(Object) in.read(buffer, 0, BLOCKSIZE)) != -1; ) zipout.write(buffer, 0, length);
        in.close();
        zipout.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class GZIPOutputStream {

GZIPOutputStream(FileOutputStream o0){}
	GZIPOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(byte[] o0, int o1, MyHelperClass o2){ return null; }}
