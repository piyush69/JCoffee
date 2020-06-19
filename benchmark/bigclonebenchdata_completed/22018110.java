import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22018110 {
public MyHelperClass log(MyHelperClass o0){ return null; }
public MyHelperClass PrintUtils;
	public MyHelperClass _caches;
	public MyHelperClass _lock;
	public MyHelperClass getServletContext(){ return null; }

    private CachedQuery loadQuery(String path) throws Throwable, CacheException, IOException, XQueryException {
        final URL url;
        final long lastModified;
        final InputStream is;
        try {
            url =(URL)(Object) getServletContext().getResource(path);
            assert (url != null);
            lastModified = url.openConnection().getLastModified();
            is = url.openStream();
        } catch (IOException e) {
            log(PrintUtils.prettyPrintStackTrace(e, -1));
            throw e;
        }
        _lock.readLock().lock();
        CachedQuery cached =(CachedQuery)(Object) _caches.get(path);
        if (cached == null ||(long)(Object) cached.loadTimeStamp < lastModified) {
            if (cached == null) {
                cached = new CachedQuery();
            }
            XQueryParser parser = new XQueryParser(is);
            StaticContext staticEnv =(StaticContext)(Object) parser.getStaticContext();
            try {
                URI baseUri = url.toURI();
                staticEnv.setBaseURI(baseUri);
            } catch (URISyntaxException e) {
                log(PrintUtils.prettyPrintStackTrace(e, -1));
            }
            final XQueryModule module;
            try {
                module =(XQueryModule)(Object) parser.parse();
            } catch (ArithmeticException e) {
                log(PrintUtils.prettyPrintStackTrace((IOException)(Object)e, -1));
                _lock.readLock().unlock();
                throw e;
            }
            _lock.readLock().unlock();
            _lock.writeLock().lock();
            cached.queryObject =(MyHelperClass)(Object) module;
            cached.staticEnv =(MyHelperClass)(Object) staticEnv;
            cached.loadTimeStamp =(MyHelperClass)(Object) System.currentTimeMillis();
            _caches.put(path, cached);
            _lock.writeLock().unlock();
            _lock.readLock().lock();
            try {
                module.staticAnalysis(staticEnv);
            } catch (ArrayIndexOutOfBoundsException e) {
                log(PrintUtils.prettyPrintStackTrace((IOException)(Object)e, -1));
                _lock.readLock().unlock();
                throw e;
            }
        }
        _lock.readLock().unlock();
        return cached;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass put(String o0, CachedQuery o1){ return null; }
	public MyHelperClass unlock(){ return null; }
	public MyHelperClass writeLock(){ return null; }
	public MyHelperClass getResource(String o0){ return null; }
	public MyHelperClass prettyPrintStackTrace(IOException o0, int o1){ return null; }
	public MyHelperClass readLock(){ return null; }
	public MyHelperClass lock(){ return null; }
	public MyHelperClass prettyPrintStackTrace(URISyntaxException o0, int o1){ return null; }
	public MyHelperClass prettyPrintStackTrace(XQueryException o0, int o1){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class CachedQuery {
public MyHelperClass loadTimeStamp;
	public MyHelperClass staticEnv;
	public MyHelperClass queryObject;
}

class CacheException extends Exception{
	public CacheException(String errorMessage) { super(errorMessage); }
}

class XQueryException extends Exception{
	public XQueryException(String errorMessage) { super(errorMessage); }
}

class XQueryParser {

XQueryParser(InputStream o0){}
	XQueryParser(){}
	public MyHelperClass parse(){ return null; }
	public MyHelperClass getStaticContext(){ return null; }}

class StaticContext {

public MyHelperClass setBaseURI(URI o0){ return null; }}

class XQueryModule {

public MyHelperClass staticAnalysis(StaticContext o0){ return null; }}
