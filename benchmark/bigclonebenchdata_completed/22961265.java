


class c22961265 {

    public static String readFromURL(String sURL) {
        MyHelperClass logger = new MyHelperClass();
        logger.info("com.rooster.utils.URLReader.readFromURL - Entry");
        String sWebPage = "";
        try {
            URL url = new URL(sURL);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine = "";
            while ((inputLine =(String)(Object) in.readLine()) != null) {
                sWebPage += inputLine;
            }
            in.close();
        } catch (Exception e) {
//            MyHelperClass logger = new MyHelperClass();
            logger.debug("com.rooster.utils.URLReader.readFromURL - Error" + e);
        }
//        MyHelperClass logger = new MyHelperClass();
        logger.info("com.rooster.utils.URLReader.readFromURL - Exit");
        return sWebPage;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

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
