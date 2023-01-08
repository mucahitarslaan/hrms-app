package com.mucahitarslan.hrms.service.concretes;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.core.utilities.results.SuccessDataResult;
import com.mucahitarslan.hrms.dataAccess.abstracts.ILinkRepository;
import com.mucahitarslan.hrms.entity.concretes.Link;
import com.mucahitarslan.hrms.service.abstracts.ILinkService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkService implements ILinkService {
    private final ILinkRepository linkRepository;

    public LinkService(ILinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    @Override
    public DataResult<Link> add(Link link) {
        return new SuccessDataResult<>(linkRepository.save(link),"The link is saved successfully");
    }

    @Override
    public DataResult<List<Link>> getAll() {
        return new SuccessDataResult<>(linkRepository.findAll(),"The links are listed");
    }
}
