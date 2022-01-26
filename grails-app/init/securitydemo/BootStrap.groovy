package securitydemo

import static securitydemo.Roles.ROLE_ADMIN

class BootStrap {

    UserService userService
    RoleService roleService
    UserRoleService userRoleService


    def init = { servletContext ->
        List<String> authorities = [ROLE_ADMIN]
        authorities.each { authority ->
            if ( !roleService.find(authority) ) {
                roleService.save(authority)
            }
        }
        if ( !userService.findByUsername('sherlock') ) {
            User u = new User(username: 'sherlock', password: 'elementary')
            u = userService.save(u)
            userRoleService.save(u, roleService.find(ROLE_ADMIN))
        }


    }
    def destroy = {
    }
}
