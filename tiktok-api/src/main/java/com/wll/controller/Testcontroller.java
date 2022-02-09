package com.wll.controller;

import com.wll.GraceJSONResult;
import com.wll.Stu;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName:
 * @FileName:
 * @Author: 韦溜溜
 * @Description:
 * @Date: Create in 15:40 2022/2/8
 */
@RestController
@Slf4j
public class Testcontroller {

    @GetMapping("/hello")
    public Object hello(){
        HashMap<Stu ,Integer> map = new HashMap<>();
        Stu stu = new Stu("测试",1);
        map.put(stu,2);
        log.info(stu.toString());
        log.warn(stu.toString());
        log.error(stu.toString());
        return GraceJSONResult.errorMap(map);
    }
}
