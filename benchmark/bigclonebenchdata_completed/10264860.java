
import java.io.UncheckedIOException;


class c10264860 {
public MyHelperClass Factory;

    public AddressType[] getAdressFromCRSCoordinate(Point3d crs_position) {
        AddressType[] result = null;
        MyHelperClass Navigator = new MyHelperClass();
        String postRequest = "<?xml version=\"1.0\" encoding=\"UTF-8\"?> \n" + "<xls:XLS xmlns:xls=\"http://www.opengis.net/xls\" xmlns:sch=\"http://www.ascc.net/xml/schematron\" xmlns:gml=\"http://www.opengis.net/gml\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.opengis.net/xls \n" + "	http://gdi3d.giub.uni-bonn.de/lus/schemas/LocationUtilityService.xsd\" version=\"1.1\"> \n" + "	<xls:RequestHeader srsName=\"EPSG:" + Navigator.getEpsg_code() + "\"/> \n" + "	<xls:Request methodName=\"ReverseGeocodeRequest\" requestID=\"123456789\" version=\"1.1\"> \n" + "		<xls:ReverseGeocodeRequest> \n" + "			<xls:Position> \n" + "				<gml:Point srsName=\"" + Navigator.getEpsg_code() + "\"> \n" + "					<gml:pos>" + crs_position.x + " " + crs_position.y + "</gml:pos> \n" + "				</gml:Point> \n" + "			</xls:Position> \n" + "			<xls:ReverseGeocodePreference>StreetAddress</xls:ReverseGeocodePreference> \n" + "		</xls:ReverseGeocodeRequest> \n" + "	</xls:Request> \n" + "</xls:XLS> \n";
        try {
//            MyHelperClass Navigator = new MyHelperClass();
            if ((boolean)(Object)Navigator.isVerbose()) {
                MyHelperClass serviceEndPoint = new MyHelperClass();
                System.out.println("contacting " + serviceEndPoint + ":\n" + postRequest);
            }
            MyHelperClass serviceEndPoint = new MyHelperClass();
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
            xmlOut =(PrintWriter)(Object) new java.io.PrintWriter((java.io.Writer)(Object)(Writer)(Object)urlc.getOutputStream());
            xmlOut.write(postRequest);
            xmlOut.flush();
            xmlOut.close();
            InputStream is =(InputStream)(Object) urlc.getInputStream();
            XLSDocument xlsResponse =(XLSDocument)(Object) Factory.parse(is);
            is.close();
            XLSType xlsTypeResponse =(XLSType)(Object) xlsResponse.getXLS();
            AbstractBodyType abBodyResponse[] =(AbstractBodyType[])(Object) xlsTypeResponse.getBodyArray();
            MyHelperClass ResponseType = new MyHelperClass();
            ResponseType response = (ResponseType)(ResponseType)(Object) abBodyResponse[0].changeType(ResponseType.type);
            AbstractResponseParametersType respParam =(AbstractResponseParametersType)(Object) response.getResponseParameters();
            if (respParam == null) {
                return null;
            }
            MyHelperClass ReverseGeocodeResponseType = new MyHelperClass();
            ReverseGeocodeResponseType drResp = (ReverseGeocodeResponseType)(ReverseGeocodeResponseType)(Object) respParam.changeType(ReverseGeocodeResponseType.type);
            ReverseGeocodedLocationType[] types =(ReverseGeocodedLocationType[])(Object) drResp.getReverseGeocodedLocationArray();
            int num = types.length;
            if (num > 2) {
                return null;
            }
            result = new AddressType[num];
            for (int i = 0; i < num; i++) {
                String addressDescription = "<b>";
                ReverseGeocodedLocationType type = types[i];
                result[i] =(AddressType)(Object) type.getAddress();
            }
//         } catch (java.net.UncheckedIOException ce) {
            MyHelperClass JOptionPane = new MyHelperClass();
            JOptionPane.showMessageDialog(null, "no connection to reverse geocoder", "Connection Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
	public MyHelperClass TIME_OUT;
	public MyHelperClass type;
public MyHelperClass parse(InputStream o0){ return null; }
	public MyHelperClass showMessageDialog(Object o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass isVerbose(){ return null; }
	public MyHelperClass getEpsg_code(){ return null; }}

class Point3d {
public MyHelperClass y;
	public MyHelperClass x;
}

class AddressType {

}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setReadTimeout(MyHelperClass o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setAllowUserInteraction(boolean o0){ return null; }}

class PrintWriter {

public MyHelperClass write(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class XLSDocument {

public MyHelperClass getXLS(){ return null; }}

class XLSType {

public MyHelperClass getBodyArray(){ return null; }}

class AbstractBodyType {

public MyHelperClass changeType(MyHelperClass o0){ return null; }}

class ResponseType {

public MyHelperClass getResponseParameters(){ return null; }}

class AbstractResponseParametersType {

public MyHelperClass changeType(MyHelperClass o0){ return null; }}

class ReverseGeocodeResponseType {

public MyHelperClass getReverseGeocodedLocationArray(){ return null; }}

class ReverseGeocodedLocationType {

public MyHelperClass getAddress(){ return null; }}

class Writer {

}
