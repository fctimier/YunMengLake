package com.yun.repository;

import com.yun.model.SUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * TODO
 *
 * @date 2021/2/19
 */
@Repository
public interface SUserRepository extends JpaRepository<SUser, Integer> {

}
