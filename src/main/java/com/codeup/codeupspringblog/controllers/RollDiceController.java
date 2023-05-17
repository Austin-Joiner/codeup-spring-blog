package com.codeup.codeupspringblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Random;

@Controller
public class RollDiceController {
    @GetMapping("/roll-dice")
    public String showRollDice() {
        return "roll-dice";
    }

    @GetMapping("/roll-dice/{n}")
    public String rollDice(@PathVariable int n, Model model) {
        Random random = new Random();
        int diceRollOne = random.nextInt(6) + 1;
        int diceRollTwo = random.nextInt(6) + 1;
        int diceRollThree = random.nextInt(6) + 1;
        int diceRollFour = random.nextInt(6) + 1;
        int counter = 0;


        model.addAttribute("n", n);
        model.addAttribute("diceRollOne", diceRollOne);
        model.addAttribute("diceRollTwo", diceRollTwo);
        model.addAttribute("diceRollThree", diceRollThree);
        model.addAttribute("diceRollFour", diceRollFour);
        model.addAttribute("counter", counter);

        // Dice One conditional
        if (n == diceRollOne) {
            model.addAttribute("messageOne", "That is correct. GOOD JOB!");
            model.addAttribute("results", +1);

        } else {
            model.addAttribute("messageOne", "oh no. You are wrong. Sorry.");
        }


        // Dice Two conditional
        if (n == diceRollTwo) {
            model.addAttribute("messageTwo", "That is correct. GOOD JOB!");
            model.addAttribute("results", +1);

        } else {
            model.addAttribute("messageTwo", "oh no. You are wrong. Sorry.");
        }


        // Dice Three conditional
        if (n == diceRollThree) {
            model.addAttribute("messageThree", "That is correct. GOOD JOB!");
            model.addAttribute("results", +1);

        } else {
            model.addAttribute("messageThree", "oh no. You are wrong. Sorry.");
        }


        // Dice Four conditional
        if (n == diceRollFour) {
            model.addAttribute("messageFour", "That is correct. GOOD JOB!");
            model.addAttribute("results", +1);

        } else {
            model.addAttribute("messageFour", "oh no. You are wrong. Sorry.");
        }

        return "roll-dice-finished";
    }
}
