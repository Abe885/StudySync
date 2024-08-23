package com.coderscampus.studysync.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/admin/dashboard")
    public String getAdminDashboard() {
        return "/admin/dashboard";
    }
}
