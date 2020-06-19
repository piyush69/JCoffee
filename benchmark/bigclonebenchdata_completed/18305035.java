import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18305035 {
public MyHelperClass start(){ return null; }
public MyHelperClass start(){ return null; }
//public MyHelperClass start(){ return null; }
//public MyHelperClass start(){ return null; }
//public MyHelperClass start(){ return null; }
//public MyHelperClass start(){ return null; }
//public MyHelperClass start(){ return null; }
	public MyHelperClass initDrawing(MyHelperClass o0){ return null; }
public MyHelperClass setDrawing(Drawing o0){ return null; }
	public MyHelperClass getDrawing(){ return null; }
//	public MyHelperClass start(){ return null; }
	public MyHelperClass getDocumentBase(){ return null; }
	public MyHelperClass getParameter(String o0){ return null; }
public MyHelperClass BoxLayout;
	public MyHelperClass getAppletInfo(){ return null; }
	public MyHelperClass getContentPane(){ return null; }

//    @Override
    public void init()  throws Throwable {
        try {
            MyHelperClass UIManager = new MyHelperClass();
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Throwable e) {
        }
        try {
            MyHelperClass PopupFactory = new MyHelperClass();
            PopupFactory.setSharedInstance(new PopupFactory());
        } catch (Throwable e) {
        }
        Container c =(Container)(Object) getContentPane();
        c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
        String[] labels =(String[])(Object) getAppletInfo().split("\n");
        for (int i = 0; i < labels.length; i++) {
            c.add(new JLabel((labels[i].length() == 0) ? " " : labels[i]));
        }
        new Worker() {

//            @Override
            protected Drawing construct() throws IOException {
                Drawing result;
                System.out.println("getParameter.datafile:" + getParameter("datafile"));
                if (getParameter("data") != null) {
                    NanoXMLDOMInput domi = new NanoXMLDOMInput(new NetFactory(),(InputStream)(Object) new StringReader((String)(Object)getParameter("data")));
                    result = (Drawing)(Drawing)(Object) domi.readObject(0);
                } else if (getParameter("datafile") != null) {
                    URL url = new URL((URL)(Object)getDocumentBase(),(String)(Object) getParameter("datafile"));
                    InputStream in = url.openConnection().getInputStream();
                    try {
                        NanoXMLDOMInput domi = new NanoXMLDOMInput(new NetFactory(), in);
                        result = (Drawing)(Drawing)(Object) domi.readObject(0);
                    } finally {
                        in.close();
                    }
                } else {
                    result = null;
                }
                return result;
            }

//            @Override
            protected void done(Drawing result) {
                Container c =(Container)(Object) getContentPane();
                c.setLayout(new BorderLayout());
                c.removeAll();
                NetPanel NULL = NULL; //new NetPanel();
                NetPanel drawingPanel = NULL; //NULL; //new NetPanel();
                c.add((MyHelperClass)(Object)drawingPanel = new NetPanel());
                if (result != null) {
                    Drawing drawing = (Drawing) result;
                    setDrawing(drawing);
                }
            }

//            @Override
            protected void failed(Throwable value) {
                Container c =(Container)(Object) getContentPane();
                c.setLayout(new BorderLayout());
                c.removeAll();
                NetPanel NULL = NULL; //new NetPanel();
                NetPanel drawingPanel = NULL; //NULL; //new NetPanel();
                c.add((MyHelperClass)(Object)drawingPanel = new NetPanel());
                value.printStackTrace();
                getDrawing().add(new TextFigure(value.toString()));
                value.printStackTrace();
            }

//            @Override
            protected void finished() {
                Container c =(Container)(Object) getContentPane();
                initDrawing(getDrawing());
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
	public MyHelperClass setSharedInstance(PopupFactory o0){ return null; }
	public MyHelperClass getSystemLookAndFeelClassName(){ return null; }}

class PopupFactory {

}

class Container {

public MyHelperClass validate(){ return null; }
	public MyHelperClass removeAll(){ return null; }
	public MyHelperClass add(MyHelperClass o0){ return null; }
	public MyHelperClass setLayout(BorderLayout o0){ return null; }
	public MyHelperClass setLayout(BoxLayout o0){ return null; }}

class BoxLayout {

BoxLayout(Container o0, MyHelperClass o1){}
	BoxLayout(){}}

class JLabel {

}

class Worker {

}

class Drawing {

}

class NanoXMLDOMInput {

NanoXMLDOMInput(NetFactory o0, InputStream o1){}
	NanoXMLDOMInput(){}
	public MyHelperClass readObject(int o0){ return null; }}

class NetFactory {

}

class BorderLayout {

}

class TextFigure {

TextFigure(String o0){}
	TextFigure(){}}

class NetPanel {

}
