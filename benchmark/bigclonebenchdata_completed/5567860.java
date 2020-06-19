import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5567860 {
public MyHelperClass methodGenerator;
	public MyHelperClass getPackageName(EmeraldjbBean o0){ return null; }
	public MyHelperClass getClassName(Entity o0){ return null; }

    public String getClass(EmeraldjbBean eb) throws Throwable, EmeraldjbException {
        Entity entity = (Entity)(Entity)(Object) eb;
        StringBuffer sb = new StringBuffer();
        String myPackage =(String)(Object) getPackageName(eb);
        sb.append("package " + myPackage + ";\n");
        sb.append("\n");
        DaoValuesGenerator valgen = new DaoValuesGenerator();
        String values_class_name =(String)(Object) valgen.getClassName(entity);
        sb.append("\n");
        List importList = new Vector();
        importList.add("java.io.FileOutputStream;");
        importList.add("java.io.FileInputStream;");
        importList.add("java.io.DataInputStream;");
        importList.add("java.io.DataOutputStream;");
        importList.add("java.io.IOException;");
        importList.add("java.sql.Date;");
        importList.add(valgen.getPackageName(eb) + "." + values_class_name + ";");
        Iterator it = importList.iterator();
        while (it.hasNext()) {
            String importName = (String) it.next();
            sb.append("import " + importName + "\n");
        }
        sb.append("\n");
        MyHelperClass GeneratorConst = new MyHelperClass();
        String proto_version =(String)(Object) entity.getPatternValue(GeneratorConst.PATTERN_STREAM_PROTO_VERSION, "1");
        String streamer_class_name =(String)(Object) getClassName(entity);
        sb.append("public class " + streamer_class_name + "\n");
        sb.append("{" + "\n  public static final int PROTO_VERSION=" + proto_version + ";");
        sb.append("\n\n");
        StringBuffer f_writer = new StringBuffer();
        StringBuffer f_reader = new StringBuffer();
        boolean has_times = false;
        boolean has_strings = false;
        it =(Iterator)(Object) entity.getMembers().iterator();
        while (it.hasNext()) {
            Member member = (Member) it.next();
            String nm =(String)(Object) member.getName();
            MyHelperClass DaoGeneratorUtils = new MyHelperClass();
            String getter = "obj." + methodGenerator.getMethodName(DaoGeneratorUtils.METHOD_GET, member);
//            MyHelperClass DaoGeneratorUtils = new MyHelperClass();
            String setter = "obj." + methodGenerator.getMethodName(DaoGeneratorUtils.METHOD_SET, member);
            String pad = "    ";
            MyHelperClass EmdFactory = new MyHelperClass();
            JTypeBase gen_type =(JTypeBase)(Object) EmdFactory.getJTypeFactory().getJavaType(member.getType());
            f_writer.append(gen_type.getToBinaryCode(pad, "dos", getter + "()"));
            f_reader.append(gen_type.getFromBinaryCode(pad, "din", setter));
        }
        String reader_vars = "";
        sb.append("\n  public static void writeToFile(String file_nm, " + values_class_name + " obj) throws IOException" + "\n  {" + "\n    if (file_nm==null || file_nm.length()==0) throw new IOException(\"Bad file name (null or zero length)\");" + "\n    if (obj==null) throw new IOException(\"Bad value object parameter, cannot write null object to file\");" + "\n    FileOutputStream fos = new FileOutputStream(file_nm);" + "\n    DataOutputStream dos = new DataOutputStream(fos);" + "\n    writeStream(dos, obj);" + "\n    fos.close();" + "\n  } // end of writeToFile" + "\n" + "\n  public static void readFromFile(String file_nm, " + values_class_name + " obj) throws IOException" + "\n  {" + "\n    if (file_nm==null || file_nm.length()==0) throw new IOException(\"Bad file name (null or zero length)\");" + "\n    if (obj==null) throw new IOException(\"Bad value object parameter, cannot write null object to file\");" + "\n    FileInputStream fis = new FileInputStream(file_nm);" + "\n    DataInputStream dis = new DataInputStream(fis);" + "\n    readStream(dis, obj);" + "\n    fis.close();" + "\n  } // end of readFromFile" + "\n" + "\n  public static void writeStream(DataOutputStream dos, " + values_class_name + " obj) throws IOException" + "\n  {" + "\n    dos.writeByte(PROTO_VERSION);" + "\n    " + f_writer + "\n  } // end of writeStream" + "\n" + "\n  public static void readStream(DataInputStream din, " + values_class_name + " obj) throws IOException" + "\n  {" + "\n    int proto_version = din.readByte();" + "\n    if (proto_version==" + proto_version + ") readStreamV1(din,obj);" + "\n  } // end of readStream" + "\n" + "\n  public static void readStreamV1(DataInputStream din, " + values_class_name + " obj) throws IOException" + "\n  {" + reader_vars + f_reader + "\n  } // end of readStreamV1" + "\n" + "\n} // end of classs" + "\n\n" + "\n//**************" + "\n// End of file" + "\n//**************");
        return sb.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PATTERN_STREAM_PROTO_VERSION;
	public MyHelperClass METHOD_GET;
	public MyHelperClass METHOD_SET;
public MyHelperClass getJavaType(MyHelperClass o0){ return null; }
	public MyHelperClass getJTypeFactory(){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass getMethodName(MyHelperClass o0, Member o1){ return null; }}

class EmeraldjbBean {

}

class EmeraldjbException extends Exception{
	public EmeraldjbException(String errorMessage) { super(errorMessage); }
}

class Entity {

public MyHelperClass getMembers(){ return null; }
	public MyHelperClass getPatternValue(MyHelperClass o0, String o1){ return null; }}

class DaoValuesGenerator {

public MyHelperClass getPackageName(EmeraldjbBean o0){ return null; }
	public MyHelperClass getClassName(Entity o0){ return null; }}

class Member {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getType(){ return null; }}

class JTypeBase {

public MyHelperClass getFromBinaryCode(String o0, String o1, String o2){ return null; }
	public MyHelperClass getToBinaryCode(String o0, String o1, String o2){ return null; }}
