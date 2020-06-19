


class c1528296 {

    public static Hashtable DefaultLoginValues(String firstName, String lastName, String password, String mac, String startLocation, int major, int minor, int patch, int build, String platform, String viewerDigest, String userAgent, String author) throws Exception {
        Hashtable values = new Hashtable();
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        md5.update(password.getBytes("ASCII"), 0, password.length());
        byte[] raw_digest =(byte[])(Object) md5.digest();
        MyHelperClass Helpers = new MyHelperClass();
        String passwordDigest =(String)(Object) Helpers.toHexText(raw_digest);
        values.put("first", firstName);
        values.put("last", lastName);
        values.put("passwd", "" + password);
        values.put("start", startLocation);
        values.put("major", major);
        values.put("minor", minor);
        values.put("patch", patch);
        values.put("build", build);
        values.put("platform", platform);
        values.put("mac", mac);
        values.put("agree_to_tos", "true");
        values.put("viewer_digest", viewerDigest);
//        MyHelperClass Helpers = new MyHelperClass();
        values.put("user-agent", userAgent + " (" + Helpers.VERSION + ")");
        values.put("author", author);
        Vector optionsArray = new Vector();
        optionsArray.addElement("inventory-root");
        optionsArray.addElement("inventory-skeleton");
        optionsArray.addElement("inventory-lib-root");
        optionsArray.addElement("inventory-lib-owner");
        optionsArray.addElement("inventory-skel-lib");
        optionsArray.addElement("initial-outfit");
        optionsArray.addElement("gestures");
        optionsArray.addElement("event_categories");
        optionsArray.addElement("event_notifications");
        optionsArray.addElement("classified_categories");
        optionsArray.addElement("buddy-list");
        optionsArray.addElement("ui-config");
        optionsArray.addElement("login-flags");
        optionsArray.addElement("global-textures");
        values.put("options", optionsArray);
        return values;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass VERSION;
public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass toHexText(byte[] o0){ return null; }}

class Hashtable {

public MyHelperClass put(String o0, String o1){ return null; }
	public MyHelperClass put(String o0, Vector o1){ return null; }
	public MyHelperClass put(String o0, int o1){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }}

class Vector {

public MyHelperClass addElement(String o0){ return null; }}
