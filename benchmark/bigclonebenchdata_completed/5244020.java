


class c5244020 {

    public static AddUserResponse napiUserAdd(String user, String pass, String email) throws TimeoutException, InterruptedException, IOException {
        if (user.matches("^[a-zA-Z0-9]{2,20}$") == false) {
            MyHelperClass AddUserResponse = new MyHelperClass();
            return(AddUserResponse)(Object) AddUserResponse.NAPI_ADD_USER_BAD_LOGIN;
        }
        if (pass.equals("")) {
            MyHelperClass AddUserResponse = new MyHelperClass();
            return(AddUserResponse)(Object) AddUserResponse.NAPI_ADD_USER_BAD_PASS;
        }
        if (email.matches("^[a-zA-Z0-9\\-\\_]{1,30}@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)+$") == false) {
            MyHelperClass AddUserResponse = new MyHelperClass();
            return(AddUserResponse)(Object) AddUserResponse.NAPI_ADD_USER_BAD_EMAIL;
        }
        URLConnection conn = null;
        ClientHttpRequest httpPost = null;
        InputStreamReader responseStream = null;
        URL url = new URL("http://www.napiprojekt.pl/users_add.php");
        MyHelperClass Global = new MyHelperClass();
        conn =(URLConnection)(Object) url.openConnection(Global.getProxy());
        httpPost = new ClientHttpRequest(conn);
        httpPost.setParameter("login", user);
        httpPost.setParameter("haslo", pass);
        httpPost.setParameter("mail", email);
        httpPost.setParameter("z_programu", "true");
        responseStream = new InputStreamReader(httpPost.post(), "Cp1250");
        BufferedReader responseReader = new BufferedReader(responseStream);
        String response =(String)(Object) responseReader.readLine();
        if (response.indexOf("login już istnieje") != -1) {
            MyHelperClass AddUserResponse = new MyHelperClass();
            return(AddUserResponse)(Object) AddUserResponse.NAPI_ADD_USER_LOGIN_EXISTS;
        }
        if (response.indexOf("na podany e-mail") != -1) {
            MyHelperClass AddUserResponse = new MyHelperClass();
            return(AddUserResponse)(Object) AddUserResponse.NAPI_ADD_USER_EMAIL_EXISTS;
        }
        if (response.indexOf("NPc0") == 0) {
            MyHelperClass AddUserResponse = new MyHelperClass();
            return(AddUserResponse)(Object) AddUserResponse.NAPI_ADD_USER_OK;
        }
        MyHelperClass AddUserResponse = new MyHelperClass();
        return(AddUserResponse)(Object) AddUserResponse.NAPI_ADD_USER_BAD_UNKNOWN;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NAPI_ADD_USER_OK;
	public MyHelperClass NAPI_ADD_USER_BAD_LOGIN;
	public MyHelperClass NAPI_ADD_USER_BAD_PASS;
	public MyHelperClass NAPI_ADD_USER_BAD_EMAIL;
	public MyHelperClass NAPI_ADD_USER_BAD_UNKNOWN;
	public MyHelperClass NAPI_ADD_USER_EMAIL_EXISTS;
	public MyHelperClass NAPI_ADD_USER_LOGIN_EXISTS;
public MyHelperClass getProxy(){ return null; }}

class AddUserResponse {

}

class TimeoutException extends Exception{
	public TimeoutException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

}

class ClientHttpRequest {

ClientHttpRequest(){}
	ClientHttpRequest(URLConnection o0){}
	public MyHelperClass setParameter(String o0, String o1){ return null; }
	public MyHelperClass post(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(MyHelperClass o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}
