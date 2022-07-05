package cn.study.spring.mapper;

import cn.study.spring.entity.TUserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wang.qiu
 * @since 2022-07-05
 */
@Mapper
public interface TUserMapper extends BaseMapper<TUserEntity> {

}
