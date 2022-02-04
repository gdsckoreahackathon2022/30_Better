package com.jojoldu.book.springboot.web.dto;


import com.jojoldu.book.springboot.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {
    private Long id;
    private String title;
    private String content;
    private Integer check1;
    private Integer check2;
    private Integer check3;
    private Integer check4;
    private Integer check5;

    public PostsResponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();

        this.check1 =entity.getCheck1();
        this.check2 =entity.getCheck2();
        this.check3 =entity.getCheck3();
        this.check4 =entity.getCheck4();
        this.check5 =entity.getCheck5();
    }
}
