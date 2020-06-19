import java.io.*;
import java.lang.*;
import java.util.*;



class c20365090 {
public MyHelperClass Names;
	public MyHelperClass syncFetch(MyHelperClass o0){ return null; }

        public HttpResponseExchange execute() throws Exception {
            HttpResponseExchange forwardResponse = null;
            MyHelperClass Config = new MyHelperClass();
            int fetchSizeLimit =(int)(Object) Config.getInstance().getFetchLimitSize();
            MyHelperClass lastContentRange = new MyHelperClass();
            while (null != lastContentRange) {
                MyHelperClass forwardRequest = new MyHelperClass();
                forwardRequest.setBody(new byte[0]);
//                MyHelperClass lastContentRange = new MyHelperClass();
                ContentRangeHeaderValue old =(ContentRangeHeaderValue)(Object) lastContentRange;
                long sendSize = fetchSizeLimit;
                if ((int)(Object)old.getInstanceLength() - (int)(Object)old.getLastBytePos() - 1 < fetchSizeLimit) {
                    sendSize = ((int)(Object)old.getInstanceLength() - (int)(Object)old.getLastBytePos() - 1);
                }
                if (sendSize <= 0) {
                    break;
                }
//                MyHelperClass lastContentRange = new MyHelperClass();
                lastContentRange =(MyHelperClass)(Object) new ContentRangeHeaderValue((int)(Object)old.getLastBytePos() + 1,(long)(Object) old.getLastBytePos() + sendSize, old.getInstanceLength());
                forwardRequest.setHeader(Names.CONTENT_RANGE, lastContentRange);
                forwardRequest.setHeader(Names.CONTENT_LENGTH, String.valueOf(sendSize));
//                MyHelperClass forwardRequest = new MyHelperClass();
                forwardResponse =(HttpResponseExchange)(Object) syncFetch(forwardRequest);
                if (sendSize < fetchSizeLimit) {
//                    MyHelperClass lastContentRange = new MyHelperClass();
                    lastContentRange = null;
                }
            }
            return forwardResponse;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CONTENT_RANGE;
	public MyHelperClass CONTENT_LENGTH;
public MyHelperClass setHeader(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass setHeader(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getFetchLimitSize(){ return null; }
	public MyHelperClass setBody(byte[] o0){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class HttpResponseExchange {

}

class ContentRangeHeaderValue {

ContentRangeHeaderValue(){}
	ContentRangeHeaderValue(int o0, long o1, MyHelperClass o2){}
	public MyHelperClass getInstanceLength(){ return null; }
	public MyHelperClass getLastBytePos(){ return null; }}
