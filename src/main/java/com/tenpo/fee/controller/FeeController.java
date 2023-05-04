package com.tenpo.fee.controller;

import com.tenpo.fee.dto.Fee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("feeController")
@RequestMapping("/fee")
public class FeeController {

    @GetMapping
    public Fee getFee() {
        return new Fee(5.0);
    }
}
