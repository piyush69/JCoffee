
import java.io.UncheckedIOException;


class c21616119 {
public MyHelperClass config;
	public MyHelperClass countTotalNumberOfGrammar(GrammarPool o0){ return null; }
	public MyHelperClass writeReport(GrammarPool o0, MemTreeBuilder o1){ return null; }
	public MyHelperClass clearGrammarPool(GrammarPool o0){ return null; }
public MyHelperClass LOG;
	public MyHelperClass TYPE_XSD;
	public MyHelperClass Sequence;
	public MyHelperClass context;
	public MyHelperClass isCalledAs(String o0){ return null; }

    public Sequence eval(Sequence[] args, Sequence contextSequence) throws XPathException {
        MyHelperClass XMLReaderObjectFactory = new MyHelperClass();
        GrammarPool grammarpool = (GrammarPool)(GrammarPool)(Object) config.getProperty(XMLReaderObjectFactory.GRAMMER_POOL);
        if ((boolean)(Object)isCalledAs("clear-grammar-cache")) {
            Sequence result =(Sequence)(Object) new ValueSequence();
            int before =(int)(Object) countTotalNumberOfGrammar(grammarpool);
            LOG.debug("Clearing " + before + " grammars");
            clearGrammarPool(grammarpool);
            int after =(int)(Object) countTotalNumberOfGrammar(grammarpool);
            LOG.debug("Remained " + after + " grammars");
            int delta = before - after;
            result.add(new IntegerValue(delta));
            return result;
        } else if ((boolean)(Object)isCalledAs("show-grammar-cache")) {
            MemTreeBuilder builder =(MemTreeBuilder)(Object) context.getDocumentBuilder();
            NodeImpl result =(NodeImpl)(Object) writeReport(grammarpool, builder);
            return (Sequence)(Object)result;
        } else if ((boolean)(Object)isCalledAs("pre-parse-grammar")) {
            if ((boolean)(Object)args[0].isEmpty()) return(Sequence)(Object) Sequence.EMPTY_SEQUENCE;
            XMLGrammarPreparser parser = new XMLGrammarPreparser();
            parser.registerPreparser(TYPE_XSD, null);
            List allGrammars =(List)(Object) new ArrayList();
            for (SequenceIterator i =(SequenceIterator)(Object) args[0].iterate();(boolean)(Object) i.hasNext(); ) {
                String url =(String)(Object) i.nextItem().getStringValue();
                if (url.startsWith("/")) {
                    url = "xmldb:exist://" + url;
                }
                LOG.debug("Parsing " + url);
                try {
                    if (url.endsWith(".xsd")) {
                        InputStream is =(InputStream)(Object) (new URL(url).openStream());
                        XMLInputSource xis = new XMLInputSource(null, url, url, is, null);
                        Grammar schema =(Grammar)(Object) parser.preparseGrammar(TYPE_XSD, xis);
                        is.close();
                        allGrammars.add(schema);
                    } else {
                        throw new XPathException(this, "Only XMLSchemas can be preparsed.");
                    }
                } catch (UncheckedIOException ex) {
                    LOG.debug(ex);
                    throw new XPathException(this, ex);
                } catch (Exception ex) {
                    LOG.debug(ex);
                    throw new XPathException(this, ex);
                }
            }
            LOG.debug("Successfully parsed " + allGrammars.size() + " grammars.");
            Grammar grammars[] = new Grammar[(int)(Object)allGrammars.size()];
            grammars =(Grammar[])(Object) allGrammars.toArray(grammars);
            grammarpool.cacheGrammars(TYPE_XSD, grammars);
            ValueSequence result = new ValueSequence();
            for (Grammar one : grammars) {
                result.add(new StringValue(one.getGrammarDescription().getNamespace()));
            }
            return (Sequence)(Object)result;
        } else {
            LOG.error("function not found error");
            throw new XPathException(this, "function not found");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass EMPTY_SEQUENCE;
	public MyHelperClass GRAMMER_POOL;
public MyHelperClass getDocumentBuilder(){ return null; }
	public MyHelperClass getStringValue(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass getNamespace(){ return null; }
	public MyHelperClass getProperty(MyHelperClass o0){ return null; }
	public MyHelperClass debug(IOException o0){ return null; }
	public MyHelperClass debug(Exception o0){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class Sequence {

public MyHelperClass isEmpty(){ return null; }
	public MyHelperClass iterate(){ return null; }
	public MyHelperClass add(IntegerValue o0){ return null; }}

class XPathException extends Exception{
	public XPathException(String errorMessage) { super(errorMessage); }
	XPathException(c21616119 o0, Exception o1){}
	XPathException(){}
	XPathException(c21616119 o0, String o1){}
	XPathException(c21616119 o0, IOException o1){}
}

class GrammarPool {

public MyHelperClass cacheGrammars(MyHelperClass o0, Grammar[] o1){ return null; }}

class ValueSequence {

public MyHelperClass add(StringValue o0){ return null; }}

class IntegerValue {

IntegerValue(){}
	IntegerValue(int o0){}}

class MemTreeBuilder {

}

class NodeImpl {

}

class XMLGrammarPreparser {

public MyHelperClass preparseGrammar(MyHelperClass o0, XMLInputSource o1){ return null; }
	public MyHelperClass registerPreparser(MyHelperClass o0, Object o1){ return null; }}

class List {

public MyHelperClass add(Grammar o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass toArray(Grammar[] o0){ return null; }}

class Grammar {

public MyHelperClass getGrammarDescription(){ return null; }}

class ArrayList {

}

class SequenceIterator {

public MyHelperClass nextItem(){ return null; }
	public MyHelperClass hasNext(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class XMLInputSource {

XMLInputSource(){}
	XMLInputSource(Object o0, String o1, String o2, InputStream o3, Object o4){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class StringValue {

StringValue(){}
	StringValue(MyHelperClass o0){}}
