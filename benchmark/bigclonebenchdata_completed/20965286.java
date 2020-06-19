
import java.io.UncheckedIOException;


class c20965286 {

    public void openAndClose(ZKEntry zke, LinkedList toOpen, LinkedList toRemove) throws SQLException {
        MyHelperClass conn = new MyHelperClass();
        conn.setAutoCommit(false);
        try {
//            MyHelperClass conn = new MyHelperClass();
            Statement stm =(Statement)(Object) conn.createStatement();
            ResultSet rset =(ResultSet)(Object) stm.executeQuery("SELECT now();");
            rset.next();
            Timestamp now =(Timestamp)(Object) rset.getTimestamp("now()");
            for (int i = 0; i < (int)(Object)toRemove.size(); i++) {
                Workitem wi = (Workitem)(Workitem)(Object) toRemove.get(i);
                rset =(ResultSet)(Object) stm.executeQuery("SELECT intime, part FROM stampzk WHERE stampzkid = '" + wi.getStampZkId() + "';");
                rset.next();
                long diff =(int)(Object) now.getTime() - (int)(Object)rset.getLong("intime");
                float diffp = diff * (long)(Object)rset.getFloat("part");
                stm.executeUpdate("UPDATE stampzk SET outtime='" + now.getTime() + "', diff='" + diff + "', diffp='" + diffp + "' WHERE stampzkid='" + wi.getStampZkId() + "';");
            }
            rset =(ResultSet)(Object) stm.executeQuery("SELECT COUNT(*) FROM stampzk WHERE personalid='" + zke.getWorker().getPersonalId() + "' AND outtime='0';");
            rset.next();
            int count =(int)(Object) rset.getInt("COUNT(*)") + (int)(Object)toOpen.size();
            rset =(ResultSet)(Object) stm.executeQuery("SELECT * FROM stampzk WHERE personalid='" + zke.getWorker().getPersonalId() + "' AND outtime='0';");
            while ((boolean)(Object)rset.next()) {
                long diff =(int)(Object) now.getTime() - (int)(Object)rset.getLong("intime");
                float diffp = diff * (long)(Object)rset.getFloat("part");
                int firstId =(int)(Object) rset.getInt("firstid");
                if (firstId == 0) firstId =(int)(Object) rset.getInt("stampzkid");
//                MyHelperClass conn = new MyHelperClass();
                Statement ust =(Statement)(Object) conn.createStatement();
                ust.executeUpdate("UPDATE stampzk SET outtime='" + now.getTime() + "', diff='" + diff + "', diffp='" + diffp + "' WHERE stampzkid='" + rset.getInt("stampzkid") + "';");
                ust.executeUpdate("INSERT INTO stampzk SET zeitkid='" + rset.getInt("zeitkid") + "', personalid='" + zke.getWorker().getPersonalId() + "', funcsid='" + rset.getInt("funcsid") + "', part='" + (float) 1f / count + "', intime='" + now.getTime() + "', firstid='" + firstId + "';");
            }
            for (int i = 0; i < (int)(Object)toOpen.size(); i++) {
                stm.executeUpdate("INSERT INTO stampzk SET zeitkid='" + zke.getZeitKId() + "', personalid='" + zke.getWorker().getPersonalId() + "', intime='" + now.getTime() + "', funcsid='" + ((Workitem)(Workitem)(Object) toOpen.get(i)).getWorkType() + "', part='" + (float) 1f / count + "';");
            }
        } catch (UncheckedIOException sqle) {
//            MyHelperClass conn = new MyHelperClass();
            conn.rollback();
//            MyHelperClass conn = new MyHelperClass();
            conn.setAutoCommit(true);
            throw sqle;
        }
//        MyHelperClass conn = new MyHelperClass();
        conn.commit();
//        MyHelperClass conn = new MyHelperClass();
        conn.setAutoCommit(true);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass getPersonalId(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class ZKEntry {

public MyHelperClass getWorker(){ return null; }
	public MyHelperClass getZeitKId(){ return null; }}

class LinkedList {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class ResultSet {

public MyHelperClass next(){ return null; }
	public MyHelperClass getTimestamp(String o0){ return null; }
	public MyHelperClass getLong(String o0){ return null; }
	public MyHelperClass getInt(String o0){ return null; }
	public MyHelperClass getFloat(String o0){ return null; }}

class Timestamp {

public MyHelperClass getTime(){ return null; }}

class Workitem {

public MyHelperClass getStampZkId(){ return null; }
	public MyHelperClass getWorkType(){ return null; }}
