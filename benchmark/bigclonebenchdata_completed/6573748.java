import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6573748 {

    public static void main(String[] args)  throws Throwable {
        MyHelperClass Stopwatch = new MyHelperClass();
        Stopwatch.start("");
        HtmlParser parser = new HtmlParser();
        try {
//            MyHelperClass Stopwatch = new MyHelperClass();
            Stopwatch.printTimeReset("", "> ParserDelegator");
            ParserDelegator del = new ParserDelegator();
//            MyHelperClass Stopwatch = new MyHelperClass();
            Stopwatch.printTimeReset("", "> url");
            URL url = new URL(args[0]);
//            MyHelperClass Stopwatch = new MyHelperClass();
            Stopwatch.printTimeReset("", "> openStrem");
            InputStream is = url.openStream();
//            MyHelperClass Stopwatch = new MyHelperClass();
            Stopwatch.printTimeReset("", "< parse");
            del.parse(new InputStreamReader(is), parser, true);
//            MyHelperClass Stopwatch = new MyHelperClass();
            Stopwatch.printTimeReset("", "< parse");
        } catch (Throwable t) {
            t.printStackTrace();
        }
//        MyHelperClass Stopwatch = new MyHelperClass();
        Stopwatch.printTimeReset("", "> traversal");
        MyHelperClass TreeTraversal = new MyHelperClass();
        TreeTraversal.traverse(parser.startTag, "eachChild", new Function() {

            String lastPath = null;

            public void apply(Object obj) {
                if (obj instanceof String) {
                    System.out.print(lastPath + ":");
                    System.out.println(obj);
                    return;
                }
                Tag t = (Tag) obj;
                MyHelperClass Utils = new MyHelperClass();
                lastPath =(String)(Object) Utils.tagPath(t);
                System.out.println(lastPath);
            }
        });
//        MyHelperClass Stopwatch = new MyHelperClass();
        Stopwatch.printTimeReset("", "< traversal");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass start(String o0){ return null; }
	public MyHelperClass printTimeReset(String o0, String o1){ return null; }
	public MyHelperClass traverse(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass traverse(MyHelperClass o0, String o1,  Function o2){ return null; }
	public MyHelperClass tagPath(Tag o0){ return null; }}

class HtmlParser {
public MyHelperClass startTag;
}

class ParserDelegator {

public MyHelperClass parse(InputStreamReader o0, HtmlParser o1, boolean o2){ return null; }}

class Function {

}

class Tag {

}
