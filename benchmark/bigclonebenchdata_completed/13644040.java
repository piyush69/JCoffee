import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13644040 {
public static MyHelperClass createFieldsInsert(Connection o0, int o1, String o2, String o3){ return null; }
	public static MyHelperClass createLayersInsert(Connection o0, int o1, String o2, String o3, String o4, String o5, float o6, float o7, float o8, float o9, float o10, float o11, String o12){ return null; }
public static MyHelperClass GEOSERVER_QUERY_TEMPLATE;
	public static MyHelperClass EntityUtils;
	public static MyHelperClass MessageFormat;
//	public MyHelperClass createLayersInsert(Connection o0, int o1, String o2, String o3, String o4, String o5, float o6, float o7, float o8, float o9, float o10, float o11, String o12){ return null; }
//	public MyHelperClass createFieldsInsert(Connection o0, int o1, String o2, String o3){ return null; }
	public static MyHelperClass matchPattern(String o0, String o1){ return null; }
//public MyHelperClass GEOSERVER_QUERY_TEMPLATE;
//	public MyHelperClass MessageFormat;
//	public MyHelperClass EntityUtils;
	public MyHelperClass FileUtils;
//	public MyHelperClass matchPattern(String o0, String o1){ return null; }

    public static void main(String[] args) throws Throwable, Exception {
        String layerName = args[0];
        String layerDescription = args[1];
        String units = args[2];
        String rawDataDirPath = args[3];
        String processDirPath = args[4];
        String divaDirPath = args[5];
        String legendDirPath = args[6];
        String geotiffDirPath = args[7];
        String dbJdbcUrl = args[8];
        String dbUsername = args[9];
        String dbPassword = args[10];
        String geoserverUsername = args[11];
        String geoserverPassword = args[12];
        File rawDataDir = new File(rawDataDirPath);
        if (!rawDataDir.exists() || !rawDataDir.isDirectory()) {
            throw new RuntimeException("Supplied raw data directory " + rawDataDirPath + " does not exist or is not a directory");
        }
        File processDir = new File(processDirPath);
        if (!processDir.exists() || !processDir.isDirectory()) {
            throw new RuntimeException("Supplied process directory " + processDirPath + " does not exist or is not a directory");
        }
        File divaDir = new File(divaDirPath);
        if (!divaDir.exists() || !divaDir.isDirectory()) {
            throw new RuntimeException("Supplied diva directory " + divaDirPath + " does not exist or is not a directory");
        }
        File legendDir = new File(legendDirPath);
        if (!legendDir.exists() || !legendDir.isDirectory()) {
            throw new RuntimeException("Supplied legend directory " + legendDirPath + " does not exist or is not a directory");
        }
        File geotiffDir = new File(geotiffDirPath);
        if (!geotiffDir.exists() || !geotiffDir.isDirectory()) {
            throw new RuntimeException("Supplied geotiff directory " + geotiffDirPath + " does not exist or is not a directory");
        }
        System.out.println("Beginning environmetal load");
        System.out.println("Connecting to database");
        Class.forName("org.postgresql.Driver");
        Properties props = new Properties();
        props.setProperty("user", dbUsername);
        props.setProperty("password", dbPassword);
        MyHelperClass DriverManager = new MyHelperClass();
        Connection conn =(Connection)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) DriverManager.getConnection(dbJdbcUrl, props);
        conn.setAutoCommit(false);
        try {
            File layerProcessDir = new File(processDir, layerName);
            layerProcessDir.mkdir();
            System.out.println("Running gdalwarp");
            File hdrFile = new File(rawDataDir, "hdr.adf");
            if (!hdrFile.exists()) {
                throw new RuntimeException("Could not find hdr.adf in " + rawDataDirPath);
            }
            File bilFile = new File(layerProcessDir, layerName + ".bil");
            Process procGdalWarp = Runtime.getRuntime().exec(new String[] { "gdalwarp", "-of", "EHdr", "-ot", "Float32", hdrFile.getAbsolutePath(), bilFile.getAbsolutePath() });
            int gdalWarpReturnVal = procGdalWarp.waitFor();
            if (gdalWarpReturnVal != 0) {
                MyHelperClass IOUtils = new MyHelperClass();
                String gdalWarpErrorOutput = IOUtils.toString(procGdalWarp.getErrorStream());
                throw new RuntimeException("gdalwarp failed: " + gdalWarpErrorOutput);
            }
            System.out.println("Running Bil2diva");
            MyHelperClass Bil2diva = new MyHelperClass();
            boolean bil2DivaSuccess =(boolean)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) Bil2diva.bil2diva(layerProcessDir.getAbsolutePath() + File.separator + layerName, divaDir.getAbsolutePath() + File.separator + layerName, units);
            if (!bil2DivaSuccess) {
                throw new RuntimeException("Bil2diva Failed");
            }
            System.out.println("Running GridLegend");
            MyHelperClass GridLegend = new MyHelperClass();
            boolean gridLegendSuccess =(boolean)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) GridLegend.generateGridLegend(divaDir.getAbsolutePath() + File.separator + layerName, legendDir.getAbsolutePath() + File.separator + layerName, 1, false);
            if (!gridLegendSuccess) {
                throw new RuntimeException("GridLegend Failed");
            }
            System.out.println("Running gdal_translate");
            File geotiffFile = new File(geotiffDir, layerName + ".tif");
            Process procGdalTranslate = Runtime.getRuntime().exec(new String[] { "gdal_translate", "-of", "GTiff", bilFile.getAbsolutePath(), geotiffFile.getAbsolutePath() });
            int gdalTranslateReturnVal = procGdalTranslate.waitFor();
            if (gdalTranslateReturnVal != 0) {
                MyHelperClass IOUtils = new MyHelperClass();
                String gdalTranslateErrorOutput = IOUtils.toString(procGdalTranslate.getErrorStream());
                throw new RuntimeException("gdal_translate failed: " + gdalTranslateErrorOutput);
            }
            System.out.println("Extracting extents and min/max environmental value from diva .grd file");
            File divaGrd = new File(divaDir, layerName + ".grd");
            if (!divaGrd.exists()) {
                throw new RuntimeException("Could not locate diva .grd file: " + divaGrd.toString());
            }
            MyHelperClass FileUtils = new MyHelperClass();
            String strDivaGrd =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) FileUtils.readFileToString(divaGrd);
            float minValue = Float.parseFloat((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)matchPattern(strDivaGrd, "^MinValue=(.+)$"));
            float maxValue = Float.parseFloat((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)matchPattern(strDivaGrd, "^MaxValue=(.+)$"));
            float minLatitude = Float.parseFloat((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)matchPattern(strDivaGrd, "^MinY=(.+)$"));
            float maxLatitude = Float.parseFloat((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)matchPattern(strDivaGrd, "^MaxY=(.+)$"));
            float minLongitude = Float.parseFloat((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)matchPattern(strDivaGrd, "^MinX=(.+)$"));
            float maxLongitude = Float.parseFloat((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)matchPattern(strDivaGrd, "^MaxX=(.+)$"));
            System.out.println("Generating ID for new layer...");
            Statement st =(Statement)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) conn.createStatement();
            ResultSet rs =(ResultSet)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) st.executeQuery("SELECT MAX(id) from layers");
            rs.next();
            int id = 1;
            String idAsString =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) rs.getString(1);
            if (idAsString != null) {
                id = Integer.parseInt(idAsString);
                id++;
            }
            String displayPath =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) MessageFormat.format(GEOSERVER_QUERY_TEMPLATE, layerName);
            System.out.println("Creating layers table entry...");
            PreparedStatement createLayersStatement =(PreparedStatement)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) createLayersInsert(conn, id, layerDescription, divaDir.getAbsolutePath(), layerName, displayPath, minLatitude, minLongitude, maxLatitude, maxLongitude, minValue, maxValue, units);
            createLayersStatement.execute();
            System.out.println("Creating fields table entry...");
            PreparedStatement createFieldsStatement =(PreparedStatement)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) createFieldsInsert(conn, id, layerName, layerDescription);
            createFieldsStatement.execute();
            DefaultHttpClient httpClient = new DefaultHttpClient();
            httpClient.getCredentialsProvider().setCredentials(new AuthScope("localhost", 8082), new UsernamePasswordCredentials(geoserverUsername, geoserverPassword));
            System.out.println("Creating layer in geoserver...");
            HttpPut createLayerPut = new HttpPut(String.format("http://localhost:8082/geoserver/rest/workspaces/ALA/coveragestores/%s/external.geotiff", layerName));
            createLayerPut.setHeader("Content-type", "text/plain");
            createLayerPut.setEntity(new StringEntity(geotiffFile.toURI().toURL().toString()));
            HttpResponse createLayerResponse =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpClient.execute(createLayerPut);
            if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(int)(Object)createLayerResponse.getStatusLine().getStatusCode() != 200) {
                throw new RuntimeException("Error creating layer in geoserver: " + createLayerResponse.toString());
            }
            EntityUtils.consume(createLayerResponse.getEntity());
            System.out.println("Creating style in geoserver");
            HttpPost createStylePost = new HttpPost("http://localhost:8082/geoserver/rest/styles");
            createStylePost.setHeader("Content-type", "text/xml");
            createStylePost.setEntity(new StringEntity(String.format("<style><name>%s_style</name><filename>%s.sld</filename></style>", layerName, layerName)));
            HttpResponse createStyleResponse =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpClient.execute(createLayerPut);
            if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(int)(Object)createStyleResponse.getStatusLine().getStatusCode() != 201) {
                throw new RuntimeException("Error creating style in geoserver: " + createStyleResponse.toString());
            }
            EntityUtils.consume(createStyleResponse.getEntity());
            System.out.println("Uploading sld file to geoserver");
            File sldFile = new File(legendDir, layerName + ".sld");
            String sldData =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) FileUtils.readFileToString(sldFile);
            HttpPut uploadSldPut = new HttpPut(String.format("http://localhost:8082/geoserver/rest/styles/%s_style", layerName));
            uploadSldPut.setHeader("Content-type", "application/vnd.ogc.sld+xml");
            uploadSldPut.setEntity(new StringEntity(sldData));
            HttpResponse uploadSldResponse =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpClient.execute(uploadSldPut);
            if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(int)(Object)uploadSldResponse.getStatusLine().getStatusCode() != 200) {
                throw new RuntimeException("Error uploading sld file geoserver: " + uploadSldResponse.toString());
            }
            EntityUtils.consume(uploadSldResponse.getEntity());
            System.out.println("Setting default style in geoserver");
            HttpPut setDefaultStylePut = new HttpPut(String.format("http://localhost:8082/geoserver/rest/layers/ALA:%s", layerName));
            setDefaultStylePut.setHeader("Content-type", "text/xml");
            setDefaultStylePut.setEntity(new StringEntity(String.format("<layer><enabled>true</enabled><defaultStyle><name>%s_style</name></defaultStyle></layer>", layerName)));
            HttpResponse setDefaultStyleResponse =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpClient.execute(createLayerPut);
            if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(int)(Object)setDefaultStyleResponse.getStatusLine().getStatusCode() != 200) {
                throw new RuntimeException("Setting default style in geoserver: " + setDefaultStyleResponse.toString());
            }
            EntityUtils.consume(setDefaultStyleResponse.getEntity());
            conn.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            conn.rollback();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass format(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getConnection(String o0, Properties o1){ return null; }
	public MyHelperClass readFileToString(File o0){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass bil2diva(String o0, String o1, String o2){ return null; }
	public MyHelperClass setCredentials(AuthScope o0, UsernamePasswordCredentials o1){ return null; }
	public MyHelperClass consume(MyHelperClass o0){ return null; }
	public MyHelperClass generateGridLegend(String o0, String o1, int o2, boolean o3){ return null; }}

class Connection {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass commit(){ return null; }}

class Statement {

public MyHelperClass executeQuery(String o0){ return null; }}

class ResultSet {

public MyHelperClass getString(int o0){ return null; }
	public MyHelperClass next(){ return null; }}

class PreparedStatement {

public MyHelperClass execute(){ return null; }}

class DefaultHttpClient {

public MyHelperClass execute(HttpPut o0){ return null; }
	public MyHelperClass getCredentialsProvider(){ return null; }}

class AuthScope {

AuthScope(String o0, int o1){}
	AuthScope(){}}

class UsernamePasswordCredentials {

UsernamePasswordCredentials(String o0, String o1){}
	UsernamePasswordCredentials(){}}

class HttpPut {

HttpPut(String o0){}
	HttpPut(){}
	public MyHelperClass setEntity(StringEntity o0){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class StringEntity {

StringEntity(String o0){}
	StringEntity(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass setEntity(StringEntity o0){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class Object {

public MyHelperClass toString(InputStream o0){ return null; }}
