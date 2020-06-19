


class c23004976 {

    static String hash(String text) {
        try {
            StringBuffer plugins = new StringBuffer();
            MyHelperClass Play = new MyHelperClass();
            for (PlayPlugin plugin :(PlayPlugin[])(Object) (Object[])(Object)Play.plugins) {
                plugins.append(plugin.getClass().getName());
            }
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest messageDigest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            messageDigest.reset();
//            MyHelperClass Play = new MyHelperClass();
            messageDigest.update((Play.version + plugins.toString() + text).getBytes("utf-8"));
            byte[] digest =(byte[])(Object) messageDigest.digest();
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < digest.length; ++i) {
                int value = digest[i];
                if (value < 0) {
                    value += 256;
                }
                builder.append(Integer.toHexString(value));
            }
            return builder.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass version;
	public MyHelperClass plugins;
public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class PlayPlugin {

}
