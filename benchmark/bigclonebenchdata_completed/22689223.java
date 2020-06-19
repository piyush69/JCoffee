


class c22689223 {
public MyHelperClass OS;

//        @Override
        public void testAction(ITestThread testThread) throws Throwable {
            try {
                final InputStream urlIn =(InputStream)(Object) (new URL("http://jdistunit.sourceforge.net").openStream());
                final int availableBytes =(int)(Object) urlIn.available();
                if (0 == availableBytes) {
                    throw new IllegalStateException("Zero bytes on target host.");
                }
                BufferedReader in;// = new BufferedReader();
                in = new BufferedReader(new InputStreamReader(urlIn));
                String line;
//                MyHelperClass in = new MyHelperClass();
                while (null != (line =(String)(Object) in.readLine())) {
                    MyHelperClass page = new MyHelperClass();
                    page.append(line);
//                    MyHelperClass page = new MyHelperClass();
                    page.append('\n');
                    MyHelperClass lineDelay = new MyHelperClass();
                    if (0 != (int)(Object)lineDelay) {
//                        MyHelperClass lineDelay = new MyHelperClass();
                        OS.sleep(lineDelay);
                    }
                    if (null != testThread && (boolean)(Object)testThread.isActionStopped()) {
                        break;
                    }
                }
            } finally {
                MyHelperClass in = new MyHelperClass();
                if (null != in) {
//                    MyHelperClass in = new MyHelperClass();
                    in.close();
//                    MyHelperClass in = new MyHelperClass();
                    in = null;
                }
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass append(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass sleep(MyHelperClass o0){ return null; }
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass append(char o0){ return null; }}

class ITestThread {

public MyHelperClass isActionStopped(){ return null; }}

class InputStream {

public MyHelperClass available(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0){}}
