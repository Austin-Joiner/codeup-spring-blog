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

    @GetMapping("/roll-dice")
    public String showRollDice(Model model) {
        model.addAttribute("title", "Roll Dice");

        return "roll-dice";
    }

    @GetMapping("/roll-dice/{n}")
    public String rollDice(@PathVariable int n, Model model) {
        model.addAttribute("title", "Dice Results");
        Random random = new Random();
        List<Integer> diceRolls = new ArrayList<>();

        int counter = 0;

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
