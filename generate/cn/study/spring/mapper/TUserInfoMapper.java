package cn.study.spring.mapper;

import cn.study.spring.entity.TUserInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户扩展信息 Mapper 接口
 * </p>
 *
 * @author wang.qiu
 * @since 2022-07-05
 */
@Mapper
public interface TUserInfoMapper extends BaseMapper<TUserInfoEntity> {

}
