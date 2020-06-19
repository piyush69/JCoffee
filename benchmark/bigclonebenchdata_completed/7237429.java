


class c7237429 {
public MyHelperClass fireProgressEvent(ProgressEvent o0){ return null; }
public MyHelperClass logger;
	public MyHelperClass readFirstLine(InputStreamReader o0){ return null; }
	public MyHelperClass readData(InputStreamReader o0){ return null; }
	public MyHelperClass readHeaderLines(InputStreamReader o0){ return null; }

    public void readContents() throws IOException {
        MyHelperClass ProgressEvent = new MyHelperClass();
        fireProgressEvent(new ProgressEvent(this, ProgressEvent.PROGRESS_START, 0.0f, "loading file"));
        MyHelperClass url = new MyHelperClass();
        URLConnection conn =(URLConnection)(Object) url.openConnection();
        conn.connect();
        MyHelperClass filesize = new MyHelperClass();
        filesize = conn.getContentLength();
//        MyHelperClass filesize = new MyHelperClass();
        logger.finest("filesize: " + filesize);
        InputStreamReader in = new InputStreamReader(conn.getInputStream());
        readFirstLine(in);
        readHeaderLines(in);
        readData(in);
//        MyHelperClass ProgressEvent = new MyHelperClass();
        fireProgressEvent(new ProgressEvent(this, ProgressEvent.PROGRESS_FINISH, 1.0f, "loading file"));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PROGRESS_FINISH;
	public MyHelperClass PROGRESS_START;
public MyHelperClass openConnection(){ return null; }
	public MyHelperClass finest(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ProgressEvent {

ProgressEvent(){}
	ProgressEvent(c7237429 o0, MyHelperClass o1, float o2, String o3){}}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
