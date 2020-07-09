package com.web.play.controller;

import com.web.play.entity.BookInfo;
import com.web.play.service.BookInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (BookInfo)表控制层
 *
 * @author makejava
 * @since 2020-07-09 18:10:57
 */
@RestController
@RequestMapping("bookInfo")
public class BookInfoController {
    /**
     * 服务对象
     */
    @Resource
    private BookInfoService bookInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BookInfo selectOne(Long id) {
        return this.bookInfoService.queryById(id);
    }

}