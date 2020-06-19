


class c17258629 {
public MyHelperClass assertEquals(byte[] o0, MyHelperClass o1){ return null; }

    private void checkRoundtrip(byte[] content) throws Exception {
        InputStream in =(InputStream)(Object) new ByteArrayInputStream(content);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        MyHelperClass CodecUtil = new MyHelperClass();
        CodecUtil.encodeQuotedPrintableBinary(in, out);
        in =(InputStream)(Object) new QuotedPrintableInputStream(new ByteArrayInputStream((byte[])(Object)out.toByteArray()));
        out = new ByteArrayOutputStream();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(in, out);
        assertEquals(content, out.toByteArray());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encodeQuotedPrintableBinary(InputStream o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }}

class InputStream {

}

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(byte[] o0){}}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}

class QuotedPrintableInputStream {

QuotedPrintableInputStream(ByteArrayInputStream o0){}
	QuotedPrintableInputStream(){}}
