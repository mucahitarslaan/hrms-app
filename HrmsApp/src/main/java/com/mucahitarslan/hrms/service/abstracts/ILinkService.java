package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.entity.concretes.Link;

import java.util.List;

public interface ILinkService {
    Link add(Link link);

    List<Link> getAll();
}
