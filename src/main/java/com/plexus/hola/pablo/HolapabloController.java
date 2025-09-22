package com.plexus.hola.pablo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200")
public class HolapabloController
{
    @GetMapping("/holapablo")
    public String hola()
    {
        return "Hola desde Spring Boot";
    }
}
