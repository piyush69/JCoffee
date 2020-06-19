


class c16903092 {
public MyHelperClass URLEncoder;
	public MyHelperClass rnrSEE;

    public String sendSMS(String destinationNumber, String txt, String id) throws IOException {
        String out = "";
        String smsdata = "";
        MyHelperClass enc = new MyHelperClass();
        smsdata += URLEncoder.encode("id", enc) + "=" + URLEncoder.encode(id, enc);
//        MyHelperClass enc = new MyHelperClass();
        smsdata += "&" + URLEncoder.encode("phoneNumber", enc) + "=" + URLEncoder.encode(destinationNumber, enc);
//        MyHelperClass enc = new MyHelperClass();
        smsdata += "&" + URLEncoder.encode("conversationId", enc) + "=" + URLEncoder.encode(id, enc);
//        MyHelperClass enc = new MyHelperClass();
        smsdata += "&" + URLEncoder.encode("text", enc) + "=" + URLEncoder.encode(txt, enc);
//        MyHelperClass enc = new MyHelperClass();
        smsdata += "&" + URLEncoder.encode("_rnr_se", enc) + "=" + URLEncoder.encode(rnrSEE, enc);
        System.out.println("smsdata: " + smsdata);
        URL smsurl = new URL("https://www.google.com/voice/b/0/sms/send/");
        URLConnection smsconn =(URLConnection)(Object) smsurl.openConnection();
        MyHelperClass authToken = new MyHelperClass();
        smsconn.setRequestProperty("Authorization", "GoogleLogin auth=" + authToken);
        MyHelperClass USER_AGENT = new MyHelperClass();
        smsconn.setRequestProperty("User-agent", USER_AGENT);
        smsconn.setDoOutput(true);
        OutputStreamWriter callwr = new OutputStreamWriter(smsconn.getOutputStream());
        callwr.write(smsdata);
        callwr.flush();
        BufferedReader callrd = new BufferedReader(new InputStreamReader(smsconn.getInputStream()));
        String line;
        while ((line =(String)(Object) callrd.readLine()) != null) {
            out += line + "\n\r";
        }
        callwr.close();
        callrd.close();
        if (out.equals("")) {
            throw new IOException("No Response Data Received.");
        }
        return out;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass encode(String o0, MyHelperClass o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setRequestProperty(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(String o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
