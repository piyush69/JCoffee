


class c3670918 {

//    @Test
    public void testEmptyValue() throws Exception {
        System.out.println("Test Empty Value...");
        EProperties props = new EProperties();
        URL url =(URL)(Object) this.getClass().getResource("emptyval.properties");
        System.out.println("Properties URL " + url);
        System.out.println("******************  LOADING URL  *************************");
        props.load(url);
        System.out.println("---list---");
        System.out.println(props.list());
        System.out.println("---list---");
        System.out.println("******************  LOADING Reader  *************************");
        EProperties p2 = new EProperties();
        p2.load((URL)(Object)new InputStreamReader(url.openStream()));
        System.out.println("---list---");
        System.out.println(p2.list());
        System.out.println("---list---");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Test {

}

class EProperties {

public MyHelperClass list(){ return null; }
	public MyHelperClass load(URL o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}
