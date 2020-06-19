import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c9913167 {

    private Image getIcon(Element e) {
        MyHelperClass addIconsToButtons = new MyHelperClass();
        if (!(Boolean)(Object)addIconsToButtons) {
            return null;
        } else {
            NodeList nl =(NodeList)(Object) e.getElementsByTagName("rc:iconURL");
            if ((int)(Object)nl.getLength() > 0) {
                String urlString =(String)(Object) nl.item(0).getTextContent();
                try {
                    MyHelperClass Display = new MyHelperClass();
                    Image img = new Image(Display.getCurrent(), new URL(urlString).openStream());
                    return img;
                } catch (Exception exception) {
                    MyHelperClass logger = new MyHelperClass();
                    logger.warn("Can't read " + urlString + " using default icon instead.");
                }
            }
            MyHelperClass Display = new MyHelperClass();
            return new Image(Display.getCurrent(), this.getClass().getResourceAsStream("/res/default.png"));
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getTextContent(){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass getCurrent(){ return null; }}

class Element {

public MyHelperClass getElementsByTagName(String o0){ return null; }}

class NodeList {

public MyHelperClass item(int o0){ return null; }
	public MyHelperClass getLength(){ return null; }}

class Image {

Image(MyHelperClass o0, InputStream o1){}
	Image(){}}
