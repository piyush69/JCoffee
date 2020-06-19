
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c15659812 {
public static MyHelperClass getRasterLayer(Map o0, String o1, MyHelperClass o2, MyHelperClass o3, String o4, MyHelperClass o5){ return null; }
public static MyHelperClass new_filename;
	public static MyHelperClass TIFFCodec;
	public static MyHelperClass ImageCreator;
	public static MyHelperClass TIFFEncodeParam;
	public static MyHelperClass BufferedImage;
	public static MyHelperClass tiff_name;
//	public MyHelperClass getRasterLayer(Map o0, String o1, MyHelperClass o2, MyHelperClass o3, String o4, MyHelperClass o5){ return null; }
	public static MyHelperClass getLinuxPathEquivalent(String o0){ return null; }
	public static MyHelperClass formatPath(String o0, String o1, String o2){ return null; }
//public MyHelperClass BufferedImage;
	public MyHelperClass Debug;
//	public MyHelperClass TIFFCodec;
//	public MyHelperClass tiff_name;
//	public MyHelperClass ImageCreator;
//	public MyHelperClass new_filename;
//	public MyHelperClass TIFFEncodeParam;
//	public MyHelperClass getLinuxPathEquivalent(String o0){ return null; }
//	public MyHelperClass formatPath(String o0, String o1, String o2){ return null; }

    private static void generateTIFF(Connection con, String category, String area_code, String topic_code, String timeseries, String diff_timeseries, Calendar time, String area_label, String raster_label, String image_label, String note, Rectangle2D bounds, Rectangle2D raster_bounds, String source_filename, String diff_filename, String legend_filename, String output_filename, int output_maximum_size) throws SQLException, IOException {
        MyHelperClass Debug = new MyHelperClass();
        Debug.println("ImageCropper.generateTIFF begin");
        MapContext map_context = new MapContext("test", new Configuration());
        try {
            Map map = new Map(map_context, area_label, new Configuration());
            MyHelperClass ProjectionCategories = new MyHelperClass();
            map.setCoordSys(ProjectionCategories.default_coordinate_system);
            MyHelperClass Color = new MyHelperClass();
            map.setPatternOutline(new XPatternOutline(new XPatternPaint(Color.white)));
            String type = null;
            RasterLayer rlayer =(RasterLayer)(Object) getRasterLayer(map, raster_label, getLinuxPathEquivalent(source_filename), getLinuxPathEquivalent(diff_filename), type, getLinuxPathEquivalent(legend_filename));
            map.addLayer(rlayer, true);
            map.setBounds2DImage(bounds, true);
            Dimension image_dim = null;
            image_dim = new Dimension((int)(int)(Object) rlayer.raster.getDeviceBounds().getWidth() + 1, (int)(int)(Object) rlayer.raster.getDeviceBounds().getHeight() + 1);
            if (output_maximum_size > 0) {
                double width_factor =(int)(Object) image_dim.getWidth() / output_maximum_size;
                double height_factor =(int)(Object) image_dim.getHeight() / output_maximum_size;
                double factor = Math.max(width_factor, height_factor);
                if (factor > 1.0) {
                    image_dim.setSize((double)(Object)image_dim.getWidth() / factor,(double)(Object) image_dim.getHeight() / factor);
                }
            }
            map.setImageDimension(image_dim);
            map.scale();
            image_dim = new Dimension((int)(int)(Object) map.getBounds2DImage().getWidth(), (int)(int)(Object) map.getBounds2DImage().getHeight());
            Image image = null;
            Graphics gr = null;
            image =(Image)(Object) ImageCreator.getImage(image_dim);
            gr =(Graphics)(Object) image.getGraphics();
            try {
                map.paint(gr);
            } catch (Exception e) {
                Debug.println("map.paint error: " + e.getMessage());
            }
            String tiff_filename = "";
            try {
                tiff_filename =(String)(Object) formatPath(category, timeseries, output_filename);
                new File(new_filename).mkdirs();
                Debug.println("tiff_filename: " + tiff_filename);
                BufferedImage bi = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_BYTE_INDEXED);
                bi.createGraphics().drawImage(image, 0, 0, null);
                File f = new File(tiff_filename);
                FileOutputStream out = new FileOutputStream(f);
                TIFFEncodeParam param = new TIFFEncodeParam();
                param.setCompression(TIFFEncodeParam.COMPRESSION_PACKBITS);
                TIFFImageEncoder encoder = (TIFFImageEncoder)(TIFFImageEncoder)(Object) TIFFCodec.createImageEncoder("tiff", out, param);
                encoder.encode(bi);
                out.close();
            } catch (UncheckedIOException e) {
                Debug.println("ImageCropper.generateTIFF TIFFCodec e: " + e.getMessage());
                throw new IOException("GenerateTIFF.IOException: " + e);
            }
            PreparedStatement pstmt = null;
            try {
                String query = "select Proj_ID, AccessType_Code from project " + "where Proj_Code= '" + area_code.trim() + "'";
                Statement stmt = null;
                ResultSet rs = null;
                int proj_id = -1;
                int access_code = -1;
                stmt =(Statement)(Object) con.createStatement();
                rs =(ResultSet)(Object) stmt.executeQuery(query);
                if ((boolean)(Object)rs.next()) {
                    proj_id =(int)(Object) rs.getInt(1);
                    access_code =(int)(Object) rs.getInt(2);
                }
                rs.close();
                stmt.close();
                String delete_raster = "delete from rasterlayer where " + "Raster_Name='" + tiff_name.trim() + "' and Group_Code='" + category.trim() + "' and Proj_ID =" + proj_id;
                Debug.println("***** delete_raster: " + delete_raster);
                pstmt =(PreparedStatement)(Object) con.prepareStatement(delete_raster);
                boolean del =(boolean)(Object) pstmt.execute();
                pstmt.close();
                String insert_raster = "insert into rasterlayer(Raster_Name, " + "Group_Code, Proj_ID, Raster_TimeCode, Raster_Xmin, " + "Raster_Ymin, Raster_Area_Xmin, Raster_Area_Ymin, " + "Raster_Visibility, Raster_Order, Raster_Path, " + "AccessType_Code, Raster_TimePeriod) values(?,?,?,?, " + "?,?,?,?,?,?,?,?,?)";
                pstmt =(PreparedStatement)(Object) con.prepareStatement(insert_raster);
                pstmt.setString(1, tiff_name);
                pstmt.setString(2, category);
                pstmt.setInt(3, proj_id);
                pstmt.setString(4, timeseries);
                pstmt.setDouble(5, raster_bounds.getX());
                pstmt.setDouble(6, raster_bounds.getY());
                pstmt.setDouble(7, raster_bounds.getWidth());
                pstmt.setDouble(8, raster_bounds.getHeight());
                pstmt.setString(9, "false");
                int sequence = 0;
                if ((boolean)(Object)tiff_name.endsWith("DP")) {
                    sequence = 1;
                } else if ((boolean)(Object)tiff_name.endsWith("DY")) {
                    sequence = 2;
                } else if ((boolean)(Object)tiff_name.endsWith("DA")) {
                    sequence = 3;
                }
                pstmt.setInt(10, sequence);
                pstmt.setString(11, tiff_filename);
                pstmt.setInt(12, access_code);
                if (time == null) {
                    pstmt.setNull(13, java.sql.Types.DATE);
                } else {
                    pstmt.setDate(13,(Date)(Object) new java.sql.Date((long)(Object)time.getTimeInMillis()));
                }
                pstmt.executeUpdate();
            } catch (UncheckedIOException e) {
                Debug.println("SQLException occurred e: " + e.getMessage());
                con.rollback();
                throw new SQLException("GenerateTIFF.SQLException: " + e);
            } finally {
                pstmt.close();
            }
        } catch (Exception e) {
            Debug.println("ImageCropper.generateTIFF e: " + e.getMessage());
        }
        Debug.println("ImageCropper.generateTIFF end");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass default_coordinate_system;
	public MyHelperClass TYPE_BYTE_INDEXED;
	public MyHelperClass white;
	public MyHelperClass COMPRESSION_PACKBITS;
public MyHelperClass getHeight(){ return null; }
	public MyHelperClass trim(){ return null; }
	public MyHelperClass createImageEncoder(String o0, FileOutputStream o1, TIFFEncodeParam o2){ return null; }
	public MyHelperClass getWidth(){ return null; }
	public MyHelperClass getImage(Dimension o0){ return null; }
	public MyHelperClass println(String o0){ return null; }
	public MyHelperClass drawImage(Image o0, int o1, int o2, Object o3){ return null; }
	public MyHelperClass endsWith(String o0){ return null; }
	public MyHelperClass getDeviceBounds(){ return null; }}

