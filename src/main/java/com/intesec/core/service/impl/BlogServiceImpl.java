package com.intesec.core.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.intesec.core.mapper.BlogMapper;
import com.intesec.core.model.Blog;
import com.intesec.core.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: 博客实现类
 * @author: peter.peng
 * @create: 2018-08-23 16:49
 **/
@Service("blogService")
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogMapper blogMapper;

    @Override
    public int addBlog(Blog blog) {
        return blogMapper.insert(blog);
    }

    @Override
    public PageInfo<Blog> getBlogList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        int offset = (pageNum - 1) * pageSize;
        List<Blog> blogs = blogMapper.getBlogList(offset, pageSize);
        PageInfo<Blog> result = new PageInfo<>(blogs);
        return result;
    }

    @Override
    public Blog getOne(int id) {
        return blogMapper.selectByPrimaryKey(id);
    }
}