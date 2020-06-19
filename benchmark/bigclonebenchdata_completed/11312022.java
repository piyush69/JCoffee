


class c11312022 {

    public static void downloadFromUrl(URL url, String localFilename, String userAgent) throws IOException {
        InputStream is = null;
        FileOutputStream fos = null;
        System.setProperty("java.net.useSystemProxies", "true");
        try {
            URLConnection urlConn =(URLConnection)(Object) url.openConnection();
            if (userAgent != null) {
                urlConn.setRequestProperty("User-Agent", userAgent);
            }
            is =(InputStream)(Object) urlConn.getInputStream();
            fos = new FileOutputStream(localFilename);
            byte[] buffer = new byte[4096];
            int len;
            while ((len =(int)(Object) is.read(buffer)) > 0) {
                fos.write(buffer, 0, len);
            }
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } finally {
                if (fos != null) {
                    fos.close();
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openConnection(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }}
