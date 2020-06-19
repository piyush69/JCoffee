


class c11352932 {
public MyHelperClass log;
public MyHelperClass Configuration;
	public MyHelperClass convertToHex(byte[] o0){ return null; }

    public String generateFilename() {
        MessageDigest md;
        byte[] sha1hash = new byte[40];
        Random r = new Random();
        String fileName = "";
        String token = "";
        while (true) {
            token = Long.toString(Math.abs((int)(Object)r.nextLong()), 36) + Long.toString(System.currentTimeMillis());
            try {
                MyHelperClass MessageDigest = new MyHelperClass();
                md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
                md.update(token.getBytes("iso-8859-1"), 0, token.length());
                sha1hash =(byte[])(Object) md.digest();
            } catch (Exception e) {
                MyHelperClass Level = new MyHelperClass();
                log.log(Level.WARNING, e.getMessage(), e);
            }
            fileName =(String)(Object) convertToHex(sha1hash);
            if (!(Boolean)(Object)new File(Configuration.ImageUploadPath + fileName).exists()) {
                break;
            }
        }
        return fileName;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ImageUploadPath;
	public MyHelperClass WARNING;
public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, Exception o2){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }}

class Random {

public MyHelperClass nextLong(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }}
