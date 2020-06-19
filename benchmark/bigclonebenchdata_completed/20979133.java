


class c20979133 {
public MyHelperClass readResponse(InputStreamReader o0){ return null; }
public MyHelperClass URLEncoder;
	public MyHelperClass Level;
	public MyHelperClass log;
	public MyHelperClass Secure;
	public MyHelperClass getRecord_ID(){ return null; }
	public MyHelperClass get_HashMap(){ return null; }
	public MyHelperClass getComments(){ return null; }
	public MyHelperClass getDBAddress(){ return null; }

    public String report() {
        if (true) return "-";
        StringBuffer parameter = new StringBuffer("?");
        if ((int)(Object)getRecord_ID() == 0) return "ID=0";
        if ((int)(Object)getRecord_ID() == 1) {
            parameter.append("ISSUE=");
            HashMap htOut =(HashMap)(Object) get_HashMap();
            try {
                ByteArrayOutputStream bOut = new ByteArrayOutputStream();
                ObjectOutput oOut =(ObjectOutput)(Object) new ObjectOutputStream(bOut);
                oOut.writeObject(htOut);
                oOut.flush();
                String hexString =(String)(Object) Secure.convertToHexString(bOut.toByteArray());
                parameter.append(hexString);
            } catch (Exception e) {
                log.severe(e.getLocalizedMessage());
                return "New-" + e.getLocalizedMessage();
            }
        } else {
            try {
                parameter.append("RECORDID=").append(getRecord_ID());
                parameter.append("&DBADDRESS=").append(URLEncoder.encode(getDBAddress(), "UTF-8"));
                parameter.append("&COMMENTS=").append(URLEncoder.encode(getComments(), "UTF-8"));
            } catch (Exception e) {
                log.severe(e.getLocalizedMessage());
                return "Update-" + e.getLocalizedMessage();
            }
        }
        InputStreamReader in = null;
        String target = "http://dev1/wstore/issueReportServlet";
        try {
            StringBuffer urlString = new StringBuffer(target).append(parameter);
            URL url = new URL(urlString.toString());
            URLConnection uc =(URLConnection)(Object) url.openConnection();
            in = new InputStreamReader(uc.getInputStream());
        } catch (Exception e) {
            String msg = "Cannot connect to http://" + target;
            if (e instanceof FileNotFoundException || e instanceof ConnectException) msg += "\nServer temporarily down - Please try again later"; else {
                msg += "\nCheck connection - " + e.getLocalizedMessage();
                log.log(Level.FINE, msg);
            }
            return msg;
        }
        return(String)(Object) readResponse(in);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FINE;
public MyHelperClass severe(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass encode(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass convertToHexString(MyHelperClass o0){ return null; }}

class HashMap {

}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}

class ObjectOutput {

public MyHelperClass writeObject(HashMap o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class ObjectOutputStream {

ObjectOutputStream(){}
	ObjectOutputStream(ByteArrayOutputStream o0){}}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class ConnectException extends Exception{
	public ConnectException(String errorMessage) { super(errorMessage); }
}
