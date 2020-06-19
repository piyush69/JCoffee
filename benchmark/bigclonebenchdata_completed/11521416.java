


class c11521416 {

    private static void sentRequest() {
        try {
            URLConnection urlConn;
            MyHelperClass gatewayURL = new MyHelperClass();
            URL url = new URL(gatewayURL);
            urlConn =(URLConnection)(Object) url.openConnection();
            urlConn.setRequestProperty("Content-Type", "text/xml");
            urlConn.setDoOutput(true);
            OutputStream ostream =(OutputStream)(Object) urlConn.getOutputStream();
            PrintWriter out = new PrintWriter(ostream);
            MyHelperClass request = new MyHelperClass();
            out.print(request);
            out.close();
            ostream.close();
            InputStream inStream =(InputStream)(Object) urlConn.getInputStream();
            MyHelperClass styleSheetLocation = new MyHelperClass();
            File myFile = new File(styleSheetLocation);
            MyHelperClass type = new MyHelperClass();
            if (type.equals("A") && (boolean)(Object)myFile.exists()) {
                MyHelperClass TransformerFactory = new MyHelperClass();
                TransformerFactory tFactory =(TransformerFactory)(Object) TransformerFactory.newInstance();
//                MyHelperClass styleSheetLocation = new MyHelperClass();
                Transformer transformer =(Transformer)(Object) tFactory.newTransformer(new StreamSource(styleSheetLocation));
                transformer.transform(new StreamSource(inStream), new StreamResult((PrintStream)(Object)System.out));
            } else {
                BufferedReader in = new BufferedReader(new InputStreamReader(inStream));
                String inputLine;
                while ((inputLine =(String)(Object) in.readLine()) != null) {
                    System.out.println(inputLine);
                }
                in.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newInstance(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class PrintWriter {

PrintWriter(OutputStream o0){}
	PrintWriter(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass print(MyHelperClass o0){ return null; }}

class InputStream {

}

class File {

File(MyHelperClass o0){}
	File(){}
	public MyHelperClass exists(){ return null; }}

class TransformerFactory {

public MyHelperClass newTransformer(StreamSource o0){ return null; }}

class Transformer {

public MyHelperClass transform(StreamSource o0, StreamResult o1){ return null; }}

class StreamSource {

StreamSource(MyHelperClass o0){}
	StreamSource(InputStream o0){}
	StreamSource(){}}

class StreamResult {

StreamResult(PrintStream o0){}
	StreamResult(){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class PrintStream {

}
