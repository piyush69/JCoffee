


class c21337941 {
public static MyHelperClass closeQuietly(BufferedReader o0){ return null; }
	public static MyHelperClass closeQuietly(Writer o0){ return null; }
	public static MyHelperClass atoi(String o0){ return null; }
	public static MyHelperClass doPredict(BufferedReader o0, Writer o1, Model o2){ return null; }
public static MyHelperClass Linear;
//	public MyHelperClass closeQuietly(BufferedReader o0){ return null; }
//	public MyHelperClass closeQuietly(Writer o0){ return null; }
//	public MyHelperClass atoi(String o0){ return null; }
//	public MyHelperClass doPredict(BufferedReader o0, Writer o1, Model o2){ return null; }
	public static MyHelperClass exit_with_help(){ return null; }
//public MyHelperClass Linear;
//	public MyHelperClass exit_with_help(){ return null; }

    public static void main(String[] argv) throws IOException {
        int i;
        for (i = 0; i < argv.length; i++) {
            if (argv[i].charAt(0) != '-') break;
            ++i;
            switch(argv[i - 1].charAt(1)) {
                case 'b':
                    try {
                        boolean flag_predict_probability;// = new boolean();
                        flag_predict_probability = ((int)(Object)atoi(argv[i]) != 0);
                    } catch (NumberFormatException e) {
                        exit_with_help();
                    }
                    break;
                default:
                    System.err.printf("unknown option: -%d%n", argv[i - 1].charAt(1));
                    exit_with_help();
                    break;
            }
        }
        if (i >= argv.length || argv.length <= i + 2) {
            exit_with_help();
        }
        BufferedReader reader = null;
        Writer writer = null;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(argv[i]), Linear.FILE_CHARSET));
            writer =(Writer)(Object) new BufferedWriter(new OutputStreamWriter(new FileOutputStream(argv[i + 2]), Linear.FILE_CHARSET));
            Model model =(Model)(Object) Linear.loadModel(new File(argv[i + 1]));
            doPredict(reader, writer, model);
        } finally {
            closeQuietly(reader);
            closeQuietly(writer);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FILE_CHARSET;
public MyHelperClass loadModel(File o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}}

class Writer {

}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(FileInputStream o0, MyHelperClass o1){}}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(OutputStreamWriter o0){}}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(FileOutputStream o0, MyHelperClass o1){}}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class Model {

}

class File {

File(String o0){}
	File(){}}
