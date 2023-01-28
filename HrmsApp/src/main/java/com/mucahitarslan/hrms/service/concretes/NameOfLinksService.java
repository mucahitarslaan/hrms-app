package com.mucahitarslan.hrms.service.concretes;

import com.mucahitarslan.hrms.dataAccess.abstracts.INameOfLinksRepository;
import com.mucahitarslan.hrms.entity.concretes.NameOfLinks;
import com.mucahitarslan.hrms.service.abstracts.INameOfLinksService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NameOfLinksService implements INameOfLinksService {
    private final INameOfLinksRepository nameOfLinksRepository;

    public NameOfLinksService(INameOfLinksRepository nameOfLinksRepository) {
        this.nameOfLinksRepository = nameOfLinksRepository;
    }

    @Override
    public NameOfLinks add(NameOfLinks nameOfLinks) {
        return nameOfLinksRepository.save(nameOfLinks);
    }

    @Override
    public List<NameOfLinks> getAll() {
        return nameOfLinksRepository.findAll();
    }
}
