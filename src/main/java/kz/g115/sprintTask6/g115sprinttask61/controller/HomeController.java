package kz.g115.sprintTask6.g115sprinttask61.controller;

import kz.g115.sprintTask6.g115sprinttask61.entity.ApplicationRequest;
import kz.g115.sprintTask6.g115sprinttask61.service.ApplicationRequestService;
import org.hibernate.query.sqm.tree.domain.SqmPathWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private ApplicationRequestService appReqService;
    @GetMapping("/")
    public String homePage(Model model) {
        List<ApplicationRequest> appReq = appReqService.getAppRequests();
        model.addAttribute("zayavki", appReq);
        return "home";
    }

    @PostMapping("/add-app-req")
    public String addAppReq(ApplicationRequest appReq) {
        appReqService.addAppReq(appReq);
        return "redirect:/";
    }

    @GetMapping("/details/{id}")
    public String details(@PathVariable Long id, Model model) {
        ApplicationRequest appReq = appReqService.getAppReqById(id);
        model.addAttribute("zayavka", appReq);
        return "details";
    }
}
