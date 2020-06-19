


class c6693221 {

    public void dumpDB(String in, String out) {
        try {
            FileChannel inChannel =(FileChannel)(Object) (new FileInputStream(in).getChannel());
            FileChannel outChannel =(FileChannel)(Object) (new FileOutputStream(out).getChannel());
            inChannel.transferTo(0, inChannel.size(), outChannel);
            inChannel.close();
            outChannel.close();
        } catch (Exception e) {
            MyHelperClass Log = new MyHelperClass();
            Log.d("exception", e.toString());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass d(String o0, String o1){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}
