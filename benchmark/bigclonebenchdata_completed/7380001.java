


class c7380001 {
public static MyHelperClass checkFile(String o0){ return null; }
public MyHelperClass Messages;
//	public MyHelperClass checkFile(String o0){ return null; }

    private static void generateFile(String inputFilename, String outputFilename) throws Exception {
        File inputFile = new File(inputFilename);
        if ((boolean)(Object)inputFile.exists() == false) {
            MyHelperClass Messages = new MyHelperClass();
            throw new Exception(Messages.getString("ScriptDocToBinary.Input_File_Does_Not_Exist") + inputFilename);
        }
        Environment environment = new Environment();
        environment.initBuiltInObjects();
        NativeObjectsReader reader = new NativeObjectsReader(environment);
        InputStream input =(InputStream)(Object) new FileInputStream(inputFile);
        MyHelperClass Messages = new MyHelperClass();
        System.out.println(Messages.getString("ScriptDocToBinary.Reading_Documentation") + inputFilename);
        reader.loadXML(input);
        checkFile(outputFilename);
        File binaryFile = new File(outputFilename);
        FileOutputStream outputStream = new FileOutputStream(binaryFile);
        TabledOutputStream output = new TabledOutputStream(outputStream);
        reader.getScriptDoc().write(output);
        output.close();
        System.out.println(Messages.getString("ScriptDocToBinary.Finished"));
        System.out.println();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass write(TabledOutputStream o0){ return null; }
	public MyHelperClass getString(String o0){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }}

class Environment {

public MyHelperClass initBuiltInObjects(){ return null; }}

class NativeObjectsReader {

NativeObjectsReader(Environment o0){}
	NativeObjectsReader(){}
	public MyHelperClass getScriptDoc(){ return null; }
	public MyHelperClass loadXML(InputStream o0){ return null; }}

class InputStream {

}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class TabledOutputStream {

TabledOutputStream(FileOutputStream o0){}
	TabledOutputStream(){}
	public MyHelperClass close(){ return null; }}
