


class c4938184 {
public MyHelperClass assertFalse(MyHelperClass o0){ return null; }
	public MyHelperClass assertTrue(MyHelperClass o0){ return null; }
	public MyHelperClass assertEquals(int o0, MyHelperClass o1){ return null; }

    public void testParts() throws Exception {
        URL url =(URL)(Object) getClass().getClassLoader().getResource("de/schlund/pfixxml/parts.xml");
        InputSource source = new InputSource(url.openStream());
        source.setSystemId(url.toString());
        MyHelperClass IncludePartsInfoParser = new MyHelperClass();
        IncludePartsInfo info =(IncludePartsInfo)(Object) IncludePartsInfoParser.parse(source);
        Map parts =(Map)(Object) info.getParts();
        assertEquals(3, parts.size());
        assertTrue(parts.containsKey("aaa"));
        assertTrue(parts.containsKey("bbb"));
        assertFalse(parts.containsKey("ccc"));
        assertTrue(parts.containsKey("ddd"));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass parse(InputSource o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputSource {

InputSource(MyHelperClass o0){}
	InputSource(){}
	public MyHelperClass setSystemId(String o0){ return null; }}

class IncludePartsInfo {

public MyHelperClass getParts(){ return null; }}

class Map {

public MyHelperClass size(){ return null; }
	public MyHelperClass containsKey(String o0){ return null; }}

class IncludePartInfo {

}
