


class c2633238 {

    public static String getResourceFromURL(URL url, String acceptHeader) throws java.io.IOException {
        HttpURLConnection urlConnection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        urlConnection.setUseCaches(false);
        urlConnection.setRequestProperty("Accept", acceptHeader);
        urlConnection.setInstanceFollowRedirects(true);
        BufferedReader input = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        String content = "";
        String line;
        while ((line =(String)(Object) input.readLine()) != null) {
            content += line;
        }
        input.close();
        return content;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setInstanceFollowRedirects(boolean o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
