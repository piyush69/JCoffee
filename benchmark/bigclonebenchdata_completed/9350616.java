


class c9350616 {
public MyHelperClass setContentView(MyHelperClass o0){ return null; }
public MyHelperClass layout;

//    @Override
    public void onCreate(Bundle savedInstanceState) {
        this.onCreate(savedInstanceState);
        setContentView(layout.listview);
        MyHelperClass SERVICE_URI = new MyHelperClass();
        HttpGet request = new HttpGet(SERVICE_URI + "/json/getallpersons");
        request.setHeader("Accept", "application/json");
        request.setHeader("Content-type", "application/json");
        DefaultHttpClient httpClient = new DefaultHttpClient();
        String theString = new String("");
        try {
            HttpResponse response =(HttpResponse)(Object) httpClient.execute(request);
            HttpEntity responseEntity =(HttpEntity)(Object) response.getEntity();
            InputStream stream =(InputStream)(Object) responseEntity.getContent();
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
            StringBuilder builder = new StringBuilder();
            String line;
            while ((line =(String)(Object) reader.readLine()) != null) {
                builder.append(line);
            }
            stream.close();
            theString = builder.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        MyHelperClass Toast = new MyHelperClass();
        Toast.makeText(this, theString + "\n", Toast.LENGTH_LONG).show();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass listview;
	public MyHelperClass LENGTH_LONG;
public MyHelperClass show(){ return null; }
	public MyHelperClass makeText(c9350616 o0, String o1, MyHelperClass o2){ return null; }}

class Bundle {

}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class DefaultHttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}
