import java.io.*;
import java.lang.*;
import java.util.*;



class c13536658 {
public MyHelperClass bytesToHash(MyHelperClass o0){ return null; }

    private String protectMarkup(String content, String markupRegex, String replaceSource, String replaceTarget) {
        MyHelperClass Pattern = new MyHelperClass();
        Matcher matcher =(Matcher)(Object) Pattern.compile(markupRegex,(int)(Object) Pattern.MULTILINE | (int)(Object)Pattern.DOTALL).matcher(content);
        StringBuffer result = new StringBuffer();
        while ((boolean)(Object)matcher.find()) {
            String protectedMarkup =(String)(Object) matcher.group();
            protectedMarkup = protectedMarkup.replaceAll(replaceSource, replaceTarget);
            try {
                MyHelperClass MessageDigest = new MyHelperClass();
                MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
                digest.reset();
                digest.update(protectedMarkup.getBytes("UTF-8"));
                String hash =(String)(Object) bytesToHash(digest.digest());
                matcher.appendReplacement(result, hash);
                MyHelperClass c_protectionMap = new MyHelperClass();
                c_protectionMap.put(hash, protectedMarkup);
                MyHelperClass m_hashList = new MyHelperClass();
                m_hashList.add(hash);
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        matcher.appendTail(result);
        return result.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass MULTILINE;
	public MyHelperClass DOTALL;
public MyHelperClass add(String o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass compile(String o0, int o1){ return null; }
	public MyHelperClass matcher(String o0){ return null; }
	public MyHelperClass put(String o0, String o1){ return null; }}

class Matcher {

public MyHelperClass find(){ return null; }
	public MyHelperClass appendTail(StringBuffer o0){ return null; }
	public MyHelperClass group(){ return null; }
	public MyHelperClass appendReplacement(StringBuffer o0, String o1){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass reset(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
