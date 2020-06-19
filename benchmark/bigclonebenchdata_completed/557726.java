import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c557726 {
public MyHelperClass[] principleMethod;
	public MyHelperClass[] principleMethodsClass;
	public MyHelperClass[] principleClass;
	public MyHelperClass NULL;
public int principleMethodCount;
	public int principleClassCount;
public MyHelperClass readFileCount;
//	public MyHelperClass principleClassCount;
	public MyHelperClass methodCallFileCount;
	public MyHelperClass PrincipleClassGroup;
	public MyHelperClass writeArray;
	public MyHelperClass writeFileCount;
	public MyHelperClass readArray;
	public MyHelperClass callArray;
//	public MyHelperClass principleMethodsClass;
//	public MyHelperClass principleClass;
//	public MyHelperClass principleMethod;
//	public MyHelperClass principleMethodCount;
	public MyHelperClass constructInteractionView(){ return null; }
	public MyHelperClass infoArraySize(){ return null; }
	public MyHelperClass methodCallFileCount(){ return null; }
	public MyHelperClass constructFundamentalView(){ return null; }
	public MyHelperClass writeFileCount(){ return null; }
	public MyHelperClass readFileCount(){ return null; }
	public MyHelperClass constructAssociationView(){ return null; }
	public MyHelperClass initializeArrays(){ return null; }

    public void extractPrincipalClasses(String[] info, int numFiles)  throws Throwable {
        String methodName = "";
        String finalClass = "";
        String WA;
        String MC;
        String RA;
        int[] readCount = new int[numFiles];
        int[] writeCount = new int[numFiles];
        int[] methodCallCount = new int[numFiles];
        int writeMax1;
        int writeMax2;
        int readMax;
        int methodCallMax;
        int readMaxIndex = 0;
        int writeMaxIndex1 = 0;
        int writeMaxIndex2;
        int methodCallMaxIndex = 0;
        try {
            BufferedWriter MethodsDestClass =(BufferedWriter)(Object) NULL; //new BufferedWriter();
            MethodsDestClass = new BufferedWriter(new FileWriter("InfoFiles/MethodsDestclass.txt"));
            FileInputStream fstreamWriteAttr = new FileInputStream("InfoFiles/WriteAttributes.txt");
            DataInputStream inWriteAttr = new DataInputStream(fstreamWriteAttr);
            BufferedReader writeAttr = new BufferedReader(new InputStreamReader(inWriteAttr));
            FileInputStream fstreamMethodsCalled = new FileInputStream("InfoFiles/MethodsCalled.txt");
            DataInputStream inMethodsCalled = new DataInputStream(fstreamMethodsCalled);
            BufferedReader methodsCalled = new BufferedReader(new InputStreamReader(inMethodsCalled));
            FileInputStream fstreamReadAttr = new FileInputStream("InfoFiles/ReadAttributes.txt");
            DataInputStream inReadAttr = new DataInputStream(fstreamReadAttr);
            BufferedReader readAttr = new BufferedReader(new InputStreamReader(inReadAttr));
            while ((WA = writeAttr.readLine()) != null && (RA = readAttr.readLine()) != null && (MC = methodsCalled.readLine()) != null) {
                WA = writeAttr.readLine();
                RA = readAttr.readLine();
                MC = methodsCalled.readLine();
                while (WA.compareTo("EndOfClass") != 0 && RA.compareTo("EndOfClass") != 0 && MC.compareTo("EndOfClass") != 0) {
                    methodName = writeAttr.readLine();
                    readAttr.readLine();
                    methodsCalled.readLine();
                    WA = writeAttr.readLine();
                    MC = methodsCalled.readLine();
                    RA = readAttr.readLine();
                    while (true) {
                        if (WA.compareTo("EndOfMethod") == 0 && RA.compareTo("EndOfMethod") == 0 && MC.compareTo("EndOfMethod") == 0) {
                            break;
                        }
                        if (WA.compareTo("EndOfMethod") != 0) {
                            if (WA.indexOf(".") > 0) {
                                WA = WA.substring(0, WA.indexOf("."));
                            }
                        }
                        if (RA.compareTo("EndOfMethod") != 0) {
                            if (RA.indexOf(".") > 0) {
                                RA = RA.substring(0, RA.indexOf("."));
                            }
                        }
                        if (MC.compareTo("EndOfMethod") != 0) {
                            if (MC.indexOf(".") > 0) {
                                MC = MC.substring(0, MC.indexOf("."));
                            }
                        }
                        for (int i = 0; i < numFiles && info[i] != null; i++) {
                            if (info[i].compareTo(WA) == 0) {
                                writeCount[i]++;
                            }
                            if (info[i].compareTo(RA) == 0) {
                                readCount[i]++;
                            }
                            if (info[i].compareTo(MC) == 0) {
                                methodCallCount[i]++;
                            }
                        }
                        if (WA.compareTo("EndOfMethod") != 0) {
                            WA = writeAttr.readLine();
                        }
                        if (MC.compareTo("EndOfMethod") != 0) {
                            MC = methodsCalled.readLine();
                        }
                        if (RA.compareTo("EndOfMethod") != 0) {
                            RA = readAttr.readLine();
                        }
                    }
                    WA = writeAttr.readLine();
                    MC = methodsCalled.readLine();
                    RA = readAttr.readLine();
                    writeMax1 = writeCount[0];
                    writeMaxIndex1 = 0;
                    for (int i = 1; i < numFiles; i++) {
                        if (writeCount[i] > writeMax1) {
                            writeMax1 = writeCount[i];
                            writeMaxIndex1 = i;
                        }
                    }
                    writeCount[writeMaxIndex1] = 0;
                    writeMax2 = writeCount[0];
                    writeMaxIndex2 = 0;
                    for (int i = 1; i < numFiles; i++) {
                        if (writeCount[i] > writeMax2) {
                            writeMax2 = writeCount[i];
                            writeMaxIndex2 = i;
                        }
                    }
                    readMax = readCount[0];
                    readMaxIndex = 0;
                    for (int i = 1; i < numFiles; i++) {
                        if (readCount[i] > readMax) {
                            readMax = readCount[i];
                            readMaxIndex = i;
                        }
                    }
                    methodCallMax = methodCallCount[0];
                    methodCallMaxIndex = 0;
                    for (int i = 1; i < numFiles; i++) {
                        if (methodCallCount[i] > methodCallMax) {
                            methodCallMax = methodCallCount[i];
                            methodCallMaxIndex = i;
                        }
                    }
                    boolean isNotEmpty = false;
                    if (writeMax1 > 0 && writeMax2 == 0) {
                        finalClass = info[writeMaxIndex1];
                        isNotEmpty = true;
                    } else if (writeMax1 == 0) {
                        if (readMax != 0) {
                            finalClass = info[readMaxIndex];
                            isNotEmpty = true;
                        } else if (methodCallMax != 0) {
                            finalClass = info[methodCallMaxIndex];
                            isNotEmpty = true;
                        }
                    }
                    if (isNotEmpty == true) {
//                        MyHelperClass MethodsDestClass = new MyHelperClass();
                        MethodsDestClass.write(methodName);
//                        MyHelperClass MethodsDestClass = new MyHelperClass();
                        MethodsDestClass.newLine();
//                        MyHelperClass MethodsDestClass = new MyHelperClass();
                        MethodsDestClass.write(finalClass);
//                        MyHelperClass MethodsDestClass = new MyHelperClass();
                        MethodsDestClass.newLine();
                        isNotEmpty = false;
                    }
                    for (int j = 0; j < numFiles; j++) {
                        readCount[j] = 0;
                        writeCount[j] = 0;
                        methodCallCount[j] = 0;
                    }
                }
            }
            writeAttr.close();
            methodsCalled.close();
            readAttr.close();
//            MyHelperClass MethodsDestClass = new MyHelperClass();
            MethodsDestClass.close();
            int sizeInfoArray = 0;
            sizeInfoArray =(int)(Object) infoArraySize();
            boolean classWritten = false;
            principleClass =(MyHelperClass[])(Object)(MyHelperClass)(Object) new String[100];
            principleMethod =(MyHelperClass[])(Object)(MyHelperClass)(Object) new String[100];
            principleMethodsClass =(MyHelperClass[])(Object)(MyHelperClass)(Object) new String[100];
            String infoArray[] = new String[sizeInfoArray];
            String field;
            int counter = 0;
            FileInputStream fstreamDestMethod = new FileInputStream("InfoFiles/MethodsDestclass.txt");
            DataInputStream inDestMethod = new DataInputStream(fstreamDestMethod);
            BufferedReader destMethod = new BufferedReader(new InputStreamReader(inDestMethod));
            PrincipleClassGroup =(MyHelperClass)(Object) new BufferedWriter(new FileWriter("InfoFiles/PrincipleClassGroup.txt"));
            while ((field = destMethod.readLine()) != null) {
                infoArray[counter] = field;
                counter++;
            }
            for (int i = 0; i < numFiles; i++) {
                for (int j = 0; j < counter - 1 && info[i] != null; j++) {
                    if (infoArray[j + 1].compareTo(info[i]) == 0) {
                        if (classWritten == false) {
                            PrincipleClassGroup.write(infoArray[j + 1]);
                            PrincipleClassGroup.newLine();
                            principleClass[(int)(Object)principleClassCount] =(MyHelperClass)(Object) infoArray[j + 1];
                            principleClassCount++;
                            classWritten = true;
                        }
                        PrincipleClassGroup.write(infoArray[j]);
                        principleMethod[(int)(Object)principleMethodCount] =(MyHelperClass)(Object) infoArray[j];
                        principleMethodsClass[(int)(Object)principleMethodCount] =(MyHelperClass)(Object) infoArray[j + 1];
                        principleMethodCount++;
                        PrincipleClassGroup.newLine();
                    }
                }
                if (classWritten == true) {
                    PrincipleClassGroup.write("EndOfClass");
                    PrincipleClassGroup.newLine();
                    classWritten = false;
                }
            }
            destMethod.close();
            PrincipleClassGroup.close();
            readFileCount = readFileCount();
            writeFileCount = writeFileCount();
            methodCallFileCount = methodCallFileCount();
            readArray =(MyHelperClass)(Object) new String[(int)(Object)readFileCount];
            writeArray =(MyHelperClass)(Object) new String[(int)(Object)writeFileCount];
            callArray =(MyHelperClass)(Object) new String[(int)(Object)methodCallFileCount];
            initializeArrays();
            constructFundamentalView();
            constructInteractionView();
            constructAssociationView();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass write(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass newLine(){ return null; }}
