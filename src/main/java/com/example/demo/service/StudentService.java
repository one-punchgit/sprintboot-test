package com.example.demo.service;

import com.example.demo.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhoubin
 * @since 2022-06-06
 */
public interface StudentService extends IService<Student> {
    Integer insertS();
    Integer createOrUpdates();
}
