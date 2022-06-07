package com.example.demo.controller;


import com.example.demo.service.StudentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhoubin
 * @since 2022-06-06
 */
@RestController
@RequestMapping("/student")
public class StudentController {


    @Autowired
    StudentService studentService;

    @ApiOperation("磨辊磨损度排名top10")
    @GetMapping("/createOrUpdate")
    Integer createOrUpdates(){

        return studentService.createOrUpdates();

    }
}

