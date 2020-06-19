import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c111060 {
public MyHelperClass NULL;
public MyHelperClass SPACE;
	public MyHelperClass htmlDocMaxLength;
	public MyHelperClass charset;
	public MyHelperClass hs;

    public void load(URL urlin) throws Throwable, IOException {
        MyHelperClass index = new MyHelperClass();
        index = hs.getDoIndex();
        boolean loaded =(boolean)(Object) NULL; //new boolean();
        loaded = false;
        URL url =(URL)(Object) NULL; //new URL();
        url = urlin;
        int c, i;
        int htmlDocLength =(int)(Object) NULL; //new int();
        htmlDocLength = 0;
//        MyHelperClass url = new MyHelperClass();
        HtmlReader in = new HtmlReader(new InputStreamReader(url.openStream(),(String)(Object) charset));
        try {
            MyHelperClass debug = new MyHelperClass();
            if ((int)(Object)debug >= 2) System.out.print("Loading " + urlin.toString() + " ... ");
            while ((c =(int)(Object) in.read()) >= 0) {
MyHelperClass[] htmlDoc = new MyHelperClass[5];
                htmlDoc[htmlDocLength++] =(MyHelperClass)(Object) (char) (c);
//                MyHelperClass htmlDocLength = new MyHelperClass();
                if (htmlDocLength == (int)(Object)htmlDocMaxLength) {
                    MyHelperClass htmlDocMaxLength = new MyHelperClass();
                    char[] newHtmlDoc = new char[2 * (int)(Object)htmlDocMaxLength];
//                    MyHelperClass htmlDoc = new MyHelperClass();
                    System.arraycopy(htmlDoc, 0, newHtmlDoc, 0,(int)(Object) htmlDocMaxLength);
//                    MyHelperClass htmlDocMaxLength = new MyHelperClass();
                    htmlDocMaxLength =(MyHelperClass)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object) 2 * (int)(Object)htmlDocMaxLength;
//                    MyHelperClass htmlDoc = new MyHelperClass();
                    htmlDoc =(MyHelperClass[])(Object)(MyHelperClass)(Object) newHtmlDoc;
                }
            }
//            MyHelperClass debug = new MyHelperClass();
            if ((int)(Object)debug >= 2) System.out.println("done.");
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            MyHelperClass debug = new MyHelperClass();
            if ((int)(Object)debug >= 1) System.out.println("Error, reading file into memory (too big) - skipping " + urlin.toString());
//            MyHelperClass loaded = new MyHelperClass();
            loaded =(boolean)(Object)(MyHelperClass)(Object) false;
            return;
        }
        in.close();
        int fetchURLpos =(int)(Object) NULL; //new int();
        fetchURLpos = 0;
        int dumpPos =(int)(Object) NULL; //new int();
        dumpPos = 0;
        MyHelperClass dumpLastChar = new MyHelperClass();
        dumpLastChar = SPACE;
//        MyHelperClass loaded = new MyHelperClass();
        loaded =(boolean)(Object)(MyHelperClass)(Object) true;
        boolean frameset =(boolean)(Object) NULL; //new boolean();
        frameset = false;
        boolean titledone =(boolean)(Object) NULL; //new boolean();
        titledone = false;
        boolean headdone =(boolean)(Object) NULL; //new boolean();
        headdone = false;
        boolean checkhead =(boolean)(Object) NULL; //new boolean();
        checkhead = false;
        boolean checkbody =(boolean)(Object) NULL; //new boolean();
        checkbody = false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public int htmlDocLength;
	public MyHelperClass[] htmlDoc;
public MyHelperClass getDoIndex(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class HtmlReader {

HtmlReader(InputStreamReader o0){}
	HtmlReader(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(){ return null; }}
