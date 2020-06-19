


class c23079352 {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://localhost:8080/axis/services/Tripcom?wsdl");
            HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setRequestProperty("Content-type", "text/xml; charset=utf-8");
            connection.setRequestProperty("SOAPAction", "http://tempuri.org/GetTime");
            String msg = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" + "<soap:Envelope " + " xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" + " <soap:Body>\n" + "   <rdTest xmlns=\"http://tempuri.org/\"> \n" + "   <tns:rdTest message=\"tns:rdTest\"/>  \n" + "   </rdTest>" + " </soap:Body>\n" + "</soap:Envelope>";
            byte[] bytes = msg.getBytes();
            connection.setRequestProperty("Content-length", String.valueOf(bytes.length));
            System.out.println("\nSOAP Aufruf:");
            System.out.println("Content-type:" + connection.getRequestProperty("Content-type"));
            System.out.println("Content-length:" + connection.getRequestProperty("Content-length"));
            System.out.println("SOAPAction:" + connection.getRequestProperty("SOAPAction"));
            System.out.println(msg);
            OutputStream out =(OutputStream)(Object) connection.getOutputStream();
            out.write(bytes);
            out.close();
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            System.out.println("\nServer Antwort:");
            while ((inputLine =(String)(Object) in.readLine()) != null) System.out.println(inputLine);
            in.close();
        } catch (Exception e) {
            System.out.println("FEHLER:" + e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getRequestProperty(String o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
