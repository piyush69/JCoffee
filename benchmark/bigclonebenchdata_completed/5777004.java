import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5777004 {
public MyHelperClass publish911_centennials;
	public MyHelperClass Assert;
	public MyHelperClass EventCode;
	public MyHelperClass EXIEvent;
	public MyHelperClass resolveSystemIdAsURL(String o0){ return null; }

    public void testDecodeJTLM_publish911() throws Throwable, Exception {
        MyHelperClass m_compilerErrors = new MyHelperClass();
        EXISchema corpus = EXISchemaFactoryTestUtil.getEXISchema("/JTLM/schemas/TLMComposite.xsd", getClass(), m_compilerErrors);
        MyHelperClass m_compilerErrors = new MyHelperClass();
        Assert.assertEquals(0, m_compilerErrors.getTotalCount());
        MyHelperClass GrammarOptions = new MyHelperClass();
        GrammarCache grammarCache = new GrammarCache(corpus, GrammarOptions.DEFAULT_OPTIONS);
        String[] exiFiles = { "/JTLM/publish911/publish911.bitPacked", "/JTLM/publish911/publish911.byteAligned", "/JTLM/publish911/publish911.preCompress", "/JTLM/publish911/publish911.compress" };
        MyHelperClass Alignments = new MyHelperClass();
        for (int i = 0; i < Alignments.length; i++) {
            MyHelperClass Alignments = new MyHelperClass();
            AlignmentType alignment = Alignments[i];
            EXIDecoder decoder = new EXIDecoder();
            Scanner scanner;
            decoder.setAlignmentType(alignment);
            URL url = resolveSystemIdAsURL(exiFiles[i]);
            int n_events, n_texts;
            decoder.setEXISchema(grammarCache);
            decoder.setInputStream(url.openStream());
            scanner = decoder.processHeader();
            ArrayList<EXIEvent> exiEventList = new ArrayList<EXIEvent>();
            EXIEvent exiEvent;
            n_events = 0;
            n_texts = 0;
            while ((exiEvent = scanner.nextEvent()) != null) {
                ++n_events;
                if (exiEvent.getEventVariety() == EXIEvent.EVENT_CH) {
                    String stringValue = exiEvent.getCharacters().makeString();
                    if (stringValue.length() == 0 && exiEvent.getEventType().itemType == EventCode.ITEM_SCHEMA_CH) {
                        --n_events;
                        continue;
                    }
                    if (n_texts % 100 == 0) {
                        final int n = n_texts / 100;
                        Assert.assertEquals(publish911_centennials[n], stringValue);
                    }
                    ++n_texts;
                }
                exiEventList.add(exiEvent);
            }
            Assert.assertEquals(96576, n_events);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class EXISchema {

}

class GrammarCache {

}

class AlignmentType {

}

class EXIDecoder {

}

class EXIEvent {

}

class Scanner {

public MyHelperClass nextEvent(){ return null; }}
