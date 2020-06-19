
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c10361727 {
public MyHelperClass NetworkLog;
	public MyHelperClass br;
	public MyHelperClass openConnection(String o0, String o1){ return null; }

    void queryInactive() {
        try {
            MyHelperClass XMLConfigParser = new MyHelperClass();
            XMLConfigParser.readUrlHost();
//            MyHelperClass XMLConfigParser = new MyHelperClass();
            String url =(String)(Object) XMLConfigParser.urlHost;
            Date currenttime = new Date();
            String query;
            String param1 = "op=queryinactive";
            String param2 = "time=" + currenttime.getTime();
            query = String.format("%s&%s", param1, param2);
            openConnection(query, url);
            String line =(String)(Object) br.readLine();
            NetworkLog.logMsg(NetworkLog.LOG_DEBUG, this, "(Query inactive)Response of the server: " + line);
            br.close();
        } catch (UncheckedIOException e) {
            NetworkLog.logMsg(NetworkLog.LOG_ERROR, this, "Error" + e);
        } catch (ArithmeticException e) {
            NetworkLog.logMsg(NetworkLog.LOG_ERROR, this, e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass LOG_ERROR;
	public MyHelperClass LOG_DEBUG;
	public MyHelperClass urlHost;
public MyHelperClass close(){ return null; }
	public MyHelperClass logMsg(MyHelperClass o0, c10361727 o1, String o2){ return null; }
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass readUrlHost(){ return null; }}

class Date {

public MyHelperClass getTime(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
