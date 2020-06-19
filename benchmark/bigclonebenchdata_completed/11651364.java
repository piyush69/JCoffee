


class c11651364 {
public MyHelperClass Logger;
	public MyHelperClass CtuluLibFile;
	public MyHelperClass Level;
	public MyHelperClass createTempDir(){ return null; }
	public MyHelperClass fail(String o0){ return null; }

    private File extractSiteFile() {
        MyHelperClass CONFIG_SITE = new MyHelperClass();
        final URL url =(URL)(Object) TestCrueCONF.class.getResource((String)(Object)CONFIG_SITE);
        final File confFile = new File(createTempDir(), "FudaaCrue_Site.xml");
        try {
            CtuluLibFile.copyStream(url.openStream(), new FileOutputStream(confFile), true, true);
        } catch (Exception e) {
            Logger.getLogger(TestCrueCONF.class.getName()).log(Level.SEVERE, "erreur while extracting FudaaCrue_Site.xml", e);
            fail(e.getMessage());
        }
        return confFile;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass log(MyHelperClass o0, String o1, Exception o2){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }
	public MyHelperClass copyStream(MyHelperClass o0, FileOutputStream o1, boolean o2, boolean o3){ return null; }}

class File {

File(){}
	File(MyHelperClass o0, String o1){}}

class URL {

public MyHelperClass openStream(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class TestCrueCONF {

}
