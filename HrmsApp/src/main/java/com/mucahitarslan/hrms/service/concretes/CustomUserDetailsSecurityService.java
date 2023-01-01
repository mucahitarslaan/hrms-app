package com.mucahitarslan.hrms.service.concretes;

import com.mucahitarslan.hrms.security.dataAccess.IUserSecurityRepository;
import com.mucahitarslan.hrms.security.data.model.Role;
import com.mucahitarslan.hrms.security.data.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomUserDetailsSecurityService implements UserDetailsService {
    private IUserSecurityRepository userSecurityRepository;

    @Autowired
    public CustomUserDetailsSecurityService(IUserSecurityRepository userSecurityRepository) {
        this.userSecurityRepository = userSecurityRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userSecurityRepository.findByUserName(username)
                .orElseThrow(() -> new UsernameNotFoundException("Username not found"));
        return new User(user.getUserName(),user.getPassword(),mapRolesToAuthorities(user.getRoles()));
    }

    private Collection<GrantedAuthority> mapRolesToAuthorities(List<Role> roles){
        return roles.stream()
                .map(role -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toList());
    }
}
