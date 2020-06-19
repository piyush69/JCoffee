


class c17533362 {

    private long getLastModified(Set resourcePaths, Map jarPaths) throws Exception {
        long lastModified = 0;
        Iterator paths =(Iterator)(Object) resourcePaths.iterator();
        while ((boolean)(Object)paths.hasNext()) {
            String path = (String)(String)(Object) paths.next();
            MyHelperClass context = new MyHelperClass();
            URL url =(URL)(Object) context.getServletContext().getResource(path);
            if (url == null) {
                MyHelperClass log = new MyHelperClass();
                log.debug("Null url " + path);
                break;
            }
            long lastM =(long)(Object) url.openConnection().getLastModified();
            if (lastM > lastModified) lastModified = lastM;
            MyHelperClass log = new MyHelperClass();
            if ((boolean)(Object)log.isDebugEnabled()) {
//                MyHelperClass log = new MyHelperClass();
                log.debug("Last modified " + path + " " + lastM);
            }
        }
        if (jarPaths != null) {
            paths =(Iterator)(Object) jarPaths.values().iterator();
            while ((boolean)(Object)paths.hasNext()) {
                File jarFile = (File)(File)(Object) paths.next();
                long lastM =(long)(Object) jarFile.lastModified();
                if (lastM > lastModified) lastModified = lastM;
                MyHelperClass log = new MyHelperClass();
                if ((boolean)(Object)log.isDebugEnabled()) {
//                    MyHelperClass log = new MyHelperClass();
                    log.debug("Last modified " + jarFile.getAbsolutePath() + " " + lastM);
                }
            }
        }
        return lastModified;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass getServletContext(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass getResource(String o0){ return null; }
	public MyHelperClass getLastModified(){ return null; }}

class Set {

public MyHelperClass iterator(){ return null; }}

class Map {

public MyHelperClass values(){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class File {

public MyHelperClass lastModified(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }}
