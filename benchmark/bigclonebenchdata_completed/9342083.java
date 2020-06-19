


class c9342083 {

    public static String getExternalIPAddress() {
        String address = null;
        URL url = null;
        try {
            url = new URL("http://checkip.dyndns.org/");
            URLConnection connection = (URLConnection)(URLConnection)(Object) url.openConnection();
            BufferedInputStream in = new BufferedInputStream(connection.getInputStream());
            int i;
            while ((i =(int)(Object) in.read()) != -1) {
                address = address + (char) i;
            }
            in.close();
            address = address.substring(address.indexOf(": ") + 2);
            address = address.substring(0, address.indexOf("</body>"));
        } catch (Exception e) {
            return null;
        }
        return address;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}
