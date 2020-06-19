


class c19062635 {

                        public Constructor run() throws Exception {
                            String path = "META-INF/services/" + ComponentApplicationContext.class.getName();
                            ClassLoader loader = Thread.currentThread().getContextClassLoader();
                            final Enumeration urls;
                            if (loader == null) {
                                urls =(Enumeration)(Object) ComponentApplicationContext.class.getClassLoader().getResources(path);
                            } else {
                                urls =(Enumeration)(Object) loader.getResources(path);
                            }
                            while ((boolean)(Object)urls.hasMoreElements()) {
                                URL url =(URL)(Object) urls.nextElement();
                                BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
                                try {
                                    String className = null;
                                    while ((className =(String)(Object) reader.readLine()) != null) {
                                        final String name = className.trim();
                                        if (!name.startsWith("#") && !name.startsWith(";") && !name.startsWith("//")) {
                                            final Class<?> cls;
                                            if (loader == null) {
                                                cls = Class.forName(name);
                                            } else {
                                                cls = Class.forName(name, true, loader);
                                            }
                                            int m = cls.getModifiers();
                                            MyHelperClass Modifier = new MyHelperClass();
                                            if (ComponentApplicationContext.class.isAssignableFrom(cls) && !(Boolean)(Object)Modifier.isAbstract(m) && !(Boolean)(Object)Modifier.isInterface(m)) {
                                                Constructor constructor =(Constructor)(Object) cls.getDeclaredConstructor();
//                                                MyHelperClass Modifier = new MyHelperClass();
                                                if (!(Boolean)(Object)Modifier.isPublic(constructor.getModifiers())) {
                                                    constructor.setAccessible(true);
                                                }
                                                return constructor;
                                            } else {
                                                throw new ClassCastException(cls.getName());
                                            }
                                        }
                                    }
                                } finally {
                                    reader.close();
                                }
                            }
                            throw new ComponentApplicationException("No " + "ComponentApplicationContext implementation " + "found.");
                        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isAbstract(int o0){ return null; }
	public MyHelperClass isInterface(int o0){ return null; }
	public MyHelperClass isPublic(MyHelperClass o0){ return null; }}

class Constructor {

public MyHelperClass setAccessible(boolean o0){ return null; }
	public MyHelperClass getModifiers(){ return null; }}

class ComponentApplicationContext {

}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class ComponentApplicationException extends Exception{
	public ComponentApplicationException(String errorMessage) { super(errorMessage); }
}
