
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c2878646 {
public MyHelperClass testMessage;
public MyHelperClass assertTrue(String o0, boolean o1){ return null; }

//    @Test
    public void testRoundTrip() {
        try {
            URL url = new URL("http://localhost:8192/OMFHTTPJMSRoundtripService/");
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            MyHelperClass testMessageHeader = new MyHelperClass();
            wr.write((int)(Object)testMessageHeader + (int)(Object)testMessage);
            wr.flush();
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line =(String)(Object) rd.readLine()) != null) {
                MyHelperClass logger = new MyHelperClass();
                logger.debug("Line: " + line);
            }
            wr.close();
            rd.close();
        } catch (UncheckedIOException e1) {
            e1.printStackTrace();
        } catch (ArithmeticException e1) {
            e1.printStackTrace();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("InterruptedException caught trying to sleep test: " + e.getMessage());
        }
        boolean messageReceived = false;
        MyHelperClass testJMSListener = new MyHelperClass();
        ArrayList messages =(ArrayList)(Object) testJMSListener.getReceivedMessages();
        for (Iterator iterator =(Iterator)(Object) messages.iterator();(boolean)(Object) iterator.hasNext(); ) {
            String string = (String)(String)(Object) iterator.next();
            MyHelperClass logger = new MyHelperClass();
            logger.debug("String received: " + string);
            MyHelperClass testMessage = new MyHelperClass();
            if (testMessage.equals(string)) messageReceived = true;
        }
        assertTrue("Message should have been received", messageReceived);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getReceivedMessages(){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class Test {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ArrayList {

public MyHelperClass iterator(){ return null; }}

class Iterator {

public MyHelperClass next(){ return null; }
	public MyHelperClass hasNext(){ return null; }}
