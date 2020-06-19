


class c23030047 {

    public static void downloadImage(File file, String imageUrl) throws IOException {
        int size = 0;
        int copied = 0;
        InputStream in = null;
        FileOutputStream out = null;
        try {
            URL url;
            url = new URL(imageUrl);
            HttpURLConnection httpURLConnection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            size =(int)(Object) httpURLConnection.getContentLength();
            in =(InputStream)(Object) httpURLConnection.getInputStream();
            out = new FileOutputStream(file);
            MyHelperClass DEFAULT_BUFFER_SIZE = new MyHelperClass();
            byte[] buffer = new byte[(int)(Object)DEFAULT_BUFFER_SIZE];
            int n = 0;
            int percent = 0;
            int lastPercent = 0;
            while (-1 != (n =(int)(Object) in.read(buffer))) {
                out.write(buffer, 0, n);
                copied += n;
                percent = copied * 100 / size;
                if (lastPercent != percent) {
                    lastPercent = percent;
                    MyHelperClass MessageUtils = new MyHelperClass();
                    String message =(String)(Object) MessageUtils.getMessage(JWallpaperChanger.class, "downloadPercent", "" + percent + "%");
                    MyHelperClass Platform = new MyHelperClass();
                    Platform.getPlatform().setTrayCaption(message);
                }
            }
            out.flush();
        } finally {
            MyHelperClass Platform = new MyHelperClass();
            Platform.getPlatform().setTrayCaption(null);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(in);
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(out);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }
	public MyHelperClass setTrayCaption(String o0){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass getPlatform(){ return null; }
	public MyHelperClass setTrayCaption(Object o0){ return null; }
	public MyHelperClass getMessage(Class<JWallpaperChanger> o0, String o1, String o2){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass flush(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class JWallpaperChanger {

}
