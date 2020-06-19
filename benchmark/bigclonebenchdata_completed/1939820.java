


class c1939820 {

    public void GetText(TextView content, String address) {
        String url = address;
        HttpClient client =(HttpClient)(Object) new DefaultHttpClient();
        HttpGet request = new HttpGet(url);
        try {
            HttpResponse response =(HttpResponse)(Object) client.execute(request);
            MyHelperClass TextHelper = new MyHelperClass();
            content.setText((String)(Object)TextHelper.GetText(response));
        } catch (Exception ex) {
            content.setText("Welcome to Fluo. Failed to connect to intro server.");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass GetText(HttpResponse o0){ return null; }}

class TextView {

public MyHelperClass setText(String o0){ return null; }}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

}
