import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18490448 {
public MyHelperClass HTMLAttr;
	public MyHelperClass IOUtils;
	public MyHelperClass getTheme(){ return null; }
	public MyHelperClass getRequestContext(){ return null; }
	public MyHelperClass getResponseWriter(){ return null; }

//    @Deprecated
    public void encodeBegin(FacesContext context, UIComponent component) throws Throwable, IOException {
        XUIResponseWriter w =(XUIResponseWriter)(Object) getResponseWriter();
        XUIViewRoot viewRoot = (XUIViewRoot)(XUIViewRoot)(Object) component;
        XUIResponseWriter headerW =(XUIResponseWriter)(Object) getResponseWriter().getHeaderWriter();
        headerW.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<!DOCTYPE foo [\n");
        InputStream is1 = Thread.currentThread().getContextClassLoader().getResourceAsStream("xhtml-lat1.ent");
        headerW.write(new String((String)(Object)IOUtils.copyByte(is1)));
        headerW.write("\n");
        is1.close();
        InputStream is2 = Thread.currentThread().getContextClassLoader().getResourceAsStream("xhtml-special.ent");
        headerW.write(new String((String)(Object)IOUtils.copyByte(is2)));
        headerW.write("\n");
        is2.close();
        InputStream is3 = Thread.currentThread().getContextClassLoader().getResourceAsStream("xhtml-symbol.ent");
        headerW.write(new String((String)(Object)IOUtils.copyByte(is3)));
        headerW.write("\n]>\n");
        is3.close();
        headerW.startElement("html", component);
        XUITheme t =(XUITheme)(Object) getTheme();
        if (t != null) {
            headerW.writeAttribute("style",(String)(Object) getTheme().getHtmlStyle(), "style");
        }
        headerW.startElement("head", component);
        headerW.startElement("base", component);
        HttpServletRequest req = (HttpServletRequest)(HttpServletRequest)(Object) getRequestContext().getRequest();
        String link = ((boolean)(Object)req.isSecure() ? "https" : "http") + "://" + req.getServerName() + ((int)(Object)req.getServerPort() == 80 ? "" : ":" + req.getServerPort()) + getRequestContext().getResourceUrl("");
        headerW.writeAttribute("href", link, "href");
        headerW.endElement("base");
        w.startElement("body", component);
        if (t != null && t.getBodyStyle() != null) {
            w.writeAttribute("style", getTheme().getBodyStyle() + ";height:100%;width:100%", "style");
        }
        headerW.writeText('\n');
        w.startElement("div", component);
        w.writeAttribute("id",(String)(Object) ((XUIViewRoot)(XUIViewRoot)(Object) component).getClientId(), "id");
        if (viewRoot.findComponent((Window)(Object)Window.class) != null) {
            w.writeAttribute((String)(Object)HTMLAttr.CLASS, "x-panel", "");
        }
        w.writeAttribute("style", "width:100%;height:100%", null);
        if (t != null) {
            t.addScripts(w.getScriptContext());
            t.addStyle(w.getStyleContext());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CLASS;
public MyHelperClass getResourceUrl(String o0){ return null; }
	public MyHelperClass getBodyStyle(){ return null; }
	public MyHelperClass copyByte(InputStream o0){ return null; }
	public MyHelperClass getRequest(){ return null; }
	public MyHelperClass getHeaderWriter(){ return null; }
	public MyHelperClass getHtmlStyle(){ return null; }}

class FacesContext {

}

class UIComponent {

}

class XUIResponseWriter {

public MyHelperClass writeAttribute(String o0, String o1, Object o2){ return null; }
	public MyHelperClass endElement(String o0){ return null; }
	public MyHelperClass writeText(char o0){ return null; }
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass getStyleContext(){ return null; }
	public MyHelperClass getScriptContext(){ return null; }
	public MyHelperClass writeAttribute(String o0, String o1, String o2){ return null; }
	public MyHelperClass startElement(String o0, UIComponent o1){ return null; }}

class XUIViewRoot {

public MyHelperClass findComponent(Window o0){ return null; }
	public MyHelperClass getClientId(){ return null; }}

class XUITheme {

public MyHelperClass getBodyStyle(){ return null; }
	public MyHelperClass addScripts(MyHelperClass o0){ return null; }
	public MyHelperClass addStyle(MyHelperClass o0){ return null; }}

class HttpServletRequest {

public MyHelperClass getServerPort(){ return null; }
	public MyHelperClass isSecure(){ return null; }
	public MyHelperClass getServerName(){ return null; }}

class Window {

}
