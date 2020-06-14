package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Test";

    @Test
    public void testFindByListName() {
        //Given
        TaskList tasklist = new TaskList(DESCRIPTION, "ToDo");
        taskListDao.save(tasklist);
        String toDo = tasklist.getListName();

        //When
        List<TaskList> readTasks = taskListDao.findByListName(toDo);

        //Then
        Assert.assertEquals(1, readTasks.size());

        //CleanUp
        //int id = readTasks.get(0).getId();
        //taskDao.deleteById(id);
    }
}