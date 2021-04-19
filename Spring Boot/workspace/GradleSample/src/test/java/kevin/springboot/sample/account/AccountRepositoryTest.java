package kevin.springboot.sample.account;

import static org.assertj.core.api.Assertions.assertThat;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.jdbc.core.JdbcTemplate;

@DataJpaTest
class AccountRepositoryTest {

	@Autowired DataSource dataSource;
	@Autowired JdbcTemplate jdbcTemplate;
	@Autowired AccountRepository accountRepository;
	
	@Test
	void di() throws SQLException {
//		try(Connection conn = dataSource.getConnection()) {
//			DatabaseMetaData metaData = conn.getMetaData();
//			
//			System.out.println(metaData.getURL());
//			System.out.println(metaData.getDriverName());
//			System.out.println(metaData.getUserName());
//		}
		
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

}
