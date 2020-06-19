
import java.io.UncheckedIOException;


class c5855466 {

    public static boolean loadTestProperties(Properties props, Class<?> callingClazz, Class<?> hierarchyRootClazz, String resourceBaseName) {
        if (!hierarchyRootClazz.isAssignableFrom(callingClazz)) {
            throw new IllegalArgumentException("Class " + callingClazz + " is not derived from " + hierarchyRootClazz);
        }
        if (null == resourceBaseName) {
            throw new NullPointerException("resourceBaseName is null");
        }
        String fqcn = callingClazz.getName();
        String uqcn = fqcn.substring(fqcn.lastIndexOf('.') + 1);
        String callingClassResource = uqcn + ".properties";
        String globalCallingClassResource = "/" + callingClassResource;
        String baseClassResource = resourceBaseName + "-" + uqcn + ".properties";
        String globalBaseClassResource = "/" + baseClassResource;
        String pkgResource = resourceBaseName + ".properties";
        String globalResource = "/" + pkgResource;
        boolean loaded = false;
        final String[] resources = { baseClassResource, globalBaseClassResource, callingClassResource, globalCallingClassResource, pkgResource, globalResource };
        List urls =(List)(Object) new ArrayList();
        Class<?> clazz = callingClazz;
        do {
            for (String res : resources) {
                URL url =(URL)(Object) clazz.getResource(res);
                if (null != url && !(Boolean)(Object)urls.contains(url)) {
                    urls.add(url);
                }
            }
            if (hierarchyRootClazz.equals(clazz)) {
                clazz = null;
            } else {
                clazz = clazz.getSuperclass();
            }
        } while (null != clazz);
        ListIterator it =(ListIterator)(Object) urls.listIterator(urls.size());
        while ((boolean)(Object)it.hasPrevious()) {
            URL url =(URL)(Object) it.previous();
            InputStream in = null;
            try {
                MyHelperClass LOG = new MyHelperClass();
                LOG.info("Loading test properties from resource: " + url);
                in =(InputStream)(Object) url.openStream();
                props.load(in);
                loaded = true;
            } catch (UncheckedIOException ex) {
                MyHelperClass LOG = new MyHelperClass();
                LOG.warn("Failed to load properties from resource: " + url,(IOException)(Object) ex);
            }
            MyHelperClass IOUtil = new MyHelperClass();
            IOUtil.closeSilently(in);
        }
        return loaded;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass warn(String o0, IOException o1){ return null; }
	public MyHelperClass closeSilently(InputStream o0){ return null; }}

class Properties {

public MyHelperClass load(InputStream o0){ return null; }}

class List {

public MyHelperClass contains(URL o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass listIterator(MyHelperClass o0){ return null; }
	public MyHelperClass add(URL o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class ArrayList {

}

class ListIterator {

public MyHelperClass hasPrevious(){ return null; }
	public MyHelperClass previous(){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
