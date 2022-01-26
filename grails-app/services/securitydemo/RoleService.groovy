package securitydemo

import grails.gorm.services.Service

@Service(Role)
interface RoleService {

    Role save(String authority)

    Role find(String authority)
}