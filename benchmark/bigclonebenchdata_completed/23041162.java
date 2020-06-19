import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c23041162 {
public MyHelperClass EXISchemaFactoryTestUtil;
public MyHelperClass JTLMTest;
	public MyHelperClass Assert;
	public MyHelperClass EXIEvent;
	public MyHelperClass resolveSystemIdAsURL(String o0){ return null; }

    public void testJTLM_publish911() throws Throwable, Exception {
        MyHelperClass m_compilerErrors = new MyHelperClass();
        EXISchema corpus =(EXISchema)(Object) EXISchemaFactoryTestUtil.getEXISchema("/JTLM/schemas/TLMComposite.xsd", getClass(), m_compilerErrors);
//        MyHelperClass m_compilerErrors = new MyHelperClass();
        Assert.assertEquals(0,(int)(Object) m_compilerErrors.getTotalCount());
        MyHelperClass GrammarOptions = new MyHelperClass();
        GrammarCache grammarCache = new GrammarCache(corpus, GrammarOptions.STRICT_OPTIONS);
        MyHelperClass AlignmentType = new MyHelperClass();
        AlignmentType alignment =(AlignmentType)(Object) AlignmentType.compress;
        Transmogrifier encoder = new Transmogrifier();
        EXIDecoder decoder = new EXIDecoder();
        Scanner scanner;
        InputSource inputSource;
        encoder.setAlignmentType(alignment);
        decoder.setAlignmentType(alignment);
        encoder.setEXISchema(grammarCache);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        encoder.setOutputStream(baos);
        URL url =(URL)(Object) resolveSystemIdAsURL("/JTLM/publish911.xml");
        inputSource = new InputSource(url.toString());
        inputSource.setByteStream(url.openStream());
        byte[] bts;
        int n_events, n_texts;
        encoder.encode(inputSource);
        bts = baos.toByteArray();
        decoder.setEXISchema(grammarCache);
        decoder.setInputStream(new ByteArrayInputStream(bts));
        scanner =(Scanner)(Object) decoder.processHeader();
        ArrayList<EXIEvent> exiEventList = new ArrayList<EXIEvent>();
        EXIEvent exiEvent;
        n_events = 0;
        n_texts = 0;
        while ((exiEvent =(EXIEvent)(Object) scanner.nextEvent()) != null) {
            ++n_events;
            if (exiEvent.getEventVariety() == EXIEvent.EVENT_CH) {
                if ((int)(Object)exiEvent.getCharacters().length() == 0) {
                    --n_events;
                    continue;
                }
                if (n_texts % 100 == 0) {
                    final int n = n_texts / 100;
                    Assert.assertEquals((int)(Object)JTLMTest.publish911_centennials[n],(int)(Object) exiEvent.getCharacters().makeString());
                }
                ++n_texts;
            }
            exiEventList.add(exiEvent);
        }
        Assert.assertEquals(96576, n_events);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass compress;
	public MyHelperClass[] publish911_centennials;
	public MyHelperClass EVENT_CH;
	public MyHelperClass STRICT_OPTIONS;
public MyHelperClass assertEquals(int o0, int o1){ return null; }
	public MyHelperClass getEXISchema(String o0, Class o1, MyHelperClass o2){ return null; }
	public MyHelperClass getTotalCount(){ return null; }
	public MyHelperClass length(){ return null; }
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

class EXIDecoder {

public MyHelperClass processHeader(){ return null; }
	public MyHelperClass setAlignmentType(AlignmentType o0){ return null; }
	public MyHelperClass setInputStream(ByteArrayInputStream o0){ return null; }
	public MyHelperClass setEXISchema(GrammarCache o0){ return null; }}

class InputSource {

InputSource(String o0){}
	InputSource(){}
	public MyHelperClass setByteStream(InputStream o0){ return null; }}

class EXIEvent {

public MyHelperClass getEventVariety(){ return null; }
	public MyHelperClass getCharacters(){ return null; }}

class Scanner {

public MyHelperClass nextEvent(){ return null; }}
