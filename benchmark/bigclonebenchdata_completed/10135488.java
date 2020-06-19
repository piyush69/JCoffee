


class c10135488 {
public MyHelperClass end;

//    @Override
    public void run() {
        try {
            MyHelperClass begin = new MyHelperClass();
            long pos =(long)(Object) begin;
            byte[] buf = new byte[1024];
            MyHelperClass url = new MyHelperClass();
            URLConnection cn =(URLConnection)(Object) url.openConnection();
            MyHelperClass Utils = new MyHelperClass();
            Utils.setHeader(cn);
//            MyHelperClass begin = new MyHelperClass();
            cn.setRequestProperty("Range", "bytes=" + begin + "-" + end);
            BufferedInputStream bis = new BufferedInputStream(cn.getInputStream());
            int len;
            while ((len =(int)(Object) bis.read(buf)) > 0) {
                MyHelperClass file = new MyHelperClass();
                synchronized (file) {
//                    MyHelperClass file = new MyHelperClass();
                    file.seek(pos);
//                    MyHelperClass file = new MyHelperClass();
                    file.write(buf, 0, len);
                }
                pos += len;
                MyHelperClass Statics = new MyHelperClass();
                Statics.getInstance().addComleted(len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        MyHelperClass latch = new MyHelperClass();
        latch.countDown();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass seek(long o0){ return null; }
	public MyHelperClass setHeader(URLConnection o0){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass countDown(){ return null; }
	public MyHelperClass addComleted(int o0){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }}
