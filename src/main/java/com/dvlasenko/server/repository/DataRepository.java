package com.dvlasenko.server.repository;


import com.dvlasenko.server.entity.User;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {

    public List<User> fetchData() {
        List<User> list = new ArrayList<>();
        list.add(new User(1, "Tom", "Smith", "123-456-7890"));
        list.add(new User(2, "Alice", "Johnson", "234-567-8901"));
        list.add(new User(3, "Bob", "Williams", "345-678-9012"));
        return list;
    }
}
