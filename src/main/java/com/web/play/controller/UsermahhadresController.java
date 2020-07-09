package com.web.play.controller;

import com.web.play.entity.BookInfo;
import com.web.play.entity.Usermahhadres;
import com.web.play.service.BookInfoService;
import com.web.play.service.UsermahhadresService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Usermahhadres)表控制层
 *
 * @author makejava
 * @since 2020-07-09 17:20:19
 */
@RestController
@RequestMapping("usermahhadres")
public class UsermahhadresController {
    /**
     * 服务对象
     */
    @Resource
    private UsermahhadresService usermahhadresService;
    private BookInfoService bookInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Usermahhadres selectOne(Integer id) {
        //bookInfoService.queryAllByLimit()

        return this.usermahhadresService.queryById(id);
    }



}