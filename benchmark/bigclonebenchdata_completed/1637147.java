import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1637147 {
public MyHelperClass performCombineTreeWalk(PredicateAnnotationRecord o0, <anonymous Ternary> o1, String o2){ return null; }
public MyHelperClass Opcode;
	public MyHelperClass performCombineTreeWalk(PredicateAnnotationRecord o0){ return null; }
public MyHelperClass cacheInfo;
	public MyHelperClass Mode;
	public MyHelperClass getMethodName(PredicateAnnotationRecord o0){ return null; }

    protected PredicateAnnotationRecord generatePredicateAnnotationRecord(PredicateAnnotationRecord par, String miDescriptor)  throws Throwable {
        String annotClass = par.annotation.getType().substring(1,(int)(Object) par.annotation.getType().length() - 1).replace('/', '.');
        String methodName =(String)(Object) getMethodName(par);
        MyHelperClass CLASS_SIG_SEPARATOR_STRING = new MyHelperClass();
        String hashKey = annotClass + CLASS_SIG_SEPARATOR_STRING + methodName;
        MyHelperClass _generatedPredicateRecords = new MyHelperClass();
        PredicateAnnotationRecord gr =(PredicateAnnotationRecord)(Object) _generatedPredicateRecords.get(hashKey);
        if (gr != null) {
            cacheInfo.incCombinePredicateCacheHit();
            return gr;
        } else {
            cacheInfo.incCombinePredicateCacheMiss();
        }
        MyHelperClass _predicatePackage = new MyHelperClass();
        String predicateClass = (((int)(Object)_predicatePackage.length() > 0) ? (_predicatePackage + ".") : "") + annotClass + "Pred";
        ClassFile predicateCF = null;
        MyHelperClass _predicatePackageDir = new MyHelperClass();
        File clonedFile = new File((String)(Object)_predicatePackageDir, annotClass.replace('.', '/') + "Pred.class");
        if (clonedFile.exists() && clonedFile.isFile() && clonedFile.canRead()) {
            try {
                predicateCF = new ClassFile(new FileInputStream(clonedFile));
            } catch (IOException ioe) {
                throw new ThreadCheckException("Could not open predicate class file, source=" + clonedFile, ioe);
            }
        } else {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            try {
                MyHelperClass _templatePredicateClassFile = new MyHelperClass();
                _templatePredicateClassFile.write(baos);
                predicateCF = new ClassFile(new ByteArrayInputStream(baos.toByteArray()));
            } catch (IOException ioe) {
                throw new ThreadCheckException("Could not open predicate template class file", ioe);
            }
        }
        clonedFile.getParentFile().mkdirs();
        final ArrayList<String> paramNames = new ArrayList<String>();
        final HashMap<String, String> paramTypes = new HashMap<String, String>();
        performCombineTreeWalk(par, new Ternary() {

            public Object apply(String param1, String param2, AMemberValue param3) {
                paramNames.add(param1);
                paramTypes.put(param1, param2);
                return null;
            }
        }, "");
        ArrayList<PredicateAnnotationRecord> memberPARs = new ArrayList<PredicateAnnotationRecord>();
        for (String key :(String[])(Object) (Object[])(Object)par.combinedPredicates.keySet()) {
            for (PredicateAnnotationRecord memberPAR :(PredicateAnnotationRecord[])(Object) (Object[])(Object)par.combinedPredicates.get(key)) {
                if ((memberPAR.predicateClass != null) && (memberPAR.predicateMI != null)) {
                    memberPARs.add(memberPAR);
                } else {
                    memberPARs.add(generatePredicateAnnotationRecord(memberPAR, miDescriptor));
                }
            }
        }
        AUTFPoolInfo predicateClassNameItem =(AUTFPoolInfo)(Object) new ASCIIPoolInfo(predicateClass.replace('.', '/'), predicateCF.getConstantPool());
        int[] l =(int[])(Object) predicateCF.addConstantPoolItems(new APoolInfo[] {(APoolInfo)(Object) predicateClassNameItem });
        MyHelperClass CheckUTFVisitor = new MyHelperClass();
        predicateClassNameItem =(AUTFPoolInfo)(Object) predicateCF.getConstantPoolItem(l[0]).execute(CheckUTFVisitor.singleton(), null);
        ClassPoolInfo predicateClassItem = new ClassPoolInfo(predicateClassNameItem, predicateCF.getConstantPool());
        l =(int[])(Object) predicateCF.addConstantPoolItems(new APoolInfo[] {(APoolInfo)(Object) predicateClassItem });
        MyHelperClass CheckClassVisitor = new MyHelperClass();
        predicateClassItem =(ClassPoolInfo)(Object) predicateCF.getConstantPoolItem(l[0]).execute(CheckClassVisitor.singleton(), null);
        predicateCF.setThisClass(predicateClassItem);
        StringBuilder sb = new StringBuilder();
        sb.append("(Ljava/lang/Object;");
        if ((boolean)(Object)par.passArguments) {
            sb.append("[Ljava/lang/Object;");
        }
        for (String key : paramNames) {
            sb.append(paramTypes.get(key));
        }
        sb.append(")Z");
        String methodDesc = sb.toString();
        MethodInfo templateMI = null;
        MethodInfo predicateMI = null;
        for (MethodInfo mi :(MethodInfo[])(Object) (Object[])(Object)predicateCF.getMethods()) {
            if ((mi.getName().toString().equals(methodName)) && (mi.getDescriptor().toString().equals(methodDesc))) {
                predicateMI = mi;
                break;
            } else if ((mi.getName().toString().equals("template")) && (mi.getDescriptor().toString().startsWith("(")) && (mi.getDescriptor().toString().endsWith(")Z"))) {
                templateMI = mi;
            }
        }
        if ((templateMI == null) && (predicateMI == null)) {
            throw new ThreadCheckException("Could not find template predicate method in class file");
        }
        if (predicateMI == null) {
            AUTFPoolInfo namecpi =(AUTFPoolInfo)(Object) new ASCIIPoolInfo(methodName, predicateCF.getConstantPool());
            l =(int[])(Object) predicateCF.addConstantPoolItems(new APoolInfo[] {(APoolInfo)(Object) namecpi });
//            MyHelperClass CheckUTFVisitor = new MyHelperClass();
            namecpi =(AUTFPoolInfo)(Object) predicateCF.getConstantPoolItem(l[0]).execute(CheckUTFVisitor.singleton(), null);
            AUTFPoolInfo descpi =(AUTFPoolInfo)(Object) new ASCIIPoolInfo(methodDesc, predicateCF.getConstantPool());
            l =(int[])(Object) predicateCF.addConstantPoolItems(new APoolInfo[] {(APoolInfo)(Object) descpi });
//            MyHelperClass CheckUTFVisitor = new MyHelperClass();
            descpi =(AUTFPoolInfo)(Object) predicateCF.getConstantPoolItem(l[0]).execute(CheckUTFVisitor.singleton(), null);
            ArrayList<AAttributeInfo> list = new ArrayList<AAttributeInfo>();
            for (AAttributeInfo a :(AAttributeInfo[])(Object) (Object[])(Object)templateMI.getAttributes()) {
                try {
                    AAttributeInfo clonedA = (AAttributeInfo) a.clone();
                    list.add(clonedA);
                } catch (CloneNotSupportedException e) {
                    throw new InstrumentorException("Could not clone method attributes");
                }
            }
            predicateMI = new MethodInfo(templateMI.getAccessFlags(), namecpi, descpi, list.toArray(new AAttributeInfo[] {}));
            predicateCF.getMethods().add(predicateMI);
            CodeProperties props =(CodeProperties)(Object) predicateMI.getCodeAttributeInfo().getProperties();
           (int)(Object) props.maxLocals += paramTypes.size() + 1 + ((boolean)(Object)par.passArguments ? 1 : 0);
            InstructionList il = new InstructionList(predicateMI.getCodeAttributeInfo().getCode());
            if ((par.combineMode == Mode.OR) || (par.combineMode == Mode.XOR) || (par.combineMode == Mode.IMPLIES)) {
                MyHelperClass Opcode = new MyHelperClass();
                il.insertInstr((ReferenceInstruction)(Object)new GenericInstruction(Opcode.ICONST_0), predicateMI.getCodeAttributeInfo());
            } else {
                MyHelperClass Opcode = new MyHelperClass();
                il.insertInstr((ReferenceInstruction)(Object)new GenericInstruction(Opcode.ICONST_1), predicateMI.getCodeAttributeInfo());
            }
            boolean res;
            res =(boolean)(Object) il.advanceIndex();
            assert res == true;
            int accumVarIndex =(int)(Object) props.maxLocals - 1;
            AInstruction loadAccumInstr;
            AInstruction storeAccumInstr;
            if (accumVarIndex < 256) {
                MyHelperClass Opcode = new MyHelperClass();
                loadAccumInstr =(AInstruction)(Object) new GenericInstruction(Opcode.ILOAD, (byte) accumVarIndex);
//                MyHelperClass Opcode = new MyHelperClass();
                storeAccumInstr =(AInstruction)(Object) new GenericInstruction(Opcode.ISTORE, (byte) accumVarIndex);
            } else {
                MyHelperClass Opcode = new MyHelperClass();
                byte[] bytes = new byte[] {(byte)(Object) Opcode.ILOAD, 0, 0 };
                MyHelperClass Types = new MyHelperClass();
                Types.bytesFromShort((short) accumVarIndex, bytes, 1);
                loadAccumInstr =(AInstruction)(Object) new WideInstruction(bytes);
//                MyHelperClass Opcode = new MyHelperClass();
                bytes[0] =(byte)(Object) Opcode.ISTORE;
                storeAccumInstr =(AInstruction)(Object) new WideInstruction(bytes);
            }
            il.insertInstr(storeAccumInstr, predicateMI.getCodeAttributeInfo());
            res =(boolean)(Object) il.advanceIndex();
            assert res == true;
            int maxStack = 0;
            int paramIndex = 1;
            int lvIndex = 1;
            if ((boolean)(Object)par.passArguments) {
                lvIndex += 1;
            }
            int memberCount = 0;
            for (PredicateAnnotationRecord memberPAR : memberPARs) {
                ++memberCount;
                MyHelperClass Opcode = new MyHelperClass();
                il.insertInstr((ReferenceInstruction)(Object)new GenericInstruction(Opcode.ALOAD_0), predicateMI.getCodeAttributeInfo());
                res =(boolean)(Object) il.advanceIndex();
                assert res == true;
                int curStack = 1;
                if ((boolean)(Object)memberPAR.passArguments) {
                    if ((boolean)(Object)par.passArguments) {
//                        MyHelperClass Opcode = new MyHelperClass();
                        il.insertInstr((ReferenceInstruction)(Object)new GenericInstruction(Opcode.ALOAD_1), predicateMI.getCodeAttributeInfo());
                        res =(boolean)(Object) il.advanceIndex();
                        assert res == true;
                        curStack += 1;
                    }
                }
                for (int paramNameIndex = 0; paramNameIndex < (int)(Object)memberPAR.paramNames.size(); ++paramNameIndex) {
                    String t =(String)(Object) memberPAR.paramTypes.get((String)(Object)memberPAR.paramNames.get((String)(Object)paramNameIndex));
                    if (t.length() == 0) {
                        throw new ThreadCheckException("Length of parameter type no. " + paramIndex + " string is 0 in " + predicateMI.getName() + " in class " + predicateCF.getThisClassName());
                    }
                    byte opcode;
                    int nextLVIndex = lvIndex;
                    switch(t.charAt(0)) {
                        case 'I':
                        case 'B':
                        case 'C':
                        case 'S':
                        case 'Z':
//                            MyHelperClass Opcode = new MyHelperClass();
                            opcode =(byte)(Object) Opcode.ILOAD;
                            nextLVIndex += 1;
                            curStack += 1;
                            break;
                        case 'F':
//                            MyHelperClass Opcode = new MyHelperClass();
                            opcode =(byte)(Object) Opcode.FLOAD;
                            nextLVIndex += 1;
                            curStack += 1;
                            break;
                        case '[':
                        case 'L':
//                            MyHelperClass Opcode = new MyHelperClass();
                            opcode =(byte)(Object) Opcode.ALOAD;
                            nextLVIndex += 1;
                            curStack += 1;
                            break;
                        case 'J':
//                            MyHelperClass Opcode = new MyHelperClass();
                            opcode =(byte)(Object) Opcode.LLOAD;
                            nextLVIndex += 2;
                            curStack += 2;
                            break;
                        case 'D':
//                            MyHelperClass Opcode = new MyHelperClass();
                            opcode =(byte)(Object) Opcode.DLOAD;
                            nextLVIndex += 2;
                            curStack += 2;
                            break;
                        default:
                            throw new ThreadCheckException("Parameter type no. " + paramIndex + ", " + t + ", is unknown in " + predicateMI.getName() + " in class " + predicateCF.getThisClassName());
                    }
//                    MyHelperClass Opcode = new MyHelperClass();
                    AInstruction load =(AInstruction)(Object) Opcode.getShortestLoadStoreInstruction(opcode, (short) lvIndex);
                    il.insertInstr(load, predicateMI.getCodeAttributeInfo());
                    res =(boolean)(Object) il.advanceIndex();
                    assert res == true;
                    ++paramIndex;
                    lvIndex = nextLVIndex;
                }
                if (curStack > maxStack) {
                    maxStack = curStack;
                }
//                MyHelperClass Opcode = new MyHelperClass();
                ReferenceInstruction predicateCallInstr = new ReferenceInstruction(Opcode.INVOKESTATIC, (short) 0);
                int predicateCallIndex =(int)(Object) predicateCF.addMethodToConstantPool(memberPAR.predicateClass.replace('.', '/'), memberPAR.predicateMI.getName().toString(), memberPAR.predicateMI.getDescriptor().toString());
                predicateCallInstr.setReference(predicateCallIndex);
                il.insertInstr(predicateCallInstr, predicateMI.getCodeAttributeInfo());
                res =(boolean)(Object) il.advanceIndex();
                assert res == true;
                if ((par.combineMode == Mode.NOT) || ((par.combineMode == Mode.IMPLIES) && (memberCount == 1))) {
//                    MyHelperClass Opcode = new MyHelperClass();
                    il.insertInstr((ReferenceInstruction)(Object)new GenericInstruction(Opcode.ICONST_1), predicateMI.getCodeAttributeInfo());
                    res =(boolean)(Object) il.advanceIndex();
                    assert res == true;
//                    MyHelperClass Opcode = new MyHelperClass();
                    il.insertInstr((ReferenceInstruction)(Object)new GenericInstruction(Opcode.SWAP), predicateMI.getCodeAttributeInfo());
                    res =(boolean)(Object) il.advanceIndex();
                    assert res == true;
//                    MyHelperClass Opcode = new MyHelperClass();
                    il.insertInstr((ReferenceInstruction)(Object)new GenericInstruction(Opcode.ISUB), predicateMI.getCodeAttributeInfo());
                    res =(boolean)(Object) il.advanceIndex();
                    assert res == true;
                }
                il.insertInstr(loadAccumInstr, predicateMI.getCodeAttributeInfo());
                res =(boolean)(Object) il.advanceIndex();
                assert res == true;
                if (par.combineMode == Mode.OR) {
                    il.insertInstr((ReferenceInstruction)(Object)new GenericInstruction(Opcode.IOR), predicateMI.getCodeAttributeInfo());
                } else if ((par.combineMode == Mode.AND) || (par.combineMode == Mode.NOT)) {
                    il.insertInstr((ReferenceInstruction)(Object)new GenericInstruction(Opcode.IAND), predicateMI.getCodeAttributeInfo());
                } else if (par.combineMode == Mode.XOR) {
                    il.insertInstr((ReferenceInstruction)(Object)new GenericInstruction(Opcode.IADD), predicateMI.getCodeAttributeInfo());
                } else if (par.combineMode == Mode.IMPLIES) {
                    il.insertInstr((ReferenceInstruction)(Object)new GenericInstruction(Opcode.IOR), predicateMI.getCodeAttributeInfo());
                } else {
                    assert false;
                }
                res =(boolean)(Object) il.advanceIndex();
                assert res == true;
                il.insertInstr(storeAccumInstr, predicateMI.getCodeAttributeInfo());
                res =(boolean)(Object) il.advanceIndex();
                assert res == true;
            }
            if (par.combineMode == Mode.XOR) {
                il.insertInstr(loadAccumInstr, predicateMI.getCodeAttributeInfo());
                res =(boolean)(Object) il.advanceIndex();
                assert res == true;
                il.insertInstr((ReferenceInstruction)(Object)new GenericInstruction(Opcode.ICONST_1), predicateMI.getCodeAttributeInfo());
                res =(boolean)(Object) il.advanceIndex();
                assert res == true;
                il.insertInstr((ReferenceInstruction)(Object)new GenericInstruction(Opcode.ICONST_0), predicateMI.getCodeAttributeInfo());
                res =(boolean)(Object) il.advanceIndex();
                assert res == true;
                WideBranchInstruction br2 = new WideBranchInstruction(Opcode.GOTO_W,(int)(Object) il.getIndex() + 1);
                il.insertInstr((AInstruction)(Object)br2, predicateMI.getCodeAttributeInfo());
                res =(boolean)(Object) il.advanceIndex();
                assert res == true;
                int jumpIndex =(int)(Object) il.getIndex();
                il.insertInstr((ReferenceInstruction)(Object)new GenericInstruction(Opcode.ICONST_1), predicateMI.getCodeAttributeInfo());
                res =(boolean)(Object) il.advanceIndex();
                assert res == true;
                res =(boolean)(Object) il.rewindIndex(3);
                assert res == true;
                BranchInstruction br1 = new BranchInstruction(Opcode.IF_ICMPEQ, jumpIndex);
                il.insertInstr((AInstruction)(Object)br1, predicateMI.getCodeAttributeInfo());
                res =(boolean)(Object) il.advanceIndex(4);
                assert res == true;
            } else {
                il.insertInstr(loadAccumInstr, predicateMI.getCodeAttributeInfo());
                res =(boolean)(Object) il.advanceIndex();
                assert res == true;
            }
            il.deleteInstr(predicateMI.getCodeAttributeInfo());
            predicateMI.getCodeAttributeInfo().setCode(il.getCode());
            props.maxStack =(MyHelperClass)(Object) Math.max(maxStack, 2);
            predicateMI.getCodeAttributeInfo().setProperties(props.maxStack, props.maxLocals);
            try {
                FileOutputStream fos = new FileOutputStream(clonedFile);
                predicateCF.write(fos);
                fos.close();
            } catch (IOException e) {
                throw new ThreadCheckException("Could not write cloned predicate class file, target=" + clonedFile);
            }
        }
        gr = new PredicateAnnotationRecord(par.annotation, predicateClass, predicateMI, paramNames, paramTypes, new ArrayList<AMemberValue>(), par.passArguments, null, new HashMap<String, ArrayList<PredicateAnnotationRecord>>());
        _generatedPredicateRecords.put(hashKey, gr);
        return gr;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass GOTO_W;
	public MyHelperClass IADD;
	public MyHelperClass IOR;
	public MyHelperClass ALOAD_0;
	public MyHelperClass SWAP;
	public MyHelperClass IAND;
	public MyHelperClass IF_ICMPEQ;
	public MyHelperClass DLOAD;
	public MyHelperClass FLOAD;
	public MyHelperClass AND;
	public MyHelperClass ALOAD_1;
	public MyHelperClass NOT;
	public MyHelperClass ICONST_0;
	public MyHelperClass ISTORE;
	public MyHelperClass ICONST_1;
	public MyHelperClass INVOKESTATIC;
	public MyHelperClass ILOAD;
	public MyHelperClass OR;
	public MyHelperClass ALOAD;
	public MyHelperClass XOR;
	public MyHelperClass ISUB;
	public MyHelperClass IMPLIES;
	public MyHelperClass LLOAD;
public MyHelperClass put(String o0, PredicateAnnotationRecord o1){ return null; }
	public MyHelperClass incCombinePredicateCacheMiss(){ return null; }
	public MyHelperClass add(MethodInfo o0){ return null; }
	public MyHelperClass getShortestLoadStoreInstruction(byte o0, short o1){ return null; }
	public MyHelperClass getType(){ return null; }
	public MyHelperClass write(ByteArrayOutputStream o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass bytesFromShort(short o0, byte[] o1, int o2){ return null; }
	public MyHelperClass singleton(){ return null; }
	public MyHelperClass incCombinePredicateCacheHit(){ return null; }
	public MyHelperClass replace(char o0, char o1){ return null; }
	public MyHelperClass getCode(){ return null; }
	public MyHelperClass substring(int o0, int o1){ return null; }
	public MyHelperClass getDescriptor(){ return null; }
	public MyHelperClass getProperties(){ return null; }
	public MyHelperClass execute(MyHelperClass o0, Object o1){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass setCode(MyHelperClass o0){ return null; }
	public MyHelperClass setProperties(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass keySet(){ return null; }}

class PredicateAnnotationRecord {
public MyHelperClass predicateClass;
	public MyHelperClass paramTypes;
	public MyHelperClass passArguments;
	public MyHelperClass predicateMI;
	public MyHelperClass paramNames;
	public MyHelperClass combineMode;
	public MyHelperClass combinedPredicates;
	public MyHelperClass annotation;
PredicateAnnotationRecord(){}
	PredicateAnnotationRecord(MyHelperClass o0, String o1, MethodInfo o2, ArrayList<String>,HashMap<String,String>,ArrayList<AMemberValue> o3, MyHelperClass o4, Object o5, HashMap<String,ArrayList<PredicateAnnotationRecord>> o6){}}

class ClassFile {

ClassFile(FileInputStream o0){}
	ClassFile(){}
	ClassFile(ByteArrayInputStream o0){}
	public MyHelperClass setThisClass(ClassPoolInfo o0){ return null; }
	public MyHelperClass getThisClassName(){ return null; }
	public MyHelperClass write(FileOutputStream o0){ return null; }
	public MyHelperClass getConstantPoolItem(int o0){ return null; }
	public MyHelperClass getMethods(){ return null; }
	public MyHelperClass addMethodToConstantPool(MyHelperClass o0, String o1, String o2){ return null; }
	public MyHelperClass getConstantPool(){ return null; }
	public MyHelperClass addConstantPoolItems(APoolInfo[] o0){ return null; }}

class ThreadCheckException extends Exception{
	public ThreadCheckException(String errorMessage) { super(errorMessage); }
	ThreadCheckException(String o0, IOException o1){}
	ThreadCheckException(){}
}

class AUTFPoolInfo {

}

class ASCIIPoolInfo {

ASCIIPoolInfo(String o0, MyHelperClass o1){}
	ASCIIPoolInfo(){}}

class APoolInfo {

}

class ClassPoolInfo {

ClassPoolInfo(){}
	ClassPoolInfo(AUTFPoolInfo o0, MyHelperClass o1){}}

class MethodInfo {

MethodInfo(){}
	MethodInfo(MyHelperClass o0, AUTFPoolInfo o1, AUTFPoolInfo o2, AAttributeInfo[] o3){}
	public MyHelperClass getCodeAttributeInfo(){ return null; }
	public MyHelperClass getDescriptor(){ return null; }
	public MyHelperClass getAttributes(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getAccessFlags(){ return null; }}

class AAttributeInfo {

}

class InstrumentorException extends Exception{
	public InstrumentorException(String errorMessage) { super(errorMessage); }
}

class InstructionList {

InstructionList(MyHelperClass o0){}
	InstructionList(){}
	public MyHelperClass advanceIndex(int o0){ return null; }
	public MyHelperClass advanceIndex(){ return null; }
	public MyHelperClass rewindIndex(int o0){ return null; }
	public MyHelperClass insertInstr(AInstruction o0, MyHelperClass o1){ return null; }
	public MyHelperClass insertInstr(ReferenceInstruction o0, MyHelperClass o1){ return null; }
	public MyHelperClass deleteInstr(MyHelperClass o0){ return null; }
	public MyHelperClass getIndex(){ return null; }
	public MyHelperClass getCode(){ return null; }}

class GenericInstruction {

GenericInstruction(MyHelperClass o0){}
	GenericInstruction(MyHelperClass o0, byte o1){}
	GenericInstruction(){}}

class AInstruction {

}

class WideInstruction {

WideInstruction(byte[] o0){}
	WideInstruction(){}}

class ReferenceInstruction {

ReferenceInstruction(){}
	ReferenceInstruction(MyHelperClass o0, short o1){}
	public MyHelperClass setReference(int o0){ return null; }}

class Ternary {

}

class CodeProperties {
public MyHelperClass maxStack;
	public MyHelperClass maxLocals;
}

class AMemberValue {

}

class WideBranchInstruction {

}

class BranchInstruction {

}
