


class c21100655 {

    public static void init(Locale language) throws IOException {
        URL url =(URL)(Object) ClassLoader.getSystemResource("locales/" + language.getISO3Language() + ".properties");
        if (url == null) {
            throw new IOException("Could not load resource locales/" + language.getISO3Language() + ".properties");
        }
        MyHelperClass PROPS = new MyHelperClass();
        PROPS.clear();
//        MyHelperClass PROPS = new MyHelperClass();
        PROPS.load(url.openStream());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass clear(){ return null; }
	public MyHelperClass load(MyHelperClass o0){ return null; }}

class Locale {

public MyHelperClass getISO3Language(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }}
