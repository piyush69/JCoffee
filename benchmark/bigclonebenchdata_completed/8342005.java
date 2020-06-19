


class c8342005 {
public MyHelperClass msg;
	public MyHelperClass URLEncoder;
	public MyHelperClass to;
	public MyHelperClass password;

//    @Override
    protected String doInBackground(String... params) {
        try {
            MyHelperClass username = new MyHelperClass();
            URL url = new URL("http://www.foamsnet.com/smsapi/send.php?username=" + username + "&password=" + password + "&to=" + to + "&msg=" + URLEncoder.encode(msg));
            URLConnection urlc =(URLConnection)(Object) url.openConnection();
            BufferedReader sin = new BufferedReader(new InputStreamReader(urlc.getInputStream()));
            String inputLine =(String)(Object) sin.readLine();
            inputLine = inputLine == null ? "null" : inputLine;
            sin.close();
            String output;// = new String();
            output = inputLine;
            MyHelperClass logsent = new MyHelperClass();
            if ((boolean)(Object)logsent) {
                MyHelperClass cr = new MyHelperClass();
                ContentResolver contentResolver =(ContentResolver)(Object) cr;
                ContentValues values = new ContentValues();
                values.put("address", "+91" + inputLine.split(" ")[3]);
                MyHelperClass msg = new MyHelperClass();
                values.put("body", msg);
                MyHelperClass Uri = new MyHelperClass();
                contentResolver.insert(Uri.parse("content://sms/sent"), values);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(MyHelperClass o0){ return null; }
	public MyHelperClass parse(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class ContentResolver {

public MyHelperClass insert(MyHelperClass o0, ContentValues o1){ return null; }}

class ContentValues {

public MyHelperClass put(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass put(String o0, String o1){ return null; }}
