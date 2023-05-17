package com.codeup.codeupspringblog.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class MathController {

    @RequestMapping(path = "/add/{numberOne}/and/{numberTwo")
    @ResponseBody
    public int add(@PathVariable int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    @RequestMapping(path = "/subtract/{numberOne}/from/{numberTwo")
    @ResponseBody
    public int subtract(@PathVariable int numberOne, int numberTwo) {
        return numberTwo - numberOne;
    }

    @RequestMapping(path = "/multiply/{numberOne}/and/{numberTwo")
    @ResponseBody
    public int multiply(@PathVariable int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }

    @RequestMapping(path = "/divide/{numberOne}/by/{numberTwo")
    @ResponseBody
    public int divide(@PathVariable int numberOne, int numberTwo) {
        return numberOne / numberTwo;
    }
}
