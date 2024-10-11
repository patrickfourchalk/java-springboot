package user_service;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserRepository
 */
interface UserRepository extends JpaRepository<User, Long> {

}
