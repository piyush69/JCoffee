


class c5233678 {

    public static boolean postData(URL url, String parameters) {
        HttpURLConnection hpcon = null;
        try {
            hpcon = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            hpcon.setRequestMethod("POST");
            hpcon.setRequestProperty("Content-Length", "" + Integer.toString(parameters.getBytes().length));
            hpcon.setUseCaches(false);
            hpcon.setDoInput(true);
            hpcon.setDoOutput(true);
            DataOutputStream printout = new DataOutputStream(hpcon.getOutputStream());
            printout.writeBytes(parameters);
            printout.flush();
            printout.close();
            BufferedReader in = new BufferedReader(new InputStreamReader(hpcon.getInputStream()));
            String input;
            boolean success = false;
            while ((input =(String)(Object) in.readLine()) != null) {
                if (input.contains("OK")) success = true;
            }
            return success;
        } catch (Exception e) {
            try {
                if (hpcon != null) hpcon.disconnect();
            } catch (Exception e2) {
            }
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }}

class DataOutputStream {

DataOutputStream(){}
	DataOutputStream(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass writeBytes(String o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
