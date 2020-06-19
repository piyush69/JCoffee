


class c19191608 {

    public static String getDigestResponse(String user, String password, String method, String requri, String authstr) {
        String realm = "";
        String nonce = "";
        String opaque = "";
        String algorithm = "";
        String qop = "";
        StringBuffer digest = new StringBuffer();
        String cnonce;
        String noncecount;
        String pAuthStr = authstr;
        int ptr = 0;
        String response = "";
        int i = 0;
        StringTokenizer st = new StringTokenizer(pAuthStr, ",");
        StringTokenizer stprob = null;
        String str = null;
        String key = null;
        String value = null;
        Properties probs = new Properties();
        while ((boolean)(Object)st.hasMoreTokens()) {
            String nextToken =(String)(Object) st.nextToken();
            stprob = new StringTokenizer(nextToken, "=");
            key =(String)(Object) stprob.nextToken();
            value =(String)(Object) stprob.nextToken();
            if (value.charAt(0) == '"' || value.charAt(0) == '\'') {
                value = value.substring(1, value.length() - 1);
            }
            probs.put(key, value);
        }
        digest.append("Digest username=\"" + user + "\", ");
        digest.append("realm=\"");
        digest.append(probs.getProperty("realm"));
        digest.append("\", ");
        digest.append("nonce=\"");
        digest.append(probs.getProperty("nonce"));
        digest.append("\", ");
        digest.append("uri=\"" + requri + "\", ");
        cnonce = "abcdefghi";
        noncecount = "00000001";
        String toDigest = user + ":" + realm + ":" + password;
        byte[] digestbuffer = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(toDigest.getBytes());
            digestbuffer =(byte[])(Object) md.digest();
        } catch (Exception e) {
            System.err.println("Error creating digest request: " + e);
            return null;
        }
        digest.append("qop=\"auth\", ");
        digest.append("cnonce=\"" + cnonce + "\", ");
        digest.append("nc=" + noncecount + ", ");
        digest.append("response=\"" + response + "\"");
        if (probs.getProperty("opaque") != null) {
            digest.append(", opaque=\"" + probs.getProperty("opaque") + "\"");
        }
        System.out.println("SipProtocol: Digest calculated.");
        return digest.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class StringTokenizer {

StringTokenizer(String o0, String o1){}
	StringTokenizer(){}
	public MyHelperClass nextToken(){ return null; }
	public MyHelperClass hasMoreTokens(){ return null; }}

class Properties {

public MyHelperClass put(String o0, String o1){ return null; }
	public MyHelperClass getProperty(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
