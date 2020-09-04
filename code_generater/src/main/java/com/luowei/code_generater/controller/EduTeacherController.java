package com.luowei.code_generater.controller;


import com.luowei.code_generater.entity.EduTeacher;
import com.luowei.code_generater.service.EduTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author testjava
 * @since 2020-08-14
 */
@RestController
@RequestMapping("/code_generater/edu-teacher")
public class EduTeacherController {
    @Autowired
    private EduTeacherService eduTeacherService;

    //访问地址：http://localhost:8081/code_generater/edu-teacher/findAll
    @GetMapping("findAll")
    public List<EduTeacher> findAll() {
        List<EduTeacher> list = eduTeacherService.list(null);
        return list;
    }

    @DeleteMapping("{id}")
    public boolean eduDelete(@PathVariable String id){
        boolean b = eduTeacherService.removeById(id);
        return b;
    }

}

