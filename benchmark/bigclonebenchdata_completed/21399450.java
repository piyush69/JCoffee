


class c21399450 {

    private static String encryptSHA1URL(String x) throws Exception {
        java.security.MessageDigest d = null;
        d = java.security.MessageDigest.getInstance("SHA-1");
        d.reset();
        d.update(x.getBytes());
        String passwd = "";
        MyHelperClass URLEncoder = new MyHelperClass();
        passwd =(String)(Object) URLEncoder.encode(new String(d.digest()), "ISO-8859-1");
        return passwd;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(String o0, String o1){ return null; }}
