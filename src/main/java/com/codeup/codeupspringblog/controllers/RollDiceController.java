package com.codeup.codeupspringblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class RollDiceController {
    private int counter = 0;

    @GetMapping("/roll-dice")
    public String showRollDice() {
        counter = 0;
        return "roll-dice";
    }

    @GetMapping("/roll-dice/{n}")
    public String rollDice(@PathVariable int n, Model model) {
        Random random = new Random();
        List<Integer> diceRolls = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int diceRoll = random.nextInt(6) + 1;
            diceRolls.add(diceRoll);
            if (diceRoll == n) {
                counter++;
            }
        }

        model.addAttribute("n", n);
        model.addAttribute("diceRolls", diceRolls);
        model.addAttribute("counter", counter);


        return "roll-dice-finished";
    }
}
