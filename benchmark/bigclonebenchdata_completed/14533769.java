
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c14533769 {
public MyHelperClass createIndexVersion(Long o0, String o1, UserInfo o2){ return null; }
public MyHelperClass DEFAULT_WIKI_INDEX_SITE_TEXT;
	public MyHelperClass LOGGER;
	public MyHelperClass IOUtils;
	public MyHelperClass getSecurityService(){ return null; }

    private WikiSiteContentInfo createInfoIndexSite(Long domainId) {
        final UserInfo user =(UserInfo)(Object) getSecurityService().getCurrentUser();
        final Locale locale = new Locale(user.getLocale());
        final String country =(String)(Object) locale.getLanguage();
        InputStream inStream =(InputStream)(Object) Thread.currentThread().getContextClassLoader().getResourceAsStream("wiki_index_" + country + ".xhtml");
        if (inStream == null) {
            inStream =(InputStream)(Object) Thread.currentThread().getContextClassLoader().getResourceAsStream("wiki_index.xhtml");
        }
        if (inStream == null) {
            inStream =(InputStream)(Object) new ByteArrayInputStream(DEFAULT_WIKI_INDEX_SITE_TEXT.getBytes());
        }
        if (inStream != null) {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            try {
                IOUtils.copyLarge(inStream, out);
                return(WikiSiteContentInfo)(Object) createIndexVersion(domainId, out.toString(), user);
            } catch (UncheckedIOException exception) {
                LOGGER.error("Error creating info page.",(IOException)(Object) exception);
            } finally {
                try {
                    inStream.close();
                    out.close();
                } catch (UncheckedIOException exception) {
                    LOGGER.error("Error reading wiki_index.xhtml",(IOException)(Object) exception);
                }
            }
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyLarge(InputStream o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass getCurrentUser(){ return null; }
	public MyHelperClass getBytes(){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }}

class WikiSiteContentInfo {

}

class UserInfo {

public MyHelperClass getLocale(){ return null; }}

class Locale {

Locale(MyHelperClass o0){}
	Locale(){}
	public MyHelperClass getLanguage(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class ByteArrayInputStream {

ByteArrayInputStream(MyHelperClass o0){}
	ByteArrayInputStream(){}}

class ByteArrayOutputStream {

public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
