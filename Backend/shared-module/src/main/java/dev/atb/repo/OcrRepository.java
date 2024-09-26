package dev.atb.repo;




import dev.atb.models.Ocr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface OcrRepository extends JpaRepository<Ocr, String> {

}
