


class c17793612 {

        public SequenceIterator call(SequenceIterator[] arguments, XPathContext context) throws XPathException {
            try {
                String encodedString =(String)(Object) ((StringValue)(StringValue)(Object) arguments[0].next()).getStringValue();
                MyHelperClass Base64 = new MyHelperClass();
                byte[] decodedBytes =(byte[])(Object) Base64.decode(encodedString);
                if (arguments.length > 1 && (boolean)(Object)((BooleanValue)(BooleanValue)(Object) arguments[1].next()).getBooleanValue()) {
                    ByteArrayInputStream bis = new ByteArrayInputStream(decodedBytes);
                    GZIPInputStream zis = new GZIPInputStream(bis);
                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(zis, baos);
                    decodedBytes =(byte[])(Object) baos.toByteArray();
                }
                MyHelperClass XmlUtils = new MyHelperClass();
                Document doc =(Document)(Object) XmlUtils.stringToDocument(new String(decodedBytes, "UTF-8"));
                Source source =(Source)(Object) new DOMSource(doc.getDocumentElement());
                XPathEvaluator evaluator = new XPathEvaluator(context.getConfiguration());
                NodeInfo[] infos = new NodeInfo[] {(NodeInfo)(Object) evaluator.setSource(source) };
                return (SequenceIterator)(Object)new ArrayIterator(infos);
            } catch (Exception e) {
                throw new XPathException("Could not base64 decode string", e);
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(GZIPInputStream o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass decode(String o0){ return null; }
	public MyHelperClass stringToDocument(String o0){ return null; }}

class SequenceIterator {

public MyHelperClass next(){ return null; }}

class XPathContext {

public MyHelperClass getConfiguration(){ return null; }}

class XPathException extends Exception{
	public XPathException(String errorMessage) { super(errorMessage); }
	XPathException(String o0, Exception o1){}
	XPathException(){}
}

class StringValue {

public MyHelperClass getStringValue(){ return null; }}

class BooleanValue {

public MyHelperClass getBooleanValue(){ return null; }}

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(byte[] o0){}}

class GZIPInputStream {

GZIPInputStream(ByteArrayInputStream o0){}
	GZIPInputStream(){}}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}

class Document {

public MyHelperClass getDocumentElement(){ return null; }}

class Source {

}

class DOMSource {

DOMSource(MyHelperClass o0){}
	DOMSource(){}}

class XPathEvaluator {

XPathEvaluator(MyHelperClass o0){}
	XPathEvaluator(){}
	public MyHelperClass setSource(Source o0){ return null; }}

class NodeInfo {

}

class ArrayIterator {

ArrayIterator(){}
	ArrayIterator(NodeInfo[] o0){}}
