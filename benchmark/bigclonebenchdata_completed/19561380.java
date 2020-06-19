


class c19561380 {

    private static void loadEmoticons() {
        Hashtable emoticons;// = new Hashtable();
        emoticons = new Hashtable();
        URL url =(URL)(Object) ChatPanel.class.getResource("/resources/text/emoticon.properties");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = null;
            while ((line =(String)(Object) br.readLine()) != null) {
                if (line.trim().length() == 0 || line.charAt(0) == '#') continue;
                int i0 = line.indexOf('=');
                if (i0 != -1) {
                    String key = line.substring(0, i0).trim();
                    String value = line.substring(i0 + 1).trim();
                    MyHelperClass StringUtil = new MyHelperClass();
                    value =(String)(Object) StringUtil.replaceString(value, "\\n", "\n");
                    URL eUrl =(URL)(Object) ChatPanel.class.getResource("/resources/emoticon/" + value);
//                    MyHelperClass emoticons = new MyHelperClass();
                    if (eUrl != null) emoticons.put(key, new ImageIcon(eUrl));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass replaceString(String o0, String o1, String o2){ return null; }
	public MyHelperClass put(String o0, ImageIcon o1){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class ChatPanel {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class ImageIcon {

ImageIcon(){}
	ImageIcon(URL o0){}}

class Hashtable {

public MyHelperClass put(String o0, ImageIcon o1){ return null; }}
