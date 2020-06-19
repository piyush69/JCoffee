import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3935836 {
public static MyHelperClass getPolicyCollection(DBBroker o0){ return null; }
//public MyHelperClass getPolicyCollection(DBBroker o0){ return null; }

    public static void storePolicy(DBBroker broker, XmldbURI docPath) throws Throwable, EXistException, IOException {
        XmldbURI docName =(XmldbURI)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) docPath.lastSegment();
        URL url = XACMLUtil.class.getResource(docPath.toString());
        if (url == null) return;
        String content = toString(url.openStream());
        if (content == null) return;
        Collection collection =(Collection)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) getPolicyCollection(broker);
        if (collection == null) return;
        TransactionManager transact =(TransactionManager)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) broker.getBrokerPool().getTransactionManager();
        Txn txn =(Txn)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) transact.beginTransaction();
        try {
            IndexInfo info =(IndexInfo)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) collection.validateXMLResource(txn, broker, docName, content);
            collection.store(txn, broker, info, content, false);
            transact.commit(txn);
        } catch (Exception e) {
            transact.abort(txn);
            if (e instanceof EXistException) throw (EXistException) e;
            throw new EXistException("Error storing policy '" + docPath + "'", e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getTransactionManager(){ return null; }}

class DBBroker {

public MyHelperClass getBrokerPool(){ return null; }}

class XmldbURI {

public MyHelperClass lastSegment(){ return null; }}

class EXistException extends Exception{
	public EXistException(String errorMessage) { super(errorMessage); }
	EXistException(){}
	EXistException(String o0, Exception o1){}
}

class XACMLUtil {

}

class Object {

public MyHelperClass toString(InputStream o0){ return null; }}

class TransactionManager {

public MyHelperClass abort(Txn o0){ return null; }
	public MyHelperClass commit(Txn o0){ return null; }
	public MyHelperClass beginTransaction(){ return null; }}

class Txn {

}

class IndexInfo {

}

class Collection {

public MyHelperClass store(Txn o0, DBBroker o1, IndexInfo o2, String o3, boolean o4){ return null; }
	public MyHelperClass validateXMLResource(Txn o0, DBBroker o1, XmldbURI o2, String o3){ return null; }}
