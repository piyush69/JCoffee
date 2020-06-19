import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4489007 {
public MyHelperClass mNewPrenom;
public MyHelperClass mNewAdresse;
public MyHelperClass mErrorExist;
	public MyHelperClass mNewMail;
	public MyHelperClass mNewMdp;
	public MyHelperClass errorZone;
	public MyHelperClass mLogger;
	public MyHelperClass mNewMdpConfirm;
	public MyHelperClass mComponentResources;
	public MyHelperClass mClientManager;
	public MyHelperClass mErrorMdp;
	public MyHelperClass mNewNom;

    Object onSuccess() {
        this.mErrorExist =(MyHelperClass)(Object) true;
        this.mErrorMdp =(MyHelperClass)(Object) true;
        if (!(Boolean)(Object)mClientManager.exists(this.mNewMail)) {
            this.mErrorExist =(MyHelperClass)(Object) false;
            if (mNewMdp.equals(mNewMdpConfirm)) {
                this.mErrorMdp =(MyHelperClass)(Object) false;
                MessageDigest sha1Instance;
                try {
                    sha1Instance = MessageDigest.getInstance("SHA1");
                    sha1Instance.reset();
                    sha1Instance.update((byte)(Object)this.mNewMdp.getBytes());
                    byte[] digest = sha1Instance.digest();
                    BigInteger bigInt = new BigInteger(1, digest);
                    String vHashPassword = bigInt.toString(16);
                    Client vClient = new Client(this.mNewNom, (this.mNewPrenom != null ? this.mNewPrenom : ""), this.mNewMail, vHashPassword, this.mNewAdresse, 1);
                    mClientManager.save(vClient);
                    mComponentResources.discardPersistentFieldChanges();
                    return "Client/List";
                } catch (NoSuchAlgorithmException e) {
                    mLogger.error(e.getMessage(), e);
                }
            }
        }
        return errorZone.getBody();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getBody(){ return null; }
	public MyHelperClass save(Client o0){ return null; }
	public MyHelperClass discardPersistentFieldChanges(){ return null; }
	public MyHelperClass error(String o0, NoSuchAlgorithmException o1){ return null; }
	public MyHelperClass exists(MyHelperClass o0){ return null; }
	public MyHelperClass getBytes(){ return null; }}

class Client {

}
