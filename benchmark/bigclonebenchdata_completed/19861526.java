import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c19861526 {
public static MyHelperClass Tag;
public static MyHelperClass Attribute;
//	public MyHelperClass Tag;
//public MyHelperClass Attribute;
	public static MyHelperClass getGroupMember(String o0){ return null; }
	public static MyHelperClass getGroupsImage(String o0){ return null; }
public MyHelperClass DB_Groups;
//	public MyHelperClass getGroupsImage(String o0){ return null; }
//	public MyHelperClass getGroupMember(String o0){ return null; }

    static void getGroups(String username) {
        try {
            MyHelperClass Gui = new MyHelperClass();
            Gui.getBalken().setValue(85);
//            MyHelperClass Gui = new MyHelperClass();
            Gui.getBalken().setString("crawling Groups");
//            MyHelperClass Gui = new MyHelperClass();
            Gui.getBalken().paint(Gui.getBalken().getGraphics());
            URL url = new URL("http://www.lastfm.de/user/" + username + "/groups/");
            URLConnection con = url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            HTMLEditorKit editorKit = new HTMLEditorKit();
            HTMLDocument htmlDoc = new HTMLDocument();
            htmlDoc.putProperty("IgnoreCharsetDirective", Boolean.TRUE);
            editorKit.read(br, htmlDoc, 0);
            Vector a_tags = new Vector();
            Iterator iter1 =(Iterator)(Object) htmlDoc.getIterator(Tag.A);
            while ((boolean)(Object)iter1.isValid()) {
                a_tags.add((String)(String)(Object) iter1.getAttributes().getAttribute(Attribute.HREF));
                iter1.next();
            }
            Vector gruppen = new Vector();
            for (int i = 0; i < a_tags.size(); i++) {
                String element = (String) a_tags.get(i);
                if (!gruppen.contains(element)) {
                    if (element.contains("/group/")) gruppen.add(element);
                }
            }
            for (int a = 0; a < gruppen.size(); a++) {
                String gruppe = gruppen.elementAt(a).toString().substring(7);
                if (gruppe.contains("Last.fm+auf+Deutsch")) {
                    System.out.println("Auschalten Last.fm.auf.Deutsch");
                } else {
                    System.out.println(gruppe + " gruppe ");
                    MyHelperClass DB_Groups = new MyHelperClass();
                    if (!(Boolean)(Object)DB_Groups.checkGroup(gruppe)) {
                        System.out.println(gruppe);
//                        MyHelperClass DB_Groups = new MyHelperClass();
                        if (!(Boolean)(Object)DB_Groups.checkGroup(gruppe)) {
//                            MyHelperClass DB_Groups = new MyHelperClass();
                            DB_Groups.addGroup(gruppe);
                            getGroupsImage(username);
                            getGroupMember(gruppe);
                        }
                        DB_Groups.addGroupRelation(username, gruppe);
                        getGroupsImage(username);
                    }
                }
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
public MyHelperClass setValue(int o0){ return null; }
	public MyHelperClass getGraphics(){ return null; }
	public MyHelperClass setString(String o0){ return null; }
	public MyHelperClass checkGroup(String o0){ return null; }
	public MyHelperClass getBalken(){ return null; }
	public MyHelperClass addGroup(String o0){ return null; }
	public MyHelperClass getAttribute(MyHelperClass o0){ return null; }
	public MyHelperClass paint(MyHelperClass o0){ return null; }
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
