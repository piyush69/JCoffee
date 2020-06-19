


class c668846 {

    public static String getURL(String urlString, String getData, String postData) {
        try {
            if (getData != null) if (!getData.equals("")) urlString += "?" + getData;
            URL url = new URL(urlString);
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            if (!postData.equals("")) {
                connection.setDoOutput(true);
                PrintWriter out = new PrintWriter(connection.getOutputStream());
                out.print(postData);
                out.close();
            }
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            int inputLine;
            String output = "";
            while ((inputLine =(int)(Object) in.read()) != -1) output += (char) inputLine;
            in.close();
            return output;
        } catch (Exception e) {
            return null;
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

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class PrintWriter {

PrintWriter(MyHelperClass o0){}
	PrintWriter(){}
	public MyHelperClass print(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
