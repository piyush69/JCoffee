


class c1884160 {

    public static void registerProviders(ResteasyProviderFactory factory) throws Exception {
        Enumeration en =(Enumeration)(Object) Thread.currentThread().getContextClassLoader().getResources("META-INF/services/" + Providers.class.getName());
        LinkedHashSet set = new LinkedHashSet();
        while ((boolean)(Object)en.hasMoreElements()) {
            URL url =(URL)(Object) en.nextElement();
            InputStream is =(InputStream)(Object) url.openStream();
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                String line;
                while ((line =(String)(Object) reader.readLine()) != null) {
                    line = line.trim();
                    if (line.equals("")) continue;
                    set.add(line);
                }
            } finally {
                is.close();
            }
        }
        for (String line :(String[])(Object) (Object[])(Object)set) {
            try {
                Class clazz = Thread.currentThread().getContextClassLoader().loadClass(line);
                factory.registerProvider(clazz, true);
            } catch (NoClassDefFoundError e) {
                MyHelperClass logger = new MyHelperClass();
                logger.warn("NoClassDefFoundError: Unable to load builtin provider: " + line);
            } catch (ClassNotFoundException e) {
                MyHelperClass logger = new MyHelperClass();
                logger.warn("ClassNotFoundException: Unable to load builtin provider: " + line);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warn(String o0){ return null; }}

class ResteasyProviderFactory {

public MyHelperClass registerProvider(Class o0, boolean o1){ return null; }}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class Providers {

}

class LinkedHashSet {

public MyHelperClass add(String o0){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}
