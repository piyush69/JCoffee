import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12462567 {
public MyHelperClass fontSizeMedium;
	public MyHelperClass viewName;
	public MyHelperClass viewShape;
	public MyHelperClass fontSizeHuge;
	public MyHelperClass tileWidth;
	public MyHelperClass tileOffset;
	public MyHelperClass fontSizeSmall;
	public MyHelperClass tileHeight;
	public MyHelperClass iconHeight;
	public MyHelperClass fontSizeLarge;
	public MyHelperClass iconWidth;
	public MyHelperClass path;
	public MyHelperClass properties;
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass getIntProperty(String o0, int o1){ return null; }

        public  void ViewProperties(String basePath, String baseFile) throws Throwable, Exception {
            FileInputStream input = null;
            String file = basePath + "/" + baseFile + ".properties";
            properties =(MyHelperClass)(Object) new Properties();
            try {
                URL url = MapViewer.class.getResource(file);
                properties.load(url.openStream());
                viewName =(MyHelperClass)(Object) (String) properties.get("view.name");
                viewShape =(MyHelperClass)(Object) (String) properties.get("view.shape");
                path = basePath + "/"(MyHelperClass)(Object) + (String) properties.get("icon.path");
                iconHeight = getIntProperty("icon.height", 96);
                iconWidth = getIntProperty("icon.width", 96);
                fontSizeSmall = getIntProperty("font.small.size", 10);
                fontSizeMedium = getIntProperty("font.medium.size", 12);
                fontSizeLarge = getIntProperty("font.large.size", 16);
                fontSizeHuge = getIntProperty("font.huge.size", 20);
                if (viewShape.equals("Hexagonal")) {
                    tileHeight = (int) (Math.sqrt(3.0) / 2.0 * (double)(Object)iconWidth);
                    tileWidth = (int) ((double)(Object)iconWidth * 3.0 / 4.0);
                    tileOffset = (int) ((double)(Object)tileHeight / 2.0);
                } else {
                    tileHeight = iconHeight;
                    tileWidth = iconWidth;
                    tileOffset =(MyHelperClass)(Object) 0;
                }
            } catch (Exception e) {
                error("Cannot load properties from file [" + file + "]");
                throw e;
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass load(InputStream o0){ return null; }}

class MapViewer {

}
