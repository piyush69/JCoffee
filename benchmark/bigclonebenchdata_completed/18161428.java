


class c18161428 {
public MyHelperClass URLEncoder;
	public MyHelperClass StringUtil;
	public MyHelperClass MessageDigest;
	public MyHelperClass retrieveLoginPage(){ return null; }

    private String getAuthUrlString(String account, String password) throws IOException, NoSuchAlgorithmException {
        Map dict =(Map)(Object) retrieveLoginPage();
        if (dict == null) {
            return null;
        }
        StringBuilder url = new StringBuilder("/config/login?login=");
        url.append(account);
        url.append("&passwd=");
        MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        md5.update(password.getBytes(), 0, password.length());
        byte[] result =(byte[])(Object) md5.digest();
        for (int i = 0; i < 16; i++) {
            url.append(StringUtil.toHex2(result[i]));
        }
        String md5chal =(String)(Object) dict.get(".challenge");
        md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        md5.update(md5chal.getBytes(), 0, md5chal.length());
        result =(byte[])(Object) md5.digest();
        for (int i = 0; i < 16; i++) {
            url.append(StringUtil.toHex2(result[i]));
        }
        Iterator j =(Iterator)(Object) dict.keySet().iterator();
        while ((boolean)(Object)j.hasNext()) {
            String key =(String)(Object) j.next();
            String value =(String)(Object) dict.get(key);
            if (!key.equals("passwd")) {
                if (key.equals(".save") || key.equals(".js")) {
                    url.append("&" + key + "=1");
                } else if (key.equals(".challenge")) {
                    url.append("&" + key + "=" + value);
                } else {
                    String u =(String)(Object) URLEncoder.encode(value, "UTF-8");
                    url.append("&" + key + "=" + u);
                }
            }
        }
        url.append("&");
        url.append(".hash=1");
        url.append("&");
        url.append(".md5=1");
        return url.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass iterator(){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass toHex2(byte o0){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class Map {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass keySet(){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}
