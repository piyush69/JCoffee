import java.io.*;
import java.lang.*;
import java.util.*;



class c20929227 {
public MyHelperClass setParaLinkBatch(List o0, Statement o1, String o2, Boolean o3){ return null; }
public MyHelperClass DOBOProperty;
	public MyHelperClass log;
	public MyHelperClass getModiSql(List o0, String o1){ return null; }
	public MyHelperClass getInsertSql(List o0, String o1){ return null; }
	public MyHelperClass getDOBOUid(String o0){ return null; }

    private void insertService(String table, int type) {
        Connection con = null;
        MyHelperClass log = new MyHelperClass();
        log.info("");
//        MyHelperClass log = new MyHelperClass();
        log.info("正在生成" + table + "的服务。。。。。。。");
        try {
            MyHelperClass DODataSource = new MyHelperClass();
            con =(Connection)(Object) DODataSource.getDefaultCon();
            con.setAutoCommit(false);
            Statement stmt =(Statement)(Object) con.createStatement();
            Statement stmt2 =(Statement)(Object) con.createStatement();
            MyHelperClass UUIDHex = new MyHelperClass();
            String serviceUid =(String)(Object) UUIDHex.getInstance().generate();
            MyHelperClass StringUtil = new MyHelperClass();
            DOBO bo =(DOBO)(Object) DOBO.getDOBOByName(StringUtil.getDotName(table));
            List props = new ArrayList();
            StringBuffer mainSql = null;
            String name = "";
            String l10n = "";
//            MyHelperClass StringUtil = new MyHelperClass();
            String prefix =(String)(Object) StringUtil.getDotName(table);
            Boolean isNew = null;
            switch(type) {
                case 1:
                    name = prefix + ".insert";
                    l10n = name;
                    props =(List)(Object) bo.retrieveProperties();
                    mainSql =(StringBuffer)(Object) getInsertSql(props, table);
                    isNew = Boolean.TRUE;
                    break;
                case 2:
                    name = prefix + ".update";
                    l10n = name;
                    props =(List)(Object) bo.retrieveProperties();
                    mainSql =(StringBuffer)(Object) this.getModiSql(props, table);
                    isNew = Boolean.FALSE;
                    break;
                case 3:
                    DOBOProperty property =(DOBOProperty)(Object) DOBOProperty.getDOBOPropertyByName(bo.getName(), "objuid");
                    System.out.println("BOBOBO::::::" + bo);
                    System.out.println("Property::::::" + property);
                    if (property == null) {
                        return;
                    }
                    name = prefix + ".delete";
                    l10n = name;
                    props.add(property);
                    mainSql = new StringBuffer("delete from ").append(table).append(" where objuid = ?");
                    break;
                case 4:
                    property =(DOBOProperty)(Object) DOBOProperty.getDOBOPropertyByName(bo.getName(), "objuid");
                    if (property == null) {
                        return;
                    }
                    name = prefix + ".browse";
                    l10n = name;
                    props.add(property);
                    mainSql = new StringBuffer("select * from ").append(table).append(" where objuid = ?");
                    break;
                case 5:
                    name = prefix + ".list";
                    l10n = name;
                    mainSql = new StringBuffer("select * from ").append(table);
            }
            this.setParaLinkBatch(props, stmt2, serviceUid, isNew);
            StringBuffer aSql = new StringBuffer("insert into DO_Service(objuid,l10n,name,bouid,mainSql) values(").append("'").append(serviceUid).append("','").append(l10n).append("','").append(name).append("','").append(this.getDOBOUid(table)).append("','").append(mainSql).append("')");
            log.info("Servcice's Sql:" + aSql.toString());
            stmt.executeUpdate(aSql.toString());
            stmt2.executeBatch();
            con.commit();
        } catch (UncheckedIOException ex) {
            try {
                con.rollback();
            } catch (UncheckedIOException ex2) {
                ex2.printStackTrace();
            }
            ex.printStackTrace();
        } finally {
            try {
                if (!(Boolean)(Object)con.isClosed()) {
                    con.close();
                }
            } catch (UncheckedIOException ex1) {
                ex1.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getDOBOPropertyByName(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getDefaultCon(){ return null; }
	public MyHelperClass generate(){ return null; }
	public MyHelperClass getDotName(String o0){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class Connection {

public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass isClosed(){ return null; }}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass executeBatch(){ return null; }}

class DOBO {

public MyHelperClass getName(){ return null; }
	public MyHelperClass retrieveProperties(){ return null; }
	public static MyHelperClass getDOBOByName(MyHelperClass o0){ return null; }}

class DOBOProperty {

}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
