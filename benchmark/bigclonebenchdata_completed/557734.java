
import java.io.UncheckedIOException;


class c557734 {
public MyHelperClass[] readArray;
	public MyHelperClass[] writeArray;
//public MyHelperClass readArray;
	public MyHelperClass writeFileCount;
//	public MyHelperClass writeArray;
	public MyHelperClass AssocView;
	public MyHelperClass isPrincipleClass(String o0){ return null; }

    public void constructAssociationView() {
        String className;
        String methodName;
        String field;
        boolean foundRead = false;
        boolean foundWrite = false;
        boolean classWritten = false;
        try {
            BufferedWriter AssocView;// = new BufferedWriter();
            AssocView = new BufferedWriter(new FileWriter("InfoFiles/AssociationView.txt"));
            FileInputStream fstreamPC = new FileInputStream("InfoFiles/PrincipleClassGroup.txt");
            DataInputStream inPC = new DataInputStream(fstreamPC);
            BufferedReader PC = new BufferedReader(new InputStreamReader(inPC));
            while ((field =(String)(Object) PC.readLine()) != null) {
                className = field;
//                MyHelperClass AssocView = new MyHelperClass();
                AssocView.write(className);
//                MyHelperClass AssocView = new MyHelperClass();
                AssocView.newLine();
                classWritten = true;
                while ((methodName =(String)(Object) PC.readLine()) != null) {
                    if (methodName.contentEquals("EndOfClass")) break;
//                    MyHelperClass AssocView = new MyHelperClass();
                    AssocView.write("StartOfMethod");
//                    MyHelperClass AssocView = new MyHelperClass();
                    AssocView.newLine();
//                    MyHelperClass AssocView = new MyHelperClass();
                    AssocView.write(methodName);
//                    MyHelperClass AssocView = new MyHelperClass();
                    AssocView.newLine();
                    MyHelperClass readFileCount = new MyHelperClass();
                    for (int i = 0; i < (int)(Object)readFileCount && foundRead == false; i++) {
MyHelperClass[] readArray = new MyHelperClass[5];
                        if (methodName.compareTo((String)(Object)readArray[i]) == 0) {
                            foundRead = true;
//                            MyHelperClass readArray = new MyHelperClass();
                            for (int j = 1;(int)(Object) readArray[i + j].compareTo("EndOfMethod") != 0; j++) {
//                                MyHelperClass readArray = new MyHelperClass();
                                if ((int)(Object)readArray[i + j].indexOf(".") > 0) {
//                                    MyHelperClass readArray = new MyHelperClass();
                                    field =(String)(Object) readArray[i + j].substring(0, readArray[i + j].indexOf("."));
                                    if ((boolean)(Object)isPrincipleClass(field) == true) {
                                        AssocView.write((String)(Object)readArray[i + j]);
                                        AssocView.newLine();
                                    }
                                }
                            }
                        }
                    }
                    for (int i = 0; i < (int)(Object)writeFileCount && foundWrite == false; i++) {
                        if (methodName.compareTo((String)(Object)writeArray[i]) == 0) {
                            foundWrite = true;
                            for (int j = 1;(int)(Object) writeArray[i + j].compareTo("EndOfMethod") != 0; j++) {
                                if ((int)(Object)writeArray[i + j].indexOf(".") > 0) {
                                    field =(String)(Object) writeArray[i + j].substring(0, writeArray[i + j].indexOf("."));
                                    if ((boolean)(Object)isPrincipleClass(field) == true) {
                                        AssocView.write((String)(Object)writeArray[i + j]);
                                        AssocView.newLine();
                                    }
                                }
                            }
                        }
                    }
                    AssocView.write("EndOfMethod");
                    AssocView.newLine();
                    foundRead = false;
                    foundWrite = false;
                }
                if (classWritten == true) {
                    AssocView.write("EndOfClass");
                    AssocView.newLine();
                    classWritten = false;
                }
            }
            PC.close();
            AssocView.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass write(String o0){ return null; }
	public MyHelperClass compareTo(String o0){ return null; }
	public MyHelperClass indexOf(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass newLine(){ return null; }
	public MyHelperClass substring(int o0, MyHelperClass o1){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class DataInputStream {

DataInputStream(){}
	DataInputStream(FileInputStream o0){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(DataInputStream o0){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedWriter {

BufferedWriter(FileWriter o0){}
	BufferedWriter(){}
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass newLine(){ return null; }}

class FileWriter {

FileWriter(String o0){}
	FileWriter(){}}
