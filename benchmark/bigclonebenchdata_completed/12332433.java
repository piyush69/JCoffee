


class c12332433 {

//    @Override
    public String getLatestApplicationVersion() {
        String latestVersion = null;
        String latestVersionInfoURL = "http://movie-browser.googlecode.com/svn/site/latest";
        MyHelperClass LOGGER = new MyHelperClass();
        LOGGER.info("Checking latest version info from: " + latestVersionInfoURL);
        BufferedReader in = null;
        try {
//            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.info("Fetcing latest version info from: " + latestVersionInfoURL);
            URL url = new URL(latestVersionInfoURL);
            in = new BufferedReader(new InputStreamReader(url.openStream()));
            String str;
            while ((str =(String)(Object) in.readLine()) != null) {
                latestVersion = str;
            }
        } catch (Exception ex) {
//            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.error("Error fetching latest version info from: " + latestVersionInfoURL, ex);
        } finally {
            try {
                in.close();
            } catch (Exception ex) {
//                MyHelperClass LOGGER = new MyHelperClass();
                LOGGER.error("Could not close inputstream", ex);
            }
        }
        return latestVersion;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass info(String o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
