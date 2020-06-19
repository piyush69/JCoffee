import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1910796 {
public MyHelperClass makeClass(MyHelperClass o0){ return null; }
public MyHelperClass packageClassNamesList;
	public MyHelperClass iTYPE;
	public MyHelperClass packageClassList;
	public MyHelperClass classIcon;
	public MyHelperClass prevPackagePath;
	public MyHelperClass FileFuncs;
	public MyHelperClass JOptionPane;
	public MyHelperClass iNAME;
	public MyHelperClass fields;
	public MyHelperClass classY;
	public MyHelperClass shapeList;
	public MyHelperClass classX;
	public MyHelperClass IconEditor;
	public MyHelperClass boundingbox;
	public MyHelperClass ci;
	public MyHelperClass iVALUE;
	public MyHelperClass ports;
	public MyHelperClass dbrClassFields;
	public MyHelperClass getPackageFile(){ return null; }
	public MyHelperClass getShapesInXML(boolean o0){ return null; }
	public MyHelperClass checkPackage(){ return null; }

    public void saveToPackage()  throws Throwable {
        boolean inPackage = false;
        MyHelperClass IconEditor = new MyHelperClass();
        String className =(String)(Object) IconEditor.className;
        if (!(Boolean)(Object)checkPackage()) {
            JOptionPane.showMessageDialog(this, "No package selected. Aborting.", "Package not selected!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        File iconFile = new File(getPackageFile().getParent() + File.separator + classIcon);
        File prevIconFile = new File(prevPackagePath + File.separator + classIcon);
        if ((IconEditor.getClassIcon() == null) || !prevIconFile.exists()) {
            IconEditor.setClassIcon("default.gif");
        } else if (prevIconFile.exists() && (prevIconFile.compareTo(iconFile) != 0)) {
            FileFuncs.copyImageFile(prevIconFile, iconFile);
        }
        ci =(MyHelperClass)(Object) new ClassImport(getPackageFile(), packageClassNamesList, packageClassList);
        for (int i = 0; i < (int)(Object)packageClassList.size(); i++) {
            if (className.equalsIgnoreCase((String)(Object)packageClassList.get(i).getName())) {
                inPackage = true;
                classX =(MyHelperClass)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object) 0 - (int)(Object)classX;
                classY =(MyHelperClass)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object) 0 - (int)(Object)classY;
                shapeList.shift(classX, classY);
                packageClassList.get(i).setBoundingbox(boundingbox);
                packageClassList.get(i).setDescription(IconEditor.classDescription);
                if (IconEditor.getClassIcon() == null) {
                    packageClassList.get(i).setIconName("default.gif");
                } else {
                    packageClassList.get(i).setIconName(IconEditor.getClassIcon());
                }
                packageClassList.get(i).setIsRelation(IconEditor.classIsRelation);
                packageClassList.get(i).setName(IconEditor.className);
                packageClassList.get(i).setPorts(ports);
                packageClassList.get(i).shiftPorts(classX, classY);
                packageClassList.get(i).setShapeList(shapeList);
                if (dbrClassFields != null &&(int)(Object) dbrClassFields.getRowCount() > 0) {
                    fields.clear();
                    for (int j = 0; j < (int)(Object)dbrClassFields.getRowCount(); j++) {
                        String fieldName =(String)(Object) dbrClassFields.getValueAt(j, iNAME);
                        String fieldType =(String)(Object) dbrClassFields.getValueAt(j, iTYPE);
                        String fieldValue =(String)(Object) dbrClassFields.getValueAt(j, iVALUE);
                        ClassField field = new ClassField(fieldName, fieldType, fieldValue);
                        fields.add(field);
                    }
                }
                packageClassList.get(i).setFields(fields);
                packageClassList.add((ClassField)(Object)packageClassList.get(i));
                packageClassList.remove(i);
                break;
            }
        }
        try {
            BufferedReader in = new BufferedReader(new FileReader((String)(Object)getPackageFile()));
            String str;
            StringBuffer content = new StringBuffer();
            while ((str = in.readLine()) != null) {
                if (inPackage && str.trim().startsWith("<class")) {
                    break;
                } else if (!inPackage) {
                    if (str.equalsIgnoreCase("</package>")) break;
                    content.append(str + "\n");
                } else if (inPackage) content.append(str + "\n");
            }
            if (!inPackage) {
                content.append(getShapesInXML(false));
            } else {
                for (int i = 0; i < (int)(Object)packageClassList.size(); i++) {
                    classX =(MyHelperClass)(Object) 0;
                    classY =(MyHelperClass)(Object) 0;
                    makeClass(packageClassList.get(i));
                    content.append(getShapesInXML(false));
                }
            }
            content.append("</package>");
            in.close();
            File javaFile = new File(getPackageFile().getParent() + File.separator + className + ".java");
            File prevJavaFile = new File(prevPackagePath + File.separator + className + ".java");
            int overwriteFile =(int)(Object) JOptionPane.YES_OPTION;
            if (javaFile.exists()) {
                overwriteFile =(int)(Object) JOptionPane.showConfirmDialog(null, "Java class already exists. Overwrite?");
            }
            if (overwriteFile != (int)(Object)JOptionPane.CANCEL_OPTION) {
                FileOutputStream out = new FileOutputStream(new File((String)(Object)getPackageFile().getAbsolutePath()));
                out.write(content.toString().getBytes());
                out.flush();
                out.close();
                if (overwriteFile == (int)(Object)JOptionPane.YES_OPTION) {
                    String fileText = null;
                    if (prevJavaFile.exists()) {
                        fileText =(String)(Object) FileFuncs.getFileContents(prevJavaFile);
                    } else {
                        fileText = "class " + className + " {";
                        fileText += "\n    /*@ specification " + className + " {\n";
                        for (int i = 0; i < (int)(Object)dbrClassFields.getRowCount(); i++) {
                            String fieldName =(String)(Object) dbrClassFields.getValueAt(i, iNAME);
                            String fieldType =(String)(Object) dbrClassFields.getValueAt(i, iTYPE);
                            if (fieldType != null) {
                                fileText += "    " + fieldType + " " + fieldName + ";\n";
                            }
                        }
                        fileText += "    }@*/\n \n}";
                    }
                    FileFuncs.writeFile(javaFile, fileText);
                }
                JOptionPane.showMessageDialog(null, "Saved to package: " + getPackageFile().getName(), "Saved", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass classDescription;
	public MyHelperClass classIsRelation;
	public MyHelperClass WARNING_MESSAGE;
	public MyHelperClass YES_OPTION;
	public MyHelperClass CANCEL_OPTION;
	public MyHelperClass INFORMATION_MESSAGE;
	public MyHelperClass className;
public MyHelperClass getFileContents(File o0){ return null; }
	public MyHelperClass setIconName(MyHelperClass o0){ return null; }
	public MyHelperClass setBoundingbox(MyHelperClass o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass writeFile(File o0, String o1){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass setName(MyHelperClass o0){ return null; }
	public MyHelperClass getParent(){ return null; }
	public MyHelperClass getRowCount(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass setIconName(String o0){ return null; }
	public MyHelperClass setIsRelation(MyHelperClass o0){ return null; }
	public MyHelperClass showMessageDialog(Object o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass setDescription(MyHelperClass o0){ return null; }
	public MyHelperClass add(ClassField o0){ return null; }
	public MyHelperClass getValueAt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass shift(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass setPorts(MyHelperClass o0){ return null; }
	public MyHelperClass setClassIcon(String o0){ return null; }
	public MyHelperClass setShapeList(MyHelperClass o0){ return null; }
	public MyHelperClass showConfirmDialog(Object o0, String o1){ return null; }
	public MyHelperClass showMessageDialog(c1910796 o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass getClassIcon(){ return null; }
	public MyHelperClass shiftPorts(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass copyImageFile(File o0, File o1){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass setFields(MyHelperClass o0){ return null; }
	public MyHelperClass clear(){ return null; }
	public MyHelperClass remove(int o0){ return null; }}

class ClassImport {

ClassImport(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){}
	ClassImport(){}}

class ClassField {

ClassField(){}
	ClassField(String o0, String o1, String o2){}}
