import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7724805 {

    public static Vector<Person> parseFriends(Worker me, SmEngine sme, Person resource) throws Throwable, IOException {
        URL url = new URL((String)(Object)resource.getUrl());
        long fid;
        if (sme.getProxy() == null) me.conn =(MyHelperClass)(Object) (HttpURLConnection) url.openConnection(); else me.conn = (HttpURLConnection) url.openConnection((Proxy)(Object)sme.getProxy());
        me.conn.setReadTimeout(20 * 1000);
        Vector<Person> result;
        Parser parser;
        NodeList nl;
        NodeFilter[] filters1 = new NodeFilter[2];
        filters1[0] =(NodeFilter)(Object) new TagNameFilter("a");
        filters1[1] =(NodeFilter)(Object) new HasAttributeFilter("class", "signup_btn uiButton uiButtonSpecial uiButtonLarge");
        NodeFilter[] filters2 = new NodeFilter[3];
        filters2[0] =(NodeFilter)(Object) new TagNameFilter("a");
        filters2[1] =(NodeFilter)(Object) new HasAttributeFilter("class", "title");
        filters2[2] =(NodeFilter)(Object) new HasParentFilter(new HasAttributeFilter("class", "UIPortrait_Text"));
        try {
            parser = new Parser(me.conn);
        } catch (ParserException e) {
            System.err.println(e.getMessage());
            return null;
        }
        try {
            nl =(NodeList)(Object) parser.parse(new AndFilter(filters1));
            fid = Long.parseLong(((LinkTag)(LinkTag)(Object) nl.elementAt(0)).getLink().split("(fid=|&amp)")[2]);
        } catch (ParserException e) {
            e.printStackTrace();
            return null;
        }
        result = new Vector<Person>();
        try {
            nl =(NodeList)(Object) parser.parse(new AndFilter(filters2));
        } catch (ParserException e) {
            e.printStackTrace();
            return null;
        }
        Person p;
        for (int i = 0; i < (int)(Object)nl.size(); i++) {
            p = sme.getPerson(fid, ((TagNode)(TagNode)(Object) nl.elementAt(i)).getAttribute("title"), ((TagNode)(TagNode)(Object) nl.elementAt(i)).getAttribute("href"));
            resource.addFriend(p);
            p.addFriend(resource);
            synchronized (p) {
                if (!(Boolean)(Object)p.isInQueue()) {
                    p.setInQueue(true);
                    sme.addResource(p);
                }
            }
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass split(String o0){ return null; }
	public MyHelperClass setReadTimeout(int o0){ return null; }}

class Worker {
public MyHelperClass conn;
}

class SmEngine {

public MyHelperClass addResource(Person o0){ return null; }
	public MyHelperClass getProxy(){ return null; }}

class Person {

public MyHelperClass getUrl(){ return null; }
	public MyHelperClass setInQueue(boolean o0){ return null; }
	public MyHelperClass isInQueue(){ return null; }
	public MyHelperClass addFriend(Person o0){ return null; }}

class NodeList {

public MyHelperClass size(){ return null; }
	public MyHelperClass elementAt(int o0){ return null; }}

class NodeFilter {

}

class TagNameFilter {

TagNameFilter(String o0){}
	TagNameFilter(){}}

class HasAttributeFilter {

HasAttributeFilter(String o0, String o1){}
	HasAttributeFilter(){}}

class HasParentFilter {

HasParentFilter(HasAttributeFilter o0){}
	HasParentFilter(){}}

class ParserException extends Exception{
	public ParserException(String errorMessage) { super(errorMessage); }
}

class AndFilter {

AndFilter(NodeFilter[] o0){}
	AndFilter(){}}

class LinkTag {

public MyHelperClass getLink(){ return null; }}

class TagNode {

public MyHelperClass getAttribute(String o0){ return null; }}

class Parser {

Parser(MyHelperClass o0){}
	Parser(){}
	public MyHelperClass parse(AndFilter o0){ return null; }}
