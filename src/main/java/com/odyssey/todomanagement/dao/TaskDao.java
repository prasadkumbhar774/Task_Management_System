package com.odyssey.todomanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.odyssey.todomanagement.model.Task;

@Repository
public interface TaskDao extends JpaRepository<Task, Integer> {

}
