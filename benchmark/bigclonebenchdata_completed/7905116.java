import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7905116 {

	protected List<? extends SearchResult> searchVideo(String words, int number, int offset, CancelMonitor cancelMonitor)  throws Throwable {
		List<VideoSearchResult> resultsList = new ArrayList<>();
		try {
			// set up the HTTP request factory
			HttpTransport transport =(HttpTransport)(Object) new NetHttpTransport();
			HttpRequestFactory factory = transport.createRequestFactory(new HttpRequestInitializer() {

//				@Override
				public void initialize(HttpRequest request) {
					// set the parser
					JsonCParser parser = new JsonCParser();
     MyHelperClass JSON_FACTORY = new MyHelperClass();
					parser.jsonFactory = JSON_FACTORY;
					request.addParser(parser);
					// set up the Google headers
					GoogleHeaders headers = new GoogleHeaders();
					headers.setApplicationName("OGLExplorer/1.0");
					headers.gdataVersion = "2";
					request.headers = headers;
				}
			});
			// build the YouTube URL
			YouTubeUrl url = new YouTubeUrl("https://gdata.youtube.com/feeds/api/videos");
			url.maxResults = number;
			url.words = words;
			url.startIndex = offset + 1;
			// build
			HttpRequest request = factory.buildGetRequest(url);
			// execute
			HttpResponse response = request.execute();
			VideoFeed feed = response.parseAs(VideoFeed.class);
			if (feed.items == null) {
				return null;
			}
			// browse result and convert them to the local generic object model
			for (int i = 0; i < feed.items.size() && !cancelMonitor.isCanceled(); i++) {
				Video result = feed.items.get(i);
				VideoSearchResult modelResult = new VideoSearchResult(offset + i + 1);
				modelResult.setTitle(result.title);
				modelResult.setDescription(result.description);
				modelResult.setThumbnailURL(new URL(result.thumbnail.lowThumbnailURL));
				modelResult.setPath(result.player.defaultUrl);
				resultsList.add(modelResult);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (cancelMonitor.isCanceled()) {
			return null;
		}
		return(SearchResult>)(Object) resultsList;
	}

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class CancelMonitor {

public MyHelperClass isCanceled(){ return null; }}

class SearchResult {

}

class VideoSearchResult {

VideoSearchResult(int o0){}
	VideoSearchResult(){}
	public MyHelperClass setThumbnailURL(URL o0){ return null; }}

class HttpTransport {

public MyHelperClass createRequestFactory(){ return null; }}

class NetHttpTransport {

}

class HttpRequestFactory {

public MyHelperClass buildGetRequest(YouTubeUrl o0){ return null; }}

class HttpRequestInitializer {

}

class YouTubeUrl {
public MyHelperClass words;
	public MyHelperClass startIndex;
	public MyHelperClass maxResults;
YouTubeUrl(){}
	YouTubeUrl(String o0){}}

class HttpRequest {
public MyHelperClass headers;
public MyHelperClass execute(){ return null; }}

class HttpResponse {

public MyHelperClass parseAs(Class<VideoFeed o0){ return null; }}

class VideoFeed {
public MyHelperClass items;
}

class Video {
public MyHelperClass player;
	public MyHelperClass thumbnail;
	public MyHelperClass description;
	public MyHelperClass title;
}

class JsonCParser {

}

class GoogleHeaders {

}
