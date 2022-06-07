package com.example.demo.service.impl;

import com.example.demo.entity.DemoUser;
import com.example.demo.mapper.DemoUserMapper;
import com.example.demo.service.DemoUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhoubin
 * @since 2022-06-06
 */
@Service
public class DemoUserServiceImpl extends ServiceImpl<DemoUserMapper, DemoUser> implements DemoUserService {

}
