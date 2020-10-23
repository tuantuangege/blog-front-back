package com.ttgg.service.impl;

import com.ttgg.entity.Blog;
import com.ttgg.mapper.BlogMapper;
import com.ttgg.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ttgg
 * @since 2020-10-01
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
