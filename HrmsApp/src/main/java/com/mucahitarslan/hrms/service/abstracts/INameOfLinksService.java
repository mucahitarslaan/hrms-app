package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.entity.concretes.NameOfLinks;

import java.util.List;

public interface INameOfLinksService {
    NameOfLinks add(NameOfLinks nameOfLinks);

    List<NameOfLinks> getAll();
}
