


class c11101257 {
public MyHelperClass getPlayerName(String o0){ return null; }

    private void innerJob(String inURL, String matchId, Map result) throws UnsupportedEncodingException, IOException {
        URL url = new URL(inURL);
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "utf-8"));
        String inLine = null;
        String scoreFrom = "score=\"";
        String homeTo = "\" side=\"Home";
        String awayTo = "\" side=\"Away";
        String goalInclud = "Stat";
        String playerFrom = "playerId=\"";
        String playerTo = "\" position=";
        String timeFrom = "time=\"";
        String timeTo = "\" period";
        String teamFinish = "</Team>";
        boolean homeStart = false;
        boolean awayStart = false;
        while ((inLine =(String)(Object) reader.readLine()) != null) {
            if (inLine.indexOf(teamFinish) != -1) {
                homeStart = false;
                awayStart = false;
            }
            if (inLine.indexOf(homeTo) != -1) {
                result.get(matchId).setHomeScore(inLine.substring(inLine.indexOf(scoreFrom) + scoreFrom.length(), inLine.indexOf(homeTo)));
                homeStart = true;
            }
            if (homeStart && inLine.indexOf(goalInclud) != -1) {
                MatchEvent me = new MatchEvent();
                me.setPlayerName(getPlayerName(inLine.substring(inLine.indexOf(playerFrom) + playerFrom.length(), inLine.indexOf(playerTo))));
                me.setTime(inLine.substring(inLine.indexOf(timeFrom) + timeFrom.length(), inLine.indexOf(timeTo)));
                List mes =(List)(Object) result.get(matchId).getHomeEvents();
                boolean exist = false;
                for (MatchEvent _me :(MatchEvent[])(Object) (Object[])(Object)mes) {
                    if (_me.getPlayerName().equals(me.getPlayerName()) && _me.getTime().equals(me.getTime())) {
                        exist = true;
                        break;
                    }
                }
                if (!exist) {
                    mes.add(me);
                }
            }
            if (inLine.indexOf(awayTo) != -1) {
                result.get(matchId).setAwayScore(inLine.substring(inLine.indexOf(scoreFrom) + scoreFrom.length(), inLine.indexOf(awayTo)));
                awayStart = true;
            }
            if (awayStart && inLine.indexOf(goalInclud) != -1) {
                MatchEvent me = new MatchEvent();
                me.setPlayerName(getPlayerName(inLine.substring(inLine.indexOf(playerFrom) + playerFrom.length(), inLine.indexOf(playerTo))));
                me.setTime(inLine.substring(inLine.indexOf(timeFrom) + timeFrom.length(), inLine.indexOf(timeTo)));
                List mes =(List)(Object) result.get(matchId).getAwayEvents();
                boolean exist = false;
                for (MatchEvent _me :(MatchEvent[])(Object) (Object[])(Object)mes) {
                    if (_me.getPlayerName().equals(me.getPlayerName()) && _me.getTime().equals(me.getTime())) {
                        exist = true;
                        break;
                    }
                }
                if (!exist) {
                    mes.add(me);
                }
            }
        }
        reader.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setHomeScore(String o0){ return null; }
	public MyHelperClass getHomeEvents(){ return null; }
	public MyHelperClass setAwayScore(String o0){ return null; }
	public MyHelperClass getAwayEvents(){ return null; }}

class Map {

public MyHelperClass get(String o0){ return null; }}

class Match {

}

class UnsupportedEncodingException extends Exception{
	public UnsupportedEncodingException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}

class MatchEvent {

public MyHelperClass setTime(String o0){ return null; }
	public MyHelperClass getPlayerName(){ return null; }
	public MyHelperClass getTime(){ return null; }
	public MyHelperClass setPlayerName(MyHelperClass o0){ return null; }}

class List {

public MyHelperClass add(MatchEvent o0){ return null; }}
