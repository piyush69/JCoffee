import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11183087 {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws Throwable, ServletException, IOException {
        String senha = "";
        String email =(String)(Object) request.getParameter("EmailLogin");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update((byte[])(Object)request.getParameter("SenhaLogin").getBytes(), 0,(int)(Object) request.getParameter("SenhaLogin").length());
            senha = new BigInteger(1, messageDigest.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        MyHelperClass UsuarioBll = new MyHelperClass();
        Usuario usuario =(Usuario)(Object) UsuarioBll.getUsuarioByEmailAndSenha(email, senha);
        String redirect = request.getHeader("REFERER").replace("?msg=3", "").replace("&msg=3", "") + "?&msg=3";
        if ((int)(Object)request.getHeader("REFERER").indexOf("?") != -1) {
            redirect = request.getHeader("REFERER").replace("?msg=3", "").replace("&msg=3", "") + "&msg=3";
        }
        if (usuario.getNome() != null) {
            HttpSession session =(HttpSession)(Object) request.getSession();
            session.setAttribute("usuario", usuario);
            redirect = "index.jsp";
        }
        response.sendRedirect(redirect);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass length(){ return null; }
	public MyHelperClass indexOf(String o0){ return null; }
	public MyHelperClass getBytes(){ return null; }
	public MyHelperClass replace(String o0, String o1){ return null; }
	public MyHelperClass getUsuarioByEmailAndSenha(String o0, String o1){ return null; }}

class HttpServletRequest {

public MyHelperClass getSession(){ return null; }
	public MyHelperClass getParameter(String o0){ return null; }
	public MyHelperClass getHeader(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass sendRedirect(String o0){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class Usuario {

public MyHelperClass getNome(){ return null; }}

class HttpSession {

public MyHelperClass setAttribute(String o0, Usuario o1){ return null; }}
