package com.example.demo.service.impl;

import com.example.demo.entity.DemoUser;
import com.example.demo.entity.Student;
import com.example.demo.mapper.DemoUserMapper;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhoubin
 * @since 2022-06-06
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

    @Autowired
    DemoUserMapper demoUserMapper;

    @Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRED)
    @Override
    public Integer createOrUpdates() {
        Student student = new Student();
        student.setAge(18);
        student.setName("zhoubin");
        student.setXb(1);
        this.saveOrUpdate(student);
        insertS();
        System.out.println("执行完insetS");
        System.out.println(2/0);
        return student.getId();
    }

    @Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRES_NEW)
    @Override
    public Integer insertS() {
        Student student = new Student();
        student.setAge(19);
        student.setName("zhoubin1");
        student.setXb(1);
        this.save(student);
//        System.out.println(2/0);
        return student.getId();
    }
    public Integer insertDemoUser() {
        DemoUser demoUser = new DemoUser();
        demoUser.setAddress("123");
        demoUserMapper.insert(demoUser);
        return demoUser.getId();
    }



}
