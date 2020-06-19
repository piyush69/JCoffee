


class c13753266 {

    public static void s_copy(FileInputStream fis, FileOutputStream fos) throws Exception {
        FileChannel in =(FileChannel)(Object) fis.getChannel();
        FileChannel out =(FileChannel)(Object) fos.getChannel();
        in.transferTo(0, in.size(), out);
        if (in != null) in.close();
        if (out != null) out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileInputStream {

public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}
