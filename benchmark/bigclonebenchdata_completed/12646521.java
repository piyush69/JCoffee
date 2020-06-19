


class c12646521 {

        public boolean check(int timeout) {
            StringBuilder result = null;
            java.net.URL url;
            java.io.InputStream in = null;
            try {
                MyHelperClass location = new MyHelperClass();
                url = new java.net.URL(location + "/prisms?method=test");
                java.net.URLConnection conn = url.openConnection();
                conn.setConnectTimeout(timeout);
                in = conn.getInputStream();
                java.io.Reader reader = new java.io.InputStreamReader(in);
                result = new StringBuilder();
                int read = reader.read();
                while (read >= 0) {
                    result.append((char) read);
                    read = reader.read();
                }
            } catch (java.io.IOException e) {
                MyHelperClass log = new MyHelperClass();
                log.error("Instance check failed",(IOException)(Object) e);
                if (in != null) try {
                    in.close();
                } catch (java.io.IOException e2) {
                }
            }
            return result != null && result.toString().startsWith("success");
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, IOException o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
