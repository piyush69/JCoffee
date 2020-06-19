import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22504904 {
public MyHelperClass searchFilter;
	public MyHelperClass StringUtil;
	public MyHelperClass visited;
public MyHelperClass parent;
	public MyHelperClass Debug;
	public MyHelperClass url;
	public MyHelperClass hops;
	public MyHelperClass addInternal(URL o0){ return null; }

        private void parseUrl()  throws Throwable {
            URLLexer lexer;
            URLParser parser;
            if (this.parent != null) {
                this.hops =(int)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object) ((HTTPFile)(HTTPFile)(Object) this.parent).hops - 1;
            }
            if ((boolean)(Object)this.searchFilter.accept(this.url.getPath())) {
                if (!(Boolean)(Object)visited.contains(this.url.toExternalForm())) {
                    if ((int)(Object)this.hops > 0) {
                        try {
                            visited.add(this.url.toExternalForm());
                            InputStream in =(InputStream)(Object) this.url.openStream();
                            lexer = new URLLexer(this.url.openStream());
                            parser = new URLParser(lexer);
                            URL[] urls =(URL[])(Object) parser.htmlDocument(this.url);
                            if ((boolean)(Object)Debug.debug) {
                                Debug.getInstance().info(this.getClass().getName() + ".parseUrl(): Found the following URLs in " + this.url.toExternalForm() + " : " + StringUtil.ArrayToString(urls, 10));
                            }
                            for (int i = 0; i < urls.length; i++) {
                                this.addInternal(urls[i]);
                            }
                        } catch (IOException e) {
                            if ((boolean)(Object)Debug.debug) {
                                Debug.getInstance().error(e.getMessage());
                            }
                        } catch (RecognitionException e) {
                            if ((boolean)(Object)Debug.debug) {
                                Debug.getInstance().error("Problems while lexing " + this.url.toExternalForm() + " : " + e.getMessage(), e);
                            }
                        } catch (TokenStreamException e) {
                            if ((boolean)(Object)Debug.debug) {
                                Debug.getInstance().error("Problems while parsing " + this.url.toExternalForm() + " : " + e.getMessage(), e);
                            }
                        }
                    }
                } else {
                    if ((boolean)(Object)Debug.debug) {
                        Debug.getInstance().info(this.getClass().getName() + ".parseUrl(): Skipping URL " + this.url.toExternalForm() + " : Maximum depth reached.");
                    }
                }
            } else {
                if ((boolean)(Object)Debug.debug) {
                    Debug.getInstance().info(this.getClass().getName() + ".parseUrl(): Skipping URL " + this.url.toExternalForm() + " : Already parsed.");
                }
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass debug;
public MyHelperClass error(String o0, TokenStreamException o1){ return null; }
	public MyHelperClass accept(MyHelperClass o0){ return null; }
	public MyHelperClass toExternalForm(){ return null; }
	public MyHelperClass add(MyHelperClass o0){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass contains(MyHelperClass o0){ return null; }
	public MyHelperClass error(String o0, RecognitionException o1){ return null; }
	public MyHelperClass ArrayToString(URL[] o0, int o1){ return null; }}

class URLLexer {

URLLexer(MyHelperClass o0){}
	URLLexer(){}}

class URLParser {

URLParser(URLLexer o0){}
	URLParser(){}
	public MyHelperClass htmlDocument(MyHelperClass o0){ return null; }}

class RecognitionException extends Exception{
	public RecognitionException(String errorMessage) { super(errorMessage); }
}

class TokenStreamException extends Exception{
	public TokenStreamException(String errorMessage) { super(errorMessage); }
}

class HTTPFile {
public MyHelperClass hops;
}
