package com.service.tank042301.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestTank042301 {

        Tank042301Delegate tank042301Delegate = new Tank042301Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = tank042301Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}