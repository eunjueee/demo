/*
  @Class com.example.demo.controller.DemoController
 * @Description
 * @author eunjueee
 * @since 2021-04-12
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class DemoController {

	 @RequestMapping("/hi")
	 public String hi(){
	 	return "index";
	 }
}
