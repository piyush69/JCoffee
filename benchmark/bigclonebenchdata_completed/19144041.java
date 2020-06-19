import java.io.*;
import java.lang.*;
import java.util.*;



class c19144041 {
public MyHelperClass players;
	public MyHelperClass generateToken(byte[] o0){ return null; }

    public ChatClient registerPlayer(int playerId, String playerLogin) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-256");
        md.reset();
        md.update(playerLogin.getBytes("UTF-8"), 0, playerLogin.length());
        byte[] accountToken =(byte[])(Object) md.digest();
        byte[] token =(byte[])(Object) generateToken(accountToken);
        ChatClient chatClient = new ChatClient(playerId, token);
        players.put(playerId, chatClient);
        return chatClient;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass put(int o0, ChatClient o1){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class ChatClient {

ChatClient(int o0, byte[] o1){}
	ChatClient(){}}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }}
