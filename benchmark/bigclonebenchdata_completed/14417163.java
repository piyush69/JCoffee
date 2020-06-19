


class c14417163 {
public MyHelperClass assertTrue(boolean o0){ return null; }

//    @Test
    public void testWrite() throws Exception {
        MrstkXmlFileReader reader = new MrstkXmlFileReader();
        reader.setFileName("..//data//MrstkXML//prototype3.xml");
        reader.read();
        SpectrumArray sp =(SpectrumArray)(Object) reader.getOutput();
        MyHelperClass File = new MyHelperClass();
        File tmp =(File)(Object) File.createTempFile("mrstktest", ".xml");
        System.out.println("Writing temp file: " + tmp.getAbsolutePath());
        MrstkXmlFileWriter writer = new MrstkXmlFileWriter(sp);
        writer.setFile(tmp);
        writer.write();
        MrstkXmlFileReader reader2 = new MrstkXmlFileReader();
        reader2.setFileName((String)(Object)writer.getFile().getAbsolutePath());
        reader2.read();
        SpectrumArray sp2 =(SpectrumArray)(Object) reader2.getOutput();
        assertTrue(sp.equals(sp2));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }}

class Test {

}

class MrstkXmlFileReader {

public MyHelperClass setFileName(String o0){ return null; }
	public MyHelperClass getOutput(){ return null; }
	public MyHelperClass read(){ return null; }}

class SpectrumArray {

}

class File {

public MyHelperClass getAbsolutePath(){ return null; }}

class MrstkXmlFileWriter {

MrstkXmlFileWriter(){}
	MrstkXmlFileWriter(SpectrumArray o0){}
	public MyHelperClass setFile(File o0){ return null; }
	public MyHelperClass write(){ return null; }
	public MyHelperClass getFile(){ return null; }}
