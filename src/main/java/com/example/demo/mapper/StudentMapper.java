package com.example.demo.mapper;

import com.example.demo.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhoubin
 * @since 2022-06-06
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {

}
