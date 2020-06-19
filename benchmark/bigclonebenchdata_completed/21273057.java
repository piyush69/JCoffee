


class c21273057 {

    public RobotList sort_incr_Percentage(RobotList list, String field) {
        int length =(int)(Object) list.size();
        Index_value[] distri = new Index_value[length];
        for (int i = 0; i < length; i++) {
            distri[i] = new Index_value(i, list.get(i).percent);
        }
        boolean permut;
        do {
            permut = false;
            for (int i = 0; i < length - 1; i++) {
                if ((int)(Object)distri[i].value > (int)(Object)distri[i + 1].value) {
                    Index_value a = distri[i];
                    distri[i] = distri[i + 1];
                    distri[i + 1] = a;
                    permut = true;
                }
            }
        } while (permut);
        RobotList sol = new RobotList(Percentage.class);
        for (int i = 0; i < length; i++) {
            sol.addLast(new Percentage(distri[i].value));
        }
        return sol;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass percent;
}

class RobotList {

RobotList(){}
	RobotList(Class<Percentage> o0){}
	public MyHelperClass size(){ return null; }
	public MyHelperClass addLast(Percentage o0){ return null; }
	public MyHelperClass get(int o0){ return null; }}

class Percentage {

Percentage(MyHelperClass o0){}
	Percentage(){}}

class Index_value {
public MyHelperClass value;
Index_value(){}
	Index_value(int o0, MyHelperClass o1){}}
