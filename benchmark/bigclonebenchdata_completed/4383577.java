import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4383577 {
public MyHelperClass getString(MyHelperClass o0){ return null; }
public MyHelperClass string;
public MyHelperClass waiting(int o0){ return null; }
	public MyHelperClass setProgressBarIndeterminateVisibility(boolean o0){ return null; }

    private void getInfoFromXML()  throws Throwable {
        final ProgressDialog dialog =(ProgressDialog)(Object) ProgressDialog.show(this, "", getString(string.loading), true, true);
        setProgressBarIndeterminateVisibility(true);
        Thread t3 = new Thread() {

            public void run() {
                waiting(200);
                try {
                    MyHelperClass urlAddress = new MyHelperClass();
                    URL url = new URL((String)(Object)urlAddress);
                    MyHelperClass SAXParserFactory = new MyHelperClass();
                    SAXParserFactory spf =(SAXParserFactory)(Object) SAXParserFactory.newInstance();
                    SAXParser sp =(SAXParser)(Object) spf.newSAXParser();
                    XMLReader xr =(XMLReader)(Object) sp.getXMLReader();
                    XMLHandlerSingleArtist myXMLHandler = new XMLHandlerSingleArtist();
                    xr.setContentHandler(myXMLHandler);
                    xr.parse(new InputSource(url.openStream()));
                    MyHelperClass artist = new MyHelperClass();
                    artist = myXMLHandler.artist;
                    MyHelperClass emusicURL = new MyHelperClass();
                    emusicURL = myXMLHandler.url;
                    MyHelperClass bio = new MyHelperClass();
                    bio = myXMLHandler.bio;
                    MyHelperClass born = new MyHelperClass();
                    born = myXMLHandler.born;
                    MyHelperClass death = new MyHelperClass();
                    death = myXMLHandler.death;
                    MyHelperClass decade = new MyHelperClass();
                    decade = myXMLHandler.decade;
                    MyHelperClass rating = new MyHelperClass();
                    rating = myXMLHandler.rating;
                    MyHelperClass statuscode = new MyHelperClass();
                    statuscode = myXMLHandler.statuscode;
//                    MyHelperClass statuscode = new MyHelperClass();
                    if ((int)(Object)statuscode != 200 &&(int)(Object) statuscode != 206) {
                        throw new Exception();
                    }
                    MyHelperClass handlerSetContent = new MyHelperClass();
                    handlerSetContent.sendEmptyMessage(0);
                } catch (Exception e) {
                    MyHelperClass headerTextView = new MyHelperClass();
                    headerTextView.post(new Runnable() {

                        public void run() {
                            MyHelperClass string = new MyHelperClass();
                            headerTextView.setText(string.couldnt_get_artist_info);
                        }
                    });
                }
                dialog.dismiss();
                MyHelperClass handlerDoneLoading = new MyHelperClass();
                handlerDoneLoading.sendEmptyMessage(0);
            }
        };
        t3.start();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass couldnt_get_artist_info;
	public MyHelperClass loading;
public MyHelperClass setText(MyHelperClass o0){ return null; }
	public MyHelperClass post(){ return null; }
	public MyHelperClass sendEmptyMessage(int o0){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass post( Runnable o0){ return null; }}

class ProgressDialog {

public MyHelperClass dismiss(){ return null; }
	public static MyHelperClass show(c4383577 o0, String o1, MyHelperClass o2, boolean o3, boolean o4){ return null; }}

class SAXParserFactory {

public MyHelperClass newSAXParser(){ return null; }}

class SAXParser {

public MyHelperClass getXMLReader(){ return null; }}

class XMLReader {

public MyHelperClass setContentHandler(XMLHandlerSingleArtist o0){ return null; }
	public MyHelperClass parse(InputSource o0){ return null; }}

class XMLHandlerSingleArtist {
public MyHelperClass born;
	public MyHelperClass bio;
	public MyHelperClass death;
	public MyHelperClass artist;
	public MyHelperClass url;
	public MyHelperClass decade;
	public MyHelperClass statuscode;
	public MyHelperClass rating;
}

class InputSource {

InputSource(InputStream o0){}
	InputSource(){}}
