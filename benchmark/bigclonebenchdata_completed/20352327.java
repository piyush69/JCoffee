import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20352327 {
public MyHelperClass Lock;
	public MyHelperClass xmldbUri;

    public XmldbURI createFile(String newName, InputStream is, Long length, String contentType) throws Throwable, IOException, PermissionDeniedException, CollectionDoesNotExistException {
        MyHelperClass LOG = new MyHelperClass();
        if ((boolean)(Object)LOG.isDebugEnabled()) LOG.debug("Create '" + newName + "' in '" + xmldbUri + "'");
        MyHelperClass XmldbURI = new MyHelperClass();
        XmldbURI newNameUri =(XmldbURI)(Object) XmldbURI.create(newName);
        MyHelperClass MimeTable = new MyHelperClass();
        MimeType mime =(MimeType)(Object) MimeTable.getInstance().getContentTypeFor(newName);
        if (mime == null) {
            MyHelperClass MimeType = new MyHelperClass();
            mime =(MimeType)(Object) MimeType.BINARY_TYPE;
        }
        DBBroker broker = null;
        Collection collection = null;
        BufferedInputStream bis = new BufferedInputStream(is);
        VirtualTempFile vtf = new VirtualTempFile();
        BufferedOutputStream bos = new BufferedOutputStream((OutputStream)(Object)vtf);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(bis, bos);
        bis.close();
        bos.close();
        vtf.close();
        if ((boolean)(Object)mime.isXMLType() &&(long)(Object) vtf.length() == 0L) {
//            MyHelperClass LOG = new MyHelperClass();
            if ((boolean)(Object)LOG.isDebugEnabled()) LOG.debug("Creating dummy XML file for null resource lock '" + newNameUri + "'");
            vtf = new VirtualTempFile();
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.write("<null_resource/>", vtf);
            vtf.close();
        }
        MyHelperClass brokerPool = new MyHelperClass();
        TransactionManager transact =(TransactionManager)(Object) brokerPool.getTransactionManager();
        Txn txn =(Txn)(Object) transact.beginTransaction();
        try {
            MyHelperClass subject = new MyHelperClass();
            broker =(DBBroker)(Object) brokerPool.get(subject);
            MyHelperClass xmldbUri = new MyHelperClass();
            collection =(Collection)(Object) broker.openCollection(xmldbUri, Lock.WRITE_LOCK);
            if (collection == null) {
//                MyHelperClass xmldbUri = new MyHelperClass();
                LOG.debug("Collection " + xmldbUri + " does not exist");
                transact.abort(txn);
//                MyHelperClass xmldbUri = new MyHelperClass();
                throw new CollectionDoesNotExistException(xmldbUri + "");
            }
            if ((boolean)(Object)mime.isXMLType()) {
//                MyHelperClass LOG = new MyHelperClass();
                if ((boolean)(Object)LOG.isDebugEnabled()) LOG.debug("Inserting XML document '" + mime.getName() + "'");
                VirtualTempFileInputSource vtfis = new VirtualTempFileInputSource(vtf);
                IndexInfo info =(IndexInfo)(Object) collection.validateXMLResource(txn, broker, newNameUri, vtfis);
                DocumentImpl doc =(DocumentImpl)(Object) info.getDocument();
                doc.getMetadata().setMimeType(mime.getName());
                collection.store(txn, broker, info, vtfis, false);
            } else {
//                MyHelperClass LOG = new MyHelperClass();
                if ((boolean)(Object)LOG.isDebugEnabled()) LOG.debug("Inserting BINARY document '" + mime.getName() + "'");
                InputStream fis =(InputStream)(Object) vtf.getByteStream();
                bis = new BufferedInputStream(fis);
                DocumentImpl doc =(DocumentImpl)(Object) collection.addBinaryResource(txn, broker, newNameUri, bis, mime.getName(), length.longValue());
                bis.close();
            }
            transact.commit(txn);
//            MyHelperClass LOG = new MyHelperClass();
            if ((boolean)(Object)LOG.isDebugEnabled()) LOG.debug("Document created sucessfully");
        } catch (ArithmeticException e) {
//            MyHelperClass LOG = new MyHelperClass();
            LOG.error((EXistException)(Object)e);
            transact.abort(txn);
            throw new IOException(e);
        } catch (ArrayIndexOutOfBoundsException e) {
//            MyHelperClass LOG = new MyHelperClass();
            LOG.error((EXistException)(Object)e);
            transact.abort(txn);
            throw new IOException(e);
        } catch (ArrayStoreException e) {
//            MyHelperClass LOG = new MyHelperClass();
            LOG.error((EXistException)(Object)e);
            transact.abort(txn);
            throw new IOException(e);
        } catch (ClassCastException e) {
//            MyHelperClass LOG = new MyHelperClass();
            LOG.error((EXistException)(Object)e);
            transact.abort(txn);
            MyHelperClass xmldbUri = new MyHelperClass();
            throw new PermissionDeniedException(xmldbUri + "");
        } catch (IOException e) {
//            MyHelperClass LOG = new MyHelperClass();
            LOG.error(e);
            transact.abort(txn);
            throw e;
        } catch (IllegalArgumentException e) {
//            MyHelperClass LOG = new MyHelperClass();
            LOG.error((EXistException)(Object)e);
            transact.abort(txn);
            throw e;
        } finally {
            if (vtf != null) {
                vtf.delete();
            }
            if (collection != null) {
                MyHelperClass Lock = new MyHelperClass();
                collection.release(Lock.WRITE_LOCK);
            }
//            MyHelperClass brokerPool = new MyHelperClass();
            brokerPool.release(broker);
//            MyHelperClass LOG = new MyHelperClass();
            if ((boolean)(Object)LOG.isDebugEnabled()) LOG.debug("Finished creation");
        }
        MyHelperClass xmldbUri = new MyHelperClass();
        XmldbURI newResource =(XmldbURI)(Object) xmldbUri.append(newName);
        return newResource;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_TYPE;
	public MyHelperClass WRITE_LOCK;
public MyHelperClass write(String o0, VirtualTempFile o1){ return null; }
	public MyHelperClass error(EXistException o0){ return null; }
	public MyHelperClass error(IOException o0){ return null; }
	public MyHelperClass getTransactionManager(){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass get(MyHelperClass o0){ return null; }
	public MyHelperClass release(DBBroker o0){ return null; }
	public MyHelperClass create(String o0){ return null; }
	public MyHelperClass getContentTypeFor(String o0){ return null; }
	public MyHelperClass copy(BufferedInputStream o0, BufferedOutputStream o1){ return null; }
	public MyHelperClass error(LockException o0){ return null; }
	public MyHelperClass append(String o0){ return null; }
	public MyHelperClass error(TriggerException o0){ return null; }
	public MyHelperClass setMimeType(MyHelperClass o0){ return null; }
	public MyHelperClass error(PermissionDeniedException o0){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(SAXException o0){ return null; }}

class XmldbURI {

}

class PermissionDeniedException extends Exception{
	public PermissionDeniedException(String errorMessage) { super(errorMessage); }
}

class CollectionDoesNotExistException extends Exception{
	public CollectionDoesNotExistException(String errorMessage) { super(errorMessage); }
}

class MimeType {

public MyHelperClass getName(){ return null; }
	public MyHelperClass isXMLType(){ return null; }}

class DBBroker {

public MyHelperClass openCollection(MyHelperClass o0, MyHelperClass o1){ return null; }}

class VirtualTempFile {

public MyHelperClass delete(){ return null; }
	public MyHelperClass getByteStream(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass length(){ return null; }}

class TransactionManager {

public MyHelperClass abort(Txn o0){ return null; }
	public MyHelperClass commit(Txn o0){ return null; }
	public MyHelperClass beginTransaction(){ return null; }}

class Txn {

}

class VirtualTempFileInputSource {

VirtualTempFileInputSource(){}
	VirtualTempFileInputSource(VirtualTempFile o0){}}

class IndexInfo {

public MyHelperClass getDocument(){ return null; }}

class DocumentImpl {

public MyHelperClass getMetadata(){ return null; }}

class EXistException extends Exception{
	public EXistException(String errorMessage) { super(errorMessage); }
}

class TriggerException extends Exception{
	public TriggerException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class LockException extends Exception{
	public LockException(String errorMessage) { super(errorMessage); }
}

class Collection {

public MyHelperClass store(Txn o0, DBBroker o1, IndexInfo o2, VirtualTempFileInputSource o3, boolean o4){ return null; }
	public MyHelperClass addBinaryResource(Txn o0, DBBroker o1, XmldbURI o2, BufferedInputStream o3, MyHelperClass o4, long o5){ return null; }
	public MyHelperClass release(MyHelperClass o0){ return null; }
	public MyHelperClass validateXMLResource(Txn o0, DBBroker o1, XmldbURI o2, VirtualTempFileInputSource o3){ return null; }}
