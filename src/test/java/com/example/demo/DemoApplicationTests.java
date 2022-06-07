package com.example.demo;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void test(){

        // 需要构建一个 代码自动生成器 对象
        AutoGenerator mpg = new AutoGenerator();

        // 1、全局配置
        GlobalConfig gc = new GlobalConfig();

        String projectPath = System.getProperty("user.dir");//获取项目路径
        gc.setOutputDir(projectPath+"/src/main/java");//设置路径
        gc.setAuthor("zhoubin");//设置作者
        gc.setOpen(false);//是否打开资源管理器
        gc.setFileOverride(false);// 是否覆盖原来生成的
        gc.setServiceName("%sService");// 去Service的I前缀
        gc.setIdType(IdType.AUTO);//雪花算法自动生成id
        gc.setDateType(DateType.ONLY_DATE);//日期格式
        gc.setSwagger2(true);//配置swagger

        mpg.setGlobalConfig(gc);//全局配置



        //2、设置数据源
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://127.0.0.1:3306/ha?useSSL=false&characterEncoding=utf-8&serverTimezone=Asia/Shanghai&allowPublicKeyRetrieval=true");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("root");
        dsc.setDbType(DbType.MYSQL);

        mpg.setDataSource(dsc);//设置全局配置


        //3、包的配置
        PackageConfig pc = new PackageConfig();
        //只需要改实体类名字 和包名 还有 数据库配置即可
//        pc.setModuleName("MybatisPlus");
        pc.setParent("com.example.demo");
        pc.setEntity("entity");
        pc.setMapper("mapper");
        pc.setService("service");
        pc.setController("controller");

        mpg.setPackageInfo(pc);//全局配置



        //4、策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setInclude("demo_user");//设置要映射的表名
        strategy.setNaming(NamingStrategy.underline_to_camel);//下划线转驼峰命名
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);//下划线转驼峰命名
        strategy.setEntityLombokModel(true);// 自动lombok；
//        strategy.setLogicDeleteFieldName("deleted");//逻辑删除字段
        // 时间自动填充配置
//        TableFill createTime = new TableFill("create_time", FieldFill.INSERT);
//        TableFill updateTime = new TableFill("update_time", FieldFill.INSERT_UPDATE);
//        ArrayList<TableFill> tableFills = new ArrayList<>();
//        tableFills.add(createTime); tableFills.add(updateTime);
//        strategy.setTableFillList(tableFills);
        // 乐观锁
//        strategy.setVersionFieldName("version");
        strategy.setRestControllerStyle(true);//controller是Restful风格
        strategy.setControllerMappingHyphenStyle(true);// localhost:8080/hello_id_2

        mpg.setStrategy(strategy);//全局配置


        //执行全局配置
        mpg.execute();
    }
}
