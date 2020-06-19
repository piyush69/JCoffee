


class c18356796 {
public static MyHelperClass getDataFromURL(HttpURLConnection o0){ return null; }
//public MyHelperClass getDataFromURL(HttpURLConnection o0){ return null; }

    public static String getURLData(String stringUrl, boolean secure) throws Exception {
        URL url = new URL(stringUrl);
        HttpURLConnection httpURLConnection;
        if (secure) {
            httpURLConnection =(HttpURLConnection)(Object) (HttpsURLConnection)(HttpsURLConnection)(Object) url.openConnection();
        } else {
            httpURLConnection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        }
        return(String)(Object) getDataFromURL(httpURLConnection);
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

}

class HttpsURLConnection {

}
