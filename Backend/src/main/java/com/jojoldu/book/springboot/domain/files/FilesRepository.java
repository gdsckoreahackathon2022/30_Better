package com.jojoldu.book.springboot.domain.files;

import org.springframework.data.jpa.repository.JpaRepository;

public interface  FilesRepository extends JpaRepository<Files, Integer> {
    Files findByFno(int fno);
}