


class c3694549 {
public MyHelperClass CtuluLibFile;
	public MyHelperClass fail(){ return null; }
	public MyHelperClass createTempDir(){ return null; }

    private File getTestFile() {
        MyHelperClass FICHIER_TEST_XML = new MyHelperClass();
        final URL url =(URL)(Object) TestCrueLOG.class.getResource((String)(Object)FICHIER_TEST_XML);
        final File ctfaFile = new File(createTempDir(), "resultat.rtfa.xml");
        try {
            CtuluLibFile.copyStream(url.openStream(), new FileOutputStream(ctfaFile), true, true);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
        return ctfaFile;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyStream(MyHelperClass o0, FileOutputStream o1, boolean o2, boolean o3){ return null; }}

class File {

File(){}
	File(MyHelperClass o0, String o1){}}

class URL {

public MyHelperClass openStream(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class TestCrueLOG {

}
