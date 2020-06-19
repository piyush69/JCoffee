import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17058342 {
public MyHelperClass registration;
	public MyHelperClass posted;
	public MyHelperClass approved;
	public MyHelperClass createPublicationRequest(Publisher o0, String o1, String o2){ return null; }
	public MyHelperClass queryFindable(Connection o0){ return null; }
	public MyHelperClass queryNative(Connection o0){ return null; }
	public MyHelperClass closeResultSet(ResultSet o0){ return null; }
	public MyHelperClass closeStatement(PreparedStatement o0){ return null; }
public MyHelperClass _repository;
	public MyHelperClass UuidUtil;
	public MyHelperClass ProtocolSerializer;
	public MyHelperClass LOGGER;
	public MyHelperClass Level;
	public MyHelperClass getActionResult(){ return null; }
	public MyHelperClass getRepository(){ return null; }
	public MyHelperClass getOwner(){ return null; }
	public MyHelperClass createPublisherOfRepository(){ return null; }
	public MyHelperClass logExpression(String o0){ return null; }
	public MyHelperClass getRequestContext(){ return null; }
	public MyHelperClass getHarvestingTableName(){ return null; }
	public MyHelperClass createUpdateSQL(){ return null; }
	public MyHelperClass createInsertSQL(){ return null; }
	public MyHelperClass returnConnection(){ return null; }

    public void executeUpdate(Native nativeResource) throws Throwable, Exception {
        Connection con = null;
        boolean autoCommit = true;
        PreparedStatement st = null;
        try {
            HrRecord hr =(HrRecord)(Object) getRepository();
            ManagedConnection mc = returnC(ManagedConnection)(Object)onnection();
            con = mc.getJdbcConnection();
            autoCommit = con.getAutoCommit();
            con.setAutoCommit(false);
            String sql = "";
            boolean isUpdate = false;
            String sUuid = "";
            boolean finableBeforeUpdate = false;
            if (UuidUtil.isUuid(hr.getUuid())) {
                sUuid = hr.getUuid();
                finableBeforeUpdate = queryFindable(con);
                sql =(String)(Object) createUpdateSQL();
                st = con.prepareStatement(sql);
                isUpdate = true;
            } else {
                sUuid = UuidUtil.makeUuid(true);
                finableBeforeUpdate = hr.getFindable();
                sql =(String)(Object) createInsertSQL();
                st = con.prepareStatement(sql);
            }
            if (hr.getOwnerId() < 0) {
                hr.setOwnerId(getOwner().getLocalID());
            }
            int n = 1;
            st.setInt(n++, hr.getOwnerId());
            st.setTimestamp(n++, makeTimestamp(hr.getInputDate()));
            st.setTimestamp(n++, makeTimestamp(hr.getUpdateDate()));
            st.setString(n++, hr.getName());
            st.setString(n++, hr.getHostUrl());
            st.setString(n++, hr.getHarvestFrequency().toString());
            st.setString(n++, Boolean.toString(hr.getSendNotification()));
            st.setString(n++, hr.getProtocol().getKind().toLowerCase());
            st.setString(n++, ProtocolSerializer.toXmlString(hr.getProtocol()));
            st.setString(n++, registration.name());
            if (!isUpdate) {
                if (getRequestContext().getApplicationConfiguration().getHarvesterConfiguration().getResourceAutoApprove()) {
                    st.setString(n++, approved.name());
                } else {
                    st.setString(n++, posted.name());
                }
            }
            st.setString(n++, Boolean.toString(hr.getSearchable()));
            st.setString(n++, Boolean.toString(hr.getSynchronizable()));
            st.setString(n++, sUuid);
            logExpression(sql);
            int nRowCount = st.executeUpdate();
            getActionResult().setNumberOfRecordsModified(nRowCount);
            if (!isUpdate && nRowCount == 1) {
                closeStatement(st);
                st = con.prepareStatement("SELECT ID FROM " + getHarvestingTableName() + " WHERE UPPER(DOCUUID)=?");
                st.setString(1, sUuid.toUpperCase());
                ResultSet genKeys = st.executeQuery();
                genKeys.next();
                int nLocalId = genKeys.getInt(1);
                hr.setLocalId(nLocalId);
                hr.setUuid(sUuid);
                closeResultSet(genKeys);
            }
            con.commit();
            if (nativeResource != null || (isUpdate && finableBeforeUpdate != hr.getFindable())) {
                try {
                    if (nativeResource == null && isUpdate) {
                        nativeResource = queryNative(con);
                    }
                    if (nativeResource != null) {
                        String content = nativeResource.getContent();
                        String sourceUri = nativeResource.getSourceUri().asString();
                        Publisher publisher =(Publisher)(Object) createPublisherOfRepository();
                        PublicationRequest publicationRequest = createPublicationRequest(publisher, content, sourceUri);
                        publicationRequest.publish();
                    }
                } catch (Exception ex) {
                    LOGGER.log(Level.INFO, "Unable to create resource definition.", ex);
                }
            }
            Harvester harvestEngine = getRequestContext().getApplicationContext().getHarvestingEngine();
            if (_repository.getIsHarvestDue()) {
                harvestEngine.submit(getRequestContext(), _repository, null, _repository.getLastSyncDate());
            }
            harvestEngine.reselect();
        } catch (Exception ex) {
            if (con != null) {
                con.rollback();
            }
            throw ex;
        } finally {
            closeStatement(st);
            if (con != null) {
                con.setAutoCommit(autoCommit);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INFO;
public MyHelperClass getIsHarvestDue(){ return null; }
	public MyHelperClass getApplicationConfiguration(){ return null; }
	public MyHelperClass getLastSyncDate(){ return null; }
	public MyHelperClass getLocalID(){ return null; }
	public MyHelperClass makeUuid(boolean o0){ return null; }
	public MyHelperClass getApplicationContext(){ return null; }
	public MyHelperClass setNumberOfRecordsModified(int o0){ return null; }}

class Native {

public MyHelperClass getSourceUri(){ return null; }
	public MyHelperClass getContent(){ return null; }}

class Connection {

public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass getAutoCommit(){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }}

class HrRecord {

public MyHelperClass getHarvestFrequency(){ return null; }
	public MyHelperClass getOwnerId(){ return null; }
	public MyHelperClass getSearchable(){ return null; }
	public MyHelperClass getUpdateDate(){ return null; }
	public MyHelperClass getInputDate(){ return null; }
	public MyHelperClass getFindable(){ return null; }
	public MyHelperClass getSynchronizable(){ return null; }
	public MyHelperClass getSendNotification(){ return null; }
	public MyHelperClass setUuid(String o0){ return null; }
	public MyHelperClass getProtocol(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass setLocalId(int o0){ return null; }
	public MyHelperClass getHostUrl(){ return null; }
	public MyHelperClass getUuid(){ return null; }}

class ManagedConnection {

public MyHelperClass getJdbcConnection(){ return null; }}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass next(){ return null; }}

class Publisher {

}

class PublicationRequest {

public MyHelperClass publish(){ return null; }}

class Harvester {

public MyHelperClass reselect(){ return null; }}
