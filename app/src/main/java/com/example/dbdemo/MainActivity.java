package com.example.dbdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.dbdemo.data.MyHandler;
import com.example.dbdemo.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyHandler db = new MyHandler(MainActivity.this);
        //Creating a contact object to the db
//        Contact Gaurav = new Contact();
//        Gaurav.setPhoneNumber("9508846456");
//        Gaurav.setName("gaurav");
//
//        //Adding a contact to the db
//        db.addContact(Gaurav);
//        //Creating a contact object to the db
//        Contact saurav = new Contact();
//        saurav.setPhoneNumber("9508346456");
//        saurav.setName("saurav");
//        //Adding a contact
//        db.addContact(saurav);
//        //Creating a contact object to the db
//        Contact kaurav = new Contact();
//        kaurav.setPhoneNumber("9508346956");
//        kaurav.setName("Kaurav");
//        //Adding a contact
//        db.addContact(kaurav);
//
//
//        kaurav.setId(46);
//        kaurav.setName("Changed Kaurav");
//        kaurav.setPhoneNumber("1111111");
//        //db.updateContact(kaurav);
//        int affectedRows = db.updateContact(kaurav);
//        Log.d("dbGaurav", "No of affected rows are: " + affectedRows);
//        Log.d("dbGaurav", "Id for saurav and kaurav are successfully added to the db");
//
//    db.deleteContactById(1);
//      db.deleteContactById(12);
//      db.deleteContactById(5);
        ArrayList<String>contacts =new ArrayList<>();
        listView =findViewById(R.id.listview);



//        //Get all contacts

        List<Contact> allContacts = db.getAllContacts();
        for (Contact contact : allContacts) {

            Log.d("dbGaurav", "\nid:" + contact.getId() + "\n" +
                    "Name:" + contact.getName() + "\n" +
                    "Phone Number:" + contact.getName() + "\n"
            );
contacts.add(contact.getName()+"("+contact.getPhoneNumber()+")");
        }
        ArrayAdapter<String>arrayAdapter =new ArrayAdapter<>(this
        ,android.R.layout.simple_list_item_1,contacts);
        listView.setAdapter(arrayAdapter);
        Log.d("dbGaurav","Bro you have"+db.getCount()+"Contacts in your Database");



    }}