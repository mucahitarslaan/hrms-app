package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.entity.concretes.Link;

import java.util.List;

public interface ILinkService {
    DataResult<Link> add(Link link);

    DataResult<List<Link>> getAll();
}
