package com.mucahitarslan.hrms.service.concretes;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.core.utilities.results.SuccessDataResult;
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
    public DataResult<Provience> add(Provience provience) {
        return new SuccessDataResult<>(provienceRepository.save(provience),"The provience is saved successfully");
    }

    @Override
    public DataResult<List<Provience>> getAll() {
        return new SuccessDataResult<>(provienceRepository.findAll(),"The proviences are listed");
    }
}
