import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13719500 {
public MyHelperClass updateByteArray(MessageDigest o0, MyHelperClass o1){ return null; }
	public MyHelperClass updateByteArray(MessageDigest o0, byte[] o1){ return null; }
public MyHelperClass LOCAL;
public MyHelperClass connection;
	public MyHelperClass k;
	public MyHelperClass keyPair;
	public MyHelperClass h;
	public MyHelperClass G;
	public MyHelperClass KeyAgreement;
	public MyHelperClass sessionId;
	public MyHelperClass keyExchangeInitLocal;
	public MyHelperClass P1;
	public MyHelperClass keyExchangeInitRemote;
	public MyHelperClass updateBigInt(MessageDigest o0, BigInteger o1){ return null; }
	public MyHelperClass createMessageDigest(){ return null; }

    private void onDhReply(final SshDhReply msg) throws Throwable, GeneralSecurityException, IOException {
        if ((this.keyPair == null) || (boolean)(Object)this.connection.isServer()) throw new SshException("%s: unexpected %s", this.connection.uri, msg.getType());
        final BigInteger k;
        {
            final DHPublicKeySpec remoteKeySpec = new DHPublicKeySpec(new BigInteger((byte[])(Object)msg.f), P1, G);
            final KeyFactory dhKeyFact = KeyFactory.getInstance("DH");
            final DHPublicKey remotePubKey = (DHPublicKey) dhKeyFact.generatePublic((java.security.spec.KeySpec)(Object)(KeySpec)(Object)remoteKeySpec);
            final KeyAgreement dhKex =(KeyAgreement)(Object) KeyAgreement.getInstance("DH");
            dhKex.init(this.keyPair.getPrivate());
            dhKex.doPhase(remotePubKey, true);
            k = new BigInteger((byte[])(Object)dhKex.generateSecret());
        }
        final MessageDigest md =(MessageDigest)(Object) createMessageDigest();
        final byte[] h;
        {
            updateByteArray(md, LOCAL.toString().getBytes());
            updateByteArray(md, this.connection.getRemoteSshVersion().toString().getBytes());
            updateByteArray(md, this.keyExchangeInitLocal.getPayload());
            updateByteArray(md, this.keyExchangeInitRemote.getPayload());
            updateByteArray(md, msg.hostKey);
            updateByteArray(md, ((DHPublicKey)(DHPublicKey)(Object) this.keyPair.getPublic()).getY().toByteArray());
            updateByteArray(md, msg.f);
            updateBigInt(md, k);
            h = md.digest();
        }
        if (this.sessionId == null) this.sessionId =(MyHelperClass)(Object) h;
        this.keyExchangeInitLocal = null;
        this.keyExchangeInitRemote = null;
        this.h =(MyHelperClass)(Object) h;
        this.k =(MyHelperClass)(Object) k;
        this.connection.send(new SshKeyExchangeNewKeys());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass uri;
public MyHelperClass getPublic(){ return null; }
	public MyHelperClass toByteArray(){ return null; }
	public MyHelperClass isServer(){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getPayload(){ return null; }
	public MyHelperClass getPrivate(){ return null; }
	public MyHelperClass send(SshKeyExchangeNewKeys o0){ return null; }
	public MyHelperClass getRemoteSshVersion(){ return null; }}

class SshDhReply {
public MyHelperClass hostKey;
	public MyHelperClass f;
public MyHelperClass getType(){ return null; }}

class DHPublicKeySpec {

DHPublicKeySpec(){}
	DHPublicKeySpec(BigInteger o0, MyHelperClass o1, MyHelperClass o2){}}

class DHPublicKey {

public MyHelperClass getY(){ return null; }}

class KeyAgreement {

public MyHelperClass doPhase(DHPublicKey o0, boolean o1){ return null; }
	public MyHelperClass init(MyHelperClass o0){ return null; }
	public MyHelperClass generateSecret(){ return null; }}

class SshKeyExchangeNewKeys {

}

class SshException extends Exception{
	public SshException(String errorMessage) { super(errorMessage); }
	SshException(String o0, MyHelperClass o1, MyHelperClass o2){}
	SshException(){}
}

class KeySpec {

}
