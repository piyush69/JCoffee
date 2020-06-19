import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5624313 {

    private GenomicSequence fetch(Chromosome k, int start, int end) throws Throwable, IOException {
        try {
            String chr = k.toString();
            if (chr.toLowerCase().startsWith("chr")) chr = chr.substring(3);
            MyHelperClass SAXParserFactory = new MyHelperClass();
            SAXParserFactory f = SAXParserFactory.newInstance();
            f.setNamespaceAware(false);
            f.setValidating(false);
            SAXParser parser = f.newSAXParser();
            MyHelperClass genomeVersion = new MyHelperClass();
            URL url = new URL("http://genome.ucsc.edu/cgi-bin/das/" + genomeVersion + "/dna?segment=" + URLEncoder.encode(chr, "UTF-8") + ":" + (start + 1) + "," + (end));
            DASHandler handler = new DASHandler();
            InputStream in = url.openStream();
            parser.parse(in, handler);
            in.close();
            GenomicSequence seq = new GenomicSequence();
            seq.sequence = handler.bytes.toByteArray();
            seq.start = start;
            seq.end = end;
            if (seq.sequence.length != seq.length()) throw new IOException("bad bound " + seq + " " + seq.sequence.length + " " + seq.length());
            return seq;
        } catch (IOException err) {
            throw err;
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newInstance(){ return null; }}

class Chromosome {

}

class GenomicSequence {
public MyHelperClass start;
	public MyHelperClass end;
	public MyHelperClass sequence;
public MyHelperClass length(){ return null; }}

class SAXParserFactory {

public MyHelperClass setNamespaceAware(boolean o0){ return null; }
	public MyHelperClass newSAXParser(){ return null; }
	public MyHelperClass setValidating(boolean o0){ return null; }}

class SAXParser {

public MyHelperClass parse(InputStream o0, DASHandler o1){ return null; }}

class DASHandler {
public MyHelperClass bytes;
}
