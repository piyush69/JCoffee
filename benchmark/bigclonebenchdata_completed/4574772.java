


class c4574772 {

    public static boolean init(String language) {
        URL url =(URL)(Object) S.class.getResource("strings_" + language + ".txt");
        Properties strings;// = new Properties();
        strings = new Properties();
        try {
//            MyHelperClass strings = new MyHelperClass();
            strings.load(url.openStream());
        } catch (Exception e) {
            String def = "en";
            if (language.equals(def)) return false;
            return init(def);
        }
        ;
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass load(MyHelperClass o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class S {

}

class Properties {

public MyHelperClass load(MyHelperClass o0){ return null; }}
