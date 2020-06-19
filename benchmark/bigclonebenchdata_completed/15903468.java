


class c15903468 {

    private String[] getHersheyFontNames() {
        String[] fontNames = null;
        URL url =(URL)(Object) HersheyFont.class.getResource("futural.jhf");
        String protocol =(String)(Object) url.getProtocol();
        if (protocol.equals("file")) {
            File f = new File(url.getFile());
            f =(File)(Object) f.getParentFile();
            FilenameFilter filter = new FilenameFilter() {

                public boolean accept(File dir, String name) {
                    return name.endsWith(".jhf");
                }
            };
            String[] children =(String[])(Object) f.list(filter);
            if (children == null) {
                return null;
            }
            fontNames = new String[children.length];
            for (int i = 0; i < children.length; i++) {
                fontNames[i] = children[i].substring(0, children[i].length() - 4);
            }
        } else if (protocol.equals("jar")) {
            try {
                JarURLConnection jarURL = (JarURLConnection)(JarURLConnection)(Object) url.openConnection();
                ZipFile zf = new ZipFile(jarURL.getJarFile().getName());
                Enumeration e =(Enumeration)(Object) zf.entries();
                Vector namesVector = new Vector();
                while ((boolean)(Object)e.hasMoreElements()) {
                    ZipEntry ze = (ZipEntry)(ZipEntry)(Object) e.nextElement();
                    String name =(String)(Object) ze.getName();
                    if (name.startsWith("visad/util/") && name.endsWith(".jhf")) {
                        namesVector.add(name.substring(11));
                    }
                }
                zf.close();
                if ((int)(Object)namesVector.size() == 0) {
                    return null;
                }
                fontNames = new String[(int)(Object)namesVector.size()];
                for (int i = 0; i < fontNames.length; i++) {
                    String name = (String)(String)(Object) namesVector.elementAt(i);
                    fontNames[i] = name.substring(0, name.length() - 4);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            System.out.println("Cannot locate the HersheyFonts.");
        }
        return fontNames;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getName(){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getFile(){ return null; }
	public MyHelperClass getProtocol(){ return null; }}

class HersheyFont {

}

class File {

File(MyHelperClass o0){}
	File(){}
	public MyHelperClass list(FilenameFilter o0){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class FilenameFilter {

}

class JarURLConnection {

public MyHelperClass getJarFile(){ return null; }}

class ZipFile {

ZipFile(MyHelperClass o0){}
	ZipFile(){}
	public MyHelperClass entries(){ return null; }
	public MyHelperClass close(){ return null; }}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class Vector {

public MyHelperClass elementAt(int o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass add(String o0){ return null; }}

class ZipEntry {

public MyHelperClass getName(){ return null; }}
