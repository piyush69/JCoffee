import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1349815 {
public MyHelperClass methodGenerator;
	public MyHelperClass getPackageName(EmeraldjbBean o0){ return null; }
	public MyHelperClass getClassName(Entity o0){ return null; }
public MyHelperClass addXmlFunctions(String o0, String o1, boolean o2, StringBuffer o3, StringBuffer o4){ return null; }

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
        importList.add("java.io.*;");
        importList.add("java.sql.Date;");
        importList.add("com.emeraldjb.runtime.patternXmlObj.*;");
        importList.add("javax.xml.parsers.*;");
        importList.add("java.text.ParseException;");
        importList.add("org.xml.sax.*;");
        importList.add("org.xml.sax.helpers.*;");
        importList.add(valgen.getPackageName(eb) + "." + values_class_name + ";");
        Iterator it = importList.iterator();
        while (it.hasNext()) {
            String importName = (String) it.next();
            sb.append("import " + importName + "\n");
        }
        sb.append("\n");
        MyHelperClass GeneratorConst = new MyHelperClass();
        String proto_version =(String)(Object) entity.getPatternValue(GeneratorConst.PATTERN_STREAM_PROTO_VERSION, "1");
//        MyHelperClass GeneratorConst = new MyHelperClass();
        boolean short_version =(boolean)(Object) entity.getPatternBooleanValue(GeneratorConst.PATTERN_STREAM_XML_SHORT, false);
        StringBuffer preface = new StringBuffer();
        StringBuffer consts = new StringBuffer();
        StringBuffer f_writer = new StringBuffer();
        StringBuffer f_writer_short = new StringBuffer();
        StringBuffer f_reader = new StringBuffer();
        StringBuffer end_elems = new StringBuffer();
        boolean end_elem_needs_catch = false;
        consts.append("\n  public static final String EL_CLASS_TAG=\"" + values_class_name + "\";");
        preface.append("\n    xos.print(\"<!-- This format is optimised for space, below are the column mappings\");");
        boolean has_times = false;
        boolean has_strings = false;
        it =(Iterator)(Object) entity.getMembers().iterator();
        int col_num = 0;
        while (it.hasNext()) {
            col_num++;
            Member member = (Member) it.next();
            String nm =(String)(Object) member.getName();
            preface.append("\n    xos.print(\"c" + col_num + " = " + nm + "\");");
            String elem_name = nm;
            String elem_name_short = "c" + col_num;
            String el_name = nm.toUpperCase();
            if ((int)(Object)member.getColLen() > 0 || !(Boolean)(Object)member.isNullAllowed()) {
                end_elem_needs_catch = true;
            }
            String element_const = "EL_" + el_name;
            String element_const_short = "EL_" + el_name + "_SHORT";
            consts.append("\n  public static final String " + element_const + "=\"" + elem_name + "\";" + "\n  public static final String " + element_const_short + "=\"" + elem_name_short + "\";");
            MyHelperClass DaoGeneratorUtils = new MyHelperClass();
            String getter = "obj." + methodGenerator.getMethodName(DaoGeneratorUtils.METHOD_GET, member);
//            MyHelperClass DaoGeneratorUtils = new MyHelperClass();
            String setter = "values_." + methodGenerator.getMethodName(DaoGeneratorUtils.METHOD_SET, member);
            String pad = "    ";
            MyHelperClass EmdFactory = new MyHelperClass();
            JTypeBase gen_type =(JTypeBase)(Object) EmdFactory.getJTypeFactory().getJavaType(member.getType());
            f_writer.append(gen_type.getToXmlCode(pad, element_const, getter + "()"));
            f_writer_short.append(gen_type.getToXmlCode(pad, element_const_short, getter + "()"));
            end_elems.append(gen_type.getFromXmlCode(pad, element_const, setter));
            end_elems.append("\n    //and also the short version");
            end_elems.append(gen_type.getFromXmlCode(pad, element_const_short, setter));
        }
        preface.append("\n    xos.print(\"-->\");");
        String body_part = f_writer.toString();
        String body_part_short = preface.toString() + f_writer_short.toString();
        String reader_vars = "";
        String streamer_class_name =(String)(Object) getClassName(entity);
        sb.append("public class " + streamer_class_name + "  extends DefaultHandler implements TSParser\n");
        sb.append("{" + consts + "\n  public static final int PROTO_VERSION=" + proto_version + ";" + "\n  private transient StringBuffer cdata_=new StringBuffer();" + "\n  private transient String endElement_;" + "\n  private transient TSParser parentParser_;" + "\n  private transient XMLReader theReader_;\n" + "\n  private " + values_class_name + " values_;");
        sb.append("\n\n");
        sb.append("\n  /**" + "\n   * This is really only here as an example.  It is very rare to write a single" + "\n   * object to a file - far more likely to have a collection or object graph.  " + "\n   * in which case you can write something similar - maybe using the writeXmlShort" + "\n   * version instread." + "\n   */" + "\n  public static void writeToFile(String file_nm, " + values_class_name + " obj) throws IOException" + "\n  {" + "\n    if (file_nm==null || file_nm.length()==0) throw new IOException(\"Bad file name (null or zero length)\");" + "\n    if (obj==null) throw new IOException(\"Bad value object parameter, cannot write null object to file\");" + "\n    FileOutputStream fos = new FileOutputStream(file_nm);" + "\n    XmlOutputFilter xos = new XmlOutputFilter(fos);" + "\n    xos.openElement(\"FILE_\"+EL_CLASS_TAG);" + "\n    writeXml(xos, obj);" + "\n    xos.closeElement();" + "\n    fos.close();" + "\n  } // end of writeToFile" + "\n" + "\n  public static void readFromFile(String file_nm, " + values_class_name + " obj) throws IOException, SAXException" + "\n  {" + "\n    if (file_nm==null || file_nm.length()==0) throw new IOException(\"Bad file name (null or zero length)\");" + "\n    if (obj==null) throw new IOException(\"Bad value object parameter, cannot write null object to file\");" + "\n    FileInputStream fis = new FileInputStream(file_nm);" + "\n    DataInputStream dis = new DataInputStream(fis);" + "\n    marshalFromXml(dis, obj);" + "\n    fis.close();" + "\n  } // end of readFromFile" + "\n" + "\n  public static void writeXml(XmlOutputFilter xos, " + values_class_name + " obj) throws IOException" + "\n  {" + "\n    xos.openElement(EL_CLASS_TAG);" + body_part + "\n    xos.closeElement();" + "\n  } // end of writeXml" + "\n" + "\n  public static void writeXmlShort(XmlOutputFilter xos, " + values_class_name + " obj) throws IOException" + "\n  {" + "\n    xos.openElement(EL_CLASS_TAG);" + body_part_short + "\n    xos.closeElement();" + "\n  } // end of writeXml" + "\n" + "\n  public " + streamer_class_name + "(" + values_class_name + " obj) {" + "\n    values_ = obj;" + "\n  } // end of ctor" + "\n");
        String xml_bit =(String)(Object) addXmlFunctions(streamer_class_name, values_class_name, end_elem_needs_catch, end_elems, f_reader);
        String close = "\n" + "\n} // end of classs" + "\n\n" + "\n//**************" + "\n// End of file" + "\n//**************";
        return sb.toString() + xml_bit + close;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass METHOD_SET;
	public MyHelperClass PATTERN_STREAM_PROTO_VERSION;
	public MyHelperClass METHOD_GET;
	public MyHelperClass PATTERN_STREAM_XML_SHORT;
public MyHelperClass getMethodName(MyHelperClass o0, Member o1){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass getJTypeFactory(){ return null; }
	public MyHelperClass getJavaType(MyHelperClass o0){ return null; }}

class EmeraldjbBean {

}

class EmeraldjbException extends Exception{
	public EmeraldjbException(String errorMessage) { super(errorMessage); }
}

class Entity {

public MyHelperClass getPatternValue(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getMembers(){ return null; }
	public MyHelperClass getPatternBooleanValue(MyHelperClass o0, boolean o1){ return null; }}

class DaoValuesGenerator {

public MyHelperClass getPackageName(EmeraldjbBean o0){ return null; }
	public MyHelperClass getClassName(Entity o0){ return null; }}

class Member {

public MyHelperClass getType(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass isNullAllowed(){ return null; }
	public MyHelperClass getColLen(){ return null; }}

class JTypeBase {

public MyHelperClass getFromXmlCode(String o0, String o1, String o2){ return null; }
	public MyHelperClass getToXmlCode(String o0, String o1, String o2){ return null; }}
