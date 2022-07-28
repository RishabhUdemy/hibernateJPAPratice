package com.learn.otml.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.learn.otml.dao.MemberDao;
import com.learn.otml.dao.TaskDao;
import com.learn.otml.entities.Member;
import com.learn.otml.entities.Task;

public class OneToManyListTest {

	public static void main(String[] args) {
		
		MemberDao memberDao = null;
		TaskDao taskDao = null;
		
		taskDao = new TaskDao();
		Task task1 = new Task();
		task1.setDescription("ODM changes to the Grid");
		task1.setDuration(1);
		task1.setStatus("Inprogress");
		task1.setTitle("ODM changes");
		taskDao.saveTaskDetail(task1);
		
		Task task2 = new Task();
		task2.setDescription("Merger changes to the Grid");
		task2.setDuration(1);
		task2.setStatus("Inprogress");
		task2.setTitle("Merger changes");
		taskDao.saveTaskDetail(task2);
		
		Member member = new Member();
		member.setExperience(3);
		member.setMemberName("John");
		member.setRole("Developer");
		member.setStartDate(new Date());
		
		List<Task> taskList = new ArrayList<>();
		taskList.add(task1);
		taskList.add(task2);
		
		member.setAssignedTasks(taskList);
		memberDao = new MemberDao();
		memberDao.saveMemberDetail(member);
	}
}
