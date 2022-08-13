package com.dbs.pay.controller;

import com.dbs.pay.repository.transactionRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/")

public class transactionController {
    @Autowired
    private transactionRespository repository;
}
