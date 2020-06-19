


class c20232250 {
public MyHelperClass IOUtil;
public MyHelperClass PRIMER_BLAST_URL;
	public MyHelperClass URLEncoder;
	public MyHelperClass ENCODING;
	public MyHelperClass processOptions(StringBuilder o0){ return null; }

    private InputStream sendRequest(SequenceI seq) throws UnsupportedEncodingException, IOException {
        StringBuilder putBuf = new StringBuilder();
        processOptions(putBuf);
        putBuf.append("INPUT_SEQUENCE=");
        putBuf.append(URLEncoder.encode(">" + seq.getName() + "\n", ENCODING));
        putBuf.append(URLEncoder.encode(seq.getResidues(), ENCODING));
        URL url = new URL(PRIMER_BLAST_URL);
        URLConnection conn =(URLConnection)(Object) url.openConnection();
        conn.setDoOutput(true);
        OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
        wr.write(putBuf.toString());
        wr.flush();
        wr.close();
        IOUtil.informationDialog("Primer-BLAST request sent");
        return(InputStream)(Object) conn.getInputStream();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass encode(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass informationDialog(String o0){ return null; }}

class SequenceI {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getResidues(){ return null; }}

class InputStream {

}

class UnsupportedEncodingException extends Exception{
	public UnsupportedEncodingException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(String o0){ return null; }}
