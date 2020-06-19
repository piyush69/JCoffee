
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c129856 {
public MyHelperClass acmHostName;
	public MyHelperClass Type;
	public MyHelperClass httpWebProxyPort;
	public MyHelperClass serviceName;

    public String getScenarioData(String urlForSalesData) throws IOException, Exception {
        InputStream inputStream = null;
        BufferedReader bufferedReader = null;
        DataInputStream input = null;
        StringBuffer sBuf = new StringBuffer();
        Proxy proxy;
        MyHelperClass httpWebProxyServer = new MyHelperClass();
        if (httpWebProxyServer != null && Integer.toString((int)(Object)httpWebProxyPort) != null) {
//            MyHelperClass httpWebProxyServer = new MyHelperClass();
            SocketAddress address =(SocketAddress)(Object) new InetSocketAddress(httpWebProxyServer, httpWebProxyPort);
            proxy = new Proxy(Type.HTTP, address);
        } else {
            proxy = null;
        }
        proxy = null;
        URL url;
        try {
            url = new URL(urlForSalesData);
            HttpURLConnection httpUrlConnection;
            if (proxy != null) httpUrlConnection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection(proxy); else httpUrlConnection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            httpUrlConnection.setDoInput(true);
            httpUrlConnection.setRequestMethod("GET");
            MyHelperClass rb = new MyHelperClass();
            String name =(String)(Object) rb.getString("WRAP_NAME");
//            MyHelperClass rb = new MyHelperClass();
            String password =(String)(Object) rb.getString("WRAP_PASSWORD");
            MyHelperClass TOKEN_TYPE = new MyHelperClass();
            Credentials simpleAuthCrentials = new Credentials(TOKEN_TYPE.SimpleApiAuthToken, name, password);
//            MyHelperClass httpWebProxyServer = new MyHelperClass();
            ACSTokenProvider tokenProvider = new ACSTokenProvider(httpWebProxyServer, httpWebProxyPort, simpleAuthCrentials);
            MyHelperClass solutionName = new MyHelperClass();
            String requestUriStr1 = "https://" + solutionName + "." + acmHostName + "/" + serviceName;
//            MyHelperClass rb = new MyHelperClass();
            String appliesTo1 =(String)(Object) rb.getString("SIMPLEAPI_APPLIES_TO");
            String token =(String)(Object) tokenProvider.getACSToken(requestUriStr1, appliesTo1);
            httpUrlConnection.addRequestProperty("token", "WRAPv0.9 " + token);
//            MyHelperClass solutionName = new MyHelperClass();
            httpUrlConnection.addRequestProperty("solutionName", solutionName);
            httpUrlConnection.connect();
            MyHelperClass HttpServletResponse = new MyHelperClass();
            if (httpUrlConnection.getResponseCode() == HttpServletResponse.SC_UNAUTHORIZED) {
                List salesOrderServiceBean =(List)(Object) new ArrayList();
                TestSalesOrderService response = new TestSalesOrderService();
//                MyHelperClass HttpServletResponse = new MyHelperClass();
                response.setResponseCode(HttpServletResponse.SC_UNAUTHORIZED);
                response.setResponseMessage(httpUrlConnection.getResponseMessage());
                salesOrderServiceBean.add(response);
            }
            inputStream =(InputStream)(Object) httpUrlConnection.getInputStream();
            input = new DataInputStream(inputStream);
            bufferedReader = new BufferedReader(new InputStreamReader(input));
            String str;
            while (null != ((str =(String)(Object) bufferedReader.readLine()))) {
                sBuf.append(str);
            }
            String responseString = sBuf.toString();
            return responseString;
        } catch (UncheckedIOException e) {
            throw e;
        } catch (ArithmeticException e) {
            throw e;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_UNAUTHORIZED;
	public MyHelperClass HTTP;
	public MyHelperClass SimpleApiAuthToken;
public MyHelperClass getString(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class DataInputStream {

DataInputStream(){}
	DataInputStream(InputStream o0){}}

class Proxy {

Proxy(){}
	Proxy(MyHelperClass o0, SocketAddress o1){}}

class SocketAddress {

}

class InetSocketAddress {

InetSocketAddress(){}
	InetSocketAddress(MyHelperClass o0, MyHelperClass o1){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass openConnection(Proxy o0){ return null; }}

class HttpURLConnection {

public MyHelperClass addRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getResponseMessage(){ return null; }
	public MyHelperClass addRequestProperty(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}

class Credentials {

Credentials(){}
	Credentials(MyHelperClass o0, String o1, String o2){}}

class ACSTokenProvider {

ACSTokenProvider(){}
	ACSTokenProvider(MyHelperClass o0, MyHelperClass o1, Credentials o2){}
	public MyHelperClass getACSToken(String o0, String o1){ return null; }}

class List {

public MyHelperClass add(TestSalesOrderService o0){ return null; }}

class TestSalesOrderService {

public MyHelperClass setResponseCode(MyHelperClass o0){ return null; }
	public MyHelperClass setResponseMessage(MyHelperClass o0){ return null; }}

class ArrayList {

}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(DataInputStream o0){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
