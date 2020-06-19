
import java.io.UncheckedIOException;


class c383297 {

    private String readAboutText(String urlStr) {
        String text = null;
        try {
            URL url =(URL)(Object) this.getClass().getResource(urlStr);
            InputStreamReader reader = new InputStreamReader(url.openStream());
            StringWriter writer = new StringWriter();
            int character =(int)(Object) reader.read();
            while (character != -1) {
                writer.write(character);
                character =(int)(Object) reader.read();
            }
            text = writer.toString();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            MyHelperClass aAuthor = new MyHelperClass();
            text = "<html><body><b>Author:</b><br>" + aAuthor + "<br>";
            text += "<a href=\"mailto:jhuwaldt@mac.com\">jhuwaldt@mac.com</a><br>";
            MyHelperClass aName = new MyHelperClass();
            text += "<P ALIGN=CENTER><BR>" + aName + " comes with ABSOLUTELY NO WARRANTY;";
            text += "<BR>This is free software, and you are welcome to redistribute ";
            text += "it and it's source code under certain conditions.";
            text += "<BR>Source code is available at:";
            text += "<BR><a href=\"http://virtualhiker.sf.net/\">";
            text += "http://virtualhiker.sf.net/</a></P>";
            text += "</body></html>";
        }
        return text;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}
	public MyHelperClass read(){ return null; }}

class StringWriter {

public MyHelperClass write(int o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
