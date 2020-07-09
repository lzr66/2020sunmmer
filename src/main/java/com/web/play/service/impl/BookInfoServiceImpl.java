package com.web.play.service.impl;

import com.web.play.dao.BookInfoDao;
import com.web.play.entity.BookInfo;
import com.web.play.service.BookInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BookInfo)表服务实现类
 *
 * @author makejava
 * @since 2020-07-09 18:10:56
 */
@Service("bookInfoService")
public class BookInfoServiceImpl implements BookInfoService {
    @Resource
    private BookInfoDao bookInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param bookId 主键
     * @return 实例对象
     */
    @Override
    public BookInfo queryById(Long bookId) {
        return this.bookInfoDao.queryById(bookId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<BookInfo> queryAllByLimit(int offset, int limit) {
        return this.bookInfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bookInfo 实例对象
     * @return 实例对象
     */
    @Override
    public BookInfo insert(BookInfo bookInfo) {
        this.bookInfoDao.insert(bookInfo);
        return bookInfo;
    }

    /**
     * 修改数据
     *
     * @param bookInfo 实例对象
     * @return 实例对象
     */
    @Override
    public BookInfo update(BookInfo bookInfo) {
        this.bookInfoDao.update(bookInfo);
        return this.queryById(bookInfo.getBookId());
    }

    /**
     * 通过主键删除数据
     *
     * @param bookId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long bookId) {
        return this.bookInfoDao.deleteById(bookId) > 0;
    }
}