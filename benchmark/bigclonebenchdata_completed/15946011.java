


class c15946011 {
public MyHelperClass LOGGER;

    public long calculateResponseTime(Proxy proxy) {
        try {
            MyHelperClass RESPONSE_TEST_URL = new MyHelperClass();
            LOGGER.debug("Test network response time for " + RESPONSE_TEST_URL);
            MyHelperClass REACH_TEST_URL = new MyHelperClass();
            URL urlForTest = new URL(REACH_TEST_URL);
            URLConnection testConnection =(URLConnection)(Object) urlForTest.openConnection(proxy);
            long startTime = System.currentTimeMillis();
            testConnection.connect();
            testConnection.connect();
            testConnection.connect();
            testConnection.connect();
            testConnection.connect();
            long endTime = System.currentTimeMillis();
            long averageResponseTime = (endTime - startTime) / 5;
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.debug("Average access time in ms : " + averageResponseTime);
            return averageResponseTime;
        } catch (Exception e) {
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.error(e);
        }
        return -1;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(Exception o0){ return null; }}

class Proxy {

}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(Proxy o0){ return null; }}

class URLConnection {

public MyHelperClass connect(){ return null; }}
