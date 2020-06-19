
import java.io.UncheckedIOException;


class c316364 {

    public void addFinance(int clubid, int quarterid, String date, String desc, String loc, BigDecimal amount) throws FinanceException, SQLException {
        String budgetQuery = "SELECT used, available FROM Budget WHERE club_id=" + clubid + " and quarter_id=" + quarterid + ";";
        String financeUpdate = "INSERT INTO Finance (`club_id`, `transaction_date`, `description`, `location`, `amount`) VALUES ('" + clubid + "', '" + date + "', '" + desc + "', '" + "', '" + loc + "', '" + amount + "');";
        Budget b = new Budget();
        try {
            MyHelperClass cn = new MyHelperClass();
            cn.setAutoCommit(false);
//            MyHelperClass cn = new MyHelperClass();
            Statement sm =(Statement)(Object) cn.createStatement();
            ResultSet rs =(ResultSet)(Object) sm.executeQuery(budgetQuery);
            if ((boolean)(Object)rs.first()) {
                b.used = rs.getBigDecimal(1);
                b.available = rs.getBigDecimal(2);
            } else {
                throw new FinanceException("No budget exists for this club!!");
            }
            if ((int)(Object)b.available.compareTo(amount.negate()) >= 0) {
                if (amount.equals(new BigDecimal(0))) ;
                {
                    b.used = b.used.subtract(amount);
                }
                b.available = b.available.add(amount);
//                MyHelperClass cn = new MyHelperClass();
                sm =(Statement)(Object) cn.createStatement();
                sm.executeUpdate(financeUpdate);
//                MyHelperClass cn = new MyHelperClass();
                sm =(Statement)(Object) cn.createStatement();
                sm.executeUpdate("Update Budget SET used = " + b.used + ", amount = " + b.available + " WHERE club_id=" + clubid + " and quarter_id=" + quarterid + ";");
//                MyHelperClass cn = new MyHelperClass();
                cn.commit();
            } else {
                throw new FinanceException("The proposed expenditure is not within the club's budget.");
            }
        } catch (UncheckedIOException e) {
            MyHelperClass cn = new MyHelperClass();
            cn.rollback();
            throw e;
        } finally {
            MyHelperClass cn = new MyHelperClass();
            cn.setAutoCommit(true);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass subtract(BigDecimal o0){ return null; }
	public MyHelperClass add(BigDecimal o0){ return null; }
	public MyHelperClass compareTo(MyHelperClass o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class BigDecimal {

BigDecimal(int o0){}
	BigDecimal(){}
	public MyHelperClass negate(){ return null; }}

class FinanceException extends Exception{
	public FinanceException(String errorMessage) { super(errorMessage); }
}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Budget {
public MyHelperClass available;
	public MyHelperClass used;
}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class ResultSet {

public MyHelperClass first(){ return null; }
	public MyHelperClass getBigDecimal(int o0){ return null; }}
