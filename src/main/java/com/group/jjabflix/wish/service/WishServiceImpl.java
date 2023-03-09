package com.group.jjabflix.wish.service;

import com.group.jjabflix.wish.dao.WishMapper;
import com.group.jjabflix.wish.dto.AddWishRequestDto;
import com.group.jjabflix.wish.vo.Wish;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class WishServiceImpl implements WishService {

    private final WishMapper wishMapper;

    @Transactional
    @Override
    public void addWish(AddWishRequestDto requestDto) {
        Wish wish = requestDto.toWish();
        wishMapper.insertWish(wish);
    }
}
