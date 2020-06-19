import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c98430 {
public MyHelperClass latestTitle;
	public MyHelperClass nextSeasonNum;
	public MyHelperClass nextSeriesNum;
	public MyHelperClass latestSeasonNum;
	public MyHelperClass latestAirDate;
	public MyHelperClass nextAirDate;
	public MyHelperClass latestEpisodeNum;
	public MyHelperClass nextTitle;
	public MyHelperClass airTime;
	public MyHelperClass status;
	public MyHelperClass usrShowName;
	public MyHelperClass airTimeHour;
	public MyHelperClass showURL;
	public MyHelperClass nextEpisodeNum;
	public MyHelperClass latestSeriesNum;
	public MyHelperClass showName;

    public  void TVRageShowInfo(String xmlShowName, String xmlSearchBy)  throws Throwable {
        String[] tmp, tmp2;
        String line = "";
        this.usrShowName =(MyHelperClass)(Object) xmlShowName;
        try {
            URL url = new URL("http://www.tvrage.com/quickinfo.php?show=" + xmlShowName.replaceAll(" ", "%20"));
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
            while ((line = in.readLine()) != null) {
                tmp = line.split("@");
                if (tmp[0].equals("Show Name")) showName =(MyHelperClass)(Object) tmp[1];
                if (tmp[0].equals("Show URL")) showURL =(MyHelperClass)(Object) tmp[1];
                if (tmp[0].equals("Latest Episode")) {
                    StringTokenizer st = new StringTokenizer(tmp[1], "^");
                    for (int i = 0; st.hasMoreTokens(); i++) {
                        if (i == 0) {
                            tmp2 = st.nextToken().split("x");
                            latestSeasonNum =(MyHelperClass)(Object) tmp2[0];
                            latestEpisodeNum =(MyHelperClass)(Object) tmp2[1];
                            if ((char)(Object)latestSeasonNum.charAt(0) == '0') latestSeasonNum = latestSeasonNum.substring(1);
                        } else if (i == 1) latestTitle =(MyHelperClass)(Object) st.nextToken().replaceAll("&", "and"); else latestAirDate =(MyHelperClass)(Object) st.nextToken();
                    }
                }
                if (tmp[0].equals("Next Episode")) {
                    StringTokenizer st = new StringTokenizer(tmp[1], "^");
                    for (int i = 0; st.hasMoreTokens(); i++) {
                        if (i == 0) {
                            tmp2 = st.nextToken().split("x");
                            nextSeasonNum =(MyHelperClass)(Object) tmp2[0];
                            nextEpisodeNum =(MyHelperClass)(Object) tmp2[1];
                            if ((char)(Object)nextSeasonNum.charAt(0) == '0') nextSeasonNum = nextSeasonNum.substring(1);
                        } else if (i == 1) nextTitle =(MyHelperClass)(Object) st.nextToken().replaceAll("&", "and"); else nextAirDate =(MyHelperClass)(Object) st.nextToken();
                    }
                }
                if (tmp[0].equals("Status")) status =(MyHelperClass)(Object) tmp[1];
                if (tmp[0].equals("Airtime") && tmp.length > 1) {
                    airTime =(MyHelperClass)(Object) tmp[1];
                }
            }
            if ((int)(Object)airTime.length() > 10) {
                tmp =(String[])(Object) airTime.split("at");
                airTimeHour =(MyHelperClass)(Object) tmp[1];
            }
            in.close();
            if (xmlSearchBy.equals("Showname SeriesNum")) {
                url = new URL((String)(Object)showURL);
                in = new BufferedReader(new InputStreamReader(url.openStream()));
                while ((line = in.readLine()) != null) {
                    if (line.indexOf("<b>Latest Episode: </b>") > -1) {
                        tmp = line.split("'>");
                        if (tmp[5].indexOf(':') > -1) {
                            tmp = tmp[5].split(":");
                            latestSeriesNum =(MyHelperClass)(Object) tmp[0];
                        }
                    } else if (line.indexOf("<b>Next Episode: </b>") > -1) {
                        tmp = line.split("'>");
                        if (tmp[3].indexOf(':') > -1) {
                            tmp = tmp[3].split(":");
                            nextSeriesNum =(MyHelperClass)(Object) tmp[0];
                        }
                    }
                }
                in.close();
            }
        } catch (MalformedURLException e) {
        } catch (IOException e) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass substring(int o0){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass split(String o0){ return null; }
	public MyHelperClass charAt(int o0){ return null; }}
