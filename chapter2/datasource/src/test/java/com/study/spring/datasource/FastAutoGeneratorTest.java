package com.study.spring.datasource;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.fill.Column;

/**
 * <p>
 * 快速生成
 * </p>
 *
 * @author lanjerry
 * @since 2021-09-16
 */
public class FastAutoGeneratorTest extends BaseGeneratorTest {

    /**
     * 数据源配置
     */
    private static final DataSourceConfig.Builder DATA_SOURCE_CONFIG = new DataSourceConfig
        .Builder("jdbc:mysql://127.0.0.1:3306/test-shc?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&autoReconnect=true",
            "root", "123456");

    /**
     * 执行 run
     */
    public static void main(String[] args)  {
        String projectPath = System.getProperty("user.dir");

        // 初始化数据库脚本
        FastAutoGenerator.create(DATA_SOURCE_CONFIG)
            // 全局配置
            .globalConfig(builder -> builder.author("wang.qiu")
                    .enableSwagger().disableOpenDir()
                    .outputDir(projectPath + "/generate"))
            // 包配置
            .packageConfig(builder -> builder.parent("cn.study.spring")
                                                        .controller("controller")
                                                        .entity("entity").mapper("mapper").service("service.mp")
                                                        .serviceImpl("service.mp.impl"))
            // 策略配置
           // .strategyConfig((scanner, builder) -> builder.addInclude(scanner.apply("请输入表名，多个表名用,隔开")))
            .strategyConfig(builder -> builder.entityBuilder()
                                                        .enableLombok()
                                                        .enableTableFieldAnnotation()
                                                        .enableChainModel()
                                                        .addTableFills(new Column("gmt_created", FieldFill.INSERT))
                                                        .addTableFills(new Column("gmt_updated", FieldFill.INSERT_UPDATE))
                                                        .formatFileName("%sEntity")
                                                        .idType(IdType.AUTO)
                                      .controllerBuilder().enableRestStyle().formatFileName("%sController")
                                      .serviceBuilder().formatServiceFileName("%sService").formatServiceImplFileName("%sServiceImpl")
                                      .mapperBuilder().enableMapperAnnotation()
                                                      .enableBaseColumnList()
                                                      .formatMapperFileName("%sMapper")
                                                      .formatXmlFileName("%sMapper"))
            .execute();

    }
}