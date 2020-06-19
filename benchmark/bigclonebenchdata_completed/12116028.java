


class c12116028 {

    public static void main(String[] args) throws Exception {
        File inputFile = new File(args[0]);
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        StringBuffer stringBuffer = new StringBuffer();
        String readed;
        while ((readed =(String)(Object) reader.readLine()) != null) stringBuffer.append(readed + "\r\n");
        readed = stringBuffer.toString();
        reader.close();
        File outputFile = new File(args[0] + ".output");
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
        readed = readed.replaceAll("\\t+", "#");
        readed = readed.replaceAll("\\s*#\\s*", "#");
        readed = readed.replaceAll("Latitude,.*", "");
        readed = readed.replaceAll("Flag of", "");
        readed = readed.replaceAll("^\\s+$", "");
        writer.write(readed);
        writer.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(String o0){}
	File(){}}

class BufferedReader {

BufferedReader(FileReader o0){}
	BufferedReader(){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileReader {

FileReader(File o0){}
	FileReader(){}}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(FileWriter o0){}
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}}
