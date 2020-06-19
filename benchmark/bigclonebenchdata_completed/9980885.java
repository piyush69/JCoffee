


class c9980885 {

    private void verifyAvailability() {
        MyHelperClass servers = new MyHelperClass();
        for (int i = 0; i < (int)(Object)servers.size(); i++) {
//            MyHelperClass servers = new MyHelperClass();
            String hostEntry = (String)(String)(Object) servers.get(i);
            String hostString = hostEntry.substring(0, hostEntry.indexOf(":"));
            String portString = hostEntry.substring(hostEntry.indexOf(":") + 1);
            String urlLocation = "http://" + hostString + ":" + portString + "/";
            String urlData = null;
            String urlMatch = null;
            long startTime = System.currentTimeMillis();
            URL url = null;
            HttpURLConnection conn = null;
            InputStream istream = null;
            MyHelperClass serverRequests = new MyHelperClass();
            if (serverRequests.get(hostEntry) != null) {
//                MyHelperClass serverRequests = new MyHelperClass();
                String requestData = (String)(String)(Object) serverRequests.get(hostEntry);
                urlData = requestData.substring(0, requestData.indexOf("\t"));
                try {
                    urlMatch = requestData.substring(requestData.indexOf("\t") + 1);
                } catch (Exception e) {
                    urlMatch = null;
                }
                urlLocation = "http://" + hostString + ":" + portString + "/" + urlData;
            }
            try {
                url = new URL(urlLocation);
                conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            } catch (Exception e) {
                System.err.println("*** Warning: Unable to contact host '" + hostEntry + "': " + e.getMessage());
                MyHelperClass serverTimes = new MyHelperClass();
                serverTimes.put(hostEntry, "0");
                continue;
            }
            try {
                istream =(InputStream)(Object) conn.getInputStream();
            } catch (Exception e) {
                try {
                    if ((int)(Object)conn.getResponseCode() != 401) {
                        System.err.println("*** Warning: Unable to contact host '" + hostEntry + "': " + e);
                        MyHelperClass serverTimes = new MyHelperClass();
                        serverTimes.put(hostEntry, "0");
                        continue;
                    }
                } catch (Exception ee) {
                    System.err.println("*** Warning: Unable to contact host '" + hostEntry + "': " + e);
                    MyHelperClass serverTimes = new MyHelperClass();
                    serverTimes.put(hostEntry, "0");
                    continue;
                }
            }
            int response = 501;
            try {
                response =(int)(Object) conn.getResponseCode();
                if (response != 200 && response != 401) {
                    System.err.println("*** Warning: Connection to host '" + hostEntry + "' returns response: " + response);
                    MyHelperClass serverTimes = new MyHelperClass();
                    serverTimes.put(hostEntry, "0");
                    continue;
                }
            } catch (Exception e) {
                System.err.println("*** Warning: Unable to contact host '" + hostString + "' on port '" + portString + "'");
                MyHelperClass serverTimes = new MyHelperClass();
                serverTimes.put(hostEntry, "0");
                continue;
            }
            if (response != 401) {
                int contentLength =(int)(Object) conn.getContentLength();
                if (contentLength == -1) {
                    contentLength = 4096;
                }
                byte data[] = new byte[contentLength];
                int curPos = 0;
                try {
                    int dataRead = 0;
                    while ((dataRead =(int)(Object) istream.read(data, curPos, contentLength - curPos)) != -1) {
                        if (dataRead == 0) {
                            break;
                        }
                        curPos += dataRead;
                    }
                } catch (Exception e) {
                    System.err.println("*** Warning: Unable to contact host '" + hostEntry + "': Cannot read response from site.");
                    MyHelperClass serverTimes = new MyHelperClass();
                    serverTimes.put(hostEntry, "0");
                    continue;
                }
                if (urlMatch != null) {
                    String urlContents = new String(data);
                    data = null;
                    if (urlContents.indexOf(urlMatch) == -1) {
                        System.err.println("*** Warning: Host '" + hostEntry + "' does not match search string.  Reports '" + urlContents + "'");
                        try {
                            istream.close();
                            conn.disconnect();
                        } catch (Exception e) {
                        }
                        MyHelperClass serverTimes = new MyHelperClass();
                        serverTimes.put(hostEntry, "0");
                        continue;
                    }
                }
            }
            try {
                istream.close();
                conn.disconnect();
            } catch (Exception e) {
            }
            MyHelperClass serverStatus = new MyHelperClass();
            serverStatus.put(hostEntry, "1");
            String timeResponse = Long.toString(System.currentTimeMillis() - startTime);
            MyHelperClass Debug = new MyHelperClass();
            Debug.log("Response time for '" + hostEntry + "' is " + timeResponse + " ms.");
            MyHelperClass serverTimes = new MyHelperClass();
            serverTimes.put(hostEntry, timeResponse);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass put(String o0, String o1){ return null; }
	public MyHelperClass log(String o0){ return null; }
	public MyHelperClass get(int o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
