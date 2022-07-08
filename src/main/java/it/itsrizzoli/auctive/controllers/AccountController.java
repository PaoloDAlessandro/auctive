package it.itsrizzoli.auctive.controllers;
import it.itsrizzoli.auctive.dao.ProfileRepository;
import it.itsrizzoli.auctive.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/profile")
public class AccountController {
    @Autowired
    private ProfileRepository profileRepository;

    @GetMapping(path = "")
    public String getProfile(Model model, User user, HttpSession session) {
        user = (User) session.getAttribute("userLogged");
        model.addAttribute("userLogged", user);
        return "profile.html";
    }

    @GetMapping(path = "/edit")
    public String getProfileEdit(User user, HttpSession session) {
        //User userLogged = (User) session.getAttribute("userLogged");
        return "profile-edit.html";
    }

    /*
    @GetMapping("/edit/{id}")
    public ModelAndView showEditProfileForm(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("profile-edit");

        User user = service.get(id);
        mav. addObject("user", user);

        //Product product = service.get(id);
        //mav.addObject("product", product);

        return mav;
    }
     */
}
