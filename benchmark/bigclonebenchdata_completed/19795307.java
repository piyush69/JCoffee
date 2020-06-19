import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19795307 {
public MyHelperClass REF_NO;
	public MyHelperClass getMerchantId(){ return null; }
	public MyHelperClass processReccurentPaymentResponce(String o0){ return null; }
	public MyHelperClass getRecurringPaymentUrl(){ return null; }
	public MyHelperClass getTestOnly(){ return null; }

    public void doRecurringPayment(Subscription subscription)  throws Throwable {
        int amount = Math.round((float)(Object)subscription.getTotalCostWithDiscounts() * 100.0f);
        String currency =(String)(Object) subscription.getCurrency();
        String aliasCC =(String)(Object) subscription.getAliasCC();
        String expm =(String)(Object) subscription.getLastCardExpm();
        String expy =(String)(Object) subscription.getLastCardExpy();
        String subscriptionId = String.valueOf(subscription.getSubscriptionId());
        StringBuffer xmlSB = new StringBuffer("");
        xmlSB.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        xmlSB.append("<authorizationService version=\"1\">\n");
        xmlSB.append(" <body merchantId=\"" + getMerchantId() + "\" testOnly=\"" + getTestOnly() + "\">\n");
        xmlSB.append("    <transaction refno=\"" + REF_NO + "\">\n");
        xmlSB.append("      <request>\n");
        xmlSB.append("        <amount>" + amount + "</amount>\n");
        xmlSB.append("        <currency>" + currency + "</currency>\n");
        xmlSB.append("        <aliasCC>" + aliasCC + "</aliasCC>\n");
        xmlSB.append("        <expm>" + expm + "</expm>\n");
        xmlSB.append("        <expy>" + expy + "</expy>\n");
        xmlSB.append("        <subscriptionId>" + subscriptionId + "</subscriptionId>\n");
        xmlSB.append("      </request>\n");
        xmlSB.append("    </transaction>\n");
        xmlSB.append(" </body>\n");
        xmlSB.append("</authorizationService>\n");
        String xmlS = xmlSB.toString();
        try {
            java.net.URL murl = new java.net.URL((String)(Object)getRecurringPaymentUrl());
            java.net.HttpURLConnection mcon = (java.net.HttpURLConnection) murl.openConnection();
            mcon.setRequestMethod("POST");
            mcon.setRequestProperty("encoding", "UTF-8");
            mcon.setRequestProperty("Content-Type", "text/xml");
            mcon.setRequestProperty("Content-length", String.valueOf(xmlS.length()));
            mcon.setDoOutput(true);
            java.io.OutputStream outs = mcon.getOutputStream();
            outs.write(xmlS.getBytes("UTF-8"));
            outs.close();
            java.io.BufferedReader inps = new java.io.BufferedReader(new java.io.InputStreamReader(mcon.getInputStream()));
            StringBuffer respSB = new StringBuffer("");
            String s = null;
            while ((s = inps.readLine()) != null) {
                respSB.append(s);
            }
            inps.close();
            String respXML = respSB.toString();
            processReccurentPaymentResponce(respXML);
        } catch (Exception ex) {
            throw new SecurusException((String)(Object)ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Subscription {

public MyHelperClass getLastCardExpm(){ return null; }
	public MyHelperClass getLastCardExpy(){ return null; }
	public MyHelperClass getSubscriptionId(){ return null; }
	public MyHelperClass getAliasCC(){ return null; }
	public MyHelperClass getCurrency(){ return null; }
	public MyHelperClass getTotalCostWithDiscounts(){ return null; }}

class SecurusException extends Exception{
	public SecurusException(String errorMessage) { super(errorMessage); }
}
