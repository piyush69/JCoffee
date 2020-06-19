


class c6159896 {

    public static String md5(String str) {
        MyHelperClass logger = new MyHelperClass();
        if ((boolean)(Object)logger.isDebugEnabled()) {
//            MyHelperClass logger = new MyHelperClass();
            logger.debug("md5(String) - start");
        }
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            byte[] b =(byte[])(Object) md.digest();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < b.length; i++) {
                int v = (int) b[i];
                v = v < 0 ? 0x100 + v : v;
                String cc = Integer.toHexString(v);
                if (cc.length() == 1) sb.append('0');
                sb.append(cc);
            }
            String returnString = sb.toString();
//            MyHelperClass logger = new MyHelperClass();
            if ((boolean)(Object)logger.isDebugEnabled()) {
//                MyHelperClass logger = new MyHelperClass();
                logger.debug("md5(String) - end");
            }
            return returnString;
        } catch (Exception e) {
//            MyHelperClass logger = new MyHelperClass();
            logger.warn("md5(String) - exception ignored", e);
        }
//        MyHelperClass logger = new MyHelperClass();
        if ((boolean)(Object)logger.isDebugEnabled()) {
//            MyHelperClass logger = new MyHelperClass();
            logger.debug("md5(String) - end");
        }
        return "";
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warn(String o0, Exception o1){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
