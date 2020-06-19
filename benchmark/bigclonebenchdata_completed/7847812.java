import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7847812 {
public MyHelperClass fireEvent(ConnectEvent o0){ return null; }
	public MyHelperClass sendAction(LoginAction o0){ return null; }
	public MyHelperClass sendAction(ChallengeAction o0){ return null; }
public MyHelperClass protocolIdentifier;
	public MyHelperClass version;
	public MyHelperClass password;
	public MyHelperClass username;
	public MyHelperClass DateUtil;
	public MyHelperClass writer;
	public MyHelperClass reader;
	public MyHelperClass ManagerUtil;
	public MyHelperClass socket;
	public MyHelperClass determineVersion(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getProtocolIdentifier(){ return null; }
	public MyHelperClass disconnect(){ return null; }

    protected synchronized void doLogin(long timeout, String eventMask) throws Throwable, IOException, AuthenticationFailedException, TimeoutException {
        ChallengeAction challengeAction;
        ManagerResponse challengeResponse;
        String challenge;
        String key;
        LoginAction loginAction;
        ManagerResponse loginResponse;
        MyHelperClass socket = new MyHelperClass();
        if (socket == null) {
            connect();
        }
        if (!(Boolean)(Object)socket.isConnected()) {
            connect();
        }
        synchronized (protocolIdentifier) {
            if (protocolIdentifier.value == null) {
                try {
                    protocolIdentifier.wait(timeout);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            if (protocolIdentifier.value == null) {
                disconnect();
                if (reader != null && reader.getTerminationException() != null) {
                    throw(Throwable)(Object) reader.getTerminationException();
                } else {
                    throw new TimeoutException("Timeout waiting for protocol identifier");
                }
            }
        }
        challengeAction = new ChallengeAction("MD5");
        try {
            challengeResponse =(ManagerResponse)(Object) sendAction(challengeAction);
        } catch (Exception e) {
            disconnect();
            throw new AuthenticationFailedException("Unable to send challenge action", e);
        }
        if ((ChallengeResponse)(Object)challengeResponse instanceof ChallengeResponse) {
            challenge =(String)(Object) ((ChallengeResponse)(ChallengeResponse)(Object) challengeResponse).getChallenge();
        } else {
            disconnect();
            throw new AuthenticationFailedException("Unable to get challenge from Asterisk. ChallengeAction returned: " + challengeResponse.getMessage());
        }
        try {
            MessageDigest md;
            md = MessageDigest.getInstance("MD5");
            if (challenge != null) {
                md.update(challenge.getBytes());
            }
            if (password != null) {
                md.update((byte)(Object)password.getBytes());
            }
            key =(String)(Object) ManagerUtil.toHexString(md.digest());
        } catch (NoSuchAlgorithmException ex) {
            disconnect();
            throw new AuthenticationFailedException("Unable to create login key using MD5 Message Digest", ex);
        }
        loginAction = new LoginAction(username, "MD5", key, eventMask);
        try {
            loginResponse =(ManagerResponse)(Object) sendAction(loginAction);
        } catch (Exception e) {
            disconnect();
            throw new AuthenticationFailedException("Unable to send login action", e);
        }
        if ((ManagerError)(Object)loginResponse instanceof ManagerError) {
            disconnect();
            throw new AuthenticationFailedException((String)(Object)loginResponse.getMessage());
        }
        version = determineVersion();
        writer.setTargetVersion(version);
        ConnectEvent connectEvent = new ConnectEvent(this);
        connectEvent.setProtocolIdentifier(getProtocolIdentifier());
        connectEvent.setDateReceived(DateUtil.getDate());
        fireEvent(connectEvent);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass value;
public MyHelperClass getDate(){ return null; }
	public MyHelperClass getTerminationException(){ return null; }
	public MyHelperClass toHexString(byte[] o0){ return null; }
	public MyHelperClass getBytes(){ return null; }
	public MyHelperClass isConnected(){ return null; }
	public MyHelperClass setTargetVersion(MyHelperClass o0){ return null; }}

class AuthenticationFailedException extends Exception{
	public AuthenticationFailedException(String errorMessage) { super(errorMessage); }
	AuthenticationFailedException(String o0, Exception o1){}
	AuthenticationFailedException(){}
	AuthenticationFailedException(String o0, NoSuchAlgorithmException o1){}
}

class TimeoutException extends Exception{
	public TimeoutException(String errorMessage) { super(errorMessage); }
}

class ChallengeAction {

ChallengeAction(String o0){}
	ChallengeAction(){}}

class ManagerResponse {

public MyHelperClass getMessage(){ return null; }}

class LoginAction {

LoginAction(){}
	LoginAction(MyHelperClass o0, String o1, String o2, String o3){}}

class ChallengeResponse {

public MyHelperClass getChallenge(){ return null; }}

class ManagerError {

}

class ConnectEvent {

ConnectEvent(){}
	ConnectEvent(c7847812 o0){}
	public MyHelperClass setDateReceived(MyHelperClass o0){ return null; }
	public MyHelperClass setProtocolIdentifier(MyHelperClass o0){ return null; }}
