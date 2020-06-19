import java.io.*;
import java.lang.*;
import java.util.*;



class c9886928 {
public MyHelperClass removeSingle(MyHelperClass o0){ return null; }
	public MyHelperClass saveServices(String o0, MyHelperClass o1){ return null; }
public int regsCnt;
	public MyHelperClass saveAID(AID o0){ return null; }
public MyHelperClass Logger;
	public MyHelperClass MAX_REGISTER_WITHOUT_CLEAN;
	public MyHelperClass logger;
//	public MyHelperClass regsCnt;
	public MyHelperClass getPreparedStatements(){ return null; }
	public MyHelperClass getGUID(){ return null; }
	public MyHelperClass getConnectionWrapper(){ return null; }
	public MyHelperClass clean(){ return null; }

    protected Object insertSingle(Object name, Object fact) throws SQLException {
        DFAgentDescription dfd = (DFAgentDescription) fact;
        AID agentAID =(AID)(Object) dfd.getName();
        String agentName =(String)(Object) agentAID.getName();
        DFAgentDescription dfdToReturn = null;
        String batchErrMsg = "";
        Connection conn =(Connection)(Object) getConnectionWrapper().getConnection();
        PreparedStatements pss =(PreparedStatements)(Object) getPreparedStatements();
        try {
            dfdToReturn = (DFAgentDescription)(DFAgentDescription)(Object) removeSingle(dfd.getName());
            Date leaseTime =(Date)(Object) dfd.getLeaseTime();
            long lt = (leaseTime != null ? leaseTime.getTime() : -1);
            String descrId =(String)(Object) getGUID();
            pss.stm_insAgentDescr.setString(1, descrId);
            pss.stm_insAgentDescr.setString(2, agentName);
            pss.stm_insAgentDescr.setString(3, String.valueOf(lt));
            pss.stm_insAgentDescr.executeUpdate();
            saveAID(agentAID);
            Iterator iter =(Iterator)(Object) dfd.getAllLanguages();
            if (iter.hasNext()) {
                pss.stm_insLanguage.clearBatch();
                while (iter.hasNext()) {
                    pss.stm_insLanguage.setString(1, descrId);
                    pss.stm_insLanguage.setString(2, (String) iter.next());
                    pss.stm_insLanguage.addBatch();
                }
                pss.stm_insLanguage.executeBatch();
            }
            iter =(Iterator)(Object) dfd.getAllOntologies();
            if (iter.hasNext()) {
                pss.stm_insOntology.clearBatch();
                while (iter.hasNext()) {
                    pss.stm_insOntology.setString(1, descrId);
                    pss.stm_insOntology.setString(2, (String) iter.next());
                    pss.stm_insOntology.addBatch();
                }
                pss.stm_insOntology.executeBatch();
            }
            iter =(Iterator)(Object) dfd.getAllProtocols();
            if (iter.hasNext()) {
                pss.stm_insProtocol.clearBatch();
                while (iter.hasNext()) {
                    pss.stm_insProtocol.setString(1, descrId);
                    pss.stm_insProtocol.setString(2, (String) iter.next());
                    pss.stm_insProtocol.addBatch();
                }
                pss.stm_insProtocol.executeBatch();
            }
            saveServices(descrId, dfd.getAllServices());
            regsCnt++;
            if ((int)(Object)regsCnt > (int)(Object)MAX_REGISTER_WITHOUT_CLEAN) {
                regsCnt =(int)(Object)(MyHelperClass)(Object) 0;
                clean();
            }
            conn.commit();
        } catch (UncheckedIOException sqle) {
            try {
                conn.rollback();
            } catch (UncheckedIOException se) {
                logger.log(Logger.SEVERE, "Rollback for incomplete insertion of DFD for agent " + dfd.getName() + " failed.",(SQLException)(Object) se);
            }
            throw sqle;
        }
        return dfdToReturn;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass addBatch(){ return null; }
	public MyHelperClass executeBatch(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass clearBatch(){ return null; }
	public MyHelperClass getConnection(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, SQLException o2){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class DFAgentDescription {

public MyHelperClass getLeaseTime(){ return null; }
	public MyHelperClass getAllLanguages(){ return null; }
	public MyHelperClass getAllServices(){ return null; }
	public MyHelperClass getAllProtocols(){ return null; }
	public MyHelperClass getAllOntologies(){ return null; }
	public MyHelperClass getName(){ return null; }}

class AID {

public MyHelperClass getName(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatements {
public MyHelperClass stm_insOntology;
	public MyHelperClass stm_insProtocol;
	public MyHelperClass stm_insLanguage;
	public MyHelperClass stm_insAgentDescr;
}
