package javaOdev5.dataAccess.concretes;

import java.util.List;

import javaOdev5.dataAccess.abstracts.UserDao;
import javaOdev5.entities.concretes.User;

public class InMemoryUserDao implements UserDao{
	private List<User> users ;
	
	

	public InMemoryUserDao(List<User> users) {
		super();
		this.users = users;
	}

	@Override
	public void add(User user) {
		System.out.println( "Kullanıcı eklendi. " + user.getName());
		users.add(user);
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getName()+ "Veriler güncelledi.");
		
		
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getName() +  "Sistemden silindi.");
		
		
		
		
	}

	@Override
	public User get(int id) {
		for(User user : users) {
			if(user.getId()== id)
				return user;
		}
		return null;
	}

	@Override
	public User getByEmail(String email) {
		for(User user : users) {
			if(user.getEmail()==email)
				return user;
		}
		return null;
	}


	@Override
	public List<User> getAll() {
		
		return null;
	}
	
	

}
