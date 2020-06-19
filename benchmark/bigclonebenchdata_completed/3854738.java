import java.io.*;
import java.lang.*;
import java.util.*;



class c3854738 {
public MyHelperClass NULL;

    public void loadProperties() throws IOException {
        MyHelperClass filename = new MyHelperClass();
        File file = new File((String)(Object)filename);
        URL url =(URL)(Object) file.toURI().toURL();
        Properties temp = new Properties();
        temp.load((Reader)(Object)url.openStream());
        Point2d start = new Point2d();
        Point2d end = new Point2d();
        if (temp.getProperty("StartX") != null) try {
            start.x =(MyHelperClass)(Object) Double.valueOf(temp.getProperty("StartX"));
        } catch (Exception e) {
            System.out.println("Error loading StartX - leaving as default: " + e);
        }
        if (temp.getProperty("StartY") != null) try {
            start.y =(MyHelperClass)(Object) Double.valueOf(temp.getProperty("StartY"));
        } catch (Exception e) {
            System.out.println("Error loading StartY - leaving as default: " + e);
        }
        if (temp.getProperty("EndX") != null) try {
            end.x =(MyHelperClass)(Object) Double.valueOf(temp.getProperty("EndX"));
        } catch (Exception e) {
            System.out.println("Error loading EndX - leaving as default: " + e);
        }
        if (temp.getProperty("EndY") != null) try {
            end.y =(MyHelperClass)(Object) Double.valueOf(temp.getProperty("EndY"));
        } catch (Exception e) {
            System.out.println("Error loading EndY - leaving as default: " + e);
        }
        LineSegment2D initialline =(LineSegment2D)(Object) NULL; //new LineSegment2D();
        initialline = new LineSegment2D(start, end);
        if (temp.getProperty("ReferenceImage") != null) try {
            Integer referenceimage =(Integer)(Object) NULL; //new Integer();
            referenceimage = Integer.valueOf(temp.getProperty("ReferenceImage"));
        } catch (Exception e) {
            System.out.println("Error loading ReferenceImage - leaving as default: " + e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class Point2d {
public MyHelperClass x;
	public MyHelperClass y;
}

class LineSegment2D {

LineSegment2D(Point2d o0, Point2d o1){}
	LineSegment2D(){}}
