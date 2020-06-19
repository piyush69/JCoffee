import java.io.*;
import java.lang.*;
import java.util.*;



class c98428 {

    public static XMLShowInfo NzbSearch(TVRageShowInfo tvrage, XMLShowInfo xmldata, int latestOrNext) {
        String newzbin_query = "", csvData = "", hellaQueueDir = "", newzbinUsr = "", newzbinPass = "";
        String[] tmp;
        DateFormat tvRageDateFormat =(DateFormat)(Object) new SimpleDateFormat("MMM/dd/yyyy");
        DateFormat tvRageDateFormatFix =(DateFormat)(Object) new SimpleDateFormat("yyyy-MM-dd");
        newzbin_query = "?q=" + xmldata.showName + "+";
        if (latestOrNext == 0) {
            if (xmldata.searchBy.equals("ShowName Season x Episode")) newzbin_query += tvrage.latestSeasonNum + "x" + tvrage.latestEpisodeNum; else if (xmldata.searchBy.equals("Showname SeriesNum")) newzbin_query += tvrage.latestSeriesNum; else if (xmldata.searchBy.equals("Showname YYYY-MM-DD")) {
                try {
                    Date airTime =(Date)(Object) tvRageDateFormat.parse(tvrage.latestAirDate);
                    newzbin_query += tvRageDateFormatFix.format(airTime);
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                }
            } else if (xmldata.searchBy.equals("Showname EpisodeTitle")) newzbin_query += tvrage.latestTitle;
        } else {
            if (xmldata.searchBy.equals("ShowName Season x Episode")) newzbin_query += tvrage.nextSeasonNum + "x" + tvrage.nextEpisodeNum; else if (xmldata.searchBy.equals("Showname SeriesNum")) newzbin_query += tvrage.nextSeriesNum; else if (xmldata.searchBy.equals("Showname YYYY-MM-DD")) {
                try {
                    Date airTime =(Date)(Object) tvRageDateFormat.parse(tvrage.nextAirDate);
                    newzbin_query += tvRageDateFormatFix.format(airTime);
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                }
            } else if (xmldata.searchBy.equals("Showname EpisodeTitle")) newzbin_query += tvrage.nextTitle;
        }
        newzbin_query += "&searchaction=Search";
        newzbin_query += "&fpn=p";
        newzbin_query += "&category=8category=11";
        newzbin_query += "&area=-1";
        newzbin_query += "&u_nfo_posts_only=0";
        newzbin_query += "&u_url_posts_only=0";
        newzbin_query += "&u_comment_posts_only=0";
        newzbin_query += "&u_v3_retention=1209600";
        newzbin_query += "&ps_rb_language=" + xmldata.language;
        newzbin_query += "&sort=ps_edit_date";
        newzbin_query += "&order=desc";
        newzbin_query += "&areadone=-1";
        newzbin_query += "&feed=csv";
        newzbin_query += "&ps_rb_video_format=" + xmldata.format;
        newzbin_query = newzbin_query.replaceAll(" ", "%20");
        System.out.println("http://v3.newzbin.com/search/" + newzbin_query);
        try {
            URL url = new URL("http://v3.newzbin.com/search/" + newzbin_query);
            BufferedReader in = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
            csvData = in.readLine();
            if (csvData != null) {
                MyHelperClass JavaNZB = new MyHelperClass();
                JavaNZB.searchCount++;
                MyHelperClass searchCount = new MyHelperClass();
                if ((int)(Object)searchCount == 6) {
//                    MyHelperClass searchCount = new MyHelperClass();
                    searchCount =(MyHelperClass)(Object) 0;
                    System.out.println("Sleeping for 60 seconds");
                    try {
                        Thread.sleep(60000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                tmp = csvData.split(",");
                tmp[2] = tmp[2].substring(1, tmp[2].length() - 1);
                tmp[3] = tmp[3].substring(1, tmp[3].length() - 1);
                MyHelperClass Pattern = new MyHelperClass();
                Pattern p =(Pattern)(Object) Pattern.compile("[\\\\</:>?\\[|\\]\"]");
                Matcher matcher =(Matcher)(Object) p.matcher(tmp[3]);
                tmp[3] =(String)(Object) matcher.replaceAll(" ");
                tmp[3] = tmp[3].replaceAll("&", "and");
                URLConnection urlConn;
                DataOutputStream printout;
                url = new URL("http://v3.newzbin.com/api/dnzb/");
                urlConn =(URLConnection)(Object) url.openConnection();
                urlConn.setDoInput(true);
                urlConn.setDoOutput(true);
                urlConn.setUseCaches(false);
                urlConn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                printout = new DataOutputStream((OutputStream)(Object)urlConn.getOutputStream());
//                MyHelperClass JavaNZB = new MyHelperClass();
                String content = "username=" + JavaNZB.newzbinUsr + "&password=" + JavaNZB.newzbinPass + "&reportid=" + tmp[2];
                printout.writeBytes(content);
                printout.flush();
                printout.close();
                BufferedReader nzbInput = new BufferedReader(new InputStreamReader((InputStream)(Object)urlConn.getInputStream()));
                String format = "";
                if (xmldata.format.equals("17")) format = " Xvid";
                if (xmldata.format.equals("131072")) format = " x264";
                if (xmldata.format.equals("2")) format = " DVD";
                if (xmldata.format.equals("4")) format = " SVCD";
                if (xmldata.format.equals("8")) format = " VCD";
                if (xmldata.format.equals("32")) format = " HDts";
                if (xmldata.format.equals("64")) format = " WMV";
                if (xmldata.format.equals("128")) format = " Other";
                if (xmldata.format.equals("256")) format = " ratDVD";
                if (xmldata.format.equals("512")) format = " iPod";
                if (xmldata.format.equals("1024")) format = " PSP";
//                MyHelperClass JavaNZB = new MyHelperClass();
                File f = new File((String)(Object)JavaNZB.hellaQueueDir, tmp[3] + format + ".nzb");
                BufferedWriter out = new BufferedWriter(new FileWriter(f));
                String str;
                System.out.println("--Downloading " + tmp[3] + format + ".nzb" + " to queue directory--");
                while (null != ((str = nzbInput.readLine()))) out.write(str);
                nzbInput.close();
                out.close();
                if (latestOrNext == 0) {
                    xmldata.episode = tvrage.latestEpisodeNum;
                    xmldata.season = tvrage.latestSeasonNum;
                } else {
                    xmldata.episode = tvrage.nextEpisodeNum;
                    xmldata.season = tvrage.nextSeasonNum;
                }
            } else System.out.println("No new episode posted");
            System.out.println();
        } catch (UncheckedIOException e) {
        } catch (IOException e) {
            System.out.println("IO Exception from NzbSearch");
        }
        return xmldata;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass newzbinPass;
	public int searchCount;
	public MyHelperClass newzbinUsr;
	public MyHelperClass hellaQueueDir;
public MyHelperClass compile(String o0){ return null; }}

class TVRageShowInfo {
public MyHelperClass nextSeasonNum;
	public MyHelperClass latestTitle;
	public MyHelperClass nextTitle;
	public MyHelperClass latestSeriesNum;
	public MyHelperClass latestAirDate;
	public MyHelperClass nextAirDate;
	public MyHelperClass nextSeriesNum;
	public MyHelperClass latestEpisodeNum;
	public MyHelperClass latestSeasonNum;
	public MyHelperClass nextEpisodeNum;
}

class XMLShowInfo {
public MyHelperClass showName;
	public MyHelperClass episode;
	public MyHelperClass searchBy;
	public MyHelperClass season;
	public MyHelperClass language;
	public MyHelperClass format;
}

class DateFormat {

public MyHelperClass parse(MyHelperClass o0){ return null; }
	public MyHelperClass format(Date o0){ return null; }}

class SimpleDateFormat {

SimpleDateFormat(){}
	SimpleDateFormat(String o0){}}

class ParseException extends Exception{
	public ParseException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class Pattern {

public MyHelperClass matcher(String o0){ return null; }}

class Matcher {

public MyHelperClass replaceAll(String o0){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
