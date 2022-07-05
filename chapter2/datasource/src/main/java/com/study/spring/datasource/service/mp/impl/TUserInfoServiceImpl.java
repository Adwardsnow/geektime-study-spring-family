package com.study.spring.datasource.service.mp.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.spring.datasource.entity.TUserInfoEntity;
import com.study.spring.datasource.mapper.TUserInfoMapper;
import com.study.spring.datasource.service.mp.TUserInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户扩展信息 服务实现类
 * </p>
 *
 * @author wang.qiu
 * @since 2022-07-05
 */
@Service
public class TUserInfoServiceImpl extends ServiceImpl<TUserInfoMapper, TUserInfoEntity> implements TUserInfoService {

}
