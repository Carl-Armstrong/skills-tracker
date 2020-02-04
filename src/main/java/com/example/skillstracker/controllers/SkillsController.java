package com.example.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String landingSiteText() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>Java</li>" +
                "<li>C++</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String formHtml() {
        return "<html>" +
                "<body>" +
                "<form action = 'form' method = 'post'>" +
                "Name:<br>" +
                "<input type='text' name='name'><br>" +
                "My favorite language:<br>" +
                "<select name = 'firstLanguage'>" +
                "<option value ='JavaScript'>JavaScript</option>" +
                "<option value ='Java'>Java</option>" +
                "<option value ='C++'>C++</option>" +
                "</select><br>" +
                "My second favorite language:<br>" +
                "<select name = 'secondLanguage'>" +
                "<option value ='JavaScript'>JavaScript</option>" +
                "<option value ='Java'>Java</option>" +
                "<option value ='C++'>C++</option>" +
                "</select><br>" +
                "My third favorite language:<br>" +
                "<select name = 'thirdLanguage'>" +
                "<option value ='JavaScript'>JavaScript</option>" +
                "<option value ='Java'>Java</option>" +
                "<option value ='C++'>C++</option>" +
                "</select><br>" +
                "<input type = 'submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("form")
    public String formOutput(@RequestParam String name, @RequestParam String firstLanguage, @RequestParam String secondLanguage, @RequestParam String thirdLanguage) {
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstLanguage + "</li>" +
                "<li>" + secondLanguage + "</li>" +
                "<li>" + thirdLanguage + "</li>" +
                "</ol>";
    }

}
