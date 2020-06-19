
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c20514913 {
public MyHelperClass Date;
public MyHelperClass JOptionPane;
	public MyHelperClass Logger;
	public MyHelperClass Level;
	public MyHelperClass getRootPane(){ return null; }

    private void saveCampaign() throws HeadlessException {
        try {
            MyHelperClass dbConnection = new MyHelperClass();
            dbConnection.setAutoCommit(false);
//            MyHelperClass dbConnection = new MyHelperClass();
            dbConnection.setSavepoint();
            String sql = "UPDATE campaigns SET " + "queue = ? ," + "adjustRatioPeriod = ?, " + "asterisk = ?, " + "context = ?," + "extension = ?, " + "dialContext = ?, " + "dialPrefix = ?," + "dialTimeout = ?, " + "dialingMethod = ?," + "dialsPerFreeResourceRatio = ?, " + "maxIVRChannels = ?, " + "maxDialingThreads = ?," + "maxDialsPerFreeResourceRatio = ?," + "minDialsPerFreeResourceRatio = ?, " + "maxTries = ?, " + "firstRetryAfterMinutes = ?," + "secondRetryAfterMinutes = ?, " + "furtherRetryAfterMinutes = ?, " + "startDate = ?, " + "endDate = ?," + "popUpURL = ?, " + "contactBatchSize = ?, " + "retriesBatchPct = ?, " + "reschedulesBatchPct = ?, " + "allowReschedule = ?, " + "rescheduleToOnself = ?, " + "script = ?," + "agentsCanUpdateContacts = ?, " + "hideContactFields = ?, " + "afterCallWork = ?, " + "reserveAvailableAgents = ?, " + "useDNCList = ?, " + "enableAgentDNC = ?, " + "contactsFilter = ?, " + "DNCTo = ?," + "callRecordingPolicy = ?, " + "callRecordingPercent = ?, " + "callRecordingMaxAge = ?, " + "WHERE name = ?";
//            MyHelperClass dbConnection = new MyHelperClass();
            PreparedStatement statement =(PreparedStatement)(Object) dbConnection.prepareStatement(sql);
            int i = 1;
            MyHelperClass txtQueue = new MyHelperClass();
            statement.setString(i++, txtQueue.getText());
            MyHelperClass txtAdjustRatio = new MyHelperClass();
            statement.setInt(i++, Integer.valueOf((String)(Object)txtAdjustRatio.getText()));
            statement.setString(i++, "");
            MyHelperClass txtContext = new MyHelperClass();
            statement.setString(i++, txtContext.getText());
            MyHelperClass txtExtension = new MyHelperClass();
            statement.setString(i++, txtExtension.getText());
            MyHelperClass txtDialContext = new MyHelperClass();
            statement.setString(i++, txtDialContext.getText());
            MyHelperClass txtDialPrefix = new MyHelperClass();
            statement.setString(i++, txtDialPrefix.getText());
            statement.setInt(i++, 30000);
            MyHelperClass cboDialingMethod = new MyHelperClass();
            statement.setInt(i++,(int)(Object) cboDialingMethod.getSelectedIndex());
            MyHelperClass txtInitialDialingRatio = new MyHelperClass();
            statement.setFloat(i++, Float.valueOf((String)(Object)txtInitialDialingRatio.getText()));
            MyHelperClass txtMaxIVRChannels = new MyHelperClass();
            statement.setInt(i++, Integer.valueOf((String)(Object)txtMaxIVRChannels.getText()));
            MyHelperClass txtDialLimit = new MyHelperClass();
            statement.setInt(i++, Integer.valueOf((String)(Object)txtDialLimit.getText()));
            MyHelperClass txtMaxDialingRatio = new MyHelperClass();
            statement.setFloat(i++, Float.valueOf((String)(Object)txtMaxDialingRatio.getText()));
            MyHelperClass txtMinDialingRatio = new MyHelperClass();
            statement.setFloat(i++, Float.valueOf((String)(Object)txtMinDialingRatio.getText()));
            MyHelperClass txtMaxRetries = new MyHelperClass();
            statement.setInt(i++, Integer.valueOf((String)(Object)txtMaxRetries.getText()));
            MyHelperClass txtFirstRetry = new MyHelperClass();
            statement.setInt(i++, Integer.valueOf((String)(Object)txtFirstRetry.getText()));
            MyHelperClass txtSecondRetry = new MyHelperClass();
            statement.setInt(i++, Integer.valueOf((String)(Object)txtSecondRetry.getText()));
            MyHelperClass txtFurtherRetries = new MyHelperClass();
            statement.setInt(i++, Integer.valueOf((String)(Object)txtFurtherRetries.getText()));
            MyHelperClass txtStartDate = new MyHelperClass();
            statement.setDate(i++, Date.valueOf(txtStartDate.getText()));
            MyHelperClass txtEndDate = new MyHelperClass();
            statement.setDate(i++, Date.valueOf(txtEndDate.getText()));
            MyHelperClass txtURL = new MyHelperClass();
            statement.setString(i++, txtURL.getText());
            MyHelperClass txtContactBatchSize = new MyHelperClass();
            statement.setInt(i++, Integer.valueOf((String)(Object)txtContactBatchSize.getText()));
            MyHelperClass txtRetryBatchPct = new MyHelperClass();
            statement.setInt(i++, Integer.valueOf((String)(Object)txtRetryBatchPct.getText()));
            MyHelperClass txtRescheduleBatchPct = new MyHelperClass();
            statement.setInt(i++, Integer.valueOf((String)(Object)txtRescheduleBatchPct.getText()));
            MyHelperClass chkAgentCanReschedule = new MyHelperClass();
            statement.setInt(i++,(boolean)(Object) chkAgentCanReschedule.isSelected() ? 1 : 0);
            MyHelperClass chkAgentCanRescheduleSelf = new MyHelperClass();
            statement.setInt(i++,(boolean)(Object) chkAgentCanRescheduleSelf.isSelected() ? 1 : 0);
            MyHelperClass txtScript = new MyHelperClass();
            statement.setString(i++, txtScript.getText());
            MyHelperClass chkAgentCanUpdateContacts = new MyHelperClass();
            statement.setInt(i++,(boolean)(Object) chkAgentCanUpdateContacts.isSelected() ? 1 : 0);
            statement.setString(i++, "");
            MyHelperClass txtACW = new MyHelperClass();
            statement.setInt(i++, Integer.valueOf((String)(Object)txtACW.getText()));
            MyHelperClass txtReserveAgents = new MyHelperClass();
            statement.setInt(i++, Integer.valueOf((String)(Object)txtReserveAgents.getText()));
            MyHelperClass cboDNCListPreference = new MyHelperClass();
            statement.setInt(i++,(int)(Object) cboDNCListPreference.getSelectedIndex());
            statement.setInt(i++, 1);
            statement.setString(i++, "");
            statement.setInt(i++, 0);
            MyHelperClass cboRecordingPolicy = new MyHelperClass();
            statement.setInt(i++,(int)(Object) cboRecordingPolicy.getSelectedIndex());
            MyHelperClass txtRecordingPct = new MyHelperClass();
            statement.setInt(i++, Integer.valueOf((String)(Object)txtRecordingPct.getText()));
            MyHelperClass txtRecordingMaxAge = new MyHelperClass();
            statement.setInt(i++, Integer.valueOf((String)(Object)txtRecordingMaxAge.getText()));
            MyHelperClass campaign = new MyHelperClass();
            statement.setString(i++, campaign);
            statement.executeUpdate();
//            MyHelperClass dbConnection = new MyHelperClass();
            dbConnection.commit();
        } catch (UncheckedIOException ex) {
            try {
                MyHelperClass dbConnection = new MyHelperClass();
                dbConnection.rollback();
            } catch (UncheckedIOException ex1) {
                MyHelperClass Level = new MyHelperClass();
                Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).log(Level.SEVERE, null,(SQLException)(Object) ex1);
            }
            JOptionPane.showMessageDialog(this.getRootPane(), ex.getLocalizedMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).log(Level.SEVERE, null,(SQLException)(Object) ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
	public MyHelperClass GLOBAL_LOGGER_NAME;
	public MyHelperClass SEVERE;
public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass valueOf(MyHelperClass o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, SQLException o2){ return null; }
	public MyHelperClass getLogger(MyHelperClass o0){ return null; }
	public MyHelperClass showMessageDialog(MyHelperClass o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass getSelectedIndex(){ return null; }
	public MyHelperClass setSavepoint(){ return null; }
	public MyHelperClass isSelected(){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class HeadlessException extends Exception{
	public HeadlessException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setDate(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setFloat(int o0, Float o1){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
