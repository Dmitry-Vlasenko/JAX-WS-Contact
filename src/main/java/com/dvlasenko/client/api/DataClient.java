package com.dvlasenko.client.api;

import com.dvlasenko.client.utils.Constants;
import com.dvlasenko.server.service.DataService;
import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.net.URI;
import java.net.URL;

public class DataClient {

    public String runClient(String data) throws Exception {
        URL url = URI.create(Constants.WSDL_URL).toURL();

        QName qname = new QName(
                "http://service.server.dvlasenko.com/",
                "DataServiceImplService"
        );
        Service service = Service.create(url, qname);
        DataService dataService = service.getPort(DataService.class);
        return dataService.getData(data);
    }
}
