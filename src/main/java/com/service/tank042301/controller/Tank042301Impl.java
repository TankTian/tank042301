package com.service.tank042301.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-04-23T02:21:26.086Z")

@RestSchema(schemaId = "tank042301")
@RequestMapping(path = "/tank042301", produces = MediaType.APPLICATION_JSON)
public class Tank042301Impl {

    @Autowired
    private Tank042301Delegate userTank042301Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userTank042301Delegate.helloworld(name);
    }

}
