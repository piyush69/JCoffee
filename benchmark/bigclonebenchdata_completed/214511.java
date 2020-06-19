import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c214511 {
public MyHelperClass world;
	public MyHelperClass simulator;
public MyHelperClass hillId;
	public MyHelperClass matchId;
	public MyHelperClass getCodeBase(){ return null; }
	public MyHelperClass getParameter(String o0){ return null; }

    public void simulationEnded() {
        if (getParameter("ladderMatch") != null) {
            int[] scores =(int[])(Object) world.getScores();
            if ((int)(Object)simulator.getTick() < 100000) {
                for (int i = 0; i < scores.length; i++) {
                    scores[i] = -1;
                }
            }
            StringBuffer args = new StringBuffer("ladder_result.php?matchid=");
            args.append(this.matchId);
            args.append("&hillid=").append(this.hillId);
            for (int i = 0; i < scores.length; i++) {
                args.append("&p").append(i).append('=').append(scores[i]);
            }
            try {
                URL url = new URL((URL)(Object)getCodeBase(), args.toString());
                URLConnection connection = url.openConnection();
                System.err.println(((HttpURLConnection) connection).getResponseCode());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getTick(){ return null; }
	public MyHelperClass getScores(){ return null; }}
