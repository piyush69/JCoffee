import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c16625249 {
public MyHelperClass Logger;
public MyHelperClass numRuns;
	public MyHelperClass numExceptions;
	public MyHelperClass wikiText;
	public MyHelperClass numFail;
	public MyHelperClass numPass;

//    @Override
    public void loadTest(StoryCardModel story) {
        String strUrl =(String)(Object) story.getStoryCard().getAcceptanceTestUrl();
        MyHelperClass DocumentBuilderFactory = new MyHelperClass();
        DocumentBuilderFactory factory =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
        DocumentBuilder loader;
        try {
            URL url = new URL(strUrl);
            loader =(DocumentBuilder)(Object) factory.newDocumentBuilder();
            Document document;
            document =(Document)(Object) loader.parse(url.openStream());
            this.numPass =(MyHelperClass)(Object) Integer.parseInt((String)(Object)((Element)(Element)(Object) document.getElementsByTagName("num-pass").item(0)).getFirstChild().getNodeValue());
            this.numFail =(MyHelperClass)(Object) Integer.parseInt((String)(Object)((Element)(Element)(Object) document.getElementsByTagName("num-fail").item(0)).getFirstChild().getNodeValue());
            this.numRuns =(MyHelperClass)(Object) Integer.parseInt((String)(Object)((Element)(Element)(Object) document.getElementsByTagName("num-runs").item(0)).getFirstChild().getNodeValue());
            this.numExceptions =(MyHelperClass)(Object) Integer.parseInt((String)(Object)((Element)(Element)(Object) document.getElementsByTagName("num-exceptions").item(0)).getFirstChild().getNodeValue());
            this.wikiText = ((Element)(Element)(Object) document.getElementsByTagName("wiki").item(0)).getFirstChild().getNodeValue();
        } catch (Exception e) {
            Logger.singleton().error(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass singleton(){ return null; }
	public MyHelperClass getNodeValue(){ return null; }
	public MyHelperClass error(Exception o0){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass getAcceptanceTestUrl(){ return null; }
	public MyHelperClass item(int o0){ return null; }}

class StoryCardModel {

public MyHelperClass getStoryCard(){ return null; }}

class DocumentBuilderFactory {

public MyHelperClass newDocumentBuilder(){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(InputStream o0){ return null; }}

class Document {

public MyHelperClass getElementsByTagName(String o0){ return null; }}

class Element {

public MyHelperClass getFirstChild(){ return null; }}
