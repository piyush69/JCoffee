import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2807114 {
public MyHelperClass m_fragmsgs;
	public MyHelperClass m_chatbuffer;
	public MyHelperClass PathFinder;
	public MyHelperClass NetEngine;
	public MyHelperClass GLDrawableFactory;
	public MyHelperClass HogsConstants;
	public MyHelperClass isChatPaused;
	public MyHelperClass m_middlepos;
	public MyHelperClass m_drawingpanel;
	public MyHelperClass m_received_messages;
	public MyHelperClass m_curpos;
	public MyHelperClass m_graphics;
	public MyHelperClass JOptionPane;
	public MyHelperClass m_gamestate;
	public MyHelperClass m_netengine;
	public MyHelperClass m_lastbullet;
	public MyHelperClass m_shouldexit;
	public MyHelperClass m_user;
	public MyHelperClass m_window;
	public MyHelperClass m_physics;
	public MyHelperClass isRunning;
	public MyHelperClass m_nethandler;
	public MyHelperClass GraphicsEnvironment;
	public MyHelperClass m_customizedtaunts;
	public MyHelperClass readFromFile(Reader o0){ return null; }

    public  void Controller(String m_hostname, String team, boolean m_shouldexit) throws Throwable, InternalException {
        m_received_messages =(MyHelperClass)(Object) new ConcurrentLinkedQueue();
        m_fragmsgs =(MyHelperClass)(Object) new ArrayList<String>();
        m_customizedtaunts =(MyHelperClass)(Object) new HashMap<Integer, String>();
        m_nethandler =(MyHelperClass)(Object) new CachingNetHandler();
        m_drawingpanel = GLDrawableFactory.getFactory().createGLCanvas(new GLCapabilities());
        m_user =(MyHelperClass)(Object) System.getProperty("user.name");
        m_chatbuffer =(MyHelperClass)(Object) new StringBuffer();
        this.m_shouldexit =(MyHelperClass)(Object) m_shouldexit;
        isChatPaused =(MyHelperClass)(Object) false;
        isRunning =(MyHelperClass)(Object) true;
        m_lastbullet =(MyHelperClass)(Object) 0;
        try {
            BufferedReader in = new BufferedReader(new FileReader((String)(Object)HogsConstants.FRAGMSGS_FILE));
            String str;
            while ((str = in.readLine()) != null) {
                m_fragmsgs.add(str);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String newFile =(String)(Object) PathFinder.getCustsFile();
        boolean exists = (new File(newFile)).exists();
        Reader reader = null;
        if (exists) {
            try {
                reader = new FileReader(newFile);
            } catch (FileNotFoundException e3) {
                e3.printStackTrace();
            }
        } else {
            Object[] options = { "Yes, create a .hogsrc file", "No, use default taunts" };
            int n = JOptionPane.showOptionDialog(m_window, "You do not have customized taunts in your home\n " + "directory.  Would you like to create a customizable file?", "Hogs Customization", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
            if (n == 0) {
                try {
                    FileChannel srcChannel = (FileChannel)(Object)new FileInputStream((String)(Object)HogsConstants.CUSTS_TEMPLATE).getChannel();
                    FileChannel dstChannel;
                    dstChannel = (FileChannel)(Object)new FileOutputStream(newFile).getChannel();
                    dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
                    srcChannel.close();
                    dstChannel.close();
                    reader = new FileReader(newFile);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    reader = new FileReader((String)(Object)HogsConstants.CUSTS_TEMPLATE);
                } catch (FileNotFoundException e3) {
                    e3.printStackTrace();
                }
            }
        }
        try {
            m_netengine = NetEngine.forHost(m_user, m_hostname, 1820, m_nethandler);
            m_netengine.start();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (NetException e) {
            e.printStackTrace();
        }
        m_gamestate = m_netengine.getCurrentState();
        m_gamestate.setInChatMode(false);
        m_gamestate.setController(this);
        try {
            readFromFile(reader);
        } catch (NumberFormatException e3) {
            e3.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (InternalException e3) {
            e3.printStackTrace();
        }
        GraphicsEnvironment ge =(GraphicsEnvironment)(Object) GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice m_graphicsdevice =(GraphicsDevice)(Object) ge.getDefaultScreenDevice();
        m_window =(MyHelperClass)(Object) new GuiFrame(m_drawingpanel, m_gamestate);
        m_graphics = null;
        try {
            m_graphics =(MyHelperClass)(Object) new GraphicsEngine(m_drawingpanel, m_gamestate);
        } catch (InternalException e1) {
            e1.printStackTrace();
            System.exit(0);
        }
        m_drawingpanel.addGLEventListener(m_graphics);
        m_physics =(MyHelperClass)(Object) new Physics();
        if (team == null) {
            team =(String)(Object) HogsConstants.TEAM_NONE;
        }
        if (!(team.toLowerCase().equals(HogsConstants.TEAM_NONE) || team.toLowerCase().equals(HogsConstants.TEAM_RED) || team.toLowerCase().equals(HogsConstants.TEAM_BLUE))) {
            throw new InternalException("Invalid team name!");
        }
        String orig_team = team;
        Craft local_craft =(Craft)(Object) m_gamestate.getLocalCraft();
        if ((int)(Object)m_gamestate.getNumCrafts() == 0) {
            local_craft.setTeamname(team);
        } else if ((boolean)(Object)m_gamestate.isInTeamMode()) {
            if (team == (String)(Object)HogsConstants.TEAM_NONE) {
                int red_craft = m_gamestate.getNumOnTeam(HogsConstants.TEAM_RED);
                int blue_craft = m_gamestate.getNumOnTeam(HogsConstants.TEAM_BLUE);
                String new_team;
                if (red_craft > blue_craft) {
                    new_team =(String)(Object) HogsConstants.TEAM_BLUE;
                } else if (red_craft < blue_craft) {
                    new_team =(String)(Object) HogsConstants.TEAM_RED;
                } else {
                    new_team = Math.random() > 0.5 ? HogsConstants.TEAM_BLUE : HogsConstants.TEAM_RED;
                }
                m_gamestate.getLocalCraft().setTeamname(new_team);
            } else {
                local_craft.setTeamname(team);
            }
        } else {
            local_craft.setTeamname((String)(Object)HogsConstants.TEAM_NONE);
            if (orig_team != null) {
                m_window.displayText("You cannot join a team, this is an individual game.");
            }
        }
        if (!local_craft.getTeamname().equals(HogsConstants.TEAM_NONE)) {
            m_window.displayText("You are joining the " + local_craft.getTeamname() + " team.");
        }
        m_drawingpanel.setSize(m_drawingpanel.getWidth(), m_drawingpanel.getHeight());
        m_middlepos =(MyHelperClass)(Object) new java.awt.Point((int)(Object)m_drawingpanel.getWidth() / 2, m_drawingpanel.getHeight() / 2);
        m_curpos =(MyHelperClass)(Object) new java.awt.Point((int)(Object)m_drawingpanel.getWidth() / 2, m_drawingpanel.getHeight() / 2);
        GuiKeyListener k_listener = new GuiKeyListener();
        GuiMouseListener m_listener = new GuiMouseListener();
        m_window.addKeyListener(k_listener);
        m_drawingpanel.addKeyListener(k_listener);
        m_window.addMouseListener(m_listener);
        m_drawingpanel.addMouseListener(m_listener);
        m_window.addMouseMotionListener(m_listener);
        m_drawingpanel.addMouseMotionListener(m_listener);
        m_drawingpanel.addFocusListener(new FocusAdapter() {

            public void focusLost(FocusEvent evt) {
                m_window.setMouseTrapped(false);
                m_window.returnMouseToCenter();
            }
        });
        m_window.addFocusListener(new FocusAdapter() {

            public void focusLost(FocusEvent evt) {
                m_window.setMouseTrapped(false);
                m_window.returnMouseToCenter();
            }
        });
        m_window.requestFocus();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass QUESTION_MESSAGE;
	public MyHelperClass TEAM_RED;
	public MyHelperClass CUSTS_TEMPLATE;
	public MyHelperClass TEAM_NONE;
	public MyHelperClass FRAGMSGS_FILE;
	public MyHelperClass YES_NO_OPTION;
	public MyHelperClass TEAM_BLUE;
public MyHelperClass requestFocus(){ return null; }
	public MyHelperClass addGLEventListener(MyHelperClass o0){ return null; }
	public MyHelperClass getCurrentState(){ return null; }
	public MyHelperClass setController(c2807114 o0){ return null; }
	public MyHelperClass addMouseListener(GuiMouseListener o0){ return null; }
	public MyHelperClass addMouseMotionListener(GuiMouseListener o0){ return null; }
	public MyHelperClass isInTeamMode(){ return null; }
	public MyHelperClass addFocusListener(<anonymous FocusAdapter> o0){ return null; }
	public MyHelperClass getLocalGraphicsEnvironment(){ return null; }
	public MyHelperClass setMouseTrapped(boolean o0){ return null; }
	public MyHelperClass getHeight(){ return null; }
	public MyHelperClass addKeyListener(GuiKeyListener o0){ return null; }
	public MyHelperClass displayText(String o0){ return null; }
	public MyHelperClass setTeamname(String o0){ return null; }
	public MyHelperClass add(String o0){ return null; }
	public MyHelperClass createGLCanvas(GLCapabilities o0){ return null; }
	public MyHelperClass returnMouseToCenter(){ return null; }
	public MyHelperClass start(){ return null; }
	public MyHelperClass forHost(MyHelperClass o0, String o1, int o2, MyHelperClass o3){ return null; }
	public MyHelperClass getNumCrafts(){ return null; }
	public MyHelperClass setInChatMode(boolean o0){ return null; }
	public MyHelperClass setSize(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getLocalCraft(){ return null; }
	public MyHelperClass showOptionDialog(MyHelperClass o0, String o1, String o2, MyHelperClass o3, MyHelperClass o4, Object o5, Object[] o6, Object o7){ return null; }
	public MyHelperClass getWidth(){ return null; }
	public MyHelperClass getFactory(){ return null; }
	public MyHelperClass addFocusListener(){ return null; }
	public MyHelperClass getNumOnTeam(MyHelperClass o0){ return null; }
	public MyHelperClass getCustsFile(){ return null; }}

class InternalException extends Exception{
	public InternalException(String errorMessage) { super(errorMessage); }
}

class ConcurrentLinkedQueue {

}

class ReceivedMessage {

}

class CachingNetHandler {

}

class GLCapabilities {

}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass close(){ return null; }}

class NetException extends Exception{
	public NetException(String errorMessage) { super(errorMessage); }
}

class GraphicsEnvironment {

public MyHelperClass getDefaultScreenDevice(){ return null; }}

class GraphicsDevice {

}

class GuiFrame {

GuiFrame(MyHelperClass o0, MyHelperClass o1){}
	GuiFrame(){}}

class GraphicsEngine {

GraphicsEngine(MyHelperClass o0, MyHelperClass o1){}
	GraphicsEngine(){}}

class Physics {

}

class Craft {

public MyHelperClass getTeamname(){ return null; }
	public MyHelperClass setTeamname(String o0){ return null; }}

class GuiKeyListener {

}

class GuiMouseListener {

}

class FocusAdapter {

}

class FocusEvent {

}
