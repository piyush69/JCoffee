import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c12297431 {
public MyHelperClass ChatRoom;
	public MyHelperClass ClientDirector;
	public MyHelperClass DataManager;
	public MyHelperClass JOptionPane;
	public MyHelperClass tabbedPane;
	public MyHelperClass Debug;
	public MyHelperClass b_createChatRoom;
	public MyHelperClass currentPrimaryKey;
	public MyHelperClass getMyCurrentChatPrimaryKey(){ return null; }

    public void actionPerformed(ActionEvent ae) {
        String actionCommand =(String)(Object) ae.getActionCommand();
        if (actionCommand == null) {
            return;
        }
        MyHelperClass DataManager = new MyHelperClass();
        if ((boolean)(Object)DataManager.SHOW_DEBUG) {
            System.out.println("Action command : " + actionCommand);
        }
        MyHelperClass ClientDirector = new MyHelperClass();
        DataManager dataManager =(DataManager)(Object) ClientDirector.getDataManager();
        PlayerImpl myPlayer =(PlayerImpl)(Object) dataManager.getMyPlayer();
        if (!(Boolean)(Object)myPlayer.getLocation().isRoom() && actionCommand.equals("createChatRoom")) {
            MyHelperClass JOptionPane = new MyHelperClass();
            JOptionPane.showMessageDialog(null, "Sorry, but you can not create/leave chat channels\n" + "on World/Town Maps.", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (actionCommand.equals("createChatRoom")) {
            WotlasLocation chatRoomLocation =(WotlasLocation)(Object) myPlayer.getLocation();
            MyHelperClass JOptionPane = new MyHelperClass();
            String chatRoomName =(String)(Object) JOptionPane.showInputDialog("Please enter a Name:");
            if (chatRoomName == null || chatRoomName.length() == 0) {
                return;
            }
            if ((int)(Object)this.tabbedPane.getTabCount() >=(int)(Object) ChatRoom.MAXIMUM_CHATROOMS_PER_ROOM - 1) {
                this.b_createChatRoom.setEnabled(false);
            } else {
                this.b_createChatRoom.setEnabled(true);
            }
            myPlayer.sendMessage(new ChatRoomCreationMessage(chatRoomName, myPlayer.getPrimaryKey()));
        } else if (actionCommand.equals("leaveChatRoom")) {
            if (!this.currentPrimaryKey.equals(ChatRoom.DEFAULT_CHAT)) {
                myPlayer.sendMessage(new RemPlayerFromChatRoomMessage(myPlayer.getPrimaryKey(), this.currentPrimaryKey));
            }
        } else if (actionCommand.equals("helpChat")) {
            DataManager dManager =(DataManager)(Object) ClientDirector.getDataManager();
            dManager.sendMessage(new SendTextMessage(dManager.getMyPlayer().getPrimaryKey(), dManager.getMyPlayer().getPlayerName(), getMyCurrentChatPrimaryKey(), "/help", ChatRoom.NORMAL_VOICE_LEVEL));
        } else if (actionCommand.equals("imageChat")) {
            String imageURL =(String)(Object) JOptionPane.showInputDialog("Please enter your image's URL:\nExample: http://wotlas.sf.net/images/wotlas.gif");
            if (imageURL == null || imageURL.length() == 0) {
                return;
            }
            try {
                URL url = new URL(imageURL);
                URLConnection urlC = url.openConnection();
                urlC.connect();
                String ctype = urlC.getContentType();
                if (!ctype.startsWith("image/")) {
                    JOptionPane.showMessageDialog(null, "The specified URL does not refer to an image !", "Information", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                if (urlC.getContentLength() > 50 * 1024) {
                    JOptionPane.showMessageDialog(null, "The specified image is too big (above 50kB).", "Information", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            } catch (Exception ex) {
                Debug.signal(Debug.ERROR, this, "Failed to get image: " + ex);
                JOptionPane.showMessageDialog(null, "Failed to get the specified image...\nCheck your URL.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            DataManager dManager =(DataManager)(Object) ClientDirector.getDataManager();
            dManager.sendMessage(new SendTextMessage(dManager.getMyPlayer().getPrimaryKey(), dManager.getMyPlayer().getPlayerName(), getMyCurrentChatPrimaryKey(), "<img src='" + imageURL + "'>", ChatRoom.NORMAL_VOICE_LEVEL));
        } else {
            if ((boolean)(Object)DataManager.SHOW_DEBUG) {
                System.out.println("Err : unknown actionCommand");
                System.out.println("No action command found!");
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR;
	public MyHelperClass MAXIMUM_CHATROOMS_PER_ROOM;
	public MyHelperClass SHOW_DEBUG;
	public MyHelperClass NORMAL_VOICE_LEVEL;
	public MyHelperClass ERROR_MESSAGE;
	public MyHelperClass DEFAULT_CHAT;
	public MyHelperClass INFORMATION_MESSAGE;
public MyHelperClass showInputDialog(String o0){ return null; }
	public MyHelperClass getPlayerName(){ return null; }
	public MyHelperClass getPrimaryKey(){ return null; }
	public MyHelperClass setEnabled(boolean o0){ return null; }
	public MyHelperClass getTabCount(){ return null; }
	public MyHelperClass showMessageDialog(Object o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass isRoom(){ return null; }
	public MyHelperClass getDataManager(){ return null; }
	public MyHelperClass signal(MyHelperClass o0, c12297431 o1, String o2){ return null; }}

class ActionEvent {

public MyHelperClass getActionCommand(){ return null; }}

class DataManager {

public MyHelperClass getMyPlayer(){ return null; }
	public MyHelperClass sendMessage(SendTextMessage o0){ return null; }}

class PlayerImpl {

public MyHelperClass sendMessage(ChatRoomCreationMessage o0){ return null; }
	public MyHelperClass sendMessage(RemPlayerFromChatRoomMessage o0){ return null; }
	public MyHelperClass getPrimaryKey(){ return null; }
	public MyHelperClass getLocation(){ return null; }}

class WotlasLocation {

}

class ChatRoomCreationMessage {

ChatRoomCreationMessage(String o0, MyHelperClass o1){}
	ChatRoomCreationMessage(){}}

class RemPlayerFromChatRoomMessage {

RemPlayerFromChatRoomMessage(){}
	RemPlayerFromChatRoomMessage(MyHelperClass o0, MyHelperClass o1){}}

class SendTextMessage {

SendTextMessage(){}
	SendTextMessage(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, String o3, MyHelperClass o4){}}
