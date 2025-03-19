package com.kuldeep.Demo.controller;

import com.kuldeep.Demo.AlienRepo;
import com.kuldeep.Demo.model.Alien;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    AlienRepo repo;

    @ModelAttribute
    public void modelData(Model m) {
        m.addAttribute("name", "Aliens");
    }

    @RequestMapping("/")
    public String home() {
        //System.out.println("Home page requested");
        return "index";
    }


    /* public String add(HttpServletRequest req){
       int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));*/
   /* @RequestMapping("add")
    public String add(@RequestParam("num1") int i , @RequestParam("num2") int j , HttpSession session){
        int num3 = i+j;

       // HttpSession session = req.getSession();
        session.setAttribute("num3", num3);

        return "result.jsp";
    }*/
   /* @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int i , @RequestParam("num2") int j){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("result");
        int num3 = i+j;
        // HttpSession session = req.getSession();
        // session.setAttribute("num3", num3);
        mv.addObject("num3", num3);
        return mv;
    }*/
    @GetMapping("getAliens")
    public String getAliens(Model m) {
       // List<Alien> aliens = Arrays.asList(new Alien("kuldeep", 101), new Alien("Soni", 103));
        m.addAttribute("result", repo.findAll());
        return "showAliens";
    }
    @GetMapping("getAlien")
    public String getAlien(@RequestParam int aid, Model m){
        m.addAttribute("result", repo.getOne(aid));
        return "showAliens";
    }

    @GetMapping("getAlienByName")
    public String getAlienByName(@RequestParam String aname, Model m){
        m.addAttribute("result", repo.find(aname));
        return "showAliens";
    }

    /*@PostMapping(value = "addAlien")
    public String addAlien(@RequestParam("aid") int aid, @RequestParam("aname") String aname, Model m) {
        Alien a = new Alien();
        a.setAid(aid);
        a.setAname(aname);
        m.addAttribute("alien", a);
        return "result";
    }*/
    @PostMapping(value = "addAlien")
    public String addAlien(@ModelAttribute Alien a) {
        repo.save(a);
        return "result";
    }

}
