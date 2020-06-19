


class c7350139 {

    public static void messageDigestTest() {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update("computer".getBytes());
            md.update("networks".getBytes());
            System.out.println(new String((String)(Object)md.digest()));
            System.out.println(new String((String)(Object)md.digest("computernetworks".getBytes())));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass digest(byte[] o0){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
