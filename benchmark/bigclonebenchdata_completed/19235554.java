


class c19235554 {
public MyHelperClass uri;
	public MyHelperClass processNewUri(URLConnection o0){ return null; }

    protected BufferedImage handleKBRException() {
        if ((Boolean)(Object)uri.startsWith("http://mara.kbr.be/kbrImage/CM/") || (Boolean)(Object)uri.startsWith("http://mara.kbr.be/kbrImage/maps/") || (boolean)(Object)uri.startsWith("http://opteron2.kbr.be/kp/viewer/")) try {
            MyHelperClass params = new MyHelperClass();
            URLConnection connection =(URLConnection)(Object) (new URL((String)(Object)params.uri).openConnection());
            String url = "get_image.php?intId=";
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String aux = null;
            while ((aux =(String)(Object) reader.readLine()) != null) {
                if (aux.indexOf(url) != -1) {
                    aux = aux.substring(aux.indexOf(url));
                    url = "http://mara.kbr.be/kbrImage/" + aux.substring(0, aux.indexOf("\""));
                    break;
                }
            }
            connection =(URLConnection)(Object) (new URL(url).openConnection());
            return(BufferedImage)(Object) processNewUri(connection);
        } catch (Exception e) {
            try {
                String url = "http://mara.kbr.be/xlimages/maps/thumbnails" + uri.substring(uri.lastIndexOf("/")).replace(".imgf", ".jpg");
                if (url != null) {
                    URLConnection connection =(URLConnection)(Object) (new URL(url).openConnection());
                    return(BufferedImage)(Object) processNewUri(connection);
                }
            } catch (Exception e2) {
            }
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass uri;
public MyHelperClass replace(String o0, String o1){ return null; }
	public MyHelperClass substring(MyHelperClass o0){ return null; }
	public MyHelperClass startsWith(String o0){ return null; }
	public MyHelperClass lastIndexOf(String o0){ return null; }}

class BufferedImage {

}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}
