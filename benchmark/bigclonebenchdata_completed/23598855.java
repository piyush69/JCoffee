import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c23598855 {
public MyHelperClass getValues(MyHelperClass o0){ return null; }
public MyHelperClass TomcatConfiguration;
	public MyHelperClass HAConfiguration;
	public MyHelperClass CommResponse;
	public MyHelperClass _c;
	public MyHelperClass WBSAgnitioConfiguration;

    public void requestConfirm() throws Exception {
        if (!(Boolean)(Object)this._c.checkProperty("directory.request", "request")) {
            throw new Exception("product has no active request");
        }
        if (!new File((String)(Object)WBSAgnitioConfiguration.getHARequestFile()).canWrite()) {
            throw new Exception("cannot remove request from system");
        }
        HashMap<String, String> values =(HashMap<String,String>)(Object) getValues(WBSAgnitioConfiguration.getHARequestFile());
        if (!values.containsKey("address.virtual")) {
            throw new Exception("failed to determine the virtual address");
        }
        if (!values.containsKey("address.real")) {
            throw new Exception("failed to determine the remote address");
        }
        HTTPClient _hc = new HTTPClient(values.get("address.real"));
        if ((boolean)(Object)TomcatConfiguration.checkHTTPS()) {
            _hc.setSecure(true);
        }
        _hc.load("/admin/Comm?type=" + CommResponse.TYPE_HA + "&command=" + CommResponse.COMMAND_REQUEST_CONFIRM + "&virtual=" + values.get("address.virtual"));
        String _reply = new String((String)(Object)_hc.getContent());
        if (_reply.isEmpty()) {
            throw new Exception("remote product has not sent any reply");
        } else if (_reply.indexOf("done") == -1) {
            throw new Exception(_reply);
        }
        HAConfiguration.setSlave(values.get("address.virtual"), values.get("address.real"));
        File _f = new File((String)(Object)WBSAgnitioConfiguration.getOptionalSchemaRequestFile());
        if (_f.exists()) {
            FileOutputStream _fos = new FileOutputStream((String)(Object)WBSAgnitioConfiguration.getOptionalSchemaFile());
            FileInputStream _fis = new FileInputStream(_f);
            while (_fis.available() > 0) {
                _fos.write(_fis.read());
            }
            _fis.close();
            _fos.close();
            _f.delete();
        }
        _f = new File((String)(Object)WBSAgnitioConfiguration.getSchemaObjectRequestFile());
        if (_f.exists()) {
            FileOutputStream _fos = new FileOutputStream((String)(Object)WBSAgnitioConfiguration.getSchemaObjectFile());
            FileInputStream _fis = new FileInputStream(_f);
            while (_fis.available() > 0) {
                _fos.write(_fis.read());
            }
            _fis.close();
            _fos.close();
            _f.delete();
        }
        new File((String)(Object)WBSAgnitioConfiguration.getHARequestFile()).delete();
        this._c.removeProperty("directory.request");
        this._c.setProperty("directory.virtual", values.get("address.virtual"));
        this._c.setProperty("directory.status", "slave");
        this._c.store();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass COMMAND_REQUEST_CONFIRM;
	public MyHelperClass TYPE_HA;
public MyHelperClass checkHTTPS(){ return null; }
	public MyHelperClass getSchemaObjectFile(){ return null; }
	public MyHelperClass checkProperty(String o0, String o1){ return null; }
	public MyHelperClass removeProperty(String o0){ return null; }
	public MyHelperClass getOptionalSchemaRequestFile(){ return null; }
	public MyHelperClass getHARequestFile(){ return null; }
	public MyHelperClass getOptionalSchemaFile(){ return null; }
	public MyHelperClass setSlave(String o0, String o1){ return null; }
	public MyHelperClass getSchemaObjectRequestFile(){ return null; }
	public MyHelperClass setProperty(String o0, String o1){ return null; }
	public MyHelperClass store(){ return null; }}

class HTTPClient {

HTTPClient(String o0){}
	HTTPClient(){}
	public MyHelperClass setSecure(boolean o0){ return null; }
	public MyHelperClass load(String o0){ return null; }
	public MyHelperClass getContent(){ return null; }}
