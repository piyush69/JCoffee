
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c4259286 {
public MyHelperClass decode(MyHelperClass o0){ return null; }
public MyHelperClass encode(GeoLocation o0){ return null; }

    protected List webservice(URL url, List locations, boolean followRedirect) throws GeoServiceException {
        long start = System.currentTimeMillis();
        int rowCount = 0, hitCount = 0;
        try {
            HttpURLConnection con;
            try {
                con = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
                try {
                    MyHelperClass TIMEOUT = new MyHelperClass();
                    con.getClass().getMethod("setConnectTimeout", new Class[] { Integer.TYPE }).invoke(con, new Object[] { TIMEOUT });
                } catch (Throwable t) {
                    MyHelperClass LOG = new MyHelperClass();
                    LOG.info("can't set connection timeout");
                }
                con.setRequestMethod("POST");
                con.setDoOutput(true);
                con.setDoInput(true);
                MyHelperClass UTF8 = new MyHelperClass();
                Writer out =(Writer)(Object) new OutputStreamWriter(con.getOutputStream(), UTF8);
                MyHelperClass HEADER = new MyHelperClass();
                out.write(HEADER + "\n");
                for (int i = 0; i < (int)(Object)locations.size(); i++) {
                    if (i > 0) out.write("\n");
                    out.write((String)(Object)encode((GeoLocation)(GeoLocation)(Object) locations.get(i)));
                }
                out.close();
            } catch (UncheckedIOException e) {
                throw new GeoServiceException("Accessing GEO Webservice failed",(IOException)(Object) e);
            }
            List rows =(List)(Object) new ArrayList();
            try {
                MyHelperClass UTF8 = new MyHelperClass();
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), UTF8));
                for (int l = 0; l < (int)(Object)locations.size(); l++) {
                    String line =(String)(Object) in.readLine();
                    MyHelperClass LOG = new MyHelperClass();
                    LOG.finer(line);
                    if (line == null) break;
                    if (l == 0 && followRedirect) {
                        try {
                            return webservice(new URL(line), locations, false);
                        } catch (UncheckedIOException e) {
                        }
                    }
                    rowCount++;
                    List row =(List)(Object) new ArrayList();
                    if (!line.startsWith("?")) {
                        StringTokenizer hits = new StringTokenizer(line, ";");
                        while ((boolean)(Object)hits.hasMoreTokens()) {
                            GeoLocation hit =(GeoLocation)(Object) decode(hits.nextToken());
                            if (hit != null) {
                                row.add(hit);
                                hitCount++;
                            }
                        }
                    }
                    rows.add(row);
                }
                in.close();
            } catch (UncheckedIOException e) {
                throw new GeoServiceException("Reading from GEO Webservice failed",(IOException)(Object) e);
            }
            if ((int)(Object)rows.size() < (int)(Object)locations.size()) throw new GeoServiceException("GEO Webservice returned " + rows.size() + " rows for " + locations.size() + " locations");
            return rows;
        } finally {
            long secs = (System.currentTimeMillis() - start) / 1000;
            MyHelperClass LOG = new MyHelperClass();
            LOG.fine("query for " + locations.size() + " locations in " + secs + "s resulted in " + rowCount + " rows and " + hitCount + " total hits");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass fine(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass finer(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class List {

public MyHelperClass add(GeoLocation o0){ return null; }
	public MyHelperClass add(List o0){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }}

class GeoServiceException extends Exception{
	public GeoServiceException(String errorMessage) { super(errorMessage); }
	GeoServiceException(String o0, IOException o1){}
	GeoServiceException(){}
}

class HttpURLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class Writer {

public MyHelperClass write(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(MyHelperClass o0, MyHelperClass o1){}
	OutputStreamWriter(){}}

class GeoLocation {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ArrayList {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0, MyHelperClass o1){}
	InputStreamReader(){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class StringTokenizer {

StringTokenizer(String o0, String o1){}
	StringTokenizer(){}
	public MyHelperClass nextToken(){ return null; }
	public MyHelperClass hasMoreTokens(){ return null; }}
