package com.duranco.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DemoController {
@GetMapping("")
public String showPage()
{
return "<a href='liste'>liste des controlleurs</a>";	
}
@GetMapping("liste")
public ModelAndView mapage()
{
ModelAndView model=new ModelAndView("liste.html");
return model;
}


}
