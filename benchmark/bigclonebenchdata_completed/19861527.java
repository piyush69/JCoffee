import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c19861527 {
public static MyHelperClass Tag;
public static MyHelperClass Attribute;
//	public MyHelperClass Tag;
//public MyHelperClass Attribute;

    static void getGroupMember(String groupname) {
        try {
            URL url = new URL("http://www.lastfm.de/group/" + groupname + "/members");
            URLConnection con = url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            HTMLEditorKit editorKit = new HTMLEditorKit();
            HTMLDocument htmlDoc = new HTMLDocument();
            htmlDoc.putProperty("IgnoreCharsetDirective", Boolean.TRUE);
            editorKit.read(br, htmlDoc, 0);
            Vector<String> a_tags = new Vector<String>();
            Iterator iter =(Iterator)(Object) htmlDoc.getIterator(Tag.A);
            while ((boolean)(Object)iter.isValid()) {
                a_tags.add((String)(String)(Object) iter.getAttributes().getAttribute(Attribute.HREF));
                iter.next();
            }
            Vector<String> members = new Vector<String>();
            for (int i = 0; i < a_tags.size(); i++) {
                String element = (String) a_tags.get(i);
                if (!members.contains(element)) {
                    if (element.contains("/user/")) {
                        members.add(element);
                    }
                }
            }
            for (int a = 0; a < members.size(); a++) {
                String gruppe = members.elementAt(a).toString().substring(6);
                int b = gruppe.length() - 1;
                String membername = gruppe.toString().substring(0, b);
                MyHelperClass DB_Groups = new MyHelperClass();
                DB_Groups.addGroupRelation(membername, groupname);
                MyHelperClass User = new MyHelperClass();
                User.getUserProfile_Stop(membername);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HREF;
	public MyHelperClass A;
public MyHelperClass getUserProfile_Stop(String o0){ return null; }
	public MyHelperClass getAttribute(MyHelperClass o0){ return null; }
	public MyHelperClass addGroupRelation(String o0, String o1){ return null; }}

class HTMLEditorKit {

public MyHelperClass read(BufferedReader o0, HTMLDocument o1, int o2){ return null; }}

class HTMLDocument {

public MyHelperClass getIterator(MyHelperClass o0){ return null; }
	public MyHelperClass putProperty(String o0, Boolean o1){ return null; }}

class BadLocationException extends Exception{
	public BadLocationException(String errorMessage) { super(errorMessage); }
}

class Iterator {

public MyHelperClass getAttributes(){ return null; }
	public MyHelperClass isValid(){ return null; }
	public MyHelperClass next(){ return null; }}
