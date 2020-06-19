import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12747045 {
public MyHelperClass start(){ return null; }
public MyHelperClass start(){ return null; }
//public MyHelperClass start(){ return null; }
//public MyHelperClass start(){ return null; }
//public MyHelperClass start(){ return null; }
//public MyHelperClass start(){ return null; }
//public MyHelperClass start(){ return null; }
//public MyHelperClass start(){ return null; }
	public MyHelperClass setDrawing(Drawing o0){ return null; }
public MyHelperClass initComponents(){ return null; }
	public MyHelperClass getDrawing(){ return null; }
//	public MyHelperClass start(){ return null; }
	public MyHelperClass getDocumentBase(){ return null; }
	public MyHelperClass getParameter(String o0){ return null; }
	public MyHelperClass setData(String o0){ return null; }
public MyHelperClass BoxLayout;
	public MyHelperClass getAppletInfo(){ return null; }
	public MyHelperClass getContentPane(){ return null; }

    public void init()  throws Throwable {
        try {
            MyHelperClass UIManager = new MyHelperClass();
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Throwable e) {
        }
        Container c =(Container)(Object) getContentPane();
        c.setLayout((BorderLayout)(Object)new BoxLayout(c, BoxLayout.Y_AXIS));
        String[] lines =(String[])(Object) getAppletInfo().split("\n");
        for (int i = 0; i < lines.length; i++) {
            c.add(new JLabel(lines[i]));
        }
        new Worker() {

            public Object construct() {
                Object result;
                try {
                    if (getParameter("data") != null &&(int)(Object) getParameter("data").length() > 0) {
                        NanoXMLDOMInput domi = new NanoXMLDOMInput(new UMLFigureFactory(),(InputStream)(Object) new StringReader((String)(Object)getParameter("data")));
                        result = domi.readObject(0);
                    } else if (getParameter("datafile") != null) {
                        InputStream in = null;
                        try {
                            URL url = new URL((URL)(Object)getDocumentBase(),(String)(Object) getParameter("datafile"));
                            in = url.openConnection().getInputStream();
                            NanoXMLDOMInput domi = new NanoXMLDOMInput(new UMLFigureFactory(), in);
                            result = domi.readObject(0);
                        } finally {
                            if (in != null) in.close();
                        }
                    } else {
                        result = null;
                    }
                } catch (Throwable t) {
                    result = t;
                }
                return result;
            }

            public void finished(Object result) {
                Container c =(Container)(Object) getContentPane();
                c.setLayout(new BorderLayout());
                c.removeAll();
                initComponents();
                if (result != null) {
                    if (result instanceof Drawing) {
                        setDrawing((Drawing) result);
                    } else if (result instanceof Throwable) {
                        getDrawing().add(new TextFigure(result.toString()));
                        ((Throwable) result).printStackTrace();
                    }
                }
                boolean isLiveConnect;
                try {
                    Class.forName("netscape.javascript.JSObject");
                    isLiveConnect = true;
                } catch (Throwable t) {
                    isLiveConnect = false;
                }
                MyHelperClass loadButton = new MyHelperClass();
                loadButton.setEnabled(isLiveConnect && getParameter("dataread") != null);
                MyHelperClass saveButton = new MyHelperClass();
                saveButton.setEnabled(isLiveConnect && getParameter("datawrite") != null);
                if (isLiveConnect) {
                    String methodName =(String)(Object) getParameter("dataread");
                    if (methodName.indexOf('(') > 0) {
                        methodName = methodName.substring(0, methodName.indexOf('(') - 1);
                    }
                    MyHelperClass JSObject = new MyHelperClass();
                    JSObject win = JSObject.getWindow(UMLLiveConnectApplet.this);
                    Object data = win.call(methodName, new Object[0]);
                    if (data instanceof String) {
                        setData((String) data);
                    }
                }
                c.validate();
            }
        }.start();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass Y_AXIS;
public MyHelperClass setLookAndFeel(MyHelperClass o0){ return null; }
	public MyHelperClass split(String o0){ return null; }
	public MyHelperClass add(TextFigure o0){ return null; }
	public MyHelperClass setEnabled(boolean o0){ return null; }
	public MyHelperClass getSystemLookAndFeelClassName(){ return null; }
	public MyHelperClass length(){ return null; }}

class Container {

public MyHelperClass setLayout(BorderLayout o0){ return null; }
	public MyHelperClass validate(){ return null; }
	public MyHelperClass add(JLabel o0){ return null; }
	public MyHelperClass removeAll(){ return null; }}

class BoxLayout {

BoxLayout(Container o0, MyHelperClass o1){}
	BoxLayout(){}}

class JLabel {

JLabel(String o0){}
	JLabel(){}}

class Worker {

}

class NanoXMLDOMInput {

NanoXMLDOMInput(UMLFigureFactory o0, InputStream o1){}
	NanoXMLDOMInput(){}
	public MyHelperClass readObject(int o0){ return null; }}

class UMLFigureFactory {

}

class BorderLayout {

}

class Drawing {

}

class TextFigure {

TextFigure(String o0){}
	TextFigure(){}}

class JSObject {

public MyHelperClass call(String o0, Object[] o1){ return null; }}

class UMLLiveConnectApplet {

}
