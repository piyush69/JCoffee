


class c8670491 {
public MyHelperClass impURLCommon(String o0, MyHelperClass o1){ return null; }
public MyHelperClass JOptionPane;
	public MyHelperClass Prefs;

    private void impurlActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            MyHelperClass PrefName = new MyHelperClass();
            String prevurl =(String)(Object) Prefs.getPref(PrefName.LASTIMPURL);
            MyHelperClass Resource = new MyHelperClass();
            String urlst =(String)(Object) JOptionPane.showInputDialog(Resource.getResourceString("enturl"), prevurl);
            if (urlst == null || urlst.equals("")) return;
//            MyHelperClass PrefName = new MyHelperClass();
            Prefs.putPref(PrefName.LASTIMPURL, urlst);
            URL url = new URL(urlst);
            impURLCommon(urlst, url.openStream());
        } catch (Exception e) {
            MyHelperClass Errmsg = new MyHelperClass();
            Errmsg.errmsg(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass LASTIMPURL;
public MyHelperClass getPref(MyHelperClass o0){ return null; }
	public MyHelperClass showInputDialog(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass errmsg(Exception o0){ return null; }
	public MyHelperClass getResourceString(String o0){ return null; }
	public MyHelperClass putPref(MyHelperClass o0, String o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}
