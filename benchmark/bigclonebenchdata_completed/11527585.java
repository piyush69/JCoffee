


class c11527585 {
public MyHelperClass assertMessagesOds(ODSTableImporter o0){ return null; }

//    @Test
    public final void testImportODScontentXml() throws Exception {
        URL url =(URL)(Object) ODSTableImporterTest.class.getResource("/Messages.ods_FILES/content.xml");
        String systemId =(String)(Object) url.getPath();
        InputStream in =(InputStream)(Object) url.openStream();
        ODSTableImporter b = new ODSTableImporter();
        b.importODSContentXml(systemId, in, null);
        assertMessagesOds(b);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Test {

}

class URL {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass getPath(){ return null; }}

class ODSTableImporterTest {

}

class InputStream {

}

class ODSTableImporter {

public MyHelperClass importODSContentXml(String o0, InputStream o1, Object o2){ return null; }}
