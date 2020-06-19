import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1235581 {
public MyHelperClass getStringNull(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getString(MyHelperClass o0){ return null; }
public int iPendingAtoms;
public MyHelperClass DebugFile;
	public MyHelperClass DB;
	public MyHelperClass oFileStr;
	public MyHelperClass oReplacer;
//	public MyHelperClass iPendingAtoms;
	public MyHelperClass bHasReplacements;
	public MyHelperClass getProperty(String o0){ return null; }
	public MyHelperClass getParameter(String o0){ return null; }

    public Object process(Atom oAtm) throws Throwable, IOException {
        File oFile;
        FileReader oFileRead;
        String sPathHTML;
        char cBuffer[];
        Object oReplaced;
        final String sSep = System.getProperty("file.separator");
        MyHelperClass DebugFile = new MyHelperClass();
        if ((boolean)(Object)DebugFile.trace) {
            MyHelperClass DB = new MyHelperClass();
            DebugFile.writeln("Begin FileDumper.process([Job:" + getStringNull(DB.gu_job, "") + ", Atom:" + String.valueOf(oAtm.getInt(DB.pg_atom)) + "])");
//            MyHelperClass DebugFile = new MyHelperClass();
            DebugFile.incIdent();
        }
        MyHelperClass bHasReplacements = new MyHelperClass();
        if ((boolean)(Object)bHasReplacements) {
            sPathHTML =(String)(Object) getProperty("workareasput");
            if (!sPathHTML.endsWith(sSep)) sPathHTML += sSep;
            sPathHTML += getParameter("gu_workarea") + sSep + "apps" + sSep + "Mailwire" + sSep + "html" + sSep + getParameter("gu_pageset") + sSep;
            sPathHTML += getParameter("nm_pageset").replace(' ', '_') + ".html";
            if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("PathHTML = " + sPathHTML);
            oReplaced = oReplacer.replace((char)(Object)sPathHTML,(char)(Object) oAtm.getItemMap());
            bHasReplacements = ((MyHelperClass)(Object)(int)(Object)(MyHelperClass)(Object)(int)(Object)(MyHelperClass)(Object)(int)(Object)(MyHelperClass)(Object)(int)(Object)oReplacer.lastReplacements() > 0);
        } else {
            oReplaced = null;
            if (null != oFileStr) oReplaced = oFileStr.get();
            if (null == oReplaced) {
                sPathHTML =(String)(Object) getProperty("workareasput");
                if (!sPathHTML.endsWith(sSep)) sPathHTML += sSep;
                sPathHTML += getParameter("gu_workarea") + sSep + "apps" + sSep + "Mailwire" + sSep + "html" + sSep + getParameter("gu_pageset") + sSep + getParameter("nm_pageset").replace(' ', '_') + ".html";
                if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("PathHTML = " + sPathHTML);
                oFile = new File(sPathHTML);
                cBuffer = new char[new Long(oFile.length()).intValue()];
                oFileRead = new FileReader(oFile);
                oFileRead.read(cBuffer);
                oFileRead.close();
                if ((boolean)(Object)DebugFile.trace) DebugFile.writeln(String.valueOf(cBuffer.length) + " characters readed");
                oReplaced = new String(cBuffer);
                oFileStr =(MyHelperClass)(Object) new SoftReference(oReplaced);
            }
        }
        String sPathJobDir =(String)(Object) getProperty("storage");
        if (!sPathJobDir.endsWith(sSep)) sPathJobDir += sSep;
        sPathJobDir += "jobs" + sSep + getParameter("gu_workarea") + sSep + getString(DB.gu_job) + sSep;
        FileWriter oFileWrite = new FileWriter(sPathJobDir + getString(DB.gu_job) + "_" + String.valueOf(oAtm.getInt(DB.pg_atom)) + ".html", true);
        oFileWrite.write((String) oReplaced);
        oFileWrite.close();
        iPendingAtoms--;
        if ((boolean)(Object)DebugFile.trace) {
            DebugFile.writeln("End FileDumper.process([Job:" + getStringNull(DB.gu_job, "") + ", Atom:" + String.valueOf(oAtm.getInt(DB.pg_atom)) + "])");
            DebugFile.decIdent();
        }
        return oReplaced;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass trace;
	public MyHelperClass pg_atom;
	public MyHelperClass gu_job;
public MyHelperClass lastReplacements(){ return null; }
	public MyHelperClass incIdent(){ return null; }
	public MyHelperClass decIdent(){ return null; }
	public MyHelperClass writeln(String o0){ return null; }
	public MyHelperClass replace(char o0, char o1){ return null; }
	public MyHelperClass get(){ return null; }}

class Atom {

public MyHelperClass getItemMap(){ return null; }
	public MyHelperClass getInt(MyHelperClass o0){ return null; }}

class SoftReference {

SoftReference(){}
	SoftReference(Object o0){}}
