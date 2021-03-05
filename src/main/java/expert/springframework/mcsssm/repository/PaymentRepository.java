package expert.springframework.mcsssm.repository;

import expert.springframework.mcsssm.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
