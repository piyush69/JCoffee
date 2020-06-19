


class c17190231 {

    public static void call(String host, String port, String method, String[] params) {
        MyHelperClass cat = new MyHelperClass();
        cat.debug("call (host:" + host + " port:" + port + " method:" + method);
        try {
            String message = null;
            StringBuffer bufMessage = new StringBuffer();
            bufMessage.append("<?xml version='1.0' encoding='ISO-8859-1'?>");
            bufMessage.append("<methodCall>");
            bufMessage.append("<methodName>");
            bufMessage.append(method);
            bufMessage.append("</methodName>");
            bufMessage.append("<params>");
            if (params != null && params.length > 0) {
                for (int i = 0; i < params.length; i++) {
                    bufMessage.append("<param><value><![CDATA[" + params[i] + "]]></value></param>");
                }
            }
            bufMessage.append("</params></methodCall>");
            message = bufMessage.toString();
            bufMessage = null;
            String stringUrl = "http://" + host + ":" + port + "/RPC2";
//            MyHelperClass cat = new MyHelperClass();
            cat.debug("Sending message to: " + stringUrl + "\n" + message);
            URL url = new URL(stringUrl);
            URLConnection urlConnection =(URLConnection)(Object) url.openConnection();
            urlConnection.setDoOutput(true);
            urlConnection.getOutputStream().write(message.getBytes());
            urlConnection.getOutputStream().flush();
            urlConnection.getOutputStream().close();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;
            while ((line =(String)(Object) bufferedReader.readLine()) != null) {
//                MyHelperClass cat = new MyHelperClass();
                cat.debug("#server# " + line);
            }
            bufferedReader.close();
        } catch (Exception e) {
//            MyHelperClass cat = new MyHelperClass();
            cat.debug("Unable to send link to Gnowsis!", e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass debug(String o0, Exception o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
