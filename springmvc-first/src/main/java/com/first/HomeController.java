package com.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    // servlet methods
    @RequestMapping("/hii")
    public String sayHii() {
        return "welcome.jsp"; // return jsp file
    }

    // Inject HttpServletRequest
    @Autowired
    HttpServletRequest req;

    /*
    // -------- OLD WAY (Using HttpServletRequest) --------
    @RequestMapping("/read")
    public String readData() {
        String name = req.getParameter("username");
        String age = req.getParameter("userage");
        String phono = req.getParameter("userphono");

        System.out.println(name + " " + age + " " + phono);
        return "welcome.jsp";
    }
    */

    // -------- NEW WAY (Using @RequestParam) --------
//    @RequestMapping("/read")
//    public String readData(
//            @RequestParam("username") String name,
//            @RequestParam("userage") int age,
//            @RequestParam("userphono") long phono) {
//
//        System.out.println(name + " " + age + " " + phono);
//        return "welcome.jsp";
//    }
    /*
     * Read data from form in object format
     * @ModelAttribute:
     * 1. Creates object of Customer
     *      Customer c = new Customer();
     * 2. Using setter methods it will set all data coming from form to the object
     *      c.setUsername("");
     *      c.setUserage();
     *      c.setUserphono();
     */

    @RequestMapping("/read")
    public String readData(@ModelAttribute Customer c) {

        // Printing values from Customer object
        System.out.println(
                c.getUsername() + " " +
                c.getUserage() + " " +
                c.getUserphono()
        );

        // Redirect to JSP page
        return "welcome.jsp";
    }
    
 // send data from controller to view
    @RequestMapping("/send")
    public String sendData(HttpServletRequest req) {

        // Sending simple values
        req.setAttribute("name", "tom");
        req.setAttribute("email", "tom@gmail.com");

        // Creating Customer object
        Customer c = new Customer();
        c.setUsername("lilly");
        c.setUserage(25);
        c.setUserphono(9876543214L);

        // Sending object to JSP
        req.setAttribute("customer", c);

        // Redirect to JSP page
        return "display.jsp";
    }
}