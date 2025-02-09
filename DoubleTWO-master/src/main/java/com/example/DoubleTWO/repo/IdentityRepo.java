package com.example.DoubleTWO.repo;

import com.example.DoubleTWO.entity.Identity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdentityRepo extends JpaRepository<Identity, Long> {
}
