
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c15605423 {
public static MyHelperClass getRasterLayer(Map o0, String o1, MyHelperClass o2, MyHelperClass o3, String o4, MyHelperClass o5){ return null; }
public static MyHelperClass gif_name;
	public static MyHelperClass new_filename;
	public static MyHelperClass ImageCreator;
	public static MyHelperClass Debug;
//	public MyHelperClass getRasterLayer(Map o0, String o1, MyHelperClass o2, MyHelperClass o3, String o4, MyHelperClass o5){ return null; }
	public static MyHelperClass getLinuxPathEquivalent(String o0){ return null; }
	public static MyHelperClass formatPath(String o0, String o1, String o2){ return null; }
//public MyHelperClass gif_name;
//	public MyHelperClass Debug;
//	public MyHelperClass ImageCreator;
//	public MyHelperClass new_filename;
//	public MyHelperClass getLinuxPathEquivalent(String o0){ return null; }
//	public MyHelperClass formatPath(String o0, String o1, String o2){ return null; }

    private static void generateGIF(Connection con, String category, String area_code, String topic_code, String timeseries, String diff_timeseries, Calendar time, String area_label, String raster_label, String image_label, String note, Rectangle2D bounds, Rectangle2D raster_bounds, String source_filename, String diff_filename, String legend_filename, String output_filename, int output_maximum_size) throws SQLException, IOException {
        System.out.println("ImageCropper.generateGIF begin");
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
            String gif_filename = "";
            try {
                gif_filename =(String)(Object) formatPath(category, timeseries, output_filename);
                new File(new_filename).mkdirs();
                new GifEncoder(image, new FileOutputStream(gif_filename)).encode();
            } catch (UncheckedIOException e) {
                Debug.println("ImageCropper.generateGIF e: " + e.getMessage());
                throw new IOException("GenerateGIF.IOException: " + e);
            }
            PreparedStatement pstmt = null;
            try {
                String delete_raster = "delete raster_layer where " + "label='" + gif_name.trim() + "' and category='" + category.trim() + "' and area_code=' " + area_code.trim() + "'";
                pstmt =(PreparedStatement)(Object) con.prepareStatement(delete_raster);
                boolean del =(boolean)(Object) pstmt.execute();
                pstmt.close();
                String insert_raster = "insert into RASTER_LAYER " + "values(RASTER_LAYER_ID.nextval, ?, ?, ?, " + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, " + "SYSDATE, ?)";
                pstmt =(PreparedStatement)(Object) con.prepareStatement(insert_raster);
                pstmt.setString(1, gif_name);
                pstmt.setString(2, category);
                pstmt.setString(3, area_code);
                pstmt.setString(4, topic_code);
                if (time == null) {
                    pstmt.setNull(5, java.sql.Types.DATE);
                } else {
                    pstmt.setDate(5,(Date)(Object) new java.sql.Date((long)(Object)time.getTimeInMillis()));
                }
                pstmt.setString(6, timeseries);
                pstmt.setString(7, gif_filename);
                pstmt.setNull(8, java.sql.Types.INTEGER);
                pstmt.setNull(9, java.sql.Types.INTEGER);
                pstmt.setDouble(10, raster_bounds.getX());
                pstmt.setDouble(11, raster_bounds.getY());
                pstmt.setDouble(12, raster_bounds.getWidth());
                pstmt.setDouble(13, raster_bounds.getHeight());
                pstmt.setString(14, note);
                int sequence = 0;
                if ((boolean)(Object)gif_name.endsWith("DP")) {
                    sequence = 1;
                } else if ((boolean)(Object)gif_name.endsWith("DY")) {
                    sequence = 2;
                } else if ((boolean)(Object)gif_name.endsWith("DA")) {
                    sequence = 3;
                }
                pstmt.setInt(15, sequence);
                pstmt.executeUpdate();
            } catch (UncheckedIOException e) {
                Debug.println("SQLException occurred e: " + e.getMessage());
                con.rollback();
                throw new SQLException("GenerateGIF.SQLException: " + e);
            } finally {
                pstmt.close();
            }
        } catch (Exception e) {
            Debug.println("ImageCropper.generateGIF e: " + e.getMessage());
        }
        System.out.println("ImageCropper.generateGIF end");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass default_coordinate_system;
	public MyHelperClass white;
public MyHelperClass getHeight(){ return null; }
	public MyHelperClass trim(){ return null; }
	public MyHelperClass getWidth(){ return null; }
	public MyHelperClass getImage(Dimension o0){ return null; }
	public MyHelperClass println(String o0){ return null; }
	public MyHelperClass endsWith(String o0){ return null; }
	public MyHelperClass getDeviceBounds(){ return null; }}

class Connection {

public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

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

public MyHelperClass getGraphics(){ return null; }}

class Graphics {

}

class File {

File(MyHelperClass o0){}
	File(){}
	public MyHelperClass mkdirs(){ return null; }}

class GifEncoder {

GifEncoder(Image o0, FileOutputStream o1){}
	GifEncoder(){}
	public MyHelperClass encode(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

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

class Date {

}
