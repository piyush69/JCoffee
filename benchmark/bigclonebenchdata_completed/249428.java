import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c249428 {
public MyHelperClass log;
	public MyHelperClass JFileChooser;
	public MyHelperClass ImageIO;
	public MyHelperClass BKG;
	public MyHelperClass checkUpdates;
	public MyHelperClass scriptStartTime;
	public MyHelperClass mouse;
	public MyHelperClass waitGUI;
	public MyHelperClass normal;
	public MyHelperClass clicked;
	public MyHelperClass MouseSpeed;
	public MyHelperClass gui;
	public MyHelperClass JOptionPane;
	public MyHelperClass camera;
	public MyHelperClass properties;
	public MyHelperClass log(String o0){ return null; }
	public MyHelperClass sleep(int o0){ return null; }

    public boolean onStart()  throws Throwable {
        log("Starting up, this may take a minute...");
        gui =(MyHelperClass)(Object) new ApeAtollGUI();
        gui.setVisible(true);
        while ((boolean)(Object)waitGUI) {
            sleep(100);
        }
        URLConnection url = null;
        BufferedReader in = null;
        BufferedWriter out = null;
        if ((boolean)(Object)checkUpdates) {
            try {
                url = new URL("http://www.voltrex.be/rsbot/VoltrexApeAtollVERSION.txt").openConnection();
                in = new BufferedReader(new InputStreamReader(url.getInputStream()));
                if (Double.parseDouble(in.readLine()) > (double)(Object)properties.version()) {
                    if ((int)(Object)JOptionPane.showConfirmDialog(null, "Update found. Do you want to update?") == 0) {
                        JOptionPane.showMessageDialog(null, "Please choose 'VoltrexApeAtoll.java' in your scripts/sources folder.");
                        JFileChooser fc = new JFileChooser();
                        if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                            url = new URL("http://www.voltrex.be/rsbot/VoltrexApeAtoll.java").openConnection();
                            in = new BufferedReader(new InputStreamReader(url.getInputStream()));
                            out = new BufferedWriter(new FileWriter((String)(Object)fc.getSelectedFile().getPath()));
                            String inp;
                            while ((inp = in.readLine()) != null) {
                                out.write(inp);
                                out.newLine();
                                out.flush();
                            }
                            log("Script successfully downloaded. Please recompile.");
                            return false;
                        } else log("Update canceled");
                    } else log("Update canceled");
                } else log("You have the latest version.");
                if (in != null) in.close();
                if (out != null) out.close();
            } catch (IOException e) {
                log("Problem getting version. Please report this bug!");
            }
        }
        try {
            BKG = ImageIO.read(new URL("http://i54.tinypic.com/2egcfaw.jpg"));
        } catch (final java.io.IOException e) {
            e.printStackTrace();
        }
        try {
            final URL cursorURL = new URL("http://imgur.com/i7nMG.png");
            final URL cursor80URL = new URL("http://imgur.com/8k9op.png");
            normal = ImageIO.read(cursorURL);
            clicked = ImageIO.read(cursor80URL);
        } catch (MalformedURLException e) {
            log.info("Unable to buffer cursor.");
        } catch (IOException e) {
            log.info("Unable to open cursor image.");
        }
        scriptStartTime =(MyHelperClass)(Object) System.currentTimeMillis();
        mouse.setSpeed(MouseSpeed);
        camera.setPitch(true);
        log("You are using Voltrex Ape Atoll agility course.");
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass APPROVE_OPTION;
public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass read(URL o0){ return null; }
	public MyHelperClass version(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass setSpeed(MyHelperClass o0){ return null; }
	public MyHelperClass setPitch(boolean o0){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass showConfirmDialog(Object o0, String o1){ return null; }
	public MyHelperClass showMessageDialog(Object o0, String o1){ return null; }}

class ApeAtollGUI {

}

class JFileChooser {

public MyHelperClass showOpenDialog(Object o0){ return null; }
	public MyHelperClass getSelectedFile(){ return null; }}
