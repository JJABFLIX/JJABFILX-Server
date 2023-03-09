package com.group.jjabflix.wish.dto;

import com.group.jjabflix.wish.vo.Wish;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AddWishRequestDto {

    private long profileId;
    private long contentId;

    public Wish toWish() {
        return new Wish(
          profileId, contentId
        );
    }

}
