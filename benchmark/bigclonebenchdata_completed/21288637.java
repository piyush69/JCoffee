


class c21288637 {
public MyHelperClass assertEquals(String o0, int o1, MyHelperClass o2){ return null; }

//    @Test
    public void simpleRead() throws Exception {
        final InputStream istream =(InputStream)(Object) StatsInputStreamTest.class.getResourceAsStream("/testFile.txt");
        final StatsInputStream ris = new StatsInputStream(istream);
        assertEquals("read size", 0, ris.getSize());
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(ris, new NullOutputStream());
        assertEquals("in the end", 30, ris.getSize());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(StatsInputStream o0, NullOutputStream o1){ return null; }}

class InputStream {

}

class StatsInputStreamTest {

}

class StatsInputStream {

StatsInputStream(){}
	StatsInputStream(InputStream o0){}
	public MyHelperClass getSize(){ return null; }}

class NullOutputStream {

}
