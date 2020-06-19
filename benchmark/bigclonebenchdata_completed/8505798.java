


class c8505798 {

    boolean isTextPage(URL url) {
        try {
            String ct =(String)(Object) url.openConnection().getContentType().toLowerCase();
            String s = url.toString();
            MyHelperClass Loro = new MyHelperClass();
            Loro.log("LoroEDI: " + "  content-type: " + ct);
            if (!ct.startsWith("text/") || s.endsWith(".jar") || s.endsWith(".lar")) {
                MyHelperClass Str = new MyHelperClass();
                javax.swing.JOptionPane.showOptionDialog(null, Str.get("gui.1_browser_cannot_show_link", s), "", javax.swing.JOptionPane.DEFAULT_OPTION, javax.swing.JOptionPane.WARNING_MESSAGE, null, null, null);
//                MyHelperClass Loro = new MyHelperClass();
                Loro.log("LoroEDI: " + "  unable to display");
                return false;
            }
        } catch (Exception ex) {
            MyHelperClass Loro = new MyHelperClass();
            Loro.log("LoroEDI: " + "  Exception: " + ex.getMessage());
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass log(String o0){ return null; }
	public MyHelperClass get(String o0, String o1){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass toLowerCase(){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}
