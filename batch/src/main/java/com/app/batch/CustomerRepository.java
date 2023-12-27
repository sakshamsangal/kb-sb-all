package com.app.batch;

import org.springframework.data.jpa.repository.*;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
