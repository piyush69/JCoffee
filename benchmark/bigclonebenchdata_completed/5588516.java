import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c5588516 {
public MyHelperClass Charset;
	public MyHelperClass charsetDecoder;
	public MyHelperClass charset;
	public MyHelperClass charsetname;
	public MyHelperClass url;
	public MyHelperClass openedIterators;
	public MyHelperClass returnNullUponEof;

    public LineIterator iterator() {
        LineIterator ret;
        final String charsetname;
        final Charset charset;
        final CharsetDecoder charsetDecoder;
        synchronized (this) {
            charsetname =(String)(Object) this.charsetname;
            charset =(Charset)(Object) this.charset;
            charsetDecoder =(CharsetDecoder)(Object) this.charsetDecoder;
        }
        try {
            if (charsetDecoder != null) ret = new LineIterator(this, url.openStream(), returnNullUponEof, charsetDecoder); else if (charset != null) ret = new LineIterator(this, url.openStream(), returnNullUponEof, charset); else if (charsetname != null) ret = new LineIterator(this, url.openStream(), returnNullUponEof, Charset.forName(charsetname)); else ret = new LineIterator(this, url.openStream(), returnNullUponEof, (Charset) null);
            synchronized (openedIterators) {
                openedIterators.add(ret);
            }
            return ret;
        } catch (UncheckedIOException e) {
            throw new IllegalStateException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass forName(String o0){ return null; }
	public MyHelperClass add(LineIterator o0){ return null; }}

class LineIterator {

LineIterator(c5588516 o0, MyHelperClass o1, MyHelperClass o2, CharsetDecoder o3){}
	LineIterator(c5588516 o0, MyHelperClass o1, MyHelperClass o2, Charset o3){}
	LineIterator(){}
	LineIterator(c5588516 o0, MyHelperClass o1, MyHelperClass o2, MyHelperClass o3){}}

class Charset {

}

class CharsetDecoder {

}
