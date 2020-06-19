


class c20215222 {
public static MyHelperClass checkIt(Point o0, QuadTree o1){ return null; }
//public MyHelperClass checkIt(Point o0, QuadTree o1){ return null; }

    public static void main(String[] args) {
        String in = "/Users/laemmel/svn/shared-svn/projects/120multiDestPeds/floor_plan/boundaries.shp";
        String out = "/Users/laemmel/svn/shared-svn/projects/120multiDestPeds/floor_plan/boundaries_closed.shp";
        ShapeFileReader reader = new ShapeFileReader();
        reader.readFileAndInitialize(in);
        QuadTree quad = new QuadTree(reader.getBounds().getMinX(), reader.getBounds().getMinY(), reader.getBounds().getMaxX(), reader.getBounds().getMaxY());
        for (Feature ft :(Feature[])(Object) (Object[])(Object)reader.getFeatureSet()) {
            MultiLineString ml = (MultiLineString)(MultiLineString)(Object) ft.getDefaultGeometry();
            for (int i = 0; i < (int)(Object)ml.getNumGeometries(); i++) {
                LineString ls = (LineString)(LineString)(Object) ml.getGeometryN(i);
                Point start =(Point)(Object) ls.getStartPoint();
                checkIt(start, quad);
                Point end =(Point)(Object) ls.getEndPoint();
                checkIt(end, quad);
            }
        }
        MyHelperClass ShapeFileWriter = new MyHelperClass();
        ShapeFileWriter.writeGeometries(reader.getFeatureSet(), out);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass writeGeometries(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getMaxX(){ return null; }
	public MyHelperClass getMinY(){ return null; }
	public MyHelperClass getMaxY(){ return null; }
	public MyHelperClass getMinX(){ return null; }}

class ShapeFileReader {

public MyHelperClass getFeatureSet(){ return null; }
	public MyHelperClass readFileAndInitialize(String o0){ return null; }
	public MyHelperClass getBounds(){ return null; }}

class QuadTree {

QuadTree(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, MyHelperClass o3){}
	QuadTree(){}}

class Coordinate {

}

class Feature {

public MyHelperClass getDefaultGeometry(){ return null; }}

class MultiLineString {

public MyHelperClass getGeometryN(int o0){ return null; }
	public MyHelperClass getNumGeometries(){ return null; }}

class LineString {

public MyHelperClass getEndPoint(){ return null; }
	public MyHelperClass getStartPoint(){ return null; }}

class Point {

}
