import java.io.*;
import java.lang.*;
import java.util.*;



class c2022160 {
public MyHelperClass reactToHandshakeStatus(MyHelperClass o0){ return null; }
public MyHelperClass m_writer;
	public MyHelperClass Status;

    public ByteBuffer[] write(ByteBuffer[] byteBuffers) {
        MyHelperClass m_sslInitiated = new MyHelperClass();
        if (!(Boolean)(Object)m_sslInitiated) {
            MyHelperClass m_writer = new MyHelperClass();
            return(ByteBuffer[])(Object) m_writer.write(byteBuffers);
        }
        MyHelperClass m_engine = new MyHelperClass();
        if (m_engine.getHandshakeStatus() != SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
            MyHelperClass NIOUtils = new MyHelperClass();
            if (!(Boolean)(Object)NIOUtils.isEmpty(byteBuffers)) {
                MyHelperClass m_initialOutBuffer = new MyHelperClass();
                m_initialOutBuffer = NIOUtils.concat(m_initialOutBuffer,(ByteBuffer[])(Object) m_writer.write(byteBuffers));
                byteBuffers = new ByteBuffer[0];
            }
            MyHelperClass SSL_BUFFER = new MyHelperClass();
            ByteBuffer buffer =(ByteBuffer)(Object) SSL_BUFFER.get();
            ByteBuffer[] buffers = null;
            try {
                SSLEngineResult result = null;
//                MyHelperClass m_engine = new MyHelperClass();
                while (m_engine.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_WRAP) {
                    buffer.clear();
//                    MyHelperClass m_engine = new MyHelperClass();
                    result =(SSLEngineResult)(Object) m_engine.wrap(byteBuffers, buffer);
                    buffer.flip();
//                    MyHelperClass NIOUtils = new MyHelperClass();
                    buffers =(ByteBuffer[])(Object) NIOUtils.concat((MyHelperClass)(Object)buffers,(ByteBuffer[])(Object) NIOUtils.copy(buffer));
                }
                if (result == null) return null;
                if (result.getStatus() != Status.OK) throw new SSLException("Unexpectedly not ok wrapping handshake data, was " + result.getStatus());
                reactToHandshakeStatus(result.getHandshakeStatus());
            } catch (SSLException e) {
                throw new RuntimeException(e);
            }
            return buffers;
        }
        MyHelperClass SSL_BUFFER = new MyHelperClass();
        ByteBuffer buffer =(ByteBuffer)(Object) SSL_BUFFER.get();
        buffer.clear();
        MyHelperClass NIOUtils = new MyHelperClass();
        if ((boolean)(Object)NIOUtils.isEmpty(byteBuffers)) {
            MyHelperClass m_initialOutBuffer = new MyHelperClass();
            if (m_initialOutBuffer == null) return null;
        } else {
            MyHelperClass m_writer = new MyHelperClass();
            byteBuffers =(ByteBuffer[])(Object) m_writer.write(byteBuffers);
        }
        MyHelperClass m_initialOutBuffer = new MyHelperClass();
        if (m_initialOutBuffer != null) {
//            MyHelperClass m_initialOutBuffer = new MyHelperClass();
            byteBuffers =(ByteBuffer[])(Object) NIOUtils.concat(m_initialOutBuffer, byteBuffers);
//            MyHelperClass m_initialOutBuffer = new MyHelperClass();
            m_initialOutBuffer = null;
        }
        ByteBuffer[] encrypted = null;
//        MyHelperClass NIOUtils = new MyHelperClass();
        while (!(Boolean)(Object)NIOUtils.isEmpty(byteBuffers)) {
            buffer.clear();
            try {
//                MyHelperClass m_engine = new MyHelperClass();
                m_engine.wrap(byteBuffers, buffer);
            } catch (UncheckedIOException e) {
                throw new RuntimeException(e);
            }
            buffer.flip();
//            MyHelperClass NIOUtils = new MyHelperClass();
            encrypted =(ByteBuffer[])(Object) NIOUtils.concat((MyHelperClass)(Object)encrypted,(ByteBuffer[])(Object) NIOUtils.copy(buffer));
        }
        return encrypted;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NOT_HANDSHAKING;
	public MyHelperClass OK;
	public MyHelperClass NEED_WRAP;
public MyHelperClass copy(ByteBuffer o0){ return null; }
	public MyHelperClass write(ByteBuffer[] o0){ return null; }
	public MyHelperClass isEmpty(ByteBuffer[] o0){ return null; }
	public MyHelperClass wrap(ByteBuffer[] o0, ByteBuffer o1){ return null; }
	public MyHelperClass concat(MyHelperClass o0, ByteBuffer[] o1){ return null; }
	public MyHelperClass get(){ return null; }
	public MyHelperClass getHandshakeStatus(){ return null; }}

class ByteBuffer {

public MyHelperClass flip(){ return null; }
	public MyHelperClass clear(){ return null; }}

class SSLEngineResult {
public static MyHelperClass HandshakeStatus;
public MyHelperClass getStatus(){ return null; }
	public MyHelperClass getHandshakeStatus(){ return null; }}

class SSLException extends Exception{
	public SSLException(String errorMessage) { super(errorMessage); }
}
