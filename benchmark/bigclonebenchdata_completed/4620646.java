


class c4620646 {
public static MyHelperClass createGSMLFeatureFromGMLFeatureString(GeoSciML_Mapping o0, String o1){ return null; }
//public MyHelperClass createGSMLFeatureFromGMLFeatureString(GeoSciML_Mapping o0, String o1){ return null; }

    public static int ToGSML(GeoSciML_Mapping mapping, String strTemplate, String strRequest, PrintWriter sortie, String requestedSRS) throws Exception {
        String level = "info.";
        MyHelperClass ConnectorServlet = new MyHelperClass();
        if ((boolean)(Object)ConnectorServlet.debug) level = "debug.";
        MyHelperClass LogFactory = new MyHelperClass();
        Log log =(Log)(Object) LogFactory.getLog(level + "fr.brgm.exows.gml2gsml.Gml2Gsml");
        log.debug(strRequest);
        String tagFeature = "FIELDS";
        URL url2Request = new URL(strRequest);
        URLConnection conn =(URLConnection)(Object) url2Request.openConnection();
        Date dDebut = new Date();
        BufferedReader buffin = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String strLine = null;
        int nbFeatures = 0;
        MyHelperClass VelocityCreator = new MyHelperClass();
        Template template =(Template)(Object) VelocityCreator.createTemplate("/fr/brgm/exows/gml2gsml/templates/" + strTemplate);
        while ((strLine =(String)(Object) buffin.readLine()) != null) {
            if (strLine.indexOf(tagFeature) != -1) {
                nbFeatures++;
                GSMLFeatureGeneric feature =(GSMLFeatureGeneric)(Object) createGSMLFeatureFromGMLFeatureString(mapping, strLine);
                VelocityContext context = new VelocityContext();
                context.put("feature", feature);
//                MyHelperClass VelocityCreator = new MyHelperClass();
                String outputFeatureMember =(String)(Object) VelocityCreator.createXMLbyContext(context, template);
                sortie.println(outputFeatureMember);
            }
        }
        buffin.close();
        Date dFin = new Date();
        String output = "GEOSCIML : " + nbFeatures + " features handled - time : " + ((int)(Object)dFin.getTime() - (int)(Object)dDebut.getTime()) / 1000 + " [" + dDebut + " // " + dFin + "]";
        log.trace(output);
        return nbFeatures;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass debug;
public MyHelperClass getLog(String o0){ return null; }
	public MyHelperClass createTemplate(String o0){ return null; }
	public MyHelperClass createXMLbyContext(VelocityContext o0, Template o1){ return null; }}

class GeoSciML_Mapping {

}

class PrintWriter {

public MyHelperClass println(String o0){ return null; }}

class Log {

public MyHelperClass trace(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class Date {

public MyHelperClass getTime(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class Template {

}

class GSMLFeatureGeneric {

}

class VelocityContext {

public MyHelperClass put(String o0, GSMLFeatureGeneric o1){ return null; }}
