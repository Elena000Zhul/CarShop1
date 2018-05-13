package ua.com.me.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import ua.com.me.entity.Produkt;
import ua.com.me.entity.User;
import ua.com.me.services.ProduktService;
import ua.com.me.services.UserServise;

import java.io.File;
import java.io.IOException;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    @Autowired
    private UserServise userServise;
//    @Autowired
//    private MailService mailService;
    @Autowired
    private ProduktService produktService;

    @GetMapping("/" )
    public String index( ) {
        return "index";
    }

    @GetMapping("/login")
    public String toLogin(){
    return "login";
}

    @GetMapping("/registration")
    public String toRegistration() {
        return "registration";
    }

    @GetMapping("/createProdukt")
    public String createProdukt (){
        return "createProdukt";
    }

    @GetMapping("/admin")
    public String adminPage (Model model, Principal principal){
    model.addAttribute("principal", principal);
        return "admin";
    }

    @GetMapping("/shoppingCart")
    public String toShoppingCart (){
        return "shoppingCart";
    }

//    @GetMapping("/myAccount")
//    public String myAccount(Model model, Principal principal) {
//        model.addAttribute("principal", principal);
//        return "myAccount";
//    }

    @GetMapping("/Access_Denied")
    public String accessDeniedPage(ModelMap model, Principal principal) {
        model.addAttribute("user", principal);
//        model.addAttribute("user", getPrincipal());
        return "accessDenied";
    }

    @PostMapping("/save")
    public String save(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName, @RequestParam("username") String username, @RequestParam("password") String password,
                        @RequestParam("email") String email, @RequestParam("phoneNumber") String phoneNumber, @RequestParam("avatar") MultipartFile multipartFile){
        String path = System.getProperty("user.home")+ File.separator + "userImages\\";
        try {
            multipartFile.transferTo(new File(path + multipartFile.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setPhoneNumber(phoneNumber);
        user.setAvatar("\\userAvatar\\" +multipartFile.getOriginalFilename());
        userServise.save(user);
//        mailService.send(user);
        return "index";
    }


    @PostMapping("/saveProdukt")
    public String saveProdukt (@RequestParam("firmName") String firmName, @RequestParam("model") String model,
                               @RequestParam("price") double price, @RequestParam("images")List<MultipartFile>  images){
        String produktPath = System.getProperty("user.home")+ File.separator + "produktImg\\";
        for (MultipartFile file:images ) {
            try {
                file.transferTo(new File(produktPath + file.getOriginalFilename()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Produkt produkt = new Produkt();
        produkt.setFirmName(firmName);
        produkt.setModel(model);
        produkt.setPrice(price);
        List<String> imageList = new ArrayList<String>();
        for (MultipartFile  image: images) {
            imageList.add("\\produktImages\\" + image.getOriginalFilename());
        }
        produkt.setImages(imageList);
        produktService.saveProdukt(produkt);
        return "index";
    }

    @GetMapping("/users")
    public String users(Model model){
        model.addAttribute("users", userServise.findAll());
        return "users";
    }

    @GetMapping("/produktList")
    public String produktList (Model model){
        model.addAttribute( "produkt",produktService.allProdukts());
        return "produktList";
    }

    @GetMapping ("/produkt-{id}")
        public String produkt (@PathVariable("id") int idProd, Model model){
        model.addAttribute("produkt", produktService.findOne(idProd));
            return "index";
        }


//    @GetMapping ("/produkt.images-(id)")
//    public String image (@PathVariable ("id") int idImg, Model model){
//            model.addAttribute("images", )
//    }



    @GetMapping("/user-{id}")
    public String user (@PathVariable("id") int idUser, Model model) {
        model.addAttribute("user",userServise.findOne(idUser) );
        return "myAccount";
    }







}