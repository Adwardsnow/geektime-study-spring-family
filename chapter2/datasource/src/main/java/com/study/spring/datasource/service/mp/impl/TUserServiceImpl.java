package com.study.spring.datasource.service.mp.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.spring.datasource.entity.TUserEntity;
import com.study.spring.datasource.mapper.TUserMapper;
import com.study.spring.datasource.service.mp.TUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wang.qiu
 * @since 2022-07-04
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUserEntity> implements TUserService {

}
