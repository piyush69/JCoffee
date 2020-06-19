import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17792212 {
public MyHelperClass NULL;
public MyHelperClass shell;
	public MyHelperClass SWT;
	public MyHelperClass SharedStyle;

    private void createButtonCopyToClipboard()  throws Throwable {
        Button buttonCopyToClipboard =(Button)(Object) NULL; //new Button();
        buttonCopyToClipboard = new Button(shell, SWT.PUSH);
//        MyHelperClass buttonCopyToClipboard = new MyHelperClass();
        buttonCopyToClipboard.setText("Co&py to Clipboard");
        MyHelperClass buttonClose = new MyHelperClass();
        buttonCopyToClipboard.setLayoutData(SharedStyle.relativeToBottomRight(buttonClose));
//        MyHelperClass buttonCopyToClipboard = new MyHelperClass();
        buttonCopyToClipboard.addSelectionListener(new SelectionAdapter() {

//            @Override
            public void widgetSelected(final SelectionEvent event) {
                MyHelperClass Version = new MyHelperClass();
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copyToClipboard(Version.getEnvironmentReport());
            }
        });
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PUSH;
public MyHelperClass addSelectionListener(){ return null; }
	public MyHelperClass setLayoutData(MyHelperClass o0){ return null; }
	public MyHelperClass getEnvironmentReport(){ return null; }
	public MyHelperClass relativeToBottomRight(MyHelperClass o0){ return null; }
	public MyHelperClass addSelectionListener( SelectionAdapter o0){ return null; }
	public MyHelperClass copyToClipboard(MyHelperClass o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }}

class SelectionAdapter {

}

class Button {

Button(){}
	Button(MyHelperClass o0, MyHelperClass o1){}
	public MyHelperClass addSelectionListener(){ return null; }
	public MyHelperClass setLayoutData(MyHelperClass o0){ return null; }
	public MyHelperClass addSelectionListener( SelectionAdapter o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }}

class SelectionEvent {

}
