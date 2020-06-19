import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c23246123 {
public MyHelperClass setTitle(MyHelperClass o0){ return null; }
	public MyHelperClass setMessage(MyHelperClass o0){ return null; }

    protected Control createDialogArea(Composite parent)  throws Throwable {
        Composite composite = (Composite)(Composite)(Object) this.createDialogArea(parent);
        MyHelperClass DialogsMessages = new MyHelperClass();
        setTitle(DialogsMessages.getString("LicenseDialog.Caption"));
//        MyHelperClass DialogsMessages = new MyHelperClass();
        setMessage(DialogsMessages.getString("LicenseDialog.Explanation"));
        MyHelperClass SWT = new MyHelperClass();
        Composite content = new Composite(composite, SWT.NONE);
        MyHelperClass GridData = new MyHelperClass();
        content.setLayoutData(new GridData(GridData.FILL_BOTH));
        final int ncol = 1;
        GridLayout layout = new GridLayout(1, false);
        layout.numColumns =(MyHelperClass)(Object) ncol;
        content.setLayout(layout);
        Browser browser = null;
        Text text = null;
        try {
//            MyHelperClass SWT = new MyHelperClass();
            browser = new Browser(content, SWT.NONE);
//            MyHelperClass GridData = new MyHelperClass();
            browser.setLayoutData(new GridData(GridData.FILL_BOTH));
        } catch (Throwable t) {
//            MyHelperClass SWT = new MyHelperClass();
            text = new Text(content,(int)(Object) SWT.MULTI | (int)(Object)SWT.WRAP | (int)(Object)SWT.VERTICAL);
//            MyHelperClass GridData = new MyHelperClass();
            text.setLayoutData(new GridData(GridData.FILL_BOTH));
        }
        MyHelperClass PalobrowserPlugin = new MyHelperClass();
        URL url = PalobrowserPlugin.getDefault().getBundle().getResource(browser != null ? "license.html" : "license.txt");
        InputStream in = null;
        BufferedReader r = null;
        StringBuffer sb = new StringBuffer();
        try {
            in = url.openStream();
            r = new BufferedReader(new InputStreamReader(in, "ISO-8859-1"));
            String line;
            while ((line = r.readLine()) != null) sb.append(line).append("\r\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (r != null) {
                try {
                    r.close();
                } catch (IOException e) {
                }
            }
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                }
            }
        }
        if (browser != null) browser.setText(sb.toString()); else text.setText(sb.toString());
        return(Control)(Object) composite;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass WRAP;
	public MyHelperClass VERTICAL;
	public MyHelperClass NONE;
	public MyHelperClass FILL_BOTH;
	public MyHelperClass MULTI;
public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass getDefault(){ return null; }
	public MyHelperClass getBundle(){ return null; }}

class Composite {

Composite(){}
	Composite(Composite o0, MyHelperClass o1){}
	public MyHelperClass setLayoutData(GridData o0){ return null; }
	public MyHelperClass setLayout(GridLayout o0){ return null; }}

class Control {

}

class GridData {

GridData(MyHelperClass o0){}
	GridData(){}}

class GridLayout {
public MyHelperClass numColumns;
GridLayout(int o0, boolean o1){}
	GridLayout(){}}

class Browser {

Browser(Composite o0, MyHelperClass o1){}
	Browser(){}
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass setLayoutData(GridData o0){ return null; }}

class Text {

Text(Composite o0, int o1){}
	Text(){}
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass setLayoutData(GridData o0){ return null; }}
