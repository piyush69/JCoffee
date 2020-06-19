import java.io.*;
import java.lang.*;
import java.util.*;



class c19392404 {
public MyHelperClass getConnection(){ return null; }

    public boolean setSchedule(Schedule s) {
        PreparedStatement pst1 = null;
        PreparedStatement pst2 = null;
        PreparedStatement pst3 = null;
        ResultSet rs2 = null;
        boolean retVal = true;
        try {
            MyHelperClass conn = new MyHelperClass();
            conn = getConnection();
//            MyHelperClass conn = new MyHelperClass();
            pst1 =(PreparedStatement)(Object) conn.prepareStatement("INSERT INTO timetable (recipe_id, time, meal) VALUES (?, ?, ?);");
//            MyHelperClass conn = new MyHelperClass();
            pst2 =(PreparedStatement)(Object) conn.prepareStatement("SELECT * FROM timetable WHERE time BETWEEN ? AND ?");
//            MyHelperClass conn = new MyHelperClass();
            pst3 =(PreparedStatement)(Object) conn.prepareStatement("DELETE FROM timetable WHERE time = ? AND meal = ? AND recipe_id = ?");
            long dateInMillis =(long)(Object) s.getDate().getTime();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:sss");
            Date beginDate = null, endDate = null;
            try {
                String temp =(String)(Object) sdf.format(new java.util.Date(dateInMillis));
                sdf.applyPattern("yyyy-MM-dd");
                java.util.Date temppidate =(Date)(Object) sdf.parse(temp);
                beginDate = new Date(temppidate.getTime());
                endDate = new Date(temppidate.getTime() + (24 * 3600 * 1000));
            } catch (Exception e) {
                System.out.println("Ollos virhe saapunut, siks ohjelmamme kaatunut! --Vanha kalevalalainen sananlasku--");
                e.printStackTrace();
            }
            pst2.setDate(1, beginDate);
            pst2.setDate(2, endDate);
            rs2 =(ResultSet)(Object) pst2.executeQuery();
            MyHelperClass MainFrame = new MyHelperClass();
            MainFrame.appendStatusText("Poistetaan p�iv�n \"" + s.getDate() + "\" vanhat reseptit kannasta");
            while ((boolean)(Object)rs2.next()) {
                pst3.clearParameters();
                pst3.setTimestamp(1, rs2.getTimestamp("time"));
                pst3.setInt(2,(int)(Object) rs2.getInt("meal"));
                pst3.setInt(3,(int)(Object) rs2.getInt("recipe_id"));
                pst3.executeUpdate();
            }
            if (s.getBreakfast() != null) {
//                MyHelperClass MainFrame = new MyHelperClass();
                MainFrame.appendStatusText("Lis�t��n aamupala \"" + s.getBreakfast().getName() + "\"");
                pst1.clearParameters();
                pst1.setInt(1,(int)(Object) s.getBreakfast().getId());
                pst1.setTimestamp(2,(MyHelperClass)(Object) new Timestamp(s.getDate().getTime()));
                pst1.setInt(3, 1);
                pst1.executeUpdate();
            }
            if (s.getLunch() != null) {
//                MyHelperClass MainFrame = new MyHelperClass();
                MainFrame.appendStatusText("Lis�t��n lounas \"" + s.getLunch().getName() + "\"");
                pst1.clearParameters();
                pst1.setInt(1,(int)(Object) s.getLunch().getId());
                pst1.setTimestamp(2,(MyHelperClass)(Object) new Timestamp(s.getDate().getTime()));
                pst1.setInt(3, 2);
                pst1.executeUpdate();
            }
            if (s.getSnack() != null) {
//                MyHelperClass MainFrame = new MyHelperClass();
                MainFrame.appendStatusText("Lis�t��n v�lipala \"" + s.getSnack().getName() + "\"");
                pst1.clearParameters();
                pst1.setInt(1,(int)(Object) s.getSnack().getId());
                pst1.setTimestamp(2,(MyHelperClass)(Object) new Timestamp(s.getDate().getTime()));
                pst1.setInt(3, 3);
                pst1.executeUpdate();
            }
            if (s.getDinner() != null) {
//                MyHelperClass MainFrame = new MyHelperClass();
                MainFrame.appendStatusText("Lis�t��n p�iv�llinen \"" + s.getDinner().getName() + "\"");
                pst1.clearParameters();
                pst1.setInt(1,(int)(Object) s.getDinner().getId());
                pst1.setTimestamp(2,(MyHelperClass)(Object) new Timestamp(s.getDate().getTime()));
                pst1.setInt(3, 4);
                pst1.executeUpdate();
            }
            if (s.getSupper() != null) {
//                MyHelperClass MainFrame = new MyHelperClass();
                MainFrame.appendStatusText("Lis�t��n illallinen \"" + s.getSupper().getName() + "\"");
                pst1.clearParameters();
                pst1.setInt(1,(int)(Object) s.getSupper().getId());
                pst1.setTimestamp(2,(MyHelperClass)(Object) new Timestamp(s.getDate().getTime()));
                pst1.setInt(3, 5);
                pst1.executeUpdate();
            }
//            MyHelperClass conn = new MyHelperClass();
            conn.commit();
        } catch (Exception e) {
            try {
                MyHelperClass conn = new MyHelperClass();
                conn.rollback();
            } catch (UncheckedIOException e1) {
                MyHelperClass MainFrame = new MyHelperClass();
                MainFrame.appendStatusText("Aterioiden lis�ys ep�onnistui");
                e1.printStackTrace();
            }
            MyHelperClass MainFrame = new MyHelperClass();
            MainFrame.appendStatusText("Can't add schedule, the exception was " + e.getMessage());
        } finally {
            try {
                if (rs2 != null) rs2.close();
                rs2 = null;
                if (pst1 != null) pst1.close();
                pst1 = null;
                if (pst2 != null) pst2.close();
                pst2 = null;
            } catch (UncheckedIOException sqle) {
                MyHelperClass MainFrame = new MyHelperClass();
                MainFrame.appendStatusText("Can't close database connection.");
            }
        }
        return retVal;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass rollback(){ return null; }
	public MyHelperClass getTime(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass appendStatusText(String o0){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass getId(){ return null; }}

class Schedule {

public MyHelperClass getLunch(){ return null; }
	public MyHelperClass getDinner(){ return null; }
	public MyHelperClass getDate(){ return null; }
	public MyHelperClass getSupper(){ return null; }
	public MyHelperClass getSnack(){ return null; }
	public MyHelperClass getBreakfast(){ return null; }}

class PreparedStatement {

public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setTimestamp(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setDate(int o0, Date o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass clearParameters(){ return null; }}

class ResultSet {

public MyHelperClass getTimestamp(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getInt(String o0){ return null; }
	public MyHelperClass next(){ return null; }}

class SimpleDateFormat {

SimpleDateFormat(String o0){}
	SimpleDateFormat(){}
	public MyHelperClass applyPattern(String o0){ return null; }
	public MyHelperClass parse(String o0){ return null; }
	public MyHelperClass format(Date o0){ return null; }}

class Timestamp {

Timestamp(){}
	Timestamp(MyHelperClass o0){}}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
