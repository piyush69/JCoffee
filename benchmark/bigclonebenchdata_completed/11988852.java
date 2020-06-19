


class c11988852 {

    public static final void parse(String infile, String outfile) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(infile));
        DataOutputStream output = new DataOutputStream(new FileOutputStream(outfile));
        int w = Integer.parseInt((String)(Object)reader.readLine());
        int h = Integer.parseInt((String)(Object)reader.readLine());
        output.writeByte(w);
        output.writeByte(h);
        int lineCount = 2;
        try {
            do {
                for (int i = 0; i < h; i++) {
                    lineCount++;
                    String line =(String)(Object) reader.readLine();
                    if (line == null) {
                        throw new RuntimeException("Unexpected end of file at line " + lineCount);
                    }
                    for (int j = 0; j < w; j++) {
                        char c = line.charAt(j);
                        System.out.print(c);
                        output.writeByte(c);
                    }
                    System.out.println("");
                }
                lineCount++;
                output.writeShort(Short.parseShort((String)(Object)reader.readLine()));
            } while (reader.readLine() != null);
        } finally {
            reader.close();
            output.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedReader {

BufferedReader(FileReader o0){}
	BufferedReader(){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileReader {

FileReader(String o0){}
	FileReader(){}}

class DataOutputStream {

DataOutputStream(FileOutputStream o0){}
	DataOutputStream(){}
	public MyHelperClass writeByte(char o0){ return null; }
	public MyHelperClass writeShort(short o0){ return null; }
	public MyHelperClass writeByte(int o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}
