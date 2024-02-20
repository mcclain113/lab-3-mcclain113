package edu.wctc.springbootlab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    //GET and POST requests to "/" return the page "index.html"
    @RequestMapping("/")
    public String showHomePage() {
        return "index";
    }

    //GET (but not POST) requests to "view-cart" return the page "cart.html"
    @GetMapping("/view-cart")
    public String showCart() {
    return "orders/cart";
}

    //GET and POST requests to "product/detail" return the page "product-detail.html"
    @RequestMapping("/product/detail")
    public String showProductDetail() {
    return "catalog/product-detail";
}
    //POST (but not GET) requests to "place-order" redirect to the URL "/"
    @PostMapping("/place-order")
    public String redirectPlaceOrder(){
        return "redirect:/";
    }

//    GET and POST requests to "search" redirect to the URL "http://www.google.com"
    @RequestMapping("/search")
    public String redirectSearch(){
        return "redirect:https://www.google.com";
    }

}
