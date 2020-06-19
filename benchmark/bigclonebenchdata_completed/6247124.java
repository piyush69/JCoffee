


class c6247124 {

    public static long getFileTimeStamp(String fileClassPath, String mockWebUrl) throws Exception {
        if (fileClassPath == null) return 0;
        if (fileClassPath.startsWith("/")) {
            fileClassPath = fileClassPath.substring(1, fileClassPath.length());
        } else if (mockWebUrl != null && fileClassPath.startsWith(mockWebUrl)) {
            fileClassPath = fileClassPath.substring(mockWebUrl.length());
        }
        URL url =(URL)(Object) Thread.currentThread().getContextClassLoader().getResource(fileClassPath);
        URLConnection urlCnx = null;
        try {
            if (url == null) {
                return 0;
            }
            urlCnx =(URLConnection)(Object) url.openConnection();
            return(long)(Object) urlCnx.getLastModified();
        } finally {
            if (urlCnx != null && urlCnx.getInputStream() != null) urlCnx.getInputStream().close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass close(){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getLastModified(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}
