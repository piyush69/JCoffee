import java.io.*;
import java.lang.*;
import java.util.*;



class c22319064 {

    public void addRegisterInfo(HttpServletRequest request) throws ApplicationException {
        String[] pids =(String[])(Object) request.getParameterValues("pid");
        if (pids == null || pids.length <= 0) throw new ApplicationException("��ѡ��Ҫ���Ĳ�Ʒ");
        RegisterDao registerDao = new RegisterDao();
        MyHelperClass StrFun = new MyHelperClass();
        Register register =(Register)(Object) registerDao.findPojoById(StrFun.getString(request, "rid"), Register.class);
        if ((boolean)(Object)register.audit) throw new ApplicationException("��������Ѿ���ˣ��������µ���Ʒ");
        DBConnect dbc = null;
        Connection conn = null;
        try {
            MyHelperClass DBConnect = new MyHelperClass();
            dbc =(DBConnect)(Object) DBConnect.createDBConnect();
            conn =(Connection)(Object) dbc.getConnection();
            conn.setAutoCommit(false);
            for (String pid : pids) {
                RegisterInfo pd = new RegisterInfo();
//                MyHelperClass StrFun = new MyHelperClass();
                pd.rid = StrFun.getInt(request, "rid");
                pd.pid =(MyHelperClass)(Object) Integer.parseInt(pid);
//                MyHelperClass StrFun = new MyHelperClass();
                pd.productName = StrFun.getString(request, "productName_" + pid);
//                MyHelperClass StrFun = new MyHelperClass();
                pd.regAmount = StrFun.getInt(request, "regAmount_" + pid);
//                MyHelperClass StrFun = new MyHelperClass();
                pd.regPrice = StrFun.getInt(request, "regPrice_" + pid);
//                MyHelperClass StrFun = new MyHelperClass();
                pd.regSalePrice = StrFun.getInt(request, "regSalePrice_" + pid);
                MyHelperClass ServerUtil = new MyHelperClass();
                pd.userNo = ServerUtil.getUserFromSession(request).userNo;
                if ((int)(Object)pd.regAmount <= 0) throw new ApplicationException("�����������Ϊ��");
                String sql = "insert into SS_RegisterInfo " + "(pid, rid, productName, regAmount, regPrice, regSalePrice, userNo) " + "values(" + "'" + pd.pid + "', " + "'" + pd.rid + "', " + "'" + pd.productName + "', " + "'" + pd.regAmount + "', " + "'" + pd.regPrice + "', " + "'" + pd.regSalePrice + "', " + "'" + pd.userNo + "' " + ")";
                conn.createStatement().executeUpdate(sql);
            }
            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (UncheckedIOException e1) {
                    e1.printStackTrace();
                }
            }
            throw new ApplicationException(e.getMessage(), e);
        } finally {
            if (dbc != null) try {
                dbc.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass userNo;
public MyHelperClass getUserFromSession(HttpServletRequest o0){ return null; }
	public MyHelperClass getInt(HttpServletRequest o0, String o1){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass createDBConnect(){ return null; }
	public MyHelperClass getString(HttpServletRequest o0, String o1){ return null; }}

class HttpServletRequest {

public MyHelperClass getParameterValues(String o0){ return null; }}

class ApplicationException extends Exception{
	public ApplicationException(String errorMessage) { super(errorMessage); }
	ApplicationException(String o0, Exception o1){}
	ApplicationException(){}
}

class RegisterDao {

public MyHelperClass findPojoById(MyHelperClass o0, Class<Register> o1){ return null; }}

class Register {
public MyHelperClass audit;
}

class DBConnect {

public MyHelperClass close(){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class Connection {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class RegisterInfo {
public MyHelperClass regPrice;
	public MyHelperClass regSalePrice;
	public MyHelperClass regAmount;
	public MyHelperClass productName;
	public MyHelperClass pid;
	public MyHelperClass rid;
	public MyHelperClass userNo;
}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
