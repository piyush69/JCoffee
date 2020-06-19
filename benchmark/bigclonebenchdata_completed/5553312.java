import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5553312 {

    public static List<String> retrieveLanguages() throws Throwable, Exception {
        List<String> result = new ArrayList<String>();
        URL url = new URL("http://translatewiki.net/w/i.php?title=Special:MessageGroupStats&group=out-osm-site");
        MyHelperClass StreamUtil = new MyHelperClass();
        String str = StreamUtil.toString(url.openStream());
        MyHelperClass Pattern = new MyHelperClass();
        Pattern pattern =(Pattern)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) Pattern.compile(".*language=([^;\"]+).*");
        Matcher m =(Matcher)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) pattern.matcher(str);
        while ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)m.find()) {
            String lang =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) m.group(1);
            if (!result.contains(lang)) {
                result.add(lang);
            }
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass compile(String o0){ return null; }}

class Pattern {

public MyHelperClass matcher(String o0){ return null; }}

class Matcher {

public MyHelperClass group(int o0){ return null; }
	public MyHelperClass find(){ return null; }}

class Object {

public MyHelperClass toString(InputStream o0){ return null; }}
