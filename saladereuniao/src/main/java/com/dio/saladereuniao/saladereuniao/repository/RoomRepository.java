package com.dio.saladereuniao.saladereuniao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.saladereuniao.saladereuniao.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{}
