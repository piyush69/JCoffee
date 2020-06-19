import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2561363 {
public MyHelperClass resourceBundle;
	public MyHelperClass verificaStatusRequisicao(Document o0){ return null; }

    public Document getKmlStream(String streetname, String number, String neighbourhood, String city, String state) throws Throwable, RotaException {
        MyHelperClass Constants = new MyHelperClass();
        StringBuffer urlsb = new StringBuffer((int)(Object)resourceBundle.getString(Constants.URL_SEARCH));
        MyHelperClass DocumentBuilderFactory = new MyHelperClass();
        DocumentBuilderFactory dbf =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
        InputStream in = null;
        HttpURLConnection httpConnection = null;
        Document doc = null;
        dbf.setValidating(false);
//        MyHelperClass Constants = new MyHelperClass();
        String proxy =(String)(Object) resourceBundle.getString(Constants.PROXY_HOST);
//        MyHelperClass Constants = new MyHelperClass();
        String port =(String)(Object) resourceBundle.getString(Constants.PROXY_PORT);
        try {
//            MyHelperClass Constants = new MyHelperClass();
            String address = String.format("%s+%s+%s+%s+%s", URLEncoder.encode(streetname.trim(),(String)(Object) Constants.URL_ENCODING), URLEncoder.encode(number.trim(),(String)(Object) Constants.URL_ENCODING), URLEncoder.encode(neighbourhood.trim(),(String)(Object) Constants.URL_ENCODING), URLEncoder.encode(city.trim(),(String)(Object) Constants.URL_ENCODING), URLEncoder.encode(state.trim(),(String)(Object) Constants.URL_ENCODING));
            DocumentBuilder df =(DocumentBuilder)(Object) dbf.newDocumentBuilder();
            urlsb.append(address);
//            MyHelperClass Constants = new MyHelperClass();
            urlsb.append(resourceBundle.getString(Constants.GOOGLE_TYPE_OUTPUT));
//            MyHelperClass Constants = new MyHelperClass();
            urlsb.append(resourceBundle.getString(Constants.SENSOR));
//            MyHelperClass Constants = new MyHelperClass();
            urlsb.append(resourceBundle.getString(Constants.GOOGLE_KEY));
//            MyHelperClass Constants = new MyHelperClass();
            urlsb.append(resourceBundle.getString(Constants.GOOGLE_KEY_VALUE));
            String addressUTF8 = urlsb.toString();
            URL url = new URL(addressUTF8);
            Properties systemproperties = System.getProperties();
            if (proxy != null && !proxy.equals("")) {
                systemproperties.setProperty("http.proxyHost", proxy);
                systemproperties.setProperty("http.proxyPort", port);
            }
            httpConnection = (HttpURLConnection) url.openConnection();
            httpConnection.connect();
            in = httpConnection.getInputStream();
            doc =(Document)(Object) df.parse(in);
            in.close();
            httpConnection.disconnect();
            if (doc == null || !(Boolean)(Object)verificaStatusRequisicao(doc)) {
                throw new RotaException("N�o foi poss�vel realizar a geodecodifica��o com o endere�o informado!");
            }
            return doc;
        } catch (UnsupportedEncodingException ue) {
            MyHelperClass logger = new MyHelperClass();
            logger.error(ue);
            throw new RotaException("Encoding n�o suportado : " + ue.getMessage());
        } catch (MalformedURLException ma) {
            MyHelperClass logger = new MyHelperClass();
            logger.error(ma);
            throw new RotaException("Erro na URL : " + ma.getMessage());
        } catch (ArithmeticException pe) {
            MyHelperClass logger = new MyHelperClass();
            logger.error((IOException)(Object)pe);
            throw new RotaException("Erro ao realizar o parser da configura��o : " + pe.getMessage());
        } catch (ArrayIndexOutOfBoundsException sa) {
            MyHelperClass logger = new MyHelperClass();
            logger.error((IOException)(Object)sa);
            throw new RotaException("Erro de SAX : " + sa.getMessage());
        } catch (ConnectException co) {
            MyHelperClass logger = new MyHelperClass();
            logger.error(co);
            throw new RotaException("N�o foi poss�vel estabelecer a conex�o http : " + co.getMessage());
        } catch (IOException io) {
            MyHelperClass logger = new MyHelperClass();
            logger.error(io);
            throw new RotaException("Erro de io : ", io);
        } catch (Exception ex) {
            throw new RotaException("N�o foi poss�vel gerar a rota  : " + ex.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (Exception ex) {
                    throw new RotaException("N�o foi poss�vel fechar o stream de dados ! : " + ex.getMessage());
                }
            }
            if (httpConnection != null) {
                httpConnection.disconnect();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PROXY_HOST;
	public MyHelperClass URL_SEARCH;
	public MyHelperClass GOOGLE_TYPE_OUTPUT;
	public MyHelperClass SENSOR;
	public MyHelperClass GOOGLE_KEY_VALUE;
	public MyHelperClass URL_ENCODING;
	public MyHelperClass GOOGLE_KEY;
	public MyHelperClass PROXY_PORT;
public MyHelperClass error(IOException o0){ return null; }
	public MyHelperClass error(ParserConfigurationException o0){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass getString(MyHelperClass o0){ return null; }
	public MyHelperClass error(MalformedURLException o0){ return null; }
	public MyHelperClass error(SAXException o0){ return null; }
	public MyHelperClass error(ConnectException o0){ return null; }
	public MyHelperClass error(UnsupportedEncodingException o0){ return null; }}

class Document {

}

class RotaException extends Exception{
	public RotaException(String errorMessage) { super(errorMessage); }
	RotaException(String o0, IOException o1){}
	RotaException(){}
}

class DocumentBuilderFactory {

public MyHelperClass newDocumentBuilder(){ return null; }
	public MyHelperClass setValidating(boolean o0){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(InputStream o0){ return null; }}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}
