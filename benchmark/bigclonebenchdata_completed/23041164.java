import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c23041164 {
public MyHelperClass EXISchemaFactoryTestUtil;
public MyHelperClass Assert;
	public MyHelperClass EXIEvent;
	public MyHelperClass EXISchemaConst;
	public MyHelperClass resolveSystemIdAsURL(String o0){ return null; }

    public void testEmptyBlock_01() throws Throwable, Exception {
        MyHelperClass m_compilerErrors = new MyHelperClass();
        EXISchema corpus =(EXISchema)(Object) EXISchemaFactoryTestUtil.getEXISchema("/compression/emptyBlock_01.xsd", getClass(), m_compilerErrors);
//        MyHelperClass m_compilerErrors = new MyHelperClass();
        Assert.assertEquals(0,(int)(Object) m_compilerErrors.getTotalCount());
        MyHelperClass GrammarOptions = new MyHelperClass();
        GrammarCache grammarCache = new GrammarCache(corpus, GrammarOptions.STRICT_OPTIONS);
        Transmogrifier encoder = new Transmogrifier();
        EXIDecoder decoder = new EXIDecoder(31);
        Scanner scanner;
        InputSource inputSource;
        MyHelperClass HeaderOptionsOutputType = new MyHelperClass();
        encoder.setOutputOptions(HeaderOptionsOutputType.lessSchemaId);
        MyHelperClass AlignmentType = new MyHelperClass();
        encoder.setAlignmentType(AlignmentType.compress);
        encoder.setBlockSize(1);
        encoder.setEXISchema(grammarCache);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        encoder.setOutputStream(baos);
        URL url =(URL)(Object) resolveSystemIdAsURL("/compression/emptyBlock_01.xml");
        inputSource = new InputSource(url.toString());
        inputSource.setByteStream(url.openStream());
        byte[] bts;
        int n_events;
        encoder.encode(inputSource);
        bts = baos.toByteArray();
        decoder.setEXISchema(grammarCache);
        decoder.setInputStream(new ByteArrayInputStream(bts));
        scanner =(Scanner)(Object) decoder.processHeader();
        ArrayList<EXIEvent> exiEventList = new ArrayList<EXIEvent>();
        EXIEvent exiEvent;
        n_events = 0;
        while ((exiEvent =(EXIEvent)(Object) scanner.nextEvent()) != null) {
            ++n_events;
            exiEventList.add(exiEvent);
        }
        Assert.assertEquals(11, n_events);
        Assert.assertEquals(1,(int)(Object) ((ChannellingScanner)(ChannellingScanner)(Object) scanner).getBlockCount());
        EventType eventType;
        EventTypeList eventTypeList;
        int pos = 0;
        exiEvent = exiEventList.get(pos++);
        Assert.assertEquals((int)(Object)EXIEvent.EVENT_SD,(int)(Object) exiEvent.getEventVariety());
        eventType =(EventType)(Object) exiEvent.getEventType();
        Assert.assertSame(exiEvent, eventType);
        Assert.assertEquals(0,(int)(Object) eventType.getIndex());
        eventTypeList =(EventTypeList)(Object) eventType.getEventTypeList();
        Assert.assertNull(eventTypeList.getEE());
        exiEvent = exiEventList.get(pos++);
        Assert.assertEquals((int)(Object)EXIEvent.EVENT_SE,(int)(Object) exiEvent.getEventVariety());
        Assert.assertEquals((int)(Object)"root",(int)(Object) exiEvent.getName());
        Assert.assertEquals((int)(Object)"",(int)(Object) eventType.getURI());
        exiEvent = exiEventList.get(pos++);
        Assert.assertEquals((int)(Object)EXIEvent.EVENT_SE,(int)(Object) exiEvent.getEventVariety());
        Assert.assertEquals((int)(Object)"parent",(int)(Object) exiEvent.getName());
        Assert.assertEquals((int)(Object)"",(int)(Object) eventType.getURI());
        exiEvent = exiEventList.get(pos++);
        Assert.assertEquals((int)(Object)EXIEvent.EVENT_SE,(int)(Object) exiEvent.getEventVariety());
        Assert.assertEquals((int)(Object)"child",(int)(Object) exiEvent.getName());
        Assert.assertEquals((int)(Object)"",(int)(Object) eventType.getURI());
        exiEvent = exiEventList.get(pos++);
        Assert.assertEquals((int)(Object)EXIEvent.EVENT_CH,(int)(Object) exiEvent.getEventVariety());
        Assert.assertEquals((int)(Object)"42",(int)(Object) exiEvent.getCharacters().makeString());
        int tp =(int)(Object) ((EventTypeSchema)(EventTypeSchema)(Object) exiEvent.getEventType()).getSchemaSubstance();
        Assert.assertEquals((int)(Object)EXISchemaConst.UNSIGNED_BYTE_TYPE,(int)(Object) corpus.getSerialOfType(tp));
        exiEvent = exiEventList.get(pos++);
        Assert.assertEquals((int)(Object)EXIEvent.EVENT_EE,(int)(Object) exiEvent.getEventVariety());
        exiEvent = exiEventList.get(pos++);
        Assert.assertEquals((int)(Object)EXIEvent.EVENT_EE,(int)(Object) exiEvent.getEventVariety());
        exiEvent = exiEventList.get(pos++);
        Assert.assertEquals((int)(Object)EXIEvent.EVENT_SE,(int)(Object) exiEvent.getEventVariety());
        Assert.assertEquals((int)(Object)"adjunct",(int)(Object) exiEvent.getName());
        Assert.assertEquals((int)(Object)"",(int)(Object) exiEvent.getURI());
        exiEvent = exiEventList.get(pos++);
        Assert.assertEquals((int)(Object)EXIEvent.EVENT_EE,(int)(Object) exiEvent.getEventVariety());
        exiEvent = exiEventList.get(pos++);
        Assert.assertEquals((int)(Object)EXIEvent.EVENT_EE,(int)(Object) exiEvent.getEventVariety());
        exiEvent = exiEventList.get(pos++);
        Assert.assertEquals((int)(Object)EXIEvent.EVENT_ED,(int)(Object) exiEvent.getEventVariety());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass EVENT_SE;
	public MyHelperClass compress;
	public MyHelperClass UNSIGNED_BYTE_TYPE;
	public MyHelperClass EVENT_ED;
	public MyHelperClass EVENT_SD;
	public MyHelperClass lessSchemaId;
	public MyHelperClass EVENT_EE;
	public MyHelperClass EVENT_CH;
	public MyHelperClass STRICT_OPTIONS;
public MyHelperClass assertEquals(int o0, int o1){ return null; }
	public MyHelperClass assertSame(EXIEvent o0, EventType o1){ return null; }
	public MyHelperClass getEXISchema(String o0, Class o1, MyHelperClass o2){ return null; }
	public MyHelperClass getTotalCount(){ return null; }
	public MyHelperClass assertNull(MyHelperClass o0){ return null; }
	public MyHelperClass makeString(){ return null; }}

class EXISchema {

public MyHelperClass getSerialOfType(int o0){ return null; }}

class GrammarCache {

GrammarCache(EXISchema o0, MyHelperClass o1){}
	GrammarCache(){}}

class Transmogrifier {

public MyHelperClass encode(InputSource o0){ return null; }
	public MyHelperClass setOutputStream(ByteArrayOutputStream o0){ return null; }
	public MyHelperClass setBlockSize(int o0){ return null; }
	public MyHelperClass setAlignmentType(MyHelperClass o0){ return null; }
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

public MyHelperClass getEventType(){ return null; }
	public MyHelperClass getEventVariety(){ return null; }
	public MyHelperClass getURI(){ return null; }
	public MyHelperClass getCharacters(){ return null; }
	public MyHelperClass getName(){ return null; }}

class Scanner {

public MyHelperClass nextEvent(){ return null; }}

class ChannellingScanner {

public MyHelperClass getBlockCount(){ return null; }}

class EventType {

public MyHelperClass getURI(){ return null; }
	public MyHelperClass getIndex(){ return null; }
	public MyHelperClass getEventTypeList(){ return null; }}

class EventTypeList {

public MyHelperClass getEE(){ return null; }}

class EventTypeSchema {

public MyHelperClass getSchemaSubstance(){ return null; }}
