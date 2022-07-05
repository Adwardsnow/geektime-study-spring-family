package com.study.spring.datasource.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.study.spring.datasource.entity.TUserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wang.qiu
 * @since 2022-07-04
 */
@Mapper
public interface TUserMapper extends BaseMapper<TUserEntity> {

}
