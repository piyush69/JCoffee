import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17613722 {
public MyHelperClass Object;
public MyHelperClass errortext;
	public MyHelperClass rg;
	public MyHelperClass error;
	public MyHelperClass errorcode;
	public MyHelperClass DOMUtil;
	public MyHelperClass getUser(){ return null; }
	public MyHelperClass readXML(HttpURLConnection o0){ return null; }
	public MyHelperClass makeResponse(){ return null; }
	public MyHelperClass complain(String o0){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass clearError(){ return null; }
	public MyHelperClass getHost(){ return null; }

    public void go() throws Throwable, FBConnectionException, FBErrorException, IOException {
        clearError();
        if (rg == null) {
            error =(MyHelperClass)(Object) true;
            errorcode =(MyHelperClass)(Object)(int)(Object)(MyHelperClass)(Object)(int)(Object)(MyHelperClass)(Object)(int)(Object)(MyHelperClass)(Object)(int)(Object)(MyHelperClass)(Object) -102;
            errortext =(MyHelperClass)(Object) "No RootGalleryTree was defined";
            return;
        }
        URL url = new URL((String)(Object)(int)(Object)getHost() + (int)(Object)getPath());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestProperty("X-FB-User",(String)(Object) getUser());
        conn.setRequestProperty("X-FB-Auth",(String)(Object) makeResponse());
        conn.setRequestProperty("X-FB-Mode", "GetGals");
        conn.connect();
        Element fbresponse;
        try {
            fbresponse =(Element)(Object) readXML(conn);
        } catch (FBConnectionException fbce) {
            throw fbce;
        } catch (FBErrorException fbee) {
            throw fbee;
        } catch (Exception e) {
            FBConnectionException fbce = new FBConnectionException("XML parsing failed");
            fbce.attachSubException(e);
            throw fbce;
        }
        NodeList gals =(NodeList)(Object) fbresponse.getElementsByTagName("Gal");
        for (int i = 0; i < (int)(Object)gals.getLength(); i++) {
            Gallery g;
            Element curelement = (Element)(Element)(Object) gals.item(i);
            try {
                if ((boolean)(Object)DOMUtil.getSimpleElementText(curelement, "Name").startsWith("Tag: ")) {
                    g =(Gallery)(Object) new Tag(rg, DOMUtil.getSimpleElementText(curelement, "Name").substring(5), Integer.parseInt((String)(Object)DOMUtil.getSimpleAttributeText(curelement, "id")));
                } else {
                    g =(Gallery)(Object) rg.createGallery(Integer.parseInt((String)(Object)DOMUtil.getSimpleAttributeText(curelement, "id")), DOMUtil.getSimpleElementText(curelement, "Name"));
                }
            } catch (Exception e) {
                complain("HEY!  Gallery " + DOMUtil.getSimpleAttributeText(curelement, "id") + " failed to parse!");
                continue;
            }
            try {
                g.setURL(DOMUtil.getSimpleElementText(curelement, "URL"));
                g.setSecurity(Integer.parseInt((String)(Object)DOMUtil.getSimpleElementText(curelement, "Sec")));
            } catch (Exception e) {
                complain("HEY!  Metadata failed on " + ((Tag)(Object)g instanceof Tag ? "tag" : "gallery") + " " + DOMUtil.getSimpleAttributeText(curelement, "id") + "!");
                complain(e.toString());
            }
            try {
                g.setDate(DOMUtil.getSimpleElementText(curelement, "Date"));
            } catch (Exception e) {
            }
        }
        for (int i = 0; i < (int)(Object)gals.getLength(); i++) {
            int current;
            Element curelement = (Element)(Element)(Object) gals.item(i);
            try {
                current = Integer.parseInt((String)(Object)DOMUtil.getSimpleAttributeText(curelement, "id"));
            } catch (Exception e) {
                complain("HEY!  Gallery " + DOMUtil.getSimpleAttributeText(curelement, "id") + " failed to parse!");
                continue;
            }
            Gallery g =(Gallery)(Object) rg.getNode(current);
            NodeList parents;
            try {
                parents =(NodeList)(Object) DOMUtil.getFirstElement(curelement, "ParentGals").getElementsByTagName("ParentGal");
            } catch (Exception e) {
                complain("HEY!  Parsing failed on gallery " + current + ", so I'm assuming it's unparented!");
                continue;
            }
            for (int j = 0; j < (int)(Object)parents.getLength(); j++) {
                try {
                    g.addParent(rg.getNode(Integer.parseInt((String)(Object)DOMUtil.getSimpleAttributeText((Element)(Element)(Object) parents.item(j), "id"))));
                } catch (Exception e) {
                    complain("HEY!  Adding parent to gallery " + current + " failed!");
                    continue;
                }
            }
        }
        return;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass substring(int o0){ return null; }
	public MyHelperClass getFirstElement(Element o0, String o1){ return null; }
	public MyHelperClass startsWith(String o0){ return null; }
	public MyHelperClass getElementsByTagName(String o0){ return null; }
	public MyHelperClass getSimpleAttributeText(Element o0, String o1){ return null; }
	public MyHelperClass createGallery(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass getSimpleElementText(Element o0, String o1){ return null; }
	public MyHelperClass getNode(int o0){ return null; }}

class FBConnectionException extends Exception{
	public FBConnectionException(String errorMessage) { super(errorMessage); }
}

class FBErrorException extends Exception{
	public FBErrorException(String errorMessage) { super(errorMessage); }
}

class Element {

public MyHelperClass getElementsByTagName(String o0){ return null; }}

class NodeList {

public MyHelperClass item(int o0){ return null; }
	public MyHelperClass getLength(){ return null; }}

class Gallery {

public MyHelperClass addParent(MyHelperClass o0){ return null; }
	public MyHelperClass setURL(MyHelperClass o0){ return null; }
	public MyHelperClass setSecurity(int o0){ return null; }
	public MyHelperClass setDate(MyHelperClass o0){ return null; }}

class Tag {

Tag(){}
	Tag(MyHelperClass o0, MyHelperClass o1, int o2){}}
