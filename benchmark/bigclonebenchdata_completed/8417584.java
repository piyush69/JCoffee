


class c8417584 {

    private String getResultFromHttpUrl(String href) {
        String result = null;
        try {
            URL url = new URL(href);
            HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            Object o = conn.getContent();
            MyHelperClass log = new MyHelperClass();
            log.debug("Opened " + href + " and got class " + o.getClass().getName());
            StringBuffer version = new StringBuffer();
            String inputLine;
            DataInputStream dis = new DataInputStream(conn.getInputStream());
            while ((inputLine =(String)(Object) dis.readLine()) != null) {
                version.append(inputLine + "\n");
            }
            result = version.toString();
//            MyHelperClass log = new MyHelperClass();
            log.debug("Read from URL:\n" + result);
            dis.close();
        } catch (Exception e) {
            MyHelperClass log = new MyHelperClass();
            log.debug("Caught exception " + e + " whilst attempting to query URL " + href);
            e.printStackTrace();
        } finally {
            return result;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getContent(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class DataInputStream {

DataInputStream(MyHelperClass o0){}
	DataInputStream(){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}
