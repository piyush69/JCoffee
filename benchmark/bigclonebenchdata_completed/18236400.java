


class c18236400 {
public MyHelperClass NONE;
	public MyHelperClass extractImageLinks(Lexer o0, URL o1){ return null; }

    protected URL[][] getImageLinks(final URL url) {
        Lexer lexer;
        URL[][] ret;
        if (null != url) {
            try {
                lexer = new Lexer(url.openConnection());
                ret =(URL[][])(Object) extractImageLinks(lexer, url);
            } catch (Throwable t) {
                System.out.println(t.getMessage());
                MyHelperClass NONE = new MyHelperClass();
                ret =(URL[][])(Object) NONE;
            }
        MyHelperClass NONE = new MyHelperClass();
        } else ret =(URL[][])(Object) NONE;
        return (ret);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openConnection(){ return null; }}

class Lexer {

Lexer(MyHelperClass o0){}
	Lexer(){}}
