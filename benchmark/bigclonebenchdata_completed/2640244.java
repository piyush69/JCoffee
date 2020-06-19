import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2640244 {
public MyHelperClass textArea;
	public MyHelperClass textPane;
	public MyHelperClass StdScrollPane;
	public MyHelperClass MessageBundle;
	public MyHelperClass setTitle(String o0){ return null; }
	public MyHelperClass getContentPane(){ return null; }

    public  void DocumentDialog(Frame frame, String title, String document)  throws Throwable {
        setTitle(title);
        textArea =(MyHelperClass)(Object) new JTextArea();
        textPane =(MyHelperClass)(Object) new StdScrollPane(textArea, StdScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, StdScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        textArea.setEditable(false);
        getContentPane().add(textPane);
        URL url = DocumentDialog.class.getClassLoader().getResource(document);
        try {
            StringBuilder sb = new StringBuilder();
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
            String buildNumber =(String)(Object) MessageBundle.getBuildNumber();
            String releaseNumber =(String)(Object) MessageBundle.getReleaseNumber();
            String tmp;
            while ((tmp = in.readLine()) != null) {
                tmp = tmp.replace("${build_number}", buildNumber);
                tmp = tmp.replace("${release_number}", releaseNumber);
                sb.append(tmp + "\n");
            }
            textArea.setText(sb.toString());
            textArea.setCaretPosition(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass VERTICAL_SCROLLBAR_AS_NEEDED;
	public MyHelperClass HORIZONTAL_SCROLLBAR_AS_NEEDED;
public MyHelperClass getBuildNumber(){ return null; }
	public MyHelperClass getReleaseNumber(){ return null; }
	public MyHelperClass add(MyHelperClass o0){ return null; }
	public MyHelperClass setCaretPosition(int o0){ return null; }
	public MyHelperClass setEditable(boolean o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }}

class Frame {

}

class JTextArea {

}

class StdScrollPane {

StdScrollPane(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){}
	StdScrollPane(){}}

class DocumentDialog {

}
