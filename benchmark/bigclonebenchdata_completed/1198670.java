


class c1198670 {

    public static String send(String purl, String xml) throws Exception {
        URL url = new URL(purl);
        HttpURLConnection httpUrlCon = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        httpUrlCon.setRequestMethod("POST");
        httpUrlCon.setDoOutput(true);
        PrintWriter writer = new PrintWriter(httpUrlCon.getOutputStream());
        writer.println(xml);
        writer.flush();
        writer.close();
        System.out.println("Sending: " + xml);
        StringBuffer response = new StringBuffer();
        InputStreamReader is = null;
        try {
            is = new InputStreamReader(httpUrlCon.getInputStream());
        } catch (Exception e) {
            e.printStackTrace();
            is = new InputStreamReader(httpUrlCon.getErrorStream());
        }
        BufferedReader br = new BufferedReader(is);
        String line = null;
        while ((line =(String)(Object) br.readLine()) != null) {
            response.append(line);
            response.append("\n");
        }
        String r = response.toString();
        return r;
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

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass getErrorStream(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class PrintWriter {

PrintWriter(){}
	PrintWriter(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass println(String o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}
