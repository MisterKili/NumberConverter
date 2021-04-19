package com.example.NumberConverter.controller;

import com.example.NumberConverter.logic.NumberConverterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class NumberConverterController {

    private final NumberConverterService service;

    public NumberConverterController(NumberConverterService service) {
        this.service = service;
    }


    @GetMapping
    ResponseEntity<String> convertToRomanOrHex(@RequestParam int number, @RequestParam String type) {
        String result;
        if (type.equals("roman")) {
            if (number <= 0)
                return ResponseEntity.badRequest().body("The number must be positive");
            result = service.convertToRoman(number);
        } else if (type.equals("hex"))
            result = service.convertToHex(number);
        else
            return ResponseEntity.badRequest().body("The type must be roman or hex");

        return ResponseEntity.ok(result);
      }
}
