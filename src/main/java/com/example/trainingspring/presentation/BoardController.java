package com.example.trainingspring.presentation;

import com.example.trainingspring.application.form.CommentForm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BoardController {

    @GetMapping("/board")
    public ModelAndView viewBoard(ModelAndView modelAndView) {
        modelAndView.setViewName("board");
        modelAndView.addObject("commentForm", new CommentForm());
        return modelAndView;
    }

    @PostMapping("/board")
    public String postComment(@ModelAttribute CommentForm comment) {
        // TODO: process POST request

        return "redirect:/board";
    }

}
