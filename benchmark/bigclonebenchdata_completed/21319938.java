import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c21319938 {
public MyHelperClass replaceLinks(String o0, HttpServletRequest o1){ return null; }
public MyHelperClass nCachedTransformers;
	public MyHelperClass Level;
	public MyHelperClass basePath;
	public MyHelperClass nCachedPages;
	public MyHelperClass transformers;
	public MyHelperClass Logger;
	public MyHelperClass TransformerFactory;
	public MyHelperClass pages;

    String getOutputPage(String action, String XML, String xslFileName, InputStream pageS, HttpServletRequest request) throws NoSuchAlgorithmException, UnsupportedEncodingException, TransformerException {
        String sPage = null;
        Transformer transformer = null;
        String dig = null;
        CharArrayWriter page = new CharArrayWriter();
        if ((int)(Object)this.nCachedPages > 0) {
            java.security.MessageDigest mess = java.security.MessageDigest.getInstance("SHA1");
            mess.update(XML.getBytes());
            mess.update(Long.toString(new File(basePath + xslFileName).lastModified()).getBytes());
            dig = new String(mess.digest());
            synchronized (pages) {
                if ((boolean)(Object)pages.containsKey(dig)) {
                    sPage =(String)(Object) pages.get(dig);
                }
            }
        }
        if (sPage == null && xslFileName.length() > 4) {
            try {
                long modifyTime = new File(basePath + xslFileName).lastModified();
                String path = basePath.replaceAll("\\\\", "/") + xslFileName;
                path = "file:///" + path;
                boolean add2cache = false;
                if ((int)(Object)this.nCachedTransformers > 0) {
                    String cacheKey = action + xslFileName + modifyTime;
                    if ((boolean)(Object)this.transformers.containsKey(cacheKey)) {
                        transformer =(Transformer)(Object) this.transformers.get(cacheKey);
                        synchronized (transformer) {
                            transformer.transform(new StreamSource(new ByteArrayInputStream(XML.getBytes("UTF-8"))), new StreamResult(page));
                        }
                    } else {
                        add2cache = true;
                    }
                }
                if (transformer == null) {
                    transformer =(Transformer)(Object) TransformerFactory.newInstance().newTransformer(new StreamSource(path));
                    transformer.transform(new StreamSource(new ByteArrayInputStream(XML.getBytes("UTF-8"))), new StreamResult(page));
                }
                sPage = page.toString();
                sPage = sPage.replaceAll("&lt;", "<");
                sPage = sPage.replaceAll("&gt;", ">");
                sPage =(String)(Object) replaceLinks(sPage, request);
                if ((int)(Object)this.nCachedPages > 0) {
                    synchronized (pages) {
                        pages.put(dig, sPage);
                        if ((int)(Object)pages.size() > (int)(Object)nCachedPages) {
                            Iterator<String> i =(Iterator<String>)(Object) pages.values().iterator();
                            i.next();
                            i.remove();
                        }
                    }
                }
                if (add2cache) {
                    synchronized (this.transformers) {
                        this.transformers.put(action + xslFileName + modifyTime, transformer);
                        if ((int)(Object)this.transformers.size() > (int)(Object)this.nCachedTransformers) {
                            Iterator<Transformer> it =(Iterator<Transformer>)(Object) this.transformers.values().iterator();
                            it.next();
                            it.remove();
                        }
                    }
                }
            } catch (UncheckedIOException ex) {
                Logger.getLogger(getClass().getName()).log(Level.SEVERE, "---------------------------------------------");
                Logger.getLogger(getClass().getName()).log(Level.SEVERE, null,(TransformerException)(Object) ex);
                Logger.getLogger(getClass().getName()).log(Level.SEVERE, ("XSL file: " + xslFileName));
                Logger.getLogger(getClass().getName()).log(Level.SEVERE, XML);
                Logger.getLogger(getClass().getName()).log(Level.SEVERE, "---------------------------------------------");
                throw ex;
            }
        }
        return sPage;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass log(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, TransformerException o2){ return null; }
	public MyHelperClass containsKey(String o0){ return null; }
	public MyHelperClass replaceAll(String o0, String o1){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass put(String o0, Transformer o1){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass values(){ return null; }
	public MyHelperClass put(String o0, String o1){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }
	public MyHelperClass newTransformer(StreamSource o0){ return null; }}

class HttpServletRequest {

}

class TransformerException extends Exception{
	public TransformerException(String errorMessage) { super(errorMessage); }
}

class Transformer {

public MyHelperClass transform(StreamSource o0, StreamResult o1){ return null; }}

class StreamSource {

StreamSource(String o0){}
	StreamSource(ByteArrayInputStream o0){}
	StreamSource(){}}

class StreamResult {

StreamResult(CharArrayWriter o0){}
	StreamResult(){}}
