import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7839474 {
public MyHelperClass createFile(MyHelperClass o0, String o1){ return null; }
public MyHelperClass createAttributesCopyWithClonedAttribute(BaseFrame o0, String o1){ return null; }
	public MyHelperClass getFileExtension(Page o0){ return null; }

    private Map<String, DomAttr> getAttributesFor(final BaseFrame frame) throws Throwable, IOException {
        final Map<String, DomAttr> map =(Map<String,DomAttr>)(Object) createAttributesCopyWithClonedAttribute(frame, "src");
        final DomAttr srcAttr = map.get("src");
        if (srcAttr == null) {
            return map;
        }
        final Page enclosedPage =(Page)(Object) frame.getEnclosedPage();
        final String suffix =(String)(Object) getFileExtension(enclosedPage);
        final File file =(File)(Object) createFile(srcAttr.getValue(), "." + suffix);
        if ((HtmlPage)(Object)enclosedPage instanceof HtmlPage) {
            file.delete();
            ((HtmlPage)(HtmlPage)(Object) enclosedPage).save(file);
        } else {
            final InputStream is =(InputStream)(Object) enclosedPage.getWebResponse().getContentAsStream();
            final FileOutputStream fos = new FileOutputStream(file);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyLarge(is, fos);
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(is);
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(fos);
        }
        MyHelperClass FILE_SEPARATOR = new MyHelperClass();
        srcAttr.setValue(file.getParentFile().getName() + FILE_SEPARATOR + file.getName());
        return map;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass getContentAsStream(){ return null; }
	public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }
	public MyHelperClass copyLarge(InputStream o0, FileOutputStream o1){ return null; }}

class BaseFrame {

public MyHelperClass getEnclosedPage(){ return null; }}

class DomAttr {

public MyHelperClass setValue(String o0){ return null; }
	public MyHelperClass getValue(){ return null; }}

class Page {

public MyHelperClass getWebResponse(){ return null; }}

class HtmlPage {

public MyHelperClass save(File o0){ return null; }}
