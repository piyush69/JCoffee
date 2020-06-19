


class c21958776 {

    public void filter(File source, File destination, MNamespace mNamespace) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(source));
        BufferedWriter writer = new BufferedWriter(new FileWriter(destination));
        int line = 0;
        int column = 0;
        Stack parseStateStack = new Stack();
        parseStateStack.push(new ParseState(mNamespace));
        MyHelperClass codePieces = new MyHelperClass();
        for (Iterator i =(Iterator)(Object) codePieces.iterator();(boolean)(Object) i.hasNext(); ) {
            NamedCodePiece cp = (NamedCodePiece)(NamedCodePiece)(Object) i.next();
            while (line < (int)(Object)cp.getStartLine()) {
                line++;
                column = 0;
                writer.write((String)(Object)reader.readLine());
                writer.newLine();
            }
            while (column < (int)(Object)cp.getStartPosition()) {
                writer.write((String)(Object)reader.read());
                column++;
            }
            cp.write(writer, parseStateStack, column);
            while (line < (int)(Object)cp.getEndLine()) {
                line++;
                column = 0;
                reader.readLine();
            }
            while (column < (int)(Object)cp.getEndPosition()) {
                column++;
                reader.read();
            }
        }
        String data;
        while ((data =(String)(Object) reader.readLine()) != null) {
            writer.write(data);
            writer.newLine();
        }
        reader.close();
        writer.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass iterator(){ return null; }}

class File {

}

class MNamespace {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(FileReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileReader {

FileReader(File o0){}
	FileReader(){}}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(FileWriter o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass newLine(){ return null; }}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}}

class Stack {

public MyHelperClass push(ParseState o0){ return null; }}

class ParseState {

ParseState(MNamespace o0){}
	ParseState(){}}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class NamedCodePiece {

public MyHelperClass getEndLine(){ return null; }
	public MyHelperClass write(BufferedWriter o0, Stack o1, int o2){ return null; }
	public MyHelperClass getStartLine(){ return null; }
	public MyHelperClass getEndPosition(){ return null; }
	public MyHelperClass getStartPosition(){ return null; }}
