package com.example.study_plan.Controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudyTicketController {

    //学習チケット一覧表示画面の表示
    @RequestMapping("/")
    public ModelAndView DisplayAllTickets(ModelAndView mav) {
        
        mav.setViewName("allTickets");
        return mav;
    }

    //学習チケット新規作成画面表示
    @RequestMapping("/create/tickets")
    public ModelAndView DisplayCreateTickets(ModelAndView mav) {
        
        mav.setViewName("createTickets");
        return mav;
    }

    //学習チケット詳細画面表示
    @RequestMapping("/show/tickets/{num}")
    public ModelAndView DisplayDetailTickets(@PathVariable int num, ModelAndView mav) {
        
        mav.setViewName("showTickets");
        return mav;
    }

    //学習チケット新規作成
    @RequestMapping(value="/create/tickets", method=RequestMethod.POST)
    public ModelAndView CreateNewTickets(@RequestParam("title") String title,
            @RequestParam("doneLimitDate") Date limitDate ,
            @RequestParam("content") String content,
            ModelAndView mav) {
        
        mav.setViewName("allTickets");
        return mav;
    }

    //学習チケットを編集
    @RequestMapping(value="/show/tickets/{num}", method=RequestMethod.POST)
    public ModelAndView EditTickets(@RequestParam("title") String title,
            @RequestParam("doneLimitDate") Date limitDate ,
            @RequestParam("content") String content,
            ModelAndView mav) {
        
        mav.setViewName("allTickets");
        return mav;
    }

    
}
