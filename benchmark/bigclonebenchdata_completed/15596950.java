


class c15596950 {
public static MyHelperClass cl;
	public static MyHelperClass fixFilename(String o0){ return null; }
//public MyHelperClass cl;
//	public MyHelperClass fixFilename(String o0){ return null; }

    private static ImageIcon tryLoadImageIconFromResource(String filename, String path, int width, int height) {
        ImageIcon icon = null;
        try {
            MyHelperClass pathSeparator = new MyHelperClass();
            URL url =(URL)(Object) cl.getResource(path + pathSeparator + fixFilename(filename));
            if (url != null && url.openStream() != null) {
                icon = new ImageIcon(url);
            }
        } catch (Exception e) {
        }
        if (icon == null) {
            return null;
        }
        if (((int)(Object)icon.getIconWidth() == width) && ((int)(Object)icon.getIconHeight() == height)) {
            return icon;
        } else {
            return new ImageIcon((URL)(Object)icon.getImage().getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH));
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getResource(String o0){ return null; }
	public MyHelperClass getScaledInstance(int o0, int o1, int o2){ return null; }}

class ImageIcon {

ImageIcon(){}
	ImageIcon(URL o0){}
	public MyHelperClass getImage(){ return null; }
	public MyHelperClass getIconHeight(){ return null; }
	public MyHelperClass getIconWidth(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}
