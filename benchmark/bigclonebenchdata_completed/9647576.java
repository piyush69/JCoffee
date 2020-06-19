
import java.io.UncheckedIOException;


class c9647576 {

    private void Reserve() throws SQLException {
        Statement stbookings, stchartwl;
        String sp = "";
        MyHelperClass useragent = new MyHelperClass();
        if ((boolean)(Object)useragent) sp = "agent"; else sp = "user";
        String userbooksql = "";
        String agentbooksql = "";
        String bookingid = String.valueOf(System.currentTimeMillis());
        String currentcoach;
        String currentseat;
        try {
//            MyHelperClass useragent = new MyHelperClass();
            if ((boolean)(Object)useragent) {
                agentbooksql = "update hp_administrator.agent_bookings set BOOKINGS = xmlquery('copy $new := $BOOKINGS modify do insert ";
                MyHelperClass booking_details = new MyHelperClass();
                agentbooksql += " <detail booking_id=\"" + booking_details.getTicketno() + "\" status=\"open\" train_no=\"" + booking_details.getTrain_no() + "\" source=\"" + booking_details.getSource() + "\" dest=\"" + booking_details.getDestination() + "\" dep_date=\"" + booking_details.getDate() + "\" > ";
//            MyHelperClass useragent = new MyHelperClass();
            } else if (!(Boolean)(Object)useragent) {
                userbooksql = "update hp_administrator.user_bookings set BOOKINGS = xmlquery('copy $new := $BOOKINGS modify do insert ";
                MyHelperClass booking_details = new MyHelperClass();
                userbooksql += " <detail booking_id=\"" + booking_details.getTicketno() + "\" status=\"open\" train_no=\"" + booking_details.getTrain_no() + "\" source=\"" + booking_details.getSource() + "\" dest=\"" + booking_details.getDestination() + "\" dep_date=\"" + booking_details.getDate() + "\" > ";
            }
            MyHelperClass booking_details = new MyHelperClass();
            for (int tickpos = 0; tickpos < (int)(Object)booking_details.getNoOfPersons(); tickpos++) {
                MyHelperClass coach = new MyHelperClass();
                currentcoach =(String)(Object) coach.get(tickpos);
                MyHelperClass seatno = new MyHelperClass();
                currentseat =(String)(Object) seatno.get(tickpos);
                if (!currentcoach.equals("WL")) {
                    String chartavailupdsql = "update hp_administrator.chart_wl_order set AVAILABLE_BOOKED = xmlquery('copy $new := $AVAILABLE_BOOKED   modify do insert ";
//                    MyHelperClass booking_details = new MyHelperClass();
                    chartavailupdsql += "<seat number=\"" + currentseat + "\"><details user_id=\"" + booking_details.getUserId() + "\" usertype=\"" + sp + "\" ticket_no=\"" + booking_details.getTicketno() + "\" name=\"" + booking_details.getNameAt(tickpos) + "\" age=\"" + booking_details.getAgeAt(tickpos) + "\" sex=\"" + booking_details.getSexAt(tickpos) + "\" type=\"primary\"  /></seat>";
//                    MyHelperClass booking_details = new MyHelperClass();
                    chartavailupdsql += " into $new/status/class[@name=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoach + "\"] ";
//                    MyHelperClass booking_details = new MyHelperClass();
                    chartavailupdsql += " return  $new' ) where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "' ";
                    System.out.println(chartavailupdsql);
                    MyHelperClass conn = new MyHelperClass();
                    stchartwl =(Statement)(Object) conn.createStatement();
                    int updstat =(int)(Object) stchartwl.executeUpdate(chartavailupdsql);
                    if (updstat > 0) System.out.println("chart_wl  availability  updated");
                } else if (currentcoach.equals("WL")) {
                    String chartwlupdsql = "update hp_administrator.chart_wl_order set WAITLISTING = xmlquery('copy $new := $WAITLISTING modify do insert ";
//                    MyHelperClass booking_details = new MyHelperClass();
                    chartwlupdsql += "<details user_id=\"" + booking_details.getUserId() + "\" usertype=\"" + sp + "\" ticket_no=\"" + booking_details.getTicketno() + "\" name=\"" + booking_details.getNameAt(tickpos) + "\" age=\"" + booking_details.getAgeAt(tickpos) + "\" sex=\"" + booking_details.getSexAt(tickpos) + "\" type=\"primary\" /></seat>";
//                    MyHelperClass booking_details = new MyHelperClass();
                    chartwlupdsql += " into $new/status/class[@name=\"" + booking_details.getTclass() + "\"] ";
//                    MyHelperClass booking_details = new MyHelperClass();
                    chartwlupdsql += " return  $new' ) where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "' ";
                    System.out.println(chartwlupdsql);
                    MyHelperClass conn = new MyHelperClass();
                    stchartwl =(Statement)(Object) conn.createStatement();
                    int updstat =(int)(Object) stchartwl.executeUpdate(chartwlupdsql);
                    if (updstat > 0) System.out.println("chart_wl  waitlisting  updated");
                }
//                MyHelperClass useragent = new MyHelperClass();
                if ((boolean)(Object)useragent) agentbooksql += "<person><coach>" + currentcoach + "</coach><seat>" + currentseat + "</seat></person>"; else userbooksql += "<person><coach>" + currentcoach + "</coach><seat>" + currentseat + "</seat></person>";
            }
//            MyHelperClass useragent = new MyHelperClass();
            if ((boolean)(Object)useragent) {
//                MyHelperClass booking_details = new MyHelperClass();
                agentbooksql += "</detail>   as first into $new/book return  $new' ) where agent_id like '" + booking_details.getUserId() + "'";
                System.out.println(agentbooksql);
                MyHelperClass conn = new MyHelperClass();
                stbookings =(Statement)(Object) conn.createStatement();
                int updstat =(int)(Object) stbookings.executeUpdate(agentbooksql);
                if (updstat > 0) System.out.println("agent bookings updated");
            } else {
//                MyHelperClass booking_details = new MyHelperClass();
                userbooksql += "</detail>   as first into $new/book return  $new' ) where user_id like '" + booking_details.getUserId() + "'";
                System.out.println(userbooksql);
                MyHelperClass conn = new MyHelperClass();
                stbookings =(Statement)(Object) conn.createStatement();
                int updstat =(int)(Object) stbookings.executeUpdate(userbooksql);
                if (updstat > 0) System.out.println("user bookings  updated");
            }
        } catch (UncheckedIOException e) {
            MyHelperClass conn = new MyHelperClass();
            conn.rollback();
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getDate(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass getSource(){ return null; }
	public MyHelperClass getTclass(){ return null; }
	public MyHelperClass getTrain_no(){ return null; }
	public MyHelperClass getNoOfPersons(){ return null; }
	public MyHelperClass getNameAt(int o0){ return null; }
	public MyHelperClass getDestination(){ return null; }
	public MyHelperClass getUserId(){ return null; }
	public MyHelperClass getSexAt(int o0){ return null; }
	public MyHelperClass getAgeAt(int o0){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass getTicketno(){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }}
