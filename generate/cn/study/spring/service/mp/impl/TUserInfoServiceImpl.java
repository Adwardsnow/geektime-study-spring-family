package cn.study.spring.service.mp.impl;

import cn.study.spring.entity.TUserInfoEntity;
import cn.study.spring.mapper.TUserInfoMapper;
import cn.study.spring.service.mp.TUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
