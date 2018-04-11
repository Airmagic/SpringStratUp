package com.erich.springhello;

//These are different pakages to make this web app to work
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//Added the controller and spring boot app to run the web page
@Controller
@SpringBootApplication
public class SpringHelloAppApplication {

//	This is adding the homepage routing
	@RequestMapping("/")
//	this is adding a message into the body if requested
	@ResponseBody
	String home(){
		return "Fun With spring";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringHelloAppApplication.class, args);
	}
}
