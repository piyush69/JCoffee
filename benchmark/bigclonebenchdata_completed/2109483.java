import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2109483 {
public MyHelperClass coerceToPathname(LispObject o0){ return null; }

//    @Override
    public LispObject execute(LispObject first, LispObject second) throws Throwable, ConditionThrowable(Throwable)(Object) {
        Pathname zipfilePathname = coerceToPathname(first);
        byte[] buffer = new byte[4096];
        try {
            String zipfileNamestring = zipfilePathname.getNamestring();
            if (zipfileNamestring == null) return error(new SimpleError("Pathname has no namestring: " + zipfilePathname.writeToString()));
            ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipfileNamestring));
            LispObject list = second;
            MyHelperClass NIL = new MyHelperClass();
            while (list != (LispObject)(Object)NIL) {
                Pathname pathname = coerceToPathname(list.CAR());
                String namestring = pathname.getNamestring();
                if (namestring == null) {
                    out.close();
                    File zipfile = new File(zipfileNamestring);
                    zipfile.delete();
                    return error(new SimpleError("Pathname has no namestring: " + pathname.writeToString()));
                }
                File file = new File(namestring);
                FileInputStream in = new FileInputStream(file);
                ZipEntry entry = new ZipEntry(file.getName());
                out.putNextEntry(entry);
                int n;
                while ((n = in.read(buffer)) > 0) out.write(buffer, 0, n);
                out.closeEntry();
                in.close();
                list = list.CDR();
            }
            out.close();
        } catch (IOException e) {
            return error(new LispError(e.getMessage()));
        }
        return(LispObject)(Object) zipfilePathname;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class LispObject {

public MyHelperClass CDR(){ return null; }
	public MyHelperClass CAR(){ return null; }}

class ConditionThrowable {

}

class Pathname {

public MyHelperClass writeToString(){ return null; }
	public MyHelperClass getNamestring(){ return null; }}

class SimpleError {

}

class ZipOutputStream {

ZipOutputStream(){}
	ZipOutputStream(FileOutputStream o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}

class LispError {

LispError(String o0){}
	LispError(){}}
