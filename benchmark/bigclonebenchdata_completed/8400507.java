


class c8400507 {

    public int updatewuliao(Addwuliao aw) {
        int flag = 0;
        Connection conn = null;
        PreparedStatement pm = null;
        try {
            MyHelperClass Pool = new MyHelperClass();
            conn =(Connection)(Object) Pool.getConnection();
            conn.setAutoCommit(false);
            pm =(PreparedStatement)(Object) conn.prepareStatement("update addwuliao set inname=?,innum=?,inprice=?,productsdetail=?where pid=?");
            pm.setString(1, aw.getInname());
            pm.setInt(2, aw.getInnum());
            pm.setDouble(3, aw.getInprice());
            pm.setString(4, aw.getProductsdetail());
            pm.setString(5, aw.getPid());
            flag =(int)(Object) pm.executeUpdate();
            conn.commit();
//            MyHelperClass Pool = new MyHelperClass();
            Pool.close(pm);
//            MyHelperClass Pool = new MyHelperClass();
            Pool.close(conn);
        } catch (Exception e) {
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (Exception ep) {
                ep.printStackTrace();
            }
            MyHelperClass Pool = new MyHelperClass();
            Pool.close(pm);
//            MyHelperClass Pool = new MyHelperClass();
            Pool.close(conn);
        } finally {
            MyHelperClass Pool = new MyHelperClass();
            Pool.close(pm);
//            MyHelperClass Pool = new MyHelperClass();
            Pool.close(conn);
        }
        return flag;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass close(Connection o0){ return null; }
	public MyHelperClass close(PreparedStatement o0){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class Addwuliao {

public MyHelperClass getPid(){ return null; }
	public MyHelperClass getProductsdetail(){ return null; }
	public MyHelperClass getInname(){ return null; }
	public MyHelperClass getInprice(){ return null; }
	public MyHelperClass getInnum(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setDouble(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
