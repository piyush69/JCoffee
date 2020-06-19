
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c23299412 {
public MyHelperClass valid(String o0){ return null; }
	public MyHelperClass makeAbsolute(String o0, String o1){ return null; }

    public List getLinks(String url) {
        List links =(List)(Object) new ArrayList();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
            String s;
            StringBuilder builder = new StringBuilder();
            while ((s =(String)(Object) bufferedReader.readLine()) != null) {
                builder.append(s);
            }
            MyHelperClass htmltag = new MyHelperClass();
            Matcher tagmatch =(Matcher)(Object) htmltag.matcher(builder.toString());
            while ((boolean)(Object)tagmatch.find()) {
                MyHelperClass link = new MyHelperClass();
                Matcher matcher =(Matcher)(Object) link.matcher((String)(Object)tagmatch.group());
                matcher.find();
//                String link = matcher.group().replaceFirst("href=\"", "").replaceFirst("\">", "");
                if ((boolean)(Object)valid((String)(Object)link)) {
                    links.add(makeAbsolute(url,(String)(Object) link));
                }
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return links;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass matcher(String o0){ return null; }}

class List {

public MyHelperClass add(MyHelperClass o0){ return null; }}

class ArrayList {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class Matcher {

public MyHelperClass find(){ return null; }
	public MyHelperClass group(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
