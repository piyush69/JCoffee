import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14819747 {

    public static void main(final String args[])  throws Throwable {
        if (args.length < 2 || (args.length == 3 && !"-d".equals(args[0]))) {
            System.out.println("Usage: AdapterGenerator [Options] <PrologFile> <ClassPath>");
            System.out.println("       where the framework is the first element in the class path");
            System.out.println("Options: -d Enables the generation of debug output");
            return;
        }
        boolean debug = args.length == 3;
        File prologFile = new File(debug ? args[1] : args[0]);
        if (!prologFile.isFile()) {
            System.out.println("The given file does not exist.");
            return;
        }
        File targetFile = new File(prologFile.getParentFile(), prologFile.getName().substring(0, prologFile.getName().lastIndexOf(".")) + ".jar");
        String source;
        try {
            MyHelperClass FileUtils = new MyHelperClass();
            source = FileUtils.readFileToString(prologFile);
        } catch (IOException ex) {
            System.out.println("Error reading file: " + ex.getMessage());
            return;
        }
        Parser myParser =(Parser)(Object) new PrologParserImpl();
        PrologProgram myProgram;
        try {
            myProgram = (PrologProgram) myParser.parse(source);
        } catch (Exception ex) {
            System.out.println("Could not parse file: " + ex.getMessage());
            return;
        }
        try {
            FactVisitor myVisitor = new FactVisitor();
            myVisitor.visit(myProgram);
            Map<String, TypeGenerationInfo> adapterLayer = myVisitor.getAdapterLayer();
            if (adapterLayer.size() == 0) {
                System.out.println("No adapters to generate, " + "did you forget to run the comeback rules?");
                return;
            }
            URLClassLoader classLoader = createClassLoaderFromClassPath(debug ? args[2] : args[1]);
            ClassWriter adapterWriter = new ClassWriter(new JarEntryWriter(targetFile));
            AdapterAnnotationGenerator annotationGenerator = new AdapterAnnotationGenerator();
            MyHelperClass Type = new MyHelperClass();
            Type annotationType = Type.getObjectType("net/sourceforge/comeback/Adapter");
            adapterWriter.writeClass(annotationType.getClassName(), annotationGenerator.createAnnotation(annotationType));
//            MyHelperClass Type = new MyHelperClass();
            AdapterLookupGenerator lookupWriter = new AdapterLookupGenerator(Type.getObjectType("net/sourceforge/comeback/Adapters"), annotationType);
            GenerationContext context = new GenerationContext(adapterLayer, classLoader, annotationType, lookupWriter, adapterWriter);
            context.setGenerateDebugOutput(debug);
            Iterator<TypeGenerationInfo> iterator = adapterLayer.values().iterator();
            while (iterator.hasNext()) {
                TypeGenerationInfo info = iterator.next();
                context.generateAdapter(info);
            }
            ByteArrayOutputStream serialized = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(serialized);
            out.writeObject(adapterLayer);
            out.close();
            adapterWriter.writeResource("net/sourceforge/comeback/adapterlayer.ser", serialized.toByteArray());
            String[] sharedClassesPrefixes = new String[2];
            Assembler assembler = new Assembler(adapterWriter);
            PatternClassFilter filter = new PatternClassFilter();
            URL url = Main.class.getResource("/" + Main.class.getName().replace('.', '/') + ".class");
            JarURLConnection connection = (JarURLConnection) url.openConnection();
            sharedClassesPrefixes[0] = assembler.assemble(connection.getJarFile(), filter);
            filter = new PatternClassFilter();
            url = Type.class.getResource("/" + Type.class.getName().replace('.', '/') + ".class");
            connection = (JarURLConnection) url.openConnection();
            sharedClassesPrefixes[1] = assembler.assemble(connection.getJarFile(), filter);
            String tmp = debug ? args[2] : args[1];
            adapterWriter.writeClass(lookupWriter.getType().getClassName(), lookupWriter.createAdapterLookup(adapterLayer.values(), tmp.substring(tmp.lastIndexOf(File.pathSeparator) + 1), sharedClassesPrefixes));
            adapterWriter.close();
        } catch (Throwable e) {
            e.printStackTrace();
            return;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getObjectType(String o0){ return null; }
	public MyHelperClass readFileToString(File o0){ return null; }}

class Parser {

public MyHelperClass parse(String o0){ return null; }}

class PrologParserImpl {

}

class PrologProgram {

}

class FactVisitor {

public MyHelperClass visit(PrologProgram o0){ return null; }
	public MyHelperClass getAdapterLayer(){ return null; }}

class TypeGenerationInfo {

}

class ClassWriter {

public MyHelperClass writeResource(String o0, byte[] o1){ return null; }
	public MyHelperClass close(){ return null; }}

class JarEntryWriter {

JarEntryWriter(){}
	JarEntryWriter(File o0){}}

class AdapterAnnotationGenerator {

public MyHelperClass createAnnotation(Type o0){ return null; }}

class Type {

public MyHelperClass getClassName(){ return null; }}

class AdapterLookupGenerator {

public MyHelperClass getType(){ return null; }
	public MyHelperClass createAdapterLookup(Collection<TypeGenerationInfo o0, String o1, String[] o2){ return null; }}

class GenerationContext {

GenerationContext(Map<String,TypeGenerationInfo> o0, URLClassLoader o1, Type o2, AdapterLookupGenerator o3, ClassWriter o4){}
	GenerationContext(){}
	public MyHelperClass setGenerateDebugOutput(boolean o0){ return null; }
	public MyHelperClass generateAdapter(TypeGenerationInfo o0){ return null; }}

class Assembler {

Assembler(){}
	Assembler(ClassWriter o0){}
	public MyHelperClass assemble(JarFile o0, PatternClassFilter o1){ return null; }}

class PatternClassFilter {

}

class Main {

}
