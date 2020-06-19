import java.io.*;
import java.lang.*;
import java.util.*;



class c16908849 {
public static MyHelperClass NULL;
//public MyHelperClass NULL;

    public static void changeStructure(double version) throws DException {
        try {
            Class cl = Class.forName("com.daffodilwoods.daffodildb.server.datadictionarysystem.SystemTablesCreator");
            java.net.URL urlw = cl.getResource("/com/daffodilwoods/daffodildb/server/datadictionarysystem/systemtablesStructure.obj");
            ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(urlw.openStream()));
            HashMap structureMap =(HashMap)(Object) NULL; //new HashMap();
            structureMap = (HashMap) ois.readObject();
            if (version >= 3.4) {
                MyHelperClass SystemTables = new MyHelperClass();
                Object[][] columnsTableStructure = (Object[][]) structureMap.get((Object) SystemTables.columns_TableName);
                columnsTableStructure[9][2] = new Integer(1027);
            }
            ois.close();
        } catch (IOException ex) {
        } catch (ClassNotFoundException ex) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass columns_TableName;
public MyHelperClass get(Object o0){ return null; }}

class DException extends Exception{
	public DException(String errorMessage) { super(errorMessage); }
}
