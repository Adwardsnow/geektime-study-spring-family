package com.study.spring.datasource.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户扩展信息
 * </p>
 *
 * @author wang.qiu
 * @since 2022-07-05
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("t_user_info")
@ApiModel(value = "TUserInfoEntity对象", description = "用户扩展信息")
public class TUserInfoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("地址")
    @TableField("address")
    private String address;

    @TableField(value = "gmt_created", fill = FieldFill.INSERT)
    private LocalDateTime gmtCreated;

    @TableField(value = "gmt_updated", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime gmtUpdated;


}
