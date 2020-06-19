


class c12413227 {
public MyHelperClass assertTrue(MyHelperClass o0){ return null; }
public MyHelperClass[] sipPhoneReceivers;
public MyHelperClass CLICK2DIAL_PARAMS;
	public MyHelperClass Response;
	public MyHelperClass logger;
	public MyHelperClass timeout;
//	public MyHelperClass sipPhoneReceivers;
	public MyHelperClass receiversCount;
	public MyHelperClass CLICK2DIAL_URL;
	public MyHelperClass init(){ return null; }

    public void testClickToCallOutDirection() throws Exception {
        init();
        SipCall[] receiverCalls = new SipCall[(int)(Object)receiversCount];
        receiverCalls[0] =(SipCall)(Object) sipPhoneReceivers[0].createSipCall();
        receiverCalls[1] =(SipCall)(Object) sipPhoneReceivers[1].createSipCall();
        receiverCalls[0].listenForIncomingCall();
        receiverCalls[1].listenForIncomingCall();
        logger.info("Trying to reach url : " + CLICK2DIAL_URL + CLICK2DIAL_PARAMS);
        URL url = new URL((int)(Object)CLICK2DIAL_URL + (int)(Object)CLICK2DIAL_PARAMS);
        InputStream in =(InputStream)(Object) url.openConnection().getInputStream();
        byte[] buffer = new byte[10000];
        int len =(int)(Object) in.read(buffer);
        String httpResponse = "";
        for (int q = 0; q < len; q++) httpResponse += (char) buffer[q];
        logger.info("Received the follwing HTTP response: " + httpResponse);
        receiverCalls[0].waitForIncomingCall(timeout);
        assertTrue(receiverCalls[0].sendIncomingCallResponse(Response.RINGING, "Ringing", 0));
        assertTrue(receiverCalls[0].sendIncomingCallResponse(Response.OK, "OK", 0));
        receiverCalls[1].waitForIncomingCall(timeout);
        assertTrue(receiverCalls[1].sendIncomingCallResponse(Response.RINGING, "Ringing", 0));
        assertTrue(receiverCalls[1].sendIncomingCallResponse(Response.OK, "OK", 0));
        assertTrue(receiverCalls[1].waitForAck(timeout));
        assertTrue(receiverCalls[0].waitForAck(timeout));
        assertTrue(receiverCalls[0].disconnect());
        assertTrue(receiverCalls[1].waitForDisconnect(timeout));
        assertTrue(receiverCalls[1].respondToDisconnect());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass RINGING;
	public MyHelperClass OK;
public MyHelperClass createSipCall(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass info(String o0){ return null; }}

class SipCall {

public MyHelperClass waitForDisconnect(MyHelperClass o0){ return null; }
	public MyHelperClass waitForIncomingCall(MyHelperClass o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass listenForIncomingCall(){ return null; }
	public MyHelperClass waitForAck(MyHelperClass o0){ return null; }
	public MyHelperClass sendIncomingCallResponse(MyHelperClass o0, String o1, int o2){ return null; }
	public MyHelperClass respondToDisconnect(){ return null; }}

class URL {

URL(int o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}
