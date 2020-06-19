


class c12844597 {

        private String findTitle(URL url) {
            ParserCallback callback;
            try {
                URLConnection conn =(URLConnection)(Object) url.openConnection();
                Reader rd =(Reader)(Object) new InputStreamReader(conn.getInputStream());
                ParserDelegator parser = new ParserDelegator();
                callback =(ParserCallback)(Object) new Callback();
                parser.parse(rd, callback, true);
            } catch (Exception exp) {
                System.err.println(exp);
            }
            MyHelperClass title = new MyHelperClass();
            return (String)(Object)title;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class Reader {

}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class ParserDelegator {

public MyHelperClass parse(Reader o0, ParserCallback o1, boolean o2){ return null; }}

class Callback {

}

class ParserCallback {

}
