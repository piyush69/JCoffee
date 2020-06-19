
import java.io.UncheckedIOException;


class c557732 {

    public void constructFundamentalView() {
        String className;
        String methodName;
        String field;
        boolean foundRead = false;
        boolean foundWrite = false;
        boolean classWritten = false;
        try {
            BufferedWriter FundView;// = new BufferedWriter();
            FundView = new BufferedWriter(new FileWriter("InfoFiles/FundamentalView.txt"));
            FileInputStream fstreamPC = new FileInputStream("InfoFiles/PrincipleClassGroup.txt");
            DataInputStream inPC = new DataInputStream(fstreamPC);
            BufferedReader PC = new BufferedReader(new InputStreamReader(inPC));
            while ((field =(String)(Object) PC.readLine()) != null) {
                className = field;
//                MyHelperClass FundView = new MyHelperClass();
                FundView.write(className);
//                MyHelperClass FundView = new MyHelperClass();
                FundView.newLine();
                classWritten = true;
                while ((methodName =(String)(Object) PC.readLine()) != null) {
                    if (methodName.contentEquals("EndOfClass")) break;
//                    MyHelperClass FundView = new MyHelperClass();
                    FundView.write("StartOfMethod");
//                    MyHelperClass FundView = new MyHelperClass();
                    FundView.newLine();
//                    MyHelperClass FundView = new MyHelperClass();
                    FundView.write(methodName);
//                    MyHelperClass FundView = new MyHelperClass();
                    FundView.newLine();
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
                                    if (field.compareTo(className) == 0) {
//                                        MyHelperClass readArray = new MyHelperClass();
                                        FundView.write((String)(Object)readArray[i + j]);
//                                        MyHelperClass FundView = new MyHelperClass();
                                        FundView.newLine();
                                    }
                                }
                            }
                        }
                    }
                    MyHelperClass writeFileCount = new MyHelperClass();
                    for (int i = 0; i < (int)(Object)writeFileCount && foundWrite == false; i++) {
MyHelperClass[] writeArray = new MyHelperClass[5];
                        if (methodName.compareTo((String)(Object)writeArray[i]) == 0) {
                            foundWrite = true;
//                            MyHelperClass writeArray = new MyHelperClass();
                            for (int j = 1;(int)(Object) writeArray[i + j].compareTo("EndOfMethod") != 0; j++) {
//                                MyHelperClass writeArray = new MyHelperClass();
                                if ((int)(Object)writeArray[i + j].indexOf(".") > 0) {
//                                    MyHelperClass writeArray = new MyHelperClass();
                                    field =(String)(Object) writeArray[i + j].substring(0, writeArray[i + j].indexOf("."));
                                    if (field.compareTo(className) == 0) {
//                                        MyHelperClass writeArray = new MyHelperClass();
                                        FundView.write((String)(Object)writeArray[i + j]);
//                                        MyHelperClass FundView = new MyHelperClass();
                                        FundView.newLine();
                                    }
                                }
                            }
                        }
                    }
//                    MyHelperClass FundView = new MyHelperClass();
                    FundView.write("EndOfMethod");
//                    MyHelperClass FundView = new MyHelperClass();
                    FundView.newLine();
                    foundRead = false;
                    foundWrite = false;
                }
                if (classWritten == true) {
//                    MyHelperClass FundView = new MyHelperClass();
                    FundView.write("EndOfClass");
//                    MyHelperClass FundView = new MyHelperClass();
                    FundView.newLine();
                    classWritten = false;
                }
            }
            PC.close();
//            MyHelperClass FundView = new MyHelperClass();
            FundView.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass[] readArray;
	public MyHelperClass[] writeArray;
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
