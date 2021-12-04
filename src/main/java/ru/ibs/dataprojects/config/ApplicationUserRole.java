package ru.ibs.dataprojects.config;

import com.google.common.collect.Sets;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import java.util.Set;
import java.util.stream.Collectors;
import static ru.ibs.dataprojects.config.ApplicationUserPermission.*;

/**
 * @author Timur Khidirov on 02.12.2021
 */
public enum ApplicationUserRole {
    MANAGER(Sets.newHashSet(PROJECT_CARD_READ, PROJECT_CARD_WRITE)),
    USER(Sets.newHashSet(PROJECT_CARD_READ));
//    TRAINEE(Sets.newHashSet(TASK_READ, PROJECT_CARD_READ));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }

    public Set<SimpleGrantedAuthority> getAuthorities() {
        Set<SimpleGrantedAuthority> permissions = getPermissions().stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toSet());
        permissions.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
        return permissions;
    }
}
