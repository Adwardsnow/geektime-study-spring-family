package com.study.spring.datasource.controller;

import com.study.spring.datasource.entity.TUserEntity;
import com.study.spring.datasource.service.mp.TUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wang.qiu
 * @since 2022-07-04
 */
@RestController
@RequestMapping("/tUserEntity")
@Api(tags = "用户操作")
@RequiredArgsConstructor
public class TUserController {

    private final TUserService userService;

    @ApiOperation("查询用户")
    @GetMapping("/{id}")
    public TUserEntity getById(@PathVariable Long id) {
        return userService.getById(id);
    }

}
