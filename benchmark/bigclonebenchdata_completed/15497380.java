


class c15497380 {
public static MyHelperClass SIGNATURE;
//public MyHelperClass SIGNATURE;

    public static String generateSig(Map params, String secret) {
        SortedSet keys =(SortedSet)(Object) new TreeSet(params.keySet());
        keys.remove(SIGNATURE.toString());
        String str = "";
        for (String key :(String[])(Object) (Object[])(Object)keys) {
            str += key + "=" + params.get(key);
        }
        str += secret;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(str.getBytes("UTF-8"));
            StringBuilder result = new StringBuilder();
            for (byte b :(byte[])(Object) (Object[])(Object)md.digest()) {
                result.append(Integer.toHexString((b & 0xf0) >>> 4));
                result.append(Integer.toHexString(b & 0x0f));
            }
            return result.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class Map {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass keySet(){ return null; }}

class SortedSet {

public MyHelperClass remove(String o0){ return null; }}

class TreeSet {

TreeSet(MyHelperClass o0){}
	TreeSet(){}}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
