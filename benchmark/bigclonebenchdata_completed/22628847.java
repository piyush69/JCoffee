


class c22628847 {

    public static void main(String[] args) throws Exception {
        System.out.println("Opening destination cbrout.jizz");
        OutputStream out =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream("cbrout.jizz"));
        System.out.println("Opening source output.jizz");
        InputStream in =(InputStream)(Object) new CbrLiveStream(new BufferedInputStream(new FileInputStream("output.jizz")), System.currentTimeMillis() + 10000, 128);
        System.out.println("Starting read/write loop");
        boolean started = false;
        int len;
        byte[] buf = new byte[4 * 1024];
        while ((len =(int)(Object) in.read(buf)) > -1) {
            if (!started) {
                System.out.println("Starting at " + new Date());
                started = true;
            }
            out.write(buf, 0, len);
        }
        System.out.println("Finished at " + new Date());
        out.close();
        in.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class CbrLiveStream {

CbrLiveStream(){}
	CbrLiveStream(BufferedInputStream o0, long o1, int o2){}}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class Date {

}
