package com.example.DoubleTWO.service;

import com.example.DoubleTWO.entity.Identity;
import com.example.DoubleTWO.repo.IdentityRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class IdentityService {
    private final IdentityRepo identityRepo;

    // 신원 정보 전체 조회
    public List<Identity> getAllIdentities() {
        return identityRepo.findAll();
    }
}
