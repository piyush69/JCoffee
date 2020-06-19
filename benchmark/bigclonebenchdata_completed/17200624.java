import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17200624 {
public MyHelperClass NULL;
public MyHelperClass _entryDisplay;
	public MyHelperClass LOGGER;
	public MyHelperClass _feedInfo;
	public MyHelperClass entriesList;
	public MyHelperClass disableSSLCertificateChecking(DefaultHttpClient o0){ return null; }

    public void run()  throws Throwable {
        MyHelperClass runCounter = new MyHelperClass();
        runCounter++;
        try {
//            MyHelperClass runCounter = new MyHelperClass();
            LOGGER.info("Fetching feed [" + runCounter + "] " + _feedInfo);
            DefaultHttpClient httpClient = new DefaultHttpClient();
            HttpContext localContext =(HttpContext)(Object) new BasicHttpContext();
            disableSSLCertificateChecking(httpClient);
            MyHelperClass _proxy = new MyHelperClass();
            if (_proxy != null && (boolean)(Object)_feedInfo.getUseProxy()) {
//                MyHelperClass _proxy = new MyHelperClass();
                LOGGER.info("Configuring proxy " + _proxy);
                MyHelperClass ConnRoutePNames = new MyHelperClass();
                httpClient.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, _proxy);
            }
            MyHelperClass _feedInfo = new MyHelperClass();
            if (_feedInfo.getUsername() != null) {
                Credentials credentials;
//                MyHelperClass _feedInfo = new MyHelperClass();
                if ((boolean)(Object)_feedInfo.getUsername().contains("/")) {
//                    MyHelperClass _feedInfo = new MyHelperClass();
                    String username =(String)(Object) _feedInfo.getUsername().substring((int)(Object)_feedInfo.getUsername().indexOf("/") + 1);
//                    MyHelperClass _feedInfo = new MyHelperClass();
                    String domain =(String)(Object) _feedInfo.getUsername().substring(0, _feedInfo.getUsername().indexOf("/"));
                    String workstation = InetAddress.getLocalHost().getHostName();
                    MyHelperClass LOGGER = new MyHelperClass();
                    LOGGER.info("Configuring NT credentials : username=[" + username + "] domain=[" + domain + "] workstation=[" + workstation + "]");
//                    MyHelperClass _feedInfo = new MyHelperClass();
                    credentials =(Credentials)(Object) new NTCredentials(username, _feedInfo.getPassword(), workstation, domain);
                    httpClient.getAuthSchemes().register("ntlm", new NTLMSchemeFactory());
                    MyHelperClass AuthScope = new MyHelperClass();
                    httpClient.getCredentialsProvider().setCredentials(AuthScope.ANY, credentials);
                } else {
//                    MyHelperClass _feedInfo = new MyHelperClass();
                    credentials =(Credentials)(Object) new UsernamePasswordCredentials(_feedInfo.getUsername(), _feedInfo.getPassword());
                    MyHelperClass LOGGER = new MyHelperClass();
                    LOGGER.info("Configuring Basic credentials " + credentials);
                    MyHelperClass AuthScope = new MyHelperClass();
                    httpClient.getCredentialsProvider().setCredentials(AuthScope.ANY, credentials);
                }
            }
//            MyHelperClass _feedInfo = new MyHelperClass();
            if (_feedInfo.getCookie() != null) {
//                MyHelperClass _feedInfo = new MyHelperClass();
                BasicClientCookie cookie = new BasicClientCookie(_feedInfo.getCookie().getName(), _feedInfo.getCookie().getValue());
                cookie.setVersion(0);
//                MyHelperClass _feedInfo = new MyHelperClass();
                if (_feedInfo.getCookie().getDomain() != null) cookie.setDomain(_feedInfo.getCookie().getDomain());
//                MyHelperClass _feedInfo = new MyHelperClass();
                if (_feedInfo.getCookie().getPath() != null) cookie.setPath(_feedInfo.getCookie().getPath());
                MyHelperClass LOGGER = new MyHelperClass();
                LOGGER.info("Adding cookie " + cookie);
                CookieStore cookieStore =(CookieStore)(Object) new BasicCookieStore();
                cookieStore.addCookie(cookie);
                MyHelperClass ClientContext = new MyHelperClass();
                localContext.setAttribute(ClientContext.COOKIE_STORE, cookieStore);
            }
//            MyHelperClass _feedInfo = new MyHelperClass();
            HttpGet httpget = new HttpGet(_feedInfo.getUrl());
            HttpResponse response =(HttpResponse)(Object) httpClient.execute(httpget, localContext);
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.info("Response Status : " + response.getStatusLine());
//            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.debug("Headers : " + Arrays.toString((long[])(Object)response.getAllHeaders()));
            MyHelperClass HttpStatus = new MyHelperClass();
            if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
//                MyHelperClass _feedInfo = new MyHelperClass();
                LOGGER.error("Request was unsuccessful for " + _feedInfo + " : " + response.getStatusLine());
            } else {
                SyndFeedInput input = new SyndFeedInput();
                XmlReader reader = new XmlReader(response.getEntity().getContent());
                SyndFeed feed =(SyndFeed)(Object) input.build(reader);
//                MyHelperClass _feedInfo = new MyHelperClass();
                if (feed.getTitle() != null) _feedInfo.setTitle(feed.getTitle());
//                MyHelperClass LOGGER = new MyHelperClass();
                LOGGER.debug("Feed : " + new SyndFeedOutput().outputString(feed));
//                MyHelperClass LOGGER = new MyHelperClass();
                LOGGER.info("Feed [" + feed.getTitle() + "] contains " + feed.getEntries().size() + " entries");
//                @SuppressWarnings("unchecked") List<SyndEntry> entriesList = feed.getEntries();
                Collections.sort(entriesList, new SyndEntryPublishedDateComparator());
                for (SyndEntry entry :(SyndEntry[])(Object) (Object[])(Object)entriesList) {
                    MyHelperClass VisitedEntries = new MyHelperClass();
                    if ((boolean)(Object)VisitedEntries.getInstance().isAlreadyVisited(entry.getUri())) {
//                        MyHelperClass LOGGER = new MyHelperClass();
                        LOGGER.debug("Already received " + entry.getUri());
                    } else {
//                        MyHelperClass _feedInfo = new MyHelperClass();
                        _feedInfo.addEntry(entry);
//                        MyHelperClass LOGGER = new MyHelperClass();
                        LOGGER.debug("New entry " + entry.toString());
                        MyHelperClass firstRun = new MyHelperClass();
                        _entryDisplay.displayEntry(feed, entry, firstRun);
                    }
                }
//                MyHelperClass LOGGER = new MyHelperClass();
                LOGGER.info("Completing entries for feed " + feed.getTitle());
                boolean firstRun =(boolean)(Object) NULL; //new boolean();
                if ((boolean)(Object)firstRun) firstRun = false;
            }
        } catch (IllegalArgumentException e) {
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.error(e.getMessage(), e);
        } catch (FeedException e) {
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.error(e.getMessage(), e);
        } catch (IOException e) {
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.error(e.getMessage(), e);
        } catch (KeyManagementException e) {
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.error(e.getMessage(), e);
        } catch (NoSuchAlgorithmException e) {
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.error(e.getMessage(), e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass COOKIE_STORE;
	public MyHelperClass SC_OK;
	public MyHelperClass DEFAULT_PROXY;
	public int runCounter;
	public MyHelperClass ANY;
public MyHelperClass setCredentials(MyHelperClass o0, Credentials o1){ return null; }
	public MyHelperClass contains(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getUsername(){ return null; }
	public MyHelperClass error(String o0, IllegalArgumentException o1){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass getContent(){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass indexOf(String o0){ return null; }
	public MyHelperClass getUseProxy(){ return null; }
	public MyHelperClass substring(int o0){ return null; }
	public MyHelperClass getDomain(){ return null; }
	public MyHelperClass getValue(){ return null; }
	public MyHelperClass addEntry(SyndEntry o0){ return null; }
	public MyHelperClass error(String o0, NoSuchAlgorithmException o1){ return null; }
	public MyHelperClass setTitle(MyHelperClass o0){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getUrl(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass error(String o0, KeyManagementException o1){ return null; }
	public MyHelperClass error(String o0, FeedException o1){ return null; }
	public MyHelperClass displayEntry(SyndFeed o0, SyndEntry o1, MyHelperClass o2){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass register(String o0, NTLMSchemeFactory o1){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass setParameter(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass isAlreadyVisited(MyHelperClass o0){ return null; }
	public MyHelperClass substring(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass getCookie(){ return null; }
	public MyHelperClass getPassword(){ return null; }}

class DefaultHttpClient {

public MyHelperClass getAuthSchemes(){ return null; }
	public MyHelperClass getParams(){ return null; }
	public MyHelperClass getCredentialsProvider(){ return null; }
	public MyHelperClass execute(HttpGet o0, HttpContext o1){ return null; }}

class HttpContext {

public MyHelperClass setAttribute(MyHelperClass o0, CookieStore o1){ return null; }}

class BasicHttpContext {

}

class Credentials {

}

class NTCredentials {

NTCredentials(String o0, MyHelperClass o1, String o2, String o3){}
	NTCredentials(){}}

class NTLMSchemeFactory {

}

class UsernamePasswordCredentials {

UsernamePasswordCredentials(MyHelperClass o0, MyHelperClass o1){}
	UsernamePasswordCredentials(){}}

class BasicClientCookie {

BasicClientCookie(){}
	BasicClientCookie(MyHelperClass o0, MyHelperClass o1){}
	public MyHelperClass setDomain(MyHelperClass o0){ return null; }
	public MyHelperClass setPath(MyHelperClass o0){ return null; }
	public MyHelperClass setVersion(int o0){ return null; }}

class BasicCookieStore {

}

class HttpGet {

HttpGet(MyHelperClass o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getAllHeaders(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class SyndFeedInput {

public MyHelperClass build(XmlReader o0){ return null; }}

class XmlReader {

XmlReader(MyHelperClass o0){}
	XmlReader(){}}

class SyndFeed {

public MyHelperClass getTitle(){ return null; }
	public MyHelperClass getEntries(){ return null; }}

class SyndFeedOutput {

public MyHelperClass outputString(SyndFeed o0){ return null; }}

class SyndEntry {

public MyHelperClass getUri(){ return null; }}

class SyndEntryPublishedDateComparator {

}

class FeedException extends Exception{
	public FeedException(String errorMessage) { super(errorMessage); }
}

class CookieStore {

public MyHelperClass addCookie(BasicClientCookie o0){ return null; }}

class Collections {

public static MyHelperClass sort(MyHelperClass o0, SyndEntryPublishedDateComparator o1){ return null; }}
