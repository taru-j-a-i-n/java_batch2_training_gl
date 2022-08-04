package org.sweetshoppe.admin;

import java.util.List;

import javax.transaction.Transactional;

import org.admin.manage.AdminManage;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class AdminDao {

	private HibernateTemplate hibernateTemplate;
	
	//Save record
	@Transactional
	public int insert(AdminManage admin) {
		//insert 
		Integer i=(Integer) this.hibernateTemplate.save(admin);
		return i;
	}
	//get the single data(object)
	public AdminManage getSweet(int sweetId) {
		AdminManage admin=this.hibernateTemplate.get(AdminManage.class,sweetId);
		return admin;
	}
	
	//get all data(all rows)
	public List<AdminManage> getAllSweets(){
		List<AdminManage> admin=this.hibernateTemplate.loadAll(AdminManage.class);
		return admin;
	}
	
	//deleting the data
	@Transactional
	public void deleteSweet(int sweetId) {
		AdminManage admin=this.hibernateTemplate.get(AdminManage.class,sweetId);
		this.hibernateTemplate.delete(admin);
	}
	//update data
	@Transactional
	public void updateSweet(AdminManage admin) {
		this.hibernateTemplate.update(admin);
	}
//getters and setters
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
