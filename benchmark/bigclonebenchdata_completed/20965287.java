
import java.io.UncheckedIOException;


class c20965287 {

    public float stampPerson(PEntry pe) throws SQLException {
        MyHelperClass conn = new MyHelperClass();
        conn.setAutoCommit(false);
        float result;
        try {
//            MyHelperClass conn = new MyHelperClass();
            Statement stmt =(Statement)(Object) conn.createStatement();
            ResultSet rset =(ResultSet)(Object) stmt.executeQuery("SELECT now();");
            rset.next();
            Timestamp now =(Timestamp)(Object) rset.getTimestamp("now()");
            Calendar cal =(Calendar)(Object) new GregorianCalendar();
            cal.setTime(now);
            if ((int)(Object)pe.getState() != 0) {
                for (int i = 0; i < (int)(Object)pe.getOpenItems().size(); i++) {
                    Workitem wi = (Workitem)(Workitem)(Object) pe.getOpenItems().get(i);
                    long diff =(int)(Object) now.getTime() - (int)(Object)wi.getIntime();
                    float diffp = diff * (float) 1f / (float)(Object)pe.getOpenItems().size();
                    stmt.executeUpdate("UPDATE stampzk SET outtime='" + now.getTime() + "', diff='" + diff + "', diffp='" + diffp + "' WHERE stampzkid='" + wi.getStampZkId() + "';");
                }
                rset =(ResultSet)(Object) stmt.executeQuery("SELECT intime FROM stamppersonal WHERE stamppersonalid='" + pe.getState() + "';");
                rset.next();
                long inDate =(long)(Object) rset.getLong("intime");
                long diff = ((long)(Object)now.getTime() - inDate);
                stmt.executeUpdate("UPDATE stamppersonal SET outtime='" + now.getTime() + "', diff='" + diff + "' WHERE stamppersonalid='" + pe.getState() + "';");
                stmt.executeUpdate("UPDATE personal SET stamppersonalid='0' WHERE personalnr='" + pe.getPersonalId() + "';");
                MyHelperClass Calendar = new MyHelperClass();
                stmt.executeUpdate("UPDATE personalyearworktime SET worktime=worktime+" + (float) diff / 3600000f + " WHERE year=" + cal.get(Calendar.YEAR) + " AND personalid='" + pe.getPersonalId() + "';");
//                MyHelperClass Calendar = new MyHelperClass();
                rset =(ResultSet)(Object) stmt.executeQuery("SELECT SUM(diff) AS twt FROM stamppersonal WHERE personalid='" + pe.getPersonalId() + "' AND datum='" + cal.get(Calendar.YEAR) + "-" + ((int)(Object)cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.DAY_OF_MONTH) + "';");
                rset.next();
                result = (float)(float)(Object) rset.getInt("twt") / 3600000f;
            } else {
                MyHelperClass Calendar = new MyHelperClass();
                stmt.executeUpdate("INSERT INTO stamppersonal SET personalid='" + pe.getPersonalId() + "', intime='" + now.getTime() + "', datum='" + cal.get(Calendar.YEAR) + "-" + ((int)(Object)cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.DAY_OF_MONTH) + "';");
                rset =(ResultSet)(Object) stmt.executeQuery("SELECT stamppersonalid FROM stamppersonal WHERE personalid='" + pe.getPersonalId() + "' AND outtime='0' ORDER BY stamppersonalid DESC LIMIT 1;");
                rset.next();
                int sppid =(int)(Object) rset.getInt("stamppersonalid");
                stmt.executeUpdate("UPDATE personal SET stamppersonalid='" + sppid + "' WHERE personalnr='" + pe.getPersonalId() + "';");
                Calendar yest =(Calendar)(Object) new GregorianCalendar();
                yest.setTime(now);
//                MyHelperClass Calendar = new MyHelperClass();
                yest.add(Calendar.DAY_OF_YEAR, -1);
//                MyHelperClass Calendar = new MyHelperClass();
                rset =(ResultSet)(Object) stmt.executeQuery("SELECT SUM(diff) AS twt FROM stamppersonal WHERE personalid='" + pe.getPersonalId() + "' AND datum='" + cal.get(Calendar.YEAR) + "-" + ((int)(Object)cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.DAY_OF_MONTH) + "';");
                rset.next();
                float today = (float)(float)(Object) rset.getInt("twt") / 3600000f;
//                MyHelperClass Calendar = new MyHelperClass();
                rset =(ResultSet)(Object) stmt.executeQuery("SELECT worktime FROM personalyearworktime WHERE personalid='" + pe.getPersonalId() + "' AND year='" + cal.get(Calendar.YEAR) + "';");
                rset.next();
                float ist =(float)(Object) rset.getFloat("worktime") - today;
//                MyHelperClass Calendar = new MyHelperClass();
                rset =(ResultSet)(Object) stmt.executeQuery("SELECT duetime FROM dueworktime WHERE datum='" + yest.get(Calendar.YEAR) + "-" + ((int)(Object)yest.get(Calendar.MONTH) + 1) + "-" + yest.get(Calendar.DAY_OF_MONTH) + "' AND personalid='" + pe.getPersonalId() + "';");
                rset.next();
                result = ist - (float)(Object)rset.getFloat("duetime");
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
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DAY_OF_YEAR;
	public MyHelperClass YEAR;
	public MyHelperClass MONTH;
	public MyHelperClass DAY_OF_MONTH;
public MyHelperClass commit(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class PEntry {

public MyHelperClass getState(){ return null; }
	public MyHelperClass getOpenItems(){ return null; }
	public MyHelperClass getPersonalId(){ return null; }}

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

class Calendar {

public MyHelperClass add(MyHelperClass o0, int o1){ return null; }
	public MyHelperClass get(MyHelperClass o0){ return null; }
	public MyHelperClass setTime(Timestamp o0){ return null; }}

class GregorianCalendar {

}

class Workitem {

public MyHelperClass getIntime(){ return null; }
	public MyHelperClass getStampZkId(){ return null; }}
