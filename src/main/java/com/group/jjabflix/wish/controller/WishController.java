package com.group.jjabflix.wish.controller;

import com.group.jjabflix.wish.dto.AddWishRequestDto;
import com.group.jjabflix.wish.service.WishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/wishes")
public class WishController {

    @Autowired
    private WishService wishService;

    @PostMapping
    public void addWish(@RequestBody AddWishRequestDto addWishRequestDto) {
        wishService.addWish(addWishRequestDto);
    }

    @GetMapping("/{profileId}")
    public void findWishList() {

    }

    @DeleteMapping("/{wishId}")
    public void cancelWish(@PathVariable long wishId) {

    }

}
