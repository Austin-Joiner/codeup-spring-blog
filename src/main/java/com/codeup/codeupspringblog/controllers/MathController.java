package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MathController {

    @RequestMapping(path = "/add/{numberOne}/and/{numberTwo}", method = RequestMethod.GET)
    @ResponseBody
    public int add(@PathVariable int numberOne, @PathVariable int numberTwo) {
        return numberOne + numberTwo;
    }

    @RequestMapping(path = "/subtract/{numberOne}/from/{numberTwo}", method = RequestMethod.GET)
    @ResponseBody
    public int subtract(@PathVariable int numberOne, @PathVariable int numberTwo) {
        return numberTwo - numberOne;
    }

    @RequestMapping(path = "/multiply/{numberOne}/and/{numberTwo}", method = RequestMethod.GET)
    @ResponseBody
    public int multiply(@PathVariable int numberOne, @PathVariable int numberTwo) {
        return numberOne * numberTwo;
    }

    @RequestMapping(path = "/divide/{numberOne}/by/{numberTwo}", method = RequestMethod.GET)
    @ResponseBody
    public int divide(@PathVariable int numberOne, @PathVariable int numberTwo) {
        return numberOne / numberTwo;
    }
}
