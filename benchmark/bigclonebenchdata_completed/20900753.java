


class c20900753 {

    public boolean isServerAlive(String pStrURL) {
        boolean isAlive;
        long t1 = System.currentTimeMillis();
        try {
            URL url = new URL(pStrURL);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine;
            while ((inputLine =(String)(Object) in.readLine()) != null) {
                MyHelperClass logger = new MyHelperClass();
                logger.fine(inputLine);
            }
            MyHelperClass logger = new MyHelperClass();
            logger.info("**  Connection successful..  **");
            in.close();
            isAlive = true;
        } catch (Exception e) {
            MyHelperClass logger = new MyHelperClass();
            logger.info("**  Connection failed..  **");
            e.printStackTrace();
            isAlive = false;
        }
        long t2 = System.currentTimeMillis();
        MyHelperClass logger = new MyHelperClass();
        logger.info("Time taken to check connection: " + (t2 - t1) + " ms.");
        return isAlive;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass fine(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }}

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
