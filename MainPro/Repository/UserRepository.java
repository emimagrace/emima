package com.MyProject.MainPro.Repository;

import com.MyProject.MainPro.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>
{
}
