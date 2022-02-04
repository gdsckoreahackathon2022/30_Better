package com.jojoldu.book.springboot.service.files;

import com.jojoldu.book.springboot.domain.files.Files;
import com.jojoldu.book.springboot.domain.files.FilesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilesService {
    @Autowired
    FilesRepository filesRepository;

    public void save(Files files) {
        Files f = new Files();
        f.setFilename(files.getFilename());
        f.setFileOriName(files.getFileOriName());
        f.setFileurl(files.getFileurl());

        filesRepository.save(f);
    }

    public Files findByFno(int fno) {
        return filesRepository.findByFno(fno);
    }
}