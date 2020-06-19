


class c3210076 {
public MyHelperClass OS;

    private void readHomePage(ITestThread testThread) throws IOException {
        if (null == testThread) {
            throw new IllegalArgumentException("Test thread may not be null.");
        }
        MyHelperClass testUrl = new MyHelperClass();
        final InputStream urlIn =(InputStream)(Object) (new URL(testUrl).openStream());
        final int availableBytes =(int)(Object) urlIn.available();
        if (0 == availableBytes) {
            throw new IllegalStateException("Zero bytes on target host.");
        }
        BufferedReader in;// = new BufferedReader();
        in = new BufferedReader(new InputStreamReader(urlIn));
        String line;
//        MyHelperClass in = new MyHelperClass();
        while (null != in && null != (line =(String)(Object) in.readLine())) {
            MyHelperClass page = new MyHelperClass();
            page.append(line);
//            MyHelperClass page = new MyHelperClass();
            page.append('\n');
            MyHelperClass lineDelay = new MyHelperClass();
            if (0 != (int)(Object)lineDelay) {
//                MyHelperClass lineDelay = new MyHelperClass();
                OS.sleep(lineDelay);
            }
            if ((boolean)(Object)testThread.isActionStopped()) {
                break;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass append(char o0){ return null; }
	public MyHelperClass append(String o0){ return null; }
	public MyHelperClass sleep(MyHelperClass o0){ return null; }
	public MyHelperClass readLine(){ return null; }}

class ITestThread {

public MyHelperClass isActionStopped(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass available(){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0){}}
