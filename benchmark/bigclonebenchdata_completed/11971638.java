import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11971638 {
public MyHelperClass AdministrationPanelView;
	public MyHelperClass CampaignStatics;
	public MyHelperClass Logger;
	public MyHelperClass txtCampaignName;
	public MyHelperClass DriverManager;
	public MyHelperClass JOptionPane;
	public MyHelperClass optTypeAgents;
	public MyHelperClass Level;
	public MyHelperClass dispose(){ return null; }
	public MyHelperClass getRootPane(){ return null; }
	public MyHelperClass validateData(){ return null; }

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt)  throws Throwable {
        if ((boolean)(Object)validateData()) {
            LoginUser me =(LoginUser)(Object) AdministrationPanelView.getMe();
            Connection dbConnection = null;
            try {
                DriverManager.registerDriver(new Driver());
                dbConnection =(Connection)(Object) DriverManager.getConnection(me.getSqlReportsURL(), me.getSqlReportsUser(), me.getSqlReportsPassword());
                dbConnection.setAutoCommit(false);
                dbConnection.setSavepoint();
                String sql = "INSERT INTO campaigns (type, name, dateCreated, createdBy) VALUES (?, ?, ?, ?)";
                PreparedStatement statement =(PreparedStatement)(Object) dbConnection.prepareStatement(sql);
                statement.setByte(1, ((boolean)(Object)optTypeAgents.isSelected()) ? CampaignStatics.CAMP_TYPE_AGENT : CampaignStatics.CAMP_TYPE_IVR);
                statement.setString(2,(String)(Object) txtCampaignName.getText());
                statement.setTimestamp(3, new Timestamp(Calendar.getInstance().getTime().getTime()));
                statement.setLong(4,(long)(Object) me.getId());
                statement.executeUpdate();
                ResultSet rs =(ResultSet)(Object) statement.getGeneratedKeys();
                rs.next();
                long campaignId =(long)(Object) rs.getLong(1);
                sql = "INSERT INTO usercampaigns (userid, campaignid, role) VALUES (?, ?, ?)";
                statement =(PreparedStatement)(Object) dbConnection.prepareStatement(sql);
                statement.setLong(1,(long)(Object) me.getId());
                statement.setLong(2, campaignId);
                statement.setString(3, "admin");
                statement.executeUpdate();
                dbConnection.commit();
                dbConnection.close();
                CampaignAdmin ca = new CampaignAdmin();
                ca.setCampaign(txtCampaignName.getText());
                ca.setVisible(true);
                dispose();
            } catch (SQLException ex) {
                try {
                    dbConnection.rollback();
                } catch (SQLException ex1) {
                    Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).log(Level.SEVERE, null, ex1);
                }
                JOptionPane.showMessageDialog(this.getRootPane(), ex.getLocalizedMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).log(Level.SEVERE, null, ex);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
	public MyHelperClass CAMP_TYPE_IVR;
	public MyHelperClass GLOBAL_LOGGER_NAME;
	public MyHelperClass CAMP_TYPE_AGENT;
	public MyHelperClass ERROR_MESSAGE;
public MyHelperClass getConnection(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass isSelected(){ return null; }
	public MyHelperClass getLogger(MyHelperClass o0){ return null; }
	public MyHelperClass registerDriver(Driver o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, SQLException o2){ return null; }
	public MyHelperClass getMe(){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass showMessageDialog(MyHelperClass o0, String o1, String o2, MyHelperClass o3){ return null; }}

class LoginUser {

public MyHelperClass getSqlReportsPassword(){ return null; }
	public MyHelperClass getSqlReportsUser(){ return null; }
	public MyHelperClass getSqlReportsURL(){ return null; }
	public MyHelperClass getId(){ return null; }}

class Connection {

public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass setSavepoint(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }}

class PreparedStatement {

public MyHelperClass getGeneratedKeys(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setTimestamp(int o0, Timestamp o1){ return null; }
	public MyHelperClass setLong(int o0, long o1){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }}

class Timestamp {

Timestamp(long o0){}
	Timestamp(){}}

class ResultSet {

public MyHelperClass getLong(int o0){ return null; }
	public MyHelperClass next(){ return null; }}

class CampaignAdmin {

public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass setCampaign(MyHelperClass o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Driver {

}
