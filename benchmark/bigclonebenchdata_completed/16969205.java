


class c16969205 {
public MyHelperClass log(){ return null; }

    private List webArchives(ServletContext servletContext) throws IOException {
        List list =(List)(Object) new ArrayList();
        MyHelperClass WEB_LIB_PREFIX = new MyHelperClass();
        Set paths =(Set)(Object) servletContext.getResourcePaths(WEB_LIB_PREFIX);
        for (Object pathObject : (Object[])(Object)paths) {
            String path = (String) pathObject;
            if (!path.endsWith(".jar")) {
                continue;
            }
            URL url =(URL)(Object) servletContext.getResource(path);
            String jarURLString = "jar:" + url.toString() + "!/";
            url = new URL(jarURLString);
            JarFile jarFile =(JarFile)(Object) ((JarURLConnection)(JarURLConnection)(Object) url.openConnection()).getJarFile();
            MyHelperClass FACES_CONFIG_IMPLICIT = new MyHelperClass();
            JarEntry signal =(JarEntry)(Object) jarFile.getJarEntry(FACES_CONFIG_IMPLICIT);
            if (signal == null) {
                if ((boolean)(Object)log().isTraceEnabled()) {
                    log().trace("Skip JAR file " + path + " because it has no META-INF/faces-config.xml resource");
                }
                continue;
            }
            list.add(jarFile);
        }
        return list;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass trace(String o0){ return null; }
	public MyHelperClass isTraceEnabled(){ return null; }}

class ServletContext {

public MyHelperClass getResource(String o0){ return null; }
	public MyHelperClass getResourcePaths(MyHelperClass o0){ return null; }}

class List {

public MyHelperClass add(JarFile o0){ return null; }}

class JarFile {

public MyHelperClass getJarEntry(MyHelperClass o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ArrayList {

}

class Set {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class JarURLConnection {

public MyHelperClass getJarFile(){ return null; }}

class JarEntry {

}
