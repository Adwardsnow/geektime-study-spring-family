package cn.study.spring.service.mp.impl;

import cn.study.spring.entity.TUserEntity;
import cn.study.spring.mapper.TUserMapper;
import cn.study.spring.service.mp.TUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wang.qiu
 * @since 2022-07-05
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUserEntity> implements TUserService {

}
