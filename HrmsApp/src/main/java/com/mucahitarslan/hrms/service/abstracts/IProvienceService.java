package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.entity.concretes.Provience;

import java.util.List;

public interface IProvienceService {
    Provience add(Provience provience);

    List<Provience> getAll();
}
