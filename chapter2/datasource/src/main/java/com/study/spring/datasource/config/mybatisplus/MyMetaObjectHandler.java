package com.study.spring.datasource.config.mybatisplus;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * mybatis 自动填充
 *
 * @author wangqiu
 * @date 2021/12/30
 * @copyright (C), 2011-2031, 上海聚音信息科技有限公司
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        this.strictInsertFill(metaObject, "gmt_created", LocalDateTime.class, LocalDateTime.now());
        this.strictInsertFill(metaObject, "gmt_updated", LocalDateTime.class, LocalDateTime.now());
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.strictUpdateFill(metaObject, "gmt_updated", LocalDateTime.class, LocalDateTime.now());
    }
}
