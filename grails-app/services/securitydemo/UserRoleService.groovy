package securitydemo

import grails.gorm.services.Service

@Service(UserRole)
interface UserRoleService {

    UserRole get(Serializable id)

    List<UserRole> list(Map args)

    Long count()

    void delete(Serializable id)

    UserRole save(User user, Role role)

    UserRole save(UserRole userRole)

}