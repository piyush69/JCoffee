
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c3809797 {
public MyHelperClass isToBeAdded(String o0, MarinerPageContext o1){ return null; }
public MyHelperClass exceptionLocalizer;
	public MyHelperClass logger;
	public MyHelperClass isFullyQualifiedURL(String o0){ return null; }

    protected void addAssetResources(MimeMultipart pkg, MarinerPageContext context) throws PackagingException {
        boolean includeFullyQualifiedURLs =(boolean)(Object) context.getBooleanDevicePolicyValue("protocol.mime.fully.qualified.urls");
        MarinerRequestContext requestContext =(MarinerRequestContext)(Object) context.getRequestContext();
        MyHelperClass ContextInternals = new MyHelperClass();
        ApplicationContext ac =(ApplicationContext)(Object) ContextInternals.getApplicationContext(requestContext);
        PackageResources pr =(PackageResources)(Object) ac.getPackageResources();
        List encodedURLs =(List)(Object) pr.getEncodedURLs();
        Map assetURLMap =(Map)(Object) pr.getAssetURLMap();
        Iterator iterator;
        String encodedURL;
        Asset asset;
        String assetURL = null;
        BodyPart assetPart;
        if (encodedURLs != null) {
            iterator =(Iterator)(Object) encodedURLs.iterator();
        } else {
            iterator =(Iterator)(Object) assetURLMap.keySet().iterator();
        }
        while ((boolean)(Object)iterator.hasNext()) {
            encodedURL = (String)(String)(Object) iterator.next();
            asset = (Asset)(Asset)(Object) assetURLMap.get(encodedURL);
            assetURL =(String)(Object) asset.getValue();
            if (includeFullyQualifiedURLs || !(Boolean)(Object)isFullyQualifiedURL(assetURL)) {
                if ((boolean)(Object)isToBeAdded(assetURL, context)) {
                    assetPart =(BodyPart)(Object) new MimeBodyPart();
                    try {
                        if (!(Boolean)(Object)asset.getOnClientSide()) {
                            URL url = null;
                            URLConnection connection;
                            try {
                                url =(URL)(Object) context.getAbsoluteURL(new MarinerURL(assetURL));
                                connection =(URLConnection)(Object) url.openConnection();
                                if (connection != null) {
                                    connection.setDoInput(true);
                                    connection.setDoOutput(false);
                                    connection.setAllowUserInteraction(false);
                                    connection.connect();
                                    connection.getInputStream();
                                    assetPart.setDataHandler(new DataHandler(url));
                                    assetPart.setHeader("Content-Location", assetURL);
                                    pkg.addBodyPart(assetPart);
                                }
                            } catch (UncheckedIOException e) {
                                if ((boolean)(Object)logger.isDebugEnabled()) {
                                    logger.debug("Ignoring asset with malformed URL: " + url.toString());
                                }
                            } catch (ArithmeticException e) {
                                if ((boolean)(Object)logger.isDebugEnabled()) {
                                    logger.debug("Ignoring asset with URL that doesn't " + "exist: " + assetURL + " (" + url.toString() + ")");
                                }
                            }
                        } else {
                            assetPart.setHeader("Content-Location", "file://" + assetURL);
                        }
                    } catch (UncheckedIOException e) {
                        throw new PackagingException(exceptionLocalizer.format("could-not-add-asset", encodedURL),(MessagingException)(Object) e);
                    }
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getApplicationContext(MarinerRequestContext o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass format(String o0, String o1){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }}

class MimeMultipart {

public MyHelperClass addBodyPart(BodyPart o0){ return null; }}

class MarinerPageContext {

public MyHelperClass getBooleanDevicePolicyValue(String o0){ return null; }
	public MyHelperClass getAbsoluteURL(MarinerURL o0){ return null; }
	public MyHelperClass getRequestContext(){ return null; }}

class PackagingException extends Exception{
	public PackagingException(String errorMessage) { super(errorMessage); }
	PackagingException(){}
	PackagingException(MyHelperClass o0, MessagingException o1){}
}

class MarinerRequestContext {

}

class ApplicationContext {

public MyHelperClass getPackageResources(){ return null; }}

class PackageResources {

public MyHelperClass getEncodedURLs(){ return null; }
	public MyHelperClass getAssetURLMap(){ return null; }}

class List {

public MyHelperClass iterator(){ return null; }}

class Map {

public MyHelperClass keySet(){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class Iterator {

public MyHelperClass next(){ return null; }
	public MyHelperClass hasNext(){ return null; }}

class BodyPart {

public MyHelperClass setDataHandler(DataHandler o0){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class MimeBodyPart {

}

class URL {

public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setAllowUserInteraction(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class MarinerURL {

MarinerURL(String o0){}
	MarinerURL(){}}

class DataHandler {

DataHandler(){}
	DataHandler(URL o0){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class MessagingException extends Exception{
	public MessagingException(String errorMessage) { super(errorMessage); }
}

class Asset {

public MyHelperClass getOnClientSide(){ return null; }
	public MyHelperClass getValue(){ return null; }}
