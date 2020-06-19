import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4341090 {
public MyHelperClass NULL;
public MyHelperClass GET_IMAGE;
	public MyHelperClass GET_THEME_DIR;
	public MyHelperClass GET_USER_THEME;

        public Object run()  throws Throwable {
            MyHelperClass type = new MyHelperClass();
            if (type == GET_THEME_DIR) {
                String sep = File.separator;
                MyHelperClass userHome = new MyHelperClass();
                String[] dirs = new String[] { userHome + sep + ".themes", System.getProperty("swing.metacitythemedir"), "/usr/share/themes", "/usr/gnome/share/themes", "/opt/gnome2/share/themes" };
                URL themeDir = null;
                for (int i = 0; i < dirs.length; i++) {
                    if (dirs[i] == null) {
                        continue;
                    }
                    MyHelperClass arg = new MyHelperClass();
                    File dir = new File(dirs[i] + sep + arg + sep + "metacity-1");
                    if (new File(dir, "metacity-theme-1.xml").canRead()) {
                        try {
                            themeDir = dir.toURL();
                        } catch (MalformedURLException ex) {
                            themeDir = null;
                        }
                        break;
                    }
                }
                if (themeDir == null) {
                    MyHelperClass arg = new MyHelperClass();
                    String filename = "resources/metacity/" + arg + "/metacity-1/metacity-theme-1.xml";
                    URL url = getClass().getResource(filename);
                    if (url != null) {
                        String str = url.toString();
                        try {
                            themeDir = new URL(str.substring(0, str.lastIndexOf('/')) + "/");
                        } catch (MalformedURLException ex) {
                            themeDir = null;
                        }
                    }
                }
                return themeDir;
//            MyHelperClass type = new MyHelperClass();
            } else if (type == GET_USER_THEME) {
                try {
                    String userHome =(String)(Object) NULL; //new String();
                    userHome = System.getProperty("user.home");
                    String theme = System.getProperty("swing.metacitythemename");
                    if (theme != null) {
                        return theme;
                    }
//                    MyHelperClass userHome = new MyHelperClass();
                    URL url = new URL(new File((String)(Object)userHome).toURL(), ".gconf/apps/metacity/general/%25gconf.xml");
                    Reader reader = new InputStreamReader(url.openStream(), "ISO-8859-1");
                    char[] buf = new char[1024];
                    StringBuffer strBuf = new StringBuffer();
                    int n;
                    while ((n = reader.read(buf)) >= 0) {
                        strBuf.append(buf, 0, n);
                    }
                    reader.close();
                    String str = strBuf.toString();
                    if (str != null) {
                        String strLowerCase = str.toLowerCase();
                        int i = strLowerCase.indexOf("<entry name=\"theme\"");
                        if (i >= 0) {
                            i = strLowerCase.indexOf("<stringvalue>", i);
                            if (i > 0) {
                                i += "<stringvalue>".length();
                                int i2 = str.indexOf("<", i);
                                return str.substring(i, i2);
                            }
                        }
                    }
                } catch (MalformedURLException ex) {
                } catch (IOException ex) {
                }
                return null;
//            MyHelperClass type = new MyHelperClass();
            } else if (type == GET_IMAGE) {
                MyHelperClass arg = new MyHelperClass();
                return new ImageIcon((URL)(URL)(Object) arg).getImage();
            } else {
                return null;
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ImageIcon {

ImageIcon(){}
	ImageIcon(URL o0){}
	public MyHelperClass getImage(){ return null; }}
