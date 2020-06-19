import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c13818000 {

    private void RotaDraw(GeoPoint orig, GeoPoint dest, int color, MapView mapa) {
        StringBuilder urlString = new StringBuilder();
        urlString.append("http://maps.google.com/maps?f=d&hl=en");
        urlString.append("&saddr=");
        urlString.append(Double.toString((double)(double)(Object) orig.getLatitudeE6() / 1.0E6));
        urlString.append(",");
        urlString.append(Double.toString((double)(double)(Object) orig.getLongitudeE6() / 1.0E6));
        urlString.append("&daddr=");
        urlString.append(Double.toString((double)(double)(Object) dest.getLatitudeE6() / 1.0E6));
        urlString.append(",");
        urlString.append(Double.toString((double)(double)(Object) dest.getLongitudeE6() / 1.0E6));
        urlString.append("&ie=UTF8&0&om=0&output=kml");
        Document doc = null;
        HttpURLConnection urlConnection = null;
        URL url = null;
        try {
            url = new URL(urlString.toString());
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoOutput(true);
            urlConnection.setDoInput(true);
            urlConnection.connect();
            MyHelperClass DocumentBuilderFactory = new MyHelperClass();
            DocumentBuilderFactory dbf =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
            DocumentBuilder db =(DocumentBuilder)(Object) dbf.newDocumentBuilder();
            doc =(Document)(Object) db.parse(urlConnection.getInputStream());
            if ((int)(Object)doc.getElementsByTagName("GeometryCollection").getLength() > 0) {
                String path =(String)(Object) doc.getElementsByTagName("GeometryCollection").item(0).getFirstChild().getFirstChild().getFirstChild().getNodeValue();
                MyHelperClass Log = new MyHelperClass();
                Log.d("xxx", "path=" + path);
                String[] pairs = path.split(" ");
                String[] lngLat = pairs[0].split(",");
                GeoPoint startGP = new GeoPoint((int) (Double.parseDouble(lngLat[1]) * 1E6), (int) (Double.parseDouble(lngLat[0]) * 1E6));
                mapa.getOverlays().add(new CamadaGS(startGP, startGP, 1));
                GeoPoint gp1;
                GeoPoint gp2 = startGP;
                for (int i = 1; i < pairs.length; i++) {
                    lngLat = pairs[i].split(",");
                    gp1 = gp2;
                    gp2 = new GeoPoint((int) (Double.parseDouble(lngLat[1]) * 1E6), (int) (Double.parseDouble(lngLat[0]) * 1E6));
                    mapa.getOverlays().add(new CamadaGS(gp1, gp2, 2, color));
//                    MyHelperClass Log = new MyHelperClass();
                    Log.d("xxx", "pair:" + pairs[i]);
                }
                mapa.getOverlays().add(new CamadaGS(dest, dest, 3));
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getFirstChild(){ return null; }
	public MyHelperClass getLength(){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass add(CamadaGS o0){ return null; }
	public MyHelperClass getNodeValue(){ return null; }
	public MyHelperClass item(int o0){ return null; }
	public MyHelperClass d(String o0, String o1){ return null; }}

class GeoPoint {

GeoPoint(int o0, int o1){}
	GeoPoint(){}
	public MyHelperClass getLongitudeE6(){ return null; }
	public MyHelperClass getLatitudeE6(){ return null; }}

class MapView {

public MyHelperClass getOverlays(){ return null; }}

class Document {

public MyHelperClass getElementsByTagName(String o0){ return null; }}

class DocumentBuilderFactory {

public MyHelperClass newDocumentBuilder(){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(InputStream o0){ return null; }}

class CamadaGS {

CamadaGS(GeoPoint o0, GeoPoint o1, int o2){}
	CamadaGS(){}
	CamadaGS(GeoPoint o0, GeoPoint o1, int o2, int o3){}}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}
