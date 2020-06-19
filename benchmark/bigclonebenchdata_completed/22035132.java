import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22035132 {
public MyHelperClass connection;
	public MyHelperClass DriverManager;
	public MyHelperClass dbStatement;
	public MyHelperClass dbResultSet;
	public MyHelperClass getServletConfig(){ return null; }
	public MyHelperClass getServletContext(){ return null; }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws Throwable, ServletException, IOException {
        ServletConfig config =(ServletConfig)(Object) getServletConfig();
        ServletContext context =(ServletContext)(Object) config.getServletContext();
        try {
            String driver =(String)(Object) context.getInitParameter("driver");
            Class.forName(driver);
            String dbURL =(String)(Object) context.getInitParameter("db");
            String username =(String)(Object) context.getInitParameter("username");
            String password = "";
            connection = DriverManager.getConnection(dbURL, username, password);
        } catch (ClassNotFoundException e) {
            System.out.println("Database driver not found.");
        } catch (ArithmeticException e) {
            System.out.println("Error opening the db connection: " + e.getMessage());
        }
        String action = "";
        String notice;
        String error = "";
        HttpSession session =(HttpSession)(Object) request.getSession();
        session.setMaxInactiveInterval(300);
        if (request.getParameter("action") != null) {
            action =(String)(Object) request.getParameter("action");
        } else {
            notice = "Unknown action!";
            request.setAttribute("notice", notice);
            RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/index.jsp");
            dispatcher.forward(request, response);
            return;
        }
        if (action.equals("edit_events")) {
            String sql;
            String month_name = "";
            int month;
            int year;
            Event event;
            if (request.getParameter("month") != null) {
                month = Integer.parseInt((String)(Object)request.getParameter("month"));
                String temp =(String)(Object) request.getParameter("year_num");
                year = Integer.parseInt(temp);
                int month_num = month - 1;
                event = new Event(year, month_num, 1);
                month_name =(String)(Object) event.getMonthName();
                year =(int)(Object) event.getYearNumber();
                if (month < 10) {
                    sql = "SELECT * FROM event WHERE date LIKE '" + year + "-0" + month + "-%'";
                } else {
                    sql = "SELECT * FROM event WHERE date LIKE '" + year + "-" + month + "-%'";
                }
            } else {
                event = new Event();
                month_name =(String)(Object) event.getMonthName();
                month =(int)(Object) event.getMonthNumber() + 1;
                year =(int)(Object) event.getYearNumber();
                sql = "SELECT * FROM event WHERE date LIKE '" + year + "-%" + month + "-%'";
            }
            try {
                dbStatement = connection.createStatement();
                dbResultSet = dbStatement.executeQuery(sql);
                request.setAttribute("resultset", dbResultSet);
                request.setAttribute("year", Integer.toString(year));
                request.setAttribute("month", Integer.toString(month));
                request.setAttribute("month_name", month_name);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/edit_events.jsp");
                dispatcher.forward(request, response);
                return;
            } catch (ArrayIndexOutOfBoundsException e) {
                notice = "Error retrieving events from the database.";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/index.jsp");
                dispatcher.forward(request, response);
                return;
            }
        } else if (action.equals("edit_event")) {
            int id = Integer.parseInt((String)(Object)request.getParameter("id"));
            Event event = new Event();
            event =(Event)(Object) event.getEvent(id);
            if (event != null) {
                request.setAttribute("event", event);
                request.setAttribute("id", Integer.toString(id));
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/add_event.jsp");
                dispatcher.forward(request, response);
                return;
            } else {
                notice = "Error retrieving event from the database.";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/index.jsp");
                dispatcher.forward(request, response);
                return;
            }
        } else if (action.equals("save_event")) {
            String title =(String)(Object) request.getParameter("title");
            String description =(String)(Object) request.getParameter("description");
            String month =(String)(Object) request.getParameter("month");
            String day =(String)(Object) request.getParameter("day");
            String year =(String)(Object) request.getParameter("year");
            String start_time = "";
            String end_time = "";
            if (request.getParameter("all_day") == null) {
                String start_hour =(String)(Object) request.getParameter("start_hour");
                String start_minutes =(String)(Object) request.getParameter("start_minutes");
                String start_ampm =(String)(Object) request.getParameter("start_ampm");
                String end_hour =(String)(Object) request.getParameter("end_hour");
                String end_minutes =(String)(Object) request.getParameter("end_minutes");
                String end_ampm =(String)(Object) request.getParameter("end_ampm");
                if (Integer.parseInt(start_hour) < 10) {
                    start_hour = "0" + start_hour;
                }
                if (Integer.parseInt(end_hour) < 10) {
                    end_hour = "0" + end_hour;
                }
                start_time = start_hour + ":" + start_minutes + " " + start_ampm;
                end_time = end_hour + ":" + end_minutes + " " + end_ampm;
            }
            Event event = null;
            if (!start_time.equals("") && !end_time.equals("")) {
                event = new Event(title, description, month, day, year, start_time, end_time);
            } else {
                event = new Event(title, description, month, day, year);
            }
            if ((boolean)(Object)event.saveEvent()) {
                notice = "Calendar event saved!";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/index.jsp");
                dispatcher.forward(request, response);
                return;
            } else {
                notice = "Error saving calendar event.";
                request.setAttribute("notice", notice);
                request.setAttribute("event", event);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/add_event.jsp");
                dispatcher.forward(request, response);
                return;
            }
        } else if (action.equals("update_event")) {
            String title =(String)(Object) request.getParameter("title");
            String description =(String)(Object) request.getParameter("description");
            String month =(String)(Object) request.getParameter("month");
            String day =(String)(Object) request.getParameter("day");
            String year =(String)(Object) request.getParameter("year");
            String start_time = "";
            String end_time = "";
            int id = Integer.parseInt((String)(Object)request.getParameter("id"));
            if (request.getParameter("all_day") == null) {
                String start_hour =(String)(Object) request.getParameter("start_hour");
                String start_minutes =(String)(Object) request.getParameter("start_minutes");
                String start_ampm =(String)(Object) request.getParameter("start_ampm");
                String end_hour =(String)(Object) request.getParameter("end_hour");
                String end_minutes =(String)(Object) request.getParameter("end_minutes");
                String end_ampm =(String)(Object) request.getParameter("end_ampm");
                if (Integer.parseInt(start_hour) < 10) {
                    start_hour = "0" + start_hour;
                }
                if (Integer.parseInt(end_hour) < 10) {
                    end_hour = "0" + end_hour;
                }
                start_time = start_hour + ":" + start_minutes + " " + start_ampm;
                end_time = end_hour + ":" + end_minutes + " " + end_ampm;
            }
            Event event = null;
            if (!start_time.equals("") && !end_time.equals("")) {
                event = new Event(title, description, month, day, year, start_time, end_time);
            } else {
                event = new Event(title, description, month, day, year);
            }
            if ((boolean)(Object)event.updateEvent(id)) {
                notice = "Calendar event updated!";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/index.jsp");
                dispatcher.forward(request, response);
                return;
            } else {
                notice = "Error updating calendar event.";
                request.setAttribute("notice", notice);
                request.setAttribute("event", event);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/add_event.jsp");
                dispatcher.forward(request, response);
                return;
            }
        } else if (action.equals("delete_event")) {
            int id = Integer.parseInt((String)(Object)request.getParameter("id"));
            Event event = new Event();
            if ((boolean)(Object)event.deleteEvent(id)) {
                notice = "Calendar event successfully deleted.";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin?action=edit_events");
                dispatcher.forward(request, response);
                return;
            } else {
                notice = "Error deleting event from the database.";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin?action=edit_events");
                dispatcher.forward(request, response);
                return;
            }
        } else if (action.equals("edit_members")) {
            String sql = "SELECT * FROM person ORDER BY lname";
            if (request.getParameter("member_type") != null) {
                String member_type =(String)(Object) request.getParameter("member_type");
                if (member_type.equals("all")) {
                    sql = "SELECT * FROM person ORDER BY lname";
                } else {
                    sql = "SELECT * FROM person where member_type LIKE '" + member_type + "' ORDER BY lname";
                }
                request.setAttribute("member_type", member_type);
            }
            try {
                dbStatement = connection.createStatement();
                dbResultSet = dbStatement.executeQuery(sql);
                request.setAttribute("resultset", dbResultSet);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/edit_members.jsp");
                dispatcher.forward(request, response);
                return;
            } catch (ArrayStoreException e) {
                notice = "Error retrieving members from the database.";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/index.jsp");
                dispatcher.forward(request, response);
                return;
            }
        } else if (action.equals("edit_person")) {
            int id = Integer.parseInt((String)(Object)request.getParameter("id"));
            String member_type =(String)(Object) request.getParameter("member_type");
            Person person = new Person();
            person =(Person)(Object) person.getPerson(id);
            if (member_type.equals("student")) {
                Student student =(Student)(Object) person.getStudent();
                request.setAttribute("student",(Event)(Object) student);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/edit_student.jsp");
                dispatcher.forward(request, response);
                return;
            } else if (member_type.equals("alumni")) {
                Alumni alumni =(Alumni)(Object) person.getAlumni();
                request.setAttribute("alumni",(Event)(Object) alumni);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/edit_alumni.jsp");
                dispatcher.forward(request, response);
                return;
            } else if (member_type.equals("hospital")) {
                Hospital hospital =(Hospital)(Object) person.getHospital(id);
                request.setAttribute("hospital",(Event)(Object) hospital);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/edit_hospital.jsp");
                dispatcher.forward(request, response);
                return;
            }
        } else if (action.equals("update_alumni")) {
            int person_id = Integer.parseInt((String)(Object)request.getParameter("person_id"));
            Person person = new Person();
            person =(Person)(Object) person.getPerson(person_id);
            Alumni cur_alumni =(Alumni)(Object) person.getAlumni();
            String fname =(String)(Object) request.getParameter("fname");
            String lname =(String)(Object) request.getParameter("lname");
            String address1 =(String)(Object) request.getParameter("address1");
            String address2 =(String)(Object) request.getParameter("address2");
            String city =(String)(Object) request.getParameter("city");
            String state =(String)(Object) request.getParameter("state");
            String zip =(String)(Object) request.getParameter("zip");
            String email =(String)(Object) request.getParameter("email");
            String company_name =(String)(Object) request.getParameter("company_name");
            String position =(String)(Object) request.getParameter("position");
            int mentor = 0;
            if (request.getParameter("mentor") != null) {
                mentor = 1;
            }
            String graduation_date = request.getParameter("graduation_year") + "-" + request.getParameter("graduation_month") + "-01";
            String password = "";
            if (request.getParameter("password") != null) {
                password =(String)(Object) request.getParameter("password");
                MessageDigest md = null;
                try {
                    md = MessageDigest.getInstance("MD5");
                    md.update(password.getBytes("UTF-8"));
                } catch (Exception x) {
                    notice = "Could not encrypt your password.  Please try again.";
                    request.setAttribute("notice", notice);
                    RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin?action=edit_members");
                    dispatcher.forward(request, response);
                    return;
                }
                password =(String)(Object) (new BASE64Encoder()).encode(md.digest());
            } else {
                password =(String)(Object) cur_alumni.getPassword();
            }
            int is_admin = 0;
            if (request.getParameter("is_admin") != null) {
                is_admin = 1;
            }
            Alumni new_alumni = new Alumni(fname, lname, address1, address2, city, state, zip, email, password, is_admin, company_name, position, graduation_date, mentor);
            if (!new_alumni.getEmail().equals(cur_alumni.getEmail())) {
                if ((boolean)(Object)new_alumni.checkEmailIsRegistered()) {
                    notice = "That email address is already registered!";
                    request.setAttribute("notice", notice);
                    request.setAttribute("alumni",(Event)(Object) new_alumni);
                    RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin?action=edit_members");
                    dispatcher.forward(request, response);
                    return;
                }
            }
            if (!(Boolean)(Object)new_alumni.updateAlumni(person_id)) {
                session.setAttribute("alumni", new_alumni);
                notice = "There was an error saving your information.  Please try again.";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin?action=edit_members");
                dispatcher.forward(request, response);
                return;
            }
            notice = "Member information successfully updated.";
            request.setAttribute("notice", notice);
            RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin?action=edit_members");
            dispatcher.forward(request, response);
            return;
        } else if (action.equals("update_hospital")) {
            int person_id = Integer.parseInt((String)(Object)request.getParameter("person_id"));
            Person person = new Person();
            person =(Person)(Object) person.getPerson(person_id);
            Hospital cur_hospital =(Hospital)(Object) person.getHospital(person_id);
            String fname =(String)(Object) request.getParameter("fname");
            String lname =(String)(Object) request.getParameter("lname");
            String address1 =(String)(Object) request.getParameter("address1");
            String address2 =(String)(Object) request.getParameter("address2");
            String city =(String)(Object) request.getParameter("city");
            String state =(String)(Object) request.getParameter("state");
            String zip =(String)(Object) request.getParameter("zip");
            String email =(String)(Object) request.getParameter("email");
            String name =(String)(Object) request.getParameter("name");
            String phone =(String)(Object) request.getParameter("phone");
            String url =(String)(Object) request.getParameter("url");
            String password = "";
            if (cur_hospital.getPassword() != null) {
                if (request.getParameter("password") != null && !request.getParameter("password").equals("")) {
                    password =(String)(Object) request.getParameter("password");
                    MessageDigest md = null;
                    try {
                        md = MessageDigest.getInstance("MD5");
                        md.update(password.getBytes("UTF-8"));
                    } catch (Exception x) {
                        notice = "Could not encrypt your password.  Please try again.";
                        request.setAttribute("notice", notice);
                        RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin?action=edit_members");
                        dispatcher.forward(request, response);
                        return;
                    }
                    password =(String)(Object) (new BASE64Encoder()).encode(md.digest());
                } else {
                    password =(String)(Object) cur_hospital.getPassword();
                }
            }
            int is_admin = 0;
            if (request.getParameter("is_admin") != null) {
                is_admin = 1;
            }
            Hospital new_hospital = new Hospital(fname, lname, address1, address2, city, state, zip, email, password, is_admin, name, phone, url);
            if (!new_hospital.getEmail().equals(cur_hospital.getEmail())) {
                if ((boolean)(Object)new_hospital.checkEmailIsRegistered()) {
                    notice = "That email address is already registered!";
                    request.setAttribute("notice", notice);
                    request.setAttribute("hospital",(Event)(Object) new_hospital);
                    RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin?action=edit_members");
                    dispatcher.forward(request, response);
                    return;
                }
            }
            if (!(Boolean)(Object)new_hospital.updateHospital(person_id)) {
                session.setAttribute("hospital",(Alumni)(Object) new_hospital);
                notice = "There was an error saving your information.  Please try again.";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin?action=edit_members");
                dispatcher.forward(request, response);
                return;
            }
            notice = "Information successfully updated.";
            request.setAttribute("notice", notice);
            RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin?action=edit_members");
            dispatcher.forward(request, response);
            return;
        } else if (action.equals("update_student")) {
            int person_id = Integer.parseInt((String)(Object)request.getParameter("person_id"));
            Person person = new Person();
            person =(Person)(Object) person.getPerson(person_id);
            Student cur_student =(Student)(Object) person.getStudent();
            String fname =(String)(Object) request.getParameter("fname");
            String lname =(String)(Object) request.getParameter("lname");
            String address1 =(String)(Object) request.getParameter("address1");
            String address2 =(String)(Object) request.getParameter("address2");
            String city =(String)(Object) request.getParameter("city");
            String state =(String)(Object) request.getParameter("state");
            String zip =(String)(Object) request.getParameter("zip");
            String email =(String)(Object) request.getParameter("email");
            String start_date = request.getParameter("start_year") + "-" + request.getParameter("start_month") + "-01";
            String graduation_date = "";
            if (!request.getParameter("grad_year").equals("") && !request.getParameter("grad_month").equals("")) {
                graduation_date = request.getParameter("grad_year") + "-" + request.getParameter("grad_month") + "-01";
            }
            String password = "";
            if (request.getParameter("password") != null && !request.getParameter("password").equals("")) {
                password =(String)(Object) request.getParameter("password");
                MessageDigest md = null;
                try {
                    md = MessageDigest.getInstance("MD5");
                    md.update(password.getBytes("UTF-8"));
                } catch (Exception x) {
                    notice = "Could not encrypt your password.  Please try again.";
                    request.setAttribute("notice", notice);
                    RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin?action=edit_members");
                    dispatcher.forward(request, response);
                    return;
                }
                password =(String)(Object) (new BASE64Encoder()).encode(md.digest());
            } else {
                password =(String)(Object) cur_student.getPassword();
            }
            int is_admin = 0;
            if (request.getParameter("is_admin") != null) {
                is_admin = 1;
            }
            Student new_student = new Student(fname, lname, address1, address2, city, state, zip, email, password, is_admin, start_date, graduation_date);
            if (!new_student.getEmail().equals(cur_student.getEmail())) {
                if ((boolean)(Object)new_student.checkEmailIsRegistered()) {
                    notice = "That email address is already registered!";
                    request.setAttribute("notice", notice);
                    request.setAttribute("student",(Event)(Object) new_student);
                    RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin?action=edit_members");
                    dispatcher.forward(request, response);
                    return;
                }
            }
            if (!(Boolean)(Object)new_student.updateStudent(person_id)) {
                notice = "There was an error saving your information.  Please try again.";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin?action=edit_members");
                dispatcher.forward(request, response);
                return;
            }
            notice = "Information successfully updated.";
            request.setAttribute("notice", notice);
            RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin?action=edit_members");
            dispatcher.forward(request, response);
            return;
        } else if (action.equals("delete_person")) {
            int id = Integer.parseInt((String)(Object)request.getParameter("id"));
            String member_type =(String)(Object) request.getParameter("member_type");
            Person person = new Person();
            person =(Person)(Object) person.getPerson(id);
            if ((boolean)(Object)person.deletePerson(member_type)) {
                notice =(char)(Object) person.getFname() + ' ' + (int)(Object)person.getLname() + " successfully deleted from database.";
                request.setAttribute("notice", notice);
                person = null;
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin?action=edit_members&member_type=all");
                dispatcher.forward(request, response);
                return;
            }
        } else if (action.equals("manage_pages")) {
            String sql = "SELECT * FROM pages WHERE parent_id=0 OR parent_id IN (SELECT id FROM pages WHERE title LIKE 'root')";
            if (request.getParameter("id") != null) {
                int id = Integer.parseInt((String)(Object)request.getParameter("id"));
                sql = "SELECT * FROM pages WHERE parent_id=" + id;
            }
            try {
                dbStatement = connection.createStatement();
                dbResultSet = dbStatement.executeQuery(sql);
                request.setAttribute("resultset", dbResultSet);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/edit_pages.jsp");
                dispatcher.forward(request, response);
                return;
            } catch (ClassCastException e) {
                notice = "Error retrieving content pages from the database.";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/index.jsp");
                dispatcher.forward(request, response);
                return;
            }
        } else if (action.equals("add_page")) {
            String sql = "SELECT id, title FROM pages WHERE parent_id=0 OR parent_id IN (SELECT id FROM pages WHERE title LIKE 'root')";
            try {
                dbStatement = connection.createStatement();
                dbResultSet = dbStatement.executeQuery(sql);
                request.setAttribute("resultset", dbResultSet);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/add_page.jsp");
                dispatcher.forward(request, response);
                return;
            } catch (IllegalArgumentException e) {
                notice = "Error retrieving content pages from the database.";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/index.jsp");
                dispatcher.forward(request, response);
                return;
            }
        } else if (action.equals("save_page")) {
            String title =(String)(Object) request.getParameter("title");
            String content =(String)(Object) request.getParameter("content");
            Page page = null;
            if (request.getParameter("parent_id") != null) {
                int parent_id = Integer.parseInt((String)(Object)request.getParameter("parent_id"));
                page = new Page(title, content, parent_id);
            } else {
                page = new Page(title, content, 0);
            }
            if ((boolean)(Object)page.savePage()) {
                notice = "Content page saved!";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/index.jsp");
                dispatcher.forward(request, response);
                return;
            } else {
                notice = "There was an error saving the page.";
                request.setAttribute("page",(Event)(Object) page);
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/add_page.jsp");
                dispatcher.forward(request, response);
                return;
            }
        } else if (action.equals("edit_page")) {
            String sql = "SELECT * FROM pages WHERE parent_id=0";
            int id = Integer.parseInt((String)(Object)request.getParameter("id"));
            Page page = new Page();
            page =(Page)(Object) page.getPage(id);
            try {
                dbStatement = connection.createStatement();
                dbResultSet = dbStatement.executeQuery(sql);
                request.setAttribute("resultset", dbResultSet);
            } catch (IllegalMonitorStateException e) {
                notice = "Error retrieving content pages from the database.";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/index.jsp");
                dispatcher.forward(request, response);
                return;
            }
            if (page != null) {
                request.setAttribute("page",(Event)(Object) page);
                request.setAttribute("id", Integer.toString(id));
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/add_page.jsp");
                dispatcher.forward(request, response);
                return;
            } else {
                notice = "Error retrieving content page from the database.";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/index.jsp");
                dispatcher.forward(request, response);
                return;
            }
        } else if (action.equals("update_page")) {
            int id = Integer.parseInt((String)(Object)request.getParameter("id"));
            String title =(String)(Object) request.getParameter("title");
            String content =(String)(Object) request.getParameter("content");
            int parent_id = 0;
            if (request.getParameter("parent_id") != null) {
                parent_id = Integer.parseInt((String)(Object)request.getParameter("parent_id"));
            }
            Page page = new Page(title, content, parent_id);
            if ((boolean)(Object)page.updatePage(id)) {
                notice = "Content page was updated successfully.";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/index.jsp");
                dispatcher.forward(request, response);
                return;
            } else {
                notice = "Error updating the content page.";
                request.setAttribute("notice", notice);
                request.setAttribute("page",(Event)(Object) page);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/add_page.jsp");
                dispatcher.forward(request, response);
                return;
            }
        } else if (action.equals("delete_page")) {
            int id = Integer.parseInt((String)(Object)request.getParameter("id"));
            Page page = new Page();
            if ((boolean)(Object)page.deletePage(id)) {
                notice = "Content page (and sub pages) deleted successfully.";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/index.jsp");
                dispatcher.forward(request, response);
                return;
            } else {
                notice = "Error deleting the content page(s).";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/index.jsp");
                dispatcher.forward(request, response);
                return;
            }
        } else if (action.equals("list_residencies")) {
            Residency residency = new Residency();
            dbResultSet = residency.getResidencies();
            request.setAttribute("result", dbResultSet);
            RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/list_residencies.jsp");
            dispatcher.forward(request, response);
            return;
        } else if (action.equals("delete_residency")) {
            int job_id = Integer.parseInt((String)(Object)request.getParameter("id"));
            Residency residency = new Residency();
            if ((boolean)(Object)residency.deleteResidency(job_id)) {
                notice = "Residency has been successfully deleted.";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin?action=list_residencies");
                dispatcher.forward(request, response);
                return;
            } else {
                notice = "Error deleting the residency.";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/index.jsp");
                dispatcher.forward(request, response);
                return;
            }
        } else if (action.equals("edit_residency")) {
            int job_id = Integer.parseInt((String)(Object)request.getParameter("id"));
            Residency residency = new Residency();
            dbResultSet = residency.getResidency(job_id);
            if (dbResultSet != null) {
                try {
                    int hId =(int)(Object) dbResultSet.getInt("hospital_id");
                    String hName =(String)(Object) residency.getHospitalName(hId);
                    request.setAttribute("hName", hName);
                    dbResultSet.beforeFirst();
                } catch (IllegalStateException e) {
                    error = "There was an error retreiving the residency.";
                    session.setAttribute("error",(Alumni)(Object) error);
                    RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/error.jsp");
                    dispatcher.forward(request, response);
                    return;
                }
                request.setAttribute("result", dbResultSet);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/edit_residency.jsp");
                dispatcher.forward(request, response);
                return;
            } else {
                notice = "There was an error in locating the residency you selected.";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/index.jsp");
                dispatcher.forward(request, response);
                return;
            }
        } else if (action.equals("new_residency")) {
            Residency residency = new Residency();
            dbResultSet = residency.getHospitals();
            request.setAttribute("result", dbResultSet);
            RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/add_residency.jsp");
            dispatcher.forward(request, response);
            return;
        } else if (action.equals("add_residency")) {
            Person person = (Person)(Person)(Object) session.getAttribute("person");
            if ((boolean)(Object)person.isAdmin()) {
                String hName =(String)(Object) request.getParameter("hName");
                String title =(String)(Object) request.getParameter("title");
                String description =(String)(Object) request.getParameter("description");
                String start_month =(String)(Object) request.getParameter("startDateMonth");
                String start_day =(String)(Object) request.getParameter("startDateDay");
                String start_year =(String)(Object) request.getParameter("startDateYear");
                String start_date = start_year + start_month + start_day;
                String end_month =(String)(Object) request.getParameter("endDateMonth");
                String end_day =(String)(Object) request.getParameter("endDateDay");
                String end_year =(String)(Object) request.getParameter("endDateYear");
                String end_date = end_year + end_month + end_day;
                String deadline_month =(String)(Object) request.getParameter("deadlineDateMonth");
                String deadline_day =(String)(Object) request.getParameter("deadlineDateDay");
                String deadline_year =(String)(Object) request.getParameter("deadlineDateYear");
                String deadline_date = deadline_year + deadline_month + deadline_day;
                int hId = Integer.parseInt((String)(Object)request.getParameter("hId"));
                Residency residency = new Residency(title, start_date, end_date, deadline_date, description, hId);
                if ((boolean)(Object)residency.saveResidency()) {
                    notice = "Residency has been successfully saved.";
                    request.setAttribute("notice", notice);
                    RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin?action=list_residencies");
                    dispatcher.forward(request, response);
                    return;
                } else {
                    notice = "Error saving the residency.";
                    request.setAttribute("notice", notice);
                    RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/index.jsp");
                    dispatcher.forward(request, response);
                    return;
                }
            }
            RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/index.jsp");
            dispatcher.forward(request, response);
            return;
        } else if (action.equals("update_residency")) {
            Person person = (Person)(Person)(Object) session.getAttribute("person");
            int job_id = Integer.parseInt((String)(Object)request.getParameter("job_id"));
            if ((boolean)(Object)person.isAdmin()) {
                String hName =(String)(Object) request.getParameter("hName");
                String title =(String)(Object) request.getParameter("title");
                String description =(String)(Object) request.getParameter("description");
                String start_month =(String)(Object) request.getParameter("startDateMonth");
                String start_day =(String)(Object) request.getParameter("startDateDay");
                String start_year =(String)(Object) request.getParameter("startDateYear");
                String start_date = start_year + start_month + start_day;
                String end_month =(String)(Object) request.getParameter("endDateMonth");
                String end_day =(String)(Object) request.getParameter("endDateDay");
                String end_year =(String)(Object) request.getParameter("endDateYear");
                String end_date = end_year + end_month + end_day;
                String deadline_month =(String)(Object) request.getParameter("deadlineDateMonth");
                String deadline_day =(String)(Object) request.getParameter("deadlineDateDay");
                String deadline_year =(String)(Object) request.getParameter("deadlineDateYear");
                String deadline_date = deadline_year + deadline_month + deadline_day;
                int hId = Integer.parseInt((String)(Object)request.getParameter("hId"));
                Residency residency = new Residency(job_id, title, start_date, end_date, deadline_date, description);
                if ((boolean)(Object)residency.updateResidency(job_id)) {
                    notice = "Residency has been successfully saved.";
                    request.setAttribute("notice", notice);
                    RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin?action=list_residencies");
                    dispatcher.forward(request, response);
                    return;
                } else {
                    notice = "Error saving the residency.";
                    request.setAttribute("notice", notice);
                    RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/index.jsp");
                    dispatcher.forward(request, response);
                    return;
                }
            }
            RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/index.jsp");
            dispatcher.forward(request, response);
            return;
        } else if (action.equals("add_hospital")) {
            Person person = (Person)(Person)(Object) session.getAttribute("person");
            if ((boolean)(Object)person.isAdmin()) {
                String name =(String)(Object) request.getParameter("name");
                String url =(String)(Object) request.getParameter("url");
                String address1 =(String)(Object) request.getParameter("address1");
                String address2 =(String)(Object) request.getParameter("address2");
                String city =(String)(Object) request.getParameter("city");
                String state =(String)(Object) request.getParameter("state");
                String zip =(String)(Object) request.getParameter("zip");
                String phone =(String)(Object) request.getParameter("phone");
                String lname =(String)(Object) request.getParameter("name");
                Hospital hospital = new Hospital(lname, address1, address2, city, state, zip, name, phone, url);
                if (!(Boolean)(Object)hospital.saveHospitalAdmin()) {
                    notice = "There was an error saving your information.  Please try again.";
                    request.setAttribute("notice", notice);
                    RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/index.jsp");
                    dispatcher.forward(request, response);
                    return;
                }
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin?action=new_residency");
                dispatcher.forward(request, response);
                return;
            } else {
                notice = "Unknown request.  Please try again.";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/index.jsp");
                dispatcher.forward(request, response);
                return;
            }
        } else if (action.equals("Get Admin News List")) {
            News news = new News();
            if (news.getNewsList() != null) {
                dbResultSet = news.getNewsList();
                request.setAttribute("result", dbResultSet);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/list.jsp");
                dispatcher.forward(request, response);
                return;
            } else {
                notice = "Could not get news list.";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("admin/index.jsp");
                dispatcher.forward(request, response);
                return;
            }
        } else if (action.equals("Get News List")) {
            News news = new News();
            if (news.getNewsList() != null) {
                dbResultSet = news.getNewsList();
                request.setAttribute("result", dbResultSet);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/news_list.jsp");
                dispatcher.forward(request, response);
                return;
            } else {
                notice = "Could not get news list.";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/gsu_fhce/index.jsp");
                dispatcher.forward(request, response);
                return;
            }
        } else if (action.equals("detail")) {
            String id =(String)(Object) request.getParameter("id");
            News news = new News();
            if (news.getNewsDetail(id) != null) {
                dbResultSet = news.getNewsDetail(id);
                request.setAttribute("result", dbResultSet);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/news_detail.jsp");
                dispatcher.forward(request, response);
                return;
            } else {
                notice = "Could not get news detail.";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/index.jsp");
                dispatcher.forward(request, response);
                return;
            }
        } else if (action.equals("delete")) {
            int id = 0;
            id = Integer.parseInt((String)(Object)request.getParameter("id"));
            News news = new News();
            if ((boolean)(Object)news.deleteNews(id)) {
                notice = "News successfully deleted.";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin?action=Get Admin News List");
                dispatcher.forward(request, response);
                return;
            } else {
                notice = "Error deleting the news.";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin?action=Get Admin News List");
                dispatcher.forward(request, response);
                return;
            }
        } else if (action.equals("edit")) {
            int id = Integer.parseInt((String)(Object)request.getParameter("id"));
            News news = new News();
            news =(News)(Object) news.getNews(id);
            if (news != null) {
                request.setAttribute("news",(Event)(Object) news);
                request.setAttribute("id", Integer.toString(id));
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/news_update.jsp");
                dispatcher.forward(request, response);
                return;
            } else {
                notice = "Error retrieving news from the database.";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/index.jsp");
                dispatcher.forward(request, response);
                return;
            }
        } else if (action.equals("Update News")) {
            String title =(String)(Object) request.getParameter("title");
            String date =(int)(Object) (request.getParameter("year")) +(String)(Object) (int)(Object)(request.getParameter("month")) + (int)(Object)(request.getParameter("day"));
            String content =(String)(Object) request.getParameter("content");
            int id = Integer.parseInt((String)(Object)request.getParameter("newsid"));
            News news = new News(title, date, content);
            if ((boolean)(Object)news.updateNews(id)) {
                notice = "News successfully updated.";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin?action=Get Admin News List");
                dispatcher.forward(request, response);
                return;
            } else {
                notice = "Could not update news.";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin?action=Get Admin News List");
                dispatcher.forward(request, response);
                return;
            }
        } else if (action.equals("Add News")) {
            String id = "";
            String title =(String)(Object) request.getParameter("title");
            String date = request.getParameter("year") + "-" + request.getParameter("month") + "-" + request.getParameter("day");
            String content =(String)(Object) request.getParameter("content");
            News news = new News(title, date, content);
            if ((boolean)(Object)news.addNews()) {
                notice = "News successfully added.";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin?action=Get Admin News List");
                dispatcher.forward(request, response);
                return;
            } else {
                notice = "Could not add news.";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("admin/index.jsp");
                dispatcher.forward(request, response);
                return;
            }
        } else if (action.equals("manage_mship")) {
            Mentor mentor = new Mentor();
            dbResultSet = mentor.getMentorships();
            if (dbResultSet != null) {
                request.setAttribute("result", dbResultSet);
            } else {
                notice = "There are no current mentorships.";
                request.setAttribute("notice", notice);
            }
            RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/list_mentorships.jsp");
            dispatcher.forward(request, response);
            return;
        } else if (action.equals("delete_mship")) {
            int mentorship_id = Integer.parseInt((String)(Object)request.getParameter("id"));
            Mentor mentor = new Mentor();
            if ((boolean)(Object)mentor.delMentorship(mentorship_id)) {
                notice = "Mentorship successfully deleted.";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin?action=manage_mship");
                dispatcher.forward(request, response);
                return;
            } else {
                notice = "Error deleting the mentorship.";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin?action=manage_mship");
                dispatcher.forward(request, response);
                return;
            }
        } else if (action.equals("new_mship")) {
            Mentor mentor = new Mentor();
            ResultSet alumnis = null;
            ResultSet students = null;
            alumnis =(ResultSet)(Object) mentor.getAlumnis();
            students =(ResultSet)(Object) mentor.getStudents();
            request.setAttribute("alumni_result",(Event)(Object) alumnis);
            request.setAttribute("student_result",(Event)(Object) students);
            RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/create_mship.jsp");
            dispatcher.forward(request, response);
            return;
        } else if (action.equals("create_mship")) {
            int student_id = Integer.parseInt((String)(Object)request.getParameter("student_id"));
            int alumni_id = Integer.parseInt((String)(Object)request.getParameter("alumni_id"));
            Mentor mentor = new Mentor();
            if ((boolean)(Object)mentor.addMentorship(student_id, alumni_id)) {
                notice = "Mentorship successfully created.";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin?action=manage_mship");
                dispatcher.forward(request, response);
                return;
            } else {
                notice = "There was an error creating the mentorship.";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/admin/create_mship.jsp");
                dispatcher.forward(request, response);
                return;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass beforeFirst(){ return null; }
	public MyHelperClass getConnection(String o0, String o1, String o2){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass getInt(String o0){ return null; }
	public MyHelperClass getRequestDispatcher(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class HttpServletRequest {

public MyHelperClass setAttribute(String o0, Event o1){ return null; }
	public MyHelperClass getSession(){ return null; }
	public MyHelperClass setAttribute(String o0, String o1){ return null; }
	public MyHelperClass getParameter(String o0){ return null; }
	public MyHelperClass setAttribute(String o0, MyHelperClass o1){ return null; }}

class HttpServletResponse {

}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class ServletConfig {

public MyHelperClass getServletContext(){ return null; }}

class ServletContext {

public MyHelperClass getInitParameter(String o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class HttpSession {

public MyHelperClass setMaxInactiveInterval(int o0){ return null; }
	public MyHelperClass setAttribute(String o0, Alumni o1){ return null; }
	public MyHelperClass getAttribute(String o0){ return null; }}

class RequestDispatcher {

public MyHelperClass forward(HttpServletRequest o0, HttpServletResponse o1){ return null; }}

class Event {

Event(int o0, int o1, int o2){}
	Event(String o0, String o1, String o2, String o3, String o4){}
	Event(){}
	Event(String o0, String o1, String o2, String o3, String o4, String o5, String o6){}
	public MyHelperClass deleteEvent(int o0){ return null; }
	public MyHelperClass updateEvent(int o0){ return null; }
	public MyHelperClass getYearNumber(){ return null; }
	public MyHelperClass saveEvent(){ return null; }
	public MyHelperClass getMonthName(){ return null; }
	public MyHelperClass getEvent(int o0){ return null; }
	public MyHelperClass getMonthNumber(){ return null; }}

class Person {

public MyHelperClass deletePerson(String o0){ return null; }
	public MyHelperClass getFname(){ return null; }
	public MyHelperClass getAlumni(){ return null; }
	public MyHelperClass getLname(){ return null; }
	public MyHelperClass getStudent(){ return null; }
	public MyHelperClass isAdmin(){ return null; }
	public MyHelperClass getPerson(int o0){ return null; }
	public MyHelperClass getHospital(int o0){ return null; }}

class Student {

Student(){}
	Student(String o0, String o1, String o2, String o3, String o4, String o5, String o6, String o7, String o8, int o9, String o10, String o11){}
	public MyHelperClass getEmail(){ return null; }
	public MyHelperClass updateStudent(int o0){ return null; }
	public MyHelperClass checkEmailIsRegistered(){ return null; }
	public MyHelperClass getPassword(){ return null; }}

class Alumni {

Alumni(){}
	Alumni(String o0, String o1, String o2, String o3, String o4, String o5, String o6, String o7, String o8, int o9, String o10, String o11, String o12, int o13){}
	public MyHelperClass getEmail(){ return null; }
	public MyHelperClass updateAlumni(int o0){ return null; }
	public MyHelperClass checkEmailIsRegistered(){ return null; }
	public MyHelperClass getPassword(){ return null; }}

class Hospital {

Hospital(){}
	Hospital(String o0, String o1, String o2, String o3, String o4, String o5, String o6, String o7, String o8){}
	Hospital(String o0, String o1, String o2, String o3, String o4, String o5, String o6, String o7, String o8, int o9, String o10, String o11, String o12){}
	public MyHelperClass getEmail(){ return null; }
	public MyHelperClass saveHospitalAdmin(){ return null; }
	public MyHelperClass checkEmailIsRegistered(){ return null; }
	public MyHelperClass updateHospital(int o0){ return null; }
	public MyHelperClass getPassword(){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}

class Page {

Page(String o0, String o1, int o2){}
	Page(){}
	public MyHelperClass savePage(){ return null; }
	public MyHelperClass deletePage(int o0){ return null; }
	public MyHelperClass getPage(int o0){ return null; }
	public MyHelperClass updatePage(int o0){ return null; }}

class Residency {

Residency(){}
	Residency(String o0, String o1, String o2, String o3, String o4, int o5){}
	Residency(int o0, String o1, String o2, String o3, String o4, String o5){}
	public MyHelperClass getHospitals(){ return null; }
	public MyHelperClass getResidency(int o0){ return null; }
	public MyHelperClass deleteResidency(int o0){ return null; }
	public MyHelperClass saveResidency(){ return null; }
	public MyHelperClass updateResidency(int o0){ return null; }
	public MyHelperClass getResidencies(){ return null; }
	public MyHelperClass getHospitalName(int o0){ return null; }}

class News {

News(String o0, String o1, String o2){}
	News(){}
	public MyHelperClass getNewsDetail(String o0){ return null; }
	public MyHelperClass addNews(){ return null; }
	public MyHelperClass getNews(int o0){ return null; }
	public MyHelperClass updateNews(int o0){ return null; }
	public MyHelperClass getNewsList(){ return null; }
	public MyHelperClass deleteNews(int o0){ return null; }}

class Mentor {

public MyHelperClass addMentorship(int o0, int o1){ return null; }
	public MyHelperClass delMentorship(int o0){ return null; }
	public MyHelperClass getStudents(){ return null; }
	public MyHelperClass getMentorships(){ return null; }
	public MyHelperClass getAlumnis(){ return null; }}

class ResultSet {

}
