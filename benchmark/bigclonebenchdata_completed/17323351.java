


class c17323351 {

    public static String getOriginalWSDL(String wsdlURL) {
        try {
            URL url = new URL(wsdlURL);
            java.net.HttpURLConnection conn =(java.net.HttpURLConnection)(Object) (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            InputStream input =(InputStream)(Object) conn.getInputStream();
            final int BUFFERSIZE = 4096;
            byte[] buffer = new byte[BUFFERSIZE];
            OutputStream output =(OutputStream)(Object) new ByteArrayOutputStream();
            while (true) {
                int read =(int)(Object) input.read(buffer);
                if (read == -1) {
                    break;
                }
                output.write(buffer, 0, read);
            }
            output.close();
            input.close();
            conn.disconnect();
            String s = output.toString();
            return s;
        } catch (Exception e) {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class ByteArrayOutputStream {

}
