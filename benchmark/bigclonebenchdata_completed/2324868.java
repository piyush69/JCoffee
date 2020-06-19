
import java.io.UncheckedIOException;


class c2324868 {

//            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    MyHelperClass Pattern = new MyHelperClass();
                    Pattern delim =(Pattern)(Object) Pattern.compile("[ ]");
                    BufferedReader r = new BufferedReader(new InputStreamReader(new GZIPInputStream(new FileInputStream("/home/lindenb/jeter.txt.gz"))));
                    String line = null;
                    URL url = new URL("http://eutils.ncbi.nlm.nih.gov/entrez/eutils/efetch.fcgi");
                    URLConnection conn =(URLConnection)(Object) url.openConnection();
                    conn.setDoOutput(true);
                    OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
                    wr.write("db=snp&retmode=xml");
                    while ((line =(String)(Object) r.readLine()) != null) {
                        String tokens[] =(String[])(Object) delim.split(line, 2);
                        if (!tokens[0].startsWith("rs")) continue;
                        wr.write("&id=" + tokens[0].substring(2).trim());
                    }
                    wr.flush();
                    r.close();
                    InputStream in =(InputStream)(Object) conn.getInputStream();
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copyTo(in,(PrintStream)(Object) System.err);
                    in.close();
                    wr.close();
                } catch (UncheckedIOException err) {
                    err.printStackTrace();
                }
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass compile(String o0){ return null; }
	public MyHelperClass copyTo(InputStream o0, PrintStream o1){ return null; }}

class ActionEvent {

}

class Pattern {

public MyHelperClass split(String o0, int o1){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(GZIPInputStream o0){}}

class GZIPInputStream {

GZIPInputStream(FileInputStream o0){}
	GZIPInputStream(){}}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class URL {

URL(String o0){}
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

class InputStream {

public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class PrintStream {

}
