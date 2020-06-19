


class c21361961 {
public MyHelperClass createFileReader(MyHelperClass o0){ return null; }
	public MyHelperClass createFileWriter(MyHelperClass o0){ return null; }
public MyHelperClass cleanupWriter(Writer o0){ return null; }
	public MyHelperClass cleanupReader(Reader o0){ return null; }
public MyHelperClass Srx1Transformer;
	public MyHelperClass createStandardOutputWriter(){ return null; }
	public MyHelperClass createStandardInputReader(){ return null; }

    private void transform(CommandLine commandLine) throws IOException {
        Reader reader;
        if ((boolean)(Object)commandLine.hasOption('i')) {
            reader =(Reader)(Object) createFileReader(commandLine.getOptionValue('i'));
        } else {
            reader =(Reader)(Object) createStandardInputReader();
        }
        Writer writer;
        if ((boolean)(Object)commandLine.hasOption('o')) {
            writer =(Writer)(Object) createFileWriter(commandLine.getOptionValue('o'));
        } else {
            writer =(Writer)(Object) createStandardOutputWriter();
        }
        String mapRule =(String)(Object) commandLine.getOptionValue("m");
        try {
            SrxTransformer transformer =(SrxTransformer)(Object) new SrxAnyTransformer();
            Map parameterMap =(Map)(Object) new HashMap();
            if (mapRule != null) {
                parameterMap.put(Srx1Transformer.MAP_RULE_NAME, mapRule);
            }
            transformer.transform(reader, writer, parameterMap);
        } finally {
            cleanupReader(reader);
            cleanupWriter(writer);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass MAP_RULE_NAME;
}

class CommandLine {

public MyHelperClass getOptionValue(char o0){ return null; }
	public MyHelperClass getOptionValue(String o0){ return null; }
	public MyHelperClass hasOption(char o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Reader {

}

class Writer {

}

class SrxTransformer {

public MyHelperClass transform(Reader o0, Writer o1, Map o2){ return null; }}

class SrxAnyTransformer {

}

class Map {

public MyHelperClass put(MyHelperClass o0, String o1){ return null; }}

class HashMap {

}
