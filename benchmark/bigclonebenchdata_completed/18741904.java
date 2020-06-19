import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18741904 {
public MyHelperClass fillListboxFromTemplateContainer(){ return null; }
	public MyHelperClass getTxaTemplateDescription(){ return null; }

    protected void cboTemplateIndexSelectionChanged()  throws Throwable {
        int idx = WizardPage1.this.cboTemplateIndex.getSelectionIndex();
        MyHelperClass Activator = new MyHelperClass();
        IPreferenceStore store =(IPreferenceStore)(Object) Activator.getDefault().getPreferenceStore();
        MyHelperClass PreferenceConstants = new MyHelperClass();
        String prefnamePrefix =(int)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object) PreferenceConstants.TEMPLATE_PREFIX + idx;
//        MyHelperClass PreferenceConstants = new MyHelperClass();
        String baseUrl =(String)(Object) store.getString(prefnamePrefix + PreferenceConstants.BASEURL_POSTFIX);
//        MyHelperClass PreferenceConstants = new MyHelperClass();
        String descfile =(String)(Object) store.getString(prefnamePrefix + PreferenceConstants.DESCFILE_POSTFIX);
        try {
            URL url = new URL(baseUrl + descfile);
            URLConnection con = url.openConnection();
            WizardPage1.this.setTemplContainer(new TemplateContainer(con.getInputStream(), baseUrl));
            fillListboxFromTemplateContainer();
        } catch (MalformedURLException e1) {
            getTxaTemplateDescription().setText(e1.getMessage());
            e1.printStackTrace();
        } catch (IOException e2) {
            getTxaTemplateDescription().setText(e2.getMessage());
            e2.printStackTrace();
        } catch (XPathExpressionException e3) {
            getTxaTemplateDescription().setText(e3.getMessage());
            e3.printStackTrace();
        } catch (ParserConfigurationException e4) {
            getTxaTemplateDescription().setText(e4.getMessage());
            e4.printStackTrace();
        } catch (SAXException e5) {
            getTxaTemplateDescription().setText(e5.getMessage());
            e5.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TEMPLATE_PREFIX;
	public MyHelperClass DESCFILE_POSTFIX;
	public MyHelperClass BASEURL_POSTFIX;
public MyHelperClass getPreferenceStore(){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass getDefault(){ return null; }}

class WizardPage1 {

}

class IPreferenceStore {

public MyHelperClass getString(String o0){ return null; }}

class TemplateContainer {

TemplateContainer(InputStream o0, String o1){}
	TemplateContainer(){}}

class XPathExpressionException extends Exception{
	public XPathExpressionException(String errorMessage) { super(errorMessage); }
}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}
