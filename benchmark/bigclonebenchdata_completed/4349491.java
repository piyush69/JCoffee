


class c4349491 {
public MyHelperClass Content;
	public MyHelperClass AllJavaSEServiceTestsuite;
	public MyHelperClass assertTrue(String o0, boolean o1){ return null; }

    public void migrateTo(String newExt) throws IOException {
        DigitalObject input =(DigitalObject)(Object) (new Builder(Content.byReference(new File(AllJavaSEServiceTestsuite.TEST_FILE_LOCATION + "PlanetsLogo.png").toURI().toURL())).build());
        System.out.println("Input: " + input);
        MyHelperClass FormatRegistryFactory = new MyHelperClass();
        FormatRegistry format =(FormatRegistry)(Object) FormatRegistryFactory.getFormatRegistry();
        MyHelperClass dom = new MyHelperClass();
        MigrateResult mr =(MigrateResult)(Object) dom.migrate(input, format.createExtensionUri("png"), format.createExtensionUri(newExt), null);
        ServiceReport sr =(ServiceReport)(Object) mr.getReport();
        System.out.println("Got Report: " + sr);
        DigitalObject doOut =(DigitalObject)(Object) mr.getDigitalObject();
        assertTrue("Resulting digital object is null.", doOut != null);
        System.out.println("Output: " + doOut);
        System.out.println("Output.content: " + doOut.getContent());
        File out = new File("services/java-se/test/results/test." + newExt);
        FileOutputStream fo = new FileOutputStream(out);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copyLarge(doOut.getContent().getInputStream(), fo);
        fo.close();
        System.out.println("Recieved service report: " + mr.getReport());
        System.out.println("Recieved service properties: ");
        MyHelperClass ServiceProperties = new MyHelperClass();
        ServiceProperties.printProperties((PrintStream)(Object)System.out, mr.getReport().getProperties());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TEST_FILE_LOCATION;
public MyHelperClass printProperties(PrintStream o0, MyHelperClass o1){ return null; }
	public MyHelperClass toURL(){ return null; }
	public MyHelperClass getFormatRegistry(){ return null; }
	public MyHelperClass copyLarge(MyHelperClass o0, FileOutputStream o1){ return null; }
	public MyHelperClass getProperties(){ return null; }
	public MyHelperClass byReference(MyHelperClass o0){ return null; }
	public MyHelperClass migrate(DigitalObject o0, MyHelperClass o1, MyHelperClass o2, Object o3){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class DigitalObject {

public MyHelperClass getContent(){ return null; }}

class FormatRegistry {

public MyHelperClass createExtensionUri(String o0){ return null; }}

class MigrateResult {

public MyHelperClass getDigitalObject(){ return null; }
	public MyHelperClass getReport(){ return null; }}

class ServiceReport {

}

class File {

File(String o0){}
	File(){}
	public MyHelperClass toURI(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass close(){ return null; }}

class Builder {

Builder(){}
	Builder(MyHelperClass o0){}
	public MyHelperClass build(){ return null; }}

class PrintStream {

}
