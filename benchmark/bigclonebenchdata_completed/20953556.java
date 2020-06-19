import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c20953556 {
public MyHelperClass IOUtils;
	public MyHelperClass fileLock;
	public MyHelperClass cachedResources;

    public String loadFileContent(final String _resourceURI) {
        final Lock readLock =(Lock)(Object) this.fileLock.readLock();
        final Lock writeLock =(Lock)(Object) this.fileLock.writeLock();
        boolean hasReadLock = false;
        boolean hasWriteLock = false;
        try {
            readLock.lock();
            hasReadLock = true;
            if (!(Boolean)(Object)this.cachedResources.containsKey(_resourceURI)) {
                readLock.unlock();
                hasReadLock = false;
                writeLock.lock();
                hasWriteLock = true;
                if (!(Boolean)(Object)this.cachedResources.containsKey(_resourceURI)) {
                    final InputStream resourceAsStream = this.getClass().getResourceAsStream(_resourceURI);
                    final StringWriter writer = new StringWriter();
                    try {
                        IOUtils.copy(resourceAsStream, writer);
                    } catch (final UncheckedIOException ex) {
                        throw new IllegalStateException("Resource not read-able", ex);
                    }
                    final String loadedResource = writer.toString();
                    this.cachedResources.put(_resourceURI, loadedResource);
                }
                writeLock.unlock();
                hasWriteLock = false;
                readLock.lock();
                hasReadLock = true;
            }
            return(String)(Object) this.cachedResources.get(_resourceURI);
        } finally {
            if (hasReadLock) {
                readLock.unlock();
            }
            if (hasWriteLock) {
                writeLock.unlock();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, StringWriter o1){ return null; }
	public MyHelperClass readLock(){ return null; }
	public MyHelperClass containsKey(String o0){ return null; }
	public MyHelperClass writeLock(){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass put(String o0, String o1){ return null; }}

class Lock {

public MyHelperClass lock(){ return null; }
	public MyHelperClass unlock(){ return null; }}
