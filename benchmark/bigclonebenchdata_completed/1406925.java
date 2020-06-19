
import java.io.UncheckedIOException;


class c1406925 {

    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.out.println("Usage: <target URI> <no of requests>");
            System.exit(-1);
        }
        URI targetURI = new URI(args[0]);
        int n = Integer.parseInt(args[1]);
        URL url =(URL)(Object) targetURI.toURL();
        byte[] buffer = new byte[4096];
        long startTime;
        long finishTime;
        int successCount = 0;
        int failureCount = 0;
        String serverName = "unknown";
        long total = 0;
        long contentLen = 0;
        long totalContentLen = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            HttpURLConnection c = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            c.connect();
            InputStream instream =(InputStream)(Object) c.getInputStream();
            try {
                contentLen = 0;
                if (instream != null) {
                    int l = 0;
                    while ((l =(int)(Object) instream.read(buffer)) != -1) {
                        total += l;
                        contentLen += l;
                    }
                }
                if ((int)(Object)c.getResponseCode() == 200) {
                    successCount++;
                } else {
                    failureCount++;
                }
                totalContentLen += contentLen;
            } catch (UncheckedIOException ex) {
                failureCount++;
            }
            String s =(String)(Object) c.getHeaderField("Server");
            if (s != null) {
                serverName = s;
            }
        }
        finishTime = System.currentTimeMillis();
        float totalTimeSec = (float) (finishTime - startTime) / 1000;
        float reqsPerSec = (float) successCount / totalTimeSec;
        float timePerReqMs = (float) (finishTime - startTime) / (float) successCount;
        System.out.print("Server Software:\t");
        System.out.println(serverName);
        System.out.println();
        System.out.print("Document URI:\t\t");
        System.out.println(targetURI);
        System.out.print("Document Length:\t");
        System.out.print(contentLen);
        System.out.println(" bytes");
        System.out.println();
        System.out.print("Time taken for tests:\t");
        System.out.print(totalTimeSec);
        System.out.println(" seconds");
        System.out.print("Complete requests:\t");
        System.out.println(successCount);
        System.out.print("Failed requests:\t");
        System.out.println(failureCount);
        System.out.print("Content transferred:\t");
        System.out.print(total);
        System.out.println(" bytes");
        System.out.print("Requests per second:\t");
        System.out.print(reqsPerSec);
        System.out.println(" [#/sec] (mean)");
        System.out.print("Time per request:\t");
        System.out.print(timePerReqMs);
        System.out.println(" [ms] (mean)");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URI {

URI(String o0){}
	URI(){}
	public MyHelperClass toURL(){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getHeaderField(String o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass connect(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
