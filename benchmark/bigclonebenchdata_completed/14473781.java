
import java.io.UncheckedIOException;


class c14473781 {
public MyHelperClass processAnswer(HttpResponse o0){ return null; }

//        @Override
        protected String doInBackground(Void... params) {
            HttpClient httpClient =(HttpClient)(Object) new DefaultHttpClient();
            HttpContext localContext =(HttpContext)(Object) new BasicHttpContext();
            MyHelperClass urlFormated = new MyHelperClass();
            HttpPost httpPost = new HttpPost(urlFormated);
            try {
                MyHelperClass HttpMultipartMode = new MyHelperClass();
                MultipartEntity entity = new MultipartEntity(HttpMultipartMode.BROWSER_COMPATIBLE);
                MyHelperClass POSTparamList = new MyHelperClass();
                for (int index = 0; index < (int)(Object)POSTparamList.size(); index++) {
//                    MyHelperClass POSTparamList = new MyHelperClass();
                    if ((boolean)(Object)POSTparamList.get(index).getName().equalsIgnoreCase("image")) {
//                        MyHelperClass POSTparamList = new MyHelperClass();
                        entity.addPart(POSTparamList.get(index).getName(),(StringBody)(Object) new FileBody(new File(POSTparamList.get(index).getValue())));
                    } else {
//                        MyHelperClass POSTparamList = new MyHelperClass();
                        entity.addPart(POSTparamList.get(index).getName(), new StringBody(POSTparamList.get(index).getValue()));
                    }
                }
                httpPost.setEntity(entity);
                HttpResponse response =(HttpResponse)(Object) httpClient.execute(httpPost, localContext);
                return(String)(Object) processAnswer(response);
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            }
            return null;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BROWSER_COMPATIBLE;
public MyHelperClass size(){ return null; }
	public MyHelperClass equalsIgnoreCase(String o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass getValue(){ return null; }}

class HttpClient {

public MyHelperClass execute(HttpPost o0, HttpContext o1){ return null; }}

class DefaultHttpClient {

}

class HttpContext {

}

class BasicHttpContext {

}

class HttpPost {

HttpPost(MyHelperClass o0){}
	HttpPost(){}
	public MyHelperClass setEntity(MultipartEntity o0){ return null; }}

class MultipartEntity {

MultipartEntity(MyHelperClass o0){}
	MultipartEntity(){}
	public MyHelperClass addPart(MyHelperClass o0, StringBody o1){ return null; }}

class HttpResponse {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileBody {

FileBody(File o0){}
	FileBody(){}}

class File {

File(MyHelperClass o0){}
	File(){}}

class StringBody {

StringBody(MyHelperClass o0){}
	StringBody(){}}
