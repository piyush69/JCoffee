import java.io.*;
import java.lang.*;
import java.util.*;



class c3046085 {
public MyHelperClass free;
	public MyHelperClass tags;
	public MyHelperClass rating;
	public MyHelperClass title;
	public MyHelperClass MessageDigest;
	public MyHelperClass overplay;
	public MyHelperClass location;
	public MyHelperClass artist;

    public void Song(String s) {
        StringTokenizer tokenizer = new StringTokenizer(s, ";");
        free =(MyHelperClass)(Object) false;
        title =(MyHelperClass)(Object) tokenizer.nextToken();
        artist =(MyHelperClass)(Object) tokenizer.nextToken();
        location =(MyHelperClass)(Object) tokenizer.nextToken();
        rating =(MyHelperClass)(Object) Integer.parseInt(tokenizer.nextToken());
        overplay =(MyHelperClass)(Object) Integer.parseInt(tokenizer.nextToken());
        String temp = tokenizer.nextToken();
        tokenizer = new StringTokenizer(temp, ",[] ");
        tags =(MyHelperClass)(Object) new ArrayList<String>();
        while (tokenizer.hasMoreTokens()) {
            tags.add(tokenizer.nextToken());
        }
        byte[] bytes = new byte[40];
        try {
            MessageDigest hasher =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            hasher.update(title.getBytes());
            hasher.update(artist.getBytes());
            bytes =(byte[])(Object) hasher.digest();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass add(String o0){ return null; }
	public MyHelperClass getBytes(){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }}
