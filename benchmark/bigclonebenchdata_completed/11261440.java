


class c11261440 {

    private static String func(String sf) {
        int total = 0, temp;
        String fnctn[] = { "sin", "cos", "tan", "log", "ln", "sqrt", "!" }, temp2 = "";
        int pos[] = new int[7];
        for (int n = 0; n < fnctn.length; n++) {
            pos[n] = sf.lastIndexOf(fnctn[n]);
        }
        for (int m = 0; m < fnctn.length; m++) {
            total += pos[m];
        }
        if (total == -7) {
            return sf;
        }
        for (int i = pos.length; i > 1; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (pos[j] < pos[j + 1]) {
                    temp = pos[j];
                    pos[j] = pos[j + 1];
                    pos[j + 1] = temp;
                    temp2 = fnctn[j];
                    fnctn[j] = fnctn[j + 1];
                    fnctn[j + 1] = temp2;
                }
            }
        }
        if (fnctn[0].equals("sin")) {
            if ((pos[0] == 0 || sf.charAt(pos[0] - 1) != 'a')) {
                MyHelperClass Functions = new MyHelperClass();
                return func((String)(Object)Functions.sine(sf, pos[0], false));
            } else {
                MyHelperClass Functions = new MyHelperClass();
                return func((String)(Object)Functions.asin(sf, pos[0], false));
            }
        } else if (fnctn[0].equals("cos")) {
            if ((pos[0] == 0 || sf.charAt(pos[0] - 1) != 'a')) {
                MyHelperClass Functions = new MyHelperClass();
                return func((String)(Object)Functions.cosine(sf, pos[0], false));
            } else {
                MyHelperClass Functions = new MyHelperClass();
                return func((String)(Object)Functions.acos(sf, pos[0], false));
            }
        } else if (fnctn[0].equals("tan")) {
            if ((pos[0] == 0 || sf.charAt(pos[0] - 1) != 'a')) {
                MyHelperClass Functions = new MyHelperClass();
                return func((String)(Object)Functions.tangent(sf, pos[0], false));
            } else {
                MyHelperClass Functions = new MyHelperClass();
                return func((String)(Object)Functions.atan(sf, pos[0], false));
            }
        } else if (fnctn[0].equals("log")) {
            MyHelperClass Functions = new MyHelperClass();
            return func((String)(Object)Functions.logarithm(sf, pos[0]));
        } else if (fnctn[0].equals("ln")) {
            MyHelperClass Functions = new MyHelperClass();
            return func((String)(Object)Functions.lnat(sf, pos[0]));
        } else if (fnctn[0].equals("sqrt")) {
            MyHelperClass Functions = new MyHelperClass();
            return func((String)(Object)Functions.sqroot(sf, pos[0]));
        } else {
            MyHelperClass Functions = new MyHelperClass();
            return func((String)(Object)Functions.factorial(sf, pos[0]));
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass tangent(String o0, int o1, boolean o2){ return null; }
	public MyHelperClass logarithm(String o0, int o1){ return null; }
	public MyHelperClass asin(String o0, int o1, boolean o2){ return null; }
	public MyHelperClass sqroot(String o0, int o1){ return null; }
	public MyHelperClass factorial(String o0, int o1){ return null; }
	public MyHelperClass sine(String o0, int o1, boolean o2){ return null; }
	public MyHelperClass cosine(String o0, int o1, boolean o2){ return null; }
	public MyHelperClass atan(String o0, int o1, boolean o2){ return null; }
	public MyHelperClass acos(String o0, int o1, boolean o2){ return null; }
	public MyHelperClass lnat(String o0, int o1){ return null; }}
