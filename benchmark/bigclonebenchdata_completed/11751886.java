import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11751886 {
public MyHelperClass numberOfTracks;
	public MyHelperClass nameTextView;
	public MyHelperClass handlerDoneLoading;
	public MyHelperClass genreId;
	public MyHelperClass handlerSetContent;
	public MyHelperClass genre;
	public MyHelperClass rating;
	public MyHelperClass trackNames;
	public MyHelperClass artist;
	public MyHelperClass label;
	public MyHelperClass date;
	public MyHelperClass labelId;
	public MyHelperClass imageURL;
	public MyHelperClass urlAddress;
	public MyHelperClass dialog;
	public MyHelperClass statuscode;
	public MyHelperClass SAXParserFactory;
	public MyHelperClass artistId;
	public MyHelperClass waiting(int o0){ return null; }
	public MyHelperClass updateImage(){ return null; }

            public void run()  throws Throwable {
                waiting(200);
                try {
                    URL url = new URL((String)(Object)urlAddress);
                    SAXParserFactory spf =(SAXParserFactory)(Object) SAXParserFactory.newInstance();
                    SAXParser sp =(SAXParser)(Object) spf.newSAXParser();
                    XMLReader xr =(XMLReader)(Object) sp.getXMLReader();
                    XMLHandlerSingleAlbum myXMLHandler = new XMLHandlerSingleAlbum();
                    xr.setContentHandler(myXMLHandler);
                    xr.parse(new InputSource(url.openStream()));
                    statuscode = myXMLHandler.statuscode;
                    if ((int)(Object)statuscode != 200 &&(int)(Object) statuscode != 206) {
                        throw new Exception();
                    }
                    genre = myXMLHandler.genre;
                    genreId = myXMLHandler.genreId;
                    labelId = myXMLHandler.labelId;
                    label = myXMLHandler.label;
                    date = myXMLHandler.releaseDate;
                    rating = myXMLHandler.rating;
                    imageURL = myXMLHandler.imageURL;
                    artist = myXMLHandler.artist;
                    artistId = myXMLHandler.artistId;
                    numberOfTracks = myXMLHandler.nItems;
                    trackNames = myXMLHandler.tracks;
                    handlerSetContent.sendEmptyMessage(0);
                    dialog.dismiss();
                    updateImage();
                } catch (Exception e) {
                    final Exception ef = e;
                    nameTextView.post(new Runnable() {

                        public void run() {
                            MyHelperClass string = new MyHelperClass();
                            nameTextView.setText(string.couldnt_get_album_info);
                        }
                    });
                }
                if ((boolean)(Object)dialog.isShowing()) {
                    dialog.dismiss();
                }
                handlerDoneLoading.sendEmptyMessage(0);
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass couldnt_get_album_info;
public MyHelperClass dismiss(){ return null; }
	public MyHelperClass setText(MyHelperClass o0){ return null; }
	public MyHelperClass post(){ return null; }
	public MyHelperClass sendEmptyMessage(int o0){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass post( Runnable o0){ return null; }
	public MyHelperClass isShowing(){ return null; }}

class SAXParserFactory {

public MyHelperClass newSAXParser(){ return null; }}

class SAXParser {

public MyHelperClass getXMLReader(){ return null; }}

class XMLReader {

public MyHelperClass parse(InputSource o0){ return null; }
	public MyHelperClass setContentHandler(XMLHandlerSingleAlbum o0){ return null; }}

class XMLHandlerSingleAlbum {
public MyHelperClass label;
	public MyHelperClass labelId;
	public MyHelperClass imageURL;
	public MyHelperClass tracks;
	public MyHelperClass artist;
	public MyHelperClass genreId;
	public MyHelperClass nItems;
	public MyHelperClass releaseDate;
	public MyHelperClass statuscode;
	public MyHelperClass genre;
	public MyHelperClass rating;
	public MyHelperClass artistId;
}

class InputSource {

InputSource(InputStream o0){}
	InputSource(){}}
