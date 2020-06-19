
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c5157858 {
public MyHelperClass assertEquals(String o0, boolean o1, MyHelperClass o2){ return null; }
	public MyHelperClass assertEquals(double o0, MyHelperClass o1, double o2){ return null; }
public MyHelperClass fail(String o0){ return null; }
public MyHelperClass trsPort;
	public MyHelperClass generateRateUserRequest(String o0){ return null; }

    private void simulate() throws Exception {
        BufferedWriter out = null;
        MyHelperClass outFile = new MyHelperClass();
        out = new BufferedWriter(new FileWriter(outFile));
        out.write("#Thread\tReputation\tAction\n");
        out.flush();
        System.out.println("Simulate...");
        MyHelperClass trsDemoSimulationfile = new MyHelperClass();
        File file = new File(trsDemoSimulationfile);
        ObtainUserReputation obtainUserReputationRequest = new ObtainUserReputation();
        ObtainUserReputationResponse obtainUserReputationResponse;
        RateUser rateUserRequest;
        RateUserResponse rateUserResponse;
        FileInputStream fis = new FileInputStream(file);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        String call =(String)(Object) br.readLine();
        while (call != null) {
            rateUserRequest =(RateUser)(Object) generateRateUserRequest(call);
            try {
                rateUserResponse =(RateUserResponse)(Object) trsPort.rateUser(rateUserRequest);
                System.out.println("----------------R A T I N G-------------------");
                System.out.println("VBE: " + rateUserRequest.getVbeId());
                System.out.println("VO: " + rateUserRequest.getVoId());
                System.out.println("USER: " + rateUserRequest.getUserId());
                System.out.println("SERVICE: " + rateUserRequest.getServiceId());
                System.out.println("ACTION: " + rateUserRequest.getActionId());
                System.out.println("OUTCOME: " + rateUserResponse.isOutcome());
                System.out.println("----------------------------------------------");
                assertEquals("The outcome field of the rateUser should be true: MESSAGE=" + rateUserResponse.getMessage(), true, rateUserResponse.isOutcome());
            } catch (UncheckedIOException e) {
                fail(e.getMessage());
            }
            obtainUserReputationRequest.setIoi(null);
            obtainUserReputationRequest.setServiceId(null);
            obtainUserReputationRequest.setUserId(rateUserRequest.getUserId());
            obtainUserReputationRequest.setVbeId(rateUserRequest.getVbeId());
            obtainUserReputationRequest.setVoId(null);
            try {
                obtainUserReputationResponse =(ObtainUserReputationResponse)(Object) trsPort.obtainUserReputation(obtainUserReputationRequest);
                System.out.println("-----------R E P U T A T I O N----------------");
                System.out.println("VBE: " + obtainUserReputationRequest.getVbeId());
                System.out.println("VO: " + obtainUserReputationRequest.getVoId());
                System.out.println("USER: " + obtainUserReputationRequest.getUserId());
                System.out.println("SERVICE: " + obtainUserReputationRequest.getServiceId());
                System.out.println("IOI: " + obtainUserReputationRequest.getIoi());
                System.out.println("REPUTATION: " + obtainUserReputationResponse.getReputation());
                System.out.println("----------------------------------------------");
                assertEquals("The outcome field of the obtainUserReputation should be true: MESSAGE=" + obtainUserReputationResponse.getMessage(), true, obtainUserReputationResponse.isOutcome());
                assertEquals(0.0, obtainUserReputationResponse.getReputation(), 1.0);
            } catch (UncheckedIOException e) {
                fail(e.getMessage());
            }
            obtainUserReputationRequest.setIoi(null);
            obtainUserReputationRequest.setServiceId(null);
            obtainUserReputationRequest.setUserId(rateUserRequest.getUserId());
            obtainUserReputationRequest.setVbeId(rateUserRequest.getVbeId());
            obtainUserReputationRequest.setVoId(rateUserRequest.getVoId());
            try {
                obtainUserReputationResponse =(ObtainUserReputationResponse)(Object) trsPort.obtainUserReputation(obtainUserReputationRequest);
                System.out.println("-----------R E P U T A T I O N----------------");
                System.out.println("VBE: " + obtainUserReputationRequest.getVbeId());
                System.out.println("VO: " + obtainUserReputationRequest.getVoId());
                System.out.println("USER: " + obtainUserReputationRequest.getUserId());
                System.out.println("SERVICE: " + obtainUserReputationRequest.getServiceId());
                System.out.println("IOI: " + obtainUserReputationRequest.getIoi());
                System.out.println("REPUTATION: " + obtainUserReputationResponse.getReputation());
                System.out.println("----------------------------------------------");
                assertEquals("The outcome field of the obtainUserReputation should be true: MESSAGE=" + obtainUserReputationResponse.getMessage(), true, obtainUserReputationResponse.isOutcome());
                assertEquals(0.0, obtainUserReputationResponse.getReputation(), 1.0);
            } catch (UncheckedIOException e) {
                fail(e.getMessage());
            }
            call =(String)(Object) br.readLine();
        }
        fis.close();
        br.close();
        out.flush();
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass rateUser(RateUser o0){ return null; }
	public MyHelperClass obtainUserReputation(ObtainUserReputation o0){ return null; }}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(FileWriter o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(String o0){ return null; }}

class FileWriter {

FileWriter(MyHelperClass o0){}
	FileWriter(){}}

class File {

File(MyHelperClass o0){}
	File(){}}

class ObtainUserReputation {

public MyHelperClass getIoi(){ return null; }
	public MyHelperClass getVbeId(){ return null; }
	public MyHelperClass setIoi(Object o0){ return null; }
	public MyHelperClass setVbeId(MyHelperClass o0){ return null; }
	public MyHelperClass setServiceId(Object o0){ return null; }
	public MyHelperClass getServiceId(){ return null; }
	public MyHelperClass setVoId(Object o0){ return null; }
	public MyHelperClass setUserId(MyHelperClass o0){ return null; }
	public MyHelperClass getVoId(){ return null; }
	public MyHelperClass getUserId(){ return null; }}

class ObtainUserReputationResponse {

public MyHelperClass getMessage(){ return null; }
	public MyHelperClass isOutcome(){ return null; }
	public MyHelperClass getReputation(){ return null; }}

class RateUser {

public MyHelperClass getVbeId(){ return null; }
	public MyHelperClass getServiceId(){ return null; }
	public MyHelperClass getVoId(){ return null; }
	public MyHelperClass getUserId(){ return null; }
	public MyHelperClass getActionId(){ return null; }}

class RateUserResponse {

public MyHelperClass getMessage(){ return null; }
	public MyHelperClass isOutcome(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(FileInputStream o0){}
	InputStreamReader(){}}

class RemoteException extends Exception{
	public RemoteException(String errorMessage) { super(errorMessage); }
}
