package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.entity.concretes.Provience;

import java.util.List;

public interface IProvienceService {
    DataResult<Provience> add(Provience provience);

    DataResult<List<Provience>> getAll();
}
