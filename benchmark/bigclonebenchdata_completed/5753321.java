


class c5753321 {

    public String selectFROM() throws Exception {
        BufferedReader in = null;
        String data = null;
        try {
            HttpClient httpclient =(HttpClient)(Object) new DefaultHttpClient();
            URI uri = new URI("http://**.**.**.**/OctopusManager/index2.php");
            HttpGet request = new HttpGet();
            request.setURI(uri);
            HttpResponse httpresponse =(HttpResponse)(Object) httpclient.execute(request);
            HttpEntity httpentity =(HttpEntity)(Object) httpresponse.getEntity();
            in = new BufferedReader(new InputStreamReader(httpentity.getContent()));
            StringBuffer sb = new StringBuffer("");
            String line = "";
            while ((line =(String)(Object) in.readLine()) != null) {
                sb.append(line);
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

}

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

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
