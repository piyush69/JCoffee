
import java.io.UncheckedIOException;


class c9918348 {

        public static ArrayList[] imageSearch(String imageQuery, int startingIndex) {
            try {
                MyHelperClass URLEncoder = new MyHelperClass();
                imageQuery =(String)(Object) URLEncoder.encode(imageQuery, "UTF-8");
            } catch (UncheckedIOException e1) {
                e1.printStackTrace();
            }
            String queryS = new String();
            queryS += "http://images.google.com/images?gbv=1&start=" + startingIndex + "&q=" + imageQuery;
            String result = "";
            try {
                URL query = new URL(queryS);
                HttpURLConnection urlc = (HttpURLConnection)(HttpURLConnection)(Object) query.openConnection();
                urlc.setInstanceFollowRedirects(true);
                urlc.setRequestProperty("User-Agent", "");
                urlc.connect();
                BufferedReader in = new BufferedReader(new InputStreamReader(urlc.getInputStream()));
                StringBuffer response = new StringBuffer();
                char[] buffer = new char[1024];
                while (true) {
                    int charsRead =(int)(Object) in.read(buffer);
                    if (charsRead == -1) {
                        break;
                    }
                    response.append(buffer, 0, charsRead);
                }
                in.close();
                result = response.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
            ArrayList thumbs = new ArrayList();
            ArrayList imgs = new ArrayList();
            MyHelperClass imgBlock = new MyHelperClass();
            Matcher m =(Matcher)(Object) imgBlock.matcher(result);
            while ((boolean)(Object)m.find()) {
                String s =(String)(Object) m.group();
                MyHelperClass imgurl = new MyHelperClass();
                Matcher imgM =(Matcher)(Object) imgurl.matcher(s);
                imgM.find();
                String url =(String)(Object) imgM.group(1);
                MyHelperClass imgsrc = new MyHelperClass();
                Matcher srcM =(Matcher)(Object) imgsrc.matcher(s);
                srcM.find();
                String thumb =(String)(Object) srcM.group(1);
                thumbs.add(thumb);
                imgs.add(url);
            }
            return new ArrayList[] { thumbs, imgs };
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass matcher(String o0){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }}

class ArrayList {

public MyHelperClass add(String o0){ return null; }}

class UnsupportedEncodingException extends Exception{
	public UnsupportedEncodingException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setInstanceFollowRedirects(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass read(char[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class Matcher {

public MyHelperClass group(int o0){ return null; }
	public MyHelperClass group(){ return null; }
	public MyHelperClass find(){ return null; }}
