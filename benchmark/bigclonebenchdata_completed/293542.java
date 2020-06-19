


class c293542 {
public MyHelperClass InterpreterFactory;
	public MyHelperClass cleanse(StringBuffer o0){ return null; }

    public void stock(String ticker) {
        try {
            URL url = new URL("http://finance.yahoo.com/q?s=" + ticker + "&d=v1");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            StringBuffer page = new StringBuffer(8192);
            while ((line =(String)(Object) reader.readLine()) != null) {
                page.append(line);
            }
            LispInterpreter lisp =(LispInterpreter)(Object) InterpreterFactory.getInterpreter();
            lisp.eval("(load \"nregex\")");
            String quote =(String)(Object) lisp.eval("(second (regex \"<b>([0-9][0-9]\\.[0-9][0-9])</b>\" \"" + cleanse(page) + "\"))");
            System.out.println("Current quote: " + quote);
            lisp.exit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInterpreter(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class LispInterpreter {

public MyHelperClass exit(){ return null; }
	public MyHelperClass eval(String o0){ return null; }}
