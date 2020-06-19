


class c6147388 {

    public static GCalendar getNewestCalendar(Calendar startDate) throws IOException {
        GCalendar hoge = null;
        try {
            HttpClient httpclient =(HttpClient)(Object) new DefaultHttpClient();
            HttpClient http =(HttpClient)(Object) new DefaultHttpClient();
            HttpGet method = new HttpGet("http://localhost:8080/GoogleCalendar/select");
            HttpResponse response =(HttpResponse)(Object) http.execute(method);
            String jsonstr = response.getEntity().toString();
            System.out.println("jsonstr = " + jsonstr);
            MyHelperClass JSON = new MyHelperClass();
            hoge =(GCalendar)(Object) JSON.decode(jsonstr, GCalendar.class);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return hoge;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass decode(String o0, Class<GCalendar> o1){ return null; }}

class Calendar {

}

class GCalendar {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}
