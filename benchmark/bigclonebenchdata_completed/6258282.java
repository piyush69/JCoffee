
import java.io.UncheckedIOException;


class c6258282 {
public MyHelperClass MessageDigest;
	public MyHelperClass byte2hex(byte[] o0){ return null; }

    public void testDigest() {
        try {
            String myinfo = "我的测试信息";
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest alga =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            alga.update(myinfo.getBytes());
            byte[] digesta =(byte[])(Object) alga.digest();
            System.out.println("本信息摘要是:" + byte2hex(digesta));
            MessageDigest algb =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            algb.update(myinfo.getBytes());
            if ((boolean)(Object)MessageDigest.isEqual(digesta, algb.digest())) {
                System.out.println("信息检查正常");
            } else {
                System.out.println("摘要不相同");
            }
        } catch (UncheckedIOException ex) {
            System.out.println("非法摘要算法");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass isEqual(byte[] o0, MyHelperClass o1){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
