


class c13336602 {

    private final boolean verifyMatch(String disc_id, String title) {
        try {
            URL url;
            URLConnection urlConn;
            DataOutputStream printout;
            BufferedReader input;
            url = new URL("http://www.amazon.com/exec/obidos/ASIN/" + disc_id);
            urlConn =(URLConnection)(Object) url.openConnection();
            urlConn.setDoInput(true);
            urlConn.setDoOutput(true);
            urlConn.setUseCaches(false);
            urlConn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            input = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
            String str;
            boolean goodMatch = false;
            boolean match = false;
            while (null != ((str =(String)(Object) input.readLine()))) {
                String keyword = title.toUpperCase();
                int idStart = str.toUpperCase().indexOf((keyword));
                if (idStart > 0) {
                    if (str.toUpperCase().endsWith(title.toUpperCase())) {
                        goodMatch = true;
                    } else {
                        match = true;
                    }
                }
            }
            input.close();
            if (goodMatch) {
                MyHelperClass status = new MyHelperClass();
                status.append("Exact Match. ");
                return true;
            } else if (match) {
                MyHelperClass status = new MyHelperClass();
                status.append("Inexact Match. ");
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass append(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class DataOutputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
