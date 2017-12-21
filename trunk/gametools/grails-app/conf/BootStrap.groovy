import com.hadoit.gametools.Role
import com.hadoit.gametools.User
import com.hadoit.gametools.UserRole

class BootStrap {
    def init = { servletContext ->
        def adminRole = Role.findByAuthority('ROLE_ADMIN')
        if (adminRole == null) {
            adminRole = new Role(authority: 'ROLE_ADMIN').save(flush: true, failOnError: true)
        }
        def userRole = Role.findByAuthority('ROLE_USER') 
        if (userRole == null) {
            userRole = new Role(authority: 'ROLE_USER').save(flush: true, failOnError: true)
        }
        def adminUser = User.findByUsername('gongadmin')
        if (adminUser == null) {
            adminUser = new User(username: 'gongadmin', password: 'gong!@#')
            adminUser.save(flush: true, failOnError: true)
            UserRole.create(adminUser, adminRole, true)
        }
    }
    def destroy = {
    }
}
