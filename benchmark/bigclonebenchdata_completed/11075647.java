
import java.io.UncheckedIOException;


class c11075647 {

//    @Test
    public void testWriteModel() {
        Model model = new Model();
        model.setName("MY_MODEL1");
        Stereotype st1 = new Stereotype();
        st1.setName("Pirulito1");
        PackageObject p1 = new PackageObject("p1");
        ClassType type1 = new ClassType("Class1");
        type1.setStereotype(st1);
        type1.addMethod(new Method("doSomething"));
        p1.add(type1);
        ClassType type2 = new ClassType("Class2");
        Method m2 = new Method("doSomethingElse");
        m2.setType(type1);
        type2.addMethod(m2);
        p1.add(type2);
        Generalization g = new Generalization();
        g.setSource(type1);
        g.setTarget(type1);
        p1.add(g);
        model.add(p1);
        ModelWriter writer = new ModelWriter();
        try {
            File modelFile = new File("target", "test.model");
            writer.write(model, modelFile);
            File xmlFile = new File("target", "test.xml");
            xmlFile.createNewFile();
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(new GZIPInputStream(new FileInputStream(modelFile)), new FileOutputStream(xmlFile));
        } catch (UncheckedIOException e) {
            MyHelperClass log = new MyHelperClass();
            log.error(e.getMessage(),(IOException)(Object) e);
            MyHelperClass Assert = new MyHelperClass();
            Assert.fail(e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(GZIPInputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass fail(String o0){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }}

class Test {

}

class Model {

public MyHelperClass add(PackageObject o0){ return null; }
	public MyHelperClass setName(String o0){ return null; }}

class Stereotype {

public MyHelperClass setName(String o0){ return null; }}

class PackageObject {

PackageObject(String o0){}
	PackageObject(){}
	public MyHelperClass add(ClassType o0){ return null; }
	public MyHelperClass add(Generalization o0){ return null; }}

class ClassType {

ClassType(String o0){}
	ClassType(){}
	public MyHelperClass setStereotype(Stereotype o0){ return null; }
	public MyHelperClass addMethod(Method o0){ return null; }}

class Method {

Method(String o0){}
	Method(){}
	public MyHelperClass setType(ClassType o0){ return null; }}

class Generalization {

public MyHelperClass setSource(ClassType o0){ return null; }
	public MyHelperClass setTarget(ClassType o0){ return null; }}

class ModelWriter {

public MyHelperClass write(Model o0, File o1){ return null; }}

class File {

File(){}
	File(String o0, String o1){}
	public MyHelperClass createNewFile(){ return null; }}

class GZIPInputStream {

GZIPInputStream(){}
	GZIPInputStream(FileInputStream o0){}}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
