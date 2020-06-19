import java.io.*;
import java.lang.*;
import java.util.*;



class c16445797 {

//    @Override
    public void run() {
        String src = null;
        try {
            MyHelperClass srcFile = new MyHelperClass();
            src =(String)(Object) File.readText((InputStream)(Object)srcFile);
            MyHelperClass Char = new MyHelperClass();
            if ((boolean)(Object)Char.isValidate(src)) {
                MyHelperClass ConsEnv = new MyHelperClass();
                java.net.URL url = new java.net.URL(ConsEnv.HOMEPAGE + "code/code0001.ashx");
                java.util.HashMap<String, String> params = new java.util.HashMap<String, String>();
//                MyHelperClass srcFile = new MyHelperClass();
                String ext =(String)(Object) File.getExtension(srcFile.getName());
//                MyHelperClass Char = new MyHelperClass();
                if ((boolean)(Object)Char.isValidate(ext) && ext.charAt(0) == '.') {
                    ext = ext.substring(1);
                }
                params.put("l", ext);
                params.put("i", "1");
                MyHelperClass ck_LineNbr = new MyHelperClass();
                params.put("n",(boolean)(Object) ck_LineNbr.isSelected() ? "1" : "0");
                MyHelperClass ck_LinkUri = new MyHelperClass();
                params.put("u",(boolean)(Object) ck_LinkUri.isSelected() ? "1" : "0");
                MyHelperClass cb_TagStyle = new MyHelperClass();
                params.put("t", cb_TagStyle.getSelectedItem() + "");
                MyHelperClass tf_TabCount = new MyHelperClass();
                String tab =(String)(Object) tf_TabCount.getText().trim();
                if (java.util.regex.Pattern.matches("^\\d+$", tab)) {
                    tab = "4";
                }
                params.put("s", tab);
                params.put("o", "html");
                params.put("c", src);
                java.net.HttpURLConnection con = (java.net.HttpURLConnection) url.openConnection();
                MyHelperClass Http = new MyHelperClass();
                java.io.InputStream stream =(InputStream)(Object) Http.post((HttpURLConnection)(Object)con, params);
                MyHelperClass ep_CodeView = new MyHelperClass();
                ep_CodeView.setContentType(con.getContentType());
                src =(String)(Object) File.readText(stream);
                stream.close();
                con.disconnect();
                java.io.File tmpFile = java.io.File.createTempFile("src_", ".html");
                tmpFile.deleteOnExit();
                File.saveText((File)(Object)tmpFile, src);
//                MyHelperClass ep_CodeView = new MyHelperClass();
                ep_CodeView.setPage((URL)(Object)tmpFile.toURI().toURL());
//                MyHelperClass ep_CodeView = new MyHelperClass();
                ep_CodeView.setFont(ep_CodeView.getFont().deriveFont(20f));
            }
        } catch (Exception exp) {
            MyHelperClass Logs = new MyHelperClass();
            Logs.exception(exp);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HOMEPAGE;
public MyHelperClass isValidate(String o0){ return null; }
	public MyHelperClass getSelectedItem(){ return null; }
	public MyHelperClass setPage(URL o0){ return null; }
	public MyHelperClass exception(Exception o0){ return null; }
	public MyHelperClass trim(){ return null; }
	public MyHelperClass setFont(MyHelperClass o0){ return null; }
	public MyHelperClass deriveFont(float o0){ return null; }
	public MyHelperClass isSelected(){ return null; }
	public MyHelperClass getFont(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass post(HttpURLConnection o0, HashMap<String,String> o1){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass getText(){ return null; }}

class File {

public static MyHelperClass saveText(File o0, String o1){ return null; }
	public static MyHelperClass readText(InputStream o0){ return null; }
	public static MyHelperClass getExtension(MyHelperClass o0){ return null; }}

class URL {

}

class HttpURLConnection {

}
