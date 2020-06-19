import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18921331 {
public MyHelperClass NULL;
	public MyHelperClass setDupeStringMode(MyHelperClass o0){ return null; }
	public MyHelperClass setFormulaCalculationMode(MyHelperClass o0){ return null; }
	public MyHelperClass setStringEncodingMode(MyHelperClass o0){ return null; }
public MyHelperClass ServerURL;
	public MyHelperClass ExtenXLS;
	public MyHelperClass WorkBookHandle;
	public MyHelperClass WorkBookException;
	public MyHelperClass removeAllWorkSheets(){ return null; }

    public void init()  throws Throwable {
        MyHelperClass WorkBookHandle = new MyHelperClass();
        this.setFormulaCalculationMode(WorkBookHandle.CALCULATE_ALWAYS);
        try {
            MyHelperClass memeId = new MyHelperClass();
            if ((int)(Object)memeId < 0) {
            } else {
                URL conurl =(URL)(Object) NULL; //new URL();
                conurl = new URL(ServerURL + "?meme_id=" + memeId);
//                MyHelperClass conurl = new MyHelperClass();
                java.io.InputStream xmlstr = conurl.openStream();
                this.removeAllWorkSheets();
                this.setFormulaCalculationMode(WorkBookHandle.CALCULATE_EXPLICIT);
                this.setStringEncodingMode(WorkBookHandle.STRING_ENCODING_UNICODE);
                this.setDupeStringMode(WorkBookHandle.SHAREDUPES);
                ExtenXLS.parseNBind(this, xmlstr);
                this.setFormulaCalculationMode(WorkBookHandle.CALCULATE_ALWAYS);
            }
        } catch (Exception ex) {
            throw new WorkBookException("Error while connecting to: " + ServerURL + ":" + ex.toString(), WorkBookException.RUNTIME_ERROR);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass STRING_ENCODING_UNICODE;
	public MyHelperClass CALCULATE_ALWAYS;
	public MyHelperClass SHAREDUPES;
	public MyHelperClass RUNTIME_ERROR;
	public MyHelperClass CALCULATE_EXPLICIT;
public MyHelperClass openStream(){ return null; }
	public MyHelperClass parseNBind(c18921331 o0, InputStream o1){ return null; }}

class WorkBookException extends Exception{
	public WorkBookException(String errorMessage) { super(errorMessage); }
	WorkBookException(String o0, MyHelperClass o1){}
	WorkBookException(){}
}
