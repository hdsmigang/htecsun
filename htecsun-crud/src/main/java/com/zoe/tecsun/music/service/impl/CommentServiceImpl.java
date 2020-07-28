package com.zoe.tecsun.music.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zoe.tecsun.music.entity.Comment;
import com.zoe.tecsun.music.mapper.CommentMapper;
import com.zoe.tecsun.music.service.ICommentService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author huangdesheng
 * @since 2020-07-22
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
