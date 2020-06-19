import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c5021563 {
public MyHelperClass getRepositoryConnection(MyHelperClass o0, MyHelperClass o1, int o2){ return null; }
public MyHelperClass updateDictionaryTable(ResultSet o0, String o1){ return null; }
	public MyHelperClass existsTable(MyHelperClass o0, String o1, MyHelperClass o2){ return null; }
public MyHelperClass logger;
	public MyHelperClass executeDDL(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass checkDicFields(MyHelperClass o0, MyHelperClass o1, String[] o2, String[] o3, String[] o4, String[] o5, String[] o6){ return null; }
	public MyHelperClass getMacrofieldDef(Connection o0, MyHelperClass o1){ return null; }
	public MyHelperClass getNgtFieldTypeFromDDL(MyHelperClass o0){ return null; }
	public MyHelperClass getDDLFieldFromNGT(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getDDLFieldFromNGT(String o0, MyHelperClass o1){ return null; }
public MyHelperClass boRepository;

    private String AddAction(ResultSet node, String modo) throws SQLException {
        Connection cn = null;
        Connection cndef = null;
        MyHelperClass boApplication = new MyHelperClass();
        String schema =(String)(Object) boRepository.getDefaultSchemaName(boApplication.getDefaultApplication()).toLowerCase();
        try {
            MyHelperClass p_ctx = new MyHelperClass();
            cn =(Connection)(Object) this.getRepositoryConnection(p_ctx.getApplication(), p_ctx.getBoSession().getRepository().getName(), 1);
//            MyHelperClass p_ctx = new MyHelperClass();
            cndef =(Connection)(Object) this.getRepositoryConnection(p_ctx.getApplication(), p_ctx.getBoSession().getRepository().getName(), 2);
            String dml = null;
            String objecttype =(String)(Object) node.getString("OBJECTTYPE");
            if (objecttype.equalsIgnoreCase("T")) {
//                MyHelperClass p_ctx = new MyHelperClass();
                boolean exists =(boolean)(Object) existsTable(p_ctx, schema, node.getString("OBJECTNAME").toLowerCase());
                String[] sysflds = { "SYS_USER", "SYS_ICN", "SYS_DTCREATE", "SYS_DTSAVE", "SYS_ORIGIN" };
                String[] sysfdef = { "VARCHAR(25)", "NUMERIC(7)", "TIMESTAMP DEFAULT now()", "TIMESTAMP", "VARCHAR(30)" };
                String[] sysftyp = { "C", "N", "D", "D", "C" };
                String[] sysfsiz = { "25", "7", "", "", "30" };
                String[] sysfndef = { "", "", "", "", "" };
                String[] sysfdes = { "", "", "", "", "" };
                if (!exists && !modo.equals("3")) {
                    dml = "CREATE TABLE " + node.getString("OBJECTNAME") + " (";
                    for (int i = 0; i < sysflds.length; i++) {
                        dml += (sysflds[i] + " " + sysfdef[i] + ((i < (sysflds.length - 1)) ? "," : ")"));
                    }
                    String vt =(String)(Object) node.getString("OBJECTNAME");
                    if (node.getString("SCHEMA").equals("DEF")) {
                        vt = "NGD_" + vt;
                    } else if (node.getString("SCHEMA").equals("SYS")) {
                        vt = "SYS_" + vt;
                    }
                    executeDDL(dml, node.getString("SCHEMA"));
                }
                if (modo.equals("3") && exists) {
                    executeDDL("DROP TABLE " + node.getString("OBJECTNAME"), node.getString("SCHEMA"));
                    CallableStatement call =(CallableStatement)(Object) cndef.prepareCall("DELETE FROM NGTDIC WHERE TABLENAME=?");
                    call.setString(1, node.getString("OBJECTNAME"));
                    call.executeUpdate();
                    call.close();
                }
                checkDicFields(node.getString("OBJECTNAME"), node.getString("SCHEMA"), sysflds, sysftyp, sysfsiz, sysfndef, sysfdes);
            }
            if (objecttype.equalsIgnoreCase("F")) {
                boolean fldchg = false;
                boolean fldexi = false;
                PreparedStatement pstm =(PreparedStatement)(Object) cn.prepareStatement("select column_name,udt_name,character_maximum_length,numeric_precision,numeric_scale from information_schema.columns" + "  where table_name=? and column_name=? and table_schema=?");
                pstm.setString(1,(String)(Object) node.getString("TABLENAME").toLowerCase());
                pstm.setString(2,(String)(Object) node.getString("OBJECTNAME").toLowerCase());
                pstm.setString(3, schema);
                ResultSet rslt =(ResultSet)(Object) pstm.executeQuery();
                if ((boolean)(Object)rslt.next()) {
                    int fieldsiz =(int)(Object) rslt.getInt(3);
                    int fielddec =(int)(Object) rslt.getInt(5);
                    if (",C,N,".indexOf("," + getNgtFieldTypeFromDDL(rslt.getString(2)) + ",") != -1) {
                        if (getNgtFieldTypeFromDDL(rslt.getString(2)).equals("N")) {
                            fieldsiz =(int)(Object) rslt.getInt(4);
                        }
                        if (fielddec != 0) {
                            if (!(fieldsiz + "," + fielddec).equals(node.getString("FIELDSIZE"))) {
                                fldchg = true;
                            }
                        } else {
                            if (!((fieldsiz == 0) && ((node.getString("FIELDSIZE") == null) || ((int)(Object)node.getString("FIELDSIZE").length() == 0)))) {
                                if (!("" + fieldsiz).equals(node.getString("FIELDSIZE"))) {
                                    fldchg = true;
                                }
                            }
                        }
                    }
                    fldexi = true;
                } else {
                    fldexi = false;
                }
                rslt.close();
                pstm.close();
                boolean drop = false;
                if (("20".indexOf(modo) != -1) && !fldexi) {
                    dml = "ALTER TABLE " + node.getString("TABLENAME") + " add \"" + node.getString("OBJECTNAME").toLowerCase() + "\" ";
                } else if (("20".indexOf(modo) != -1) && fldexi && fldchg) {
                    dml = "ALTER TABLE " + node.getString("TABLENAME") + " ALTER COLUMN \"" + node.getString("OBJECTNAME").toLowerCase() + "\" ";
                } else if (modo.equals("3") && fldexi) {
                    dml = "ALTER TABLE " + node.getString("TABLENAME") + " drop  COLUMN \"" + node.getString("OBJECTNAME").toLowerCase() + "\" ";
                    String sql = "SELECT tc.constraint_name,tc.constraint_type" + " FROM information_schema.table_constraints tc" + " LEFT JOIN information_schema.key_column_usage kcu" + " ON tc.constraint_catalog = kcu.constraint_catalog" + " AND tc.constraint_schema = kcu.constraint_schema" + " AND tc.constraint_name = kcu.constraint_name" + " LEFT JOIN information_schema.referential_constraints rc" + " ON tc.constraint_catalog = rc.constraint_catalog" + " AND tc.constraint_schema = rc.constraint_schema" + " AND tc.constraint_name = rc.constraint_name" + " LEFT JOIN information_schema.constraint_column_usage ccu" + " ON rc.unique_constraint_catalog = ccu.constraint_catalog" + " AND rc.unique_constraint_schema = ccu.constraint_schema" + " AND rc.unique_constraint_name = ccu.constraint_name" + " WHERE tc.table_name = ?" + " AND kcu.column_name = ?" + " and tc.table_schema=?";
                    PreparedStatement pstmrelc =(PreparedStatement)(Object) cn.prepareStatement(sql);
                    pstmrelc.setString(1,(String)(Object) node.getString("TABLENAME").toLowerCase());
                    pstmrelc.setString(2,(String)(Object) node.getString("OBJECTNAME").toLowerCase());
                    pstmrelc.setString(3, schema);
                    ResultSet rsltrelc =(ResultSet)(Object) pstmrelc.executeQuery();
                    while ((boolean)(Object)rsltrelc.next()) {
                        String constname =(String)(Object) rsltrelc.getString(1);
                        String consttype =(String)(Object) rsltrelc.getString(2);
                        PreparedStatement pstmdic =(PreparedStatement)(Object) cndef.prepareStatement("DELETE FROM NGTDIC WHERE TABLENAME=? AND OBJECTTYPE=? AND OBJECTNAME=?");
                        pstmdic.setString(1,(String)(Object) node.getString("TABLENAME"));
                        pstmdic.setString(2, consttype.equals("R") ? "FK" : "PK");
                        pstmdic.setString(3, constname);
                        int nrecs =(int)(Object) pstmdic.executeUpdate();
                        pstm.close();
                        executeDDL("ALTER TABLE " + node.getString("TABLENAME") + " DROP CONSTRAINT " + constname, node.getString("SCHEMA"));
                    }
                    rsltrelc.close();
                    pstmrelc.close();
                }
                if ((dml != null) && (dml.length() > 0) && !modo.equals("3")) {
                    String mfield =(String)(Object) node.getString("MACROFIELD");
                    if ((mfield != null) && !(!mfield.equals("TEXTOLIVRE") && !mfield.equals("NUMEROLIVRE") && !mfield.equals("TEXT") && !mfield.equals("BLOB") && !mfield.equals("MDATA"))) {
                        String ngtft = "";
                        if (mfield.equals("TEXTOLIVRE")) {
                            ngtft = "C";
                        } else if (mfield.equals("NUMEROLIVRE")) {
                            ngtft = "N";
                        } else if (mfield.equals("RAW")) {
                            ngtft = "RAW";
                        } else if (mfield.equals("TIMESTAMP")) {
                            ngtft = "TIMESTAMP";
                        } else if (mfield.equals("MDATA")) {
                            ngtft = "D";
                        } else if (mfield.equals("TEXT")) {
                            ngtft = "CL";
                        } else if (mfield.equals("BLOB")) {
                            ngtft = "BL";
                        }
                        dml += getDDLFieldFromNGT(ngtft, node.getString("FIELDSIZE"));
                    } else if ((mfield != null) && (mfield.length() > 0)) {
                        dml += getMacrofieldDef(cndef, node.getString("MACROFIELD"));
                    } else {
                        dml += getDDLFieldFromNGT(node.getString("FIELDTYPE"), node.getString("FIELDSIZE"));
                    }
                }
                String[] flds = new String[1];
                flds[0] =(String)(Object) node.getString("OBJECTNAME");
                if (dml != null) {
                    executeDDL(dml, node.getString("SCHEMA"));
                }
            }
            if (objecttype.equalsIgnoreCase("V")) {
                String viewText = null;
                PreparedStatement pstmrelc =(PreparedStatement)(Object) cn.prepareStatement("SELECT view_definition FROM information_schema.views WHERE table_name=? " + "and table_schema=?");
                pstmrelc.setString(1,(String)(Object) node.getString("OBJECTNAME").toLowerCase());
                pstmrelc.setString(2, schema.toLowerCase());
                ResultSet rsltrelc =(ResultSet)(Object) pstmrelc.executeQuery();
                boolean exists = false;
                if ((boolean)(Object)rsltrelc.next()) {
                    exists = true;
                    viewText =(String)(Object) rsltrelc.getString(1);
                    viewText = viewText.substring(0, viewText.length() - 1);
                }
                rsltrelc.close();
                pstmrelc.close();
                if (!modo.equals("3")) {
                    String vExpression =(String)(Object) node.getString("EXPRESSION");
                    if (!vExpression.toLowerCase().equals(viewText)) {
                        dml = "CREATE OR REPLACE VIEW \"" + node.getString("OBJECTNAME") + "\" AS \n" + vExpression;
                        executeDDL(dml, node.getString("SCHEMA"));
                    }
                } else {
                    if (exists) {
                        dml = "DROP VIEW " + node.getString("OBJECTNAME");
                        executeDDL(dml, node.getString("SCHEMA"));
                        CallableStatement call =(CallableStatement)(Object) cndef.prepareCall("DELETE FROM NGTDIC WHERE TABLENAME=?");
                        call.setString(1, node.getString("OBJECTNAME"));
                        call.executeUpdate();
                        call.close();
                    }
                }
            }
            if (objecttype.startsWith("PCK")) {
                String templatestr =(String)(Object) node.getString("EXPRESSION");
                String bstr = "/*begin_package*/";
                String estr = "/*end_package*/";
                if ("02".indexOf(modo) != -1) {
                    if (templatestr.indexOf(bstr) != -1) {
                        int defpos;
                        dml = templatestr.substring(templatestr.indexOf(bstr), defpos = templatestr.indexOf(estr));
                        dml = "create or replace package " + node.getString("OBJECTNAME") + " is \n" + dml + "end " + node.getString("OBJECTNAME") + ";\n";
                        executeDDL(dml, node.getString("SCHEMA"));
                        bstr = "/*begin_package_body*/";
                        estr = "/*end_package_body*/";
                        if (templatestr.indexOf(bstr, defpos) != -1) {
                            dml = templatestr.substring(templatestr.indexOf(bstr, defpos), templatestr.indexOf(estr, defpos));
                            dml = "create or replace package body " + node.getString("OBJECTNAME") + " is \n" + dml + "end " + node.getString("OBJECTNAME") + ";\n";
                            executeDDL(dml, node.getString("SCHEMA"));
                        }
                    } else {
                    }
                }
            }
            if (objecttype.startsWith("PK") || objecttype.startsWith("UN")) {
                String sql = "SELECT kcu.column_name" + " FROM information_schema.table_constraints tc" + " LEFT JOIN information_schema.key_column_usage kcu" + " ON tc.constraint_catalog = kcu.constraint_catalog" + " AND tc.constraint_schema = kcu.constraint_schema" + " AND tc.constraint_name = kcu.constraint_name" + " LEFT JOIN information_schema.referential_constraints rc" + " ON tc.constraint_catalog = rc.constraint_catalog" + " AND tc.constraint_schema = rc.constraint_schema" + " AND tc.constraint_name = rc.constraint_name" + " LEFT JOIN information_schema.constraint_column_usage ccu" + " ON rc.unique_constraint_catalog = ccu.constraint_catalog" + " AND rc.unique_constraint_schema = ccu.constraint_schema" + " AND rc.unique_constraint_name = ccu.constraint_name" + " WHERE tc.table_name = ?" + " AND tc.constraint_name = ?" + " and tc.table_schema=? order by ordinal_position";
                PreparedStatement pstm =(PreparedStatement)(Object) cn.prepareStatement(sql);
                pstm.setString(1,(String)(Object) node.getString("TABLENAME").toLowerCase());
                pstm.setString(2,(String)(Object) node.getString("OBJECTNAME").toLowerCase());
                pstm.setString(3, schema.toLowerCase());
                boolean isunique = objecttype.startsWith("UN");
                ResultSet rslt =(ResultSet)(Object) pstm.executeQuery();
                boolean exists = false;
                StringBuffer expression = new StringBuffer();
                while ((boolean)(Object)rslt.next()) {
                    if (exists) {
                        expression.append(',');
                    }
                    exists = true;
                    expression.append(rslt.getString(1));
                }
                boolean diff = !expression.toString().toUpperCase().equals(node.getString("EXPRESSION"));
                rslt.close();
                pstm.close();
                if ((modo.equals("3") || diff) && exists) {
                    sql = "SELECT tc.constraint_name,tc.table_name" + " FROM information_schema.table_constraints tc" + " LEFT JOIN information_schema.key_column_usage kcu" + " ON tc.constraint_catalog = kcu.constraint_catalog" + " AND tc.constraint_schema = kcu.constraint_schema" + " AND tc.constraint_name = kcu.constraint_name" + " LEFT JOIN information_schema.referential_constraints rc" + " ON tc.constraint_catalog = rc.constraint_catalog" + " AND tc.constraint_schema = rc.constraint_schema" + " AND tc.constraint_name = rc.constraint_name" + " LEFT JOIN information_schema.constraint_column_usage ccu" + " ON rc.unique_constraint_catalog = ccu.constraint_catalog" + " AND rc.unique_constraint_schema = ccu.constraint_schema" + " AND rc.unique_constraint_name = ccu.constraint_name" + " WHERE ccu.constraint_name = ?" + " and tc.table_schema=?";
                    PreparedStatement pstmrefs =(PreparedStatement)(Object) cn.prepareStatement(sql);
                    pstmrefs.setString(1,(String)(Object) node.getString("OBJECTNAME").toLowerCase());
                    pstmrefs.setString(2, schema.toLowerCase());
                    ResultSet rsltrefs =(ResultSet)(Object) pstmrefs.executeQuery();
                    while ((boolean)(Object)rsltrefs.next()) {
                        PreparedStatement pstmdelref =(PreparedStatement)(Object) cndef.prepareStatement("DELETE NGTDIC WHERE OBJECTNAME=? AND SCHEMA=? AND TABLENAME=? AND OBJECTTYPE='FK'");
                        pstmdelref.setString(1,(String)(Object) rsltrefs.getString(1));
                        pstmdelref.setString(2,(String)(Object) node.getString("SCHEMA"));
                        pstmdelref.setString(3,(String)(Object) rsltrefs.getString(2));
                        pstmdelref.executeUpdate();
                        pstmdelref.close();
                        executeDDL("alter table " + rsltrefs.getString(2) + "  drop constraint " + rsltrefs.getString(1), node.getString("SCHEMA"));
                    }
                    rsltrefs.close();
                    pstmrefs.close();
                    String insql = "'" + node.getString("EXPRESSION").toLowerCase().replaceAll(",", "\\',\\'") + "'";
                    sql = "SELECT tc.constraint_name" + " FROM information_schema.table_constraints tc" + " LEFT JOIN information_schema.key_column_usage kcu" + " ON tc.constraint_catalog = kcu.constraint_catalog" + " AND tc.constraint_schema = kcu.constraint_schema" + " AND tc.constraint_name = kcu.constraint_name" + " LEFT JOIN information_schema.referential_constraints rc" + " ON tc.constraint_catalog = rc.constraint_catalog" + " AND tc.constraint_schema = rc.constraint_schema" + " AND tc.constraint_name = rc.constraint_name" + " LEFT JOIN information_schema.constraint_column_usage ccu" + " ON rc.unique_constraint_catalog = ccu.constraint_catalog" + " AND rc.unique_constraint_schema = ccu.constraint_schema" + " AND rc.unique_constraint_name = ccu.constraint_name" + " WHERE tc.table_name=? and " + "kcu.column_name in (" + insql + ")" + " and tc.table_schema=?";
                    pstmrefs =(PreparedStatement)(Object) cn.prepareStatement(sql);
                    pstmrefs.setString(1,(String)(Object) node.getString("TABLENAME").toLowerCase());
                    pstmrefs.setString(2, schema.toLowerCase());
                    rsltrefs =(ResultSet)(Object) pstmrefs.executeQuery();
                    while ((boolean)(Object)rsltrefs.next()) {
                        PreparedStatement pstmdelref =(PreparedStatement)(Object) cndef.prepareStatement("DELETE NGTDIC WHERE OBJECTNAME=? AND SCHEMA=? AND TABLENAME=? AND OBJECTTYPE='FK'");
                        pstmdelref.setString(1,(String)(Object) rsltrefs.getString(1));
                        pstmdelref.setString(2,(String)(Object) node.getString("SCHEMA"));
                        pstmdelref.setString(3,(String)(Object) node.getString("TABLENAME"));
                        pstmdelref.executeUpdate();
                        pstmdelref.close();
                        executeDDL("alter table " + node.getString("TABLENAME") + " drop constraint " + rsltrefs.getString(1), node.getString("SCHEMA"));
                    }
                    rsltrefs.close();
                    pstmrefs.close();
                    if (exists && diff) {
                        dml = "alter table " + node.getString("TABLENAME") + " drop constraint " + node.getString("OBJECTNAME");
                        try {
                            executeDDL(dml, node.getString("SCHEMA"));
                        } catch (Exception e) {
                            MyHelperClass LoggerMessageLocalizer = new MyHelperClass();
                            logger.warn(LoggerMessageLocalizer.getMessage("ERROR_EXCUTING_DDL") + " (" + dml + ") " + e.getMessage());
                        }
                    }
                }
                if (!modo.equals("3") && (!exists || diff)) {
                    if (isunique) {
                        dml = "alter table " + node.getString("TABLENAME") + " add constraint " + node.getString("OBJECTNAME") + " unique (" + node.getString("EXPRESSION") + ")";
                    } else {
                        dml = "alter table " + node.getString("TABLENAME") + " add primary key (" + node.getString("EXPRESSION") + ")";
                    }
                    executeDDL(dml, node.getString("SCHEMA"));
                }
            }
            if (objecttype.startsWith("FK")) {
                String sql = "SELECT kcu.column_name" + " FROM information_schema.table_constraints tc" + " LEFT JOIN information_schema.key_column_usage kcu" + " ON tc.constraint_catalog = kcu.constraint_catalog" + " AND tc.constraint_schema = kcu.constraint_schema" + " AND tc.constraint_name = kcu.constraint_name" + " LEFT JOIN information_schema.referential_constraints rc" + " ON tc.constraint_catalog = rc.constraint_catalog" + " AND tc.constraint_schema = rc.constraint_schema" + " AND tc.constraint_name = rc.constraint_name" + " LEFT JOIN information_schema.constraint_column_usage ccu" + " ON rc.unique_constraint_catalog = ccu.constraint_catalog" + " AND rc.unique_constraint_schema = ccu.constraint_schema" + " AND rc.unique_constraint_name = ccu.constraint_name" + " WHERE tc.constraint_name=?" + " and tc.table_name=?" + " and tc.table_schema=? order by ordinal_position";
                PreparedStatement pstm =(PreparedStatement)(Object) cn.prepareStatement(sql);
                pstm.setString(1,(String)(Object) node.getString("OBJECTNAME").toLowerCase());
                pstm.setString(2,(String)(Object) node.getString("TABLENAME").toLowerCase());
                pstm.setString(3, schema.toLowerCase());
                ResultSet rslt =(ResultSet)(Object) pstm.executeQuery();
                boolean exists = false;
                String cExpress = "";
                String express =(String)(Object) node.getString("EXPRESSION");
                if ((boolean)(Object)rslt.next()) {
                    exists = true;
                    if (cExpress.length() > 0) cExpress += ",";
                    cExpress += rslt.getString(1);
                }
                rslt.close();
                pstm.close();
                if (exists && !express.equals(cExpress)) {
                    dml = "alter table " + node.getString("TABLENAME") + " drop constraint " + node.getString("OBJECTNAME");
                    executeDDL(dml, node.getString("SCHEMA"));
                }
                if (!modo.equals("3") && (!exists || !express.equals(cExpress))) {
                    dml = "alter table " + node.getString("TABLENAME") + " add constraint " + node.getString("OBJECTNAME") + " foreign key (" + node.getString("EXPRESSION") + ") references " + node.getString("TABLEREFERENCE") + "(" + node.getString("FIELDREFERENCE") + ")";
                    executeDDL(dml, node.getString("SCHEMA"));
                }
            }
            if (objecttype.startsWith("IDX")) {
                boolean unflag = false;
                String sql = "SELECT n.nspname" + " FROM pg_catalog.pg_class c" + " JOIN pg_catalog.pg_index i ON i.indexrelid = c.oid" + " JOIN pg_catalog.pg_class c2 ON i.indrelid = c2.oid" + " LEFT JOIN pg_catalog.pg_user u ON u.usesysid = c.relowner" + " LEFT JOIN pg_catalog.pg_namespace n ON n.oid = c.relnamespace" + " where c.relname=? and c.relkind='i' and n.nspname=?";
                PreparedStatement pstm =(PreparedStatement)(Object) cn.prepareStatement(sql);
                pstm.setString(1,(String)(Object) node.getString("OBJECTNAME").toLowerCase());
                pstm.setString(2, schema.toLowerCase());
                ResultSet rslt =(ResultSet)(Object) pstm.executeQuery();
                boolean drop = false;
                boolean exists = false;
                boolean dbunflag = false;
                String oldexpression = "";
                String newexpression = "";
                if ((boolean)(Object)rslt.next()) {
                    exists = true;
                    if ((unflag && !(dbunflag = rslt.getString(1).equals("UNIQUE")))) {
                        drop = true;
                    }
                    rslt.close();
                    pstm.close();
                    sql = "SELECT kcu.column_name" + " FROM information_schema.table_constraints tc" + " LEFT JOIN information_schema.key_column_usage kcu" + " ON tc.constraint_catalog = kcu.constraint_catalog" + " AND tc.constraint_schema = kcu.constraint_schema" + " AND tc.constraint_name = kcu.constraint_name" + " LEFT JOIN information_schema.referential_constraints rc" + " ON tc.constraint_catalog = rc.constraint_catalog" + " AND tc.constraint_schema = rc.constraint_schema" + " AND tc.constraint_name = rc.constraint_name" + " LEFT JOIN information_schema.constraint_column_usage ccu" + " ON rc.unique_constraint_catalog = ccu.constraint_catalog" + " AND rc.unique_constraint_schema = ccu.constraint_schema" + " AND rc.unique_constraint_name = ccu.constraint_name" + " WHERE tc.constraint_name=?" + " and tc.table_name=?" + " and tc.table_schema=? and tc.constraint_type='UNIQUE'";
                    pstm =(PreparedStatement)(Object) cn.prepareStatement(sql);
                    pstm.setString(1,(String)(Object) node.getString("OBJECTNAME").toLowerCase());
                    pstm.setString(2,(String)(Object) node.getString("TABLENAME").toLowerCase());
                    pstm.setString(3, schema.toLowerCase());
                    rslt =(ResultSet)(Object) pstm.executeQuery();
                    while ((boolean)(Object)rslt.next()) {
                        oldexpression += (((oldexpression.length() > 0) ? "," : "") + rslt.getString(1));
                    }
                    rslt.close();
                    pstm.close();
                } else {
                    rslt.close();
                    pstm.close();
                }
                String aux =(String)(Object) node.getString("EXPRESSION");
                String[] nexo;
                if (aux != null) {
                    nexo =(String[])(Object) node.getString("EXPRESSION").split(",");
                } else {
                    nexo = new String[0];
                }
                for (byte i = 0; i < nexo.length; i++) {
                    newexpression += (((newexpression.length() > 0) ? "," : "") + ((nexo[i]).toUpperCase().trim()));
                }
                if (!drop) {
                    drop = (!newexpression.equals(oldexpression)) && !oldexpression.equals("");
                }
                if (exists && (drop || modo.equals("3"))) {
                    if (!dbunflag) {
                        dml = "DROP INDEX " + node.getString("OBJECTNAME");
                    } else {
                        dml = "ALTER TABLE " + node.getString("TABLENAME") + " DROP CONSTRAINT " + node.getString("OBJECTNAME");
                    }
                    executeDDL(dml, node.getString("SCHEMA"));
                    exists = false;
                }
                if (!exists && !modo.equals("3")) {
                    if (!node.getString("OBJECTNAME").equals("") && !newexpression.equals("")) {
                        if (!unflag) {
                            dml = "CREATE INDEX " + node.getString("OBJECTNAME") + " ON " + node.getString("TABLENAME") + "(" + newexpression + ")";
                        } else {
                            dml = "ALTER TABLE " + node.getString("TABLENAME") + " ADD CONSTRAINT " + node.getString("OBJECTNAME") + " UNIQUE (" + newexpression + ")";
                        }
                        executeDDL(dml, node.getString("SCHEMA"));
                    }
                }
            }
            updateDictionaryTable(node, modo);
            return dml;
        } catch (UncheckedIOException e) {
            cn.rollback();
            cndef.rollback();
            throw (e);
        } finally {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getApplication(){ return null; }
	public MyHelperClass toLowerCase(){ return null; }
	public MyHelperClass getBoSession(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getRepository(){ return null; }
	public MyHelperClass getDefaultApplication(){ return null; }
	public MyHelperClass getMessage(String o0){ return null; }
	public MyHelperClass replaceAll(String o0, String o1){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass split(String o0){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass getDefaultSchemaName(MyHelperClass o0){ return null; }}

class ResultSet {

public MyHelperClass next(){ return null; }
	public MyHelperClass getString(int o0){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getInt(int o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass prepareCall(String o0){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class CallableStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeQuery(){ return null; }}
