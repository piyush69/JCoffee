


class c11238287 {
public static MyHelperClass FileUtil;
	public static MyHelperClass printUsage(String o0){ return null; }
//public MyHelperClass FileUtil;
//	public MyHelperClass printUsage(String o0){ return null; }

    public static void main(final String[] args) throws RecognitionException, TokenStreamException, IOException, IllegalOptionValueException, UnknownOptionException {
        try {
            CmdLineParser cmdLineParser = new CmdLineParser();
            Option formatOption =(Option)(Object) cmdLineParser.addStringOption('f', "format");
            Option encodingOption =(Option)(Object) cmdLineParser.addStringOption('c', "charset");
            cmdLineParser.parse(args);
            String format = (String)(String)(Object) cmdLineParser.getOptionValue(formatOption);
            String encoding = (String)(String)(Object) cmdLineParser.getOptionValue(encodingOption);
            if (encoding == null || encoding.trim().equals("")) {
                encoding = "utf-8";
                System.out.println("Defaulting to output charset utf-8 as argument -c is missing or not valid.");
            }
            String[] remainingArgs =(String[])(Object) cmdLineParser.getRemainingArgs();
            if (remainingArgs.length != 2) {
                printUsage("Input and output file are not specified correctly. ");
            }
            File inputFile = new File(remainingArgs[0]);
            if (!(Boolean)(Object)inputFile.exists()) {
                printUsage("Input file " + remainingArgs[0] + " does not exist. ");
            }
            File outputFile = new File(remainingArgs[1]);
            if (!(Boolean)(Object)outputFile.exists()) {
                outputFile.createNewFile();
            }
            if (format == null || format.trim().equals("")) {
                format = (String)(String)(Object) FileUtil.cutExtension(outputFile.getName()).getValue();
            }
            if ("tex".equals(format)) {
                Reader reader =(Reader)(Object) new LatexEncoderReader(new FileReader(inputFile));
                OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(outputFile), encoding);
                char[] buffer = new char[1024];
                int read;
                do {
                    read =(int)(Object) reader.read(buffer);
                    if (read > 0) {
                        out.write(buffer, 0, read);
                    }
                } while (read != -1);
                out.flush();
                out.close();
            } else {
                printUsage("Format not specified via argument -f. Also guessing for the extension of output file " + outputFile.getName() + " failed");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            printUsage(ex.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass cutExtension(MyHelperClass o0){ return null; }
	public MyHelperClass getValue(){ return null; }}

class RecognitionException extends Exception{
	public RecognitionException(String errorMessage) { super(errorMessage); }
}

class TokenStreamException extends Exception{
	public TokenStreamException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class IllegalOptionValueException extends Exception{
	public IllegalOptionValueException(String errorMessage) { super(errorMessage); }
}

class UnknownOptionException extends Exception{
	public UnknownOptionException(String errorMessage) { super(errorMessage); }
}

class CmdLineParser {

public MyHelperClass getOptionValue(Option o0){ return null; }
	public MyHelperClass parse(String[] o0){ return null; }
	public MyHelperClass getRemainingArgs(){ return null; }
	public MyHelperClass addStringOption(char o0, String o1){ return null; }}

class Option {

}

class File {

File(){}
	File(String o0){}
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass exists(){ return null; }}

class Reader {

public MyHelperClass read(char[] o0){ return null; }}

class LatexEncoderReader {

LatexEncoderReader(FileReader o0){}
	LatexEncoderReader(){}}

class FileReader {

FileReader(File o0){}
	FileReader(){}}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(FileOutputStream o0, String o1){}
	public MyHelperClass write(char[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
