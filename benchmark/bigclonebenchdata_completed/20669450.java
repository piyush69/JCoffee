import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20669450 {

    private void auth() throws Throwable, IOException {
        MyHelperClass authorized = new MyHelperClass();
        authorized = false;
        MyHelperClass seqNumber = new MyHelperClass();
        seqNumber = 0;
        DatagramSocket ds = new DatagramSocket();
        MyHelperClass UDPHID_DEFAULT_TIMEOUT = new MyHelperClass();
        ds.setSoTimeout(UDPHID_DEFAULT_TIMEOUT);
        MyHelperClass addr = new MyHelperClass();
        ds.connect(addr, port);
        MyHelperClass buffer = new MyHelperClass();
        DatagramPacket p = new DatagramPacket(buffer.array(), buffer.capacity());
        MyHelperClass UDPHID_DEFAULT_ATTEMPTS = new MyHelperClass();
        for (int i = 0; i < UDPHID_DEFAULT_ATTEMPTS; i++) {
            MyHelperClass buffer = new MyHelperClass();
            buffer.clear();
            MyHelperClass REQ_CHALLENGE = new MyHelperClass();
            buffer.put((byte) REQ_CHALLENGE);
            MyHelperClass UDPHID_PROTO = new MyHelperClass();
            buffer.put(htons((short) UDPHID_PROTO));
            MyHelperClass name = new MyHelperClass();
            buffer.put(name.getBytes());
            MyHelperClass buffer = new MyHelperClass();
            ds.send(new DatagramPacket(buffer.array(), buffer.position()));
            MyHelperClass buffer = new MyHelperClass();
            buffer.clear();
            try {
                ds.receive(p);
            } catch (SocketTimeoutException e) {
                continue;
            }
            MyHelperClass buffer = new MyHelperClass();
            switch(buffer.get()) {
                MyHelperClass ANS_CHALLENGE = new MyHelperClass();
                case ANS_CHALLENGE:
                    break;
                MyHelperClass ANS_FAILURE = new MyHelperClass();
                case ANS_FAILURE:
                    throw new IOException("REQ_FAILURE");
                default:
                    throw new IOException("invalid packet");
            }
            MyHelperClass buffer = new MyHelperClass();
            byte challenge_id = buffer.get();
            MyHelperClass buffer = new MyHelperClass();
            int challenge_len = (int) buffer.get();
            byte[] challenge = new byte[challenge_len];
            MyHelperClass buffer = new MyHelperClass();
            buffer.get(challenge, 0, p.getLength() - buffer.position());
            byte[] response;
            try {
                MessageDigest md = MessageDigest.getInstance("MD5");
                md.update(challenge_id);
                MyHelperClass password = new MyHelperClass();
                md.update(password.getBytes(), 0, password.length());
                md.update(challenge, 0, challenge.length);
                response = md.digest();
            } catch (NoSuchAlgorithmException e) {
                throw new IOException("NoSuchAlgorithmException: " + e.toString());
            }
            MyHelperClass buffer = new MyHelperClass();
            buffer.clear();
            MyHelperClass REQ_RESPONSE = new MyHelperClass();
            buffer.put((byte) REQ_RESPONSE);
            MyHelperClass buffer = new MyHelperClass();
            buffer.put(challenge_id);
            MyHelperClass buffer = new MyHelperClass();
            buffer.put((byte) response.length);
            MyHelperClass buffer = new MyHelperClass();
            buffer.put(response);
            MyHelperClass login = new MyHelperClass();
            buffer.put(login.getBytes());
            MyHelperClass buffer = new MyHelperClass();
            ds.send(new DatagramPacket(buffer.array(), buffer.position()));
            MyHelperClass buffer = new MyHelperClass();
            buffer.clear();
            try {
                ds.receive(p);
            } catch (SocketTimeoutException e) {
                continue;
            }
            MyHelperClass buffer = new MyHelperClass();
            switch(buffer.get()) {
                MyHelperClass ANS_SUCCESS = new MyHelperClass();
                case ANS_SUCCESS:
                    MyHelperClass buffer = new MyHelperClass();
                    int sidLength = buffer.get();
                    MyHelperClass sid = new MyHelperClass();
                    sid = new byte[sidLength];
                    MyHelperClass sid = new MyHelperClass();
                    buffer.get(sid, 0, sidLength);
                    MyHelperClass authorized = new MyHelperClass();
                    authorized = true;
                    return;
                MyHelperClass ANS_FAILURE = new MyHelperClass();
                case ANS_FAILURE:
                    throw new IOException("access deny");
                default:
                    throw new IOException("invalid packet");
            }
        }
        throw new IOException("operation time out");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
