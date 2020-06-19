


class c4645936 {

    public static void creme_connect(String email, String username, String password, String IDnumber, TRP[] trp_array, GTRN[] gtrn_array, FLUX[] flux_array, TRANS[] trans_array, LETSPEC[] letspec_array, PUP[] pup_array, HUP[] hup_array, DOSE[] dose_array) {
        int num_of_files = trp_array.length + gtrn_array.length + flux_array.length + trans_array.length + letspec_array.length + pup_array.length + hup_array.length + dose_array.length;
        int index = 0;
        String[] files_to_upload = new String[num_of_files];
        for (int a = 0; a < trp_array.length; a++) {
            files_to_upload[index] =(String)(Object) trp_array[a].getThisFileName();
            index++;
        }
        for (int a = 0; a < gtrn_array.length; a++) {
            files_to_upload[index] =(String)(Object) gtrn_array[a].getThisFileName();
            index++;
        }
        for (int a = 0; a < flux_array.length; a++) {
            files_to_upload[index] =(String)(Object) flux_array[a].getThisFileName();
            index++;
        }
        for (int a = 0; a < trans_array.length; a++) {
            files_to_upload[index] =(String)(Object) trans_array[a].getThisFileName();
            index++;
        }
        for (int a = 0; a < letspec_array.length; a++) {
            files_to_upload[index] =(String)(Object) letspec_array[a].getThisFileName();
            index++;
        }
        for (int a = 0; a < pup_array.length; a++) {
            files_to_upload[index] =(String)(Object) pup_array[a].getThisFileName();
            index++;
        }
        for (int a = 0; a < hup_array.length; a++) {
            files_to_upload[index] =(String)(Object) hup_array[a].getThisFileName();
            index++;
        }
        for (int a = 0; a < dose_array.length; a++) {
            files_to_upload[index] =(String)(Object) dose_array[a].getThisFileName();
            index++;
        }
        MyHelperClass Logger = new MyHelperClass();
        Logger log =(Logger)(Object) Logger.getLogger(CreateAStudy.class);
        String host = "creme96.nrl.navy.mil";
        String user = "anonymous";
        String ftppass = email;
        MyHelperClass Level = new MyHelperClass();
        Logger.setLevel(Level.ALL);
        FTPClient ftp = null;
        try {
            ftp = new FTPClient();
            ftp.setRemoteHost(host);
            FTPMessageCollector listener = new FTPMessageCollector();
            ftp.setMessageListener(listener);
            log.info("Connecting");
            ftp.connect();
            log.info("Logging in");
            ftp.login(user, ftppass);
            log.debug("Setting up passive, ASCII transfers");
            MyHelperClass FTPConnectMode = new MyHelperClass();
            ftp.setConnectMode(FTPConnectMode.ACTIVE);
            MyHelperClass FTPTransferType = new MyHelperClass();
            ftp.setType(FTPTransferType.BINARY);
            log.info("Putting file");
            for (int u = 0; u < files_to_upload.length; u++) {
                ftp.put(files_to_upload[u], files_to_upload[u]);
            }
            log.info("Quitting client");
            ftp.quit();
            log.debug("Listener log:");
            log.info("Test complete");
        } catch (Exception e) {
            log.error("Demo failed", e);
            e.printStackTrace();
        }
        System.out.println("Finished FTPing User Request Files to common directory");
        MyHelperClass Upload_Files = new MyHelperClass();
        Upload_Files.upload(files_to_upload, username, password, IDnumber);
        System.out.println("Finished transfering User Request Files to your CREME96 personal directory");
        MyHelperClass RunRoutines = new MyHelperClass();
        RunRoutines.routines(files_to_upload, username, password, IDnumber);
        System.out.println("Finished running all of your uploaded routines");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ACTIVE;
	public MyHelperClass BINARY;
	public MyHelperClass ALL;
public MyHelperClass upload(String[] o0, String o1, String o2, String o3){ return null; }
	public MyHelperClass setLevel(MyHelperClass o0){ return null; }
	public MyHelperClass getLogger(Class<CreateAStudy> o0){ return null; }
	public MyHelperClass routines(String[] o0, String o1, String o2, String o3){ return null; }}

class TRP {

public MyHelperClass getThisFileName(){ return null; }}

class GTRN {

public MyHelperClass getThisFileName(){ return null; }}

class FLUX {

public MyHelperClass getThisFileName(){ return null; }}

class TRANS {

public MyHelperClass getThisFileName(){ return null; }}

class LETSPEC {

public MyHelperClass getThisFileName(){ return null; }}

class PUP {

public MyHelperClass getThisFileName(){ return null; }}

class HUP {

public MyHelperClass getThisFileName(){ return null; }}

class DOSE {

public MyHelperClass getThisFileName(){ return null; }}

class Logger {

public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class CreateAStudy {

}

class FTPClient {

public MyHelperClass setType(MyHelperClass o0){ return null; }
	public MyHelperClass setRemoteHost(String o0){ return null; }
	public MyHelperClass quit(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass setMessageListener(FTPMessageCollector o0){ return null; }
	public MyHelperClass put(String o0, String o1){ return null; }
	public MyHelperClass setConnectMode(MyHelperClass o0){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }}

class FTPMessageCollector {

}
