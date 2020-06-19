


class c16495170 {

//    @Override
    public HostRecord addressForHost(String domainName) throws Exception {
        MyHelperClass requestUrlStub = new MyHelperClass();
        String fullUrl = requestUrlStub + domainName;
        URL url = new URL(fullUrl);
        HttpURLConnection connection = null;
        connection = null;
        connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setDoOutput(true);
        connection.setReadTimeout(10000);
        connection.connect();
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        HostRecord result = new HostRecord(domainName);
        byte parts[] = new byte[4];
        while ((inputLine =(String)(Object) in.readLine()) != null) {
            String pat1 = "<span class='orange'>";
            String pat2 = "</span>";
            int index1 = inputLine.indexOf(pat1);
            int index2 = inputLine.indexOf(pat2);
            if ((index1 > 0) && (index2 > 0)) {
                String ipStr = inputLine.substring(index1 + pat1.length(), index2);
                String[] s = ipStr.split("\\.");
                for (int i = 0; i < s.length; i++) parts[i] = (byte) Integer.parseInt(s[i]);
            }
        }
        IPAddress ipAddress = new IPAddress(parts);
        result.addIpAddress(ipAddress);
        in.close();
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HostRecord {

HostRecord(String o0){}
	HostRecord(){}
	public MyHelperClass addIpAddress(IPAddress o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setReadTimeout(int o0){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class IPAddress {

IPAddress(){}
	IPAddress(byte[] o0){}}
