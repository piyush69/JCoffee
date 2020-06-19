


class c21273055 {
public MyHelperClass distance(Location o0, MyHelperClass o1){ return null; }
public MyHelperClass say(String o0){ return null; }
	public MyHelperClass getLocation(){ return null; }

    public RobotList sort_incr_Resource(RobotList list, String field) {
        int length =(int)(Object) list.size();
        Index_value[] resource_dist = new Index_value[length];
        if (field.equals("") || field.equals("location")) {
            Location cur_loc =(Location)(Object) this.getLocation();
            for (int i = 0; i < length; i++) {
                resource_dist[i] = new Index_value(i, distance(cur_loc, list.get(i).location));
            }
        } else if (field.equals("energy")) {
            for (int i = 0; i < length; i++) {
                resource_dist[i] = new Index_value(i, list.get(i).energy);
            }
        } else if (field.equals("ammostash")) {
            for (int i = 0; i < length; i++) {
                resource_dist[i] = new Index_value(i, list.get(i).ammostash);
            }
        } else if (field.equals("speed")) {
            for (int i = 0; i < length; i++) {
                resource_dist[i] = new Index_value(i, list.get(i).speed);
            }
        } else if (field.equals("health")) {
            for (int i = 0; i < length; i++) {
                resource_dist[i] = new Index_value(i, list.get(i).health);
            }
        } else {
            say("impossible to sort list - nothing modified");
            return list;
        }
        boolean permut;
        do {
            permut = false;
            for (int i = 0; i < length - 1; i++) {
                if ((int)(Object)resource_dist[i].value > (int)(Object)resource_dist[i + 1].value) {
                    Index_value a = resource_dist[i];
                    resource_dist[i] = resource_dist[i + 1];
                    resource_dist[i + 1] = a;
                    permut = true;
                }
            }
        } while (permut);
        RobotList new_resource_list = new RobotList(Resource.class);
        for (int i = 0; i < length; i++) {
            new_resource_list.addLast(list.get(resource_dist[i].index));
        }
        return new_resource_list;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass location;
	public MyHelperClass speed;
	public MyHelperClass ammostash;
	public MyHelperClass health;
	public MyHelperClass energy;
}

class RobotList {

RobotList(Class<Resource> o0){}
	RobotList(){}
	public MyHelperClass size(){ return null; }
	public MyHelperClass get(MyHelperClass o0){ return null; }
	public MyHelperClass addLast(MyHelperClass o0){ return null; }
	public MyHelperClass get(int o0){ return null; }}

class Resource {

}

class Index_value {
public MyHelperClass index;
	public MyHelperClass value;
Index_value(){}
	Index_value(int o0, MyHelperClass o1){}}

class Location {

}
