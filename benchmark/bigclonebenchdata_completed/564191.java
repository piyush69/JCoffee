import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c564191 {
public MyHelperClass MODE_CHECKOUT;
public MyHelperClass DBSettings;
	public MyHelperClass blDepositCredit;
	public MyHelperClass cashDrawer;
	public MyHelperClass Statement;
	public MyHelperClass summary;
	public MyHelperClass dbMan;
	public MyHelperClass mBuf;
	public MyHelperClass student;
	public MyHelperClass strPOSPrefix;
	public MyHelperClass order;
	public MyHelperClass gui;
	public MyHelperClass settings;
	public MyHelperClass money;
	public MyHelperClass getStudentCredit(){ return null; }
	public MyHelperClass hasStudentCredit(){ return null; }
	public MyHelperClass getHostName(){ return null; }
	public MyHelperClass doStudentCreditUpdate(double o0, String o1){ return null; }
	public MyHelperClass round2Places(double o0){ return null; }

    private void processOrder()  throws Throwable {
        double neg = 0d;
        MyHelperClass intMode = new MyHelperClass();
        if (intMode == MODE_CHECKOUT) {
            MyHelperClass mBuf = new MyHelperClass();
            if ((int)(Object)round2Places((double)(Object)mBuf.getBufferTotal()) >= (int)(Object)round2Places((double)(Object)order.getOrderTotal())) {
                double cash, credit, allowedCredit = 0d;
                allowedCredit =(double)(Object) getStudentCredit();
                if ((int)(Object)settings.get(DBSettings.MAIN_ALLOWNEGBALANCES).compareTo("1") == 0) {
                    try {
                        neg = Double.parseDouble((String)(Object)settings.get(DBSettings.MAIN_MAXNEGBALANCE));
                    } catch (NumberFormatException ex) {
                        System.err.println("NumberFormatException::Potential problem with setting MAIN_MAXNEGBALANCE");
                        System.err.println("     * Note: If you enable negative balances, please don't leave this");
                        System.err.println("             blank.  At least set it to 0.  For right now we are setting ");
                        System.err.println("             the max negative balance to $0.00");
                        System.err.println("");
                        System.err.println("Exception Message:" + ex.getMessage());
                    }
                    if (neg < 0) neg *= -1;
                    allowedCredit += neg;
                }
                if ((int)(Object)round2Places((double)(Object)mBuf.getCredit()) <= (int)(Object)round2Places(allowedCredit)) {
                    if ((int)(Object)round2Places((double)(Object)mBuf.getCredit()) > (int)(Object)round2Places((double)(Object)getStudentCredit()) && !(Boolean)(Object)student.isStudentSet()) {
                        gui.setStatus("Can't allow negative balance on an anonymous student!", true);
                    } else {
                        if ((int)(Object)round2Places((double)(Object)mBuf.getCredit()) > (int)(Object)round2Places((double)(Object)order.getOrderTotal())) {
                            credit =(double)(Object) round2Places((double)(Object)order.getOrderTotal());
                        } else {
                            credit =(double)(Object) round2Places((double)(Object)mBuf.getCredit());
                        }
                        if (((double)(Object)mBuf.getCash() + credit) >= (double)(Object)order.getOrderTotal()) {
                            cash =(double)(Object) round2Places((double)(Object)order.getOrderTotal() - credit);
                            double change =(double)(Object) round2Places((double)(Object)mBuf.getCash() - cash);
                            if (round2Places(cash + credit) == round2Places((double)(Object)order.getOrderTotal())) {
                                Connection conn = null;
                                Statement stmt = null;
                                ResultSet rs = null;
                                try {
                                    conn =(Connection)(Object) dbMan.getPOSConnection();
                                    conn.setAutoCommit(false);
                                    stmt =(Statement)(Object) conn.createStatement();
                                    String host =(String)(Object) getHostName();
                                    String stuId =(String)(Object) student.getStudentNumber();
                                    String building =(String)(Object) settings.get(DBSettings.MAIN_BUILDING);
                                    String cashier =(String)(Object) dbMan.getPOSUser();
                                    String strSql = "insert into " + strPOSPrefix + "trans_master ( tm_studentid, tm_total, tm_cashtotal, tm_credittotal, tm_building, tm_register, tm_cashier, tm_datetime, tm_change ) values( '" + stuId + "', '" + round2Places((double)(Object)order.getOrderTotal()) + "', '" + round2Places(cash) + "', '" + round2Places(credit) + "', '" + building + "', '" + host + "', '" + cashier + "', NOW(), '" + round2Places(change) + "')";
                                    int intSqlReturnVal = -1;
                                    int masterID = -1;
                                    try {
                                        intSqlReturnVal =(int)(Object) stmt.executeUpdate(strSql, Statement.RETURN_GENERATED_KEYS);
                                        ResultSet keys =(ResultSet)(Object) stmt.getGeneratedKeys();
                                        keys.next();
                                        masterID =(int)(Object) keys.getInt(1);
                                        keys.close();
                                        stmt.close();
                                    } catch (Exception exRetKeys) {
                                        System.err.println(exRetKeys.getMessage() + " (but pscafepos is attempting a work around)");
                                        intSqlReturnVal =(int)(Object) stmt.executeUpdate(strSql);
                                        masterID =(int)(Object) dbMan.getLastInsertIDWorkAround(stmt, strPOSPrefix + "trans_master_tm_id_seq");
                                        if (masterID == -1) System.err.println("It looks like the work around failed, please submit a bug report!"); else System.err.println("work around was successful!");
                                    }
                                    if (intSqlReturnVal == 1) {
                                        if (masterID >= 0) {
                                            OrderItem[] itms =(OrderItem[])(Object) order.getOrderItems();
                                            if (itms != null && itms.length > 0) {
                                                for (int i = 0; i < itms.length; i++) {
                                                    if (itms[i] != null) {
                                                        stmt =(Statement)(Object) conn.createStatement();
                                                        int itemid =(int)(Object) itms[i].getDBID();
                                                        double itemprice =(double)(Object) round2Places((double)(Object)itms[i].getEffectivePrice());
                                                        int f, r, a;
                                                        String strItemName, strItemBuilding, strItemCat;
                                                        f = 0;
                                                        r = 0;
                                                        a = 0;
                                                        if ((boolean)(Object)itms[i].isSoldAsFree()) {
                                                            f = 1;
                                                        }
                                                        if ((boolean)(Object)itms[i].isSoldAsReduced()) {
                                                            r = 1;
                                                        }
                                                        if ((boolean)(Object)itms[i].isTypeA()) {
                                                            a = 1;
                                                        }
                                                        strItemName =(String)(Object) itms[i].getName();
                                                        strItemBuilding = (String)(String)(Object) itms[i].getBuilding();
                                                        strItemCat =(String)(Object) itms[i].getCategory();
                                                        if ((int)(Object)stmt.executeUpdate("insert into " + strPOSPrefix + "trans_item ( ti_itemid, ti_tmid, ti_pricesold, ti_registerid, ti_cashier, ti_studentid, ti_isfree, ti_isreduced, ti_datetime, ti_istypea, ti_itemname, ti_itembuilding, ti_itemcat  ) values('" + itemid + "', '" + masterID + "', '" + round2Places(itemprice) + "', '" + host + "', '" + cashier + "', '" + stuId + "', '" + f + "', '" + r + "', NOW(), '" + a + "', '" + strItemName + "', '" + strItemBuilding + "', '" + strItemCat + "')") != 1) {
                                                            gui.setCriticalMessage("Item insert failed");
                                                            conn.rollback();
                                                        }
                                                        stmt.close();
                                                        stmt =(Statement)(Object) conn.createStatement();
                                                        String sqlInv = "SELECT inv_id from " + strPOSPrefix + "inventory where inv_menuid = " + itemid + "";
                                                        if ((boolean)(Object)stmt.execute(sqlInv)) {
                                                            ResultSet rsInv =(ResultSet)(Object) stmt.getResultSet();
                                                            int delId = -1;
                                                            if ((boolean)(Object)rsInv.next()) {
                                                                delId =(int)(Object) rsInv.getInt("inv_id");
                                                            }
                                                            if (delId != -1) {
                                                                stmt.executeUpdate("delete from " + strPOSPrefix + "inventory where inv_id = " + delId);
                                                            }
                                                            stmt.close();
                                                        }
                                                    } else {
                                                        gui.setCriticalMessage("Null Item");
                                                        conn.rollback();
                                                    }
                                                }
                                                boolean blOk = true;
                                                if ((double)(Object)round2Places(credit) > 0d) {
                                                    if ((int)(Object)round2Places(allowedCredit) >= (int)(Object)round2Places(credit)) {
                                                        if ((boolean)(Object)hasStudentCredit()) {
                                                            stmt =(Statement)(Object) conn.createStatement();
                                                            if ((int)(Object)stmt.executeUpdate("update " + strPOSPrefix + "studentcredit set credit_amount = credit_amount - " + round2Places(credit) + " where credit_active = '1' and credit_studentid = '" + stuId + "'") == 1) {
                                                                stmt.close();
                                                                stmt =(Statement)(Object) conn.createStatement();
                                                                if ((int)(Object)stmt.executeUpdate("update " + strPOSPrefix + "studentcredit set credit_lastused = NOW() where credit_active = '1' and credit_studentid = '" + stuId + "'") == 1) {
                                                                    stmt.close();
                                                                    stmt =(Statement)(Object) conn.createStatement();
                                                                    if ((int)(Object)stmt.executeUpdate("insert into " + strPOSPrefix + "studentcredit_log ( scl_studentid, scl_action, scl_transid, scl_datetime ) values( '" + stuId + "', '" + round2Places((-1) * credit) + "', '" + masterID + "', NOW() )") == 1) {
                                                                        stmt.close();
                                                                        blOk = true;
                                                                    } else {
                                                                        gui.setCriticalMessage("Unable to update student credit log.");
                                                                        blOk = false;
                                                                    }
                                                                } else {
                                                                    gui.setCriticalMessage("Unable to update student credit account.");
                                                                    blOk = false;
                                                                }
                                                            } else {
                                                                gui.setCriticalMessage("Unable to update student credit account.");
                                                                blOk = false;
                                                            }
                                                        } else {
                                                            stmt =(Statement)(Object) conn.createStatement();
                                                            if ((int)(Object)stmt.executeUpdate("insert into " + strPOSPrefix + "studentcredit (credit_amount,credit_active,credit_studentid,credit_lastused) values('" + round2Places((-1) * credit) + "','1','" + stuId + "', NOW())") == 1) {
                                                                stmt.close();
                                                                stmt =(Statement)(Object) conn.createStatement();
                                                                if ((int)(Object)stmt.executeUpdate("insert into " + strPOSPrefix + "studentcredit_log ( scl_studentid, scl_action, scl_transid, scl_datetime ) values( '" + stuId + "', '" + round2Places((-1) * credit) + "', '" + masterID + "', NOW() )") == 1) {
                                                                    stmt.close();
                                                                    blOk = true;
                                                                } else {
                                                                    gui.setCriticalMessage("Unable to update student credit log.");
                                                                    blOk = false;
                                                                }
                                                            } else {
                                                                gui.setCriticalMessage("Unable to create new student credit account.");
                                                                blOk = false;
                                                            }
                                                        }
                                                    } else {
                                                        gui.setCriticalMessage("Student doesn't have enought credit.");
                                                        blOk = false;
                                                    }
                                                }
                                                if (blOk) {
                                                    if ((boolean)(Object)blDepositCredit && change > 0d) {
                                                        try {
                                                            if ((boolean)(Object)doStudentCreditUpdate(change, stuId)) {
                                                                change = 0d;
                                                            } else blOk = false;
                                                        } catch (Exception cExp) {
                                                            blOk = false;
                                                        }
                                                    }
                                                }
                                                if (blOk) {
                                                    boolean blHBOK = true;
                                                    if (itms != null && itms.length > 0) {
                                                        for (int i = 0; i < itms.length; i++) {
                                                            stmt =(Statement)(Object) conn.createStatement();
                                                            if ((boolean)(Object)stmt.execute("select count(*) from " + strPOSPrefix + "hotbar where hb_itemid = '" + itms[i].getDBID() + "' and hb_building = '" + building + "' and hb_register = '" + host + "' and hb_cashier = '" + cashier + "'")) {
                                                                rs =(ResultSet)(Object) stmt.getResultSet();
                                                                rs.next();
                                                                int num =(int)(Object) rs.getInt(1);
                                                                stmt.close();
                                                                if (num == 1) {
                                                                    stmt =(Statement)(Object) conn.createStatement();
                                                                    if ((int)(Object)stmt.executeUpdate("update " + strPOSPrefix + "hotbar set hb_count = hb_count + 1 where hb_itemid = '" + itms[i].getDBID() + "' and hb_building = '" + building + "' and hb_register = '" + host + "' and hb_cashier = '" + cashier + "'") != 1) blHBOK = false;
                                                                } else {
                                                                    stmt =(Statement)(Object) conn.createStatement();
                                                                    if ((int)(Object)stmt.executeUpdate("insert into " + strPOSPrefix + "hotbar ( hb_itemid, hb_building, hb_register, hb_cashier, hb_count ) values( '" + itms[i].getDBID() + "', '" + building + "', '" + host + "', '" + cashier + "', '1' )") != 1) blHBOK = false;
                                                                }
                                                                stmt.close();
                                                            }
                                                        }
                                                    } else blHBOK = false;
                                                    if (blHBOK) {
                                                        conn.commit();
                                                        gui.setStatus("Order Complete.");
                                                        gui.disableUI();
                                                        summary =(MyHelperClass)(Object) new PSOrderSummary(gui);
                                                        if (cashDrawer != null) cashDrawer.openDrawer(); else summary.setPOSEventListener(this);
                                                        summary.display(money.format(order.getOrderTotal()), money.format(mBuf.getCash()), money.format(credit), money.format(change), money.format(getStudentCredit()));
                                                    } else {
                                                        conn.rollback();
                                                        gui.setStatus("Failure during Hotbar update.  Transaction has been rolled back.", true);
                                                    }
                                                } else {
                                                    conn.rollback();
                                                }
                                            } else {
                                                gui.setCriticalMessage("Unable to fetch items.");
                                                conn.rollback();
                                            }
                                        } else {
                                            gui.setCriticalMessage("Unable to retrieve autoid");
                                            conn.rollback();
                                        }
                                    } else {
                                        gui.setCriticalMessage("Error During Writting of Transaction Master Record.");
                                        conn.rollback();
                                    }
                                } catch (SQLException sqlEx) {
                                    System.err.println("SQLException: " + sqlEx.getMessage());
                                    System.err.println("SQLState: " + sqlEx.getSQLState());
                                    System.err.println("VendorError: " + sqlEx.getErrorCode());
                                    try {
                                        conn.rollback();
                                    } catch (SQLException sqlEx2) {
                                        System.err.println("Rollback failed: " + sqlEx2.getMessage());
                                    }
                                } catch (Exception e) {
                                    System.err.println("Exception: " + e.getMessage());
                                    System.err.println(e);
                                    try {
                                        conn.rollback();
                                    } catch (SQLException sqlEx2) {
                                        System.err.println("Rollback failed: " + sqlEx2.getMessage());
                                    }
                                } finally {
                                    if (rs != null) {
                                        try {
                                            rs.close();
                                        } catch (SQLException sqlEx) {
                                            rs = null;
                                        }
                                        if (stmt != null) {
                                            try {
                                                stmt.close();
                                            } catch (SQLException sqlEx) {
                                                stmt = null;
                                            } catch (Exception e) {
                                                System.err.println("Exception: " + e.getMessage());
                                                System.err.println(e);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            gui.setStatus("Credit total + Cash total is less then the order total! ", true);
                        }
                    }
                } else {
                    if ((int)(Object)settings.get(DBSettings.MAIN_ALLOWNEGBALANCES).compareTo("1") == 0) {
                        gui.setStatus("Sorry, maximum negative balance is " + money.format(neg) + "!", true);
                    } else gui.setStatus("Student does not have enough credit to process this order.", true);
                }
            } else {
                gui.setStatus("Buffer total is less then the order total.", true);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass MAIN_ALLOWNEGBALANCES;
	public MyHelperClass MAIN_BUILDING;
	public MyHelperClass RETURN_GENERATED_KEYS;
	public MyHelperClass MAIN_MAXNEGBALANCE;
public MyHelperClass getCredit(){ return null; }
	public MyHelperClass format(MyHelperClass o0){ return null; }
	public MyHelperClass display(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, MyHelperClass o3, MyHelperClass o4){ return null; }
	public MyHelperClass setPOSEventListener(c564191 o0){ return null; }
	public MyHelperClass getOrderTotal(){ return null; }
	public MyHelperClass openDrawer(){ return null; }
	public MyHelperClass getBufferTotal(){ return null; }
	public MyHelperClass isStudentSet(){ return null; }
	public MyHelperClass getPOSConnection(){ return null; }
	public MyHelperClass setStatus(String o0, boolean o1){ return null; }
	public MyHelperClass getPOSUser(){ return null; }
	public MyHelperClass setStatus(String o0){ return null; }
	public MyHelperClass getCash(){ return null; }
	public MyHelperClass disableUI(){ return null; }
	public MyHelperClass setCriticalMessage(String o0){ return null; }
	public MyHelperClass compareTo(String o0){ return null; }
	public MyHelperClass getLastInsertIDWorkAround(Statement o0, String o1){ return null; }
	public MyHelperClass format(double o0){ return null; }
	public MyHelperClass getStudentNumber(){ return null; }
	public MyHelperClass get(MyHelperClass o0){ return null; }
	public MyHelperClass getOrderItems(){ return null; }}

class Connection {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass commit(){ return null; }}

class Statement {

public MyHelperClass getGeneratedKeys(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass execute(String o0){ return null; }
	public MyHelperClass executeUpdate(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass getResultSet(){ return null; }
	public MyHelperClass close(){ return null; }}

class ResultSet {

public MyHelperClass close(){ return null; }
	public MyHelperClass getInt(String o0){ return null; }
	public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass next(){ return null; }}

class OrderItem {

public MyHelperClass isSoldAsFree(){ return null; }
	public MyHelperClass getEffectivePrice(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass isTypeA(){ return null; }
	public MyHelperClass getCategory(){ return null; }
	public MyHelperClass getBuilding(){ return null; }
	public MyHelperClass getDBID(){ return null; }
	public MyHelperClass isSoldAsReduced(){ return null; }}

class PSOrderSummary {

PSOrderSummary(MyHelperClass o0){}
	PSOrderSummary(){}}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
