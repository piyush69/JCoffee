import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13086936 {
public MyHelperClass[] authors;
	public MyHelperClass[] listtext;
	public MyHelperClass[] titles;
	public MyHelperClass[] reviews;
	public MyHelperClass[] ratings;
public MyHelperClass dialog;
//	public MyHelperClass authors;
	public MyHelperClass nReviewsOnPage;
//	public MyHelperClass titles;
	public MyHelperClass nTotalReviews;
	public MyHelperClass previousButton;
	public MyHelperClass handlerSetList;
	public MyHelperClass statuscode;
//	public MyHelperClass ratings;
//	public MyHelperClass listtext;
	public MyHelperClass txtinfo;
//	public MyHelperClass reviews;
	public MyHelperClass nextButton;
	public MyHelperClass SAXParserFactory;
	public MyHelperClass urlAddress;
	public MyHelperClass handlerDoneLoading;
	public MyHelperClass iFirstReviewOnPage;
	public MyHelperClass waiting(int o0){ return null; }

            public void run()  throws Throwable {
                waiting(200);
                txtinfo.post(new Runnable() {

                    public void run() {
                        MyHelperClass txtinfo = new MyHelperClass();
                        txtinfo.setText("Searching");
                    }
                });
                try {
                    URL url = new URL((String)(Object)urlAddress);
                    SAXParserFactory spf =(SAXParserFactory)(Object) SAXParserFactory.newInstance();
                    SAXParser sp =(SAXParser)(Object) spf.newSAXParser();
                    XMLReader xr =(XMLReader)(Object) sp.getXMLReader();
                    XMLHandlerReviews myXMLHandler = new XMLHandlerReviews();
                    xr.setContentHandler(myXMLHandler);
                    xr.parse(new InputSource(url.openStream()));
                    if ((int)(Object)statuscode != 200 &&(int)(Object) statuscode != 206) {
                        throw new Exception();
                    }
                    nReviewsOnPage = myXMLHandler.nItems;
                    statuscode = myXMLHandler.statuscode;
                    if ((int)(Object)nReviewsOnPage > 0) {
                        authors =(MyHelperClass[])(Object) new String[(int)(Object)nReviewsOnPage];
                        reviews =(MyHelperClass[])(Object) new String[(int)(Object)nReviewsOnPage];
                        ratings =(MyHelperClass[])(Object) new String[(int)(Object)nReviewsOnPage];
                        titles =(MyHelperClass[])(Object) new String[(int)(Object)nReviewsOnPage];
                        listtext =(MyHelperClass[])(Object) new String[(int)(Object)nReviewsOnPage];
                        for (int i = 0; i < (int)(Object)nReviewsOnPage; i++) {
                            reviews[i] = myXMLHandler.reviews[i];
                            authors[i] = myXMLHandler.authors[i];
                            titles[i] = myXMLHandler.titles[i];
                            ratings[i] = myXMLHandler.ratings[i];
                            if (authors[i] == null ||(String)(Object) authors[i] == "") {
                                authors[i] =(MyHelperClass)(Object) "Anonymous";
                            }
                            if (ratings[i] == null ||(String)(Object) ratings[i] == "") {
                                listtext[i] = titles[i] + " - " + reviews[i] + " - "(MyHelperClass)(Object) + authors[i];
                            } else {
                                listtext[i] = "Score: " + ratings[i] + " - " + titles[i] + " - " + reviews[i] + " - "(MyHelperClass)(Object) + authors[i];
                            }
                        }
                        nTotalReviews = myXMLHandler.nTotalItems;
                        final int fnmin =(int)(Object) iFirstReviewOnPage;
                        final int fnmax =(int)(Object) iFirstReviewOnPage + (int)(Object)nReviewsOnPage - 1;
                        final int fntotalitems =(int)(Object) nTotalReviews;
                        if ((int)(Object)nTotalReviews > fnmax) {
                            nextButton.post(new Runnable() {

                                public void run() {
                                    MyHelperClass nextButton = new MyHelperClass();
                                    nextButton.setVisibility(0);
                                }
                            });
                        } else {
                            nextButton.post(new Runnable() {

                                public void run() {
                                    MyHelperClass nextButton = new MyHelperClass();
                                    nextButton.setVisibility(8);
                                }
                            });
                        }
                        if ((int)(Object)iFirstReviewOnPage > 1) {
                            previousButton.post(new Runnable() {

                                public void run() {
                                    MyHelperClass previousButton = new MyHelperClass();
                                    previousButton.setVisibility(0);
                                }
                            });
                        } else if ((int)(Object)nTotalReviews > fnmax) {
                            previousButton.post(new Runnable() {

                                public void run() {
                                    MyHelperClass previousButton = new MyHelperClass();
                                    previousButton.setVisibility(8);
                                }
                            });
                        } else {
                            previousButton.post(new Runnable() {

                                public void run() {
                                    MyHelperClass previousButton = new MyHelperClass();
                                    previousButton.setVisibility(4);
                                }
                            });
                        }
                        txtinfo.post(new Runnable() {

                            public void run() {
                                MyHelperClass title = new MyHelperClass();
                                if (title != null &&(String)(Object) title != "") {
//                                    MyHelperClass title = new MyHelperClass();
                                    MyHelperClass string = new MyHelperClass();
                                    txtinfo.setText(title + "\n" + getString(string.showing) + " " + fnmin + " " + getString(string.through) + " " + fnmax + " " + getString(string.of) + " " + fntotalitems);
                                } else {
                                    MyHelperClass string = new MyHelperClass();
                                    txtinfo.setText(getString(string.showing) + " " + fnmin + " " + getString(string.through) + " " + fnmax + " " + getString(string.of) + " " + fntotalitems);
                                }
                            }
                        });
                        handlerSetList.sendEmptyMessage(0);
                    } else {
                        txtinfo.post(new Runnable() {

                            public void run() {
                                MyHelperClass title = new MyHelperClass();
                                MyHelperClass string = new MyHelperClass();
                                txtinfo.setText(title + getString(string.no_reviews_for_this_album));
                            }
                        });
                    }
                } catch (Exception e) {
                    final Exception ef = e;
                    txtinfo.post(new Runnable() {

                        public void run() {
                            MyHelperClass string = new MyHelperClass();
                            txtinfo.setText(string.search_failed);
                        }
                    });
                }
                dialog.dismiss();
                handlerDoneLoading.sendEmptyMessage(0);
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass of;
	public MyHelperClass through;
	public MyHelperClass search_failed;
	public MyHelperClass showing;
public MyHelperClass setVisibility(int o0){ return null; }
	public MyHelperClass post(){ return null; }
	public MyHelperClass dismiss(){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass sendEmptyMessage(int o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass post(<anonymous Runnable> o0){ return null; }}

class SAXParserFactory {

public MyHelperClass newSAXParser(){ return null; }}

class SAXParser {

public MyHelperClass getXMLReader(){ return null; }}

class XMLReader {

public MyHelperClass parse(InputSource o0){ return null; }
	public MyHelperClass setContentHandler(XMLHandlerReviews o0){ return null; }}

class XMLHandlerReviews {
public MyHelperClass[] authors;
	public MyHelperClass nTotalItems;
	public MyHelperClass statuscode;
	public MyHelperClass[] titles;
	public MyHelperClass[] reviews;
	public MyHelperClass nItems;
	public MyHelperClass[] ratings;
}

class InputSource {

InputSource(InputStream o0){}
	InputSource(){}}
