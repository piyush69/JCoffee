
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c17203112 {
public MyHelperClass SystemClock;
	public MyHelperClass mTxManager;
	public MyHelperClass ImpsTags;
	public MyHelperClass Log;

    private void trySend(Primitive p) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            MyHelperClass mSerializer = new MyHelperClass();
            mSerializer.serialize(p, out);
        } catch (UncheckedIOException e) {
            MyHelperClass ImErrorInfo = new MyHelperClass();
            mTxManager.notifyErrorResponse(p.getTransactionID(), ImErrorInfo.SERIALIZER_ERROR, "Internal serializer error, primitive: " + p.getType());
            out.close();
            return;
        }
        MyHelperClass mPostUri = new MyHelperClass();
        HttpPost req = new HttpPost(mPostUri);
        MyHelperClass mContentTypeHeader = new MyHelperClass();
        req.addHeader(mContentTypeHeader);
        MyHelperClass mMsisdnHeader = new MyHelperClass();
        if (mMsisdnHeader != null) {
//            MyHelperClass mMsisdnHeader = new MyHelperClass();
            req.addHeader(mMsisdnHeader);
        }
        ByteArrayEntity entity = new ByteArrayEntity(out.toByteArray());
        req.setEntity(entity);
        MyHelperClass mLastActive = new MyHelperClass();
        mLastActive = SystemClock.elapsedRealtime();
        MyHelperClass ImpsLog = new MyHelperClass();
        if ((boolean)(Object)Log.isLoggable(ImpsLog.TAG, Log.DEBUG)) {
            long sendBytes =(int)(Object) entity.getContentLength() + 176;
            MyHelperClass mConnection = new MyHelperClass();
            ImpsLog.log(mConnection.getLoginUserName() + " >> " + p.getType() + " HTTP payload approx. " + sendBytes + " bytes");
        }
//        MyHelperClass ImpsLog = new MyHelperClass();
        if ((boolean)(Object)Log.isLoggable(ImpsLog.PACKET_TAG, Log.DEBUG)) {
//            MyHelperClass ImpsLog = new MyHelperClass();
            ImpsLog.dumpRawPacket((byte[])(Object)out.toByteArray());
//            MyHelperClass ImpsLog = new MyHelperClass();
            ImpsLog.dumpPrimitive(p);
        }
        MyHelperClass mHttpClient = new MyHelperClass();
        HttpResponse res =(HttpResponse)(Object) mHttpClient.execute(req);
        StatusLine statusLine =(StatusLine)(Object) res.getStatusLine();
        HttpEntity resEntity =(HttpEntity)(Object) res.getEntity();
        InputStream in =(InputStream)(Object) resEntity.getContent();
