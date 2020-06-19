
import java.io.UncheckedIOException;


class c17341373 {
public MyHelperClass initUDPSocketAndStartPacketReader(MyHelperClass o0, int o1){ return null; }
public MyHelperClass _logger;
	public MyHelperClass sendTCPPacket(DataPacket o0){ return null; }
	public MyHelperClass makeClientKey(MyHelperClass o0, MyHelperClass o1){ return null; }

    private void handleServerIntroduction(DataPacket serverPacket) {
        DataPacketIterator iter =(DataPacketIterator)(Object) serverPacket.getDataPacketIterator();
        String version =(String)(Object) iter.nextString();
        int serverReportedUDPPort =(int)(Object) iter.nextUByte2();
        MyHelperClass _authKey = new MyHelperClass();
        _authKey = iter.nextUByte4();
        MyHelperClass _introKey = new MyHelperClass();
        _introKey = iter.nextUByte4();
        MyHelperClass _clientKey = new MyHelperClass();
        _clientKey = makeClientKey(_authKey, _introKey);
        String passwordKey =(String)(Object) iter.nextString();
        MyHelperClass Level = new MyHelperClass();
        _logger.log(Level.INFO, "Connection to version " + version + " with udp port " + serverReportedUDPPort);
        DataPacket packet = null;
        MyHelperClass _tcpSocket = new MyHelperClass();
        if ((boolean)(Object)initUDPSocketAndStartPacketReader(_tcpSocket.getInetAddress(), serverReportedUDPPort)) {
            ParameterBuilder builder = new ParameterBuilder();
            MyHelperClass _udpSocket = new MyHelperClass();
            builder.appendUByte2(_udpSocket.getLocalPort());
            MyHelperClass _user = new MyHelperClass();
            builder.appendString(_user);
            MessageDigest md5 = null;
            try {
                MyHelperClass MessageDigest = new MyHelperClass();
                md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            } catch (UncheckedIOException ignore) {
            }
            MyHelperClass _serverKey = new MyHelperClass();
            md5.update((byte[])(Object)_serverKey.getBytes());
            md5.update(passwordKey.getBytes());
            MyHelperClass _password = new MyHelperClass();
            md5.update((byte[])(Object)_password.getBytes());
            for (byte b :(byte[])(Object) (Object[])(Object)md5.digest()) {
                builder.appendByte(b);
            }
            MyHelperClass ClientCommandConstants = new MyHelperClass();
            packet =(DataPacket)(Object) new DataPacketImpl(ClientCommandConstants.INTRODUCTION, builder.toParameter());
        } else {
            MyHelperClass ClientCommandConstants = new MyHelperClass();
            packet =(DataPacket)(Object) new DataPacketImpl(ClientCommandConstants.TCP_ONLY);
        }
        sendTCPPacket(packet);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INTRODUCTION;
	public MyHelperClass TCP_ONLY;
	public MyHelperClass INFO;
public MyHelperClass getLocalPort(){ return null; }
	public MyHelperClass getInetAddress(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getBytes(){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class DataPacket {

public MyHelperClass getDataPacketIterator(){ return null; }}

class DataPacketIterator {

public MyHelperClass nextString(){ return null; }
	public MyHelperClass nextUByte4(){ return null; }
	public MyHelperClass nextUByte2(){ return null; }}

class ParameterBuilder {

public MyHelperClass appendUByte2(MyHelperClass o0){ return null; }
	public MyHelperClass appendByte(byte o0){ return null; }
	public MyHelperClass toParameter(){ return null; }
	public MyHelperClass appendString(MyHelperClass o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class DataPacketImpl {

DataPacketImpl(MyHelperClass o0, MyHelperClass o1){}
	DataPacketImpl(MyHelperClass o0){}
	DataPacketImpl(){}}
