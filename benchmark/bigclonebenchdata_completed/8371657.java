import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8371657 {

    private StylingEngine createStyling()  throws Throwable {
        MyHelperClass StylingFactory = new MyHelperClass();
        StylingFactory stylingFactory =(StylingFactory)(Object) StylingFactory.getDefaultInstance();
        StyleSheetCompilerFactory inlineCompilerFactory =(StyleSheetCompilerFactory)(Object) new InlineStyleSheetCompilerFactory(null);
        StylingEngine stylingEngine =(StylingEngine)(Object) stylingFactory.createStylingEngine(inlineCompilerFactory);
        CSSCompilerBuilder builder = new CSSCompilerBuilder();
        MyHelperClass DefaultStyleSheetCompilerFactory = new MyHelperClass();
        builder.setStyleSheetCompilerFactory(DefaultStyleSheetCompilerFactory.getDefaultInstance());
        CSSCompiler cssCompiler =(CSSCompiler)(Object) builder.getCSSCompiler();
        CompiledStyleSheet defaultCompiledStyleSheet;
        try {
            URL url = getClass().getResource("/com/volantis/mcs/runtime/default.css");
            InputStream stream = url.openStream();
            defaultCompiledStyleSheet =(CompiledStyleSheet)(Object) cssCompiler.compile(new InputStreamReader(stream), null);
        } catch (IOException e) {
            throw new ExtendedRuntimeException((String)(Object)e);
        }
        stylingEngine.pushStyleSheet(defaultCompiledStyleSheet);
        MyHelperClass protocol = new MyHelperClass();
        if (protocol != null && protocol.getCompiledDefaultStyleSheet() != null) {
//            MyHelperClass protocol = new MyHelperClass();
            stylingEngine.pushStyleSheet((CompiledStyleSheet)(Object)protocol.getCompiledDefaultStyleSheet());
        }
        return stylingEngine;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getDefaultInstance(){ return null; }
	public MyHelperClass getCompiledDefaultStyleSheet(){ return null; }}

class StylingEngine {

public MyHelperClass pushStyleSheet(CompiledStyleSheet o0){ return null; }}

class StylingFactory {

public MyHelperClass createStylingEngine(StyleSheetCompilerFactory o0){ return null; }}

class StyleSheetCompilerFactory {

}

class InlineStyleSheetCompilerFactory {

InlineStyleSheetCompilerFactory(){}
	InlineStyleSheetCompilerFactory(Object o0){}}

class CSSCompilerBuilder {

public MyHelperClass setStyleSheetCompilerFactory(MyHelperClass o0){ return null; }
	public MyHelperClass getCSSCompiler(){ return null; }}

class CSSCompiler {

public MyHelperClass compile(InputStreamReader o0, Object o1){ return null; }}

class CompiledStyleSheet {

}

class ExtendedRuntimeException extends Exception{
	public ExtendedRuntimeException(String errorMessage) { super(errorMessage); }
}
