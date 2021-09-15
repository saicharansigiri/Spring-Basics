package com.sigirispringp1.springp1.business.flow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@RestController
public class Controller {
    @Autowired
    private BusinessService businessService;

    @GetMapping("/sum")
    public long getSum(){return businessService.calculateSum();}
}



@Component
class BusinessService {

    @Autowired
    private final Data data;
    List<Integer> res;

    public BusinessService(Data data) {
        this.data = data;
        res = data.fetchData();

    }

    public Integer calculateSum(){
        return   res==null?-1:res.stream().reduce(Integer::sum).get();
    }
}

@Component
class Data{
    public List<Integer> fetchData(){
        return null;
    }
}