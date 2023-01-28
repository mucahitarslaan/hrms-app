package com.mucahitarslan.hrms.service.concretes;

import com.mucahitarslan.hrms.dataAccess.abstracts.IProvienceRepository;
import com.mucahitarslan.hrms.entity.concretes.Provience;
import com.mucahitarslan.hrms.service.abstracts.IProvienceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvienceService implements IProvienceService {
    private final IProvienceRepository provienceRepository;

    public ProvienceService(IProvienceRepository provienceRepository) {
        this.provienceRepository = provienceRepository;
    }

    @Override
    public Provience add(Provience provience) {
        return provienceRepository.save(provience);
    }

    @Override
    public List<Provience> getAll() {
        return provienceRepository.findAll();
    }
}
