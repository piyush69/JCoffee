
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c1141235 {

    public static void main(String[] args) {
        String u = "http://portal.acm.org/results.cfm?query=%28Author%3A%22" + "Boehm%2C+Barry" + "%22%29&srt=score%20dsc&short=0&source_disp=&since_month=&since_year=&before_month=&before_year=&coll=ACM&dl=ACM&termshow=matchboolean&range_query=&CFID=22704101&CFTOKEN=37827144&start=1";
        URL url = null;
        AcmSearchresultPageParser_2011Jan cb = new AcmSearchresultPageParser_2011Jan();
        try {
            url = new URL(u);
            HttpURLConnection uc = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            uc.setUseCaches(false);
            InputStream is =(InputStream)(Object) uc.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            ParserDelegator pd = new ParserDelegator();
            pd.parse(br, cb, true);
            br.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("all doc num= " + cb.getAllDocNum());
        for (int i = 0; i < (int)(Object)cb.getEachResultStartPositions().size(); i++) {
            HashMap m =(HashMap)(Object) cb.getEachResultStartPositions().get(i);
            System.out.println(i + "pos= " + m);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class AcmSearchresultPageParser_2011Jan {

public MyHelperClass getAllDocNum(){ return null; }
	public MyHelperClass getEachResultStartPositions(){ return null; }}

class HttpURLConnection {

public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0){}}

class ParserDelegator {

public MyHelperClass parse(BufferedReader o0, AcmSearchresultPageParser_2011Jan o1, boolean o2){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HashMap {

}
