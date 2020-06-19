import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18202328 {

    public void register(MinecraftSession session, String username, String verificationKey)  throws Throwable {
        MyHelperClass Configuration = new MyHelperClass();
        if ((boolean)(Object)Configuration.getConfiguration().isVerifyingNames()) {
            MyHelperClass HeartbeatManager = new MyHelperClass();
            long salt =(long)(Object) HeartbeatManager.getHeartbeatManager().getSalt();
            String hash = new StringBuilder().append(String.valueOf(salt)).append(username).toString();
            MessageDigest digest;
            try {
                digest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException("No MD5 algorithm!");
            }
            digest.update(hash.getBytes());
            if (!verificationKey.equals(new BigInteger(1, digest.digest()).toString(16))) {
                session.getActionSender().sendLoginFailure("Illegal name.");
                return;
            }
        }
        char[] nameChars = username.toCharArray();
        for (char nameChar : nameChars) {
            if (nameChar < ' ' || nameChar > '\177') {
                session.getActionSender().sendLoginFailure("Invalid name!");
                return;
            }
        }
        MyHelperClass playerList = new MyHelperClass();
        for (Player p :(Player[])(Object) (Object[])(Object)playerList.getPlayers()) {
            if ((boolean)(Object)p.getName().equalsIgnoreCase(username)) {
                p.getSession().getActionSender().sendLoginFailure("Logged in from another computer.");
                break;
            }
        }
        final Player player = new Player(session, username);
//        MyHelperClass playerList = new MyHelperClass();
        if (!(Boolean)(Object)playerList.add(player)) {
            player.getSession().getActionSender().sendLoginFailure("Too many players online!");
            return;
        }
        session.setPlayer(player);
//        MyHelperClass Configuration = new MyHelperClass();
        final Configuration c =(Configuration)(Object) Configuration.getConfiguration();
        MyHelperClass Constants = new MyHelperClass();
        session.getActionSender().sendLoginResponse(Constants.PROTOCOL_VERSION, c.getName(), c.getMessage(), false);
        MyHelperClass LevelGzipper = new MyHelperClass();
        LevelGzipper.getLevelGzipper().gzipLevel(session);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PROTOCOL_VERSION;
public MyHelperClass getConfiguration(){ return null; }
	public MyHelperClass getHeartbeatManager(){ return null; }
	public MyHelperClass add(Player o0){ return null; }
	public MyHelperClass gzipLevel(MinecraftSession o0){ return null; }
	public MyHelperClass equalsIgnoreCase(String o0){ return null; }
	public MyHelperClass isVerifyingNames(){ return null; }
	public MyHelperClass getSalt(){ return null; }
	public MyHelperClass getLevelGzipper(){ return null; }
	public MyHelperClass getPlayers(){ return null; }
	public MyHelperClass sendLoginFailure(String o0){ return null; }
	public MyHelperClass sendLoginResponse(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, boolean o3){ return null; }
	public MyHelperClass getActionSender(){ return null; }}

class MinecraftSession {

public MyHelperClass setPlayer(Player o0){ return null; }
	public MyHelperClass getActionSender(){ return null; }}

class Player {

Player(MinecraftSession o0, String o1){}
	Player(){}
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getSession(){ return null; }}

class Configuration {

public MyHelperClass getMessage(){ return null; }
	public MyHelperClass getName(){ return null; }}
