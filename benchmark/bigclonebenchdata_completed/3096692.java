import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3096692 {

    public static void perform(ChangeSet changes, ArchiveInputStream in, ArchiveOutputStream out) throws Throwable, IOException {
        ArchiveEntry entry = null;
        while ((entry =(ArchiveEntry)(Object) in.getNextEntry()) != null) {
            System.out.println(entry.getName());
            boolean copy = true;
            for (Iterator it =(Iterator)(Object) changes.asSet().iterator(); it.hasNext(); ) {
                Change change = (Change) it.next();
                MyHelperClass ChangeSet = new MyHelperClass();
                if (change.type() == ChangeSet.CHANGE_TYPE_DELETE) {
                    DeleteChange delete = ((DeleteChange)(DeleteChange)(Object) change);
                    if (entry.getName() != null && entry.getName().equals(delete.targetFile())) {
                        copy = false;
                    }
                }
            }
            if (copy) {
                System.out.println("Copy: " + entry.getName());
                long size =(long)(Object) entry.getSize();
                out.putArchiveEntry(entry);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy((InputStream)(InputStream)(Object) in, out, (int) size);
                out.closeArchiveEntry();
            }
            System.out.println("---");
        }
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CHANGE_TYPE_DELETE;
public MyHelperClass copy(InputStream o0, ArchiveOutputStream o1, int o2){ return null; }
	public MyHelperClass iterator(){ return null; }}

class ChangeSet {

public MyHelperClass asSet(){ return null; }}

class ArchiveInputStream {

public MyHelperClass getNextEntry(){ return null; }}

class ArchiveOutputStream {

public MyHelperClass putArchiveEntry(ArchiveEntry o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass closeArchiveEntry(){ return null; }}

class ArchiveEntry {

public MyHelperClass getSize(){ return null; }
	public MyHelperClass getName(){ return null; }}

class Change {

public MyHelperClass type(){ return null; }}

class DeleteChange {

public MyHelperClass targetFile(){ return null; }}
