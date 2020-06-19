


class c17977185 {
public MyHelperClass seleccion;

    private String getServerData(String returnString) {
        InputStream is = null;
        String result = "";
        ArrayList nameValuePairs = new ArrayList();
        MyHelperClass Login = new MyHelperClass();
        nameValuePairs.add(new BasicNameValuePair("usuario", Login.usuario));
        MyHelperClass amigoABorrar = new MyHelperClass();
        nameValuePairs.add(new BasicNameValuePair("amigoABorrar", amigoABorrar.trim()));
        nameValuePairs.add(new BasicNameValuePair("grupo", seleccion.trim()));
        try {
            HttpClient httpclient =(HttpClient)(Object) new DefaultHttpClient();
            HttpPost httppost = new HttpPost(returnString);
            httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
            HttpResponse response =(HttpResponse)(Object) httpclient.execute(httppost);
            HttpEntity entity =(HttpEntity)(Object) response.getEntity();
            is =(InputStream)(Object) entity.getContent();
        } catch (Exception e) {
            MyHelperClass Log = new MyHelperClass();
            Log.e("AmigosPorGrupo", "Error en la conexion http " + e.toString());
        }
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(is, "iso-8859-1"), 8);
            String line =(String)(Object) reader.readLine();
            is.close();
            result = line.trim().toString();
            MyHelperClass Log = new MyHelperClass();
            Log.d("AmigosPorGrupo", "Longitud line: " + line.trim().length());
        } catch (Exception e) {
            MyHelperClass Log = new MyHelperClass();
            Log.e("AmigosPorGrupo", "Error converting result " + e.toString());
        }
        MyHelperClass Log = new MyHelperClass();
        Log.d("AmigosPorGrupo", "Funciono json" + result);
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass usuario;
public MyHelperClass trim(){ return null; }
	public MyHelperClass e(String o0, String o1){ return null; }
	public MyHelperClass d(String o0, String o1){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class ArrayList {

public MyHelperClass add(BasicNameValuePair o0){ return null; }}

class NameValuePair {

}

class BasicNameValuePair {

BasicNameValuePair(){}
	BasicNameValuePair(String o0, MyHelperClass o1){}}

class HttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class DefaultHttpClient {

}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass setEntity(UrlEncodedFormEntity o0){ return null; }}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(ArrayList o0){}
	UrlEncodedFormEntity(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class BufferedReader {

BufferedReader(InputStreamReader o0, int o1){}
	BufferedReader(){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0, String o1){}}
