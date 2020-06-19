
// import java.io.ArithmeticException;
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c21955002 {
public MyHelperClass getWave(String o0){ return null; }

    public void run() {
        String s, s2;
        s = "";
        s2 = "";
        try {
            MyHelperClass Word = new MyHelperClass();
            URL url = new URL("http://www.m-w.com/dictionary/" + Word);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String str;
            MyHelperClass stopped = new MyHelperClass();
            while (((str =(String)(Object) in.readLine()) != null) && (!(Boolean)(Object)stopped)) {
                s = s + str;
            }
            in.close();
        } catch (UncheckedIOException e) {
        } catch (ArithmeticException e) {
        }
        MyHelperClass Pattern = new MyHelperClass();
        Pattern pattern =(Pattern)(Object) Pattern.compile("popWin\\('/cgi-bin/(.+?)'",(int)(Object) Pattern.CASE_INSENSITIVE | (int)(Object)Pattern.DOTALL);
        Matcher matcher =(Matcher)(Object) pattern.matcher(s);
        MyHelperClass stopped = new MyHelperClass();
        if ((!(Boolean)(Object)stopped) && (boolean)(Object)(matcher.find())) {
            String newurl = "http://m-w.com/cgi-bin/" + matcher.group(1);
            try {
                URL url2 = new URL(newurl);
                BufferedReader in2 = new BufferedReader(new InputStreamReader(url2.openStream()));
                String str;
//                MyHelperClass stopped = new MyHelperClass();
                while (((str =(String)(Object) in2.readLine()) != null) && (!(Boolean)(Object)stopped)) {
                    s2 = s2 + str;
                }
                in2.close();
            } catch (UncheckedIOException e) {
            } catch (ArithmeticException e) {
            }
//            MyHelperClass Pattern = new MyHelperClass();
            Pattern pattern2 =(Pattern)(Object) Pattern.compile("<A HREF=\"http://(.+?)\">Click here to listen with your default audio player",(int)(Object) Pattern.CASE_INSENSITIVE | (int)(Object)Pattern.DOTALL);
            Matcher matcher2 =(Matcher)(Object) pattern2.matcher(s2);
//            MyHelperClass stopped = new MyHelperClass();
            if ((!(Boolean)(Object)stopped) && (boolean)(Object)(matcher2.find())) {
                MyHelperClass label = new MyHelperClass();
                if ((boolean)(Object)getWave("http://" + matcher2.group(1))) label.setEnabled(true);
            }
        }
        MyHelperClass button = new MyHelperClass();
        button.setEnabled(true);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DOTALL;
	public MyHelperClass CASE_INSENSITIVE;
public MyHelperClass compile(String o0, int o1){ return null; }
	public MyHelperClass setEnabled(boolean o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Pattern {

public MyHelperClass matcher(String o0){ return null; }}

class Matcher {

public MyHelperClass find(){ return null; }
	public MyHelperClass group(int o0){ return null; }}
