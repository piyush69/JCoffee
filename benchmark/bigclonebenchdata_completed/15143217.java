


class c15143217 {

//    @Override
    public String getMD5(String host) {
        String res = "";
        Double randNumber = Math.random() + System.currentTimeMillis();
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest algorithm =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            algorithm.reset();
            algorithm.update(randNumber.toString().getBytes());
            byte[] md5 =(byte[])(Object) algorithm.digest();
            String tmp = "";
            for (int i = 0; i < md5.length; i++) {
                tmp = (Integer.toHexString(0xFF & md5[i]));
                if (tmp.length() == 1) {
                    res += "0" + tmp;
                } else {
                    res += tmp;
                }
            }
        } catch (Exception ex) {
        }
        return res;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
