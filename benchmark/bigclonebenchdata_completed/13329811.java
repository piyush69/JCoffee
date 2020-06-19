
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c13329811 {

//    @Deprecated
    public void test() {
        try {
            String query = "* <http://xmlns.com/foaf/0.1/workplaceHomepage> <http://www.deri.ie/>" + "* <http://xmlns.com/foaf/0.1/knows> *";
            MyHelperClass URLEncoder = new MyHelperClass();
            String url = "http://sindice.com/api/v2/search?qt=advanced&q=" + URLEncoder.encode(query, "utf-8") + "&qt=advanced";
            URL urlObj = new URL(url);
            URLConnection con =(URLConnection)(Object) urlObj.openConnection();
            if (con != null) {
                MyHelperClass ModelFactory = new MyHelperClass();
                Model model =(Model)(Object) ModelFactory.createDefaultModel();
                model.read(con.getInputStream(), null);
            }
            System.out.println(url);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createDefaultModel(){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class Model {

public MyHelperClass read(MyHelperClass o0, Object o1){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
