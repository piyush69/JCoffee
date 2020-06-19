import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4540202 {
public MyHelperClass id;

    public void myClickHandler(View view)  throws Throwable {
        switch((int)(Object)view.getId()) {
            case(int)(Object) id.ReadWebPage:
                try {
                    MyHelperClass textView = new MyHelperClass();
                    textView.setText("");
                    MyHelperClass urlText = new MyHelperClass();
                    URL url = new URL(urlText.getText().toString());
                    BufferedReader rd = new BufferedReader(new InputStreamReader(url.openStream()));
                    String line = "";
                    while ((line = rd.readLine()) != null) {
//                        MyHelperClass textView = new MyHelperClass();
                        textView.append(line);
                    }
                } catch (Exception e) {
                    System.out.println("Nay, did not work");
                    MyHelperClass textView = new MyHelperClass();
                    textView.setText(e.getMessage());
                }
                break;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ReadWebPage;
public MyHelperClass getText(){ return null; }
	public MyHelperClass append(String o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }}

class View {

public MyHelperClass getId(){ return null; }}
