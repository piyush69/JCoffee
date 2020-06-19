import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9647574 {
public MyHelperClass availfin;
	public MyHelperClass conn;
public MyHelperClass coach;
	public MyHelperClass seatno;
public MyHelperClass useragent;
	public MyHelperClass NULL;
public MyHelperClass seatlist;

    private void FindAvail() throws Throwable, ParserConfigurationException, SQLException {
        Savepoint sp1;
        MyHelperClass booking_details = new MyHelperClass();
        String availsql = "select xmlquery('$c/coach_status/class[@name=\"" + booking_details.getTclass() + "\"]' ";
        availsql += "passing hp_administrator.availability.AVAIL as \"c\") ";
        availsql += " from hp_administrator.availability ";
//        MyHelperClass booking_details = new MyHelperClass();
        availsql += " where date = '" + booking_details.getDate() + "' and train_no like '" + booking_details.getTrain_no() + "'";
        System.out.println(availsql);
        String availxml = "";
        String seatxml = "";
        String navailstr = "";
        String nspavailstr = "";
        String currentcoachstr = "";
        String srctillstr = "", srcavailstr = "", srcmaxstr = "";
        Integer srctill, srcavail, srcmax;
        Integer navailcoach;
        Integer nspavailcoach, seatstart, seatcnt, alloccnt;
        String routesrcstr = "", routedeststr = "";
        PreparedStatement pstseat;
        Statement stavail, stavailupd, stseatupd, stseat;
        ResultSet rsavail, rsseat;
        MyHelperClass DocumentBuilderFactory = new MyHelperClass();
        DocumentBuilderFactory dbf =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
        DocumentBuilder db =(DocumentBuilder)(Object) dbf.newDocumentBuilder();
        Document docavail, docseattmp, docseatfin, docseat;
        Element rootavail, rootseat;
        Node n;
        try {
            MyHelperClass conn = new MyHelperClass();
            stavail =(Statement)(Object) conn.createStatement();
//            MyHelperClass conn = new MyHelperClass();
            sp1 =(Savepoint)(Object) conn.setSavepoint();
            rsavail =(ResultSet)(Object) stavail.executeQuery(availsql);
            if ((boolean)(Object)rsavail.next()) availxml =(String)(Object) rsavail.getString(1);
            System.out.println(availxml);
            StringBuffer StringBuffer1 = new StringBuffer(availxml);
            ByteArrayInputStream Bis1 = new ByteArrayInputStream(StringBuffer1.toString().getBytes("UTF-16"));
            docavail =(Document)(Object) db.parse(Bis1);
            StringWriter sw;
            OutputFormat formatter;
            formatter = new OutputFormat();
            formatter.setPreserveSpace(true);
            formatter.setEncoding("UTF-8");
            formatter.setOmitXMLDeclaration(true);
            XMLSerializer serializer;
            rootavail =(Element)(Object) docavail.getDocumentElement();
            NodeList coachlist =(NodeList)(Object) rootavail.getElementsByTagName("coach");
            Element currentcoach, minseat;
            Element routesrc, routedest, nextstn, dest, user, agent;
            NodeList nl, nl1;
            MyHelperClass number_of_tickets_rem = new MyHelperClass();
            number_of_tickets_rem = booking_details.getNoOfPersons();
            int tickpos = 0;
            boolean firsttime =(boolean)(Object) NULL; //new boolean();
            firsttime = true;
            boolean enterloop;
            for (int i = 0; i < (int)(Object)coachlist.getLength(); i++) {
                currentcoach = (Element)(Element)(Object) coachlist.item(i);
                currentcoachstr =(String)(Object) currentcoach.getAttribute("number");
                String coachmaxstr =(String)(Object) currentcoach.getAttribute("coachmax");
                Integer coachmax = Integer.parseInt(coachmaxstr.trim());
                routesrc = (Element)(Element)(Object) currentcoach.getFirstChild();
                routedest = (Element)(Element)(Object) currentcoach.getLastChild();
                routedest = (Element)(Element)(Object) routedest.getPreviousSibling().getPreviousSibling().getPreviousSibling();
                routesrcstr =(String)(Object) routesrc.getNodeName();
                routedeststr =(String)(Object) routedest.getNodeName();
//                MyHelperClass booking_details = new MyHelperClass();
                String seatsql = "select xmlquery('$c/status/class[@type=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"]' ";
                seatsql += " passing hp_administrator.book_tickets.SEAT as \"c\") from hp_administrator.book_tickets ";
//                MyHelperClass booking_details = new MyHelperClass();
                seatsql += " where  date = '" + booking_details.getDate() + "' and train_no like '" + booking_details.getTrain_no() + "' ";
                MyHelperClass sourcenws = new MyHelperClass();
                System.out.println("route  :" + sourcenws);
                MyHelperClass destnnws = new MyHelperClass();
                System.out.println("route  :" + destnnws);
                System.out.println("route src :" + routesrcstr);
                System.out.println("route dest :" + routedeststr);
                System.out.println(seatsql);
//                MyHelperClass conn = new MyHelperClass();
                stseat =(Statement)(Object) conn.createStatement();
                rsseat =(ResultSet)(Object) stseat.executeQuery(seatsql);
                if ((boolean)(Object)rsseat.next()) seatxml =(String)(Object) rsseat.getString(1);
                StringBuffer StringBuffer2 = new StringBuffer(seatxml);
                ByteArrayInputStream Bis2 = new ByteArrayInputStream(StringBuffer2.toString().getBytes("UTF-16"));
                docseat =(Document)(Object) db.parse(Bis2);
                rootseat =(Element)(Object) docseat.getDocumentElement();
                enterloop = false;
//                MyHelperClass sourcenws = new MyHelperClass();
                if (routesrcstr.equals(sourcenws) && routedeststr.equals(destnnws)) {
                    System.out.println("case 1");
                    navailstr =(String)(Object) routesrc.getTextContent();
                    navailcoach = Integer.parseInt(navailstr.trim());
                    MyHelperClass useragent = new MyHelperClass();
                    if ((boolean)(Object)useragent) nspavailstr =(String)(Object) routesrc.getAttribute("agent"); else nspavailstr =(String)(Object) routesrc.getAttribute("user");
                    nspavailcoach = Integer.parseInt(nspavailstr.trim());
//                    MyHelperClass sourcenws = new MyHelperClass();
                    srctillstr =(String)(Object) routesrc.getAttribute(sourcenws + "TILL");
                    srctill = Integer.parseInt(srctillstr.trim());
//                    MyHelperClass sourcenws = new MyHelperClass();
                    srcmaxstr =(String)(Object) routesrc.getAttribute(sourcenws);
                    srcmax = Integer.parseInt(srcmaxstr.trim());
                    srcavailstr =(String)(Object) routesrc.getTextContent();
                    srcavail = Integer.parseInt(srcavailstr.trim());
                    seatstart = coachmax - srctill + 1;
                    seatcnt = srcmax;
                    alloccnt = srcmax - srcavail;
                    seatstart += alloccnt;
                    seatcnt -= alloccnt;
                    Element seat, stn;
                    NodeList nl3 =(NodeList)(Object) rootseat.getElementsByTagName("seat");
                    seat = (Element)(Element)(Object) nl3.item(0);
//                    MyHelperClass booking_details = new MyHelperClass();
                    if ((Integer)(Object)booking_details.getNoOfPersons() <= navailcoach &&(Integer)(Object) booking_details.getNoOfPersons() <= nspavailcoach) {
                        MyHelperClass coach = new MyHelperClass();
                        coach.clear();
                        coachlist.clear();
                        seatlist.clear();
                        MyHelperClass seatno = new MyHelperClass();
                        seatno.clear();
//                        MyHelperClass booking_details = new MyHelperClass();
                        for (tickpos = 0; tickpos < (int)(Object)booking_details.getNoOfPersons(); tickpos++) {
//                            MyHelperClass coach = new MyHelperClass();
                            coach.add(currentcoachstr);
                            coachlist.add(currentcoachstr);
                            while (Integer.parseInt((String)(Object)seat.getFirstChild().getTextContent().trim()) < seatstart) {
                                seat = (Element)(Element)(Object) seat.getNextSibling();
                            }
                            seatstart++;
                            System.out.println(seat.getFirstChild().getTextContent().trim());
//                            MyHelperClass seatno = new MyHelperClass();
                            seatno.add((String)(Object)seat.getFirstChild().getTextContent().trim());
                            seatlist.add((String)(Object)seat.getFirstChild().getTextContent().trim());
//                            MyHelperClass sourcenws = new MyHelperClass();
                            nl3 =(NodeList)(Object) seat.getElementsByTagName(sourcenws);
                            stn = (Element)(Element)(Object) nl3.item(0);
//                            MyHelperClass destnnws = new MyHelperClass();
                            while (!stn.getNodeName().equals(destnnws)) {
                                stn.setTextContent("0");
                                stn = (Element)(Element)(Object) stn.getNextSibling();
                            }
                        }
//                        MyHelperClass number_of_tickets_rem = new MyHelperClass();
                        number_of_tickets_rem =(MyHelperClass)(Object) 0;
//                        MyHelperClass booking_details = new MyHelperClass();
                        navailcoach -= (Integer)(Object)booking_details.getNoOfPersons();
//                        MyHelperClass booking_details = new MyHelperClass();
                        nspavailcoach -= (Integer)(Object)booking_details.getNoOfPersons();
//                        MyHelperClass firsttime = new MyHelperClass();
                        if (!(Boolean)(Object)firsttime) conn.rollback(sp1);
                        String availupdstr = "update hp_administrator.availability set AVAIL = xmlquery( 'transform copy $new := $AVAIL  modify do ";
//                        MyHelperClass booking_details = new MyHelperClass();
                        availupdstr += " replace value of $new/coach_status/class[@name=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"]/" + sourcenws + " with \"" + navailcoach + "\"";
//                        MyHelperClass booking_details = new MyHelperClass();
                        availupdstr += " return  $new')  where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "' ";
//                        MyHelperClass conn = new MyHelperClass();
                        stavailupd =(Statement)(Object) conn.createStatement();
                        int updvar =(int)(Object) stavailupd.executeUpdate(availupdstr);
                        if (updvar > 0) System.out.println("upda avail success");
                        sw = new StringWriter();
                        serializer = new XMLSerializer(sw, formatter);
                        serializer.serialize(docseat);
                        String seatupdstr = "update hp_administrator.book_tickets set SEAT = xmlquery( 'transform copy $new := $SEAT ";
//                        MyHelperClass booking_details = new MyHelperClass();
                        seatupdstr += " modify do replace $new/status/class[@type=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"] with " + sw.toString();
//                        MyHelperClass booking_details = new MyHelperClass();
                        seatupdstr += " return $new') where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "'  ";
                        System.out.println(seatupdstr);
//                        MyHelperClass conn = new MyHelperClass();
                        stseatupd =(Statement)(Object) conn.createStatement();
                        updvar =(int)(Object) stseatupd.executeUpdate(seatupdstr);
                        if (updvar > 0) System.out.println("upda seat success");
                        String sp = "";
//                        MyHelperClass useragent = new MyHelperClass();
                        if ((boolean)(Object)useragent) sp = "agent"; else sp = "user";
                        availupdstr = "update hp_administrator.availability set AVAIL = xmlquery( 'transform copy $new := $AVAIL  modify do ";
//                        MyHelperClass booking_details = new MyHelperClass();
                        availupdstr += " replace value of $new/coach_status/class[@name=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"]/" + sourcenws + "/@" + sp + " with \"" + nspavailcoach + "\"";
//                        MyHelperClass booking_details = new MyHelperClass();
                        availupdstr += " return  $new')  where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "' ";
                        System.out.println(availupdstr);
//                        MyHelperClass conn = new MyHelperClass();
                        stavailupd =(Statement)(Object) conn.createStatement();
                        updvar =(int)(Object) stavailupd.executeUpdate(availupdstr);
                        if (updvar > 0) System.out.println("upda" + sp + " success");
                        break;
                    }
//                    MyHelperClass number_of_tickets_rem = new MyHelperClass();
                    while (navailcoach > 0 && nspavailcoach > 0 &&(int)(Object) number_of_tickets_rem > 0) {
//                        MyHelperClass firsttime = new MyHelperClass();
                        if ((boolean)(Object)firsttime) {
//                            MyHelperClass conn = new MyHelperClass();
                            sp1 =(Savepoint)(Object) conn.setSavepoint();
//                            MyHelperClass firsttime = new MyHelperClass();
                            firsttime =(boolean)(Object)(MyHelperClass)(Object) false;
                        }
                        enterloop = true;
                        MyHelperClass coach = new MyHelperClass();
                        coach.add(currentcoachstr);
                        coachlist.add(currentcoachstr);
                        tickpos++;
//                        MyHelperClass number_of_tickets_rem = new MyHelperClass();
                        number_of_tickets_rem--;
                        navailcoach--;
                        nspavailcoach--;
                        while (Integer.parseInt((String)(Object)seat.getFirstChild().getTextContent().trim()) < seatstart) {
                            seat = (Element)(Element)(Object) seat.getNextSibling();
                        }
                        seatstart++;
                        System.out.println(seat.getFirstChild().getTextContent().trim());
                        MyHelperClass seatno = new MyHelperClass();
                        seatno.add((String)(Object)seat.getFirstChild().getTextContent().trim());
                        seatlist.add((String)(Object)seat.getFirstChild().getTextContent().trim());
//                        MyHelperClass sourcenws = new MyHelperClass();
                        nl3 =(NodeList)(Object) seat.getElementsByTagName(sourcenws);
                        stn = (Element)(Element)(Object) nl3.item(0);
//                        MyHelperClass destnnws = new MyHelperClass();
                        while (!stn.getNodeName().equals(destnnws)) {
                            stn.setTextContent("0");
                            stn = (Element)(Element)(Object) stn.getNextSibling();
                        }
                        String availupdstr = "update hp_administrator.availability set AVAIL = xmlquery( 'transform copy $new := $AVAIL  modify do ";
//                        MyHelperClass booking_details = new MyHelperClass();
                        availupdstr += " replace value of $new/coach_status/class[@name=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"]/" + sourcenws + " with \"" + navailcoach + "\"";
                        availupdstr += " return  $new')  where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "' ";
                        stavailupd =(Statement)(Object) conn.createStatement();
                        stavailupd.executeUpdate(availupdstr);
                        String sp = "";
                        if ((boolean)(Object)useragent) sp = "agent"; else sp = "user";
                        availupdstr = "update hp_administrator.availability set AVAIL = xmlquery( 'transform copy $new := $AVAIL  modify do ";
                        availupdstr += " replace value of $new/coach_status/class[@name=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + sp + "\"]/" + sourcenws + "/@" + sp + " with \"" + nspavailcoach + "\"";
                        availupdstr += " return  $new')  where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "' ";
                        stavailupd =(Statement)(Object) conn.createStatement();
                        stavailupd.executeUpdate(availupdstr);
                    }
                    if (enterloop) {
                        sw = new StringWriter();
                        serializer = new XMLSerializer(sw, formatter);
                        serializer.serialize(docseat);
                        String seatupdstr = "update hp_administrator.book_tickets set SEAT = xmlquery( 'transform copy $new := $SEAT ";
                        seatupdstr += " modify do replace $new/status/class[@type=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"] with " + sw.toString();
                        seatupdstr += " return $new') where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "'  ";
                        stseatupd =(Statement)(Object) conn.createStatement();
                        stseatupd.executeUpdate(seatupdstr);
                    }
                } else if (routesrcstr.equals(sourcenws) && !routedeststr.equals(destnnws)) {
                    System.out.println("case 2");
                    String excesssrcstr =(String)(Object) routesrc.getTextContent();
                    System.out.println(excesssrcstr);
                    Integer excesssrc = Integer.parseInt(excesssrcstr.trim());
                    NodeList nl2 =(NodeList)(Object) currentcoach.getElementsByTagName(destnnws);
                    Element e2 = (Element)(Element)(Object) nl2.item(0);
                    String desttillstr =(String)(Object) e2.getAttribute(destnnws + "TILL");
                    System.out.println(desttillstr);
                    Integer desttillcnt = Integer.parseInt(desttillstr.trim());
                    srcmaxstr =(String)(Object) routesrc.getAttribute(sourcenws);
                    System.out.println(srcmaxstr);
                    srcmax = Integer.parseInt(srcmaxstr.trim());
                    String spexcesssrcstr = "", spdesttillstr = "";
                    if ((boolean)(Object)useragent) {
                        spexcesssrcstr =(String)(Object) routesrc.getAttribute("agent");
                        spdesttillstr =(String)(Object) e2.getAttribute("agenttill");
                    } else {
                        spexcesssrcstr =(String)(Object) routesrc.getAttribute("user");
                        spdesttillstr =(String)(Object) e2.getAttribute("usertill");
                    }
                    System.out.println(spdesttillstr);
                    System.out.println(spexcesssrcstr);
                    Integer spdesttillcnt = Integer.parseInt(spdesttillstr.trim());
                    Integer spexcesssrc = Integer.parseInt(spexcesssrcstr.trim());
                    Element seat, stn;
                    if ((Integer)(Object)booking_details.getNoOfPersons() <= desttillcnt &&(Integer)(Object) booking_details.getNoOfPersons() <= spdesttillcnt) {
                        seatstart = coachmax - desttillcnt + 1;
                        seatcnt = desttillcnt;
                        NodeList nl3 =(NodeList)(Object) rootseat.getElementsByTagName("seat");
                        seat = (Element)(Element)(Object) nl3.item(0);
                        coach.clear();
                        seatno.clear();
                        booking_details.coachlist.clear();
                        booking_details.seatlist.clear();
                        for (tickpos = 0; tickpos < (int)(Object)booking_details.getNoOfPersons(); tickpos++) {
                            coach.add(currentcoachstr);
                            booking_details.coachlist.add(currentcoachstr);
                            while (Integer.parseInt((String)(Object)seat.getFirstChild().getTextContent().trim()) < seatstart) {
                                seat = (Element)(Element)(Object) seat.getNextSibling();
                            }
                            seatstart++;
                            System.out.println(seat.getFirstChild().getTextContent().trim());
                            seatno.add((String)(Object)seat.getFirstChild().getTextContent().trim());
                            booking_details.seatlist.add((String)(Object)seat.getFirstChild().getTextContent().trim());
                            nl3 =(NodeList)(Object) seat.getElementsByTagName(sourcenws);
                            stn = (Element)(Element)(Object) nl3.item(0);
                            while (!stn.getNodeName().equals(destnnws)) {
                                stn.setTextContent("0");
                                stn = (Element)(Element)(Object) stn.getNextSibling();
                            }
                        }
                        number_of_tickets_rem =(MyHelperClass)(Object) 0;
                        desttillcnt -= (Integer)(Object)booking_details.getNoOfPersons();
                        spdesttillcnt -= (Integer)(Object)booking_details.getNoOfPersons();
                        if (!firsttime) conn.rollback(sp1);
                        String availupd = "update hp_administrator.availability set AVAIL = xmlquery( 'transform copy $new := $AVAIL modify do replace value of ";
                        availupd += "$new/coach_status/class[@name=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"]/" + destnnws + "/@" + destnnws + "TILL" + " with \"" + desttillcnt + "\" ";
                        availupd += " return  $new')  where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "' ";
                        System.out.println(availupd);
                        stavailupd =(Statement)(Object) conn.createStatement();
                        int upst =(int)(Object) stavailupd.executeUpdate(availupd);
                        if (upst > 0) System.out.println("update avail success");
                        sw = new StringWriter();
                        serializer = new XMLSerializer(sw, formatter);
                        serializer.serialize(docseat);
                        String seatupdstr = "update hp_administrator.book_tickets set SEAT = xmlquery( 'transform copy $new := $SEAT ";
                        seatupdstr += " modify do replace $new/status/class[@type=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"] with " + sw.toString();
                        seatupdstr += " return $new') where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "'  ";
                        System.out.println(seatupdstr);
                        stseatupd =(Statement)(Object) conn.createStatement();
                        upst =(int)(Object) stseatupd.executeUpdate(seatupdstr);
                        if (upst > 0) System.out.println("update seat success");
                        String sp = "";
                        if ((boolean)(Object)useragent) sp = "agent"; else sp = "user";
                        availupd = "update hp_administrator.availability set AVAIL = xmlquery( 'transform copy $new := $AVAIL modify do replace value of ";
                        availupd += "$new/coach_status/class[@name=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"]/" + destnnws + "/@" + sp + "till" + " with \"" + spdesttillcnt + "\" ";
                        availupd += " return  $new')  where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "' ";
                        System.out.println(availupd);
                        stavailupd =(Statement)(Object) conn.createStatement();
                        upst =(int)(Object) stavailupd.executeUpdate(availupd);
                        if (upst > 0) System.out.println("update " + sp + " success");
                        break;
                    } else if ((Integer)(Object)booking_details.getNoOfPersons() > spdesttillcnt && spdesttillcnt > 0 &&(int)(Object) booking_details.getNoOfPersons() <= spdesttillcnt + spexcesssrc) {
                        int diff = 0;
                        if ((Integer)(Object)booking_details.getNoOfPersons() > spdesttillcnt) diff =(Integer)(Object) booking_details.getNoOfPersons() - spdesttillcnt;
                        tickpos = 0;
                        boolean initflg = true;
                        seatstart = coachmax - desttillcnt + 1;
                        seatcnt = desttillcnt;
                        NodeList nl3 =(NodeList)(Object) rootseat.getElementsByTagName("seat");
                        seat = (Element)(Element)(Object) nl3.item(0);
                        coach.clear();
                        seatno.clear();
                        booking_details.coachlist.clear();
                        booking_details.seatlist.clear();
                        for (tickpos = 0; tickpos < (int)(Object)booking_details.getNoOfPersons(); tickpos++) {
                            coach.add(currentcoachstr);
                            booking_details.coachlist.add(currentcoachstr);
                            while (Integer.parseInt((String)(Object)seat.getFirstChild().getTextContent().trim()) < seatstart) {
                                seat = (Element)(Element)(Object) seat.getNextSibling();
                            }
                            seatstart++;
                            System.out.println(seat.getFirstChild().getTextContent().trim());
                            seatno.add((String)(Object)seat.getFirstChild().getTextContent().trim());
                            booking_details.seatlist.add((String)(Object)seat.getFirstChild().getTextContent().trim());
                            nl3 =(NodeList)(Object) seat.getElementsByTagName(sourcenws);
                            stn = (Element)(Element)(Object) nl3.item(0);
                            while (!stn.getNodeName().equals(destnnws)) {
                                stn.setTextContent("0");
                                stn = (Element)(Element)(Object) stn.getNextSibling();
                            }
                            if (spdesttillcnt != 0) {
                                desttillcnt--;
                                spdesttillcnt--;
                            }
                            System.out.println("desttillcnt=" + desttillcnt + " spdes = " + desttillcnt + "initflg =" + initflg);
                            if (spdesttillcnt == 0 && initflg == true) {
                                alloccnt = srcmax - excesssrc;
                                seatstart = 1 + alloccnt;
                                initflg = false;
                                seat = (Element)(Element)(Object) seat.getParentNode().getFirstChild();
                            }
                        }
                        excesssrc -= diff;
                        spexcesssrc -= diff;
                        number_of_tickets_rem =(MyHelperClass)(Object) 0;
                        if (!firsttime) conn.rollback(sp1);
                        String availupd = "update hp_administrator.availability set AVAIL = xmlquery( 'transform copy $new := $AVAIL modify do replace value of ";
                        availupd += "$new/coach_status/class[@name=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"]/" + destnnws + "/@" + destnnws + "TILL" + " with \"" + desttillcnt + "\" ";
                        availupd += " return  $new')  where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "' ";
                        System.out.println(availupd);
                        stavailupd =(Statement)(Object) conn.createStatement();
                        int upst =(int)(Object) stavailupd.executeUpdate(availupd);
                        if (upst > 0) System.out.println("update avail success");
                        availupd = "update hp_administrator.availability set AVAIL = xmlquery( 'transform copy $new := $AVAIL  modify do ";
                        availupd += " replace value of $new/coach_status/class[@name=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"]/" + sourcenws + " with \"" + excesssrc + "\"";
                        availupd += " return  $new')  where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "' ";
                        System.out.println(availupd);
                        stavailupd =(Statement)(Object) conn.createStatement();
                        upst =(int)(Object) stavailupd.executeUpdate(availupd);
                        if (upst > 0) System.out.println("update avail success");
                        sw = new StringWriter();
                        serializer = new XMLSerializer(sw, formatter);
                        serializer.serialize(docseat);
                        String seatupdstr = "update hp_administrator.book_tickets set SEAT = xmlquery( 'transform copy $new := $SEAT ";
                        seatupdstr += " modify do replace $new/status/class[@type=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"] with " + sw.toString();
                        seatupdstr += " return $new') where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "'  ";
                        System.out.println(seatupdstr);
                        stseatupd =(Statement)(Object) conn.createStatement();
                        upst =(int)(Object) stseatupd.executeUpdate(seatupdstr);
                        if (upst > 0) System.out.println("update seat success");
                        String sp = "";
                        if ((boolean)(Object)useragent) sp = "agent"; else sp = "user";
                        availupd = "update hp_administrator.availability set AVAIL = xmlquery( 'transform copy $new := $AVAIL modify do replace value of ";
                        availupd += "$new/coach_status/class[@name=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"]/" + destnnws + "/@" + sp + "till" + " with \"" + spdesttillcnt + "\" ";
                        availupd += " return  $new')  where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "' ";
                        System.out.println(availupd);
                        stavailupd =(Statement)(Object) conn.createStatement();
                        upst =(int)(Object) stavailupd.executeUpdate(availupd);
                        if (upst > 0) System.out.println("update " + sp + " success");
                        availupd = "update hp_administrator.availability set AVAIL = xmlquery( 'transform copy $new := $AVAIL  modify do ";
                        availupd += " replace value of $new/coach_status/class[@name=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"]/" + sourcenws + "/@" + sp + " with \"" + spexcesssrc + "\"";
                        availupd += " return  $new')  where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "' ";
                        System.out.println(availupd);
                        stavailupd =(Statement)(Object) conn.createStatement();
                        upst =(int)(Object) stavailupd.executeUpdate(availupd);
                        if (upst > 0) System.out.println("update " + sp + " success");
                        break;
                    } else if ((Integer)(Object)booking_details.getNoOfPersons() > spdesttillcnt && spdesttillcnt == 0 &&(Integer)(Object) booking_details.getNoOfPersons() <= spexcesssrc) {
                        alloccnt = srcmax - excesssrc;
                        seatstart = 1 + alloccnt;
                        tickpos = 0;
                        boolean initflg = true;
                        NodeList nl3 =(NodeList)(Object) rootseat.getElementsByTagName("seat");
                        seat = (Element)(Element)(Object) nl3.item(0);
                        coach.clear();
                        seatno.clear();
                        booking_details.coachlist.clear();
                        booking_details.seatlist.clear();
                        for (tickpos = 0; tickpos < (int)(Object)booking_details.getNoOfPersons(); tickpos++) {
                            coach.add(currentcoachstr);
                            booking_details.coachlist.add(currentcoachstr);
                            while (Integer.parseInt((String)(Object)seat.getFirstChild().getTextContent().trim()) < seatstart) {
                                seat = (Element)(Element)(Object) seat.getNextSibling();
                            }
                            seatstart++;
                            System.out.println(seat.getFirstChild().getTextContent().trim());
                            seatno.add((String)(Object)seat.getFirstChild().getTextContent().trim());
                            booking_details.seatlist.add((String)(Object)seat.getFirstChild().getTextContent().trim());
                            nl3 =(NodeList)(Object) seat.getElementsByTagName(sourcenws);
                            stn = (Element)(Element)(Object) nl3.item(0);
                            while (!stn.getNodeName().equals(destnnws)) {
                                stn.setTextContent("0");
                                stn = (Element)(Element)(Object) stn.getNextSibling();
                            }
                            System.out.println("desttillcnt=" + desttillcnt + " spdes = " + desttillcnt + "initflg =" + initflg);
                        }
                        excesssrc -= (Integer)(Object)booking_details.getNoOfPersons();
                        spexcesssrc -= (Integer)(Object)booking_details.getNoOfPersons();
                        ;
                        number_of_tickets_rem =(MyHelperClass)(Object) 0;
                        if (!firsttime) conn.rollback(sp1);
                        String availupd = "update hp_administrator.availability set AVAIL = xmlquery( 'transform copy $new := $AVAIL  modify do ";
                        availupd += " replace value of $new/coach_status/class[@name=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"]/" + sourcenws + " with \"" + excesssrc + "\"";
                        availupd += " return  $new')  where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "' ";
                        System.out.println(availupd);
                        stavailupd =(Statement)(Object) conn.createStatement();
                        int upst =(int)(Object) stavailupd.executeUpdate(availupd);
                        if (upst > 0) System.out.println("update avail success");
                        sw = new StringWriter();
                        serializer = new XMLSerializer(sw, formatter);
                        serializer.serialize(docseat);
                        String seatupdstr = "update hp_administrator.book_tickets set SEAT = xmlquery( 'transform copy $new := $SEAT ";
                        seatupdstr += " modify do replace $new/status/class[@type=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"] with " + sw.toString();
                        seatupdstr += " return $new') where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "'  ";
                        System.out.println(seatupdstr);
                        stseatupd =(Statement)(Object) conn.createStatement();
                        upst =(int)(Object) stseatupd.executeUpdate(seatupdstr);
                        if (upst > 0) System.out.println("update seat success");
                        String sp = "";
                        if ((boolean)(Object)useragent) sp = "agent"; else sp = "user";
                        availupd = "update hp_administrator.availability set AVAIL = xmlquery( 'transform copy $new := $AVAIL  modify do ";
                        availupd += " replace value of $new/coach_status/class[@name=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"]/" + sourcenws + "/@" + sp + " with \"" + spexcesssrc + "\"";
                        availupd += " return  $new')  where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "' ";
                        System.out.println(availupd);
                        stavailupd =(Statement)(Object) conn.createStatement();
                        upst =(int)(Object) stavailupd.executeUpdate(availupd);
                        if (upst > 0) System.out.println("update " + sp + " success");
                        break;
                    }
                    NodeList nl3 =(NodeList)(Object) rootseat.getElementsByTagName("seat");
                    seat = (Element)(Element)(Object) nl3.item(0);
                    seatstart = 1;
                    String sp = "";
                    if ((boolean)(Object)useragent) sp = "agent"; else sp = "user";
                    while (spexcesssrc + spdesttillcnt > 0 &&(int)(Object) number_of_tickets_rem > 0) {
                        if (firsttime) {
                            sp1 =(Savepoint)(Object) conn.setSavepoint();
                            firsttime = false;
                        }
                        enterloop = true;
                        if (spdesttillcnt > 0) {
                            seatstart = coachmax - desttillcnt + 1;
                            desttillcnt--;
                            spdesttillcnt--;
                            String availupd = "update hp_administrator.availability set AVAIL = xmlquery( 'transform copy $new := $AVAIL modify do replace value of ";
                            availupd += "$new/coach_status/class[@name=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"]/" + destnnws + "/@" + destnnws + "TILL" + " with \"" + desttillcnt + "\" ";
                            availupd += " return  $new')  where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "' ";
                            stavailupd =(Statement)(Object) conn.createStatement();
                            stavailupd.executeUpdate(availupd);
                            availupd = "update hp_administrator.availability set AVAIL = xmlquery( 'transform copy $new := $AVAIL modify do replace value of ";
                            availupd += "$new/coach_status/class[@name=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"]/" + destnnws + "/@" + sp + "till" + " with \"" + spdesttillcnt + "\" ";
                            availupd += " return  $new')  where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "' ";
                            stavailupd =(Statement)(Object) conn.createStatement();
                            stavailupd.executeUpdate(availupd);
                        } else if (spdesttillcnt == 0) {
                            alloccnt = srcmax - excesssrc;
                            seatstart = 1 + alloccnt;
                            excesssrc--;
                            spexcesssrc--;
                            String availupd = "update hp_administrator.availability set AVAIL = xmlquery( 'transform copy $new := $AVAIL  modify do ";
                            availupd += " replace value of $new/coach_status/class[@name=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"]/" + sourcenws + " with \"" + excesssrc + "\"";
                            availupd += " return  $new')  where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "' ";
                            stavailupd =(Statement)(Object) conn.createStatement();
                            stavailupd.executeUpdate(availupd);
                            availupd = "update hp_administrator.availability set AVAIL = xmlquery( 'transform copy $new := $AVAIL  modify do ";
                            availupd += " replace value of $new/coach_status/class[@name=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"]/" + sourcenws + "/@" + sp + " with \"" + spexcesssrc + "\"";
                            availupd += " return  $new')  where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "' ";
                            stavailupd =(Statement)(Object) conn.createStatement();
                            stavailupd.executeUpdate(availupd);
                        }
                        while (Integer.parseInt((String)(Object)seat.getFirstChild().getTextContent().trim()) < seatstart) {
                            seat = (Element)(Element)(Object) seat.getNextSibling();
                        }
                        nl3 =(NodeList)(Object) seat.getElementsByTagName(sourcenws);
                        stn = (Element)(Element)(Object) nl3.item(0);
                        while (!stn.getNodeName().equals(destnnws)) {
                            stn.setTextContent("0");
                            stn = (Element)(Element)(Object) stn.getNextSibling();
                        }
                        coach.add(currentcoachstr);
                        booking_details.coachlist.add(currentcoachstr);
                        tickpos++;
                        number_of_tickets_rem--;
                    }
                    if (enterloop) {
                        sw = new StringWriter();
                        serializer = new XMLSerializer(sw, formatter);
                        serializer.serialize(docseat);
                        String seatupdstr = "update hp_administrator.book_tickets set SEAT = xmlquery( 'transform copy $new := $SEAT ";
                        seatupdstr += " modify do replace $new/status/class[@type=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"] with " + sw.toString();
                        seatupdstr += " return $new') where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "'  ";
                        stseatupd =(Statement)(Object) conn.createStatement();
                        stseatupd.executeUpdate(seatupdstr);
                    }
                } else if (!routesrcstr.equals(sourcenws) && routedeststr.equals(destnnws)) {
                    System.out.println("case 3");
                    NodeList nl2 =(NodeList)(Object) currentcoach.getElementsByTagName(sourcenws);
                    Element e2 = (Element)(Element)(Object) nl2.item(0);
                    navailstr =(String)(Object) e2.getTextContent();
                    System.out.println(navailstr);
                    navailcoach = Integer.parseInt(navailstr.trim());
                    if ((boolean)(Object)useragent) nspavailstr =(String)(Object) e2.getAttribute("agent"); else nspavailstr =(String)(Object) e2.getAttribute("user");
                    System.out.println(nspavailstr);
                    nspavailcoach = Integer.parseInt(nspavailstr.trim());
                    srctillstr =(String)(Object) e2.getAttribute(sourcenws + "TILL");
                    System.out.println(srctillstr);
                    srctill = Integer.parseInt(srctillstr.trim());
                    srcmaxstr =(String)(Object) e2.getAttribute(sourcenws);
                    System.out.println(srcmaxstr);
                    srcmax = Integer.parseInt(srcmaxstr.trim());
                    seatstart = coachmax - srctill + 1;
                    seatcnt = srcmax;
                    alloccnt = srcmax - navailcoach;
                    seatstart += alloccnt;
                    seatcnt -= alloccnt;
                    Element seat, stn;
                    NodeList nl3 =(NodeList)(Object) rootseat.getElementsByTagName("seat");
                    seat = (Element)(Element)(Object) nl3.item(0);
                    if ((Integer)(Object)booking_details.getNoOfPersons() <= navailcoach &&(Integer)(Object) booking_details.getNoOfPersons() <= nspavailcoach) {
                        coach.clear();
                        seatno.clear();
                        booking_details.coachlist.clear();
                        booking_details.seatlist.clear();
                        for (tickpos = 0; tickpos < (int)(Object)booking_details.getNoOfPersons(); tickpos++) {
                            coach.add(currentcoachstr);
                            booking_details.coachlist.add(currentcoachstr);
                            while (Integer.parseInt((String)(Object)seat.getFirstChild().getTextContent().trim()) < seatstart) {
                                seat = (Element)(Element)(Object) seat.getNextSibling();
                            }
                            seatstart++;
                            System.out.println(seat.getFirstChild().getTextContent().trim());
                            seatno.add((String)(Object)seat.getFirstChild().getTextContent().trim());
                            booking_details.seatlist.add((String)(Object)seat.getFirstChild().getTextContent().trim());
                            nl3 =(NodeList)(Object) seat.getElementsByTagName(sourcenws);
                            stn = (Element)(Element)(Object) nl3.item(0);
                            while (!stn.getNodeName().equals(destnnws)) {
                                stn.setTextContent("0");
                                stn = (Element)(Element)(Object) stn.getNextSibling();
                            }
                        }
                        number_of_tickets_rem =(MyHelperClass)(Object) 0;
                        navailcoach -= (Integer)(Object)booking_details.getNoOfPersons();
                        nspavailcoach -= (Integer)(Object)booking_details.getNoOfPersons();
                        String availupdstr = "update hp_administrator.availability set AVAIL = xmlquery( 'transform copy $new := $AVAIL  modify do ";
                        availupdstr += " replace value of $new/coach_status/class[@name=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"]/" + sourcenws + " with \"" + navailcoach + "\"";
                        availupdstr += " return  $new')  where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "' ";
                        stavailupd =(Statement)(Object) conn.createStatement();
                        stavailupd.executeUpdate(availupdstr);
                        sw = new StringWriter();
                        serializer = new XMLSerializer(sw, formatter);
                        serializer.serialize(docseat);
                        String seatupdstr = "update hp_administrator.book_tickets set SEAT = xmlquery( 'transform copy $new := $SEAT ";
                        seatupdstr += " modify do replace $new/status/class[@type=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"] with " + sw.toString();
                        seatupdstr += " return $new') where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "'  ";
                        stseatupd =(Statement)(Object) conn.createStatement();
                        stseatupd.executeUpdate(seatupdstr);
                        String sp = "";
                        if ((boolean)(Object)useragent) sp = "agent"; else sp = "user";
                        availupdstr = "update hp_administrator.availability set AVAIL = xmlquery( 'transform copy $new := $AVAIL  modify do ";
                        availupdstr += " replace value of $new/coach_status/class[@name=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"]/" + sourcenws + "/@" + sp + " with \"" + nspavailcoach + "\"";
                        availupdstr += " return  $new')  where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "' ";
                        stavailupd =(Statement)(Object) conn.createStatement();
                        stavailupd.executeUpdate(availupdstr);
                        break;
                    }
                    while (navailcoach > 0 && nspavailcoach > 0 &&(int)(Object) number_of_tickets_rem > 0) {
                        if (firsttime) {
                            sp1 =(Savepoint)(Object) conn.setSavepoint();
                            firsttime = false;
                        }
                        enterloop = true;
                        coach.add(currentcoachstr);
                        booking_details.coachlist.add(currentcoachstr);
                        tickpos++;
                        number_of_tickets_rem--;
                        navailcoach--;
                        nspavailcoach--;
                        while (Integer.parseInt((String)(Object)seat.getFirstChild().getTextContent().trim()) < seatstart) {
                            seat = (Element)(Element)(Object) seat.getNextSibling();
                        }
                        seatstart++;
                        System.out.println(seat.getFirstChild().getTextContent().trim());
                        seatno.add((String)(Object)seat.getFirstChild().getTextContent().trim());
                        booking_details.seatlist.add((String)(Object)seat.getFirstChild().getTextContent().trim());
                        nl3 =(NodeList)(Object) seat.getElementsByTagName(sourcenws);
                        stn = (Element)(Element)(Object) nl3.item(0);
                        while (!stn.getNodeName().equals(destnnws)) {
                            stn.setTextContent("0");
                            stn = (Element)(Element)(Object) stn.getNextSibling();
                        }
                        String availupdstr = "update hp_administrator.availability set AVAIL = xmlquery( 'transform copy $new := $AVAIL  modify do ";
                        availupdstr += " replace value of $new/coach_status/class[@name=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"]/" + sourcenws + " with \"" + navailcoach + "\"";
                        availupdstr += " return  $new')  where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "' ";
                        System.out.println(availupdstr);
                        stavailupd =(Statement)(Object) conn.createStatement();
                        stavailupd.executeUpdate(availupdstr);
                        String sp = "";
                        if ((boolean)(Object)useragent) sp = "agent"; else sp = "user";
                        availupdstr = "update hp_administrator.availability set AVAIL = xmlquery( 'transform copy $new := $AVAIL  modify do ";
                        availupdstr += " replace value of $new/coach_status/class[@name=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"]/" + sourcenws + "/@" + sp + " with \"" + nspavailcoach + "\"";
                        availupdstr += " return  $new')  where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "' ";
                        System.out.println(availupdstr);
                        stavailupd =(Statement)(Object) conn.createStatement();
                        stavailupd.executeUpdate(availupdstr);
                    }
                    if (enterloop) {
                        sw = new StringWriter();
                        serializer = new XMLSerializer(sw, formatter);
                        serializer.serialize(docseat);
                        String seatupdstr = "update hp_administrator.book_tickets set SEAT = xmlquery( 'transform copy $new := $SEAT ";
                        seatupdstr += " modify do replace $new/status/class[@type=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"] with " + sw.toString();
                        seatupdstr += " return $new') where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "'  ";
                        System.out.println("!@#------->" + seatupdstr);
                        stseatupd =(Statement)(Object) conn.createStatement();
                    }
                } else if (!routesrcstr.equals(sourcenws) && !routedeststr.equals(destnnws)) {
                    System.out.println("case 4");
                    srcmaxstr =(String)(Object) routesrc.getAttribute(sourcenws);
                    System.out.println(srcmaxstr);
                    srcmax = Integer.parseInt(srcmaxstr.trim());
                    Element seat, stn;
                    NodeList nl2 =(NodeList)(Object) currentcoach.getElementsByTagName(sourcenws);
                    Element e2 = (Element)(Element)(Object) nl2.item(0);
                    navailstr =(String)(Object) e2.getTextContent();
                    Integer excesssrc = Integer.parseInt(navailstr.trim());
                    nl2 =(NodeList)(Object) currentcoach.getElementsByTagName(destnnws);
                    e2 = (Element)(Element)(Object) nl2.item(0);
                    navailstr =(String)(Object) e2.getAttribute(destnnws + "TILL");
                    Integer desttillcnt = Integer.parseInt(navailstr.trim());
                    String spexcesssrcstr = "", spdesttillstr = "";
                    if ((boolean)(Object)useragent) {
                        spexcesssrcstr =(String)(Object) routesrc.getAttribute("agent");
                        spdesttillstr =(String)(Object) e2.getAttribute("agenttill");
                    } else {
                        spexcesssrcstr =(String)(Object) routesrc.getAttribute("user");
                        spdesttillstr =(String)(Object) e2.getAttribute("usertill");
                    }
                    Integer spdesttillcnt = Integer.parseInt(spdesttillstr.trim());
                    Integer spexcesssrc = Integer.parseInt(spexcesssrcstr.trim());
                    NodeList nl3 =(NodeList)(Object) rootseat.getElementsByTagName("seat");
                    seat = (Element)(Element)(Object) nl3.item(0);
                    boolean initflg = true;
                    if ((Integer)(Object)booking_details.getNoOfPersons() <= spdesttillcnt) {
                        seatstart = coachmax - desttillcnt + 1;
                        seatcnt = desttillcnt;
                        coach.clear();
                        seatno.clear();
                        booking_details.coachlist.clear();
                        booking_details.seatlist.clear();
                        for (tickpos = 0; tickpos < (int)(Object)booking_details.getNoOfPersons(); tickpos++) {
                            coach.add(currentcoachstr);
                            booking_details.coachlist.add(currentcoachstr);
                            while (Integer.parseInt((String)(Object)seat.getFirstChild().getTextContent().trim()) < seatstart) {
                                seat = (Element)(Element)(Object) seat.getNextSibling();
                            }
                            seatstart++;
                            System.out.println(seat.getFirstChild().getTextContent().trim());
                            seatno.add((String)(Object)seat.getFirstChild().getTextContent().trim());
                            booking_details.seatlist.add((String)(Object)seat.getFirstChild().getTextContent().trim());
                            nl3 =(NodeList)(Object) seat.getElementsByTagName(sourcenws);
                            stn = (Element)(Element)(Object) nl3.item(0);
                            while (!stn.getNodeName().equals(destnnws)) {
                                stn.setTextContent("0");
                                stn = (Element)(Element)(Object) stn.getNextSibling();
                            }
                        }
                        number_of_tickets_rem =(MyHelperClass)(Object) 0;
                        desttillcnt -= (Integer)(Object)booking_details.getNoOfPersons();
                        spdesttillcnt -= (Integer)(Object)booking_details.getNoOfPersons();
                        if (!firsttime) conn.rollback(sp1);
                        String availupd = "update hp_administrator.availability set AVAIL = xmlquery( 'transform copy $new := $AVAIL modify do replace value of ";
                        availupd += "$new/coach_status/class[@name=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"]/" + destnnws + "/@" + destnnws + "TILL" + " with \"" + desttillcnt + "\" ";
                        availupd += " return  $new')  where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "' ";
                        stavailupd =(Statement)(Object) conn.createStatement();
                        stavailupd.executeUpdate(availupd);
                        sw = new StringWriter();
                        serializer = new XMLSerializer(sw, formatter);
                        serializer.serialize(docseat);
                        String seatupdstr = "update hp_administrator.book_tickets set SEAT = xmlquery( 'transform copy $new := $SEAT ";
                        seatupdstr += " modify do replace $new/status/class[@type=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"] with " + sw.toString();
                        seatupdstr += " return $new') where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "'  ";
                        stseatupd =(Statement)(Object) conn.createStatement();
                        stseatupd.executeUpdate(seatupdstr);
                        String sp = "";
                        if ((boolean)(Object)useragent) sp = "agent"; else sp = "user";
                        availupd = "update hp_administrator.availability set AVAIL = xmlquery( 'transform copy $new := $AVAIL modify do replace value of ";
                        availupd += "$new/coach_status/class[@name=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"]/" + destnnws + "/@" + sp + "till" + " with \"" + spdesttillcnt + "\" ";
                        availupd += " return  $new')  where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "' ";
                        stavailupd =(Statement)(Object) conn.createStatement();
                        stavailupd.executeUpdate(availupd);
                        break;
                    } else if ((Integer)(Object)booking_details.getNoOfPersons() > spdesttillcnt && spdesttillcnt > 0 &&(int)(Object) booking_details.getNoOfPersons() <= spdesttillcnt + spexcesssrc) {
                        int diff = 0;
                        if ((Integer)(Object)booking_details.getNoOfPersons() > spdesttillcnt) diff =(Integer)(Object) booking_details.getNoOfPersons() - spdesttillcnt;
                        seatstart = coachmax - desttillcnt + 1;
                        seatcnt = desttillcnt;
                        coach.clear();
                        seatno.clear();
                        booking_details.coachlist.clear();
                        booking_details.seatlist.clear();
                        for (tickpos = 0; tickpos < (int)(Object)booking_details.getNoOfPersons(); tickpos++) {
                            coach.add(currentcoachstr);
                            booking_details.coachlist.add(currentcoachstr);
                            while (Integer.parseInt((String)(Object)seat.getFirstChild().getTextContent().trim()) < seatstart) {
                                seat = (Element)(Element)(Object) seat.getNextSibling();
                            }
                            seatstart++;
                            System.out.println(seat.getFirstChild().getTextContent().trim());
                            seatno.add((String)(Object)seat.getFirstChild().getTextContent().trim());
                            booking_details.seatlist.add((String)(Object)seat.getFirstChild().getTextContent().trim());
                            nl3 =(NodeList)(Object) seat.getElementsByTagName(sourcenws);
                            stn = (Element)(Element)(Object) nl3.item(0);
                            while (!stn.getNodeName().equals(destnnws)) {
                                stn.setTextContent("0");
                                stn = (Element)(Element)(Object) stn.getNextSibling();
                            }
                            if (spdesttillcnt != 0) {
                                desttillcnt--;
                                spdesttillcnt--;
                            }
                            if (spdesttillcnt == 0 && initflg == true) {
                                alloccnt = srcmax - excesssrc;
                                seatstart = 1 + alloccnt;
                                initflg = false;
                            }
                        }
                        excesssrc -= diff;
                        spexcesssrc -= diff;
                        number_of_tickets_rem =(MyHelperClass)(Object) 0;
                        if (!firsttime) conn.rollback(sp1);
                        String availupd = "update hp_administrator.availability set AVAIL = xmlquery( 'transform copy $new := $AVAIL modify do replace value of ";
                        availupd += "$new/coach_status/class[@name=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"]/" + destnnws + "/@" + destnnws + "TILL" + " with \"" + desttillcnt + "\" ";
                        availupd += " return  $new')  where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "' ";
                        stavailupd =(Statement)(Object) conn.createStatement();
                        stavailupd.executeUpdate(availupd);
                        availupd = "update hp_administrator.availability set AVAIL = xmlquery( 'transform copy $new := $AVAIL  modify do ";
                        availupd += " replace value of $new/coach_status/class[@name=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"]/" + sourcenws + " with \"" + excesssrc + "\"";
                        availupd += " return  $new')  where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "' ";
                        stavailupd =(Statement)(Object) conn.createStatement();
                        stavailupd.executeUpdate(availupd);
                        sw = new StringWriter();
                        serializer = new XMLSerializer(sw, formatter);
                        serializer.serialize(docseat);
                        String seatupdstr = "update hp_administrator.book_tickets set SEAT = xmlquery( 'transform copy $new := $SEAT ";
                        seatupdstr += " modify do replace $new/status/class[@type=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"] with " + sw.toString();
                        seatupdstr += " return $new') where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "'  ";
                        stseatupd =(Statement)(Object) conn.createStatement();
                        stseatupd.executeUpdate(seatupdstr);
                        String sp = "";
                        if ((boolean)(Object)useragent) sp = "agent"; else sp = "user";
                        availupd = "update hp_administrator.availability set AVAIL = xmlquery( 'transform copy $new := $AVAIL modify do replace value of ";
                        availupd += "$new/coach_status/class[@name=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"]/" + destnnws + "/@" + sp + "till" + " with \"" + spdesttillcnt + "\" ";
                        availupd += " return  $new')  where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "' ";
                        stavailupd =(Statement)(Object) conn.createStatement();
                        stavailupd.executeUpdate(availupd);
                        availupd = "update hp_administrator.availability set AVAIL = xmlquery( 'transform copy $new := $AVAIL  modify do ";
                        availupd += " replace value of $new/coach_status/class[@name=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"]/" + sourcenws + "/@" + sp + " with \"" + spexcesssrc + "\"";
                        availupd += " return  $new')  where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "' ";
                        stavailupd =(Statement)(Object) conn.createStatement();
                        stavailupd.executeUpdate(availupd);
                        break;
                    } else if (spdesttillcnt == 0 &&(Integer)(Object) booking_details.getNoOfPersons() <= spexcesssrc) {
                        alloccnt = srcmax - excesssrc;
                        seatstart = 1 + alloccnt;
                        coach.clear();
                        seatno.clear();
                        booking_details.coachlist.clear();
                        booking_details.seatlist.clear();
                        for (tickpos = 0; tickpos < (int)(Object)booking_details.getNoOfPersons(); tickpos++) {
                            coach.add(currentcoachstr);
                            booking_details.coachlist.add(currentcoachstr);
                            while (Integer.parseInt((String)(Object)seat.getFirstChild().getTextContent().trim()) < seatstart) {
                                seat = (Element)(Element)(Object) seat.getNextSibling();
                            }
                            seatstart++;
                            System.out.println(seat.getFirstChild().getTextContent().trim());
                            seatno.add((String)(Object)seat.getFirstChild().getTextContent().trim());
                            booking_details.seatlist.add((String)(Object)seat.getFirstChild().getTextContent().trim());
                            nl3 =(NodeList)(Object) seat.getElementsByTagName(sourcenws);
                            stn = (Element)(Element)(Object) nl3.item(0);
                            while (!stn.getNodeName().equals(destnnws)) {
                                stn.setTextContent("0");
                                stn = (Element)(Element)(Object) stn.getNextSibling();
                            }
                        }
                        excesssrc -= (Integer)(Object)booking_details.getNoOfPersons();
                        spexcesssrc -= (Integer)(Object)booking_details.getNoOfPersons();
                        number_of_tickets_rem =(MyHelperClass)(Object) 0;
                        if (!firsttime) conn.rollback(sp1);
                        String availupd = "update hp_administrator.availability set AVAIL = xmlquery( 'transform copy $new := $AVAIL  modify do ";
                        availupd += " replace value of $new/coach_status/class[@name=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"]/" + sourcenws + " with \"" + excesssrc + "\"";
                        availupd += " return  $new')  where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "' ";
                        stavailupd =(Statement)(Object) conn.createStatement();
                        stavailupd.executeUpdate(availupd);
                        sw = new StringWriter();
                        serializer = new XMLSerializer(sw, formatter);
                        serializer.serialize(docseat);
                        String seatupdstr = "update hp_administrator.book_tickets set SEAT = xmlquery( 'transform copy $new := $SEAT ";
                        seatupdstr += " modify do replace $new/status/class[@type=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"] with " + sw.toString();
                        seatupdstr += " return $new') where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "'  ";
                        stseatupd =(Statement)(Object) conn.createStatement();
                        stseatupd.executeUpdate(seatupdstr);
                        String sp = "";
                        if ((boolean)(Object)useragent) sp = "agent"; else sp = "user";
                        availupd = "update hp_administrator.availability set AVAIL = xmlquery( 'transform copy $new := $AVAIL  modify do ";
                        availupd += " replace value of $new/coach_status/class[@name=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"]/" + sourcenws + "/@" + sp + " with \"" + spexcesssrc + "\"";
                        availupd += " return  $new')  where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "' ";
                        stavailupd =(Statement)(Object) conn.createStatement();
                        stavailupd.executeUpdate(availupd);
                        break;
                    }
                    seatstart = 1;
                    String sp = "";
                    if ((boolean)(Object)useragent) sp = "agent"; else sp = "user";
                    while (spexcesssrc + spdesttillcnt > 0 &&(int)(Object) number_of_tickets_rem > 0) {
                        if (firsttime) {
                            sp1 =(Savepoint)(Object) conn.setSavepoint();
                            firsttime = false;
                        }
                        enterloop = true;
                        if (spdesttillcnt > 0) {
                            seatstart = coachmax - desttillcnt + 1;
                            desttillcnt--;
                            spdesttillcnt--;
                            String availupd = "update hp_administrator.availability set AVAIL = xmlquery( 'transform copy $new := $AVAIL modify do replace value of ";
                            availupd += "$new/coach_status/class[@name=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"]/" + destnnws + "/@" + destnnws + "TILL" + " with \"" + desttillcnt + "\" ";
                            availupd += " return  $new')  where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "' ";
                            stavailupd =(Statement)(Object) conn.createStatement();
                            stavailupd.executeUpdate(availupd);
                            availupd = "update hp_administrator.availability set AVAIL = xmlquery( 'transform copy $new := $AVAIL modify do replace value of ";
                            availupd += "$new/coach_status/class[@name=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"]/" + destnnws + "/@" + sp + "till" + " with \"" + spdesttillcnt + "\" ";
                            availupd += " return  $new')  where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "' ";
                            stavailupd =(Statement)(Object) conn.createStatement();
                            stavailupd.executeUpdate(availupd);
                        } else if (spdesttillcnt == 0) {
                            alloccnt = srcmax - excesssrc;
                            seatstart = 1 + alloccnt;
                            excesssrc--;
                            spexcesssrc--;
                            String availupd = "update hp_administrator.availability set AVAIL = xmlquery( 'transform copy $new := $AVAIL  modify do ";
                            availupd += " replace value of $new/coach_status/class[@name=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"]/" + sourcenws + "/@" + sp + " with \"" + excesssrc + "\"";
                            availupd += " return  $new')  where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "' ";
                            stavailupd =(Statement)(Object) conn.createStatement();
                            stavailupd.executeUpdate(availupd);
                            availupd = "update hp_administrator.availability set AVAIL = xmlquery( 'transform copy $new := $AVAIL  modify do ";
                            availupd += " replace value of $new/coach_status/class[@name=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"]/" + sourcenws + " with \"" + spexcesssrc + "\"";
                            availupd += " return  $new')  where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "' ";
                            stavailupd =(Statement)(Object) conn.createStatement();
                            stavailupd.executeUpdate(availupd);
                        }
                        while (Integer.parseInt((String)(Object)seat.getFirstChild().getTextContent().trim()) < seatstart) {
                            seat = (Element)(Element)(Object) seat.getNextSibling();
                        }
                        nl3 =(NodeList)(Object) seat.getElementsByTagName(sourcenws);
                        stn = (Element)(Element)(Object) nl3.item(0);
                        while (!stn.getNodeName().equals(destnnws)) {
                            stn.setTextContent("0");
                            stn = (Element)(Element)(Object) stn.getNextSibling();
                        }
                        coach.add(currentcoachstr);
                        booking_details.coachlist.add(currentcoachstr);
                        tickpos++;
                        number_of_tickets_rem--;
                    }
                    if (enterloop) {
                        sw = new StringWriter();
                        serializer = new XMLSerializer(sw, formatter);
                        serializer.serialize(docseat);
                        String seatupdstr = "update hp_administrator.book_tickets set SEAT = xmlquery( 'transform copy $new := $SEAT ";
                        seatupdstr += " modify do replace $new/status/class[@type=\"" + booking_details.getTclass() + "\"]/coach[@number=\"" + currentcoachstr + "\"] with " + sw.toString();
                        seatupdstr += " return $new') where train_no like '" + booking_details.getTrain_no() + "' and date = '" + booking_details.getDate() + "'  ";
                        stseatupd =(Statement)(Object) conn.createStatement();
                        stseatupd.executeUpdate(seatupdstr);
                    }
                }
            }
            availfin =(MyHelperClass)(Object) true;
        } catch (SQLException e) {
            conn.rollback();
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            conn.rollback();
            e.printStackTrace();
        } catch (SAXException e) {
            conn.rollback();
            e.printStackTrace();
        } catch (IOException e) {
            conn.rollback();
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass coachlist;
	public MyHelperClass seatlist;
	public int number_of_tickets_rem;
public MyHelperClass add(String o0){ return null; }
	public MyHelperClass rollback(Savepoint o0){ return null; }
	public MyHelperClass getFirstChild(){ return null; }
	public MyHelperClass getTclass(){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass getDate(){ return null; }
	public MyHelperClass setSavepoint(){ return null; }
	public MyHelperClass getTextContent(){ return null; }
	public MyHelperClass trim(){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass getTrain_no(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass getPreviousSibling(){ return null; }
	public MyHelperClass clear(){ return null; }
	public MyHelperClass getNoOfPersons(){ return null; }}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Savepoint {

}

class PreparedStatement {

}

class Statement {

public MyHelperClass executeQuery(String o0){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}

class ResultSet {

public MyHelperClass getString(int o0){ return null; }
	public MyHelperClass next(){ return null; }}

class DocumentBuilderFactory {

public MyHelperClass newDocumentBuilder(){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(ByteArrayInputStream o0){ return null; }}

class Document {

public MyHelperClass getDocumentElement(){ return null; }}

class Element {

public MyHelperClass setTextContent(String o0){ return null; }
	public MyHelperClass getElementsByTagName(MyHelperClass o0){ return null; }
	public MyHelperClass getFirstChild(){ return null; }
	public MyHelperClass getAttribute(String o0){ return null; }
	public MyHelperClass getElementsByTagName(String o0){ return null; }
	public MyHelperClass getTextContent(){ return null; }
	public MyHelperClass getLastChild(){ return null; }
	public MyHelperClass getNodeName(){ return null; }
	public MyHelperClass getAttribute(MyHelperClass o0){ return null; }
	public MyHelperClass getNextSibling(){ return null; }
	public MyHelperClass getParentNode(){ return null; }
	public MyHelperClass getPreviousSibling(){ return null; }}

class Node {

}

class OutputFormat {

public MyHelperClass setOmitXMLDeclaration(boolean o0){ return null; }
	public MyHelperClass setEncoding(String o0){ return null; }
	public MyHelperClass setPreserveSpace(boolean o0){ return null; }}

class XMLSerializer {

XMLSerializer(StringWriter o0, OutputFormat o1){}
	XMLSerializer(){}
	public MyHelperClass serialize(Document o0){ return null; }}

class NodeList {

public MyHelperClass add(String o0){ return null; }
	public MyHelperClass item(int o0){ return null; }
	public MyHelperClass clear(){ return null; }
	public MyHelperClass getLength(){ return null; }}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}
