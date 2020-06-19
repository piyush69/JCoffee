import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17901739 {
public static MyHelperClass Pattern;
	public static MyHelperClass Recoder;
	public static MyHelperClass m_strComponents;
	public static MyHelperClass m_strPriorities;
	public static MyHelperClass getTracUrl(){ return null; }
//public MyHelperClass m_strPriorities;
//	public MyHelperClass Pattern;
//	public MyHelperClass Recoder;
//	public MyHelperClass m_strComponents;
//	public MyHelperClass getTracUrl(){ return null; }

    private static void setMembers()  throws Throwable {
        try {
            URL url = new URL(getTracUrl() + "newticket");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String buffer = reader.readLine();
            while (buffer != null) {
                if (buffer.contains("<select id=\"component\" name=\"component\">")) {
                    Pattern pattern =(Pattern)(Object) Pattern.compile(">[^<]+?<");
                    Matcher matcher =(Matcher)(Object) pattern.matcher(buffer);
                    Vector<String> erg = new Vector<String>();
                    int start = 0;
                    while ((boolean)(Object)matcher.find(start)) {
                        int von =(int)(Object) matcher.start() + 1;
                        int bis =(int)(Object) matcher.end() - 1;
                        erg.add((String)(Object)Recoder.recode(buffer.substring(von, bis), "UTF-8", Recoder.getDefaultEncoding()));
                        start = bis;
                    }
                    m_strComponents =(MyHelperClass)(Object) new String[erg.size()];
                    erg.toArray(m_strComponents);
                }
                if (buffer.contains("<select id=\"priority\" name=\"priority\">")) {
                    Pattern pattern =(Pattern)(Object) Pattern.compile(">[^<]+?<");
                    Matcher matcher =(Matcher)(Object) pattern.matcher(buffer);
                    Vector<String> erg = new Vector<String>();
                    int start = 0;
                    while ((boolean)(Object)matcher.find(start)) {
                        int von =(int)(Object) matcher.start() + 1;
                        int bis =(int)(Object) matcher.end() - 1;
                        erg.add((String)(Object)Recoder.recode(buffer.substring(von, bis), "UTF-8", Recoder.getDefaultEncoding()));
                        start = bis;
                    }
                    m_strPriorities =(MyHelperClass)(Object) new String[erg.size()];
                    erg.toArray(m_strPriorities);
                }
                buffer = reader.readLine();
            }
        } catch (MalformedURLException e) {
            System.out.println("e1");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass compile(String o0){ return null; }
	public MyHelperClass getDefaultEncoding(){ return null; }
	public MyHelperClass recode(String o0, String o1, MyHelperClass o2){ return null; }}

class Pattern {

public MyHelperClass matcher(String o0){ return null; }}

class Matcher {

public MyHelperClass start(){ return null; }
	public MyHelperClass find(int o0){ return null; }
	public MyHelperClass end(){ return null; }}

class Collection {

public MyHelperClass toArray(MyHelperClass o0){ return null; }}
