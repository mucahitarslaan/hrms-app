package com.mucahitarslan.hrms.service.concretes;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.core.utilities.results.SuccessDataResult;
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
    public DataResult<NameOfLinks> add(NameOfLinks nameOfLinks) {
        return new SuccessDataResult<>(nameOfLinksRepository.save(nameOfLinks),"The name of link is saved successfully");
    }

    @Override
    public DataResult<List<NameOfLinks>> getAll() {
        return new SuccessDataResult<>(nameOfLinksRepository.findAll(),"The name of links are listed");
    }
}
