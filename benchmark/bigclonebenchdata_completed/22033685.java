


class c22033685 {
public MyHelperClass MessageDigest;
	public MyHelperClass getServletContext(){ return null; }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session =(HttpSession)(Object) request.getSession();
        session.setMaxInactiveInterval(300);
        String member_type;
        String save_type;
        String action;
        String notice;
        if ((String)(String)(Object) session.getAttribute("member_type") != null) {
            member_type = (String)(String)(Object) session.getAttribute("member_type");
        } else {
            notice = "You must login first!";
            request.setAttribute("notice", notice);
            RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/index.jsp");
            dispatcher.forward(request, response);
            return;
        }
        if (request.getParameter("action") != null) {
            action = (String)(String)(Object) request.getParameter("action");
        } else {
            if (member_type.equals("student")) {
                if (session.getAttribute("person") != null) {
                    Person person = (Person)(Person)(Object) session.getAttribute("person");
                    Student student =(Student)(Object) person.getStudent();
                    request.setAttribute("student", student);
                    RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/member/student.jsp");
                    dispatcher.forward(request, response);
                    return;
                } else {
                    notice = "You are not logged in!";
                    request.setAttribute("notice", notice);
                    RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/index.jsp");
                    dispatcher.forward(request, response);
                    return;
                }
            } else if (member_type.equals("alumni")) {
                if (session.getAttribute("person") != null) {
                    Person person = (Person)(Person)(Object) session.getAttribute("person");
                    Alumni alumni =(Alumni)(Object) person.getAlumni();
                    request.setAttribute("alumni", alumni);
                    RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/member/alumni.jsp");
                    dispatcher.forward(request, response);
                    return;
                } else {
                    notice = "You are not logged in!";
                    request.setAttribute("notice", notice);
                    RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/index.jsp");
                    dispatcher.forward(request, response);
                    return;
                }
            } else if (member_type.equals("hospital")) {
                if (session.getAttribute("person") != null) {
                    Person person = (Person)(Person)(Object) session.getAttribute("person");
                    Hospital hospital =(Hospital)(Object) person.getHospital();
                    request.setAttribute("hospital", hospital);
                    RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/member/hospital.jsp");
                    dispatcher.forward(request, response);
                    return;
                } else {
                    notice = "You are not logged in!";
                    request.setAttribute("notice", notice);
                    RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/index.jsp");
                    dispatcher.forward(request, response);
                    return;
                }
            } else {
                notice = "I don't understand your request.  Please try again.";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/index.jsp");
                dispatcher.forward(request, response);
                return;
            }
        }
        if (action.equals("save_student")) {
            Person person = (Person)(Person)(Object) session.getAttribute("person");
            Student cur_student =(Student)(Object) person.getStudent();
            int person_id = Integer.parseInt((String)(String)(Object) session.getAttribute("person_id"));
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
                    md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
                    md.update(password.getBytes("UTF-8"));
                } catch (Exception x) {
                    notice = "Could not encrypt your password.  Please try again.";
                    request.setAttribute("notice", notice);
                    RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/member/student.jsp");
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
                    request.setAttribute("student", new_student);
                    RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/member/student.jsp");
                    dispatcher.forward(request, response);
                    return;
                }
            }
            if (!(Boolean)(Object)new_student.updateStudent(person_id)) {
                notice = "There was an error saving your information.  Please try again.";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/member/student.jsp");
                dispatcher.forward(request, response);
                return;
            }
            Person updated_person =(Person)(Object) new_student.getPerson(person_id);
            session.setAttribute("person", updated_person);
            notice = "Information successfully updated.";
            request.setAttribute("notice", notice);
            RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/index.jsp");
            dispatcher.forward(request, response);
            return;
        } else if (action.equals("save_alumni")) {
            Person person = (Person)(Person)(Object) session.getAttribute("person");
            Alumni cur_alumni =(Alumni)(Object) person.getAlumni();
            int person_id = Integer.parseInt((String)(String)(Object) session.getAttribute("person_id"));
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
                    md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
                    md.update(password.getBytes("UTF-8"));
                } catch (Exception x) {
                    notice = "Could not encrypt your password.  Please try again.";
                    request.setAttribute("notice", notice);
                    RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/member/alumni.jsp");
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
                    request.setAttribute("alumni", new_alumni);
                    RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/member/alumni.jsp");
                    dispatcher.forward(request, response);
                    return;
                }
            }
            if (!(Boolean)(Object)new_alumni.updateAlumni(person_id)) {
                session.setAttribute("alumni",(Person)(Object) new_alumni);
                notice = "There was an error saving your information.  Please try again.";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/member/alumni.jsp");
                dispatcher.forward(request, response);
                return;
            }
            Person updated_person =(Person)(Object) new_alumni.getPerson(person_id);
            session.setAttribute("person", updated_person);
            notice = "Information successfully updated.";
            request.setAttribute("notice", notice);
            RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/index.jsp");
            dispatcher.forward(request, response);
            return;
        } else if (action.equals("save_hospital")) {
            Person person = (Person)(Person)(Object) session.getAttribute("person");
            Hospital cur_hospital =(Hospital)(Object) person.getHospital();
            int person_id = Integer.parseInt((String)(String)(Object) session.getAttribute("person_id"));
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
            if (request.getParameter("password") != null && !request.getParameter("password").equals("")) {
                password =(String)(Object) request.getParameter("password");
                MessageDigest md = null;
                try {
                    md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
                    md.update(password.getBytes("UTF-8"));
                } catch (Exception x) {
                    notice = "Could not encrypt your password.  Please try again.";
                    request.setAttribute("notice", notice);
                    RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/member/hospital.jsp");
                    dispatcher.forward(request, response);
                    return;
                }
                password =(String)(Object) (new BASE64Encoder()).encode(md.digest());
            } else {
                password =(String)(Object) cur_hospital.getPassword();
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
                    request.setAttribute("hospital", new_hospital);
                    RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/member/hospital.jsp");
                    dispatcher.forward(request, response);
                    return;
                }
            }
            if (!(Boolean)(Object)new_hospital.updateHospital(person_id)) {
                session.setAttribute("hospital",(Person)(Object) new_hospital);
                notice = "There was an error saving your information.  Please try again.";
                request.setAttribute("notice", notice);
                RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/member/hospital.jsp");
                dispatcher.forward(request, response);
                return;
            }
            Person updated_person =(Person)(Object) new_hospital.getPerson(person_id);
            session.setAttribute("person", updated_person);
            notice = "Information successfully updated.";
            request.setAttribute("notice", notice);
            RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/index.jsp");
            dispatcher.forward(request, response);
            return;
        } else {
            notice = "There was an error with your request.  Please try again.";
            request.setAttribute("notice", notice);
            RequestDispatcher dispatcher =(RequestDispatcher)(Object) getServletContext().getRequestDispatcher("/member/hospital.jsp");
            dispatcher.forward(request, response);
            return;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getRequestDispatcher(String o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class HttpServletRequest {

public MyHelperClass setAttribute(String o0, Alumni o1){ return null; }
	public MyHelperClass setAttribute(String o0, Hospital o1){ return null; }
	public MyHelperClass setAttribute(String o0, String o1){ return null; }
	public MyHelperClass getParameter(String o0){ return null; }
	public MyHelperClass setAttribute(String o0, Student o1){ return null; }
	public MyHelperClass getSession(){ return null; }}

class HttpServletResponse {

}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpSession {

public MyHelperClass setAttribute(String o0, Person o1){ return null; }
	public MyHelperClass getAttribute(String o0){ return null; }
	public MyHelperClass setMaxInactiveInterval(int o0){ return null; }}

class RequestDispatcher {

public MyHelperClass forward(HttpServletRequest o0, HttpServletResponse o1){ return null; }}

class Person {

public MyHelperClass getHospital(){ return null; }
	public MyHelperClass getStudent(){ return null; }
	public MyHelperClass getAlumni(){ return null; }}

class Student {

Student(){}
	Student(String o0, String o1, String o2, String o3, String o4, String o5, String o6, String o7, String o8, int o9, String o10, String o11){}
	public MyHelperClass checkEmailIsRegistered(){ return null; }
	public MyHelperClass getPassword(){ return null; }
	public MyHelperClass getPerson(int o0){ return null; }
	public MyHelperClass updateStudent(int o0){ return null; }
	public MyHelperClass getEmail(){ return null; }}

class Alumni {

Alumni(){}
	Alumni(String o0, String o1, String o2, String o3, String o4, String o5, String o6, String o7, String o8, int o9, String o10, String o11, String o12, int o13){}
	public MyHelperClass checkEmailIsRegistered(){ return null; }
	public MyHelperClass getPassword(){ return null; }
	public MyHelperClass getEmail(){ return null; }
	public MyHelperClass getPerson(int o0){ return null; }
	public MyHelperClass updateAlumni(int o0){ return null; }}

class Hospital {

Hospital(){}
	Hospital(String o0, String o1, String o2, String o3, String o4, String o5, String o6, String o7, String o8, int o9, String o10, String o11, String o12){}
	public MyHelperClass checkEmailIsRegistered(){ return null; }
	public MyHelperClass getPassword(){ return null; }
	public MyHelperClass updateHospital(int o0){ return null; }
	public MyHelperClass getEmail(){ return null; }
	public MyHelperClass getPerson(int o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(MyHelperClass o0){ return null; }}
