package com.dvlasenko.server.service;

import com.dvlasenko.server.utils.Constants;
import jakarta.xml.ws.Endpoint;

public class DataServicePublisher {

    public void publish() {
        Endpoint.publish(Constants.BASE_URL, new DataServiceImpl());
    }
}
