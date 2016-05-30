package com.haider.com.listviewandroid;

import android.net.Uri;

import java.util.ArrayList;

/**
 * Created by haiderali on 30/03/2016.
 */
public class Database {

    private static ArrayList<User> arrayOfUsers = new ArrayList<User>();

    public static void initUsers() {
       // arrayOfUsers.add(new User("Ali", "Karachi", "", "", "","", ""));
        //arrayOfUsers.add(new User("Khalid", "Pindi", "", "", "","", ""));
        //arrayOfUsers.add(new User("Rashid", "RawalPindi", "", "", "","", ""));
    }

    public static void addUsers(User user) {
        arrayOfUsers.add(user);
    }
    public static ArrayList<User> getAllUsers() {
        return arrayOfUsers;
    }

}
