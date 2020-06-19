import java.io.*;
import java.lang.*;
import java.util.*;



class c19445719 {
public MyHelperClass setAuthenticated(boolean o0){ return null; }
	public MyHelperClass getStoreConfig(){ return null; }
	public MyHelperClass isAuthenticated(){ return null; }

    public boolean login() {
        if ((boolean)(Object)this.isAuthenticated()) return true;
        try {
            MyHelperClass client = new MyHelperClass();
            if (client == null) {
//                MyHelperClass client = new MyHelperClass();
                client =(MyHelperClass)(Object) new FTPClient();
                FTPClientConfig config = new FTPClientConfig();
//                MyHelperClass client = new MyHelperClass();
                client.configure(config);
            }
//            MyHelperClass client = new MyHelperClass();
            if (!(Boolean)(Object)client.isConnected()) {
                client.connect(this.getStoreConfig().getServerName(), new Integer((int)(Object)this.getStoreConfig().getServerPort()).intValue());
            }
            if ((boolean)(Object)client.login(this.getStoreConfig().getUserName(), this.getStoreConfig().getPassword(), this.getStoreConfig().getServerName())) {
                this.setAuthenticated(true);
                return true;
            }
            MyHelperClass log = new MyHelperClass();
            log.error("Login ftp server error");
        } catch (Exception e) {
            MyHelperClass log = new MyHelperClass();
            log.info("FTPStore.login", e);
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0, Exception o1){ return null; }
	public MyHelperClass getServerPort(){ return null; }
	public MyHelperClass isConnected(){ return null; }
	public MyHelperClass configure(FTPClientConfig o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass getPassword(){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass getUserName(){ return null; }
	public MyHelperClass connect(MyHelperClass o0, int o1){ return null; }
	public MyHelperClass getServerName(){ return null; }}

class FTPClientConfig {

}

class FTPClient {

}
