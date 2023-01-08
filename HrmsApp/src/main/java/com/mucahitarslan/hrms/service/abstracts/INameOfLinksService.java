package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.entity.concretes.NameOfLinks;

import java.util.List;

public interface INameOfLinksService {
    DataResult<NameOfLinks> add(NameOfLinks nameOfLinks);

    DataResult<List<NameOfLinks>> getAll();
}
