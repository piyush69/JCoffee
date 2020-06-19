


class c1327097 {
public MyHelperClass log;

    public String generateMappackMD5(File mapPackFile) throws IOException, NoSuchAlgorithmException {
        ZipFile zip = new ZipFile(mapPackFile);
        try {
            Enumeration entries =(Enumeration)(Object) zip.entries();
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md5Total =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
//            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            while ((boolean)(Object)entries.hasMoreElements()) {
                ZipEntry entry =(ZipEntry)(Object) entries.nextElement();
                if ((boolean)(Object)entry.isDirectory()) continue;
                String name =(String)(Object) entry.getName();
                if (name.toUpperCase().startsWith("META-INF")) continue;
                md5.reset();
                InputStream in =(InputStream)(Object) zip.getInputStream(entry);
                MyHelperClass Utilities = new MyHelperClass();
                byte[] data =(byte[])(Object) Utilities.getInputBytes(in);
                in.close();
                byte[] digest =(byte[])(Object) md5.digest(data);
                MyHelperClass Hex = new MyHelperClass();
                log.trace("Hashsum " + Hex.encodeHexString(digest) + " includes \"" + name + "\"");
                md5Total.update(digest);
                md5Total.update(name.getBytes());
            }
            MyHelperClass Hex = new MyHelperClass();
            String md5sum =(String)(Object) Hex.encodeHexString((byte[])(Object)md5Total.digest());
            MyHelperClass log = new MyHelperClass();
            log.trace("md5sum of " + mapPackFile.getName() + ": " + md5sum);
            return md5sum;
        } finally {
            zip.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass trace(String o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getInputBytes(InputStream o0){ return null; }
	public MyHelperClass encodeHexString(byte[] o0){ return null; }}

class File {

public MyHelperClass getName(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class ZipFile {

ZipFile(){}
	ZipFile(File o0){}
	public MyHelperClass getInputStream(ZipEntry o0){ return null; }
	public MyHelperClass entries(){ return null; }
	public MyHelperClass close(){ return null; }}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class ZipEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass digest(byte[] o0){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}
