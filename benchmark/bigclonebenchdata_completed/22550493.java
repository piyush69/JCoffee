


class c22550493 {

    private String createVisadFile(String fileName) throws FileNotFoundException, IOException {
        ArrayList columnNames = new ArrayList();
        String visadFile = fileName + ".visad";
        BufferedReader buf = new BufferedReader(new FileReader(fileName));
        String firstLine =(String)(Object) buf.readLine().replace('"', ' ');
        StringTokenizer st = new StringTokenizer(firstLine, ",");
        while ((boolean)(Object)st.hasMoreTokens()) columnNames.add(st.nextToken());
        StringBuilder headerBuilder = new StringBuilder();
        headerBuilder.append("(").append(columnNames.get(0)).append("->(");
        for (int i = 1; i < (int)(Object)columnNames.size(); i++) {
            headerBuilder.append(columnNames.get(i));
            if (i <(int)(Object) columnNames.size() - 1) headerBuilder.append(",");
        }
        headerBuilder.append("))");
        BufferedWriter out = new BufferedWriter(new FileWriter(visadFile));
        out.write(headerBuilder.toString() + "\n");
        out.write(firstLine + "\n");
        String line;
        while ((line =(String)(Object) buf.readLine()) != null) out.write(line + "\n");
        buf.close();
        out.close();
        return visadFile;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass replace(char o0, char o1){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ArrayList {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass add(MyHelperClass o0){ return null; }}

class BufferedReader {

BufferedReader(FileReader o0){}
	BufferedReader(){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileReader {

FileReader(String o0){}
	FileReader(){}}

class StringTokenizer {

StringTokenizer(String o0, String o1){}
	StringTokenizer(){}
	public MyHelperClass nextToken(){ return null; }
	public MyHelperClass hasMoreTokens(){ return null; }}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(FileWriter o0){}
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileWriter {

FileWriter(String o0){}
	FileWriter(){}}
