import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c19861528 {

    public static void getGroupsImage(String username) {
        try {
            URL url = new URL("http://www.lastfm.de/user/" + username + "/groups/");
            URLConnection con = url.openConnection();
            HashMap hm = new HashMap();
            Parser parser = new Parser(con);
            NodeList images =(NodeList)(Object) parser.parse(new TagNameFilter("IMG"));
            System.out.println(images.size());
            for (int i = 0; i < (int)(Object)images.size(); i++) {
                Node bild =(Node)(Object) images.elementAt(i);
                String bilder =(String)(Object) bild.getText();
                if (bilder.contains("http://panther1.last.fm/groupava")) {
                    String bildurl = bilder.substring(9, 81);
                    StringTokenizer st = new StringTokenizer(bilder.substring(88), "\"");
                    String groupname = st.nextToken();
                    hm.put(groupname, bildurl);
                }
            }
            MyHelperClass DB_Groups = new MyHelperClass();
            DB_Groups.addGroupImage(hm);
            System.out.println("log3");
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass addGroupImage(HashMap o0){ return null; }}

class Parser {

Parser(URLConnection o0){}
	Parser(){}
	public MyHelperClass parse(TagNameFilter o0){ return null; }}

class NodeList {

public MyHelperClass size(){ return null; }
	public MyHelperClass elementAt(int o0){ return null; }}

class TagNameFilter {

TagNameFilter(String o0){}
	TagNameFilter(){}}

class Node {

public MyHelperClass getText(){ return null; }}

class ParserException extends Exception{
	public ParserException(String errorMessage) { super(errorMessage); }
}
