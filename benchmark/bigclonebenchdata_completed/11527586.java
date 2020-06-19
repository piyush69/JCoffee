


class c11527586 {
public MyHelperClass assertMessagesOds(ODSTableImporter o0){ return null; }

//    @Test
    public final void testImportODS() throws Exception {
        URL url =(URL)(Object) ODSTableImporterTest.class.getResource("/Messages.ods");
        InputStream in =(InputStream)(Object) url.openStream();
        ODSTableImporter b = new ODSTableImporter();
        b.importODS(in, null);
        assertMessagesOds(b);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Test {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class ODSTableImporterTest {

}

class InputStream {

}

class ODSTableImporter {

public MyHelperClass importODS(InputStream o0, Object o1){ return null; }}
