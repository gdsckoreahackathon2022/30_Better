package com.jojoldu.book.springboot.domain.posts;

import com.jojoldu.book.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="title" ,length = 500, nullable = false)
    private String title;

    @Column(name="content", columnDefinition = "TEXT", nullable = false)

    private String content;

    @Column(name="check1" ,columnDefinition = "integer default 0", nullable = true)
    private Integer check1;

    @Column(name="check2" ,columnDefinition = "integer default 0", nullable = true)
    private Integer check2;

    @Column(name="check3" ,columnDefinition = "integer default 0", nullable = true)
    private Integer check3;

    @Column(name="check4" ,columnDefinition = "integer default 0", nullable = true)
    private Integer check4;

    @Column(name="check5" ,columnDefinition = "integer default 0", nullable = true)
    private Integer check5;

    @Builder
    public Posts(String title,String content, Integer check1, Integer check2,Integer check3,Integer check4,Integer check5){
        this.title = title;
        this.content = content;

        this.check1 = check1;
        this.check2 = check2;
        this.check3 = check3;
        this.check4 = check4;
        this.check5 = check5;
    }

    public void update(String title,String content, Integer check1, Integer check2, Integer check3, Integer check4, Integer check5){
        this.title = title;
        this.content = content;
        this.check1 = check1;
        this.check2 =check2;
        this.check3 =check3;
        this.check4 =check4;
        this.check5 =check5;
    }
}
