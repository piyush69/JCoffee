
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c2336999 {

//    @Override
    public String baiDuHotNews() {
        HttpClient client =(HttpClient)(Object) new DefaultHttpClient();
        HttpGet httpGet = new HttpGet("http://news.baidu.com/z/wise_topic_processor/wise_hotwords_list.php?bd_page_type=1&tn=wapnews_hotwords_list&type=1&index=1&pfr=3-11-bdindex-top-3--");
        String hostNews = "";
        try {
            HttpResponse response =(HttpResponse)(Object) client.execute(httpGet);
            HttpEntity httpEntity =(HttpEntity)(Object) response.getEntity();
            BufferedReader buffer = new BufferedReader(new InputStreamReader(httpEntity.getContent()));
            String line = "";
            boolean todayNewsExist = false, firstNewExist = false;
            int newsCount = -1;
            while ((line =(String)(Object) buffer.readLine()) != null) {
                if (todayNewsExist || line.contains("<div class=\"news_title\">")) todayNewsExist = true; else continue;
                if (firstNewExist || line.contains("<div class=\"list-item\">")) {
                    firstNewExist = true;
                    newsCount++;
                } else continue;
                if (todayNewsExist && firstNewExist && (newsCount == 1)) {
                    MyHelperClass Pattern = new MyHelperClass();
                    Pattern hrefPattern =(Pattern)(Object) Pattern.compile("<a.*>(.+?)</a>.*");
                    Matcher matcher =(Matcher)(Object) hrefPattern.matcher(line);
                    if ((boolean)(Object)matcher.find()) {
                        hostNews =(String)(Object) matcher.group(1);
                        break;
                    } else newsCount--;
                }
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return hostNews;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass compile(String o0){ return null; }}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class Pattern {

public MyHelperClass matcher(String o0){ return null; }}

class Matcher {

public MyHelperClass find(){ return null; }
	public MyHelperClass group(int o0){ return null; }}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
