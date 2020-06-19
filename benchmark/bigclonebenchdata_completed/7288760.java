import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7288760 {
public MyHelperClass EXISchemaFactoryTestUtil;
public MyHelperClass Assert;
	public MyHelperClass EXIEvent;
	public MyHelperClass resolveSystemIdAsURL(String o0){ return null; }

    public void testDecode1000BinaryStore() throws Throwable, Exception {
        MyHelperClass m_compilerErrors = new MyHelperClass();
        EXISchema corpus =(EXISchema)(Object) EXISchemaFactoryTestUtil.getEXISchema("/DataStore/DataStore.xsd", getClass(), m_compilerErrors);
//        MyHelperClass m_compilerErrors = new MyHelperClass();
        Assert.assertEquals(0,(int)(Object) m_compilerErrors.getTotalCount());
        MyHelperClass GrammarOptions = new MyHelperClass();
        GrammarCache grammarCache = new GrammarCache(corpus, GrammarOptions.STRICT_OPTIONS);
        String[] base64Values100 = { "R0lGODdhWALCov////T09M7Ozqampn19fVZWVi0tLQUFBSxYAsJAA/8Iutz+MMpJq7046827/2Ao\n", "/9j/4BBKRklGAQEBASwBLP/hGlZFeGlmTU0qF5ZOSUtPTiBDT1JQT1JBVElPTk5J", "R0lGODlhHh73KSkpOTk5QkJCSkpKUlJSWlpaY2Nja2trc3Nze3t7hISEjIyMlJSUnJycpaWlra2t\n" + "tbW1vb29xsbGzs7O1tbW3t7e5+fn7+/v//////////8=", "/9j/4BBKRklGAQEBAf/bQwYEBQYFBAYGBQYHBwYIChAKCgkJChQODwwQFxQYGBc=", "R0lGODlhHh73M2aZzP8zMzNmM5kzzDP/M2YzZmZmmWbM", "/9j/4BBKRklGAQEBAf/bQwYEBQYFBAYGBQYHBwYIChAKCgkJChQODwwQFxQYGBcUFhYaHSUfGhsj\n" + "HBYWICwgIyYnKSopGR8tMC0oMCUoKSj/20M=", "R0lGODdhWAK+ov////j4+NTU1JOTk0tLSx8fHwkJCSxYAr5AA/8IMkzjrEEmahy23SpC", "R0lGODdh4QIpAncJIf4aU29mdHdhcmU6IE1pY3Jvc29mdCBPZmZpY2Us4QIpAof//////8z//5n/\n", "R0lGODdhWAK+ov////v7++fn58DAwI6Ojl5eXjExMQMDAyxYAr5AA/8Iutz+MMpJq7046827/2Ao\n" + "jmRpnmiqPsKxvg==", "R0lGODdh4QIpAncJIf4aU29mdHdhcmU6IE1pY3Jvc29mdCBPZmZpY2Us4QIpAob//////8z//5n/\nzP//zMw=" };
        MyHelperClass AlignmentType = new MyHelperClass();
        AlignmentType alignment =(AlignmentType)(Object) AlignmentType.bitPacked;
        Transmogrifier encoder = new Transmogrifier();
        encoder.setEXISchema(grammarCache);
        encoder.setAlignmentType(alignment);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        encoder.setOutputStream(baos);
        URL url =(URL)(Object) resolveSystemIdAsURL("/DataStore/instance/1000BinaryStore.xml");
        encoder.encode(new InputSource(url.openStream()));
        byte[] bts = baos.toByteArray();
        Scanner scanner;
        int n_texts;
        EXIDecoder decoder = new EXIDecoder(999);
        decoder.setEXISchema(grammarCache);
        decoder.setAlignmentType(alignment);
        decoder.setInputStream(new ByteArrayInputStream(bts));
        scanner =(Scanner)(Object) decoder.processHeader();
        EXIEvent exiEvent;
        n_texts = 0;
        while ((exiEvent =(EXIEvent)(Object) scanner.nextEvent()) != null) {
            if (exiEvent.getEventVariety() == EXIEvent.EVENT_CH) {
                if (++n_texts % 100 == 0) {
                    String expected = base64Values100[(n_texts / 100) - 1];
                    String val =(String)(Object) exiEvent.getCharacters().makeString();
                    Assert.assertEquals(expected, val);
                }
            }
        }
        Assert.assertEquals(1000, n_texts);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass bitPacked;
	public MyHelperClass EVENT_CH;
	public MyHelperClass STRICT_OPTIONS;
public MyHelperClass assertEquals(int o0, int o1){ return null; }
	public MyHelperClass getEXISchema(String o0, Class o1, MyHelperClass o2){ return null; }
	public MyHelperClass getTotalCount(){ return null; }
	public MyHelperClass assertEquals(String o0, String o1){ return null; }
	public MyHelperClass makeString(){ return null; }}

class EXISchema {

}

class GrammarCache {

GrammarCache(EXISchema o0, MyHelperClass o1){}
	GrammarCache(){}}

class AlignmentType {

}

class Transmogrifier {

public MyHelperClass encode(InputSource o0){ return null; }
	public MyHelperClass setAlignmentType(AlignmentType o0){ return null; }
	public MyHelperClass setOutputStream(ByteArrayOutputStream o0){ return null; }
	public MyHelperClass setEXISchema(GrammarCache o0){ return null; }}

class InputSource {

InputSource(InputStream o0){}
	InputSource(){}}

class EXIDecoder {

EXIDecoder(){}
	EXIDecoder(int o0){}
	public MyHelperClass setAlignmentType(AlignmentType o0){ return null; }
	public MyHelperClass setInputStream(ByteArrayInputStream o0){ return null; }
	public MyHelperClass processHeader(){ return null; }
	public MyHelperClass setEXISchema(GrammarCache o0){ return null; }}

class EXIEvent {

public MyHelperClass getEventVariety(){ return null; }
	public MyHelperClass getCharacters(){ return null; }}

class Scanner {

public MyHelperClass nextEvent(){ return null; }}
