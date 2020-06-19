


class c21273060 {
public MyHelperClass distance(Location o0, MyHelperClass o1){ return null; }
public MyHelperClass say(String o0){ return null; }
	public MyHelperClass getLocation(){ return null; }

    public RobotList sort_decr_Location(RobotList list, String field) {
        int length =(int)(Object) list.size();
        Index_value[] enemy_dist = new Index_value[length];
        if (field.equals("") || field.equals("location")) {
            Location cur_loc =(Location)(Object) this.getLocation();
            for (int i = 0; i < length; i++) {
                enemy_dist[i] = new Index_value(i, distance(cur_loc, list.get(i)));
            }
        } else if (field.equals("x")) {
            for (int i = 0; i < length; i++) {
                enemy_dist[i] = new Index_value(i, list.get(i).x);
            }
        } else if (field.equals("y")) {
            for (int i = 0; i < length; i++) {
                enemy_dist[i] = new Index_value(i, list.get(i).y);
            }
        } else {
            say("impossible to sort list - nothing modified");
            return list;
        }
        boolean permut;
        do {
            permut = false;
            for (int i = 0; i < length - 1; i++) {
                if ((int)(Object)enemy_dist[i].value < (int)(Object)enemy_dist[i + 1].value) {
                    Index_value a = enemy_dist[i];
                    enemy_dist[i] = enemy_dist[i + 1];
                    enemy_dist[i + 1] = a;
                    permut = true;
                }
            }
        } while (permut);
        RobotList new_location_list = new RobotList(Location.class);
        for (int i = 0; i < length; i++) {
            new_location_list.addLast(list.get(enemy_dist[i].index));
        }
        return new_location_list;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass y;
	public MyHelperClass x;
}

class RobotList {

RobotList(){}
	RobotList(Class<Location> o0){}
	public MyHelperClass size(){ return null; }
	public MyHelperClass get(MyHelperClass o0){ return null; }
	public MyHelperClass addLast(MyHelperClass o0){ return null; }
	public MyHelperClass get(int o0){ return null; }}

class Location {

}

class Index_value {
public MyHelperClass index;
	public MyHelperClass value;
Index_value(){}
	Index_value(int o0, MyHelperClass o1){}}
