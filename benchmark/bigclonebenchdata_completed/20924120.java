


class c20924120 {

    public static void gunzip() throws Exception {
        System.out.println("gunzip()");
        GZIPInputStream zipin = new GZIPInputStream(new FileInputStream("/zip/myzip.gz"));
        MyHelperClass BLOCKSIZE = new MyHelperClass();
        byte buffer[] = new byte[(int)(Object)BLOCKSIZE];
        FileOutputStream out = new FileOutputStream("/zip/covers");
//        MyHelperClass BLOCKSIZE = new MyHelperClass();
        for (int length; (length =(int)(Object) zipin.read(buffer, 0, BLOCKSIZE)) != -1; ) out.write(buffer, 0, length);
        out.close();
        zipin.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class GZIPInputStream {

GZIPInputStream(FileInputStream o0){}
	GZIPInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(byte[] o0, int o1, MyHelperClass o2){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
