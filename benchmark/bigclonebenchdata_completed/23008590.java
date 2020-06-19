
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c23008590 {
public MyHelperClass label0;
	public MyHelperClass mw;

            public void run() {
                URL url;
                try {
                    MyHelperClass Config = new MyHelperClass();
                    url = new URL(Config.UPDATE_SITE_URL);
                    InputStream is =(InputStream)(Object) url.openStream();
                    Writer writer =(Writer)(Object) new StringWriter();
                    char[] buffer = new char[1024];
                    Reader reader =(Reader)(Object) new BufferedReader(new InputStreamReader(is, "UTF-8"));
                    int n;
                    while ((n =(int)(Object) reader.read(buffer)) != -1) {
                        writer.write(buffer, 0, n);
                    }
                    String updatePage = writer.toString();
                    is.close();
                    writer.close();
                    System.out.println("DOWNLOAD PAGE :\n" + updatePage);
                    int pos1 = updatePage.indexOf("[ANA-CABV]") + 10;
                    int pos2 = updatePage.indexOf("[/ANA-CABV]");
                    int pos3 = updatePage.indexOf("[ANA-CABVURL]") + 13;
                    int pos4 = updatePage.indexOf("[/ANA-CABVURL]");
                    String currentVersion = updatePage.substring(pos1, pos2);
                    MyHelperClass currentVersionLabel = new MyHelperClass();
                    currentVersionLabel.setText(currentVersionLabel.getText() + currentVersion);
//                    MyHelperClass Config = new MyHelperClass();
                    if (Double.valueOf((String)(Object)Config.VERSION) < Double.valueOf(currentVersion)) {
                        MyHelperClass downloadButton = new MyHelperClass();
                        downloadButton.setEnabled(true);
                        MyHelperClass mw = new MyHelperClass();
                        label0.setText((String)(Object)mw.getLangMap().get("Update_Avalaible"));
//                    MyHelperClass mw = new MyHelperClass();
                    } else label0.setText((String)(Object)mw.getLangMap().get("Update_NonAvalaible"));
                    String downloadURL;// = new String();
                    downloadURL = updatePage.substring(pos3, pos4);
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                } catch (ArithmeticException e) {
                    e.printStackTrace();
                }
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass VERSION;
	public MyHelperClass UPDATE_SITE_URL;
public MyHelperClass getLangMap(){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass setEnabled(boolean o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class Writer {

public MyHelperClass write(char[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class StringWriter {

}

class Reader {

public MyHelperClass read(char[] o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0, String o1){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
