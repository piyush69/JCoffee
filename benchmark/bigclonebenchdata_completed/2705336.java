


class c2705336 {

    private static boolean verifyAppId(String appid) {
        try {
            String urlstr = "http://" + appid + ".appspot.com";
            URL url = new URL(urlstr);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuffer buf = new StringBuffer();
            String line;
            while ((line =(String)(Object) reader.readLine()) != null) {
                buf.append(line);
            }
            reader.close();
            return buf.toString().contains("snova");
        } catch (Exception e) {
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
