import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c10264859 {
public MyHelperClass Factory;

    public GeocodeResponse getGKCoordinateFromAddress(SearchAddressRequest searchAddressRequest) {
        GeocodeResponse result = null;
        String adress = null;
        if (searchAddressRequest.getAdressTextField() != null) adress =(String)(Object) searchAddressRequest.getAdressTextField().getText();
        if (adress == null || adress.length() == 0) adress = " ";
        String postRequest = "";
        MyHelperClass Navigator = new MyHelperClass();
        postRequest = "<?xml version=\"1.0\" encoding=\"UTF-8\"?> \n" + "<xls:XLS xmlns:xls=\"http://www.opengis.net/xls\" xmlns:sch=\"http://www.ascc.net/xml/schematron\" xmlns:gml=\"http://www.opengis.net/gml\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.opengis.net/xls \n" + "http://gdi3d.giub.uni-bonn.de:8080/openls-lus/schemas/LocationUtilityService.xsd\" version=\"1.1\"> \n" + "	<xls:RequestHeader srsName=\"EPSG:" + Navigator.getEpsg_code() + "\"/> \n" + "	<xls:Request methodName=\"GeocodeRequest\" requestID=\"123456789\" version=\"1.1\"> \n" + "		<xls:GeocodeRequest> \n" + "			<xls:Address countryCode=\"DE\"> \n" + "				<xls:freeFormAddress>" + adress + "</xls:freeFormAddress> \n" + "			</xls:Address> \n" + "		</xls:GeocodeRequest> \n" + "	</xls:Request> \n" + "</xls:XLS> \n";
//        MyHelperClass Navigator = new MyHelperClass();
        if ((boolean)(Object)Navigator.isVerbose()) {
            System.out.println("OpenLSGeocoder postRequest " + postRequest);
        }
        String errorMessage = "";
        try {
            MyHelperClass serviceEndPoint = new MyHelperClass();
            System.out.println("contacting " + serviceEndPoint);
//            MyHelperClass serviceEndPoint = new MyHelperClass();
            URL u = new URL(serviceEndPoint);
            HttpURLConnection urlc = (HttpURLConnection)(HttpURLConnection)(Object) u.openConnection();
//            MyHelperClass Navigator = new MyHelperClass();
            urlc.setReadTimeout(Navigator.TIME_OUT);
            urlc.setAllowUserInteraction(false);
            urlc.setRequestMethod("POST");
            urlc.setRequestProperty("Content-Type", "application/xml");
            urlc.setDoOutput(true);
            urlc.setDoInput(true);
            urlc.setUseCaches(false);
            PrintWriter xmlOut = null;
            xmlOut = new java.io.PrintWriter((Writer)(Object)urlc.getOutputStream());
            xmlOut.write(postRequest);
            xmlOut.flush();
            xmlOut.close();
            InputStream is =(InputStream)(Object) urlc.getInputStream();
            result = new GeocodeResponse();
            XLSDocument xlsResponse =(XLSDocument)(Object) Factory.parse(is);
            XLSType xlsTypeResponse =(XLSType)(Object) xlsResponse.getXLS();
            Node node0 =(Node)(Object) xlsTypeResponse.getDomNode();
            NodeList nodes1 =(NodeList)(Object) node0.getChildNodes();
            for (int i = 0; i < (int)(Object)nodes1.getLength(); i++) {
                Node node1 =(Node)(Object) nodes1.item(i);
                NodeList nodes2 =(NodeList)(Object) node1.getChildNodes();
                for (int j = 0; j < (int)(Object)nodes2.getLength(); j++) {
                    Node node2 =(Node)(Object) nodes2.item(j);
                    NodeList nodes3 =(NodeList)(Object) node2.getChildNodes();
                    for (int k = 0; k < (int)(Object)nodes3.getLength(); k++) {
                        Node node3 =(Node)(Object) nodes3.item(k);
                        String nodeName =(String)(Object) node3.getNodeName();
                        if (nodeName.equalsIgnoreCase("xls:GeocodeResponseList")) {
                            GeocodeResponseListDocument gcrld =(GeocodeResponseListDocument)(Object) Factory.parse(node3);
                            GeocodeResponseListType geocodeResponseList =(GeocodeResponseListType)(Object) gcrld.getGeocodeResponseList();
                            result.setGeocodeResponseList(geocodeResponseList);
                        }
                    }
                }
            }
            is.close();
        } catch (java.net.ConnectException ce) {
            MyHelperClass JOptionPane = new MyHelperClass();
            JOptionPane.showMessageDialog(null, "no connection to geocoder", "Connection Error", JOptionPane.ERROR_MESSAGE);
        } catch (UncheckedIOException ste) {
            ste.printStackTrace();
            errorMessage += "<p>Time Out Exception, Server is not responding</p>";
        } catch (IOException ioe) {
            ioe.printStackTrace();
            errorMessage += "<p>IO Exception</p>";
        } catch (ArithmeticException xmle) {
            xmle.printStackTrace();
            errorMessage += "<p>Error occured during parsing the XML response</p>";
        }
        if (!errorMessage.equals("")) {
            System.out.println("\nerrorMessage: " + errorMessage + "\n\n");
            JLabel label1 = new JLabel("<html><head><style type=\"text/css\"><!--.Stil2 {font-size: 10px;font-weight: bold;}--></style></head><body><span class=\"Stil2\">Geocoder Error</span></body></html>");
            JLabel label2 = new JLabel("<html><head><style type=\"text/css\"><!--.Stil2 {font-size: 10px;font-weight: normal;}--></style></head><body><span class=\"Stil2\">" + "<br>" + errorMessage + "<br>" + "<p>please check Java console. If problem persits, please report to system manager</p>" + "</span></body></html>");
            Object[] objects = { label1, label2 };
            MyHelperClass JOptionPane = new MyHelperClass();
            JOptionPane.showMessageDialog(null, objects, "Error Message", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
	public MyHelperClass TIME_OUT;
public MyHelperClass getEpsg_code(){ return null; }
	public MyHelperClass parse(InputStream o0){ return null; }
	public MyHelperClass isVerbose(){ return null; }
	public MyHelperClass showMessageDialog(Object o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass showMessageDialog(Object o0, Object[] o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass parse(Node o0){ return null; }
	public MyHelperClass getText(){ return null; }}

class SearchAddressRequest {

public MyHelperClass getAdressTextField(){ return null; }}

class GeocodeResponse {

public MyHelperClass setGeocodeResponseList(GeocodeResponseListType o0){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setAllowUserInteraction(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setReadTimeout(MyHelperClass o0){ return null; }}

class XLSDocument {

public MyHelperClass getXLS(){ return null; }}

class XLSType {

public MyHelperClass getDomNode(){ return null; }}

class Node {

public MyHelperClass getNodeName(){ return null; }
	public MyHelperClass getChildNodes(){ return null; }}

class NodeList {

public MyHelperClass item(int o0){ return null; }
	public MyHelperClass getLength(){ return null; }}

class SocketTimeoutException extends Exception{
	public SocketTimeoutException(String errorMessage) { super(errorMessage); }
}

class XmlException extends Exception{
	public XmlException(String errorMessage) { super(errorMessage); }
}

class JLabel {

JLabel(){}
	JLabel(String o0){}}

class GeocodeResponseListDocument {

public MyHelperClass getGeocodeResponseList(){ return null; }}

class GeocodeResponseListType {

}
