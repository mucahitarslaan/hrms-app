package com.mucahitarslan.hrms.service.concretes;

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
    public Link add(Link link) {
        return linkRepository.save(link);
    }

    @Override
    public List<Link> getAll() {
        return linkRepository.findAll();
    }
}
