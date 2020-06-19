import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c13068082 {
public MyHelperClass extractJobOfferHtmlList(){ return null; }
public MyHelperClass content;
	public MyHelperClass link;
	public MyHelperClass jobOfferHtmlList;

    public void JobOfferPage(JobPageLink link) {
        this.link =(MyHelperClass)(Object) link;
        try {
            URL url = new URL((String)(Object)link.getUrl());
            URLConnection urlConn = url.openConnection();
            urlConn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.5; Windows NT 4.0)");
            urlConn.setRequestProperty("Accept-Language", "en-us");
            this.content =(MyHelperClass)(Object) (String) url.getContent();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.jobOfferHtmlList = extractJobOfferHtmlList();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class JobPageLink {

public MyHelperClass getUrl(){ return null; }}
