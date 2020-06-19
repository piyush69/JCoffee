import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16619660 {
public MyHelperClass lock;

    public  void PropertiesImpl(URL url)  throws Throwable {
        this();
        InputStream in = null;
        lock.lock();
        try {
            in = url.openStream();
            PropertiesLexer lexer = new PropertiesLexer(in);
            lexer.lex();
            List<PropertiesToken> list =(List<PropertiesToken>)(Object) lexer.getList();
            new PropertiesParser(list, this).parse();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) try {
                in.close();
            } catch (IOException e) {
            }
            lock.unlock();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass unlock(){ return null; }
	public MyHelperClass lock(){ return null; }}

class PropertiesLexer {

PropertiesLexer(InputStream o0){}
	PropertiesLexer(){}
	public MyHelperClass getList(){ return null; }
	public MyHelperClass lex(){ return null; }}

class PropertiesToken {

}

class PropertiesParser {

PropertiesParser(){}
	PropertiesParser(List<PropertiesToken> o0, c16619660 o1){}
	public MyHelperClass parse(){ return null; }}
