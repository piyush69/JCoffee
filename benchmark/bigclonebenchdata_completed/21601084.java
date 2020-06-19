import java.io.*;
import java.lang.*;
import java.util.*;



class c21601084 {

    public static void main(String[] args) throws Exception {
        HttpClient httpclient =(HttpClient)(Object) new DefaultHttpClient();
        InputStream is = CheckAvailability.class.getResourceAsStream("/isbns.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String isbn = null;
        HttpGet get = null;
        while ((isbn = br.readLine().split(" ")[0]) != null) {
            MyHelperClass isbnSearchUrl = new MyHelperClass();
            System.out.println("Target url: \n\t" + String.format((String)(Object)isbnSearchUrl, isbn));
//            MyHelperClass isbnSearchUrl = new MyHelperClass();
            get = new HttpGet(String.format((String)(Object)isbnSearchUrl, isbn));
            HttpResponse resp =(HttpResponse)(Object) httpclient.execute(get);
            Scanner s = new Scanner((Readable)(Object)resp.getEntity().getContent());
            String pattern = s.findWithinHorizon("((\\d*) hold[s]? on first copy returned of (\\d*) )?[cC]opies", 0);
            if (pattern != null) {
                MatchResult match =(MatchResult)(Object) s.match();
                if ((int)(Object)match.groupCount() == 3) {
                    if (match.group(2) == null) {
                        System.out.println(isbn + ": copies available");
                    } else {
                        System.out.println(isbn + ": " + match.group(2) + " holds on " + match.group(3) + " copies");
                    }
                }
            } else {
                System.out.println(isbn + ": no match");
            }
            get.abort();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getContent(){ return null; }}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

}

class CheckAvailability {

}

class HttpGet {

HttpGet(){}
	HttpGet(String o0){}
	public MyHelperClass abort(){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class MatchResult {

public MyHelperClass groupCount(){ return null; }
	public MyHelperClass group(int o0){ return null; }}
