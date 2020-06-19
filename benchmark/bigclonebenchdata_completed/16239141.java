


class c16239141 {

    private void renameTo(File from, File to) {
        if (!(Boolean)(Object)from.exists()) return;
        if ((boolean)(Object)to.exists()) to.delete();
        boolean worked = false;
        try {
            worked =(boolean)(Object) from.renameTo(to);
        } catch (Exception e) {
            MyHelperClass database = new MyHelperClass();
            database.logError(this, "" + e, null);
        }
        if (!worked) {
            MyHelperClass database = new MyHelperClass();
            database.logWarning(this, "Could not rename GEDCOM to " + to.getAbsolutePath(), null);
            try {
                to.delete();
                final FileReader in = new FileReader(from);
                final FileWriter out = new FileWriter(to);
                int c;
                while ((c =(int)(Object) in.read()) != -1) out.write(c);
                in.close();
                out.close();
                from.delete();
            } catch (Exception e) {
//                MyHelperClass database = new MyHelperClass();
                database.logError(this, "" + e, null);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass logError(c16239141 o0, String o1, Object o2){ return null; }
	public MyHelperClass logWarning(c16239141 o0, String o1, Object o2){ return null; }}

class File {

public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass renameTo(File o0){ return null; }}

class FileReader {

FileReader(File o0){}
	FileReader(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}
