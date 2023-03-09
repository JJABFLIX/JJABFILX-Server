package com.group.jjabflix.wish.dao;

import com.group.jjabflix.wish.vo.Wish;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WishMapper {
    void insertWish(Wish wish);
}
