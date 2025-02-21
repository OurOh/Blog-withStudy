package com.musecom.net.repository;

import com.musecom.net.dto.Board2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository2 extends JpaRepository<Board2, Long>{

}
