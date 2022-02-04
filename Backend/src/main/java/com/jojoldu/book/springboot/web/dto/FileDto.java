package com.jojoldu.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class FileDto {
    private String uuid;
    private String fileName;
    private String contentType;

    public FileDto(String uuid, String fileName, String contentType) {
        this.uuid = uuid;
        this.fileName = fileName;
        this.contentType = contentType;
        System.out.println(contentType);
    }

}
