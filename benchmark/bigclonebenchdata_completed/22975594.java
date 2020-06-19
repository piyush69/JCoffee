


class c22975594 {

    public String getInternetData() throws Exception {
        BufferedReader in = null;
        String data = null;
        try {
            HttpClient client =(HttpClient)(Object) new DefaultHttpClient();
            URI website = new URI("http://code.google.com/p/gadi-works");
            HttpGet request = new HttpGet();
            request.setURI(website);
            HttpResponse response =(HttpResponse)(Object) client.execute(request);
            in = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            StringBuffer sb = new StringBuffer("");
            String l = "";
            String nl = System.getProperty("line.separator");
            while ((l =(String)(Object) in.readLine()) != null) {
                sb.append(l + nl);
            }
            in.close();
            data = sb.toString();
            return data;
        } finally {
            if (in != null) {
                try {
                    in.close();
                    return data;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getContent(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

}

class URI {

URI(String o0){}
	URI(){}}

class HttpGet {

public MyHelperClass setURI(URI o0){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
