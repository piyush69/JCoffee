import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c23041163 {
public MyHelperClass EXISchemaFactoryTestUtil;
public MyHelperClass JTLMTest;
	public MyHelperClass Assert;
	public MyHelperClass EXIEvent;
	public MyHelperClass resolveSystemIdAsURL(String o0){ return null; }

    public void testJTLM_publish100_blockSize() throws Throwable, Exception {
        MyHelperClass m_compilerErrors = new MyHelperClass();
        EXISchema corpus =(EXISchema)(Object) EXISchemaFactoryTestUtil.getEXISchema("/JTLM/schemas/TLMComposite.xsd", getClass(), m_compilerErrors);
//        MyHelperClass m_compilerErrors = new MyHelperClass();
        Assert.assertEquals(0,(int)(Object) m_compilerErrors.getTotalCount());
        MyHelperClass GrammarOptions = new MyHelperClass();
        GrammarCache grammarCache = new GrammarCache(corpus, GrammarOptions.STRICT_OPTIONS);
        MyHelperClass AlignmentType = new MyHelperClass();
        AlignmentType[] alignments = new AlignmentType[] {(AlignmentType)(Object) AlignmentType.preCompress,(AlignmentType)(Object) AlignmentType.compress };
        int[] blockSizes = { 1, 100, 101 };
        Transmogrifier encoder = new Transmogrifier();
        EXIDecoder decoder = new EXIDecoder(999);
        MyHelperClass HeaderOptionsOutputType = new MyHelperClass();
        encoder.setOutputOptions(HeaderOptionsOutputType.lessSchemaId);
        encoder.setEXISchema(grammarCache);
        decoder.setEXISchema(grammarCache);
        for (AlignmentType alignment : alignments) {
            for (int i = 0; i < blockSizes.length; i++) {
                Scanner scanner;
                InputSource inputSource;
                encoder.setAlignmentType(alignment);
                encoder.setBlockSize(blockSizes[i]);
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                encoder.setOutputStream(baos);
                URL url =(URL)(Object) resolveSystemIdAsURL("/JTLM/publish100.xml");
                inputSource = new InputSource(url.toString());
                inputSource.setByteStream(url.openStream());
                byte[] bts;
                int n_events, n_texts;
                encoder.encode(inputSource);
                bts = baos.toByteArray();
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
                            Assert.assertEquals((int)(Object)JTLMTest.publish100_centennials[n],(int)(Object) exiEvent.getCharacters().makeString());
                        }
                        ++n_texts;
                    }
                    exiEventList.add(exiEvent);
                }
                Assert.assertEquals(10610, n_events);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass compress;
	public MyHelperClass EVENT_CH;
	public MyHelperClass lessSchemaId;
	public MyHelperClass preCompress;
	public MyHelperClass STRICT_OPTIONS;
	public MyHelperClass[] publish100_centennials;
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

public MyHelperClass setAlignmentType(AlignmentType o0){ return null; }
	public MyHelperClass encode(InputSource o0){ return null; }
	public MyHelperClass setOutputStream(ByteArrayOutputStream o0){ return null; }
	public MyHelperClass setBlockSize(int o0){ return null; }
	public MyHelperClass setOutputOptions(MyHelperClass o0){ return null; }
	public MyHelperClass setEXISchema(GrammarCache o0){ return null; }}

class EXIDecoder {

EXIDecoder(){}
	EXIDecoder(int o0){}
	public MyHelperClass setInputStream(ByteArrayInputStream o0){ return null; }
	public MyHelperClass processHeader(){ return null; }
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
