//package ru.ibs.dataprojects.model;
//
//import lombok.Data;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import javax.persistence.*;
//import java.util.Collection;
//import java.util.Set;
//
///**
// * @author Timur Khidirov on 26.11.2021
// */
//@Data
//@RequiredArgsConstructor
//public class ApplicationUser implements UserDetails {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private final Long userId;
//    private final String username;
//    private final String password;
//    private final String surname;
//    private final String patronymic;
//    private final String email;
//    private final String role;
//    private final String phoneNumber;
//    private final Set<? extends GrantedAuthority> grantedAuthorities;
//    private final boolean isAccountNonExpired;
//    private final boolean isAccountNonLocked;
//    private final boolean isCredentialsNonExpired;
//    private final boolean isEnabled;
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return getGrantedAuthorities();
//    }
//
//
////    @OneToMany(
////            mappedBy = "userProject",
//////            orphanRemoval = true,
////            cascade = CascadeType.ALL,
////            fetch = FetchType.EAGER)
////    private List<ProjectCard> projectCards;
//}
