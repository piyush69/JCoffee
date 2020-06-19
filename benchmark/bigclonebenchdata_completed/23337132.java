


class c23337132 {

    @SuppressWarnings("rawtypes")
    public static String[] loadAllPropertiesFromClassLoader(Properties properties, String... resourceNames) throws IOException {
        List successLoadProperties =(List)(Object) new ArrayList();
        for (String resourceName : resourceNames) {
            URL url =(URL)(Object) GeneratorProperties.class.getResource(resourceName);
            if (url != null) {
                successLoadProperties.add(url.getFile());
                InputStream input = null;
                try {
                    URLConnection con =(URLConnection)(Object) url.openConnection();
                    con.setUseCaches(false);
                    input =(InputStream)(Object) con.getInputStream();
                    if (resourceName.endsWith(".xml")) {
                        properties.loadFromXML(input);
                    } else {
                        properties.load(input);
                    }
                } finally {
                    if (input != null) {
                        input.close();
                    }
                }
            }
        }
        return (String[])(String[])(Object) successLoadProperties.toArray(new String[0]);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Properties {

public MyHelperClass load(InputStream o0){ return null; }
	public MyHelperClass loadFromXML(InputStream o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class List {

public MyHelperClass toArray(String[] o0){ return null; }
	public MyHelperClass add(MyHelperClass o0){ return null; }}

class ArrayList {

}

class URL {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getFile(){ return null; }}

class GeneratorProperties {

}

class InputStream {

public MyHelperClass close(){ return null; }}

class URLConnection {

public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}
