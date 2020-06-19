import java.io.*;
import java.lang.*;
import java.util.*;



class c14560668 {
public MyHelperClass URLEncoder;

    public void execute(PaymentInfoMagcard payinfo) {
        MyHelperClass BigDecimal = new MyHelperClass();
        if ((int)(Object)payinfo.getTotal().compareTo(BigDecimal.ZERO) > 0) {
            try {
                StringBuffer sb = new StringBuffer();
                sb.append("x_login=");
                MyHelperClass m_sCommerceID = new MyHelperClass();
                sb.append(URLEncoder.encode((String)(Object)m_sCommerceID, "UTF-8"));
                sb.append("&x_password=");
                MyHelperClass m_sCommercePassword = new MyHelperClass();
                sb.append(URLEncoder.encode((String)(Object)m_sCommercePassword, "UTF-8"));
                sb.append("&x_version=3.1");
                sb.append("&x_test_request=");
                MyHelperClass m_bTestMode = new MyHelperClass();
                sb.append(m_bTestMode);
                sb.append("&x_method=CC");
                sb.append("&x_type=");
                MyHelperClass OPERATIONVALIDATE = new MyHelperClass();
                sb.append(OPERATIONVALIDATE);
                sb.append("&x_amount=");
                NumberFormat formatter =(NumberFormat)(Object) new DecimalFormat("000.00");
                String amount =(String)(Object) formatter.format(payinfo.getTotal());
                MyHelperClass URLEncoder = new MyHelperClass();
                sb.append(URLEncoder.encode((String) amount, "UTF-8"));
                sb.append("&x_delim_data=TRUE");
                sb.append("&x_delim_char=|");
                sb.append("&x_relay_response=FALSE");
                sb.append("&x_exp_date=");
                String tmp =(String)(Object) payinfo.getExpirationDate();
                sb.append(tmp.charAt(2));
                sb.append(tmp.charAt(3));
                sb.append(tmp.charAt(0));
                sb.append(tmp.charAt(1));
                sb.append("&x_card_num=");
//                MyHelperClass URLEncoder = new MyHelperClass();
                sb.append(URLEncoder.encode((String)(Object)payinfo.getCardNumber(), "UTF-8"));
                sb.append("&x_description=Shop+Transaction");
                String[] cc_name =(String[])(Object) payinfo.getHolderName().split(" ");
                sb.append("&x_first_name=");
                if (cc_name.length > 0) {
//                    MyHelperClass URLEncoder = new MyHelperClass();
                    sb.append(URLEncoder.encode(cc_name[0], "UTF-8"));
                }
                sb.append("&x_last_name=");
                if (cc_name.length > 1) {
//                    MyHelperClass URLEncoder = new MyHelperClass();
                    sb.append(URLEncoder.encode(cc_name[1], "UTF-8"));
                }
                MyHelperClass ENDPOINTADDRESS = new MyHelperClass();
                URL url = new URL(ENDPOINTADDRESS);
                URLConnection connection =(URLConnection)(Object) url.openConnection();
                connection.setDoOutput(true);
                connection.setUseCaches(false);
                connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                DataOutputStream out = new DataOutputStream((OutputStream)(Object)connection.getOutputStream());
                out.write(sb.toString().getBytes());
                out.flush();
                out.close();
                BufferedReader in = new BufferedReader(new InputStreamReader((InputStream)(Object)connection.getInputStream()));
                String line;
                line = in.readLine();
                in.close();
                String[] ccRep = line.split("\\|");
                if ("1".equals(ccRep[0])) {
                    payinfo.paymentOK((String) ccRep[4]);
                } else {
                    MyHelperClass AppLocal = new MyHelperClass();
                    payinfo.paymentError(AppLocal.getIntString("message.paymenterror") + "\n" + ccRep[0] + " -- " + ccRep[3]);
                }
            } catch (UnsupportedEncodingException eUE) {
                MyHelperClass AppLocal = new MyHelperClass();
                payinfo.paymentError(AppLocal.getIntString("message.paymentexceptionservice") + "\n" + eUE.getMessage());
            } catch (UncheckedIOException eMURL) {
                MyHelperClass AppLocal = new MyHelperClass();
                payinfo.paymentError(AppLocal.getIntString("message.paymentexceptionservice") + "\n" + eMURL.getMessage());
            } catch (IOException e) {
                MyHelperClass AppLocal = new MyHelperClass();
                payinfo.paymentError(AppLocal.getIntString("message.paymenterror") + "\n" + e.getMessage());
            }
        } else {
            MyHelperClass AppLocal = new MyHelperClass();
            payinfo.paymentError(AppLocal.getIntString("message.paymentrefundsnotsupported"));
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ZERO;
public MyHelperClass split(String o0){ return null; }
	public MyHelperClass getIntString(String o0){ return null; }
	public MyHelperClass compareTo(MyHelperClass o0){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }}

class PaymentInfoMagcard {

public MyHelperClass getExpirationDate(){ return null; }
	public MyHelperClass paymentOK(String o0){ return null; }
	public MyHelperClass paymentError(String o0){ return null; }
	public MyHelperClass paymentError(MyHelperClass o0){ return null; }
	public MyHelperClass getHolderName(){ return null; }
	public MyHelperClass getCardNumber(){ return null; }
	public MyHelperClass getTotal(){ return null; }}

class NumberFormat {

public MyHelperClass format(MyHelperClass o0){ return null; }}

class DecimalFormat {

DecimalFormat(){}
	DecimalFormat(String o0){}}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
