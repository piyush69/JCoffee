import java.io.*;
import java.lang.*;
import java.util.*;



class c3749038 {
public MyHelperClass[] POSSIBLE_GOOGLE_SCALES;
	public MyHelperClass[] GOOGLE_ZOOM_LEVELS;
	public MyHelperClass HOST_NAME;
public MyHelperClass GpsylonKeyConstants;
//	public MyHelperClass GOOGLE_ZOOM_LEVELS;
	public MyHelperClass PROGRESS_LISTENER_ID;
//	public MyHelperClass POSSIBLE_GOOGLE_SCALES;
	public MyHelperClass resources_;
	public MyHelperClass BUFFER_SIZE;
	public MyHelperClass DownloadMouseModeLayer;
	public MyHelperClass GOOGLE_MAPS_URL;
	public MyHelperClass Debug;
	public MyHelperClass getZoomLevelIndex(double o0){ return null; }

    public MapInfo getMap(double latitude, double longitude, double wanted_mapblast_scale, int image_width, int image_height, String file_path_wo_extension, ProgressListener progress_listener) throws IOException {
        try {
            MyHelperClass web_request_ = new MyHelperClass();
            if (web_request_ == null) {
//                MyHelperClass web_request_ = new MyHelperClass();
                web_request_ =(MyHelperClass)(Object) new HttpRequester(HOST_NAME);
            }
            int zoom_index =(int)(Object) getZoomLevelIndex(wanted_mapblast_scale);
            int google_zoom_level =(int)(Object) GOOGLE_ZOOM_LEVELS[zoom_index];
            double mapblast_scale =(double)(Object) POSSIBLE_GOOGLE_SCALES[zoom_index];
            Tile tile = new Tile(latitude, longitude, google_zoom_level);
            SimplePoint coords =(SimplePoint)(Object) tile.getTileLatLong();
            SimplePoint google_xy =(SimplePoint)(Object) tile.getTileCoord();
            MapInfo map_info = new MapInfo();
            map_info.setLatitude(coords.getX());
            map_info.setLongitude(coords.getY());
            map_info.setScale((float) mapblast_scale);
            map_info.setWidth(256);
            map_info.setHeight(256);
            map_info.setFilename(file_path_wo_extension + "png");
            Object[] params = new Object[] { new Integer((int)(Object)google_xy.getX()), new Integer((int)(Object)google_xy.getY()), new Integer(google_zoom_level) };
            MessageFormat message_format = new MessageFormat(GOOGLE_MAPS_URL, Locale.US);
            String url_string =(String)(Object) message_format.format(params);
            URL url = new URL(url_string);
            if ((boolean)(Object)Debug.DEBUG) Debug.println("map_download", "loading map from url: " + url);
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            if ((boolean)(Object)resources_.getBoolean(GpsylonKeyConstants.KEY_HTTP_PROXY_AUTHENTICATION_USE)) {
                String proxy_userid =(String)(Object) resources_.getString(GpsylonKeyConstants.KEY_HTTP_PROXY_AUTHENTICATION_USERNAME);
                String proxy_password =(String)(Object) resources_.getString(GpsylonKeyConstants.KEY_HTTP_PROXY_AUTHENTICATION_PASSWORD);
                String auth_string = proxy_userid + ":" + proxy_password;
                auth_string = "Basic " + new sun.misc.BASE64Encoder().encode(auth_string.getBytes());
                connection.setRequestProperty("Proxy-Authorization", auth_string);
            }
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
            FileOutputStream out = new FileOutputStream(filename);
            byte[] buffer = new byte[(int)(Object)BUFFER_SIZE];
            BufferedInputStream in = new BufferedInputStream((InputStream)(Object)connection.getInputStream(),(int)(Object) BUFFER_SIZE);
            int sum_bytes = 0;
            int num_bytes = 0;
            while ((num_bytes = in.read(buffer)) != -1) {
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
        } catch (FileNotFoundException fnfe) {
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
public MyHelperClass KEY_HTTP_PROXY_AUTHENTICATION_PASSWORD;
	public MyHelperClass DEBUG;
	public MyHelperClass KEY_LOCALIZE_MESSAGE_DOWNLOAD_ERROR_NO_ROUTE_TO_HOST_MESSAGE;
	public MyHelperClass KEY_HTTP_PROXY_AUTHENTICATION_USE;
	public MyHelperClass KEY_LOCALIZE_MESSAGE_DOWNLOAD_ERROR_FILE_NOT_FOUND_MESSAGE;
	public MyHelperClass KEY_HTTP_PROXY_AUTHENTICATION_USERNAME;
public MyHelperClass println(String o0, String o1){ return null; }
	public MyHelperClass toLowerCase(){ return null; }
	public MyHelperClass getBoolean(MyHelperClass o0){ return null; }
	public MyHelperClass getString(MyHelperClass o0){ return null; }}

class ProgressListener {

public MyHelperClass actionEnd(MyHelperClass o0){ return null; }
	public MyHelperClass actionStart(MyHelperClass o0, int o1, int o2){ return null; }
	public MyHelperClass actionProgress(MyHelperClass o0, int o1){ return null; }}

class MapInfo {

public MyHelperClass setFilename(String o0){ return null; }
	public MyHelperClass setLongitude(MyHelperClass o0){ return null; }
	public MyHelperClass setWidth(int o0){ return null; }
	public MyHelperClass setHeight(int o0){ return null; }
	public MyHelperClass setScale(float o0){ return null; }
	public MyHelperClass setLatitude(MyHelperClass o0){ return null; }}

class Tile {

Tile(double o0, double o1, int o2){}
	Tile(){}
	public MyHelperClass getTileCoord(){ return null; }
	public MyHelperClass getTileLatLong(){ return null; }}

class SimplePoint {

public MyHelperClass getY(){ return null; }
	public MyHelperClass getX(){ return null; }}

class MessageFormat {

MessageFormat(MyHelperClass o0, Locale o1){}
	MessageFormat(){}
	public MyHelperClass format(Object[] o0){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass connect(){ return null; }}

class HTMLViewerFrame {

HTMLViewerFrame(URL o0){}
	HTMLViewerFrame(){}
	public MyHelperClass setTitle(String o0){ return null; }
	public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass setSize(int o0, int o1){ return null; }}

class NoRouteToHostException extends Exception{
	public NoRouteToHostException(String errorMessage) { super(errorMessage); }
}

class HttpRequester {

HttpRequester(){}
	HttpRequester(MyHelperClass o0){}}
