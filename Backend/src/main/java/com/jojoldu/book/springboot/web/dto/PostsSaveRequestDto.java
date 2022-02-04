package com.jojoldu.book.springboot.web.dto;

import com.jojoldu.book.springboot.domain.posts.Posts;
import com.jojoldu.book.springboot.domain.posts.PostsRepository;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.nio.file.Files;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String content;

    private Integer check1;
    private Integer check2;
    private Integer check3;
    private Integer check4;
    private Integer check5;

    @Builder
    public PostsSaveRequestDto(String title, String content, Integer check1,Integer check2,Integer check3,Integer check4,Integer check5) {
        this.title = title;
        this.content = content;

        this.check1=check1;
        this.check2=check2;
        this.check3=check3;
        this.check4=check4;
        this.check5=check5;

    }

    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .content(content)
                .check1(check1)
                .check2(check2)
                .check3(check3)
                .check4(check4)
                .check5(check5)
                .build();
    }
}