import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12477499 {
public MyHelperClass mAppName;
	public MyHelperClass Tag;
	public MyHelperClass TAG;
public MyHelperClass mResolver;
	public MyHelperClass Log;
	public MyHelperClass Stats;

    public HttpResponse executeWithoutRewriting(HttpUriRequest request, HttpContext context) throws Throwable, IOException {
        int code = -1;
        MyHelperClass SystemClock = new MyHelperClass();
        long start =(long)(Object) SystemClock.elapsedRealtime();
        try {
            HttpResponse response;
            MyHelperClass mConnectionAllocated = new MyHelperClass();
            mConnectionAllocated.set(null);
            MyHelperClass NetworkStatsEntity = new MyHelperClass();
            if ((boolean)(Object)NetworkStatsEntity.shouldLogNetworkStats()) {
                int uid =(int)(Object) Process.myUid();
                MyHelperClass NetStat = new MyHelperClass();
                long startTx =(long)(Object) NetStat.getUidTxBytes(uid);
//                MyHelperClass NetStat = new MyHelperClass();
                long startRx =(long)(Object) NetStat.getUidRxBytes(uid);
                MyHelperClass mClient = new MyHelperClass();
                response =(HttpResponse)(Object) mClient.execute(request, context);
                HttpEntity origEntity = response == null ? null : response.getEntity();
                if (origEntity != null) {
//                    MyHelperClass SystemClock = new MyHelperClass();
                    long now =(long)(Object) SystemClock.elapsedRealtime();
                    long elapsed = now - start;
                    MyHelperClass mAppName = new MyHelperClass();
                    NetworkStatsEntity entity = new NetworkStatsEntity(origEntity, mAppName, uid, startTx, startRx, elapsed, now);
                    response.setEntity(entity);
                }
            } else {
                MyHelperClass mClient = new MyHelperClass();
                response =(HttpResponse)(Object) mClient.execute(request, context);
            }
            code =(int)(Object) response.getStatusLine().getStatusCode();
            return response;
        } finally {
            try {
//                MyHelperClass SystemClock = new MyHelperClass();
                long elapsed =(long)(Object) SystemClock.elapsedRealtime() - start;
                ContentValues values = new ContentValues();
                values.put(Stats.COUNT, 1);
                values.put(Stats.SUM, elapsed / 1000.0);
                values.put(TAG,(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object) Tag.HTTP_REQUEST + ":" + mAppName);
                mResolver.insert(Stats.CONTENT_URI, values);
                MyHelperClass mConnectionAllocated = new MyHelperClass();
                if (mConnectionAllocated.get() == null && code >= 0) {
                    values.put(TAG,(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object) Tag.HTTP_REUSED + ":" + mAppName);
                    mResolver.insert(Stats.CONTENT_URI, values);
                }
                String status = code < 0 ? "IOException" : Integer.toString(code);
                values.put(TAG,(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object) Tag.HTTP_STATUS + ":" + mAppName + ":" + status);
                mResolver.insert(Stats.CONTENT_URI, values);
            } catch (Exception e) {
                MyHelperClass TAG = new MyHelperClass();
                Log.e(TAG, "Error recording stats", e);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_REQUEST;
	public MyHelperClass SUM;
	public MyHelperClass COUNT;
	public MyHelperClass HTTP_REUSED;
	public MyHelperClass CONTENT_URI;
	public MyHelperClass HTTP_STATUS;
public MyHelperClass getUidTxBytes(int o0){ return null; }
	public MyHelperClass e(MyHelperClass o0, String o1, Exception o2){ return null; }
	public MyHelperClass execute(HttpUriRequest o0, HttpContext o1){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass set(Object o0){ return null; }
	public MyHelperClass elapsedRealtime(){ return null; }
	public MyHelperClass getUidRxBytes(int o0){ return null; }
	public MyHelperClass shouldLogNetworkStats(){ return null; }
	public MyHelperClass get(){ return null; }
	public MyHelperClass insert(MyHelperClass o0, ContentValues o1){ return null; }}

class HttpUriRequest {

}

class HttpContext {

}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }
	public MyHelperClass setEntity(NetworkStatsEntity o0){ return null; }}

class HttpEntity {

}

class NetworkStatsEntity {

NetworkStatsEntity(HttpEntity o0, MyHelperClass o1, int o2, long o3, long o4, long o5, long o6){}
	NetworkStatsEntity(){}}

class ContentValues {

public MyHelperClass put(MyHelperClass o0, int o1){ return null; }
	public MyHelperClass put(MyHelperClass o0, double o1){ return null; }}

class Process {

public static MyHelperClass myUid(){ return null; }}
