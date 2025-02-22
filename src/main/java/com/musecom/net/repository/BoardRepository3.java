package com.musecom.net.repository;


import com.musecom.net.dto.Board3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository3 extends JpaRepository<Board3, Long> {

}
