
import java.io.UncheckedIOException;


class c4753846 {

    public static boolean checkVersion(String vers) throws IOException {
        try {
            String tmp = "";
            URL url = new URL("http://rbmsoft.com.br/apis/ql/index.php?url=null&versao=" + vers);
            BufferedInputStream buf = new BufferedInputStream(url.openStream());
            int dado = 0;
            char letra;
            while ((dado =(int)(Object) buf.read()) != -1) {
                letra = (char) dado;
                tmp += letra;
            }
            if (tmp.contains("FALSE")) {
                return false;
            } else if (tmp.contains("TRUE")) {
                new UpdateCheck().updateDialog();
                return true;
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}
	public MyHelperClass read(){ return null; }}

class UpdateCheck {

public MyHelperClass updateDialog(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
