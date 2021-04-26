package kevin.springboot.sample.account;

import static org.assertj.core.api.Assertions.assertThat;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.jdbc.core.JdbcTemplate;

@DataJpaTest
class AccountRepositoryTest {

	@Autowired
	AccountRepository accountRepository;

	@Test
	void test() throws SQLException {
		Account account = new Account();
		account.setUsername("kevin");
		account.setPassword("123456");

		Account newAccount = accountRepository.save(account);
		assertThat(newAccount).isNotNull();

		Account existingAccount = accountRepository.findByUsername(newAccount.getUsername());
		assertThat(existingAccount).isNotNull();
		
		Account notExistingAccount = accountRepository.findByUsername("dummy");
		assertThat(notExistingAccount).isNull();
	}

	@Test
	void checkAdmin() {
		Account adminAccount = accountRepository.findByUsername("admin");
		assertThat(adminAccount).isNotNull();
	}

}
