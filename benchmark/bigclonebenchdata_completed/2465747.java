


class c2465747 {

    public static String postRequest(String urlString, HashMap data) {
        String returnData = "";
        try {
            URL url = new URL(urlString);
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            connection.setDoOutput(true);
            connection.setDoInput(true);
            PrintWriter out = new PrintWriter(connection.getOutputStream());
            Object[] keySet =(Object[])(Object) data.keySet().toArray();
            Object[] values =(Object[])(Object) data.values().toArray();
            for (int count = 0; count < keySet.length; count++) {
                MyHelperClass URLEncoder = new MyHelperClass();
                out.print(URLEncoder.encode((String) keySet[count]) + "=" + URLEncoder.encode((String) values[count]));
                if ((count + 1) < keySet.length) out.print("&");
            }
            out.close();
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            while ((inputLine =(String)(Object) in.readLine()) != null) {
                returnData += inputLine;
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
            returnData = null;
        }
        return (returnData);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(String o0){ return null; }
	public MyHelperClass toArray(){ return null; }}

class HashMap {

public MyHelperClass values(){ return null; }
	public MyHelperClass keySet(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setDoInput(boolean o0){ return null; }
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
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
