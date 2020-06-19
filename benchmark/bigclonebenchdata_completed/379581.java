


class c379581 {
public MyHelperClass[] sSideURLCollection;
//public MyHelperClass sSideURLCollection;
	public MyHelperClass setRequestProperties(URLConnection o0){ return null; }
	public MyHelperClass getLoginLabel(MyHelperClass o0){ return null; }
public MyHelperClass Pattern;
	public MyHelperClass CookieHandler;
	public MyHelperClass sSideURL;
	public MyHelperClass LogedIn;
	public MyHelperClass sLoginURL;
	public MyHelperClass getLoginParams(){ return null; }

    public void login(String UID, String PWD, int CTY) throws Exception {
        MyHelperClass sSideURL = new MyHelperClass();
        sSideURL = sSideURLCollection[CTY];
        String sUID;// = new String();
        sUID = UID;
        String sPWD;// = new String();
        sPWD = PWD;
        int iCTY;// = new int();
        iCTY = CTY;
        MyHelperClass sLoginLabel = new MyHelperClass();
        sLoginLabel = getLoginLabel(sSideURL);
        String sParams =(String)(Object) getLoginParams();
        CookieHandler.setDefault(new ListCookieHandler());
        URL url = new URL((int)(Object)sSideURL + (int)(Object)sLoginURL);
        URLConnection conn =(URLConnection)(Object) url.openConnection();
        setRequestProperties(conn);
        conn.setDoInput(true);
        conn.setDoOutput(true);
        OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
        wr.write(sParams);
        wr.flush();
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder sb = new StringBuilder();
        String line =(String)(Object) rd.readLine();
        while (line != null) {
            sb.append(line + "\n");
            line =(String)(Object) rd.readLine();
        }
        wr.close();
        rd.close();
        String sPage = sb.toString();
        Pattern p =(Pattern)(Object) Pattern.compile(">Dein Penner<");
        Matcher matcher =(Matcher)(Object) p.matcher(sPage);
        LogedIn = matcher.find();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass compile(String o0){ return null; }
	public MyHelperClass setDefault(ListCookieHandler o0){ return null; }}

class ListCookieHandler {

}

class URL {

URL(){}
	URL(int o0){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0){}
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class Pattern {

public MyHelperClass matcher(String o0){ return null; }}

class Matcher {

public MyHelperClass find(){ return null; }}
