import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c23041161 {
public MyHelperClass EXISchemaFactoryTestUtil;
public MyHelperClass Assert;
	public MyHelperClass EXIEvent;
	public MyHelperClass resolveSystemIdAsURL(String o0){ return null; }

    public void testSequence_01() throws Throwable, Exception {
        MyHelperClass m_compilerErrors = new MyHelperClass();
        EXISchema corpus =(EXISchema)(Object) EXISchemaFactoryTestUtil.getEXISchema("/interop/schemaInformedGrammar/acceptance.xsd", getClass(), m_compilerErrors);
//        MyHelperClass m_compilerErrors = new MyHelperClass();
        Assert.assertEquals(0,(int)(Object) m_compilerErrors.getTotalCount());
        MyHelperClass GrammarOptions = new MyHelperClass();
        GrammarCache grammarCache = new GrammarCache(corpus, GrammarOptions.STRICT_OPTIONS);
        MyHelperClass AlignmentType = new MyHelperClass();
        AlignmentType[] alignments = new AlignmentType[] {(AlignmentType)(Object) AlignmentType.preCompress,(AlignmentType)(Object) AlignmentType.compress };
        MyHelperClass Deflater = new MyHelperClass();
        int[] strategies = {(int)(Object) Deflater.DEFAULT_STRATEGY,(int)(Object) Deflater.FILTERED,(int)(Object) Deflater.HUFFMAN_ONLY };
        for (AlignmentType alignment : alignments) {
            Transmogrifier encoder = new Transmogrifier();
            EXIDecoder decoder = new EXIDecoder(31);
            Scanner scanner;
            InputSource inputSource;
            MyHelperClass HeaderOptionsOutputType = new MyHelperClass();
            encoder.setOutputOptions(HeaderOptionsOutputType.lessSchemaId);
            encoder.setAlignmentType(alignment);
            encoder.setDeflateLevel(java.util.zip.Deflater.BEST_COMPRESSION);
//            MyHelperClass AlignmentType = new MyHelperClass();
            final boolean isCompress = alignment == (AlignmentType)(Object)AlignmentType.compress;
            byte[][] resultBytes = isCompress ? new byte[3][] : null;
            for (int i = 0; i < strategies.length; i++) {
                encoder.setDeflateStrategy(strategies[i]);
                encoder.setEXISchema(grammarCache);
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                encoder.setOutputStream(baos);
                URL url =(URL)(Object) resolveSystemIdAsURL("/interop/schemaInformedGrammar/declaredProductions/sequence-01.xml");
                inputSource = new InputSource(url.toString());
                inputSource.setByteStream(url.openStream());
                byte[] bts;
                int n_events;
                encoder.encode(inputSource);
                bts = baos.toByteArray();
                if (isCompress) resultBytes[i] = bts;
                decoder.setEXISchema(grammarCache);
                decoder.setInputStream(new ByteArrayInputStream(bts));
                scanner =(Scanner)(Object) decoder.processHeader();
                Assert.assertEquals((int)(Object)alignment,(int)(Object) scanner.getHeaderOptions().getAlignmentType());
                ArrayList<EXIEvent> exiEventList = new ArrayList<EXIEvent>();
                EXIEvent exiEvent;
                n_events = 0;
                while ((exiEvent =(EXIEvent)(Object) scanner.nextEvent()) != null) {
                    ++n_events;
                    exiEventList.add(exiEvent);
                }
                Assert.assertEquals(19, n_events);
                EventType eventType;
                EventTypeList eventTypeList;
                int pos = 0;
                exiEvent = exiEventList.get(pos++);
                Assert.assertEquals((int)(Object)EXIEvent.EVENT_SD,(int)(Object) exiEvent.getEventVariety());
                eventType =(EventType)(Object) exiEvent.getEventType();
                Assert.assertSame(exiEvent, eventType);
                Assert.assertEquals(0,(int)(Object) eventType.getIndex());
                eventTypeList =(EventTypeList)(Object) eventType.getEventTypeList();
                Assert.assertEquals(1,(int)(Object) eventTypeList.getLength());
                exiEvent = exiEventList.get(pos++);
                Assert.assertEquals((int)(Object)EXIEvent.EVENT_SE,(int)(Object) exiEvent.getEventVariety());
                Assert.assertEquals((int)(Object)"A",(int)(Object) exiEvent.getName());
                Assert.assertEquals((int)(Object)"urn:foo",(int)(Object) exiEvent.getURI());
                exiEvent = exiEventList.get(pos++);
                Assert.assertEquals((int)(Object)EXIEvent.EVENT_SE,(int)(Object) exiEvent.getEventVariety());
                Assert.assertEquals((int)(Object)"AB",(int)(Object) exiEvent.getName());
                Assert.assertEquals((int)(Object)"urn:foo",(int)(Object) exiEvent.getURI());
                exiEvent = exiEventList.get(pos++);
                Assert.assertEquals((int)(Object)EXIEvent.EVENT_CH,(int)(Object) exiEvent.getEventVariety());
                Assert.assertEquals((int)(Object)"",(int)(Object) exiEvent.getCharacters().makeString());
                exiEvent = exiEventList.get(pos++);
                Assert.assertEquals((int)(Object)EXIEvent.EVENT_EE,(int)(Object) exiEvent.getEventVariety());
                exiEvent = exiEventList.get(pos++);
                Assert.assertEquals((int)(Object)EXIEvent.EVENT_SE,(int)(Object) exiEvent.getEventVariety());
                Assert.assertEquals((int)(Object)"AC",(int)(Object) exiEvent.getName());
                Assert.assertEquals((int)(Object)"urn:foo",(int)(Object) exiEvent.getURI());
                exiEvent = exiEventList.get(pos++);
                Assert.assertEquals((int)(Object)EXIEvent.EVENT_CH,(int)(Object) exiEvent.getEventVariety());
                Assert.assertEquals((int)(Object)"",(int)(Object) exiEvent.getCharacters().makeString());
                exiEvent = exiEventList.get(pos++);
                Assert.assertEquals((int)(Object)EXIEvent.EVENT_EE,(int)(Object) exiEvent.getEventVariety());
                exiEvent = exiEventList.get(pos++);
                Assert.assertEquals((int)(Object)EXIEvent.EVENT_SE,(int)(Object) exiEvent.getEventVariety());
                Assert.assertEquals((int)(Object)"AC",(int)(Object) exiEvent.getName());
                Assert.assertEquals((int)(Object)"urn:foo",(int)(Object) exiEvent.getURI());
                exiEvent = exiEventList.get(pos++);
                Assert.assertEquals((int)(Object)EXIEvent.EVENT_CH,(int)(Object) exiEvent.getEventVariety());
                Assert.assertEquals((int)(Object)"",(int)(Object) exiEvent.getCharacters().makeString());
                exiEvent = exiEventList.get(pos++);
                Assert.assertEquals((int)(Object)EXIEvent.EVENT_EE,(int)(Object) exiEvent.getEventVariety());
                exiEvent = exiEventList.get(pos++);
                Assert.assertEquals((int)(Object)EXIEvent.EVENT_SE,(int)(Object) exiEvent.getEventVariety());
                Assert.assertEquals((int)(Object)"AD",(int)(Object) exiEvent.getName());
                Assert.assertEquals((int)(Object)"urn:foo",(int)(Object) exiEvent.getURI());
                exiEvent = exiEventList.get(pos++);
                Assert.assertEquals((int)(Object)EXIEvent.EVENT_CH,(int)(Object) exiEvent.getEventVariety());
                Assert.assertEquals((int)(Object)"",(int)(Object) exiEvent.getCharacters().makeString());
                exiEvent = exiEventList.get(pos++);
                Assert.assertEquals((int)(Object)EXIEvent.EVENT_EE,(int)(Object) exiEvent.getEventVariety());
                exiEvent = exiEventList.get(pos++);
                Assert.assertEquals((int)(Object)EXIEvent.EVENT_SE,(int)(Object) exiEvent.getEventVariety());
                Assert.assertEquals((int)(Object)"AE",(int)(Object) exiEvent.getName());
                Assert.assertEquals((int)(Object)"urn:foo",(int)(Object) exiEvent.getURI());
                exiEvent = exiEventList.get(pos++);
                Assert.assertEquals((int)(Object)EXIEvent.EVENT_CH,(int)(Object) exiEvent.getEventVariety());
                Assert.assertEquals((int)(Object)"",(int)(Object) exiEvent.getCharacters().makeString());
                exiEvent = exiEventList.get(pos++);
                Assert.assertEquals((int)(Object)EXIEvent.EVENT_EE,(int)(Object) exiEvent.getEventVariety());
                exiEvent = exiEventList.get(pos++);
                Assert.assertEquals((int)(Object)EXIEvent.EVENT_EE,(int)(Object) exiEvent.getEventVariety());
                exiEvent = exiEventList.get(pos++);
                Assert.assertEquals((int)(Object)EXIEvent.EVENT_ED,(int)(Object) exiEvent.getEventVariety());
            }
            if (isCompress) {
                Assert.assertTrue(resultBytes[0].length < resultBytes[1].length);
                Assert.assertTrue(resultBytes[1].length < resultBytes[2].length);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass EVENT_ED;
	public MyHelperClass DEFAULT_STRATEGY;
	public MyHelperClass lessSchemaId;
	public MyHelperClass HUFFMAN_ONLY;
	public MyHelperClass EVENT_SE;
	public MyHelperClass EVENT_CH;
	public MyHelperClass FILTERED;
	public MyHelperClass compress;
	public MyHelperClass EVENT_SD;
	public MyHelperClass EVENT_EE;
	public MyHelperClass preCompress;
	public MyHelperClass STRICT_OPTIONS;
public MyHelperClass assertEquals(int o0, int o1){ return null; }
	public MyHelperClass getTotalCount(){ return null; }
	public MyHelperClass getEXISchema(String o0, Class o1, MyHelperClass o2){ return null; }
	public MyHelperClass makeString(){ return null; }
	public MyHelperClass assertSame(EXIEvent o0, EventType o1){ return null; }
	public MyHelperClass assertTrue(boolean o0){ return null; }
	public MyHelperClass getAlignmentType(){ return null; }}

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
	public MyHelperClass setDeflateLevel(int o0){ return null; }
	public MyHelperClass setDeflateStrategy(int o0){ return null; }
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

class Scanner {

public MyHelperClass nextEvent(){ return null; }
	public MyHelperClass getHeaderOptions(){ return null; }}

class EXIEvent {

public MyHelperClass getEventType(){ return null; }
	public MyHelperClass getEventVariety(){ return null; }
	public MyHelperClass getURI(){ return null; }
	public MyHelperClass getCharacters(){ return null; }
	public MyHelperClass getName(){ return null; }}

class EventType {

public MyHelperClass getIndex(){ return null; }
	public MyHelperClass getEventTypeList(){ return null; }}

class EventTypeList {

public MyHelperClass getLength(){ return null; }}