//        MyHelperClass ImpsLog = new MyHelperClass();
        if ((boolean)(Object)Log.isLoggable(ImpsLog.PACKET_TAG, Log.DEBUG)) {
//            MyHelperClass ImpsLog = new MyHelperClass();
            Log.d(ImpsLog.PACKET_TAG, statusLine.toString());
            Header[] headers =(Header[])(Object) res.getAllHeaders();
            for (Header h : headers) {
//                MyHelperClass ImpsLog = new MyHelperClass();
                Log.d(ImpsLog.PACKET_TAG, h.toString());
            }
            int len = (int)(int)(Object) resEntity.getContentLength();
            if (len > 0) {
                byte[] content = new byte[len];
                int offset = 0;
                int bytesRead = 0;
                do {
                    bytesRead =(int)(Object) in.read(content, offset, len);
                    offset += bytesRead;
                    len -= bytesRead;
                } while (bytesRead > 0);
                in.close();
//                MyHelperClass ImpsLog = new MyHelperClass();
                ImpsLog.dumpRawPacket(content);
                in =(InputStream)(Object) new ByteArrayInputStream(content);
            }
        }
        try {
            MyHelperClass HttpURLConnection = new MyHelperClass();
            if (statusLine.getStatusCode() != HttpURLConnection.HTTP_OK) {
                MyHelperClass mTxManager = new MyHelperClass();
                mTxManager.notifyErrorResponse(p.getTransactionID(), statusLine.getStatusCode(), statusLine.getReasonPhrase());
                return;
            }
            if ((int)(Object)resEntity.getContentLength() == 0) {
                MyHelperClass TransactionMode = new MyHelperClass();
                if ((p.getTransactionMode() != TransactionMode.Response) && !p.getType().equals(ImpsTags.Polling_Request)) {
                    MyHelperClass ImErrorInfo = new MyHelperClass();
                    mTxManager.notifyErrorResponse(p.getTransactionID(), ImErrorInfo.ILLEGAL_SERVER_RESPONSE, "bad response from server");
                }
                return;
            }
            MyHelperClass mParser = new MyHelperClass();
            Primitive response =(Primitive)(Object) mParser.parse(in);
//            MyHelperClass ImpsLog = new MyHelperClass();
            if ((boolean)(Object)Log.isLoggable(ImpsLog.PACKET_TAG, Log.DEBUG)) {
//                MyHelperClass ImpsLog = new MyHelperClass();
                ImpsLog.dumpPrimitive(response);
            }
//            MyHelperClass ImpsLog = new MyHelperClass();
            if ((boolean)(Object)Log.isLoggable(ImpsLog.TAG, Log.DEBUG)) {
                long len = 2 + (int)(Object)resEntity.getContentLength() + statusLine.toString().length() + 2;
                Header[] headers =(Header[])(Object) res.getAllHeaders();
                for (Header header : headers) {
                    len +=(int)(Object) header.getName().length() + (int)(Object)header.getValue().length() + 4;
                }
                MyHelperClass mConnection = new MyHelperClass();
                ImpsLog.log(mConnection.getLoginUserName() + " << " + response.getType() + " HTTP payload approx. " + len + "bytes");
            }
            MyHelperClass mReceiveQueue = new MyHelperClass();
            if (!(Boolean)(Object)mReceiveQueue.offer(response)) {
                MyHelperClass ImErrorInfo = new MyHelperClass();
                mTxManager.notifyErrorResponse(p.getTransactionID(), ImErrorInfo.UNKNOWN_ERROR, "receiving queue full");
            }
        } catch (UncheckedIOException e) {
//            MyHelperClass ImpsLog = new MyHelperClass();
            ImpsLog.logError((ParserException)(Object)e);
            MyHelperClass ImErrorInfo = new MyHelperClass();
            mTxManager.notifyErrorResponse(p.getTransactionID(), ImErrorInfo.PARSER_ERROR, "Parser error, received a bad response from server");
        } finally {
            resEntity.consumeContent();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TAG;
	public MyHelperClass Response;
	public MyHelperClass UNKNOWN_ERROR;
	public MyHelperClass DEBUG;
	public MyHelperClass PACKET_TAG;
	public MyHelperClass HTTP_OK;
	public MyHelperClass ILLEGAL_SERVER_RESPONSE;
	public MyHelperClass SERIALIZER_ERROR;
	public MyHelperClass PARSER_ERROR;
	public MyHelperClass Polling_Request;
public MyHelperClass elapsedRealtime(){ return null; }
	public MyHelperClass serialize(Primitive o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass parse(InputStream o0){ return null; }
	public MyHelperClass dumpRawPacket(byte[] o0){ return null; }
	public MyHelperClass execute(HttpPost o0){ return null; }
	public MyHelperClass isLoggable(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass log(String o0){ return null; }
	public MyHelperClass notifyErrorResponse(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass dumpPrimitive(Primitive o0){ return null; }
	public MyHelperClass logError(ParserException o0){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass notifyErrorResponse(MyHelperClass o0, MyHelperClass o1, String o2){ return null; }
	public MyHelperClass offer(Primitive o0){ return null; }
	public MyHelperClass d(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getLoginUserName(){ return null; }}

class Primitive {

public MyHelperClass getTransactionMode(){ return null; }
	public MyHelperClass getType(){ return null; }
	public MyHelperClass getTransactionID(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ByteArrayOutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass toByteArray(){ return null; }}

class SerializerException extends Exception{
	public SerializerException(String errorMessage) { super(errorMessage); }
}

class HttpPost {

HttpPost(MyHelperClass o0){}
	HttpPost(){}
	public MyHelperClass addHeader(MyHelperClass o0){ return null; }
	public MyHelperClass setEntity(ByteArrayEntity o0){ return null; }}

class ByteArrayEntity {

ByteArrayEntity(MyHelperClass o0){}
	ByteArrayEntity(){}
	public MyHelperClass getContentLength(){ return null; }}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getAllHeaders(){ return null; }}

class StatusLine {

public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass getReasonPhrase(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }
	public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass consumeContent(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class Header {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getValue(){ return null; }}

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(byte[] o0){}}

class ParserException extends Exception{
	public ParserException(String errorMessage) { super(errorMessage); }
}
