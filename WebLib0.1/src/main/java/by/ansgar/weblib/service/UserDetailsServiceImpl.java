package by.ansgar.weblib.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import by.ansgar.weblib.DAO.UserDAO;
import by.ansgar.weblib.entity.Role;
import by.ansgar.weblib.entity.UserStatus;
import by.ansgar.weblib.entity.Users;

@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserDAO userDao;
	
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String login)
			throws UsernameNotFoundException {
		Users user = userDao.getUserByName(login);
		
		if(user!=null){
			String password = user.getPassword();
			
			boolean enabled = user.getStatus().equals(UserStatus.ACTIVE);
			boolean accountNonExpired = user.getStatus().equals(UserStatus.ACTIVE);
			boolean credentialsNonExpired = user.getStatus().equals(UserStatus.ACTIVE);
			boolean accountNonLocked = user.getStatus().equals(UserStatus.ACTIVE);

			Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
			for(Role role : user.getRoles()){
				authorities.add(new SimpleGrantedAuthority(role.getRoleName())); // alternative to GrantedAuthorityImpl() 
			}

			org.springframework.security.core.userdetails.User securityUser = new 
					org.springframework.security.core.userdetails.User(login, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
			return securityUser;
		}else{
			throw new UsernameNotFoundException("User Not Found!!!");
		}
	}

}
