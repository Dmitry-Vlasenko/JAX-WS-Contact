package com.dvlasenko.server.repository;


import com.dvlasenko.server.entity.Contact;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {

    public List<Contact> fetchData() {
        List<Contact> list = new ArrayList<>();
        list.add(new Contact(1, "Tom", "Smith", "123-456-7890"));
        list.add(new Contact(2, "Alice", "Johnson", "234-567-8901"));
        list.add(new Contact(3, "Bob", "Williams", "345-678-9012"));
        return list;
    }
}
