import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1962490 {
public MyHelperClass PKBProperty;

    private void createContents(final Shell shell)  throws Throwable {
        Package currentPackage = Package.getPackage("org.sf.pkb.gui");
        String author = currentPackage.getImplementationVendor();
        String version = currentPackage.getImplementationVersion();
        if (author == null || author.trim().length() == 0) {
            author = "Felton Fee";
        }
        if (version != null && version.trim().length() > 0) {
            version = "V" + version;
        } else {
            version = "";
        }
        FormData data = null;
        shell.setLayout(new FormLayout());
        MyHelperClass SWT = new MyHelperClass();
        Label label1 = new Label(shell, SWT.NONE);
        MyHelperClass Resources = new MyHelperClass();
        label1.setImage(Resources.IMAGE_PKB);
        data = new FormData();
        data.top =(MyHelperClass)(Object) new FormAttachment(0, 20);
        data.left =(MyHelperClass)(Object) new FormAttachment(0, 20);
        label1.setLayoutData(data);
//        MyHelperClass SWT = new MyHelperClass();
        Label label2 = new Label(shell, SWT.NONE);
        label2.setText(PKBProperty.DEFAULT_rebrand_application_title + " " + version);
//        MyHelperClass SWT = new MyHelperClass();
        Font font = new Font(shell.getDisplay(), "Arial", 12, SWT.NONE);
        label2.setFont(font);
        data = new FormData();
        data.top =(MyHelperClass)(Object) new FormAttachment(0, 25);
        data.left =(MyHelperClass)(Object) new FormAttachment(label1, 15);
        data.right =(MyHelperClass)(Object) new FormAttachment(100, -25);
        label2.setLayoutData(data);
//        MyHelperClass SWT = new MyHelperClass();
        CustomSeparator separator1 = new CustomSeparator(shell,(int)(Object) SWT.SHADOW_IN | (int)(Object)SWT.HORIZONTAL);
        data = new FormData();
        data.top =(MyHelperClass)(Object) new FormAttachment(label2, 20);
        data.left =(MyHelperClass)(Object) new FormAttachment(0, 0);
        data.right =(MyHelperClass)(Object) new FormAttachment(100, 0);
        separator1.setLayoutData(data);
//        MyHelperClass SWT = new MyHelperClass();
        Label label3 = new Label(shell, SWT.NONE);
        label3.setText("Written by " + author + " <");
        data = new FormData();
        data.top =(MyHelperClass)(Object) new FormAttachment(separator1, 10);
        data.left =(MyHelperClass)(Object) new FormAttachment(0, 15);
        label3.setLayoutData(data);
//        MyHelperClass SWT = new MyHelperClass();
        Hyperlink link = new Hyperlink(shell,(int)(Object) SWT.NONE | (int)(Object)SWT.NO_FOCUS);
        MyHelperClass PKBMain = new MyHelperClass();
        link.setText(PKBMain.CONTACT_EMAIL);
//        MyHelperClass SWT = new MyHelperClass();
        link.addListener(SWT.Selection, new Listener() {

            public void handleEvent(Event event) {
                MyHelperClass Program = new MyHelperClass();
                Program.launch("mailto:" + PKBMain.CONTACT_EMAIL + "?subject=[" + PKBMain.PRODUCT_ALEX_PKB + "]");
            }
        });
        data = new FormData();
        data.top =(MyHelperClass)(Object) new FormAttachment(separator1, 10);
        data.left =(MyHelperClass)(Object) new FormAttachment(label3, 2);
        link.setLayoutData(data);
//        MyHelperClass SWT = new MyHelperClass();
        Label label4 = new Label(shell, SWT.NONE);
        label4.setText(">");
        data = new FormData();
        data.top =(MyHelperClass)(Object) new FormAttachment(separator1, 10);
        data.left =(MyHelperClass)(Object) new FormAttachment(link, 2);
        data.right =(MyHelperClass)(Object) new FormAttachment(100, -20);
        label4.setLayoutData(data);
//        MyHelperClass SWT = new MyHelperClass();
        Label label6 = new Label(shell, SWT.NONE);
        label6.setText("Web site:");
        data = new FormData();
        data.top =(MyHelperClass)(Object) new FormAttachment(label4, 10);
        data.left =(MyHelperClass)(Object) new FormAttachment(0, 15);
        label6.setLayoutData(data);
//        MyHelperClass SWT = new MyHelperClass();
        Hyperlink link1 = new Hyperlink(shell,(int)(Object) SWT.NONE | (int)(Object)SWT.NO_FOCUS);
//        MyHelperClass PKBMain = new MyHelperClass();
        link1.setText(PKBMain.PRODUCT_WEBSITE);
//        MyHelperClass SWT = new MyHelperClass();
        link1.addListener(SWT.Selection, new Listener() {

            public void handleEvent(Event event) {
                MyHelperClass Program = new MyHelperClass();
                Program.launch(PKBMain.PRODUCT_WEBSITE);
            }
        });
        data = new FormData();
        data.top =(MyHelperClass)(Object) new FormAttachment(label4, 10);
        data.left =(MyHelperClass)(Object) new FormAttachment(label6, 2);
        link1.setLayoutData(data);
//        MyHelperClass SWT = new MyHelperClass();
        Button closeBtn = new Button(shell, SWT.PUSH);
        closeBtn.setText("Close");
        closeBtn.setLayoutData(data);
        closeBtn.addSelectionListener(new SelectionAdapter() {

            public void widgetSelected(SelectionEvent event) {
                shell.close();
            }
        });
        data = new FormData();
        data.top =(MyHelperClass)(Object) new FormAttachment(label6, 10);
        data.right =(MyHelperClass)(Object) new FormAttachment(100, -20);
        data.bottom =(MyHelperClass)(Object) new FormAttachment(100, -10);
        closeBtn.setLayoutData(data);
//        MyHelperClass SWT = new MyHelperClass();
        Button checkVersionBtn = new Button(shell, SWT.PUSH);
        checkVersionBtn.setText("Check version");
        checkVersionBtn.setLayoutData(data);
        checkVersionBtn.addSelectionListener(new SelectionAdapter() {

            public void widgetSelected(SelectionEvent event) {
                try {
                    URL url = new URL(PKBMain.PRODUCT_WEBSITE + "/latest-version.txt");
                    Properties prop = new Properties();
                    prop.load(url.openStream());
                    Package currentPackage = Package.getPackage("org.sf.pkb.gui");
                    String version = currentPackage.getImplementationVersion();
                    if (version == null) {
                        version = "";
                    }
                    String remoteVersion = prop.getProperty("version") + " b" + prop.getProperty("build");
                    if (remoteVersion.trim().compareTo(version.trim()) != 0) {
                        StringBuffer buf = new StringBuffer();
                        buf.append("<HTML><BODY>").append("<h3 style='color: #0033FF'>You do not have the latest version. <br/> ").append("The latest version is PKB ").append(prop.getProperty("version") + " b" + prop.getProperty("build")).append(".</h3><A HREF='").append(prop.getProperty("url")).append("' TARGET='_BLANK'>Please download here </a> <br/><br/>").append("<B>It is strongly suggested to backup your knowledge base before install or unzip the new package!</B>").append("</BODY></HTML>");
                        MyHelperClass Widget = new MyHelperClass();
                        Widget.getKnowledgeContentPanel().showTextInBrowser(buf.toString());
                    } else {
                        StringBuffer buf = new StringBuffer();
                        buf.append("<HTML><BODY>").append("<h3 style='color: #0033FF'>You already had the latest version - ALEX PKB ").append(prop.getProperty("version") + " b" + prop.getProperty("build")).append(".</h3>").append("</BODY></HTML>");
                        MyHelperClass Widget = new MyHelperClass();
                        Widget.getKnowledgeContentPanel().showTextInBrowser(buf.toString());
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                shell.close();
            }
        });
        data = new FormData();
        data.top =(MyHelperClass)(Object) new FormAttachment(label6, 10);
        data.right =(MyHelperClass)(Object) new FormAttachment((int)(Object)closeBtn, -5);
        data.bottom =(MyHelperClass)(Object) new FormAttachment(100, -10);
        checkVersionBtn.setLayoutData(data);
        shell.setDefaultButton(closeBtn);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SHADOW_IN;
	public MyHelperClass NO_FOCUS;
	public MyHelperClass IMAGE_PKB;
	public MyHelperClass HORIZONTAL;
	public MyHelperClass PRODUCT_ALEX_PKB;
	public MyHelperClass NONE;
	public MyHelperClass DEFAULT_rebrand_application_title;
	public MyHelperClass PUSH;
	public MyHelperClass PRODUCT_WEBSITE;
	public MyHelperClass CONTACT_EMAIL;
	public MyHelperClass Selection;
public MyHelperClass launch(String o0){ return null; }
	public MyHelperClass launch(MyHelperClass o0){ return null; }
	public MyHelperClass getKnowledgeContentPanel(){ return null; }
	public MyHelperClass showTextInBrowser(String o0){ return null; }}

class Shell {

public MyHelperClass setLayout(FormLayout o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getDisplay(){ return null; }
	public MyHelperClass setDefaultButton(Button o0){ return null; }}

class FormData {
public MyHelperClass top;
	public MyHelperClass bottom;
	public MyHelperClass right;
	public MyHelperClass left;
}

class FormLayout {

}

class Label {

Label(Shell o0, MyHelperClass o1){}
	Label(){}
	public MyHelperClass setLayoutData(FormData o0){ return null; }
	public MyHelperClass setImage(MyHelperClass o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass setFont(Font o0){ return null; }}

class FormAttachment {

FormAttachment(){}
	FormAttachment(int o0, int o1){}
	FormAttachment(Hyperlink o0, int o1){}
	FormAttachment(Label o0, int o1){}
	FormAttachment(CustomSeparator o0, int o1){}}

class Font {

Font(){}
	Font(MyHelperClass o0, String o1, int o2, MyHelperClass o3){}}

class CustomSeparator {

CustomSeparator(Shell o0, int o1){}
	CustomSeparator(){}
	public MyHelperClass setLayoutData(FormData o0){ return null; }}

class Hyperlink {

Hyperlink(){}
	Hyperlink(Shell o0, int o1){}
	public MyHelperClass setLayoutData(FormData o0){ return null; }
	public MyHelperClass setText(MyHelperClass o0){ return null; }
	public MyHelperClass addListener(MyHelperClass o0){ return null; }
	public MyHelperClass addListener(MyHelperClass o0,  Listener o1){ return null; }}

class Button {

Button(Shell o0, MyHelperClass o1){}
	Button(){}
	public MyHelperClass setLayoutData(FormData o0){ return null; }
	public MyHelperClass addSelectionListener( SelectionAdapter o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass addSelectionListener(){ return null; }}

class SelectionAdapter {

}

class Listener {

}

class SelectionEvent {

}

class Event {

}
