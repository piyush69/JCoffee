import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19006212 {
public MyHelperClass Object;
	public MyHelperClass NULL;
public MyHelperClass player;
public MyHelperClass start_y;
	public MyHelperClass start_x;
	public MyHelperClass game;
	public MyHelperClass fieldtype;

    public void Load(String fname) throws Throwable, Exception {
        File f = null;
        try {
            if ("".equals(fname) || fname == null) throw new Exception();
            System.out.println("Loading mapfile " + fname);
        } catch (Exception e) {
            throw new Exception("File not found");
        }
        MyHelperClass aType = new MyHelperClass();
        aType = null;
        MyHelperClass fieldtype = new MyHelperClass();
        fieldtype.clear();
        MyHelperClass creatures = new MyHelperClass();
        creatures.clear();
        String aElement =(String)(Object) NULL; //new String();
        aElement = new String("");
        MyHelperClass content = new MyHelperClass();
        content = null;
        int Ax =(int)(Object) NULL; //new int();
        Ax = -1;
        int Ay =(int)(Object) NULL; //new int();
        Ay = -1;
        int aTemplate =(int)(Object) NULL; //new int();
        aTemplate = -1;
        MyHelperClass SAXParserFactory = new MyHelperClass();
        SAXParserFactory factory =(SAXParserFactory)(Object) SAXParserFactory.newInstance();
        int data_read =(int)(Object) NULL; //new int();
        data_read = 0;
        URL url =(URL)(Object) this.game.mainClass.getClassLoader().getResource(fname);
        if (url == null) {
            throw new Exception("Can't load map from : " + fname);
        }
        try {
            SAXParser parser =(SAXParser)(Object) factory.newSAXParser();
            parser.parse(url.openStream(), this);
        } catch (Exception e) {
            System.out.println("Can't open XML : " + e);
        }
        for (int i = 0; i < (int)(Object)fieldtype.size(); i++) {
            System.out.println((MapField)(MapField)(Object) fieldtype.get(i));
        }
        player.setpos(start_x, start_y);
        System.out.println("Player starting position set");
        start_x =(MyHelperClass)(Object)(int)(Object)(MyHelperClass)(Object)(int)(Object)(MyHelperClass)(Object)(int)(Object)(MyHelperClass)(Object)(int)(Object)(MyHelperClass)(Object) -1;
        start_y =(MyHelperClass)(Object)(int)(Object)(MyHelperClass)(Object)(int)(Object)(MyHelperClass)(Object)(int)(Object)(MyHelperClass)(Object)(int)(Object)(MyHelperClass)(Object) -1;
        System.out.println("Map \"" + fname + "\" loaded");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass mainClass;
public MyHelperClass size(){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass setpos(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getResource(String o0){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass getClassLoader(){ return null; }
	public MyHelperClass clear(){ return null; }}

class SAXParserFactory {

public MyHelperClass newSAXParser(){ return null; }}

class SAXParser {

public MyHelperClass parse(InputStream o0, c19006212 o1){ return null; }}

class MapField {

}
