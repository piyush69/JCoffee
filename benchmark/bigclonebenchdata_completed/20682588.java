
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c20682588 {
public MyHelperClass setRequestProperties(URLConnection o0){ return null; }
public MyHelperClass resources_;
	public MyHelperClass BUFFER_SIZE;
	public MyHelperClass Debug;
	public MyHelperClass DownloadMouseModeLayer;
	public MyHelperClass GpsylonKeyConstants;
	public MyHelperClass PROGRESS_LISTENER_ID;
	public MyHelperClass getDownloadScale(double o0){ return null; }
	public MyHelperClass getUrl(double o0, double o1, double o2, int o3, int o4){ return null; }
	public MyHelperClass getCorrectedMapblastScale(double o0){ return null; }

    public MapInfo getMap(double latitude, double longitude, double wanted_mapblast_scale, int image_width, int image_height, String file_path_wo_extension, ProgressListener progress_listener) throws IOException {
        try {
            double mapserver_scale =(double)(Object) getDownloadScale(wanted_mapblast_scale);
            URL url = new URL(getUrl(latitude, longitude, mapserver_scale, image_width, image_height));
            if ((boolean)(Object)Debug.DEBUG) Debug.println("map_download", "loading map from url: " + url);
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            if ((boolean)(Object)resources_.getBoolean(GpsylonKeyConstants.KEY_HTTP_PROXY_AUTHENTICATION_USE)) {
                String proxy_userid =(String)(Object) resources_.getString(GpsylonKeyConstants.KEY_HTTP_PROXY_AUTHENTICATION_USERNAME);
                String proxy_password =(String)(Object) resources_.getString(GpsylonKeyConstants.KEY_HTTP_PROXY_AUTHENTICATION_PASSWORD);
                String auth_string = proxy_userid + ":" + proxy_password;
                auth_string = "Basic " + new sun.misc.BASE64Encoder().encode(auth_string.getBytes());
                connection.setRequestProperty("Proxy-Authorization", auth_string);
            }
            connection =(URLConnection)(Object) setRequestProperties(connection);
            connection.connect();
            String mime_type =(String)(Object) connection.getContentType().toLowerCase();
            if (!mime_type.startsWith("image")) {
                if (mime_type.startsWith("text")) {
                    HTMLViewerFrame viewer = new HTMLViewerFrame(url);
                    viewer.setSize(640, 480);
                    viewer.setTitle("ERROR on loading url: " + url);
                    viewer.setVisible(true);
                    throw new IOException("Invalid mime type (expected 'image/*'): received " + mime_type + "\nPage is displayed in HTML frame.");
                }
                throw new IOException("Invalid mime type (expected 'image/*'): received " + mime_type);
            }
            int content_length =(int)(Object) connection.getContentLength();
            if (content_length < 0) progress_listener.actionStart(PROGRESS_LISTENER_ID, 0, Integer.MIN_VALUE); else progress_listener.actionStart(PROGRESS_LISTENER_ID, 0, content_length);
            String extension = mime_type.substring(mime_type.indexOf('/') + 1);
            String filename = file_path_wo_extension + extension;
            MapInfo map_info = new MapInfo();
            map_info.setLatitude(latitude);
            map_info.setLongitude(longitude);
            map_info.setScale((float)(float)(Object) getCorrectedMapblastScale(wanted_mapblast_scale));
            map_info.setWidth(image_width);
            map_info.setHeight(image_height);
            map_info.setFilename(filename);
            FileOutputStream out = new FileOutputStream(filename);
            byte[] buffer = new byte[(int)(Object)BUFFER_SIZE];
            BufferedInputStream in = new BufferedInputStream(connection.getInputStream(), BUFFER_SIZE);
            int sum_bytes = 0;
            int num_bytes = 0;
            while ((num_bytes =(int)(Object) in.read(buffer)) != -1) {
                out.write(buffer, 0, num_bytes);
                sum_bytes += num_bytes;
                progress_listener.actionProgress(PROGRESS_LISTENER_ID, sum_bytes);
            }
            progress_listener.actionEnd(PROGRESS_LISTENER_ID);
            in.close();
            out.close();
            return (map_info);
        } catch (UncheckedIOException nrhe) {
            nrhe.printStackTrace();
            progress_listener.actionEnd(PROGRESS_LISTENER_ID);
            String message = nrhe.getMessage() + ":\n" + resources_.getString(DownloadMouseModeLayer.KEY_LOCALIZE_MESSAGE_DOWNLOAD_ERROR_NO_ROUTE_TO_HOST_MESSAGE);
            throw new IOException(message);
        } catch (ArithmeticException fnfe) {
            fnfe.printStackTrace();
            progress_listener.actionEnd(PROGRESS_LISTENER_ID);
            String message = fnfe.getMessage() + ":\n" + resources_.getString(DownloadMouseModeLayer.KEY_LOCALIZE_MESSAGE_DOWNLOAD_ERROR_FILE_NOT_FOUND_MESSAGE);
            throw new IOException(message);
        } catch (Exception e) {
            progress_listener.actionEnd(PROGRESS_LISTENER_ID);
            e.printStackTrace();
            String message = e.getMessage();
            if (message == null) {
                Throwable cause = e.getCause();
                if (cause != null) message = cause.getMessage();
            }
            throw new IOException(message);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DEBUG;
	public MyHelperClass KEY_LOCALIZE_MESSAGE_DOWNLOAD_ERROR_NO_ROUTE_TO_HOST_MESSAGE;
	public MyHelperClass KEY_LOCALIZE_MESSAGE_DOWNLOAD_ERROR_FILE_NOT_FOUND_MESSAGE;
	public MyHelperClass KEY_HTTP_PROXY_AUTHENTICATION_USE;
	public MyHelperClass KEY_HTTP_PROXY_AUTHENTICATION_PASSWORD;
	public MyHelperClass KEY_HTTP_PROXY_AUTHENTICATION_USERNAME;
public MyHelperClass toLowerCase(){ return null; }
	public MyHelperClass getString(MyHelperClass o0){ return null; }
	public MyHelperClass getBoolean(MyHelperClass o0){ return null; }
	public MyHelperClass println(String o0, String o1){ return null; }}

class ProgressListener {

public MyHelperClass actionEnd(MyHelperClass o0){ return null; }
	public MyHelperClass actionStart(MyHelperClass o0, int o1, int o2){ return null; }
	public MyHelperClass actionProgress(MyHelperClass o0, int o1){ return null; }}

class MapInfo {

public MyHelperClass setFilename(String o0){ return null; }
	public MyHelperClass setLongitude(double o0){ return null; }
	public MyHelperClass setHeight(int o0){ return null; }
	public MyHelperClass setWidth(int o0){ return null; }
	public MyHelperClass setScale(float o0){ return null; }
	public MyHelperClass setLatitude(double o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class HTMLViewerFrame {

HTMLViewerFrame(){}
	HTMLViewerFrame(URL o0){}
	public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass setSize(int o0, int o1){ return null; }
	public MyHelperClass setTitle(String o0){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0, MyHelperClass o1){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class NoRouteToHostException extends Exception{
	public NoRouteToHostException(String errorMessage) { super(errorMessage); }
}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}