class Connection {

public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Calendar {

public MyHelperClass getTimeInMillis(){ return null; }}

class Rectangle2D {

public MyHelperClass getY(){ return null; }
	public MyHelperClass getX(){ return null; }
	public MyHelperClass getHeight(){ return null; }
	public MyHelperClass getWidth(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class MapContext {

MapContext(String o0, Configuration o1){}
	MapContext(){}}

class Configuration {

}

class Map {

Map(){}
	Map(MapContext o0, String o1, Configuration o2){}
	public MyHelperClass addLayer(RasterLayer o0, boolean o1){ return null; }
	public MyHelperClass setCoordSys(MyHelperClass o0){ return null; }
	public MyHelperClass getBounds2DImage(){ return null; }
	public MyHelperClass setBounds2DImage(Rectangle2D o0, boolean o1){ return null; }
	public MyHelperClass paint(Graphics o0){ return null; }
	public MyHelperClass setImageDimension(Dimension o0){ return null; }
	public MyHelperClass scale(){ return null; }
	public MyHelperClass setPatternOutline(XPatternOutline o0){ return null; }}

class XPatternOutline {

XPatternOutline(){}
	XPatternOutline(XPatternPaint o0){}}

class XPatternPaint {

XPatternPaint(MyHelperClass o0){}
	XPatternPaint(){}}

class RasterLayer {
public MyHelperClass raster;
}

class Dimension {

Dimension(){}
	Dimension(int o0, int o1){}
	public MyHelperClass getHeight(){ return null; }
	public MyHelperClass getWidth(){ return null; }
	public MyHelperClass setSize(double o0, double o1){ return null; }}

class Image {

public MyHelperClass getHeight(Object o0){ return null; }
	public MyHelperClass getWidth(Object o0){ return null; }
	public MyHelperClass getGraphics(){ return null; }}

class Graphics {

}

class File {

File(MyHelperClass o0){}
	File(String o0){}
	File(){}
	public MyHelperClass mkdirs(){ return null; }}

class BufferedImage {

BufferedImage(){}
	BufferedImage(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){}
	public MyHelperClass createGraphics(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}

class TIFFEncodeParam {

public MyHelperClass setCompression(MyHelperClass o0){ return null; }}

class TIFFImageEncoder {

public MyHelperClass encode(BufferedImage o0){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setNull(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass execute(){ return null; }
	public MyHelperClass setDouble(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setDate(int o0, Date o1){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass next(){ return null; }}

class Date {

}
