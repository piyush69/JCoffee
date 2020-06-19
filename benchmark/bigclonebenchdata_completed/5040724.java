import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5040724 {
public MyHelperClass XDIMESchemata;
	public MyHelperClass StylingFunctions;
	public MyHelperClass StylingFactory;
	public MyHelperClass getStyleSheetCompilerFactory(){ return null; }

    public Document parse(Document document)  throws Throwable {
        CSSCompilerBuilder compilerBuilder = new CSSCompilerBuilder();
        StyleSheetCompilerFactory compilerFactory =(StyleSheetCompilerFactory)(Object) getStyleSheetCompilerFactory();
        compilerBuilder.setStyleSheetCompilerFactory(compilerFactory);
        CSSCompiler cssCompiler =(CSSCompiler)(Object) compilerBuilder.getCSSCompiler();
        CompiledStyleSheet defaultCompiledStyleSheet;
        try {
            URL url = getClass().getResource("/com/volantis/mcs/runtime/default.css");
            InputStream stream = url.openStream();
            defaultCompiledStyleSheet =(CompiledStyleSheet)(Object) cssCompiler.compile(new InputStreamReader(stream), null);
        } catch (IOException e) {
            throw new ExtendedRuntimeException((String)(Object)e);
        }
        StylingFactory stylingFactory =(StylingFactory)(Object) StylingFactory.getDefaultInstance();
        StylingEngine stylingEngine =(StylingEngine)(Object) stylingFactory.createStylingEngine(new InlineStyleSheetCompilerFactory(StylingFunctions.getResolver()));
        stylingEngine.pushStyleSheet(defaultCompiledStyleSheet);
        DocumentStyler styler = new DocumentStyler(stylingEngine, XDIMESchemata.CDM_NAMESPACE);
        styler.style(document);
        DOMWalker walker = new DOMWalker(new WalkingDOMVisitorStub() {

            public void visit(Element element) {
                if (element.getStyles() == null) {
                    throw new IllegalArgumentException("element " + element.getName() + " has no styles");
                }
            }
        });
        walker.walk(document);
        DOMTransformer transformer =(DOMTransformer)(Object) new DeferredInheritTransformer();
        document =(Document)(Object) transformer.transform(null, document);
        return document;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CDM_NAMESPACE;
public MyHelperClass getDefaultInstance(){ return null; }
	public MyHelperClass getResolver(){ return null; }}

class Document {

}

class CSSCompilerBuilder {

public MyHelperClass setStyleSheetCompilerFactory(StyleSheetCompilerFactory o0){ return null; }
	public MyHelperClass getCSSCompiler(){ return null; }}

class StyleSheetCompilerFactory {

}

class CSSCompiler {

public MyHelperClass compile(InputStreamReader o0, Object o1){ return null; }}

class CompiledStyleSheet {

}

class ExtendedRuntimeException extends Exception{
	public ExtendedRuntimeException(String errorMessage) { super(errorMessage); }
}

class StylingFactory {

public MyHelperClass createStylingEngine(InlineStyleSheetCompilerFactory o0){ return null; }}

class StylingEngine {

public MyHelperClass pushStyleSheet(CompiledStyleSheet o0){ return null; }}

class InlineStyleSheetCompilerFactory {

InlineStyleSheetCompilerFactory(MyHelperClass o0){}
	InlineStyleSheetCompilerFactory(){}}

class DocumentStyler {

DocumentStyler(){}
	DocumentStyler(StylingEngine o0, MyHelperClass o1){}
	public MyHelperClass style(Document o0){ return null; }}

class DOMWalker {

DOMWalker(){}
	DOMWalker( WalkingDOMVisitorStub o0){}
	public MyHelperClass walk(Document o0){ return null; }}

class WalkingDOMVisitorStub {

}

class DOMTransformer {

public MyHelperClass transform(Object o0, Document o1){ return null; }}

class DeferredInheritTransformer {

}

class Element {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getStyles(){ return null; }}
