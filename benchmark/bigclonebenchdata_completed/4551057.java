


class c4551057 {
public static MyHelperClass log;
//public MyHelperClass log;

    public static void process(PricesType prices, Long id_site, DatabaseAdapter dbDyn) throws PriceException {
        PreparedStatement ps = null;
        String sql_ = null;
        PriceListItemType debugItem = null;
        try {
            MyHelperClass log = new MyHelperClass();
            if ((boolean)(Object)log.isDebugEnabled()) {
//                MyHelperClass log = new MyHelperClass();
                log.debug("dbDyn - " + dbDyn);
//                MyHelperClass log = new MyHelperClass();
                if (dbDyn != null) log.debug("dbDyn.conn - " + dbDyn.getConnection());
            }
            dbDyn.getConnection().setAutoCommit(false);
            MyHelperClass DatabaseManager = new MyHelperClass();
            if (dbDyn.getFamaly() != DatabaseManager.MYSQL_FAMALY) {
                sql_ = "delete from WM_PRICE_IMPORT_TABLE where shop_code in " + "( select shop_code from WM_PRICE_SHOP_LIST where ID_SITE=? )";
                ps =(PreparedStatement)(Object) dbDyn.prepareStatement(sql_);
                MyHelperClass RsetTools = new MyHelperClass();
                RsetTools.setLong(ps, 1, id_site);
                ps.executeUpdate();
                ps.close();
                ps = null;
            } else {
                String sqlCheck = "";
                boolean isFound = false;
                MyHelperClass GetWmPriceShopListWithIdSiteList = new MyHelperClass();
                WmPriceShopListListType shops =(WmPriceShopListListType)(Object) GetWmPriceShopListWithIdSiteList.getInstance(dbDyn, id_site).item;
                boolean isFirst = true;
                for (int i = 0; i < (int)(Object)shops.getWmPriceShopListCount(); i++) {
                    WmPriceShopListItemType shop =(WmPriceShopListItemType)(Object) shops.getWmPriceShopList(i);
                    isFound = true;
                    if (isFirst) isFirst = false; else sqlCheck += ",";
                    sqlCheck += ("'" + shop.getCodeShop() + "'");
                }
                if (isFound) {
                    sql_ = "delete from WM_PRICE_IMPORT_TABLE where shop_code in ( " + sqlCheck + " )";
//                    MyHelperClass log = new MyHelperClass();
                    if ((boolean)(Object)log.isDebugEnabled()) log.debug("sql " + sql_);
                    ps =(PreparedStatement)(Object) dbDyn.prepareStatement(sql_);
                    ps.executeUpdate();
                    ps.close();
                    ps = null;
                }
            }
//            MyHelperClass log = new MyHelperClass();
            if ((boolean)(Object)log.isDebugEnabled()) log.debug("Start unmarshalling data");
            if (prices == null) throw new PriceException("������ ������� ����� �������. ��� ������ #10.03");
            int batchLoop = 0;
            int count = 0;
            sql_ = "insert into WM_PRICE_IMPORT_TABLE " + "(is_group, id, id_main, name, price, currency, is_to_load, shop_code, ID_UPLOAD_PRICE) " + "values (?,?,?,?,?,?,?,?,?)";
            Long id_upload_session = null;
            for (int j = 0; j < (int)(Object)prices.getPriceListCount(); j++) {
                PriceListType price =(PriceListType)(Object) prices.getPriceList(j);
//                MyHelperClass log = new MyHelperClass();
                if ((boolean)(Object)log.isDebugEnabled()) {
//                    MyHelperClass log = new MyHelperClass();
                    log.debug("shopCode " + price.getShopCode());
//                    MyHelperClass log = new MyHelperClass();
                    log.debug("Size vector: " + price.getItemCount());
                }
                for (int i = 0; (i < (int)(Object)price.getItemCount()) && (count < 5000); i++, count++) {
                    if (ps == null) ps =(PreparedStatement)(Object) dbDyn.prepareStatement(sql_);
                    PriceListItemType item =(PriceListItemType)(Object) price.getItem(i);
                    debugItem = item;
                    ps.setInt(1, Boolean.TRUE.equals(item.getIsGroup()) ? 1 : 0);
                    MyHelperClass RsetTools = new MyHelperClass();
                    RsetTools.setLong(ps, 2,(Long)(Object) item.getItemID());
//                    MyHelperClass RsetTools = new MyHelperClass();
                    RsetTools.setLong(ps, 3,(Long)(Object) item.getParentID());
                    ps.setString(4, item.getNameItem());
//                    MyHelperClass RsetTools = new MyHelperClass();
                    RsetTools.setDouble(ps, 5, item.getPrice());
                    ps.setString(6, item.getCurr());
                    ps.setString(7, item.getIsLoad().toString());
                    ps.setString(8, price.getShopCode().toUpperCase());
//                    MyHelperClass RsetTools = new MyHelperClass();
                    RsetTools.setLong(ps, 9, id_upload_session);
                    if ((boolean)(Object)dbDyn.getIsBatchUpdate()) {
                        ps.addBatch();
                        if (++batchLoop >= 200) {
                            int[] updateCounts =(int[])(Object) ps.executeBatch();
                            ps.close();
                            ps = null;
                            batchLoop = 0;
                        }
                    } else ps.executeUpdate();
                }
            }
            if ((boolean)(Object)dbDyn.getIsBatchUpdate()) {
                if (ps != null) {
                    int[] updateCounts =(int[])(Object) ps.executeBatch();
                    ps.close();
                    ps = null;
                }
            }
            MyHelperClass ImportPriceProcess = new MyHelperClass();
            ImportPriceProcess.process(dbDyn, id_site);
            dbDyn.commit();
        } catch (Exception e) {
            if (debugItem != null) {
                MyHelperClass log = new MyHelperClass();
                log.error("debugItem.getIsGroup() " + (Boolean.TRUE.equals(debugItem.getIsGroup()) ? 1 : 0));
//                MyHelperClass log = new MyHelperClass();
                log.error("debugItem.getItemID() " + debugItem.getItemID());
//                MyHelperClass log = new MyHelperClass();
                log.error("debugItem.getParentID() " + debugItem.getParentID());
//                MyHelperClass log = new MyHelperClass();
                log.error("debugItem.getNameItem() " + debugItem.getNameItem());
//                MyHelperClass log = new MyHelperClass();
                log.error("debugItem.getPrice() " + debugItem.getPrice());
//                MyHelperClass log = new MyHelperClass();
                log.error("debugItem.getCurr() " + debugItem.getCurr());
//                MyHelperClass log = new MyHelperClass();
                log.error("debugItem.getIsLoad().toString() " + debugItem.getIsLoad().toString());
//            MyHelperClass log = new MyHelperClass();
            } else log.error("debugItem is null");
            MyHelperClass log = new MyHelperClass();
            log.error("sql:\n" + sql_);
            final String es = "error process import price-list";
//            MyHelperClass log = new MyHelperClass();
            log.error(es, e);
            try {
                dbDyn.rollback();
            } catch (Exception e11) {
            }
            throw new PriceException(es, e);
        } finally {
            MyHelperClass DatabaseManager = new MyHelperClass();
            DatabaseManager.close(ps);
            ps = null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass item;
	public MyHelperClass MYSQL_FAMALY;
public MyHelperClass setDouble(PreparedStatement o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass close(PreparedStatement o0){ return null; }
	public MyHelperClass process(DatabaseAdapter o0, Long o1){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass setLong(PreparedStatement o0, int o1, Long o2){ return null; }
	public MyHelperClass getInstance(DatabaseAdapter o0, Long o1){ return null; }
	public MyHelperClass toUpperCase(){ return null; }}

class PricesType {

public MyHelperClass getPriceList(int o0){ return null; }
	public MyHelperClass getPriceListCount(){ return null; }}

class DatabaseAdapter {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass getIsBatchUpdate(){ return null; }
	public MyHelperClass getFamaly(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class PriceException extends Exception{
	public PriceException(String errorMessage) { super(errorMessage); }
	PriceException(String o0, Exception o1){}
	PriceException(){}
}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass addBatch(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass executeBatch(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }}

class PriceListItemType {

public MyHelperClass getParentID(){ return null; }
	public MyHelperClass getCurr(){ return null; }
	public MyHelperClass getItemID(){ return null; }
	public MyHelperClass getIsLoad(){ return null; }
	public MyHelperClass getIsGroup(){ return null; }
	public MyHelperClass getNameItem(){ return null; }
	public MyHelperClass getPrice(){ return null; }}

class WmPriceShopListListType {

public MyHelperClass getWmPriceShopList(int o0){ return null; }
	public MyHelperClass getWmPriceShopListCount(){ return null; }}

class WmPriceShopListItemType {

public MyHelperClass getCodeShop(){ return null; }}

class PriceListType {

public MyHelperClass getShopCode(){ return null; }
	public MyHelperClass getItemCount(){ return null; }
	public MyHelperClass getItem(int o0){ return null; }}
