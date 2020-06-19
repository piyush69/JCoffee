


class c22122895 {
public MyHelperClass log;
	public MyHelperClass toHexString(byte o0){ return null; }

    protected String getHashCode(String value) {
        MyHelperClass log = new MyHelperClass();
        if ((boolean)(Object)log.isDebugEnabled()) log.debug("getHashCode(...) -> begin");
        String retVal = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest mdAlgorithm =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            mdAlgorithm.update(value.getBytes());
            byte[] digest =(byte[])(Object) mdAlgorithm.digest();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < digest.length; i++) {
                sb.append(this.toHexString(digest[i]));
            }
            retVal = sb.toString();
            if ((boolean)(Object)log.isDebugEnabled()) log.debug("getHashCode(...) -> hashcode = " + retVal);
        } catch (Exception e) {
            log.error("getHashCode(...) -> error occured generating hashcode ", e);
        }
        if ((boolean)(Object)log.isDebugEnabled()) log.debug("getHashCode(...) -> end");
        return retVal;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
