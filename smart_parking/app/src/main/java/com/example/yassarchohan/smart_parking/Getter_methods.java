package com.example.yassarchohan.smart_parking;

/**
 * Created by Yassar chohan on 1/28/2017.
 */
public class Getter_methods {

    String Name;
    String message;
    String key;


    String slot;
    String starttime;
    String endtime;
    String total;
    String dateandtime;

    public Getter_methods() {
    }

    public String getSlot() {
        return slot;
    }

    public String getStarttime() {
        return starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public String getTotal() {
        return total;
    }

    public String getDateandtime() {
        return dateandtime;
    }

    public Getter_methods(String name, String slot, String starttime, String endtime, String key) {
        Name = name;
        this.slot = slot;
        this.starttime = starttime;
        this.endtime = endtime;
        this.key = key;
    }

    public Getter_methods(String name, String message, String key) {
        Name = name;
        this.message = message;
        this.key = key;
    }

    public String getName() {
        return Name;
    }

    public String getMessage() {
        return message;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
