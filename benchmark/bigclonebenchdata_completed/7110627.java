import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7110627 {
public MyHelperClass addLookup(MyHelperClass o0, Lookup o1){ return null; }

    void loadListFile(String listFileName, String majorType, String minorType, String languages, String annotationType) throws MalformedURLException, IOException {
        Lookup defaultLookup = new Lookup(listFileName, majorType, minorType, languages, annotationType);
        MyHelperClass listsURL = new MyHelperClass();
        URL lurl = new URL((URL)(Object)listsURL, listFileName);
        MyHelperClass encoding = new MyHelperClass();
        BufferedReader listReader =(BufferedReader)(Object) new BomStrippingInputStreamReader(lurl.openStream(), encoding);
        String line;
        int lines = 0;
        while (null != (line = listReader.readLine())) {
            MyHelperClass unescapedSeparator = new MyHelperClass();
            GazetteerNode node = new GazetteerNode(line, unescapedSeparator, false);
            Lookup lookup = defaultLookup;
            Map<String, String> fm =(Map<String,String>)(Object) node.getFeatureMap();
            if (fm != null && fm.size() > 0) {
                lookup = new Lookup(listFileName, majorType, minorType, languages, annotationType);
                Set<String> keyset = fm.keySet();
                if (keyset.size() <= 4) {
                    Map<String, String> newfm = null;
                    for (String key : keyset) {
                        if (key.equals("majorType")) {
                            String tmp = fm.get("majorType");
                            MyHelperClass canonicalizeStrings = new MyHelperClass();
                            if ((boolean)(Object)canonicalizeStrings) {
                                tmp.intern();
                            }
                            lookup.majorType =(MyHelperClass)(Object) tmp;
                        } else if (key.equals("minorType")) {
                            String tmp = fm.get("minorType");
                            MyHelperClass canonicalizeStrings = new MyHelperClass();
                            if ((boolean)(Object)canonicalizeStrings) {
                                tmp.intern();
                            }
                            lookup.minorType =(MyHelperClass)(Object) tmp;
                        } else if (key.equals("languages")) {
                            String tmp = fm.get("languages");
                            MyHelperClass canonicalizeStrings = new MyHelperClass();
                            if ((boolean)(Object)canonicalizeStrings) {
                                tmp.intern();
                            }
                            lookup.languages =(MyHelperClass)(Object) tmp;
                        } else if (key.equals("annotationType")) {
                            String tmp = fm.get("annotationType");
                            MyHelperClass canonicalizeStrings = new MyHelperClass();
                            if ((boolean)(Object)canonicalizeStrings) {
                                tmp.intern();
                            }
                            lookup.annotationType =(MyHelperClass)(Object) tmp;
                        } else {
                            if (newfm == null) {
                                newfm = new HashMap<String, String>();
                            }
                            String tmp = fm.get(key);
                            MyHelperClass canonicalizeStrings = new MyHelperClass();
                            if ((boolean)(Object)canonicalizeStrings) {
                                tmp.intern();
                            }
                            newfm.put(key, tmp);
                        }
                    }
                    if (newfm != null) {
                        lookup.features =(MyHelperClass)(Object) newfm;
                    }
                } else {
                    MyHelperClass canonicalizeStrings = new MyHelperClass();
                    if ((boolean)(Object)canonicalizeStrings) {
                        for (String key : fm.keySet()) {
                            String tmp = fm.get(key);
                            tmp.intern();
                            fm.put(key, tmp);
                        }
                    }
                    lookup.features =(MyHelperClass)(Object) fm;
                }
            }
            addLookup(node.getEntry(), lookup);
            lines++;
        }
        MyHelperClass logger = new MyHelperClass();
        logger.debug("Lines read: " + lines);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }}

class Lookup {
public MyHelperClass features;
	public MyHelperClass languages;
	public MyHelperClass majorType;
	public MyHelperClass minorType;
	public MyHelperClass annotationType;
Lookup(String o0, String o1, String o2, String o3, String o4){}
	Lookup(){}}

class BomStrippingInputStreamReader {

BomStrippingInputStreamReader(InputStream o0, MyHelperClass o1){}
	BomStrippingInputStreamReader(){}}

class GazetteerNode {

GazetteerNode(String o0, MyHelperClass o1, boolean o2){}
	GazetteerNode(){}
	public MyHelperClass getFeatureMap(){ return null; }
	public MyHelperClass getEntry(){ return null; }}
