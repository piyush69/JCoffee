


class c22762280 {
public static MyHelperClass openConnection(String o0, String o1, String o2, String o3){ return null; }
//public MyHelperClass openConnection(String o0, String o1, String o2, String o3){ return null; }

    public static String postRequest(String url, String content) throws IOException {
        InputStream is = null;
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        String result = null;
        try {
            Object obj = openConnection(url, content, "POST", "text/xml");
            if (obj instanceof InputStream) {
                is = (InputStream) obj;
            } else {
                return "Cannot open a connection with " + url + " : " + obj.toString();
            }
            int c =(int)(Object) is.read();
            while (c != -1) {
                buf.write(c);
                c =(int)(Object) is.read();
            }
            result = new String((String)(Object)buf.toByteArray());
        } finally {
            if (is != null) {
                is.close();
            }
            if (buf != null) {
                buf.close();
            }
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }
	public MyHelperClass toByteArray(){ return null; }}
