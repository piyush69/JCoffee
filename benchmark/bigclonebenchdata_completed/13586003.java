import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13586003 {
public MyHelperClass Factory;

    public ObservationResult[] call(String url, String servicename, String srsname, String version, String offering, String observed_property, String responseFormat)  throws Throwable {
        System.out.println("GetObservationBasic.call url " + url);
        URL service = null;
        URLConnection connection = null;
        ArrayList<ObservationResult> obsList = new ArrayList<ObservationResult>();
        boolean isDataArrayRead = false;
        try {
            service = new URL(url);
            connection = service.openConnection();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        connection.setDoOutput(true);
        connection.setDoInput(true);
        connection.setUseCaches(false);
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        try {
            DataOutputStream out = new DataOutputStream(connection.getOutputStream());
            GetObservationDocument getobDoc =(GetObservationDocument)(Object) Factory.newInstance();
            GetObservation getob =(GetObservation)(Object) getobDoc.addNewGetObservation();
            getob.setService(servicename);
            getob.setVersion(version);
            getob.setSrsName(srsname);
            getob.setOffering(offering);
            getob.setObservedPropertyArray(new String[] { observed_property });
            getob.setResponseFormat(responseFormat);
            String request = URLEncoder.encode((String)(Object)getobDoc.xmlText(), "UTF-8");
            out.writeBytes(request);
            out.flush();
            out.close();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            URL observation_url = new URL("file:///E:/Temp/Observation.xml");
            URLConnection urlc = observation_url.openConnection();
            urlc.connect();
            InputStream observation_url_is = urlc.getInputStream();
            ObservationCollectionDocument obsCollDoc =(ObservationCollectionDocument)(Object) Factory.parse(observation_url_is);
            ObservationCollectionType obsColl =(ObservationCollectionType)(Object) obsCollDoc.getObservationCollection();
            ObservationPropertyType[] aObsPropType =(ObservationPropertyType[])(Object) obsColl.getMemberArray();
            for (ObservationPropertyType observationPropertyType : aObsPropType) {
                ObservationType observation =(ObservationType)(Object) observationPropertyType.getObservation();
                if (observation != null) {
                    System.out.println("observation " + observation.getClass().getName());
                    ObservationResult obsResult = new ObservationResult();
                    if ((GeometryObservationTypeImpl)(Object)observation instanceof GeometryObservationTypeImpl) {
                        GeometryObservationTypeImpl geometryObservation = (GeometryObservationTypeImpl)(GeometryObservationTypeImpl)(Object) observation;
                        TimeObjectPropertyType samplingTime =(TimeObjectPropertyType)(Object) geometryObservation.getSamplingTime();
                        TimeInstantTypeImpl timeInstant = (TimeInstantTypeImpl)(TimeInstantTypeImpl)(Object) samplingTime.getTimeObject();
                        TimePositionType timePosition =(TimePositionType)(Object) timeInstant.getTimePosition();
                        String time = (String)(String)(Object) timePosition.getObjectValue();
                        StringTokenizer date_st;
                        String day = new StringTokenizer(time, "T").nextToken();
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                        Date d =(Date)(Object) sdf.parse(day);
                        String timetemp = null;
                        date_st = new StringTokenizer(time, "T");
                        while (date_st.hasMoreElements()) timetemp = date_st.nextToken();
                        sdf = new SimpleDateFormat("HH:mm:ss");
                        Date ti =(Date)(Object) sdf.parse(timetemp.substring(0, timetemp.lastIndexOf(':') + 2));
                        d.setHours(ti.getHours());
                        d.setMinutes(ti.getMinutes());
                        d.setSeconds(ti.getSeconds());
                        obsResult.setDatetime(d);
                        String textValue = "null";
                        FeaturePropertyType featureOfInterest = (FeaturePropertyType)(FeaturePropertyType)(Object) geometryObservation.getFeatureOfInterest();
                        Node fnode =(Node)(Object) featureOfInterest.getDomNode();
                        NodeList childNodes =(NodeList)(Object) fnode.getChildNodes();
                        for (int j = 0; j < (int)(Object)childNodes.getLength(); j++) {
                            Node cnode =(Node)(Object) childNodes.item(j);
                            if (cnode.getNodeName().equals("n52:movingObject")) {
                                NamedNodeMap att =(NamedNodeMap)(Object) cnode.getAttributes();
                                Node id =(Node)(Object) att.getNamedItem("gml:id");
                                textValue =(String)(Object) id.getNodeValue();
                                obsResult.setTextValue(textValue);
                                obsResult.setIsTextValue(true);
                            }
                        }
                        XmlObject result =(XmlObject)(Object) geometryObservation.getResult();
                        if ((GeometryPropertyTypeImpl)(Object)result instanceof GeometryPropertyTypeImpl) {
                            GeometryPropertyTypeImpl geometryPropertyType = (GeometryPropertyTypeImpl)(GeometryPropertyTypeImpl)(Object) result;
                            AbstractGeometryType geometry =(AbstractGeometryType)(Object) geometryPropertyType.getGeometry();
                            String srsName =(String)(Object) geometry.getSrsName();
                            StringTokenizer st = new StringTokenizer(srsName, ":");
                            String epsg = null;
                            while (st.hasMoreElements()) epsg = st.nextToken();
                            int sri = Integer.parseInt(epsg);
                            if ((PointTypeImpl)(Object)geometry instanceof PointTypeImpl) {
                                PointTypeImpl point = (PointTypeImpl)(PointTypeImpl)(Object) geometry;
                                Node node =(Node)(Object) point.getDomNode();
                                PointDocument pointDocument =(PointDocument)(Object) Factory.parse(node);
                                PointType point2 =(PointType)(Object) pointDocument.getPoint();
                                XmlCursor cursor =(XmlCursor)(Object) point.newCursor();
                                cursor.toFirstChild();
                                CoordinatesDocument coordinatesDocument =(CoordinatesDocument)(Object) Factory.parse(cursor.xmlText());
                                CoordinatesType coords =(CoordinatesType)(Object) coordinatesDocument.getCoordinates();
                                StringTokenizer tok = new StringTokenizer((String)(Object)coords.getStringValue(), " ,;", false);
                                double x = Double.parseDouble(tok.nextToken());
                                double y = Double.parseDouble(tok.nextToken());
                                double z = 0;
                                if (tok.hasMoreTokens()) {
                                    z = Double.parseDouble(tok.nextToken());
                                }
                                x += 207561;
                                y += 3318814;
                                z += 20;
                                Point3d center = new Point3d(x, y, z);
                                obsResult.setCenter(center);
                                GeometryFactory fact = new GeometryFactory();
                                Coordinate coordinate = new Coordinate(x, y, z);
                                Geometry g1 =(Geometry)(Object) fact.createPoint(coordinate);
                                g1.setSRID(sri);
                                obsResult.setGeometry(g1);
                                String href =(String)(Object) observation.getProcedure().getHref();
                                obsResult.setProcedure(href);
                                obsList.add(obsResult);
                            }
                        }
                    }
                }
            }
            observation_url_is.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        ObservationResult[] ar = new ObservationResult[obsList.size()];
        return obsList.toArray(ar);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass parse(MyHelperClass o0){ return null; }
	public MyHelperClass getHref(){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass parse(InputStream o0){ return null; }
	public MyHelperClass parse(Node o0){ return null; }}

class ObservationResult {

public MyHelperClass setDatetime(Date o0){ return null; }
	public MyHelperClass setTextValue(String o0){ return null; }
	public MyHelperClass setGeometry(Geometry o0){ return null; }
	public MyHelperClass setCenter(Point3d o0){ return null; }
	public MyHelperClass setProcedure(String o0){ return null; }
	public MyHelperClass setIsTextValue(boolean o0){ return null; }}

class GetObservationDocument {

public MyHelperClass addNewGetObservation(){ return null; }
	public MyHelperClass xmlText(){ return null; }}

class GetObservation {

public MyHelperClass setObservedPropertyArray(String[] o0){ return null; }
	public MyHelperClass setSrsName(String o0){ return null; }
	public MyHelperClass setOffering(String o0){ return null; }
	public MyHelperClass setVersion(String o0){ return null; }
	public MyHelperClass setService(String o0){ return null; }
	public MyHelperClass setResponseFormat(String o0){ return null; }}

class ObservationCollectionDocument {

public MyHelperClass getObservationCollection(){ return null; }}

class ObservationCollectionType {

public MyHelperClass getMemberArray(){ return null; }}

class ObservationPropertyType {

public MyHelperClass getObservation(){ return null; }}

class ObservationType {

public MyHelperClass getProcedure(){ return null; }}

class GeometryObservationTypeImpl {

public MyHelperClass getResult(){ return null; }
	public MyHelperClass getSamplingTime(){ return null; }
	public MyHelperClass getFeatureOfInterest(){ return null; }}

class TimeObjectPropertyType {

public MyHelperClass getTimeObject(){ return null; }}

class TimeInstantTypeImpl {

public MyHelperClass getTimePosition(){ return null; }}

class TimePositionType {

public MyHelperClass getObjectValue(){ return null; }}

class SimpleDateFormat {

SimpleDateFormat(String o0){}
	SimpleDateFormat(){}
	public MyHelperClass parse(String o0){ return null; }}

class FeaturePropertyType {

public MyHelperClass getDomNode(){ return null; }}

class Node {

public MyHelperClass getNodeName(){ return null; }
	public MyHelperClass getChildNodes(){ return null; }
	public MyHelperClass getNodeValue(){ return null; }
	public MyHelperClass getAttributes(){ return null; }}

class NodeList {

public MyHelperClass getLength(){ return null; }
	public MyHelperClass item(int o0){ return null; }}

class NamedNodeMap {

public MyHelperClass getNamedItem(String o0){ return null; }}

class XmlObject {

}

class GeometryPropertyTypeImpl {

public MyHelperClass getGeometry(){ return null; }}

class AbstractGeometryType {

public MyHelperClass getSrsName(){ return null; }}

class PointTypeImpl {

public MyHelperClass getDomNode(){ return null; }
	public MyHelperClass newCursor(){ return null; }}

class PointDocument {

public MyHelperClass getPoint(){ return null; }}

class PointType {

}

class XmlCursor {

public MyHelperClass toFirstChild(){ return null; }
	public MyHelperClass xmlText(){ return null; }}

class CoordinatesDocument {

public MyHelperClass getCoordinates(){ return null; }}

class CoordinatesType {

public MyHelperClass getStringValue(){ return null; }}

class Point3d {

Point3d(double o0, double o1, double o2){}
	Point3d(){}}

class GeometryFactory {

public MyHelperClass createPoint(Coordinate o0){ return null; }}

class Coordinate {

Coordinate(double o0, double o1, double o2){}
	Coordinate(){}}

class Geometry {

public MyHelperClass setSRID(int o0){ return null; }}

class XmlException extends Exception{
	public XmlException(String errorMessage) { super(errorMessage); }
}
