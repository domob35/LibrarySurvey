package com.example.DoubleTWO.service;

import com.example.DoubleTWO.entity.Major;
import com.example.DoubleTWO.repo.MajorRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MajorService {

    private final MajorRepo majorRepo;

    // 전공 정보 전체 조회
    public List<Major> getAllMajors() {
        return majorRepo.findAll();
    }
}