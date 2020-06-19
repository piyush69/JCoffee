


class c6790585 {
public MyHelperClass URIUtils;
public MyHelperClass backToMain(){ return null; }

    private void sendToServer(String fichaID, String respostas) throws FileNotFoundException, ParserConfigurationException, SAXException, IOException, URISyntaxException {
        ArrayList params = new ArrayList();
        params.add(new BasicNameValuePair("xml", respostas));
        params.add(new BasicNameValuePair("idForm", fichaID));
        MyHelperClass URLEncodedUtils = new MyHelperClass();
        URI uri =(URI)(Object) URIUtils.createURI("http", "172.20.9.144", 8080, "/PSFServer/SaveAnswers", URLEncodedUtils.format(params, "UTF-8"), null);
        HttpPost request = new HttpPost(uri);
        MyHelperClass HTTP = new MyHelperClass();
        request.setEntity(new UrlEncodedFormEntity(params, HTTP.UTF_8));
        HttpClient client =(HttpClient)(Object) new DefaultHttpClient();
        HttpResponse httpResponse =(HttpResponse)(Object) client.execute(request);
        BufferedReader in = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()));
        StringBuffer sb = new StringBuffer("");
        String line = "";
        String NL = System.getProperty("line.separator");
        while ((line =(String)(Object) in.readLine()) != null) {
            sb.append(line + NL);
        }
        in.close();
        String resposta = sb.toString();
        if (resposta != null || resposta != "") {
            MyHelperClass DatabaseManager = new MyHelperClass();
            new DatabaseManager(this).getWritableDatabase().execSQL("delete from " + DatabaseManager.getTableDados());
        }
        backToMain();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass UTF_8;
public MyHelperClass getContent(){ return null; }
	public MyHelperClass getTableDados(){ return null; }
	public MyHelperClass createURI(String o0, String o1, int o2, String o3, MyHelperClass o4, Object o5){ return null; }
	public MyHelperClass execSQL(String o0){ return null; }
	public MyHelperClass format(ArrayList o0, String o1){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URISyntaxException extends Exception{
	public URISyntaxException(String errorMessage) { super(errorMessage); }
}

class ArrayList {

public MyHelperClass add(BasicNameValuePair o0){ return null; }}

class BasicNameValuePair {

BasicNameValuePair(String o0, String o1){}
	BasicNameValuePair(){}}

class URI {

}

class HttpPost {

HttpPost(URI o0){}
	HttpPost(){}
	public MyHelperClass setEntity(UrlEncodedFormEntity o0){ return null; }}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(ArrayList o0, MyHelperClass o1){}
	UrlEncodedFormEntity(){}}

class HttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class DefaultHttpClient {

}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class DatabaseManager {

DatabaseManager(c6790585 o0){}
	DatabaseManager(){}
	public MyHelperClass getWritableDatabase(){ return null; }}
