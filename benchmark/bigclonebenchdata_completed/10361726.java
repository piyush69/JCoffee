
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c10361726 {
public MyHelperClass NetworkLog;
	public MyHelperClass br;
	public MyHelperClass openConnection(String o0, String o1){ return null; }

    void queryFile(String rendezvousProgram, String rendezvousMD5) {
        try {
            MyHelperClass XMLConfigParser = new MyHelperClass();
            XMLConfigParser.readUrlHost();
//            MyHelperClass XMLConfigParser = new MyHelperClass();
            String url =(String)(Object) XMLConfigParser.urlHost;
            String query;
            String param1 = "op=query";
            String param2 = "program=" + rendezvousProgram;
            String param3 = "md5=" + rendezvousMD5;
            query = String.format("%s&%s&%s", param1, param2, param3);
            openConnection(query, url);
            String line =(String)(Object) br.readLine();
            NetworkLog.logMsg(NetworkLog.LOG_DEBUG, this, "(Query) Response of the server: " + line);
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
public MyHelperClass logMsg(MyHelperClass o0, c10361726 o1, String o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass readUrlHost(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
