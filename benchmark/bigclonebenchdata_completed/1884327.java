import java.io.*;
import java.lang.*;
import java.util.*;



class c1884327 {
public MyHelperClass setEncryptedDigest(MyHelperClass o0){ return null; }
	public MyHelperClass setCertificate(MyHelperClass o0){ return null; }
	public MyHelperClass setStatus(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass initStatus(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setStatus(MyHelperClass o0, String o1){ return null; }
public MyHelperClass setEncodedDigest(MyHelperClass o0){ return null; }
	public MyHelperClass retriveEncodedDigestFromServer(){ return null; }
public MyHelperClass ld;
	public MyHelperClass enc;
	public MyHelperClass led;
	public MyHelperClass dataArea;
	public MyHelperClass ONE_SECOND;
	public MyHelperClass timer;
	public MyHelperClass pwd;
	public MyHelperClass dsTask;
	public MyHelperClass log;
	public MyHelperClass v;
	public MyHelperClass returnCertificateToForm(){ return null; }
	public MyHelperClass getSubmitAfterSigning(){ return null; }
	public MyHelperClass submitForm(){ return null; }
	public MyHelperClass enableControls(boolean o0){ return null; }
	public MyHelperClass getCryptokiLib(){ return null; }
	public MyHelperClass sign(){ return null; }
	public MyHelperClass detectCardAndCriptoki(){ return null; }
	public MyHelperClass formatAsHexString(byte[] o0){ return null; }
	public MyHelperClass retriveEncodedDigestFromForm(){ return null; }
	public MyHelperClass verify(){ return null; }
	public MyHelperClass getSignerLabel(){ return null; }
	public MyHelperClass returnEncryptedDigestToForm(){ return null; }
	public MyHelperClass returnDigestToForm(){ return null; }
	public MyHelperClass retriveEncryptedDigestFromForm(){ return null; }
	public MyHelperClass encodeFromBytes(byte[] o0){ return null; }

    public void actionPerformed(java.awt.event.ActionEvent e) {
        try {
            MyHelperClass DigestSignTask = new MyHelperClass();
            setStatus(DigestSignTask.RESET, "");
            MyHelperClass sd = new MyHelperClass();
            if (e.getSource() == sd) if ((boolean)(Object)retriveEncodedDigestFromServer()) setStatus(DigestSignTask.RESET, "Inserire il pin e battere INVIO per firmare.");
            MyHelperClass pwd = new MyHelperClass();
            if (e.getSource() == pwd) {
//                MyHelperClass DigestSignTask = new MyHelperClass();
                initStatus(0, DigestSignTask.SIGN_MAXIMUM);
                if ((boolean)(Object)detectCardAndCriptoki()) {
                    dsTask =(MyHelperClass)(Object) new DigestSignTask(getCryptokiLib(), getSignerLabel(), log);
                    timer =(MyHelperClass)(Object) new Timer((String)(Object)ONE_SECOND,(boolean)(Object) new java.awt.event.ActionListener() {

                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            MyHelperClass dsTask = new MyHelperClass();
                            setStatus(dsTask.getCurrent(), dsTask.getMessage());
//                            MyHelperClass dsTask = new MyHelperClass();
                            if ((boolean)(Object)dsTask.done()) {
                                MyHelperClass timer = new MyHelperClass();
                                timer.stop();
                                MyHelperClass progressBar = new MyHelperClass();
                                progressBar.setValue(progressBar.getMinimum());
//                                MyHelperClass dsTask = new MyHelperClass();
                                if (dsTask.getCurrent() == DigestSignTask.SIGN_DONE) {
                                    MyHelperClass Toolkit = new MyHelperClass();
                                    Toolkit.getDefaultToolkit().beep();
//                                    MyHelperClass dsTask = new MyHelperClass();
                                    setEncryptedDigest(dsTask.getEncryptedDigest());
                                    returnEncryptedDigestToForm();
//                                    MyHelperClass dsTask = new MyHelperClass();
                                    setCertificate(dsTask.getCertificate());
                                    returnCertificateToForm();
                                    if ((boolean)(Object)getSubmitAfterSigning()) {
                                        submitForm();
                                    }
                                }
                                enableControls(true);
                            }
                        }
                    });
                    sign();
                }
            }
            if (e.getSource() == enc) {
                log.println("\nCalculating digest ...\n");
                java.security.MessageDigest md5 = java.security.MessageDigest.getInstance("MD5");
                md5.update((byte)(Object)dataArea.getText().getBytes("UTF8"));
                byte[] digest = md5.digest();
                log.println("digest:\n" + formatAsHexString(digest));
                log.println("Done.");
                setEncodedDigest(encodeFromBytes(digest));
                returnDigestToForm();
            }
            if (e.getSource() == ld) retriveEncodedDigestFromForm();
            if (e.getSource() == led) retriveEncryptedDigestFromForm();
            if (e.getSource() == v) {
                verify();
            }
        } catch (Exception ex) {
            log.println(ex.toString());
        } finally {
            pwd.setText("");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SIGN_DONE;
	public MyHelperClass SIGN_MAXIMUM;
	public MyHelperClass RESET;
public MyHelperClass done(){ return null; }
	public MyHelperClass getMessage(){ return null; }
	public MyHelperClass getCurrent(){ return null; }
	public MyHelperClass getCertificate(){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass setValue(MyHelperClass o0){ return null; }
	public MyHelperClass beep(){ return null; }
	public MyHelperClass getEncryptedDigest(){ return null; }
	public MyHelperClass getDefaultToolkit(){ return null; }
	public MyHelperClass println(String o0){ return null; }
	public MyHelperClass getBytes(String o0){ return null; }
	public MyHelperClass getMinimum(){ return null; }
	public MyHelperClass stop(){ return null; }
	public MyHelperClass getText(){ return null; }}

class DigestSignTask {

DigestSignTask(){}
	DigestSignTask(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){}}
