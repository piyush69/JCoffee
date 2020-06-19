import java.io.*;
import java.lang.*;
import java.util.*;



class c15822137 {
public MyHelperClass[] entries;
public MyHelperClass rangeShift;
	public MyHelperClass searchRange;
//	public MyHelperClass entries;
	public MyHelperClass version;
	public MyHelperClass numTables;
	public MyHelperClass entrySelector;

    public void TableDirectory(RandomAccessFile raf) throws IOException {
        version =(MyHelperClass)(Object) raf.readInt();
        numTables =(MyHelperClass)(Object) raf.readShort();
        searchRange =(MyHelperClass)(Object) raf.readShort();
        entrySelector =(MyHelperClass)(Object) raf.readShort();
        rangeShift =(MyHelperClass)(Object) raf.readShort();
        entries =(MyHelperClass[])(Object) new DirectoryEntry[(int)(Object)numTables];
        for (int i = 0; i < (int)(Object)numTables; i++) {
            entries[i] =(MyHelperClass)(Object) new DirectoryEntry(raf);
        }
        boolean modified = true;
        while (modified) {
            modified = false;
            for (int i = 0; i <(int)(Object) numTables - 1; i++) {
                if ((int)(Object)entries[i].getOffset() > (int)(Object)entries[i + 1].getOffset()) {
                    DirectoryEntry temp =(DirectoryEntry)(Object) entries[i];
                    entries[i] = entries[i + 1];
                    entries[i + 1] =(MyHelperClass)(Object) temp;
                    modified = true;
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getOffset(){ return null; }}

class DirectoryEntry {

DirectoryEntry(RandomAccessFile o0){}
	DirectoryEntry(){}}
