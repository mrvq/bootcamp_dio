package com.seuapp.repository;
import com.seuapp.model.TaskList;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TaskListRepository extends JpaRepository<TaskList, Long> {}